// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterNodePoolResponse} extends {@link TeaModel}
 *
 * <p>ModifyClusterNodePoolResponse</p>
 */
public class ModifyClusterNodePoolResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyClusterNodePoolResponseBody body;

    private ModifyClusterNodePoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyClusterNodePoolResponse create() {
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
    public ModifyClusterNodePoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyClusterNodePoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyClusterNodePoolResponseBody body);

        @Override
        ModifyClusterNodePoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyClusterNodePoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyClusterNodePoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyClusterNodePoolResponse response) {
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
        public Builder body(ModifyClusterNodePoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyClusterNodePoolResponse build() {
            return new ModifyClusterNodePoolResponse(this);
        } 

    } 

}
