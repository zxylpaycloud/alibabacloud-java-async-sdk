// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransformDBClusterPayTypeResponse} extends {@link TeaModel}
 *
 * <p>TransformDBClusterPayTypeResponse</p>
 */
public class TransformDBClusterPayTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TransformDBClusterPayTypeResponseBody body;

    private TransformDBClusterPayTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TransformDBClusterPayTypeResponse create() {
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
    public TransformDBClusterPayTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TransformDBClusterPayTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TransformDBClusterPayTypeResponseBody body);

        @Override
        TransformDBClusterPayTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TransformDBClusterPayTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TransformDBClusterPayTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TransformDBClusterPayTypeResponse response) {
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
        public Builder body(TransformDBClusterPayTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TransformDBClusterPayTypeResponse build() {
            return new TransformDBClusterPayTypeResponse(this);
        } 

    } 

}
