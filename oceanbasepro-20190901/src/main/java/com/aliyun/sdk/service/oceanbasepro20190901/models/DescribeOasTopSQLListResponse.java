// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOasTopSQLListResponse} extends {@link TeaModel}
 *
 * <p>DescribeOasTopSQLListResponse</p>
 */
public class DescribeOasTopSQLListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeOasTopSQLListResponseBody body;

    private DescribeOasTopSQLListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeOasTopSQLListResponse create() {
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
    public DescribeOasTopSQLListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeOasTopSQLListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeOasTopSQLListResponseBody body);

        @Override
        DescribeOasTopSQLListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeOasTopSQLListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeOasTopSQLListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeOasTopSQLListResponse response) {
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
        public Builder body(DescribeOasTopSQLListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeOasTopSQLListResponse build() {
            return new DescribeOasTopSQLListResponse(this);
        } 

    } 

}