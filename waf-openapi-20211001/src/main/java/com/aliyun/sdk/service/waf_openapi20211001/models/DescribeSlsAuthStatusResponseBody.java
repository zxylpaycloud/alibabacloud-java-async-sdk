// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlsAuthStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlsAuthStatusResponseBody</p>
 */
public class DescribeSlsAuthStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private Boolean status;

    private DescribeSlsAuthStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlsAuthStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean status; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether WAF is authorized to access Logstores. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder status(Boolean status) {
            this.status = status;
            return this;
        }

        public DescribeSlsAuthStatusResponseBody build() {
            return new DescribeSlsAuthStatusResponseBody(this);
        } 

    } 

}
