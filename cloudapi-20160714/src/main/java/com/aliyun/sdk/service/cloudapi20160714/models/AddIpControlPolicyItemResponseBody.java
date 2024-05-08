// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddIpControlPolicyItemResponseBody} extends {@link TeaModel}
 *
 * <p>AddIpControlPolicyItemResponseBody</p>
 */
public class AddIpControlPolicyItemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PolicyItemId")
    private String policyItemId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddIpControlPolicyItemResponseBody(Builder builder) {
        this.policyItemId = builder.policyItemId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddIpControlPolicyItemResponseBody create() {
        return builder().build();
    }

    /**
     * @return policyItemId
     */
    public String getPolicyItemId() {
        return this.policyItemId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String policyItemId; 
        private String requestId; 

        /**
         * The ID of the policy. The ID is unique.
         */
        public Builder policyItemId(String policyItemId) {
            this.policyItemId = policyItemId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddIpControlPolicyItemResponseBody build() {
            return new AddIpControlPolicyItemResponseBody(this);
        } 

    } 

}
