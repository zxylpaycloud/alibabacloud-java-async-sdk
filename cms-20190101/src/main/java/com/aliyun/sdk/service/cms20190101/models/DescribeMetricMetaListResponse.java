// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricMetaListResponse} extends {@link TeaModel}
 *
 * <p>DescribeMetricMetaListResponse</p>
 */
public class DescribeMetricMetaListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMetricMetaListResponseBody body;

    private DescribeMetricMetaListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMetricMetaListResponse create() {
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
    public DescribeMetricMetaListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMetricMetaListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMetricMetaListResponseBody body);

        @Override
        DescribeMetricMetaListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMetricMetaListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMetricMetaListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMetricMetaListResponse response) {
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
        public Builder body(DescribeMetricMetaListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMetricMetaListResponse build() {
            return new DescribeMetricMetaListResponse(this);
        } 

    } 

}