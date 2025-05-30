// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package type.union;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;
import type.union.implementation.FloatsOnliesImpl;
import type.union.implementation.models.SendRequest4;
import type.union.models.GetResponse4;
import type.union.models.GetResponseProp3;

/**
 * Initializes a new instance of the asynchronous UnionClient type.
 */
@ServiceClient(builder = UnionClientBuilder.class, isAsync = true)
public final class FloatsOnlyAsyncClient {
    @Generated
    private final FloatsOnliesImpl serviceClient;

    /**
     * Initializes an instance of FloatsOnlyAsyncClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    FloatsOnlyAsyncClient(FloatsOnliesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The get operation.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     prop: String(1.1/2.2/3.3) (Required)
     * }
     * }
     * </pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getWithResponseAsync(requestOptions);
    }

    /**
     * The send operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>
     * {@code
     * {
     *     prop: String(1.1/2.2/3.3) (Required)
     * }
     * }
     * </pre>
     * 
     * @param sendRequest4 The sendRequest4 parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> sendWithResponse(BinaryData sendRequest4, RequestOptions requestOptions) {
        return this.serviceClient.sendWithResponseAsync(sendRequest4, requestOptions);
    }

    /**
     * The get operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<GetResponse4> get() {
        // Generated convenience method for getWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getWithResponse(requestOptions).flatMap(FluxUtil::toMono)
            .map(protocolMethodData -> protocolMethodData.toObject(GetResponse4.class));
    }

    /**
     * The send operation.
     * 
     * @param prop The prop parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> send(GetResponseProp3 prop) {
        // Generated convenience method for sendWithResponse
        RequestOptions requestOptions = new RequestOptions();
        SendRequest4 sendRequest4Obj = new SendRequest4(prop);
        BinaryData sendRequest4 = BinaryData.fromObject(sendRequest4Obj);
        return sendWithResponse(sendRequest4, requestOptions).flatMap(FluxUtil::toMono);
    }
}
