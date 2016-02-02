/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyfile;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import fixtures.bodyfile.models.ErrorException;
import java.io.InputStream;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Headers;

/**
 * An instance of this class provides access to all the operations defined
 * in FilesOperations.
 */
public interface FilesOperations {
    /**
     * The interface defining all the services for FilesOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface FilesService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("files/stream/nonempty")
        Call<ResponseBody> getFile();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("files/stream/empty")
        Call<ResponseBody> getEmptyFile();

    }
    /**
     * Get file.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the InputStream object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<InputStream> getFile() throws ErrorException, IOException;

    /**
     * Get file.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getFileAsync(final ServiceCallback<InputStream> serviceCallback);

    /**
     * Get empty file.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the InputStream object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<InputStream> getEmptyFile() throws ErrorException, IOException;

    /**
     * Get empty file.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getEmptyFileAsync(final ServiceCallback<InputStream> serviceCallback);

}
