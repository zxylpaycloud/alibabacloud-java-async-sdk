// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCircuitBreakerRulesResponse} extends {@link TeaModel}
 *
 * <p>DeleteCircuitBreakerRulesResponse</p>
 */
public class DeleteCircuitBreakerRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCircuitBreakerRulesResponseBody body;

    private DeleteCircuitBreakerRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCircuitBreakerRulesResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public DeleteCircuitBreakerRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCircuitBreakerRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCircuitBreakerRulesResponseBody body);

        @Override
        DeleteCircuitBreakerRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCircuitBreakerRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCircuitBreakerRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCircuitBreakerRulesResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(DeleteCircuitBreakerRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCircuitBreakerRulesResponse build() {
            return new DeleteCircuitBreakerRulesResponse(this);
        } 

    } 

}