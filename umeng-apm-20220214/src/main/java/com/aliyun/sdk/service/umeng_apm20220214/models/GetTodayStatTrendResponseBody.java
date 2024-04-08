// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_apm20220214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTodayStatTrendResponseBody} extends {@link TeaModel}
 *
 * <p>GetTodayStatTrendResponseBody</p>
 */
public class GetTodayStatTrendResponseBody extends TeaModel {
    @NameInMap("code")
    private Long code;

    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("msg")
    private String msg;

    @NameInMap("success")
    private Boolean success;

    private GetTodayStatTrendResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTodayStatTrendResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private java.util.List < Data> data; 
        private String msg; 
        private Boolean success; 

        /**
         * code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetTodayStatTrendResponseBody build() {
            return new GetTodayStatTrendResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("affectedUserCount")
        private Long affectedUserCount;

        @NameInMap("affectedUserRate")
        private Long affectedUserRate;

        @NameInMap("errorCount")
        private Long errorCount;

        @NameInMap("errorRate")
        private Long errorRate;

        @NameInMap("timePoint")
        private String timePoint;

        private Data(Builder builder) {
            this.affectedUserCount = builder.affectedUserCount;
            this.affectedUserRate = builder.affectedUserRate;
            this.errorCount = builder.errorCount;
            this.errorRate = builder.errorRate;
            this.timePoint = builder.timePoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return affectedUserCount
         */
        public Long getAffectedUserCount() {
            return this.affectedUserCount;
        }

        /**
         * @return affectedUserRate
         */
        public Long getAffectedUserRate() {
            return this.affectedUserRate;
        }

        /**
         * @return errorCount
         */
        public Long getErrorCount() {
            return this.errorCount;
        }

        /**
         * @return errorRate
         */
        public Long getErrorRate() {
            return this.errorRate;
        }

        /**
         * @return timePoint
         */
        public String getTimePoint() {
            return this.timePoint;
        }

        public static final class Builder {
            private Long affectedUserCount; 
            private Long affectedUserRate; 
            private Long errorCount; 
            private Long errorRate; 
            private String timePoint; 

            /**
             * affectedUserCount.
             */
            public Builder affectedUserCount(Long affectedUserCount) {
                this.affectedUserCount = affectedUserCount;
                return this;
            }

            /**
             * affectedUserRate.
             */
            public Builder affectedUserRate(Long affectedUserRate) {
                this.affectedUserRate = affectedUserRate;
                return this;
            }

            /**
             * errorCount.
             */
            public Builder errorCount(Long errorCount) {
                this.errorCount = errorCount;
                return this;
            }

            /**
             * errorRate.
             */
            public Builder errorRate(Long errorRate) {
                this.errorRate = errorRate;
                return this;
            }

            /**
             * timePoint.
             */
            public Builder timePoint(String timePoint) {
                this.timePoint = timePoint;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
