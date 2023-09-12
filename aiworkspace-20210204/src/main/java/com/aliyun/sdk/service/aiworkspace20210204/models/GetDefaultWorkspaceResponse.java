// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDefaultWorkspaceResponse} extends {@link TeaModel}
 *
 * <p>GetDefaultWorkspaceResponse</p>
 */
public class GetDefaultWorkspaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDefaultWorkspaceResponseBody body;

    private GetDefaultWorkspaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDefaultWorkspaceResponse create() {
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
    public GetDefaultWorkspaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDefaultWorkspaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDefaultWorkspaceResponseBody body);

        @Override
        GetDefaultWorkspaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDefaultWorkspaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDefaultWorkspaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDefaultWorkspaceResponse response) {
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
        public Builder body(GetDefaultWorkspaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDefaultWorkspaceResponse build() {
            return new GetDefaultWorkspaceResponse(this);
        } 

    } 

}