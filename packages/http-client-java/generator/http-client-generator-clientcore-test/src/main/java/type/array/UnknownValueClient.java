package type.array;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.http.exceptions.HttpResponseException;
import io.clientcore.core.http.models.RequestOptions;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.models.binarydata.BinaryData;
import java.util.List;
import type.array.implementation.UnknownValuesImpl;

/**
 * Initializes a new instance of the synchronous ArrayClient type.
 */
@ServiceClient(builder = ArrayClientBuilder.class)
public final class UnknownValueClient {
    @Metadata(generated = true)
    private final UnknownValuesImpl serviceClient;

    /**
     * Initializes an instance of UnknownValueClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Metadata(generated = true)
    UnknownValueClient(UnknownValuesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The get operation.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * [
     *     BinaryData (Required)
     * ]
     * }
     * </pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<List<BinaryData>> getWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getWithResponse(requestOptions);
    }

    /**
     * The put operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * [
     *     BinaryData (Required)
     * ]
     * }
     * </pre>
     * 
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> putWithResponse(BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.putWithResponse(body, requestOptions);
    }

    /**
     * The get operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @Metadata(generated = true)
    public List<BinaryData> get() {
        // Generated convenience method for getWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getWithResponse(requestOptions).getValue();
    }

    /**
     * The put operation.
     * 
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void put(List<BinaryData> body) {
        // Generated convenience method for putWithResponse
        RequestOptions requestOptions = new RequestOptions();
        putWithResponse(BinaryData.fromObject(body), requestOptions).getValue();
    }
}
