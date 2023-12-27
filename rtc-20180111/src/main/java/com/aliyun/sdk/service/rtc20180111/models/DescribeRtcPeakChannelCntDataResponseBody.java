// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRtcPeakChannelCntDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRtcPeakChannelCntDataResponseBody</p>
 */
public class DescribeRtcPeakChannelCntDataResponseBody extends TeaModel {
    @NameInMap("PeakChannelCntDataPerInterval")
    private PeakChannelCntDataPerInterval peakChannelCntDataPerInterval;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeRtcPeakChannelCntDataResponseBody(Builder builder) {
        this.peakChannelCntDataPerInterval = builder.peakChannelCntDataPerInterval;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRtcPeakChannelCntDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return peakChannelCntDataPerInterval
     */
    public PeakChannelCntDataPerInterval getPeakChannelCntDataPerInterval() {
        return this.peakChannelCntDataPerInterval;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PeakChannelCntDataPerInterval peakChannelCntDataPerInterval; 
        private String requestId; 

        /**
         * PeakChannelCntDataPerInterval.
         */
        public Builder peakChannelCntDataPerInterval(PeakChannelCntDataPerInterval peakChannelCntDataPerInterval) {
            this.peakChannelCntDataPerInterval = peakChannelCntDataPerInterval;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRtcPeakChannelCntDataResponseBody build() {
            return new DescribeRtcPeakChannelCntDataResponseBody(this);
        } 

    } 

    public static class PeakChannelCntModule extends TeaModel {
        @NameInMap("ActiveChannelPeak")
        private Long activeChannelPeak;

        @NameInMap("ActiveChannelPeakTime")
        private String activeChannelPeakTime;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private PeakChannelCntModule(Builder builder) {
            this.activeChannelPeak = builder.activeChannelPeak;
            this.activeChannelPeakTime = builder.activeChannelPeakTime;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeakChannelCntModule create() {
            return builder().build();
        }

        /**
         * @return activeChannelPeak
         */
        public Long getActiveChannelPeak() {
            return this.activeChannelPeak;
        }

        /**
         * @return activeChannelPeakTime
         */
        public String getActiveChannelPeakTime() {
            return this.activeChannelPeakTime;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Long activeChannelPeak; 
            private String activeChannelPeakTime; 
            private String timeStamp; 

            /**
             * ActiveChannelPeak.
             */
            public Builder activeChannelPeak(Long activeChannelPeak) {
                this.activeChannelPeak = activeChannelPeak;
                return this;
            }

            /**
             * ActiveChannelPeakTime.
             */
            public Builder activeChannelPeakTime(String activeChannelPeakTime) {
                this.activeChannelPeakTime = activeChannelPeakTime;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public PeakChannelCntModule build() {
                return new PeakChannelCntModule(this);
            } 

        } 

    }
    public static class PeakChannelCntDataPerInterval extends TeaModel {
        @NameInMap("PeakChannelCntModule")
        private java.util.List < PeakChannelCntModule> peakChannelCntModule;

        private PeakChannelCntDataPerInterval(Builder builder) {
            this.peakChannelCntModule = builder.peakChannelCntModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PeakChannelCntDataPerInterval create() {
            return builder().build();
        }

        /**
         * @return peakChannelCntModule
         */
        public java.util.List < PeakChannelCntModule> getPeakChannelCntModule() {
            return this.peakChannelCntModule;
        }

        public static final class Builder {
            private java.util.List < PeakChannelCntModule> peakChannelCntModule; 

            /**
             * PeakChannelCntModule.
             */
            public Builder peakChannelCntModule(java.util.List < PeakChannelCntModule> peakChannelCntModule) {
                this.peakChannelCntModule = peakChannelCntModule;
                return this;
            }

            public PeakChannelCntDataPerInterval build() {
                return new PeakChannelCntDataPerInterval(this);
            } 

        } 

    }
}
