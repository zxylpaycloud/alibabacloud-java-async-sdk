// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateRepoTriggerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRepoTriggerResponseBody</p>
 */
public class CreateRepoTriggerResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TriggerId")
    private String triggerId;


    private CreateRepoTriggerResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
        this.triggerId = builder.triggerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoTriggerResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return triggerId
     */
    public String getTriggerId() {
        return this.triggerId;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 
        private String triggerId; 

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Successful</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Trigger ID</p>
         */
        public Builder triggerId(String triggerId) {
            this.triggerId = triggerId;
            return this;
        }

        public CreateRepoTriggerResponseBody build() {
            return new CreateRepoTriggerResponseBody(this);
        } 

    } 

}
