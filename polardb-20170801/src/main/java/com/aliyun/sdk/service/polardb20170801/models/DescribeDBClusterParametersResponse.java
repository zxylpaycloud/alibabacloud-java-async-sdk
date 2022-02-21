// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterParametersResponse} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterParametersResponse</p>
 */
public class DescribeDBClusterParametersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDBClusterParametersResponseBody body;

    private DescribeDBClusterParametersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDBClusterParametersResponse create() {
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
    public DescribeDBClusterParametersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDBClusterParametersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDBClusterParametersResponseBody body);

        @Override
        DescribeDBClusterParametersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDBClusterParametersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDBClusterParametersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDBClusterParametersResponse response) {
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
        public Builder body(DescribeDBClusterParametersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDBClusterParametersResponse build() {
            return new DescribeDBClusterParametersResponse(this);
        } 

    } 

}
