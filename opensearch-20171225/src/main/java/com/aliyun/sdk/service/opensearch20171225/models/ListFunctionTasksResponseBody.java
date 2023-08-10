// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListFunctionTasksResponseBody</p>
 */
public class ListFunctionTasksResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpCode")
    private Long httpCode;

    @NameInMap("Latency")
    private Long latency;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("Status")
    private String status;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListFunctionTasksResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpCode = builder.httpCode;
        this.latency = builder.latency;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.status = builder.status;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpCode
     */
    public Long getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return latency
     */
    public Long getLatency() {
        return this.latency;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Long httpCode; 
        private Long latency; 
        private String message; 
        private String requestId; 
        private java.util.List < Result> result; 
        private String status; 
        private Long totalCount; 

        /**
         * The error code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpCode(Long httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * The time consumed for the request, in milliseconds.
         */
        public Builder latency(Long latency) {
            this.latency = latency;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * The status of the request.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The total number of records that meet the requirements.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListFunctionTasksResponseBody build() {
            return new ListFunctionTasksResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("ExtendInfo")
        private String extendInfo;

        @NameInMap("FunctionName")
        private String functionName;

        @NameInMap("Generation")
        private String generation;

        @NameInMap("Progress")
        private Long progress;

        @NameInMap("RunId")
        private String runId;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        private Result(Builder builder) {
            this.endTime = builder.endTime;
            this.extendInfo = builder.extendInfo;
            this.functionName = builder.functionName;
            this.generation = builder.generation;
            this.progress = builder.progress;
            this.runId = builder.runId;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return extendInfo
         */
        public String getExtendInfo() {
            return this.extendInfo;
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return generation
         */
        public String getGeneration() {
            return this.generation;
        }

        /**
         * @return progress
         */
        public Long getProgress() {
            return this.progress;
        }

        /**
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long endTime; 
            private String extendInfo; 
            private String functionName; 
            private String generation; 
            private Long progress; 
            private String runId; 
            private Long startTime; 
            private String status; 

            /**
             * The timestamp that indicates the end time. Unit: milliseconds. 0 indicates that the task has not ended.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The value is a JSON string. It includes model evaluation information and training error information.
             */
            public Builder extendInfo(String extendInfo) {
                this.extendInfo = extendInfo;
                return this;
            }

            /**
             * The name of the feature.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * The number of iterations.
             */
            public Builder generation(String generation) {
                this.generation = generation;
                return this;
            }

            /**
             * The progress. 90 indicates 90%.
             */
            public Builder progress(Long progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the task.
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * The timestamp that indicates the start time. Unit: milliseconds.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the task. Valid values:
             * <p>
             * 
             * *   success
             * *   failed
             * *   running
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
