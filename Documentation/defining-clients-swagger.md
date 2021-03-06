
#Working with Swagger Specifications

AutoRest processes Swagger specifications following the [Swagger RESTful API Documentation Specification](Swagger-spec2.0)
API descriptions that are valid according to the schema can produce client libraries that are not very user-friendly. Here are some techniques to apply in authoring Swagger that improve the usability of the client generated by AutoRest.

## Contents
- [Data Types](#data-types)
	- [Primitive Data Types](#primitive-data-types)
	- [`byte[]`, `DateTimeOffset`, `int`, `long`](#byte-datetimeoffset-int-long)
	- [Arrays and Sequences](#arrays-and-sequences)
	- [Dictionaries](#dictionaries)
	- [Inheritance and Polymorphism](#inheritance-and-polymorphism)
		- [Inheritance](#inheritance)
		- [Polymorphism](#polymorphism)
	- [Type Name Generation](#type-name-generation)
- [Operations](#operations)
	- [Generating Operation Classes](#generating-operation-classes)
	- [Specifying required parameters and properties](#specifying-required-parameters-and-properties)
	- [Error Modeling](#error-modeling)
- [Extensions](#extensions)

## Data Types
### Primitive Data Types
The primitive types are based on [JSON-Schema Draft 4](JSON-primitive-types). More details in the Swagger Specification [here](Swagger-primitive-types).

**Example:**
```json
"definitions": {
  "pet": {
    "properties": {
      "name": {
        "type": "string"
	  },
	  "age": {
	    "type": "integer"
	  }
	}
  }
}
```
Generates C# client model type:
```csharp
public partial class Pet
{
    /// <summary>
    /// Optional.
    /// </summary>
    public int? Age { get; set; }

    /// <summary>
    /// Optional.
    /// </summary>
    public string Name { get; set; }

    /// <summary>
    /// Initializes a new instance of the Pet class.
    /// </summary>
    public Pet()
    {
    }
}
```

### `byte[]`, `DateTimeOffset`, `int`, `long`
- **`byte[]`**
To represent `byte` arrays in the generated code, the property of the Swagger definition should have `string` as its type and `byte` as its format. This indicates binary data that will be represented as a base64-encoded string in requests and responses. The generated client will automatically do this encoding when processing requests and responses.

- **`DateTimeOffset`**
AutoRest generates `DateTimeOffset` typed properties in generated C# code for Swagger properties that have `string` as the type and `date-time` as the format.

- **`int` / `long`**
Both `int` and `long` proeprties in the generated code correspond to `integer` types in Swagger properties. If the format of the Swagger property is `int32`, `int` will be generated; if the format is `int64`, `long` will be generated. If the format field of the Swagger property is not set, AutoRest use  format `int32`.

**Example:**
```json
"pet": {
  "properties": {
    "age": {
      "type": "integer",
      "format": "int32"
    },
    "number": {
      "type": "integer",
      "format": "int64"
    },
    "name": {
      "type": "string",
      "format": "byte"
    },
    "birthday": {
      "name": "dateTime",
      "type": "string",
      "format": "date-time"
    }
  }
}
```
Generates C# client model type:
```csharp
public partial class Pet
{
    /// <summary>
    /// Optional.
    /// </summary>
    public int? Age { get; set; }

    /// <summary>
    /// Optional.
    /// </summary>
    public DateTimeOffset? Birthday { get; set; }

    /// <summary>
    /// Optional.
    /// </summary>
    public byte[] Name { get; set; }

    /// <summary>
    /// Optional.
    /// </summary>
    public long? Number { get; set; }

    /// <summary>
    /// Initializes a new instance of the Pet class.
    /// </summary>
    public Pet()
    {
    }
}
```

### Arrays and Sequences
AutoRest builds sequences from schemas with type `array`.
The following definition
```json
"pet": {
  "properties": {
    "names": {
      "type": "array",
      "items": {
        "type": "string"
      }
    }
  }
}
```
Generates C# client model type
```csharp
public partial class Pet
{
    /// <summary>
    /// Optional.
    /// </summary>
    public IList<string> Names { get; set; }

    /// <summary>
    /// Initializes a new instance of the Pet class.
    /// </summary>
    public Pet()
    {
    }
}
```

### Dictionaries
AutoRest generates dictionaries (or hash maps in some contexts) using `additionalProperites` from [JSON-Schema Draft 4][JSON-schema-validation-properties]. The additionalProperties element should specify the Swagger schema of the values in the dictionary . The keys of the generated dictionary will be of type `string`.

The following definition
```json
"StringDictionary": {
  "additionalProperties": {
    "type": "string"
  }
}
```
will generate C# client library
```csharp
public partial class Pet
{
    /// <summary>
    /// Optional.
    /// </summary>
    public IDictionary<string, string> StringDictionary { get; set; }

    /// <summary>
    /// Initializes a new instance of the Pet class.
    /// </summary>
    public Pet()
    {
    }
}
```

Swagger and AutoRest also support Dictionary in Dictionary and Array in Dictionary. For example
```json
"additionalProperties": {
   "type": "object",
   "additionalProperties": {
     "type": "string"
   }
}
```
becomes
```csharp
public partial class Pet
{
    /// <summary>
    /// Optional.
    /// </summary>
    public IDictionary<string, IDictionary<string, string>> CompositeDictionary { get; set; }

    /// <summary>
    /// Initializes a new instance of the Pet class.
    /// </summary>
    public Pet()
    {
    }
}
```

### Inheritance and Polymorphism
#### Inheritance
AutoRest builds inheritance between types if an `allOf` field is specified in a Swagger definition with ONLY one reference to another Swagger definition. The following example demonstrate a `Cat` type inheriting a `Pet` with its `allOf` set to `[{"$ref": "Pet"}]`.

> Note: Only `allOf` fields with one schema reference will be treated as inheritance. If `allOf` contains more than one schema that has `"$ref"` as the key, the properties from the referenced schemas will be composed without inheritance. However, if an `allOf` contains multiple inline schemas and a single schema reference, the generated model type will use inheritance. 

**Example:**
```json
"Pet": {
  "properties": {
    "name": {
      "type": "string"
    }
  }
},
"Cat": {
  "allOf": [ { "$ref":  "Pet" } ],
  "properties": {
    "color": {
      "type": "string",
      "description": "cat color"
    }
  }
}
```

will generate C# model types

```csharp
public partial class Cat : Pet
{
    /// <summary>
    /// Initializes a new instance of the Cat class.
    /// </summary>
    public Cat() { }

    /// <summary>
    /// Initializes a new instance of the Cat class.
    /// </summary>
    public Cat(int? id = default(int?), string name = default(string), string color = default(string))
        : base(id, name)
    {
        Color = color;
    }

    /// <summary>
    /// </summary>
    [JsonProperty(PropertyName = "color")]
    public string Color { get; set; }
}

public partial class Pet
{
    /// <summary>
    /// Initializes a new instance of the Pet class.
    /// </summary>
    public Pet() { }

    /// <summary>
    /// Initializes a new instance of the Pet class.
    /// </summary>
    public Pet(int? id = default(int?), string name = default(string))
    {
        Id = id;
        Name = name;
    }

    /// <summary>
    /// </summary>
    [JsonProperty(PropertyName = "id")]
    public int? Id { get; set; }

    /// <summary>
    /// </summary>
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

}
```

#### Polymorphism
To describe polymorphic inheritance between types, Swagger uses an extra "discriminator" field to indicate the exact serialization of the object on the wire. To make a set of classes polymorphic, use 'allOf' with a schema reference to indicate inheritance from a base schema and a discriminator field to the base schema. In the example above, adding a discriminator field named `objectType` to `Pet` will make the genereated set of classes polymorphic:
```json
"Pet": {
  "discriminator": "Type",
  "required": [
    "objectType"
  ],
  "properties": {
    "name": {
      "type": "string"
    },
    "objectType": {
      "type": "string"
    }
  }
}
```
The generated models in C# code are nearly identical, with `objectType` property excluded and a special `JsonConverter` added in the client `Initialize` method:

```csharp
public partial class MyClient : ServiceClient<AutoRestComplexTestService>, IAutoRestComplexTestService
{
    ...
    
    /// <summary>
    /// Initializes client properties.
    /// </summary>
    private void Initialize()
    {
        ...
        SerializationSettings.Converters.Add(new PolymorphicSerializeJsonConverter<Pet>("objectType"));
        DeserializationSettings.Converters.Add(new PolymorphicDeserializeJsonConverter<Pet>("objectType"));
    } 
}
```

### Type Name Generation
Type name generation is straightforward if a Swagger schema is defined in the "#/definitions" block. The name of the Swagger Schema will be respected in the corresponding generated model type, like the `Pet` model in the examples above. Invalid characters will be filtered, and type capitalization is changed to comply with language-specific coding guidelines, but the generated model name should make sense if the one in the Swagger definitions list makes sense.

Type name generation becomes tricky in inline schema definitions. There are three scenarios when AutoRest generates a name on its own. The names are generated using the context of the schema in the Swagger specification so that the correlation between model type and swagger schema is easy to find.  A generated type name can easily be changed by moving the corresponding schema into the "#/definitions" list and referencing the schema from the parameters and responses where it appears in the Swagger specification.

- **Inline parameters**
*A Schema defined inside a `body` parameter.* The parameter name will be used for the generated type name.
The following example will generate a model type named `Style`.
```json
"parameters": [
  {
    "in": "body",
    "name": "style",
    "schema": {
      "properties": {
        "name": {
          "type": "string"
        },
        "color": {
          "type": "string"
        }
      }
    }
  }
]
```

- **Inline responses**
*A response with a schema definition inside.* The model type name will be `operationId` + `http status code` + "Response".
The following example will generate a type `AddPetOkResponse`.
```json
......
"operationId": "addPet",
......
"200": {
  "description": "pet response",
  "schema": {
    "properties": {
      "id": {
        "type": "integer",
        "format": "int64"
      },
      "name": {
        "type": "string"
      },
    }
  }
}
```

- **Inline properties**
*A property of a reference type contains an inline Swagger schema definition.* The type name for the generated model is composed of the parent class's type name concatenated with the property's name.
The following example will generate a type `PetStyle`.
```json
"Pet": {
  "properties": {
    "style": {
      "properties": {
        "name": {
          "type": "string"
        },
        "color": {
          "type": "string"
        }
      }
    }
  }
}
```

- **Schemas in sequences and dictionaries**
*A schema defined in the 'items' proeprty of a sequence or the 'additionalProperties' value of a dictionary.* Model types corresponding to Items of a sequence are named using the parent class's name concatenated with "Item". Model types corresponding to the 'additinalPropeties' value of a dictionary are named using the parent class's name concatenated with "Value".
The following example will generate types `PetFavFoodItem` and `PetFavFoodBrandValue`.
```json
"Pet": {
  "properties": {
    "fav_food": {
	  "type": "array",
	  "items": {
	    "properties": {
	      "name": {
	        "type": "string"
	      },
	      "taste": {
	        "type": "string"
	      }
	    }
	  }
    },
    "fav_food_brand": {
      "additionalProperties": {
	    "properties": {
	      "manufacturer": {
	        "type": "string"
	      }
	    }
      }
    }
  }
}
```

## Operations
### Generating Operation Classes
In many cases, client operations are intended to be grouped by resource type for better usability. AutoRest supports categorizing operations using `_` in the `operationId` field of a SwaggerOperation. The part appearing before `_` will be treated as the operations class name, and the part after will be treated as the method name.

**Example:**
The following Swagger specification:
```json
"paths": {
  "/api/Values/{id}": {
    "get": {
      "tags": [
        "Values"
      ],
      "operationId": "Values_Get",
............
```
will generate a `Get` method inside a `Values` class. The end user will access the method by calling `client.Values.Get()`. This is a neat way of organizing your client if you have multiple operations with the same operation name but different underlying resources.

If the `-OutputFile` parameter is not specified when invoking the AutoRest Command Line Interface, generated files will also be organized by namespaces. If you have `operationId`s `ns1_get` and `ns2_get`, you will have `ns1.cs` and `ns2.cs` in the generated C# client library.

### Specifying required parameters and properties
Parameters and properties in Swagger schema use different notations and conventions to determine if they are required or optional.

Parameters in the 'path' or 'body' are **always** required. Parameters may also use a `'required'` Boolean property to indicate that they are required for the operation, as in the example shown below.
```json
"parameters": [
  {
    "name": "subscriptionId",
    "in": "path",
    "required": true,
    "type": "integer"
  },
  {
    "name": "resourceGroupName",
    "in": "path",
    "type": "string"
  },
  {
    "name": "api-version",
    "in": "query",
    "required": false,
    "type": "integer"
  }
]
```
Generates C# client side method of
```csharp
public async Task<HttpOperationResponse<Product>> ListWithOperationResponseAsync(int? subscriptionId, string resourceGroupName, int? apiVersion, CancellationToken cancellationToken)
{
    // Validate
    if (resourceGroupName == null)
    {
        throw new ArgumentNullException("resourceGroupName");
    }
............
```

> Note that parameters that have field `in` as path are always required and the `required` field will be ignored.

Properties in SwaggerSchema do not contain a required field. Instead, Each definition schema can provide a `'required'` array that specifies which proeprties are required. An example is shown below.
```json
"Product": {
  "required": [
    "product_id", "display_name"
  ],
  "properties": {
    "product_id": {
      "type": "string"
    },
    "description": {
      "type": "string"
    },
    "display_name": {
      "type": "string"
    },
    "capacity": {
      "type": "string"
    },
    "image": {
      "type": "string"
    }
  }
}
```

### Error Modeling
At runtime, if the server returns an unexpected status code,  the generated client throws an exception of type `HttpOperationException`. The exception instance will contain the request of type `HttpRequestMessage` (in property `Request`), the response of type `HttpResponseMessage` (in property `Response`), and the error model (in property `Body`). The error model must be defined as the schema of the `default` response.

**Example:**
A response of
```json
"default": {
  "description": "Unexpected error",
  "schema": {
    "$ref": "Error"
  }
}
```
together with its definition
```json
"Error": {
  "properties": {
    "code": {
      "type": "integer",
      "format": "int32"
    },
    "message": {
      "type": "string"
    },
    "fields": {
      "type": "string"
    }
  }
}
```
Generates the following error handling code:
```csharp
if ((int)_statusCode != 200)
{
    var ex = new ErrorException(string.Format("Operation returned an invalid status code '{0}'", _statusCode));
    try
    {
        _responseContent = await _httpResponse.Content.ReadAsStringAsync().ConfigureAwait(false);
        Error _errorBody = SafeJsonConvert.DeserializeObject<Error>(_responseContent, this.Client.DeserializationSettings);
        if (_errorBody != null)
        {
            ex.Body = _errorBody;
        }
    }
    catch (JsonException)
    {
        // Ignore the exception
    }
    ex.Request = new HttpRequestMessageWrapper(_httpRequest, _requestContent);
    ex.Response = new HttpResponseMessageWrapper(_httpResponse, _responseContent);
    if (_shouldTrace)
    {
        ServiceClientTracing.Error(_invocationId, ex);
    }
    _httpRequest.Dispose();
    if (_httpResponse != null)
    {
        _httpResponse.Dispose();
    }
    throw ex;
}
```

See [Error Handling](clients-error.md) for details on how to catch and use the exceptions from generated clients.

## Extensions
AutoRest supports a number of extensions used to configure generated clients. Please refer to [Swagger Extensions](swagger-extensions.md) document for details.

[Swagger-spec2.0]:https://github.com/swagger-api/swagger-spec/blob/master/versions/2.0.md
[JSON-primitive-types]:http://json-schema.org/latest/json-schema-core.html#anchor8
[Swagger-primitive-types]:https://github.com/swagger-api/swagger-spec/blob/master/versions/2.0.md#datatypes]
[JSON-schema-validation-properties]:http://json-schema.org/latest/json-schema-validation.html#anchor64
