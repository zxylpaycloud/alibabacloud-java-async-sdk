// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartPipelineRunResponseBody} extends {@link TeaModel}
 *
 * <p>StartPipelineRunResponseBody</p>
 */
public class StartPipelineRunResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("pipelineRunId")
    private Long pipelineRunId;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private StartPipelineRunResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.pipelineRunId = builder.pipelineRunId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartPipelineRunResponseBody create() {
        return builder().build();
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
     * @return pipelineRunId
     */
    public Long getPipelineRunId() {
        return this.pipelineRunId;
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
        private String errorCode; 
        private String errorMessage; 
        private Long pipelineRunId; 
        private String requestId; 
        private Boolean success; 

        /**
         * 错误码
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 流水线运行实例id
         */
        public Builder pipelineRunId(Long pipelineRunId) {
            this.pipelineRunId = pipelineRunId;
            return this;
        }

        /**
         * 请求id，每次请求都是唯一值，便于后续排查问题
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * true 接口调用成功，false 接口调用失败
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public StartPipelineRunResponseBody build() {
            return new StartPipelineRunResponseBody(this);
        } 

    } 

}
