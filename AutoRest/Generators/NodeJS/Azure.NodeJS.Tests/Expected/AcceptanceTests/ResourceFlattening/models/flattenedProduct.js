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

var models = require('./index');

var util = require('util');

/**
 * @class
 * Initializes a new instance of the FlattenedProduct class.
 * @constructor
 * @member {string} [pname]
 * 
 * @member {string} [flattenedProductType]
 * 
 * @member {string} [provisioningStateValues] Possible values for this
 * property include: 'Succeeded', 'Failed', 'canceled', 'Accepted',
 * 'Creating', 'Created', 'Updating', 'Updated', 'Deleting', 'Deleted', 'OK'.
 * 
 * @member {string} [provisioningState]
 * 
 */
function FlattenedProduct() {
  FlattenedProduct['super_'].call(this);
}

util.inherits(FlattenedProduct, models['Resource']);

/**
 * Defines the metadata of FlattenedProduct
 *
 * @returns {object} metadata of FlattenedProduct
 *
 */
FlattenedProduct.prototype.mapper = function () {
  return {
    required: false,
    serializedName: 'FlattenedProduct',
    type: {
      name: 'Composite',
      className: 'FlattenedProduct',
      modelProperties: {
        id: {
          required: false,
          serializedName: 'id',
          type: {
            name: 'String'
          }
        },
        type: {
          required: false,
          serializedName: 'type',
          type: {
            name: 'String'
          }
        },
        tags: {
          required: false,
          serializedName: 'tags',
          type: {
            name: 'Dictionary',
            value: {
                required: false,
                serializedName: 'StringElementType',
                type: {
                  name: 'String'
                }
            }
          }
        },
        location: {
          required: false,
          serializedName: 'location',
          type: {
            name: 'String'
          }
        },
        name: {
          required: false,
          serializedName: 'name',
          type: {
            name: 'String'
          }
        },
        pname: {
          required: false,
          serializedName: 'properties.pname',
          type: {
            name: 'String'
          }
        },
        flattenedProductType: {
          required: false,
          serializedName: 'properties.type',
          type: {
            name: 'String'
          }
        },
        provisioningStateValues: {
          required: false,
          serializedName: 'properties.provisioningStateValues',
          type: {
            name: 'String'
          }
        },
        provisioningState: {
          required: false,
          serializedName: 'properties.provisioningState',
          type: {
            name: 'String'
          }
        }
      }
    }
  };
};

module.exports = FlattenedProduct;
