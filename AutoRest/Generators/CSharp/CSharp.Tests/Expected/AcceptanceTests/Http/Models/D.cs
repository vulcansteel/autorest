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
    /// </summary>
    public partial class D
    {
        /// <summary>
        /// Initializes a new instance of the D class.
        /// </summary>
        public D() { }

        /// <summary>
        /// Initializes a new instance of the D class.
        /// </summary>
        public D(string httpStatusCode = default(string))
        {
            HttpStatusCode = httpStatusCode;
        }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "httpStatusCode")]
        public string HttpStatusCode { get; set; }

    }
}
