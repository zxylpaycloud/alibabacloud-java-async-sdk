// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitoringAgentAccessKeyResponse} extends {@link TeaModel}
 *
 * <p>DescribeMonitoringAgentAccessKeyResponse</p>
 */
public class DescribeMonitoringAgentAccessKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMonitoringAgentAccessKeyResponseBody body;

    private DescribeMonitoringAgentAccessKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMonitoringAgentAccessKeyResponse create() {
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
    public DescribeMonitoringAgentAccessKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMonitoringAgentAccessKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMonitoringAgentAccessKeyResponseBody body);

        @Override
        DescribeMonitoringAgentAccessKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMonitoringAgentAccessKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMonitoringAgentAccessKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMonitoringAgentAccessKeyResponse response) {
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
        public Builder body(DescribeMonitoringAgentAccessKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMonitoringAgentAccessKeyResponse build() {
            return new DescribeMonitoringAgentAccessKeyResponse(this);
        } 

    } 

}