// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBandwitdhByInternetChargeTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBandwitdhByInternetChargeTypeResponseBody</p>
 */
public class DescribeBandwitdhByInternetChargeTypeResponseBody extends TeaModel {
    @NameInMap("BandwidthValue")
    private Long bandwidthValue;

    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TimeStamp")
    private String timeStamp;

    private DescribeBandwitdhByInternetChargeTypeResponseBody(Builder builder) {
        this.bandwidthValue = builder.bandwidthValue;
        this.internetChargeType = builder.internetChargeType;
        this.requestId = builder.requestId;
        this.timeStamp = builder.timeStamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBandwitdhByInternetChargeTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return bandwidthValue
     */
    public Long getBandwidthValue() {
        return this.bandwidthValue;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timeStamp
     */
    public String getTimeStamp() {
        return this.timeStamp;
    }

    public static final class Builder {
        private Long bandwidthValue; 
        private String internetChargeType; 
        private String requestId; 
        private String timeStamp; 

        /**
         * The bandwidth. Unit: bit/s.
         */
        public Builder bandwidthValue(Long bandwidthValue) {
            this.bandwidthValue = bandwidthValue;
            return this;
        }

        /**
         * The metering method. Valid values:
         * <p>
         * 
         * *   BandwidthByDay: Pay by daily peak bandwidth
         * *   95BandwidthByMonth: Pay by monthly 95th percentile bandwidth
         * *   PayByBandwidth4thMonth: Pay by monthly fourth peak bandwidth
         * *   PayByBandwidth: Pay by fixed bandwidth
         * 
         * You can specify only one metering method for network usage and cannot overwrite the existing metering method.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use the ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The timestamp. The time follows the ISO 8601 standard. The time is displayed in UTC. Example: 2016-10-20T04:00:00Z.
         */
        public Builder timeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }

        public DescribeBandwitdhByInternetChargeTypeResponseBody build() {
            return new DescribeBandwitdhByInternetChargeTypeResponseBody(this);
        } 

    } 

}
