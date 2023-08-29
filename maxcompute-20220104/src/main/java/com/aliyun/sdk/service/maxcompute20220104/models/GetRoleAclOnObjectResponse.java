// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRoleAclOnObjectResponse} extends {@link TeaModel}
 *
 * <p>GetRoleAclOnObjectResponse</p>
 */
public class GetRoleAclOnObjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRoleAclOnObjectResponseBody body;

    private GetRoleAclOnObjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRoleAclOnObjectResponse create() {
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
    public GetRoleAclOnObjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRoleAclOnObjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRoleAclOnObjectResponseBody body);

        @Override
        GetRoleAclOnObjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRoleAclOnObjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRoleAclOnObjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRoleAclOnObjectResponse response) {
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
        public Builder body(GetRoleAclOnObjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRoleAclOnObjectResponse build() {
            return new GetRoleAclOnObjectResponse(this);
        } 

    } 

}