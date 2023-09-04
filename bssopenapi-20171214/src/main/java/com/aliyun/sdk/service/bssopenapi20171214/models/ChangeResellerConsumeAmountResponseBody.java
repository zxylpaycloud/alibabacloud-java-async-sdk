// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeResellerConsumeAmountResponseBody} extends {@link TeaModel}
 *
 * <p>ChangeResellerConsumeAmountResponseBody</p>
 */
public class ChangeResellerConsumeAmountResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private String data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ChangeResellerConsumeAmountResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeResellerConsumeAmountResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code returned if the call failed. For more information, see the "Error codes" section of the topic.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The consumption quota for the quota ledger after adjustment.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * The message returned.
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
         * Indicates whether the call is successful. A value of true indicates that the call is successful. A value of false indicates that the call failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ChangeResellerConsumeAmountResponseBody build() {
            return new ChangeResellerConsumeAmountResponseBody(this);
        } 

    } 

}
