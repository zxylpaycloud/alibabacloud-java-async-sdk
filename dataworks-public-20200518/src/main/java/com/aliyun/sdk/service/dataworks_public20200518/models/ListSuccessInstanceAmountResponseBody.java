// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSuccessInstanceAmountResponseBody} extends {@link TeaModel}
 *
 * <p>ListSuccessInstanceAmountResponseBody</p>
 */
public class ListSuccessInstanceAmountResponseBody extends TeaModel {
    @NameInMap("InstanceStatusTrend")
    private InstanceStatusTrend instanceStatusTrend;

    @NameInMap("RequestId")
    private String requestId;

    private ListSuccessInstanceAmountResponseBody(Builder builder) {
        this.instanceStatusTrend = builder.instanceStatusTrend;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSuccessInstanceAmountResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceStatusTrend
     */
    public InstanceStatusTrend getInstanceStatusTrend() {
        return this.instanceStatusTrend;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceStatusTrend instanceStatusTrend; 
        private String requestId; 

        /**
         * InstanceStatusTrend.
         */
        public Builder instanceStatusTrend(InstanceStatusTrend instanceStatusTrend) {
            this.instanceStatusTrend = instanceStatusTrend;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSuccessInstanceAmountResponseBody build() {
            return new ListSuccessInstanceAmountResponseBody(this);
        } 

    } 

    public static class AvgTrend extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("TimePoint")
        private String timePoint;

        private AvgTrend(Builder builder) {
            this.count = builder.count;
            this.timePoint = builder.timePoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvgTrend create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return timePoint
         */
        public String getTimePoint() {
            return this.timePoint;
        }

        public static final class Builder {
            private Integer count; 
            private String timePoint; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * TimePoint.
             */
            public Builder timePoint(String timePoint) {
                this.timePoint = timePoint;
                return this;
            }

            public AvgTrend build() {
                return new AvgTrend(this);
            } 

        } 

    }
    public static class TodayTrend extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("TimePoint")
        private String timePoint;

        private TodayTrend(Builder builder) {
            this.count = builder.count;
            this.timePoint = builder.timePoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TodayTrend create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return timePoint
         */
        public String getTimePoint() {
            return this.timePoint;
        }

        public static final class Builder {
            private Integer count; 
            private String timePoint; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * TimePoint.
             */
            public Builder timePoint(String timePoint) {
                this.timePoint = timePoint;
                return this;
            }

            public TodayTrend build() {
                return new TodayTrend(this);
            } 

        } 

    }
    public static class YesterdayTrend extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("TimePoint")
        private String timePoint;

        private YesterdayTrend(Builder builder) {
            this.count = builder.count;
            this.timePoint = builder.timePoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static YesterdayTrend create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return timePoint
         */
        public String getTimePoint() {
            return this.timePoint;
        }

        public static final class Builder {
            private Integer count; 
            private String timePoint; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * TimePoint.
             */
            public Builder timePoint(String timePoint) {
                this.timePoint = timePoint;
                return this;
            }

            public YesterdayTrend build() {
                return new YesterdayTrend(this);
            } 

        } 

    }
    public static class InstanceStatusTrend extends TeaModel {
        @NameInMap("AvgTrend")
        private java.util.List < AvgTrend> avgTrend;

        @NameInMap("TodayTrend")
        private java.util.List < TodayTrend> todayTrend;

        @NameInMap("YesterdayTrend")
        private java.util.List < YesterdayTrend> yesterdayTrend;

        private InstanceStatusTrend(Builder builder) {
            this.avgTrend = builder.avgTrend;
            this.todayTrend = builder.todayTrend;
            this.yesterdayTrend = builder.yesterdayTrend;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceStatusTrend create() {
            return builder().build();
        }

        /**
         * @return avgTrend
         */
        public java.util.List < AvgTrend> getAvgTrend() {
            return this.avgTrend;
        }

        /**
         * @return todayTrend
         */
        public java.util.List < TodayTrend> getTodayTrend() {
            return this.todayTrend;
        }

        /**
         * @return yesterdayTrend
         */
        public java.util.List < YesterdayTrend> getYesterdayTrend() {
            return this.yesterdayTrend;
        }

        public static final class Builder {
            private java.util.List < AvgTrend> avgTrend; 
            private java.util.List < TodayTrend> todayTrend; 
            private java.util.List < YesterdayTrend> yesterdayTrend; 

            /**
             * AvgTrend.
             */
            public Builder avgTrend(java.util.List < AvgTrend> avgTrend) {
                this.avgTrend = avgTrend;
                return this;
            }

            /**
             * TodayTrend.
             */
            public Builder todayTrend(java.util.List < TodayTrend> todayTrend) {
                this.todayTrend = todayTrend;
                return this;
            }

            /**
             * YesterdayTrend.
             */
            public Builder yesterdayTrend(java.util.List < YesterdayTrend> yesterdayTrend) {
                this.yesterdayTrend = yesterdayTrend;
                return this;
            }

            public InstanceStatusTrend build() {
                return new InstanceStatusTrend(this);
            } 

        } 

    }
}
