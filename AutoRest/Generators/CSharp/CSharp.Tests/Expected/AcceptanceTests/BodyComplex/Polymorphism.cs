// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AcceptanceTestsBodyComplex
{
    using System;
    using System.Linq;
    using System.Collections.Generic;
    using System.Net;
    using System.Net.Http;
    using System.Net.Http.Headers;
    using System.Text;
    using System.Text.RegularExpressions;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Microsoft.Rest.Serialization;
    using Newtonsoft.Json;
    using Models;

    /// <summary>
    /// Polymorphism operations.
    /// </summary>
    public partial class Polymorphism : IServiceOperations<AutoRestComplexTestService>, IPolymorphism
    {
        /// <summary>
        /// Initializes a new instance of the Polymorphism class.
        /// </summary>
        /// <param name='client'>
        /// Reference to the service client.
        /// </param>
        public Polymorphism(AutoRestComplexTestService client)
        {
            if (client == null) 
            {
                throw new ArgumentNullException("client");
            }
            this.Client = client;
        }

        /// <summary>
        /// Gets a reference to the AutoRestComplexTestService
        /// </summary>
        public AutoRestComplexTestService Client { get; private set; }

        /// <summary>
        /// Get complex types that are polymorphic
        /// </summary>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        public async Task<HttpOperationResponse<Fish>> GetValidWithHttpMessagesAsync(Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken))
        {
            // Tracing
            bool _shouldTrace = ServiceClientTracing.IsEnabled;
            string _invocationId = null;
            if (_shouldTrace)
            {
                _invocationId = ServiceClientTracing.NextInvocationId.ToString();
                Dictionary<string, object> tracingParameters = new Dictionary<string, object>();
                tracingParameters.Add("cancellationToken", cancellationToken);
                ServiceClientTracing.Enter(_invocationId, this, "GetValid", tracingParameters);
            }
            // Construct URL
            var _baseUrl = this.Client.BaseUri.AbsoluteUri;
            var _url = new Uri(new Uri(_baseUrl + (_baseUrl.EndsWith("/") ? "" : "/")), "complex/polymorphism/valid").ToString();
            // Create HTTP transport objects
            HttpRequestMessage _httpRequest = new HttpRequestMessage();
            HttpResponseMessage _httpResponse = null;
            _httpRequest.Method = new HttpMethod("GET");
            _httpRequest.RequestUri = new Uri(_url);
            // Set Headers
            if (customHeaders != null)
            {
                foreach(var _header in customHeaders)
                {
                    if (_httpRequest.Headers.Contains(_header.Key))
                    {
                        _httpRequest.Headers.Remove(_header.Key);
                    }
                    _httpRequest.Headers.TryAddWithoutValidation(_header.Key, _header.Value);
                }
            }

            // Serialize Request
            string _requestContent = null;
            // Send Request
            if (_shouldTrace)
            {
                ServiceClientTracing.SendRequest(_invocationId, _httpRequest);
            }
            cancellationToken.ThrowIfCancellationRequested();
            _httpResponse = await this.Client.HttpClient.SendAsync(_httpRequest, cancellationToken).ConfigureAwait(false);
            if (_shouldTrace)
            {
                ServiceClientTracing.ReceiveResponse(_invocationId, _httpResponse);
            }
            HttpStatusCode _statusCode = _httpResponse.StatusCode;
            cancellationToken.ThrowIfCancellationRequested();
            string _responseContent = null;
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
            // Create Result
            var _result = new HttpOperationResponse<Fish>();
            _result.Request = _httpRequest;
            _result.Response = _httpResponse;
            // Deserialize Response
            if ((int)_statusCode == 200)
            {
                _responseContent = await _httpResponse.Content.ReadAsStringAsync().ConfigureAwait(false);
                try
                {
                    _result.Body = SafeJsonConvert.DeserializeObject<Fish>(_responseContent, this.Client.DeserializationSettings);
                }
                catch (JsonException ex)
                {
                    _httpRequest.Dispose();
                    if (_httpResponse != null)
                    {
                        _httpResponse.Dispose();
                    }
                    throw new SerializationException("Unable to deserialize the response.", _responseContent, ex);
                }
            }
            if (_shouldTrace)
            {
                ServiceClientTracing.Exit(_invocationId, _result);
            }
            return _result;
        }

        /// <summary>
        /// Put complex types that are polymorphic
        /// </summary>
        /// <param name='complexBody'>
        /// Please put a salmon that looks like this:
        /// {
        /// 'fishtype':'Salmon',
        /// 'location':'alaska',
        /// 'iswild':true,
        /// 'species':'king',
        /// 'length':1.0,
        /// 'siblings':[
        /// {
        /// 'fishtype':'Shark',
        /// 'age':6,
        /// 'birthday': '2012-01-05T01:00:00Z',
        /// 'length':20.0,
        /// 'species':'predator',
        /// },
        /// {
        /// 'fishtype':'Sawshark',
        /// 'age':105,
        /// 'birthday': '1900-01-05T01:00:00Z',
        /// 'length':10.0,
        /// 'picture': new Buffer([255, 255, 255, 255,
        /// 254]).toString('base64'),
        /// 'species':'dangerous',
        /// },
        /// {
        /// 'fishtype': 'goblin',
        /// 'age': 1,
        /// 'birthday': '2015-08-08T00:00:00Z',
        /// 'length': 30.0,
        /// 'species': 'scary',
        /// 'jawsize': 5
        /// }
        /// ]
        /// };
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        public async Task<HttpOperationResponse> PutValidWithHttpMessagesAsync(Fish complexBody, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken))
        {
            if (complexBody == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "complexBody");
            }
            if (complexBody != null)
            {
                complexBody.Validate();
            }
            // Tracing
            bool _shouldTrace = ServiceClientTracing.IsEnabled;
            string _invocationId = null;
            if (_shouldTrace)
            {
                _invocationId = ServiceClientTracing.NextInvocationId.ToString();
                Dictionary<string, object> tracingParameters = new Dictionary<string, object>();
                tracingParameters.Add("complexBody", complexBody);
                tracingParameters.Add("cancellationToken", cancellationToken);
                ServiceClientTracing.Enter(_invocationId, this, "PutValid", tracingParameters);
            }
            // Construct URL
            var _baseUrl = this.Client.BaseUri.AbsoluteUri;
            var _url = new Uri(new Uri(_baseUrl + (_baseUrl.EndsWith("/") ? "" : "/")), "complex/polymorphism/valid").ToString();
            // Create HTTP transport objects
            HttpRequestMessage _httpRequest = new HttpRequestMessage();
            HttpResponseMessage _httpResponse = null;
            _httpRequest.Method = new HttpMethod("PUT");
            _httpRequest.RequestUri = new Uri(_url);
            // Set Headers
            if (customHeaders != null)
            {
                foreach(var _header in customHeaders)
                {
                    if (_httpRequest.Headers.Contains(_header.Key))
                    {
                        _httpRequest.Headers.Remove(_header.Key);
                    }
                    _httpRequest.Headers.TryAddWithoutValidation(_header.Key, _header.Value);
                }
            }

            // Serialize Request
            string _requestContent = null;
            _requestContent = SafeJsonConvert.SerializeObject(complexBody, this.Client.SerializationSettings);
            _httpRequest.Content = new StringContent(_requestContent, Encoding.UTF8);
            _httpRequest.Content.Headers.ContentType = MediaTypeHeaderValue.Parse("application/json; charset=utf-8");
            // Send Request
            if (_shouldTrace)
            {
                ServiceClientTracing.SendRequest(_invocationId, _httpRequest);
            }
            cancellationToken.ThrowIfCancellationRequested();
            _httpResponse = await this.Client.HttpClient.SendAsync(_httpRequest, cancellationToken).ConfigureAwait(false);
            if (_shouldTrace)
            {
                ServiceClientTracing.ReceiveResponse(_invocationId, _httpResponse);
            }
            HttpStatusCode _statusCode = _httpResponse.StatusCode;
            cancellationToken.ThrowIfCancellationRequested();
            string _responseContent = null;
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
            // Create Result
            var _result = new HttpOperationResponse();
            _result.Request = _httpRequest;
            _result.Response = _httpResponse;
            if (_shouldTrace)
            {
                ServiceClientTracing.Exit(_invocationId, _result);
            }
            return _result;
        }

        /// <summary>
        /// Put complex types that are polymorphic, attempting to omit required
        /// 'birthday' field - the request should not be allowed from the client
        /// </summary>
        /// <param name='complexBody'>
        /// Please attempt put a sawshark that looks like this, the client should not
        /// allow this data to be sent:
        /// {
        /// "fishtype": "sawshark",
        /// "species": "snaggle toothed",
        /// "length": 18.5,
        /// "age": 2,
        /// "birthday": "2013-06-01T01:00:00Z",
        /// "location": "alaska",
        /// "picture": base64(FF FF FF FF FE),
        /// "siblings": [
        /// {
        /// "fishtype": "shark",
        /// "species": "predator",
        /// "birthday": "2012-01-05T01:00:00Z",
        /// "length": 20,
        /// "age": 6
        /// },
        /// {
        /// "fishtype": "sawshark",
        /// "species": "dangerous",
        /// "picture": base64(FF FF FF FF FE),
        /// "length": 10,
        /// "age": 105
        /// }
        /// ]
        /// }
        /// </param>
        /// <param name='customHeaders'>
        /// Headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        public async Task<HttpOperationResponse> PutValidMissingRequiredWithHttpMessagesAsync(Fish complexBody, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken))
        {
            if (complexBody == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "complexBody");
            }
            if (complexBody != null)
            {
                complexBody.Validate();
            }
            // Tracing
            bool _shouldTrace = ServiceClientTracing.IsEnabled;
            string _invocationId = null;
            if (_shouldTrace)
            {
                _invocationId = ServiceClientTracing.NextInvocationId.ToString();
                Dictionary<string, object> tracingParameters = new Dictionary<string, object>();
                tracingParameters.Add("complexBody", complexBody);
                tracingParameters.Add("cancellationToken", cancellationToken);
                ServiceClientTracing.Enter(_invocationId, this, "PutValidMissingRequired", tracingParameters);
            }
            // Construct URL
            var _baseUrl = this.Client.BaseUri.AbsoluteUri;
            var _url = new Uri(new Uri(_baseUrl + (_baseUrl.EndsWith("/") ? "" : "/")), "complex/polymorphism/missingrequired/invalid").ToString();
            // Create HTTP transport objects
            HttpRequestMessage _httpRequest = new HttpRequestMessage();
            HttpResponseMessage _httpResponse = null;
            _httpRequest.Method = new HttpMethod("PUT");
            _httpRequest.RequestUri = new Uri(_url);
            // Set Headers
            if (customHeaders != null)
            {
                foreach(var _header in customHeaders)
                {
                    if (_httpRequest.Headers.Contains(_header.Key))
                    {
                        _httpRequest.Headers.Remove(_header.Key);
                    }
                    _httpRequest.Headers.TryAddWithoutValidation(_header.Key, _header.Value);
                }
            }

            // Serialize Request
            string _requestContent = null;
            _requestContent = SafeJsonConvert.SerializeObject(complexBody, this.Client.SerializationSettings);
            _httpRequest.Content = new StringContent(_requestContent, Encoding.UTF8);
            _httpRequest.Content.Headers.ContentType = MediaTypeHeaderValue.Parse("application/json; charset=utf-8");
            // Send Request
            if (_shouldTrace)
            {
                ServiceClientTracing.SendRequest(_invocationId, _httpRequest);
            }
            cancellationToken.ThrowIfCancellationRequested();
            _httpResponse = await this.Client.HttpClient.SendAsync(_httpRequest, cancellationToken).ConfigureAwait(false);
            if (_shouldTrace)
            {
                ServiceClientTracing.ReceiveResponse(_invocationId, _httpResponse);
            }
            HttpStatusCode _statusCode = _httpResponse.StatusCode;
            cancellationToken.ThrowIfCancellationRequested();
            string _responseContent = null;
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
            // Create Result
            var _result = new HttpOperationResponse();
            _result.Request = _httpRequest;
            _result.Response = _httpResponse;
            if (_shouldTrace)
            {
                ServiceClientTracing.Exit(_invocationId, _result);
            }
            return _result;
        }

    }
}
