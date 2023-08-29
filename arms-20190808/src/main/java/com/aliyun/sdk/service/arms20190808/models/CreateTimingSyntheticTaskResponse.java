// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTimingSyntheticTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateTimingSyntheticTaskResponse</p>
 */
public class CreateTimingSyntheticTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTimingSyntheticTaskResponseBody body;

    private CreateTimingSyntheticTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTimingSyntheticTaskResponse create() {
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
    public CreateTimingSyntheticTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTimingSyntheticTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTimingSyntheticTaskResponseBody body);

        @Override
        CreateTimingSyntheticTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTimingSyntheticTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTimingSyntheticTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTimingSyntheticTaskResponse response) {
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
        public Builder body(CreateTimingSyntheticTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTimingSyntheticTaskResponse build() {
            return new CreateTimingSyntheticTaskResponse(this);
        } 

    } 

}