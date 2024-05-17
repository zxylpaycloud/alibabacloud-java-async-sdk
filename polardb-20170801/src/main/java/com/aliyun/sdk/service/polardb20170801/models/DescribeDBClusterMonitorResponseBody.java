// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterMonitorResponseBody</p>
 */
public class DescribeDBClusterMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterMonitorResponseBody(Builder builder) {
        this.period = builder.period;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterMonitorResponseBody create() {
        return builder().build();
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String period; 
        private String requestId; 

        /**
         * The interval at which monitoring data is collected. Unit: seconds.
         */
        public Builder period(String period) {
            this.period = period;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterMonitorResponseBody build() {
            return new DescribeDBClusterMonitorResponseBody(this);
        } 

    } 

}
