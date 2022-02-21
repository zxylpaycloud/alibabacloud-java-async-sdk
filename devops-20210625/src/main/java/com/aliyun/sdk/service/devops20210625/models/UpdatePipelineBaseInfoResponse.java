// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePipelineBaseInfoResponse} extends {@link TeaModel}
 *
 * <p>UpdatePipelineBaseInfoResponse</p>
 */
public class UpdatePipelineBaseInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdatePipelineBaseInfoResponseBody body;

    private UpdatePipelineBaseInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdatePipelineBaseInfoResponse create() {
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
    public UpdatePipelineBaseInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePipelineBaseInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdatePipelineBaseInfoResponseBody body);

        @Override
        UpdatePipelineBaseInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePipelineBaseInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdatePipelineBaseInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePipelineBaseInfoResponse response) {
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
        public Builder body(UpdatePipelineBaseInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePipelineBaseInfoResponse build() {
            return new UpdatePipelineBaseInfoResponse(this);
        } 

    } 

}
