// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBClusterEndpointResponse} extends {@link TeaModel}
 *
 * <p>CreateDBClusterEndpointResponse</p>
 */
public class CreateDBClusterEndpointResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDBClusterEndpointResponseBody body;

    private CreateDBClusterEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDBClusterEndpointResponse create() {
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
    public CreateDBClusterEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDBClusterEndpointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDBClusterEndpointResponseBody body);

        @Override
        CreateDBClusterEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDBClusterEndpointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDBClusterEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDBClusterEndpointResponse response) {
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
        public Builder body(CreateDBClusterEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDBClusterEndpointResponse build() {
            return new CreateDBClusterEndpointResponse(this);
        } 

    } 

}
