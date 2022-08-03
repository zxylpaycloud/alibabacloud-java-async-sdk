// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceDirectoryAccountResponse} extends {@link TeaModel}
 *
 * <p>GetResourceDirectoryAccountResponse</p>
 */
public class GetResourceDirectoryAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetResourceDirectoryAccountResponseBody body;

    private GetResourceDirectoryAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetResourceDirectoryAccountResponse create() {
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
    public GetResourceDirectoryAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResourceDirectoryAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetResourceDirectoryAccountResponseBody body);

        @Override
        GetResourceDirectoryAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResourceDirectoryAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetResourceDirectoryAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResourceDirectoryAccountResponse response) {
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
        public Builder body(GetResourceDirectoryAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResourceDirectoryAccountResponse build() {
            return new GetResourceDirectoryAccountResponse(this);
        } 

    } 

}
