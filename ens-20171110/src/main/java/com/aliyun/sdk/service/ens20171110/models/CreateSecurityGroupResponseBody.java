// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSecurityGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSecurityGroupResponseBody</p>
 */
public class CreateSecurityGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    private String securityGroupId;

    private CreateSecurityGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityGroupId = builder.securityGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecurityGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public static final class Builder {
        private String requestId; 
        private String securityGroupId; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the security group.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        public CreateSecurityGroupResponseBody build() {
            return new CreateSecurityGroupResponseBody(this);
        } 

    } 

}
