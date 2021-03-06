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


class DateWrapper(Model):

    _required = []

    _attribute_map = {
        'field': {'key': 'field', 'type': 'date'},
        'leap': {'key': 'leap', 'type': 'date'},
    }

    def __init__(self, *args, **kwargs):
        """DateWrapper

        :param date field
        :param date leap
        """
        self.field = None
        self.leap = None

        super(DateWrapper, self).__init__(*args, **kwargs)
