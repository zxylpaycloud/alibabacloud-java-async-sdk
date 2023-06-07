// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityAgentStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityAgentStatusResponseBody</p>
 */
public class DescribeSecurityAgentStatusResponseBody extends TeaModel {
    @NameInMap("ClientStatus")
    private String clientStatus;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeSecurityAgentStatusResponseBody(Builder builder) {
        this.clientStatus = builder.clientStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityAgentStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return clientStatus
     */
    public String getClientStatus() {
        return this.clientStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clientStatus; 
        private String requestId; 

        /**
         * ClientStatus.
         */
        public Builder clientStatus(String clientStatus) {
            this.clientStatus = clientStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSecurityAgentStatusResponseBody build() {
            return new DescribeSecurityAgentStatusResponseBody(this);
        } 

    } 

}
