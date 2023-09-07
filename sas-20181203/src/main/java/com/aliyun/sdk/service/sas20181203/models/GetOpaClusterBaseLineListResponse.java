// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpaClusterBaseLineListResponse} extends {@link TeaModel}
 *
 * <p>GetOpaClusterBaseLineListResponse</p>
 */
public class GetOpaClusterBaseLineListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOpaClusterBaseLineListResponseBody body;

    private GetOpaClusterBaseLineListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOpaClusterBaseLineListResponse create() {
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
    public GetOpaClusterBaseLineListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOpaClusterBaseLineListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOpaClusterBaseLineListResponseBody body);

        @Override
        GetOpaClusterBaseLineListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOpaClusterBaseLineListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOpaClusterBaseLineListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOpaClusterBaseLineListResponse response) {
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
        public Builder body(GetOpaClusterBaseLineListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOpaClusterBaseLineListResponse build() {
            return new GetOpaClusterBaseLineListResponse(this);
        } 

    } 

}
