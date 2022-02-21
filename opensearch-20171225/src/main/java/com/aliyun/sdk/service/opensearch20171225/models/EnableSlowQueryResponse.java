// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableSlowQueryResponse} extends {@link TeaModel}
 *
 * <p>EnableSlowQueryResponse</p>
 */
public class EnableSlowQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableSlowQueryResponseBody body;

    private EnableSlowQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableSlowQueryResponse create() {
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
    public EnableSlowQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableSlowQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableSlowQueryResponseBody body);

        @Override
        EnableSlowQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableSlowQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableSlowQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableSlowQueryResponse response) {
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
        public Builder body(EnableSlowQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableSlowQueryResponse build() {
            return new EnableSlowQueryResponse(this);
        } 

    } 

}
