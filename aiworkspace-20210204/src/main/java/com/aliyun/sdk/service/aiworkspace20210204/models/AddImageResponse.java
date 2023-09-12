// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddImageResponse} extends {@link TeaModel}
 *
 * <p>AddImageResponse</p>
 */
public class AddImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddImageResponseBody body;

    private AddImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddImageResponse create() {
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
    public AddImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddImageResponseBody body);

        @Override
        AddImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddImageResponse response) {
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
        public Builder body(AddImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddImageResponse build() {
            return new AddImageResponse(this);
        } 

    } 

}