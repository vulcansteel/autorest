/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * @class
 * Initializes a new instance of the BooleanWrapper class.
 * @constructor
 * @member {boolean} [fieldTrue]
 * 
 * @member {boolean} [fieldFalse]
 * 
 */
function BooleanWrapper() {
}

/**
 * Defines the metadata of BooleanWrapper
 *
 * @returns {object} metadata of BooleanWrapper
 *
 */
BooleanWrapper.prototype.mapper = function () {
  return {
    required: false,
    serializedName: 'boolean-wrapper',
    type: {
      name: 'Composite',
      className: 'BooleanWrapper',
      modelProperties: {
        fieldTrue: {
          required: false,
          serializedName: 'field_true',
          type: {
            name: 'Boolean'
          }
        },
        fieldFalse: {
          required: false,
          serializedName: 'field_false',
          type: {
            name: 'Boolean'
          }
        }
      }
    }
  };
};

module.exports = BooleanWrapper;
