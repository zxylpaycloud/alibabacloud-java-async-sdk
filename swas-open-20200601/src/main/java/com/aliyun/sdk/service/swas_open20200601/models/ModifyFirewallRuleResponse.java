// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFirewallRuleResponse} extends {@link TeaModel}
 *
 * <p>ModifyFirewallRuleResponse</p>
 */
public class ModifyFirewallRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyFirewallRuleResponseBody body;

    private ModifyFirewallRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyFirewallRuleResponse create() {
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
    public ModifyFirewallRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyFirewallRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyFirewallRuleResponseBody body);

        @Override
        ModifyFirewallRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyFirewallRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyFirewallRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyFirewallRuleResponse response) {
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
        public Builder body(ModifyFirewallRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyFirewallRuleResponse build() {
            return new ModifyFirewallRuleResponse(this);
        } 

    } 

}