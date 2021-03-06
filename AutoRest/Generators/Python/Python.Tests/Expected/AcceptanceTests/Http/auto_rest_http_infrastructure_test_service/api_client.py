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

from msrest.service_client import ServiceClient
from msrest import Configuration, Serializer, Deserializer
from .operations.http_failure import HttpFailure
from .operations.http_success import HttpSuccess
from .operations.http_redirects import HttpRedirects
from .operations.http_client_failure import HttpClientFailure
from .operations.http_server_failure import HttpServerFailure
from .operations.http_retry import HttpRetry
from .operations.multiple_responses import MultipleResponses
from . import models


class AutoRestHttpInfrastructureTestServiceConfiguration(Configuration):

    def __init__(
            self, base_url=None, filepath=None):

        if not base_url:
            base_url = 'http://localhost'

        super(AutoRestHttpInfrastructureTestServiceConfiguration, self).__init__(base_url, filepath)

        self.user_agent = 'auto_rest_http_infrastructure_test_service/1.0.0'


class AutoRestHttpInfrastructureTestService(object):

    def __init__(self, config):

        self._client = ServiceClient(None, config)

        client_models = {k: v for k, v in models.__dict__.items() if isinstance(v, type)}
        self._serialize = Serializer()
        self._deserialize = Deserializer(client_models)

        self.config = config
        self.http_failure = HttpFailure(
            self._client, self.config, self._serialize, self._deserialize)
        self.http_success = HttpSuccess(
            self._client, self.config, self._serialize, self._deserialize)
        self.http_redirects = HttpRedirects(
            self._client, self.config, self._serialize, self._deserialize)
        self.http_client_failure = HttpClientFailure(
            self._client, self.config, self._serialize, self._deserialize)
        self.http_server_failure = HttpServerFailure(
            self._client, self.config, self._serialize, self._deserialize)
        self.http_retry = HttpRetry(
            self._client, self.config, self._serialize, self._deserialize)
        self.multiple_responses = MultipleResponses(
            self._client, self.config, self._serialize, self._deserialize)
