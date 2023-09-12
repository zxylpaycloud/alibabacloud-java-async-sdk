// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteClientKeyResponse} extends {@link TeaModel}
 *
 * <p>DeleteClientKeyResponse</p>
 */
public class DeleteClientKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteClientKeyResponseBody body;

    private DeleteClientKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteClientKeyResponse create() {
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
    public DeleteClientKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteClientKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteClientKeyResponseBody body);

        @Override
        DeleteClientKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteClientKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteClientKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteClientKeyResponse response) {
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
        public Builder body(DeleteClientKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteClientKeyResponse build() {
            return new DeleteClientKeyResponse(this);
        } 

    } 

}