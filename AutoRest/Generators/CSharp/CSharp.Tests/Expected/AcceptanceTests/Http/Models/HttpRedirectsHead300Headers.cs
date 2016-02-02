// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsHttp.Models
{
    using System;
    using System.Linq;
    using System.Collections.Generic;
    using Newtonsoft.Json;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;

    /// <summary>
    /// Defines headers for head300 operation.
    /// </summary>
    public partial class HttpRedirectsHead300Headers
    {
        /// <summary>
        /// Initializes a new instance of the HttpRedirectsHead300Headers
        /// class.
        /// </summary>
        public HttpRedirectsHead300Headers() { }

        /// <summary>
        /// Initializes a new instance of the HttpRedirectsHead300Headers
        /// class.
        /// </summary>
        public HttpRedirectsHead300Headers(string location = default(string))
        {
            Location = location;
        }

        /// <summary>
        /// The redirect location for this request
        /// </summary>
        [JsonProperty(PropertyName = "Location")]
        public string Location { get; set; }

    }
}
