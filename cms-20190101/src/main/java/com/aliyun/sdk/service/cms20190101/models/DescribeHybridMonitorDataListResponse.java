// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHybridMonitorDataListResponse} extends {@link TeaModel}
 *
 * <p>DescribeHybridMonitorDataListResponse</p>
 */
public class DescribeHybridMonitorDataListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeHybridMonitorDataListResponseBody body;

    private DescribeHybridMonitorDataListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeHybridMonitorDataListResponse create() {
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
    public DescribeHybridMonitorDataListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHybridMonitorDataListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeHybridMonitorDataListResponseBody body);

        @Override
        DescribeHybridMonitorDataListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHybridMonitorDataListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeHybridMonitorDataListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHybridMonitorDataListResponse response) {
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
        public Builder body(DescribeHybridMonitorDataListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHybridMonitorDataListResponse build() {
            return new DescribeHybridMonitorDataListResponse(this);
        } 

    } 

}