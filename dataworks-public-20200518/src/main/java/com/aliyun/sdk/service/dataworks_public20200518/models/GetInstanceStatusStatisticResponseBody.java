// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceStatusStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceStatusStatisticResponseBody</p>
 */
public class GetInstanceStatusStatisticResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StatusCount")
    private StatusCount statusCount;

    private GetInstanceStatusStatisticResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statusCount = builder.statusCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceStatusStatisticResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statusCount
     */
    public StatusCount getStatusCount() {
        return this.statusCount;
    }

    public static final class Builder {
        private String requestId; 
        private StatusCount statusCount; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StatusCount.
         */
        public Builder statusCount(StatusCount statusCount) {
            this.statusCount = statusCount;
            return this;
        }

        public GetInstanceStatusStatisticResponseBody build() {
            return new GetInstanceStatusStatisticResponseBody(this);
        } 

    } 

    public static class StatusCount extends TeaModel {
        @NameInMap("FailureCount")
        private Integer failureCount;

        @NameInMap("NotRunCount")
        private Integer notRunCount;

        @NameInMap("RunningCount")
        private Integer runningCount;

        @NameInMap("SuccessCount")
        private Integer successCount;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("WaitResCount")
        private Integer waitResCount;

        @NameInMap("WaitTimeCount")
        private Integer waitTimeCount;

        private StatusCount(Builder builder) {
            this.failureCount = builder.failureCount;
            this.notRunCount = builder.notRunCount;
            this.runningCount = builder.runningCount;
            this.successCount = builder.successCount;
            this.totalCount = builder.totalCount;
            this.waitResCount = builder.waitResCount;
            this.waitTimeCount = builder.waitTimeCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatusCount create() {
            return builder().build();
        }

        /**
         * @return failureCount
         */
        public Integer getFailureCount() {
            return this.failureCount;
        }

        /**
         * @return notRunCount
         */
        public Integer getNotRunCount() {
            return this.notRunCount;
        }

        /**
         * @return runningCount
         */
        public Integer getRunningCount() {
            return this.runningCount;
        }

        /**
         * @return successCount
         */
        public Integer getSuccessCount() {
            return this.successCount;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return waitResCount
         */
        public Integer getWaitResCount() {
            return this.waitResCount;
        }

        /**
         * @return waitTimeCount
         */
        public Integer getWaitTimeCount() {
            return this.waitTimeCount;
        }

        public static final class Builder {
            private Integer failureCount; 
            private Integer notRunCount; 
            private Integer runningCount; 
            private Integer successCount; 
            private Integer totalCount; 
            private Integer waitResCount; 
            private Integer waitTimeCount; 

            /**
             * FailureCount.
             */
            public Builder failureCount(Integer failureCount) {
                this.failureCount = failureCount;
                return this;
            }

            /**
             * NotRunCount.
             */
            public Builder notRunCount(Integer notRunCount) {
                this.notRunCount = notRunCount;
                return this;
            }

            /**
             * RunningCount.
             */
            public Builder runningCount(Integer runningCount) {
                this.runningCount = runningCount;
                return this;
            }

            /**
             * SuccessCount.
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * WaitResCount.
             */
            public Builder waitResCount(Integer waitResCount) {
                this.waitResCount = waitResCount;
                return this;
            }

            /**
             * WaitTimeCount.
             */
            public Builder waitTimeCount(Integer waitTimeCount) {
                this.waitTimeCount = waitTimeCount;
                return this;
            }

            public StatusCount build() {
                return new StatusCount(this);
            } 

        } 

    }
}
