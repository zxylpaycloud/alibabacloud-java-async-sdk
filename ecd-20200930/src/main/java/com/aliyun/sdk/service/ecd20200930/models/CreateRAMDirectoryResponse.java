// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRAMDirectoryResponse} extends {@link TeaModel}
 *
 * <p>CreateRAMDirectoryResponse</p>
 */
public class CreateRAMDirectoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRAMDirectoryResponseBody body;

    private CreateRAMDirectoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRAMDirectoryResponse create() {
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
    public CreateRAMDirectoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRAMDirectoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRAMDirectoryResponseBody body);

        @Override
        CreateRAMDirectoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRAMDirectoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRAMDirectoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRAMDirectoryResponse response) {
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
        public Builder body(CreateRAMDirectoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRAMDirectoryResponse build() {
            return new CreateRAMDirectoryResponse(this);
        } 

    } 

}
