# coding=utf-8
# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.pipeline import ClientRawResponse

from .. import models


class HttpRetry(object):

    def __init__(self, client, config, serializer, deserializer):

        self._client = client
        self._serialize = serializer
        self._deserialize = deserializer

        self.config = config

    def head408(
            self, custom_headers={}, raw=False, **operation_config):
        """
        Return 408 status code, then 200 after retry

        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/http/retry/408'

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct and send request
        request = self._client.head(url, query_parameters)
        response = self._client.send(request, header_parameters, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def put500(
            self, boolean_value=None, custom_headers={}, raw=False, **operation_config):
        """
        Return 500 status code, then 200 after retry

        :param boolean_value: Simple boolean value true
        :type boolean_value: bool or None
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/http/retry/500'

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        if boolean_value is not None:
            body_content = self._serialize.body(boolean_value, 'bool')
        else:
            body_content = None

        # Construct and send request
        request = self._client.put(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def patch500(
            self, boolean_value=None, custom_headers={}, raw=False, **operation_config):
        """
        Return 500 status code, then 200 after retry

        :param boolean_value: Simple boolean value true
        :type boolean_value: bool or None
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/http/retry/500'

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        if boolean_value is not None:
            body_content = self._serialize.body(boolean_value, 'bool')
        else:
            body_content = None

        # Construct and send request
        request = self._client.patch(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def get502(
            self, custom_headers={}, raw=False, **operation_config):
        """
        Return 502 status code, then 200 after retry

        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/http/retry/502'

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct and send request
        request = self._client.get(url, query_parameters)
        response = self._client.send(request, header_parameters, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def post503(
            self, boolean_value=None, custom_headers={}, raw=False, **operation_config):
        """
        Return 503 status code, then 200 after retry

        :param boolean_value: Simple boolean value true
        :type boolean_value: bool or None
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/http/retry/503'

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        if boolean_value is not None:
            body_content = self._serialize.body(boolean_value, 'bool')
        else:
            body_content = None

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def delete503(
            self, boolean_value=None, custom_headers={}, raw=False, **operation_config):
        """
        Return 503 status code, then 200 after retry

        :param boolean_value: Simple boolean value true
        :type boolean_value: bool or None
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/http/retry/503'

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        if boolean_value is not None:
            body_content = self._serialize.body(boolean_value, 'bool')
        else:
            body_content = None

        # Construct and send request
        request = self._client.delete(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def put504(
            self, boolean_value=None, custom_headers={}, raw=False, **operation_config):
        """
        Return 504 status code, then 200 after retry

        :param boolean_value: Simple boolean value true
        :type boolean_value: bool or None
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/http/retry/504'

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        if boolean_value is not None:
            body_content = self._serialize.body(boolean_value, 'bool')
        else:
            body_content = None

        # Construct and send request
        request = self._client.put(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def patch504(
            self, boolean_value=None, custom_headers={}, raw=False, **operation_config):
        """
        Return 504 status code, then 200 after retry

        :param boolean_value: Simple boolean value true
        :type boolean_value: bool or None
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/http/retry/504'

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        if boolean_value is not None:
            body_content = self._serialize.body(boolean_value, 'bool')
        else:
            body_content = None

        # Construct and send request
        request = self._client.patch(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response
