// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProjectResponse} extends {@link TeaModel}
 *
 * <p>CreateProjectResponse</p>
 */
public class CreateProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateProjectResponseBody body;

    private CreateProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateProjectResponse create() {
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
    public CreateProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateProjectResponseBody body);

        @Override
        CreateProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateProjectResponse response) {
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
        public Builder body(CreateProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateProjectResponse build() {
            return new CreateProjectResponse(this);
        } 

    } 

}