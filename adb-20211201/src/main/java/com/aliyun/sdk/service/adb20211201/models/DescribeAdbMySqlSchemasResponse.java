// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAdbMySqlSchemasResponse} extends {@link TeaModel}
 *
 * <p>DescribeAdbMySqlSchemasResponse</p>
 */
public class DescribeAdbMySqlSchemasResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAdbMySqlSchemasResponseBody body;

    private DescribeAdbMySqlSchemasResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAdbMySqlSchemasResponse create() {
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
    public DescribeAdbMySqlSchemasResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAdbMySqlSchemasResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAdbMySqlSchemasResponseBody body);

        @Override
        DescribeAdbMySqlSchemasResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAdbMySqlSchemasResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAdbMySqlSchemasResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAdbMySqlSchemasResponse response) {
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
        public Builder body(DescribeAdbMySqlSchemasResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAdbMySqlSchemasResponse build() {
            return new DescribeAdbMySqlSchemasResponse(this);
        } 

    } 

}