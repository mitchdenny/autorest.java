/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http.implementation;

import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.DELETE;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HEAD;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.POST;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import fixtures.http.HttpServerFailures;
import fixtures.http.models.Error;
import fixtures.http.models.ErrorException;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;

/**
 * An instance of this class provides access to all the operations defined in
 * HttpServerFailures.
 */
public class HttpServerFailuresImpl implements HttpServerFailures {
    /**
     * The proxy service used to perform REST calls.
     */
    private HttpServerFailuresService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestHttpInfrastructureTestServiceImpl client;

    /**
     * Initializes an instance of HttpServerFailuresImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public HttpServerFailuresImpl(AutoRestHttpInfrastructureTestServiceImpl client) {
        this.service = RestProxy.create(HttpServerFailuresService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for HttpServerFailures to be
     * used by the proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    interface HttpServerFailuresService {
        @HEAD("http/failure/server/501")
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Error>> head501();

        @GET("http/failure/server/501")
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Error>> get501();

        @POST("http/failure/server/505")
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Error>> post505(@BodyParam("application/json; charset=utf-8") Boolean booleanValue);

        @DELETE("http/failure/server/505")
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Error>> delete505(@BodyParam("application/json; charset=utf-8") Boolean booleanValue);
    }

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Error object if successful.
     */
    public Error head501() {
        return head501Async().blockingGet();
    }

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Error&gt;} object.
     */
    public ServiceFuture<Error> head501Async(final ServiceCallback<Error> serviceCallback) {
        return ServiceFuture.fromBody(head501Async(), serviceCallback);
    }

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Error&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Error>> head501WithRestResponseAsync() {
        return service.head501();
    }

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Maybe&lt;Error&gt;} object if successful.
     */
    public Maybe<Error> head501Async() {
        return head501WithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, Error>, Maybe<Error>>() {
                public Maybe<Error> apply(RestResponse<Void, Error> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Error object if successful.
     */
    public Error get501() {
        return get501Async().blockingGet();
    }

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Error&gt;} object.
     */
    public ServiceFuture<Error> get501Async(final ServiceCallback<Error> serviceCallback) {
        return ServiceFuture.fromBody(get501Async(), serviceCallback);
    }

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Error&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Error>> get501WithRestResponseAsync() {
        return service.get501();
    }

    /**
     * Return 501 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Maybe&lt;Error&gt;} object if successful.
     */
    public Maybe<Error> get501Async() {
        return get501WithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, Error>, Maybe<Error>>() {
                public Maybe<Error> apply(RestResponse<Void, Error> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Error object if successful.
     */
    public Error post505() {
        return post505Async().blockingGet();
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Error&gt;} object.
     */
    public ServiceFuture<Error> post505Async(final ServiceCallback<Error> serviceCallback) {
        return ServiceFuture.fromBody(post505Async(), serviceCallback);
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Error&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Error>> post505WithRestResponseAsync() {
        final Boolean booleanValue = null;
        return service.post505(booleanValue);
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Maybe&lt;Error&gt;} object if successful.
     */
    public Maybe<Error> post505Async() {
        return post505WithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, Error>, Maybe<Error>>() {
                public Maybe<Error> apply(RestResponse<Void, Error> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Error object if successful.
     */
    public Error post505(Boolean booleanValue) {
        return post505Async(booleanValue).blockingGet();
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Error&gt;} object.
     */
    public ServiceFuture<Error> post505Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback) {
        return ServiceFuture.fromBody(post505Async(booleanValue), serviceCallback);
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Error&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Error>> post505WithRestResponseAsync(Boolean booleanValue) {
        return service.post505(booleanValue);
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Maybe&lt;Error&gt;} object if successful.
     */
    public Maybe<Error> post505Async(Boolean booleanValue) {
        return post505WithRestResponseAsync(booleanValue)
            .flatMapMaybe(new Function<RestResponse<Void, Error>, Maybe<Error>>() {
                public Maybe<Error> apply(RestResponse<Void, Error> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Error object if successful.
     */
    public Error delete505() {
        return delete505Async().blockingGet();
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Error&gt;} object.
     */
    public ServiceFuture<Error> delete505Async(final ServiceCallback<Error> serviceCallback) {
        return ServiceFuture.fromBody(delete505Async(), serviceCallback);
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Error&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Error>> delete505WithRestResponseAsync() {
        final Boolean booleanValue = null;
        return service.delete505(booleanValue);
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Maybe&lt;Error&gt;} object if successful.
     */
    public Maybe<Error> delete505Async() {
        return delete505WithRestResponseAsync()
            .flatMapMaybe(new Function<RestResponse<Void, Error>, Maybe<Error>>() {
                public Maybe<Error> apply(RestResponse<Void, Error> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Error object if successful.
     */
    public Error delete505(Boolean booleanValue) {
        return delete505Async(booleanValue).blockingGet();
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Error&gt;} object.
     */
    public ServiceFuture<Error> delete505Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback) {
        return ServiceFuture.fromBody(delete505Async(booleanValue), serviceCallback);
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Error&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Error>> delete505WithRestResponseAsync(Boolean booleanValue) {
        return service.delete505(booleanValue);
    }

    /**
     * Return 505 status code - should be represented in the client as an error.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Maybe&lt;Error&gt;} object if successful.
     */
    public Maybe<Error> delete505Async(Boolean booleanValue) {
        return delete505WithRestResponseAsync(booleanValue)
            .flatMapMaybe(new Function<RestResponse<Void, Error>, Maybe<Error>>() {
                public Maybe<Error> apply(RestResponse<Void, Error> restResponse) {
                    if (restResponse.body() == null) {
                        return Maybe.empty();
                    } else {
                        return Maybe.just(restResponse.body());
                    }
                }
            });
    }
}
