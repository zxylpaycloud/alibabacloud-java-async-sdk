// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetFabricOrganizationUserPasswordResponse} extends {@link TeaModel}
 *
 * <p>ResetFabricOrganizationUserPasswordResponse</p>
 */
public class ResetFabricOrganizationUserPasswordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetFabricOrganizationUserPasswordResponseBody body;

    private ResetFabricOrganizationUserPasswordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetFabricOrganizationUserPasswordResponse create() {
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
    public ResetFabricOrganizationUserPasswordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetFabricOrganizationUserPasswordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetFabricOrganizationUserPasswordResponseBody body);

        @Override
        ResetFabricOrganizationUserPasswordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetFabricOrganizationUserPasswordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetFabricOrganizationUserPasswordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetFabricOrganizationUserPasswordResponse response) {
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
        public Builder body(ResetFabricOrganizationUserPasswordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetFabricOrganizationUserPasswordResponse build() {
            return new ResetFabricOrganizationUserPasswordResponse(this);
        } 

    } 

}
