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

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import fixtures.http.models.ErrorException;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.HEAD;
import retrofit.http.Headers;
import retrofit.http.HTTP;
import retrofit.http.PATCH;
import retrofit.http.POST;
import retrofit.http.PUT;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpRetryOperations.
 */
public interface HttpRetryOperations {
    /**
     * The interface defining all the services for HttpRetryOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HttpRetryService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @HEAD("http/retry/408")
        Call<Void> head408();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("http/retry/500")
        Call<ResponseBody> put500(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PATCH("http/retry/500")
        Call<ResponseBody> patch500(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("http/retry/502")
        Call<ResponseBody> get502();

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("http/retry/503")
        Call<ResponseBody> post503(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "http/retry/503", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete503(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("http/retry/504")
        Call<ResponseBody> put504(@Body Boolean booleanValue);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PATCH("http/retry/504")
        Call<ResponseBody> patch504(@Body Boolean booleanValue);

    }
    /**
     * Return 408 status code, then 200 after retry.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> head408() throws ErrorException, IOException;

    /**
     * Return 408 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<Void> head408Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> put500(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> put500Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> patch500(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Return 500 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> patch500Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Return 502 status code, then 200 after retry.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> get502() throws ErrorException, IOException;

    /**
     * Return 502 status code, then 200 after retry.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> get502Async(final ServiceCallback<Void> serviceCallback);

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> post503(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> post503Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete503(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Return 503 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> delete503Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> put504(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> put504Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> patch504(Boolean booleanValue) throws ErrorException, IOException;

    /**
     * Return 504 status code, then 200 after retry.
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> patch504Async(Boolean booleanValue, final ServiceCallback<Void> serviceCallback);

}
