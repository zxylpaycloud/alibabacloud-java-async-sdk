// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSecretResponse} extends {@link TeaModel}
 *
 * <p>CreateSecretResponse</p>
 */
public class CreateSecretResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSecretResponseBody body;

    private CreateSecretResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSecretResponse create() {
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
    public CreateSecretResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSecretResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSecretResponseBody body);

        @Override
        CreateSecretResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSecretResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSecretResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSecretResponse response) {
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
        public Builder body(CreateSecretResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSecretResponse build() {
            return new CreateSecretResponse(this);
        } 

    } 

}
