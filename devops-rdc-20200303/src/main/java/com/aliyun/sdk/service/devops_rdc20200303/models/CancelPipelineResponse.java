// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelPipelineResponse} extends {@link TeaModel}
 *
 * <p>CancelPipelineResponse</p>
 */
public class CancelPipelineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelPipelineResponseBody body;

    private CancelPipelineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelPipelineResponse create() {
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
    public CancelPipelineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelPipelineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelPipelineResponseBody body);

        @Override
        CancelPipelineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelPipelineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelPipelineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelPipelineResponse response) {
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
        public Builder body(CancelPipelineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelPipelineResponse build() {
            return new CancelPipelineResponse(this);
        } 

    } 

}
