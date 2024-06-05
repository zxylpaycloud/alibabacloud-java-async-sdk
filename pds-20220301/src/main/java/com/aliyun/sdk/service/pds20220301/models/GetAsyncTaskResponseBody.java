// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAsyncTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetAsyncTaskResponseBody</p>
 */
public class GetAsyncTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("async_task_id")
    private String asyncTaskId;

    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("consumed_process")
    private Long consumedProcess;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("err_code")
    private Long errCode;

    @com.aliyun.core.annotation.NameInMap("error_code")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("error_message")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("failed_process")
    private Long failedProcess;

    @com.aliyun.core.annotation.NameInMap("finished_at")
    private String finishedAt;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("skipped_process")
    private Long skippedProcess;

    @com.aliyun.core.annotation.NameInMap("started_at")
    private String startedAt;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("total_process")
    private Long totalProcess;

    @com.aliyun.core.annotation.NameInMap("uncompress_file_list")
    private java.util.List < UncompressedFileInfo > uncompressFileList;

    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    private GetAsyncTaskResponseBody(Builder builder) {
        this.asyncTaskId = builder.asyncTaskId;
        this.category = builder.category;
        this.consumedProcess = builder.consumedProcess;
        this.createdAt = builder.createdAt;
        this.errCode = builder.errCode;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.failedProcess = builder.failedProcess;
        this.finishedAt = builder.finishedAt;
        this.message = builder.message;
        this.skippedProcess = builder.skippedProcess;
        this.startedAt = builder.startedAt;
        this.state = builder.state;
        this.status = builder.status;
        this.totalProcess = builder.totalProcess;
        this.uncompressFileList = builder.uncompressFileList;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAsyncTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return asyncTaskId
     */
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return consumedProcess
     */
    public Long getConsumedProcess() {
        return this.consumedProcess;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return errCode
     */
    public Long getErrCode() {
        return this.errCode;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return failedProcess
     */
    public Long getFailedProcess() {
        return this.failedProcess;
    }

    /**
     * @return finishedAt
     */
    public String getFinishedAt() {
        return this.finishedAt;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return skippedProcess
     */
    public Long getSkippedProcess() {
        return this.skippedProcess;
    }

    /**
     * @return startedAt
     */
    public String getStartedAt() {
        return this.startedAt;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalProcess
     */
    public Long getTotalProcess() {
        return this.totalProcess;
    }

    /**
     * @return uncompressFileList
     */
    public java.util.List < UncompressedFileInfo > getUncompressFileList() {
        return this.uncompressFileList;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String asyncTaskId; 
        private String category; 
        private Long consumedProcess; 
        private String createdAt; 
        private Long errCode; 
        private String errorCode; 
        private String errorMessage; 
        private Long failedProcess; 
        private String finishedAt; 
        private String message; 
        private Long skippedProcess; 
        private String startedAt; 
        private String state; 
        private String status; 
        private Long totalProcess; 
        private java.util.List < UncompressedFileInfo > uncompressFileList; 
        private String url; 

        /**
         * The ID of the asynchronous task.
         */
        public Builder asyncTaskId(String asyncTaskId) {
            this.asyncTaskId = asyncTaskId;
            return this;
        }

        /**
         * The custom category of the task.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * The total amount of work that is done in the asynchronous task, such as the number of files that are packaged for package download on the server.
         */
        public Builder consumedProcess(Long consumedProcess) {
            this.consumedProcess = consumedProcess;
            return this;
        }

        /**
         * The time when the task was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. Example: 2019-03-28T13:03:29.298Z.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <warning>This parameter is no longer used. We recommend that you use error_code instead.</warning>
         * <p>
         * 
         * The error code returned if the asynchronous task failed.
         */
        public Builder errCode(Long errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The error code returned if the asynchronous task failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the asynchronous task failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * failed_process.
         */
        public Builder failedProcess(Long failedProcess) {
            this.failedProcess = failedProcess;
            return this;
        }

        /**
         * The time when the task was complete. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. Example: 2019-03-28T13:03:29.298Z.
         */
        public Builder finishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }

        /**
         * <warning>This parameter is no longer used. We recommend that you use error_message instead.</warning>
         * <p>
         * 
         * The error message returned if the asynchronous task failed.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * skipped_process.
         */
        public Builder skippedProcess(Long skippedProcess) {
            this.skippedProcess = skippedProcess;
            return this;
        }

        /**
         * The time when the task was started. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. Example: 2019-03-28T13:03:29.298Z.
         */
        public Builder startedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
         * The state of the task. Valid values:
         * <p>
         * 
         * *   Failed
         * *   Running
         * *   PartialSucceed
         * *   Succeed
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <warning>This parameter is no longer used. We recommend that you use state instead.</warning>
         * <p>
         * 
         * The state of the task. Valid values:
         * 
         * *   Failed
         * *   Running
         * *   PartialSucceed
         * *   Succeed
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The total amount of work to be done in the asynchronous task, such as the number of files to be packaged for package download on the server.
         */
        public Builder totalProcess(Long totalProcess) {
            this.totalProcess = totalProcess;
            return this;
        }

        /**
         * The extracted files.
         */
        public Builder uncompressFileList(java.util.List < UncompressedFileInfo > uncompressFileList) {
            this.uncompressFileList = uncompressFileList;
            return this;
        }

        /**
         * The download URL of the data generated by the asynchronous task, such as the download URL of the packaged files generated by the task of package download on the server.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public GetAsyncTaskResponseBody build() {
            return new GetAsyncTaskResponseBody(this);
        } 

    } 

}
