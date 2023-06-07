// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableFirewallRuleResponse} extends {@link TeaModel}
 *
 * <p>DisableFirewallRuleResponse</p>
 */
public class DisableFirewallRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableFirewallRuleResponseBody body;

    private DisableFirewallRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableFirewallRuleResponse create() {
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
    public DisableFirewallRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableFirewallRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableFirewallRuleResponseBody body);

        @Override
        DisableFirewallRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableFirewallRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableFirewallRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableFirewallRuleResponse response) {
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
        public Builder body(DisableFirewallRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableFirewallRuleResponse build() {
            return new DisableFirewallRuleResponse(this);
        } 

    } 

}
