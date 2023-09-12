// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateModelVersionResponse} extends {@link TeaModel}
 *
 * <p>CreateModelVersionResponse</p>
 */
public class CreateModelVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateModelVersionResponseBody body;

    private CreateModelVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateModelVersionResponse create() {
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
    public CreateModelVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateModelVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateModelVersionResponseBody body);

        @Override
        CreateModelVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateModelVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateModelVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateModelVersionResponse response) {
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
        public Builder body(CreateModelVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateModelVersionResponse build() {
            return new CreateModelVersionResponse(this);
        } 

    } 

}