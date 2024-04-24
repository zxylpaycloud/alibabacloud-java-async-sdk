// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpcinstant20230701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobMetricDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeJobMetricDataResponseBody</p>
 */
public class DescribeJobMetricDataResponseBody extends TeaModel {
    @NameInMap("DataPoints")
    private String dataPoints;

    @NameInMap("Period")
    private Integer period;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeJobMetricDataResponseBody(Builder builder) {
        this.dataPoints = builder.dataPoints;
        this.period = builder.period;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobMetricDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataPoints
     */
    public String getDataPoints() {
        return this.dataPoints;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dataPoints; 
        private Integer period; 
        private String requestId; 

        /**
         * DataPoints.
         */
        public Builder dataPoints(String dataPoints) {
            this.dataPoints = dataPoints;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.period = period;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeJobMetricDataResponseBody build() {
            return new DescribeJobMetricDataResponseBody(this);
        } 

    } 

}
