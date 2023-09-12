// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDatasetLabelsResponse} extends {@link TeaModel}
 *
 * <p>CreateDatasetLabelsResponse</p>
 */
public class CreateDatasetLabelsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDatasetLabelsResponseBody body;

    private CreateDatasetLabelsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDatasetLabelsResponse create() {
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
    public CreateDatasetLabelsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDatasetLabelsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDatasetLabelsResponseBody body);

        @Override
        CreateDatasetLabelsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDatasetLabelsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDatasetLabelsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDatasetLabelsResponse response) {
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
        public Builder body(CreateDatasetLabelsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDatasetLabelsResponse build() {
            return new CreateDatasetLabelsResponse(this);
        } 

    } 

}