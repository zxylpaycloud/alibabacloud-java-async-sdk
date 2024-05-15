// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVpcFirewallDefaultIPSConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyVpcFirewallDefaultIPSConfigResponseBody</p>
 */
public class ModifyVpcFirewallDefaultIPSConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyVpcFirewallDefaultIPSConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpcFirewallDefaultIPSConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyVpcFirewallDefaultIPSConfigResponseBody build() {
            return new ModifyVpcFirewallDefaultIPSConfigResponseBody(this);
        } 

    } 

}
