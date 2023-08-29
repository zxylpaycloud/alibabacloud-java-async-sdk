// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcFirewallDefaultIPSConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallDefaultIPSConfigResponse</p>
 */
public class DescribeVpcFirewallDefaultIPSConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVpcFirewallDefaultIPSConfigResponseBody body;

    private DescribeVpcFirewallDefaultIPSConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVpcFirewallDefaultIPSConfigResponse create() {
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
    public DescribeVpcFirewallDefaultIPSConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVpcFirewallDefaultIPSConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVpcFirewallDefaultIPSConfigResponseBody body);

        @Override
        DescribeVpcFirewallDefaultIPSConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVpcFirewallDefaultIPSConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVpcFirewallDefaultIPSConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVpcFirewallDefaultIPSConfigResponse response) {
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
        public Builder body(DescribeVpcFirewallDefaultIPSConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVpcFirewallDefaultIPSConfigResponse build() {
            return new DescribeVpcFirewallDefaultIPSConfigResponse(this);
        } 

    } 

}