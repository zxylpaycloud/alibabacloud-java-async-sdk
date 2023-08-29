// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSubCACertificateResponse} extends {@link TeaModel}
 *
 * <p>CreateSubCACertificateResponse</p>
 */
public class CreateSubCACertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSubCACertificateResponseBody body;

    private CreateSubCACertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSubCACertificateResponse create() {
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
    public CreateSubCACertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSubCACertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSubCACertificateResponseBody body);

        @Override
        CreateSubCACertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSubCACertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSubCACertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSubCACertificateResponse response) {
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
        public Builder body(CreateSubCACertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSubCACertificateResponse build() {
            return new CreateSubCACertificateResponse(this);
        } 

    } 

}