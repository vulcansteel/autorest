/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.ServiceResponseEmptyCallback;
import com.squareup.okhttp.ResponseBody;
import fixtures.http.models.ErrorException;
import java.io.IOException;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpRetryOperations.
 */
public final class HttpRetryOperationsImpl implements HttpRetryOperations {
    /** The Retrofit service to perform REST calls. */
    private HttpRetryService service;
    /** The service client containing this operation class. */
    private AutoRestHttpInfrastructureTestService client;

    /**
     * Initializes an instance of HttpRetryOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public HttpRetryOperationsImpl(Retrofit retrofit, AutoRestHttpInfrastructureTestService client) {
        this.service = retrofit.create(HttpRetryService.class);
        this.client = client;
    }

    /**
     * Return 408 status code, then 200 after retry.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> head408() throws ErrorException, IOException {
        Call<Void> call = service.head408();
        return head408Delegate(call.execute(), null);
    }

    /**
     * Return 408 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<Void> head408Async(final ServiceCallback<Void> serviceCallback) {
        Call<Void> call = service.head408();
        call.enqueue(new ServiceResponseEmptyCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<Void> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(head408Delegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> head408Delegate(Response<Void> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .buildEmpty(response, retrofit);
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> put500(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.put500(booleanValue);
        return put500Delegate(call.execute(), null);
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> put500Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.put500(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(put500Delegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> put500Delegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> patch500(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.patch500(booleanValue);
        return patch500Delegate(call.execute(), null);
    }

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> patch500Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.patch500(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(patch500Delegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> patch500Delegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

    /**
     * Return 502 status code, then 200 after retry.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> get502() throws ErrorException, IOException {
        Call<ResponseBody> call = service.get502();
        return get502Delegate(call.execute(), null);
    }

    /**
     * Return 502 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> get502Async(final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.get502();
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(get502Delegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> get502Delegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> post503(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.post503(booleanValue);
        return post503Delegate(call.execute(), null);
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> post503Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.post503(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(post503Delegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> post503Delegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> delete503(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.delete503(booleanValue);
        return delete503Delegate(call.execute(), null);
    }

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> delete503Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.delete503(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(delete503Delegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> delete503Delegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> put504(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.put504(booleanValue);
        return put504Delegate(call.execute(), null);
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> put504Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.put504(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(put504Delegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> put504Delegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> patch504(Boolean booleanValue) throws ErrorException, IOException {
        Call<ResponseBody> call = service.patch504(booleanValue);
        return patch504Delegate(call.execute(), null);
    }

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> patch504Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.patch504(booleanValue);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(patch504Delegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> patch504Delegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>()
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

}
