/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodynumber;

import com.microsoft.rest.ServiceClient;
import com.squareup.okhttp.OkHttpClient;
import retrofit.Retrofit;

/**
 * Initializes a new instance of the AutoRestNumberTestService class.
 */
public final class AutoRestNumberTestServiceImpl extends ServiceClient implements AutoRestNumberTestService {
    /**
     * The URI used as the base for all cloud service requests.
     */
    private final String baseUri;

    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    public String getBaseUri() {
        return this.baseUri;
    }

    /**
     * Gets the NumberOperations object to access its operations.
     * @return the NumberOperations object.
     */
    public NumberOperations getNumberOperations() {
        return new NumberOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Initializes an instance of AutoRestNumberTestService client.
     */
    public AutoRestNumberTestServiceImpl() {
        this("https://localhost");
    }

    /**
     * Initializes an instance of AutoRestNumberTestService client.
     *
     * @param baseUri the base URI of the host
     */
    public AutoRestNumberTestServiceImpl(String baseUri) {
        super();
        this.baseUri = baseUri;
        initialize();
    }

    /**
     * Initializes an instance of AutoRestNumberTestService client.
     *
     * @param baseUri the base URI of the host
     * @param client the {@link OkHttpClient} client to use for REST calls
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public AutoRestNumberTestServiceImpl(String baseUri, OkHttpClient client, Retrofit.Builder retrofitBuilder) {
        super(client, retrofitBuilder);
        this.baseUri = baseUri;
        initialize();
    }

    private void initialize() {
        this.retrofitBuilder.baseUrl(baseUri);
    }
}
