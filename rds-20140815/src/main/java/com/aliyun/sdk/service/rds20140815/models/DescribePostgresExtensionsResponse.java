// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePostgresExtensionsResponse} extends {@link TeaModel}
 *
 * <p>DescribePostgresExtensionsResponse</p>
 */
public class DescribePostgresExtensionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePostgresExtensionsResponseBody body;

    private DescribePostgresExtensionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePostgresExtensionsResponse create() {
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
    public DescribePostgresExtensionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePostgresExtensionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePostgresExtensionsResponseBody body);

        @Override
        DescribePostgresExtensionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePostgresExtensionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePostgresExtensionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePostgresExtensionsResponse response) {
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
        public Builder body(DescribePostgresExtensionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePostgresExtensionsResponse build() {
            return new DescribePostgresExtensionsResponse(this);
        } 

    } 

}