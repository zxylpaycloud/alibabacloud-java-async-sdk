// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainBpsDataByLayerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainBpsDataByLayerResponseBody</p>
 */
public class DescribeDomainBpsDataByLayerResponseBody extends TeaModel {
    @NameInMap("BpsDataInterval")
    private BpsDataInterval bpsDataInterval;

    @NameInMap("DataInterval")
    private String dataInterval;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDomainBpsDataByLayerResponseBody(Builder builder) {
        this.bpsDataInterval = builder.bpsDataInterval;
        this.dataInterval = builder.dataInterval;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainBpsDataByLayerResponseBody create() {
        return builder().build();
    }

    /**
     * @return bpsDataInterval
     */
    public BpsDataInterval getBpsDataInterval() {
        return this.bpsDataInterval;
    }

    /**
     * @return dataInterval
     */
    public String getDataInterval() {
        return this.dataInterval;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private BpsDataInterval bpsDataInterval; 
        private String dataInterval; 
        private String requestId; 

        /**
         * The data returned at each time interval.
         */
        public Builder bpsDataInterval(BpsDataInterval bpsDataInterval) {
            this.bpsDataInterval = bpsDataInterval;
            return this;
        }

        /**
         * The time interval between the data entries. Unit: seconds.
         */
        public Builder dataInterval(String dataInterval) {
            this.dataInterval = dataInterval;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainBpsDataByLayerResponseBody build() {
            return new DescribeDomainBpsDataByLayerResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @NameInMap("TimeStamp")
        private String timeStamp;

        @NameInMap("TrafficValue")
        private String trafficValue;

        @NameInMap("Value")
        private String value;

        private DataModule(Builder builder) {
            this.timeStamp = builder.timeStamp;
            this.trafficValue = builder.trafficValue;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        /**
         * @return trafficValue
         */
        public String getTrafficValue() {
            return this.trafficValue;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String timeStamp; 
            private String trafficValue; 
            private String value; 

            /**
             * The timestamp of the returned data.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            /**
             * The total amount of network traffic. Unit: bytes.
             */
            public Builder trafficValue(String trafficValue) {
                this.trafficValue = trafficValue;
                return this;
            }

            /**
             * The peak bandwidth value. Unit: bit/s.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
    public static class BpsDataInterval extends TeaModel {
        @NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private BpsDataInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BpsDataInterval create() {
            return builder().build();
        }

        /**
         * @return dataModule
         */
        public java.util.List < DataModule> getDataModule() {
            return this.dataModule;
        }

        public static final class Builder {
            private java.util.List < DataModule> dataModule; 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List < DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public BpsDataInterval build() {
                return new BpsDataInterval(this);
            } 

        } 

    }
}
