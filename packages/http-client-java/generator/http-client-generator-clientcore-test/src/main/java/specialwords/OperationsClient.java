package specialwords;

import io.clientcore.core.annotations.Metadata;
import io.clientcore.core.annotations.ServiceClient;
import io.clientcore.core.http.exceptions.HttpResponseException;
import io.clientcore.core.http.models.RequestOptions;
import io.clientcore.core.http.models.Response;
import specialwords.implementation.OperationsImpl;

/**
 * Initializes a new instance of the synchronous SpecialWordsClient type.
 */
@ServiceClient(builder = SpecialWordsClientBuilder.class)
public final class OperationsClient {
    @Metadata(generated = true)
    private final OperationsImpl serviceClient;

    /**
     * Initializes an instance of OperationsClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Metadata(generated = true)
    OperationsClient(OperationsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The and operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> andWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.andWithResponse(requestOptions);
    }

    /**
     * The as operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> asWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.asWithResponse(requestOptions);
    }

    /**
     * The assertMethod operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> assertMethodWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.assertMethodWithResponse(requestOptions);
    }

    /**
     * The async operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> asyncWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.asyncWithResponse(requestOptions);
    }

    /**
     * The await operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> awaitWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.awaitWithResponse(requestOptions);
    }

    /**
     * The breakMethod operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> breakMethodWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.breakMethodWithResponse(requestOptions);
    }

    /**
     * The classMethod operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> classMethodWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.classMethodWithResponse(requestOptions);
    }

    /**
     * The constructor operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> constructorWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.constructorWithResponse(requestOptions);
    }

    /**
     * The continueMethod operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> continueMethodWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.continueMethodWithResponse(requestOptions);
    }

    /**
     * The def operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> defWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.defWithResponse(requestOptions);
    }

    /**
     * The del operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> delWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.delWithResponse(requestOptions);
    }

    /**
     * The elif operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> elifWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.elifWithResponse(requestOptions);
    }

    /**
     * The elseMethod operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> elseMethodWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.elseMethodWithResponse(requestOptions);
    }

    /**
     * The except operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> exceptWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.exceptWithResponse(requestOptions);
    }

    /**
     * The exec operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> execWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.execWithResponse(requestOptions);
    }

    /**
     * The finallyMethod operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> finallyMethodWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.finallyMethodWithResponse(requestOptions);
    }

    /**
     * The forMethod operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> forMethodWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.forMethodWithResponse(requestOptions);
    }

    /**
     * The from operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> fromWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.fromWithResponse(requestOptions);
    }

    /**
     * The global operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> globalWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.globalWithResponse(requestOptions);
    }

    /**
     * The ifMethod operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> ifMethodWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.ifMethodWithResponse(requestOptions);
    }

    /**
     * The importMethod operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> importMethodWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.importMethodWithResponse(requestOptions);
    }

    /**
     * The in operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> inWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.inWithResponse(requestOptions);
    }

    /**
     * The is operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> isWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.isWithResponse(requestOptions);
    }

    /**
     * The lambda operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> lambdaWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.lambdaWithResponse(requestOptions);
    }

    /**
     * The not operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> notWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.notWithResponse(requestOptions);
    }

    /**
     * The or operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> orWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.orWithResponse(requestOptions);
    }

    /**
     * The pass operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> passWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.passWithResponse(requestOptions);
    }

    /**
     * The raise operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> raiseWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.raiseWithResponse(requestOptions);
    }

    /**
     * The returnMethod operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> returnMethodWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.returnMethodWithResponse(requestOptions);
    }

    /**
     * The tryMethod operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> tryMethodWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.tryMethodWithResponse(requestOptions);
    }

    /**
     * The whileMethod operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> whileMethodWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.whileMethodWithResponse(requestOptions);
    }

    /**
     * The with operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> withWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.withWithResponse(requestOptions);
    }

    /**
     * The yield operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the service returns an error.
     * @return the response.
     */
    @Metadata(generated = true)
    public Response<Void> yieldWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.yieldWithResponse(requestOptions);
    }

    /**
     * The and operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void and() {
        // Generated convenience method for andWithResponse
        RequestOptions requestOptions = new RequestOptions();
        andWithResponse(requestOptions).getValue();
    }

    /**
     * The as operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void as() {
        // Generated convenience method for asWithResponse
        RequestOptions requestOptions = new RequestOptions();
        asWithResponse(requestOptions).getValue();
    }

    /**
     * The assertMethod operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void assertMethod() {
        // Generated convenience method for assertMethodWithResponse
        RequestOptions requestOptions = new RequestOptions();
        assertMethodWithResponse(requestOptions).getValue();
    }

    /**
     * The async operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void async() {
        // Generated convenience method for asyncWithResponse
        RequestOptions requestOptions = new RequestOptions();
        asyncWithResponse(requestOptions).getValue();
    }

    /**
     * The await operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void await() {
        // Generated convenience method for awaitWithResponse
        RequestOptions requestOptions = new RequestOptions();
        awaitWithResponse(requestOptions).getValue();
    }

    /**
     * The breakMethod operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void breakMethod() {
        // Generated convenience method for breakMethodWithResponse
        RequestOptions requestOptions = new RequestOptions();
        breakMethodWithResponse(requestOptions).getValue();
    }

    /**
     * The classMethod operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void classMethod() {
        // Generated convenience method for classMethodWithResponse
        RequestOptions requestOptions = new RequestOptions();
        classMethodWithResponse(requestOptions).getValue();
    }

    /**
     * The constructor operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void constructor() {
        // Generated convenience method for constructorWithResponse
        RequestOptions requestOptions = new RequestOptions();
        constructorWithResponse(requestOptions).getValue();
    }

    /**
     * The continueMethod operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void continueMethod() {
        // Generated convenience method for continueMethodWithResponse
        RequestOptions requestOptions = new RequestOptions();
        continueMethodWithResponse(requestOptions).getValue();
    }

    /**
     * The def operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void def() {
        // Generated convenience method for defWithResponse
        RequestOptions requestOptions = new RequestOptions();
        defWithResponse(requestOptions).getValue();
    }

    /**
     * The del operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void del() {
        // Generated convenience method for delWithResponse
        RequestOptions requestOptions = new RequestOptions();
        delWithResponse(requestOptions).getValue();
    }

    /**
     * The elif operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void elif() {
        // Generated convenience method for elifWithResponse
        RequestOptions requestOptions = new RequestOptions();
        elifWithResponse(requestOptions).getValue();
    }

    /**
     * The elseMethod operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void elseMethod() {
        // Generated convenience method for elseMethodWithResponse
        RequestOptions requestOptions = new RequestOptions();
        elseMethodWithResponse(requestOptions).getValue();
    }

    /**
     * The except operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void except() {
        // Generated convenience method for exceptWithResponse
        RequestOptions requestOptions = new RequestOptions();
        exceptWithResponse(requestOptions).getValue();
    }

    /**
     * The exec operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void exec() {
        // Generated convenience method for execWithResponse
        RequestOptions requestOptions = new RequestOptions();
        execWithResponse(requestOptions).getValue();
    }

    /**
     * The finallyMethod operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void finallyMethod() {
        // Generated convenience method for finallyMethodWithResponse
        RequestOptions requestOptions = new RequestOptions();
        finallyMethodWithResponse(requestOptions).getValue();
    }

    /**
     * The forMethod operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void forMethod() {
        // Generated convenience method for forMethodWithResponse
        RequestOptions requestOptions = new RequestOptions();
        forMethodWithResponse(requestOptions).getValue();
    }

    /**
     * The from operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void from() {
        // Generated convenience method for fromWithResponse
        RequestOptions requestOptions = new RequestOptions();
        fromWithResponse(requestOptions).getValue();
    }

    /**
     * The global operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void global() {
        // Generated convenience method for globalWithResponse
        RequestOptions requestOptions = new RequestOptions();
        globalWithResponse(requestOptions).getValue();
    }

    /**
     * The ifMethod operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void ifMethod() {
        // Generated convenience method for ifMethodWithResponse
        RequestOptions requestOptions = new RequestOptions();
        ifMethodWithResponse(requestOptions).getValue();
    }

    /**
     * The importMethod operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void importMethod() {
        // Generated convenience method for importMethodWithResponse
        RequestOptions requestOptions = new RequestOptions();
        importMethodWithResponse(requestOptions).getValue();
    }

    /**
     * The in operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void in() {
        // Generated convenience method for inWithResponse
        RequestOptions requestOptions = new RequestOptions();
        inWithResponse(requestOptions).getValue();
    }

    /**
     * The is operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void is() {
        // Generated convenience method for isWithResponse
        RequestOptions requestOptions = new RequestOptions();
        isWithResponse(requestOptions).getValue();
    }

    /**
     * The lambda operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void lambda() {
        // Generated convenience method for lambdaWithResponse
        RequestOptions requestOptions = new RequestOptions();
        lambdaWithResponse(requestOptions).getValue();
    }

    /**
     * The not operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void not() {
        // Generated convenience method for notWithResponse
        RequestOptions requestOptions = new RequestOptions();
        notWithResponse(requestOptions).getValue();
    }

    /**
     * The or operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void or() {
        // Generated convenience method for orWithResponse
        RequestOptions requestOptions = new RequestOptions();
        orWithResponse(requestOptions).getValue();
    }

    /**
     * The pass operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void pass() {
        // Generated convenience method for passWithResponse
        RequestOptions requestOptions = new RequestOptions();
        passWithResponse(requestOptions).getValue();
    }

    /**
     * The raise operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void raise() {
        // Generated convenience method for raiseWithResponse
        RequestOptions requestOptions = new RequestOptions();
        raiseWithResponse(requestOptions).getValue();
    }

    /**
     * The returnMethod operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void returnMethod() {
        // Generated convenience method for returnMethodWithResponse
        RequestOptions requestOptions = new RequestOptions();
        returnMethodWithResponse(requestOptions).getValue();
    }

    /**
     * The tryMethod operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void tryMethod() {
        // Generated convenience method for tryMethodWithResponse
        RequestOptions requestOptions = new RequestOptions();
        tryMethodWithResponse(requestOptions).getValue();
    }

    /**
     * The whileMethod operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void whileMethod() {
        // Generated convenience method for whileMethodWithResponse
        RequestOptions requestOptions = new RequestOptions();
        whileMethodWithResponse(requestOptions).getValue();
    }

    /**
     * The with operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void with() {
        // Generated convenience method for withWithResponse
        RequestOptions requestOptions = new RequestOptions();
        withWithResponse(requestOptions).getValue();
    }

    /**
     * The yield operation.
     * 
     * @throws HttpResponseException thrown if the service returns an error.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Metadata(generated = true)
    public void yield() {
        // Generated convenience method for yieldWithResponse
        RequestOptions requestOptions = new RequestOptions();
        yieldWithResponse(requestOptions).getValue();
    }
}
