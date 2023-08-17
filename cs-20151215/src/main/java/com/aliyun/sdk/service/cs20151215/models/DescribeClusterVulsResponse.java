// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterVulsResponse} extends {@link TeaModel}
 *
 * <p>DescribeClusterVulsResponse</p>
 */
public class DescribeClusterVulsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeClusterVulsResponseBody body;

    private DescribeClusterVulsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeClusterVulsResponse create() {
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
    public DescribeClusterVulsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeClusterVulsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeClusterVulsResponseBody body);

        @Override
        DescribeClusterVulsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeClusterVulsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeClusterVulsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeClusterVulsResponse response) {
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
        public Builder body(DescribeClusterVulsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeClusterVulsResponse build() {
            return new DescribeClusterVulsResponse(this);
        } 

    } 

}