// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ActiveAggregateConfigRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ActiveAggregateConfigRulesResponseBody</p>
 */
public class ActiveAggregateConfigRulesResponseBody extends TeaModel {
    @NameInMap("OperateRuleResult")
    private OperateRuleResult operateRuleResult;

    @NameInMap("RequestId")
    private String requestId;

    private ActiveAggregateConfigRulesResponseBody(Builder builder) {
        this.operateRuleResult = builder.operateRuleResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActiveAggregateConfigRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return operateRuleResult
     */
    public OperateRuleResult getOperateRuleResult() {
        return this.operateRuleResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OperateRuleResult operateRuleResult; 
        private String requestId; 

        /**
         * The returned result.
         */
        public Builder operateRuleResult(OperateRuleResult operateRuleResult) {
            this.operateRuleResult = operateRuleResult;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ActiveAggregateConfigRulesResponseBody build() {
            return new ActiveAggregateConfigRulesResponseBody(this);
        } 

    } 

    public static class OperateRuleItemList extends TeaModel {
        @NameInMap("ConfigRuleId")
        private String configRuleId;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("Success")
        private Boolean success;

        private OperateRuleItemList(Builder builder) {
            this.configRuleId = builder.configRuleId;
            this.errorCode = builder.errorCode;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperateRuleItemList create() {
            return builder().build();
        }

        /**
         * @return configRuleId
         */
        public String getConfigRuleId() {
            return this.configRuleId;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String configRuleId; 
            private String errorCode; 
            private Boolean success; 

            /**
             * The rule ID.
             */
            public Builder configRuleId(String configRuleId) {
                this.configRuleId = configRuleId;
                return this;
            }

            /**
             * The error code returned.
             * <p>
             * 
             * *   If the rule is enabled, no error code is returned.
             * *   If the rule fails to be enabled, an error code is returned. For more information about error codes, see [Error codes](https://error-center.alibabacloud.com/status/product/Config).
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * Indicates whether the request was successful. Valid values:
             * <p>
             * 
             * *   true: The request was successful.
             * *   false: The request failed.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public OperateRuleItemList build() {
                return new OperateRuleItemList(this);
            } 

        } 

    }
    public static class OperateRuleResult extends TeaModel {
        @NameInMap("OperateRuleItemList")
        private java.util.List < OperateRuleItemList> operateRuleItemList;

        private OperateRuleResult(Builder builder) {
            this.operateRuleItemList = builder.operateRuleItemList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperateRuleResult create() {
            return builder().build();
        }

        /**
         * @return operateRuleItemList
         */
        public java.util.List < OperateRuleItemList> getOperateRuleItemList() {
            return this.operateRuleItemList;
        }

        public static final class Builder {
            private java.util.List < OperateRuleItemList> operateRuleItemList; 

            /**
             * The returned result.
             */
            public Builder operateRuleItemList(java.util.List < OperateRuleItemList> operateRuleItemList) {
                this.operateRuleItemList = operateRuleItemList;
                return this;
            }

            public OperateRuleResult build() {
                return new OperateRuleResult(this);
            } 

        } 

    }
}
