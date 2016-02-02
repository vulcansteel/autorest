/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.ResponseBody;
import fixtures.azurespecials.models.ErrorException;
import java.io.IOException;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in SkipUrlEncodingOperations.
 */
public final class SkipUrlEncodingOperationsImpl implements SkipUrlEncodingOperations {
    /** The Retrofit service to perform REST calls. */
    private SkipUrlEncodingService service;
    /** The service client containing this operation class. */
    private AutoRestAzureSpecialParametersTestClient client;

    /**
     * Initializes an instance of SkipUrlEncodingOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SkipUrlEncodingOperationsImpl(Retrofit retrofit, AutoRestAzureSpecialParametersTestClient client) {
        this.service = retrofit.create(SkipUrlEncodingService.class);
        this.client = client;
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getMethodPathValid(String unencodedPathParam) throws ErrorException, IOException, IllegalArgumentException {
        if (unencodedPathParam == null) {
            throw new IllegalArgumentException("Parameter unencodedPathParam is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getMethodPathValid(unencodedPathParam, this.client.getAcceptLanguage());
        return getMethodPathValidDelegate(call.execute(), null);
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getMethodPathValidAsync(String unencodedPathParam, final ServiceCallback<Void> serviceCallback) {
        if (unencodedPathParam == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter unencodedPathParam is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getMethodPathValid(unencodedPathParam, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMethodPathValidDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getMethodPathValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getPathPathValid(String unencodedPathParam) throws ErrorException, IOException, IllegalArgumentException {
        if (unencodedPathParam == null) {
            throw new IllegalArgumentException("Parameter unencodedPathParam is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getPathPathValid(unencodedPathParam, this.client.getAcceptLanguage());
        return getPathPathValidDelegate(call.execute(), null);
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getPathPathValidAsync(String unencodedPathParam, final ServiceCallback<Void> serviceCallback) {
        if (unencodedPathParam == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter unencodedPathParam is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getPathPathValid(unencodedPathParam, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getPathPathValidDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getPathPathValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam An unencoded path parameter with value 'path1/path2/path3'. Possible values for this parameter include: 'path1/path2/path3'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getSwaggerPathValid(String unencodedPathParam) throws ErrorException, IOException, IllegalArgumentException {
        if (unencodedPathParam == null) {
            throw new IllegalArgumentException("Parameter unencodedPathParam is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getSwaggerPathValid(unencodedPathParam, this.client.getAcceptLanguage());
        return getSwaggerPathValidDelegate(call.execute(), null);
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam An unencoded path parameter with value 'path1/path2/path3'. Possible values for this parameter include: 'path1/path2/path3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getSwaggerPathValidAsync(String unencodedPathParam, final ServiceCallback<Void> serviceCallback) {
        if (unencodedPathParam == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter unencodedPathParam is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getSwaggerPathValid(unencodedPathParam, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getSwaggerPathValidDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getSwaggerPathValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getMethodQueryValid(String q1) throws ErrorException, IOException, IllegalArgumentException {
        if (q1 == null) {
            throw new IllegalArgumentException("Parameter q1 is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getMethodQueryValid(q1, this.client.getAcceptLanguage());
        return getMethodQueryValidDelegate(call.execute(), null);
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getMethodQueryValidAsync(String q1, final ServiceCallback<Void> serviceCallback) {
        if (q1 == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter q1 is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getMethodQueryValid(q1, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMethodQueryValidDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getMethodQueryValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

    /**
     * Get method with unencoded query parameter with value null.
     *
     * @param q1 Unencoded query parameter with value null
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getMethodQueryNull(String q1) throws ErrorException, IOException {
        Call<ResponseBody> call = service.getMethodQueryNull(q1, this.client.getAcceptLanguage());
        return getMethodQueryNullDelegate(call.execute(), null);
    }

    /**
     * Get method with unencoded query parameter with value null.
     *
     * @param q1 Unencoded query parameter with value null
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getMethodQueryNullAsync(String q1, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.getMethodQueryNull(q1, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getMethodQueryNullDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getMethodQueryNullDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getPathQueryValid(String q1) throws ErrorException, IOException, IllegalArgumentException {
        if (q1 == null) {
            throw new IllegalArgumentException("Parameter q1 is required and cannot be null.");
        }
        Call<ResponseBody> call = service.getPathQueryValid(q1, this.client.getAcceptLanguage());
        return getPathQueryValidDelegate(call.execute(), null);
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getPathQueryValidAsync(String q1, final ServiceCallback<Void> serviceCallback) {
        if (q1 == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter q1 is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.getPathQueryValid(q1, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getPathQueryValidDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getPathQueryValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 An unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'. Possible values for this parameter include: 'value1&amp;q2=value2&amp;q3=value3'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getSwaggerQueryValid(String q1) throws ErrorException, IOException {
        Call<ResponseBody> call = service.getSwaggerQueryValid(q1, this.client.getAcceptLanguage());
        return getSwaggerQueryValidDelegate(call.execute(), null);
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 An unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'. Possible values for this parameter include: 'value1&amp;q2=value2&amp;q3=value3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getSwaggerQueryValidAsync(String q1, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.getSwaggerQueryValid(q1, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getSwaggerQueryValidDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> getSwaggerQueryValidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

}
