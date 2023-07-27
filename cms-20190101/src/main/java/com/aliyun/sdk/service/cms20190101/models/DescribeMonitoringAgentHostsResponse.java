// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitoringAgentHostsResponse} extends {@link TeaModel}
 *
 * <p>DescribeMonitoringAgentHostsResponse</p>
 */
public class DescribeMonitoringAgentHostsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMonitoringAgentHostsResponseBody body;

    private DescribeMonitoringAgentHostsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMonitoringAgentHostsResponse create() {
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
    public DescribeMonitoringAgentHostsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMonitoringAgentHostsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMonitoringAgentHostsResponseBody body);

        @Override
        DescribeMonitoringAgentHostsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMonitoringAgentHostsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMonitoringAgentHostsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMonitoringAgentHostsResponse response) {
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
        public Builder body(DescribeMonitoringAgentHostsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMonitoringAgentHostsResponse build() {
            return new DescribeMonitoringAgentHostsResponse(this);
        } 

    } 

}