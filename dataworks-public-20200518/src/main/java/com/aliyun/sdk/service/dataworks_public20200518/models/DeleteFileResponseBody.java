// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFileResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteFileResponseBody</p>
 */
public class DeleteFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeploymentId")
    private Long deploymentId;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DeleteFileResponseBody(Builder builder) {
        this.deploymentId = builder.deploymentId;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFileResponseBody create() {
        return builder().build();
    }

    /**
     * @return deploymentId
     */
    public Long getDeploymentId() {
        return this.deploymentId;
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
        private Long deploymentId; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * The ID of the request. You can troubleshoot errors based on the ID.
         */
        public Builder deploymentId(Long deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   true: The request is successful.
         * *   false: The request fails.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the deployment task that deploys the file. If the file has been committed, an asynchronous process is triggered to delete the file in the scheduling system. The value of this parameter is used to call the GetDeployment operation to poll the status of the asynchronous process.
         * <p>
         * 
         * If this parameter is empty, the file is deleted and the polling is not required.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The error code returned.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteFileResponseBody build() {
            return new DeleteFileResponseBody(this);
        } 

    } 

}
