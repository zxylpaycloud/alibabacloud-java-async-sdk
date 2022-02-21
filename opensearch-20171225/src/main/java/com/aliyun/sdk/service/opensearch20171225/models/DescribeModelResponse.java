// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeModelResponse} extends {@link TeaModel}
 *
 * <p>DescribeModelResponse</p>
 */
public class DescribeModelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeModelResponseBody body;

    private DescribeModelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeModelResponse create() {
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
    public DescribeModelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeModelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeModelResponseBody body);

        @Override
        DescribeModelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeModelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeModelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeModelResponse response) {
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
        public Builder body(DescribeModelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeModelResponse build() {
            return new DescribeModelResponse(this);
        } 

    } 

}
