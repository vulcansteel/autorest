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

from .resource import Resource


class FlattenedProduct(Resource):

    _required = []

    _attribute_map = {
        'pname': {'key': 'properties.pname', 'type': 'str'},
        'flattened_product_type': {'key': 'properties.type', 'type': 'str'},
        'provisioning_state_values': {'key': 'properties.provisioningStateValues', 'type': 'str'},
        'provisioning_state': {'key': 'properties.provisioningState', 'type': 'str'},
    }

    def __init__(self, *args, **kwargs):
        """FlattenedProduct

        :param str pname
        :param str flattened_product_type
        :param str provisioning_state_values: Possible values for this
        property include: 'Succeeded', 'Failed', 'canceled', 'Accepted',
        'Creating', 'Created', 'Updating', 'Updated', 'Deleting', 'Deleted',
        'OK'.
        :param str provisioning_state
        """
        self.pname = None
        self.flattened_product_type = None
        self.provisioning_state_values = None
        self.provisioning_state = None

        super(FlattenedProduct, self).__init__(*args, **kwargs)
