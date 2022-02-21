// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIncrementBackupSetDownloadResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIncrementBackupSetDownloadResponseBody</p>
 */
public class CreateIncrementBackupSetDownloadResponseBody extends TeaModel {
    @NameInMap("BackupSetDownloadTaskId")
    private String backupSetDownloadTaskId;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateIncrementBackupSetDownloadResponseBody(Builder builder) {
        this.backupSetDownloadTaskId = builder.backupSetDownloadTaskId;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIncrementBackupSetDownloadResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupSetDownloadTaskId
     */
    public String getBackupSetDownloadTaskId() {
        return this.backupSetDownloadTaskId;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String backupSetDownloadTaskId; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * BackupSetDownloadTaskId.
         */
        public Builder backupSetDownloadTaskId(String backupSetDownloadTaskId) {
            this.backupSetDownloadTaskId = backupSetDownloadTaskId;
            return this;
        }

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateIncrementBackupSetDownloadResponseBody build() {
            return new CreateIncrementBackupSetDownloadResponseBody(this);
        } 

    } 

}
