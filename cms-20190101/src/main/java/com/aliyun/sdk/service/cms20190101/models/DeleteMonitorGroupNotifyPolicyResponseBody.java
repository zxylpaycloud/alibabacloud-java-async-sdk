// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMonitorGroupNotifyPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteMonitorGroupNotifyPolicyResponseBody</p>
 */
public class DeleteMonitorGroupNotifyPolicyResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Integer result;

    @NameInMap("Success")
    private String success;

    private DeleteMonitorGroupNotifyPolicyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMonitorGroupNotifyPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
    public Integer getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Integer result; 
        private String success; 

        /**
         * The ID of the request.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **DeleteMonitorGroupNotifyPolicy**.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Result.
         */
        public Builder result(Integer result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DeleteMonitorGroupNotifyPolicyResponseBody build() {
            return new DeleteMonitorGroupNotifyPolicyResponseBody(this);
        } 

    } 

}