// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLastOnceTaskInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetLastOnceTaskInfoResponseBody</p>
 */
public class GetLastOnceTaskInfoResponseBody extends TeaModel {
    @NameInMap("CollectTime")
    private Long collectTime;

    @NameInMap("FinishCount")
    private Integer finishCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskId")
    private Long taskId;

    @NameInMap("TaskInfo")
    private TaskInfo taskInfo;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private GetLastOnceTaskInfoResponseBody(Builder builder) {
        this.collectTime = builder.collectTime;
        this.finishCount = builder.finishCount;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
        this.taskInfo = builder.taskInfo;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLastOnceTaskInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return collectTime
     */
    public Long getCollectTime() {
        return this.collectTime;
    }

    /**
     * @return finishCount
     */
    public Integer getFinishCount() {
        return this.finishCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskInfo
     */
    public TaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long collectTime; 
        private Integer finishCount; 
        private String requestId; 
        private Long taskId; 
        private TaskInfo taskInfo; 
        private Integer totalCount; 

        /**
         * The time at which the task was run.
         */
        public Builder collectTime(Long collectTime) {
            this.collectTime = collectTime;
            return this;
        }

        /**
         * The number of tasks that have been completed.
         */
        public Builder finishCount(Integer finishCount) {
            this.finishCount = finishCount;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the latest scan task.
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * The information about the latest task.
         */
        public Builder taskInfo(TaskInfo taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetLastOnceTaskInfoResponseBody build() {
            return new GetLastOnceTaskInfoResponseBody(this);
        } 

    } 

    public static class TaskInfo extends TeaModel {
        @NameInMap("Progress")
        private Integer progress;

        @NameInMap("Result")
        private String result;

        @NameInMap("Status")
        private String status;

        private TaskInfo(Builder builder) {
            this.progress = builder.progress;
            this.result = builder.result;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInfo create() {
            return builder().build();
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer progress; 
            private String result; 
            private String status; 

            /**
             * The progress of the task in percentage.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The result of the scan task. Valid values:
             * <p>
             * 
             * *   **SUCCESS**: The task is successful.
             * *   **TASK\_NOT\_SUPPORT_REGION**: The images are deployed in a region that is not supported by container image scan.
             * *   **TASK\_NOT_EXISTS**: The task does not exist.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * The status of the task. Valid values:
             * <p>
             * 
             * *   **INIT**: The task is not started.
             * *   **START**: The task is started.
             * *   **SUCCESS**: The task is complete.
             * *   **TIMEOUT**: The task timed out.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public TaskInfo build() {
                return new TaskInfo(this);
            } 

        } 

    }
}
