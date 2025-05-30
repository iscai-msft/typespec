package specialheaders.conditionalrequest;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.http.exceptions.HttpResponseException;
import io.clientcore.core.http.models.HttpHeaderName;
import io.clientcore.core.http.models.RequestOptions;
import io.clientcore.core.http.models.Response;
import io.clientcore.core.utils.DateTimeRfc1123;
import java.time.OffsetDateTime;
import specialheaders.conditionalrequest.implementation.ConditionalRequestClientImpl;

/**
 * Initializes a new instance of the synchronous ConditionalRequestClient type.
 */
@ServiceClient(builder = ConditionalRequestClientBuilder.class)
public final class ConditionalRequestClient {
    @Metadata(generated = true)
    private final ConditionalRequestClientImpl serviceClient;

    /**
     * Initializes an instance of ConditionalRequestClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Metadata(generated = true)
    ConditionalRequestClient(ConditionalRequestClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Check when only If-Match in header is defined.
     * <p><strong>Header Parameters</strong></p>
     * <table border="1">
     * <caption>Header Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>If-Match</td><td>String</td><td>No</td><td>The request should only proceed if an entity matches this
     * string.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addHeader}
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> postIfMatchWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.postIfMatchWithResponse(requestOptions);
    }

    /**
     * Check when only If-None-Match in header is defined.
     * <p><strong>Header Parameters</strong></p>
     * <table border="1">
     * <caption>Header Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>If-None-Match</td><td>String</td><td>No</td><td>The request should only proceed if no entity matches this
     * string.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addHeader}
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> postIfNoneMatchWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.postIfNoneMatchWithResponse(requestOptions);
    }

    /**
     * Check when only If-Modified-Since in header is defined.
     * <p><strong>Header Parameters</strong></p>
     * <table border="1">
     * <caption>Header Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>If-Modified-Since</td><td>OffsetDateTime</td><td>No</td><td>A timestamp indicating the last modified time
     * of the resource known to the
     * client. The operation will be performed only if the resource on the service has
     * been modified since the specified time.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addHeader}
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> headIfModifiedSinceWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.headIfModifiedSinceWithResponse(requestOptions);
    }

    /**
     * Check when only If-Unmodified-Since in header is defined.
     * <p><strong>Header Parameters</strong></p>
     * <table border="1">
     * <caption>Header Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>If-Unmodified-Since</td><td>OffsetDateTime</td><td>No</td><td>A timestamp indicating the last modified
     * time of the resource known to the
     * client. The operation will be performed only if the resource on the service has
     * not been modified since the specified time.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addHeader}
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> postIfUnmodifiedSinceWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.postIfUnmodifiedSinceWithResponse(requestOptions);
    }

    /**
     * Check when only If-Match in header is defined.
     * 
     * @param ifMatch The request should only proceed if an entity matches this string.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void postIfMatch(String ifMatch) {
        // Generated convenience method for postIfMatchWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (ifMatch != null) {
            requestOptions.setHeader(HttpHeaderName.IF_MATCH, ifMatch);
        }
        postIfMatchWithResponse(requestOptions).getValue();
    }

    /**
     * Check when only If-Match in header is defined.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void postIfMatch() {
        // Generated convenience method for postIfMatchWithResponse
        RequestOptions requestOptions = new RequestOptions();
        postIfMatchWithResponse(requestOptions).getValue();
    }

    /**
     * Check when only If-None-Match in header is defined.
     * 
     * @param ifNoneMatch The request should only proceed if no entity matches this string.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void postIfNoneMatch(String ifNoneMatch) {
        // Generated convenience method for postIfNoneMatchWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (ifNoneMatch != null) {
            requestOptions.setHeader(HttpHeaderName.IF_NONE_MATCH, ifNoneMatch);
        }
        postIfNoneMatchWithResponse(requestOptions).getValue();
    }

    /**
     * Check when only If-None-Match in header is defined.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void postIfNoneMatch() {
        // Generated convenience method for postIfNoneMatchWithResponse
        RequestOptions requestOptions = new RequestOptions();
        postIfNoneMatchWithResponse(requestOptions).getValue();
    }

    /**
     * Check when only If-Modified-Since in header is defined.
     * 
     * @param ifModifiedSince A timestamp indicating the last modified time of the resource known to the
     * client. The operation will be performed only if the resource on the service has
     * been modified since the specified time.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void headIfModifiedSince(OffsetDateTime ifModifiedSince) {
        // Generated convenience method for headIfModifiedSinceWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (ifModifiedSince != null) {
            requestOptions.setHeader(HttpHeaderName.IF_MODIFIED_SINCE,
                String.valueOf(new DateTimeRfc1123(ifModifiedSince)));
        }
        headIfModifiedSinceWithResponse(requestOptions).getValue();
    }

    /**
     * Check when only If-Modified-Since in header is defined.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void headIfModifiedSince() {
        // Generated convenience method for headIfModifiedSinceWithResponse
        RequestOptions requestOptions = new RequestOptions();
        headIfModifiedSinceWithResponse(requestOptions).getValue();
    }

    /**
     * Check when only If-Unmodified-Since in header is defined.
     * 
     * @param ifUnmodifiedSince A timestamp indicating the last modified time of the resource known to the
     * client. The operation will be performed only if the resource on the service has
     * not been modified since the specified time.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void postIfUnmodifiedSince(OffsetDateTime ifUnmodifiedSince) {
        // Generated convenience method for postIfUnmodifiedSinceWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (ifUnmodifiedSince != null) {
            requestOptions.setHeader(HttpHeaderName.IF_UNMODIFIED_SINCE,
                String.valueOf(new DateTimeRfc1123(ifUnmodifiedSince)));
        }
        postIfUnmodifiedSinceWithResponse(requestOptions).getValue();
    }

    /**
     * Check when only If-Unmodified-Since in header is defined.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void postIfUnmodifiedSince() {
        // Generated convenience method for postIfUnmodifiedSinceWithResponse
        RequestOptions requestOptions = new RequestOptions();
        postIfUnmodifiedSinceWithResponse(requestOptions).getValue();
    }
}
