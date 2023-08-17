// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkPathResponse} extends {@link TeaModel}
 *
 * <p>CreateNetworkPathResponse</p>
 */
public class CreateNetworkPathResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateNetworkPathResponseBody body;

    private CreateNetworkPathResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateNetworkPathResponse create() {
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
    public CreateNetworkPathResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateNetworkPathResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateNetworkPathResponseBody body);

        @Override
        CreateNetworkPathResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateNetworkPathResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateNetworkPathResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateNetworkPathResponse response) {
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
        public Builder body(CreateNetworkPathResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateNetworkPathResponse build() {
            return new CreateNetworkPathResponse(this);
        } 

    } 

}