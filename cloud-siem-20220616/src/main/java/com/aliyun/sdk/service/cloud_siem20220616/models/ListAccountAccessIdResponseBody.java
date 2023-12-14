// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccountAccessIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccountAccessIdResponseBody</p>
 */
public class ListAccountAccessIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListAccountAccessIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccountAccessIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
        private Integer code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAccountAccessIdResponseBody build() {
            return new ListAccountAccessIdResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AccessId")
        private String accessId;

        @NameInMap("AccessIdMd5")
        private String accessIdMd5;

        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("AccountStr")
        private String accountStr;

        @NameInMap("Bound")
        private Integer bound;

        @NameInMap("CloudCode")
        private String cloudCode;

        @NameInMap("SubUserId")
        private Long subUserId;

        private Data(Builder builder) {
            this.accessId = builder.accessId;
            this.accessIdMd5 = builder.accessIdMd5;
            this.accountId = builder.accountId;
            this.accountStr = builder.accountStr;
            this.bound = builder.bound;
            this.cloudCode = builder.cloudCode;
            this.subUserId = builder.subUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessId
         */
        public String getAccessId() {
            return this.accessId;
        }

        /**
         * @return accessIdMd5
         */
        public String getAccessIdMd5() {
            return this.accessIdMd5;
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountStr
         */
        public String getAccountStr() {
            return this.accountStr;
        }

        /**
         * @return bound
         */
        public Integer getBound() {
            return this.bound;
        }

        /**
         * @return cloudCode
         */
        public String getCloudCode() {
            return this.cloudCode;
        }

        /**
         * @return subUserId
         */
        public Long getSubUserId() {
            return this.subUserId;
        }

        public static final class Builder {
            private String accessId; 
            private String accessIdMd5; 
            private String accountId; 
            private String accountStr; 
            private Integer bound; 
            private String cloudCode; 
            private Long subUserId; 

            /**
             * AccessId.
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * AccessIdMd5.
             */
            public Builder accessIdMd5(String accessIdMd5) {
                this.accessIdMd5 = accessIdMd5;
                return this;
            }

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * AccountStr.
             */
            public Builder accountStr(String accountStr) {
                this.accountStr = accountStr;
                return this;
            }

            /**
             * Bound.
             */
            public Builder bound(Integer bound) {
                this.bound = bound;
                return this;
            }

            /**
             * CloudCode.
             */
            public Builder cloudCode(String cloudCode) {
                this.cloudCode = cloudCode;
                return this;
            }

            /**
             * SubUserId.
             */
            public Builder subUserId(Long subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
