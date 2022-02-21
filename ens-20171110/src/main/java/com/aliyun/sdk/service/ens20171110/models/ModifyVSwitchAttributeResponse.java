// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVSwitchAttributeResponse} extends {@link TeaModel}
 *
 * <p>ModifyVSwitchAttributeResponse</p>
 */
public class ModifyVSwitchAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyVSwitchAttributeResponseBody body;

    private ModifyVSwitchAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyVSwitchAttributeResponse create() {
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
    public ModifyVSwitchAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyVSwitchAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyVSwitchAttributeResponseBody body);

        @Override
        ModifyVSwitchAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyVSwitchAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyVSwitchAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyVSwitchAttributeResponse response) {
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
        public Builder body(ModifyVSwitchAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyVSwitchAttributeResponse build() {
            return new ModifyVSwitchAttributeResponse(this);
        } 

    } 

}
