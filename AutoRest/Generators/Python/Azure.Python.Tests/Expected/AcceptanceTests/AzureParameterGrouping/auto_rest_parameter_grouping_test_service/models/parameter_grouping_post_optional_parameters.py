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

from msrest.serialization import Model


class ParameterGroupingPostOptionalParameters(Model):
    """
    Additional parameters for the postOptional operation.
    """

    _required = []

    def __init__(self, *args, **kwargs):
        """ParameterGroupingPostOptionalParameters

        :param str custom_header
        :param int query: Query parameter with default. Default value: 30 .
        """
        self.custom_header = None
        self.query = None

        super(ParameterGroupingPostOptionalParameters, self).__init__(*args, **kwargs)
