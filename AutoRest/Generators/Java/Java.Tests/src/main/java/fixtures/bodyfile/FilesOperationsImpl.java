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

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.ResponseBody;
import fixtures.bodyfile.models.ErrorException;
import java.io.InputStream;
import java.io.IOException;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in FilesOperations.
 */
public final class FilesOperationsImpl implements FilesOperations {
    /** The Retrofit service to perform REST calls. */
    private FilesService service;
    /** The service client containing this operation class. */
    private AutoRestSwaggerBATFileService client;

    /**
     * Initializes an instance of FilesOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public FilesOperationsImpl(Retrofit retrofit, AutoRestSwaggerBATFileService client) {
        this.service = retrofit.create(FilesService.class);
        this.client = client;
    }

    /**
     * Get file.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the InputStream object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<InputStream> getFile() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getFile();
        return getFileDelegate(call.execute(), null);
    }

    /**
     * Get file.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getFileAsync(final ServiceCallback<InputStream> serviceCallback) {
        Call<ResponseBody> call = service.getFile();
        call.enqueue(new ServiceResponseCallback<InputStream>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getFileDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<InputStream> getFileDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<InputStream, ErrorException>()
                .register(200, new TypeToken<InputStream>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

    /**
     * Get empty file.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the InputStream object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<InputStream> getEmptyFile() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getEmptyFile();
        return getEmptyFileDelegate(call.execute(), null);
    }

    /**
     * Get empty file.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> getEmptyFileAsync(final ServiceCallback<InputStream> serviceCallback) {
        Call<ResponseBody> call = service.getEmptyFile();
        call.enqueue(new ServiceResponseCallback<InputStream>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getEmptyFileDelegate(response, retrofit));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<InputStream> getEmptyFileDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ErrorException, IOException {
        return new ServiceResponseBuilder<InputStream, ErrorException>()
                .register(200, new TypeToken<InputStream>() { }.getType())
                .registerError(ErrorException.class)
                .build(response, retrofit);
    }

}
