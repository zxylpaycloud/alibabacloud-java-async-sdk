// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProductOrdersResponse} extends {@link TeaModel}
 *
 * <p>CreateProductOrdersResponse</p>
 */
public class CreateProductOrdersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateProductOrdersResponseBody body;

    private CreateProductOrdersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateProductOrdersResponse create() {
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
    public CreateProductOrdersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateProductOrdersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateProductOrdersResponseBody body);

        @Override
        CreateProductOrdersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateProductOrdersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateProductOrdersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateProductOrdersResponse response) {
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
        public Builder body(CreateProductOrdersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateProductOrdersResponse build() {
            return new CreateProductOrdersResponse(this);
        } 

    } 

}