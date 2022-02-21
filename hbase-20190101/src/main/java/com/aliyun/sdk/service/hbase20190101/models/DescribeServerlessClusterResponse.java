// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServerlessClusterResponse} extends {@link TeaModel}
 *
 * <p>DescribeServerlessClusterResponse</p>
 */
public class DescribeServerlessClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeServerlessClusterResponseBody body;

    private DescribeServerlessClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeServerlessClusterResponse create() {
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
    public DescribeServerlessClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeServerlessClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeServerlessClusterResponseBody body);

        @Override
        DescribeServerlessClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeServerlessClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeServerlessClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeServerlessClusterResponse response) {
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
        public Builder body(DescribeServerlessClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeServerlessClusterResponse build() {
            return new DescribeServerlessClusterResponse(this);
        } 

    } 

}
