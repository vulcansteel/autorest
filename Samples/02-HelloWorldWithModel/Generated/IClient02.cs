/// Code generated by Microsoft (R) AutoRest Code Generator 0.10.0.0
/// Changes may cause incorrect behavior and will be lost if the code is
/// regenerated.
namespace Sample02
{
    using System;
    using System.Collections.Generic;
    using System.Net.Http;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Models;

    /// <summary>
    /// </summary>
    public partial interface IClient02
    {
        /// <summary>
        /// The base URI of the service.
        /// </summary>
        Uri BaseUri { get; set; }

        /// <summary>
        /// </summary>
        /// <param name='cancellationToken'>
        /// Cancellation token.
        /// </param>
        Task<HttpOperationResponse<Greeting>> GetGreetingWithOperationResponseAsync(CancellationToken cancellationToken = default(CancellationToken));

    }
}
