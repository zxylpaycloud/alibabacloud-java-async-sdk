// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQualityRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityRuleResponseBody</p>
 */
public class GetQualityRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

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

    private GetQualityRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * The information of the monitoring rule.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetQualityRuleResponseBody build() {
            return new GetQualityRuleResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockType")
        private Integer blockType;

        @com.aliyun.core.annotation.NameInMap("Checker")
        private Integer checker;

        @com.aliyun.core.annotation.NameInMap("CheckerName")
        private String checkerName;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CriticalThreshold")
        private String criticalThreshold;

        @com.aliyun.core.annotation.NameInMap("EntityId")
        private Long entityId;

        @com.aliyun.core.annotation.NameInMap("ExpectValue")
        private String expectValue;

        @com.aliyun.core.annotation.NameInMap("FixCheck")
        private Boolean fixCheck;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MethodId")
        private Integer methodId;

        @com.aliyun.core.annotation.NameInMap("MethodName")
        private String methodName;

        @com.aliyun.core.annotation.NameInMap("OnDuty")
        private String onDuty;

        @com.aliyun.core.annotation.NameInMap("OnDutyAccountName")
        private String onDutyAccountName;

        @com.aliyun.core.annotation.NameInMap("OpenSwitch")
        private Boolean openSwitch;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("PredictType")
        private Integer predictType;

        @com.aliyun.core.annotation.NameInMap("Property")
        private String property;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private Integer ruleType;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Integer templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("Trend")
        private String trend;

        @com.aliyun.core.annotation.NameInMap("WarningThreshold")
        private String warningThreshold;

        @com.aliyun.core.annotation.NameInMap("WhereCondition")
        private String whereCondition;

        private Data(Builder builder) {
            this.blockType = builder.blockType;
            this.checker = builder.checker;
            this.checkerName = builder.checkerName;
            this.comment = builder.comment;
            this.criticalThreshold = builder.criticalThreshold;
            this.entityId = builder.entityId;
            this.expectValue = builder.expectValue;
            this.fixCheck = builder.fixCheck;
            this.id = builder.id;
            this.methodId = builder.methodId;
            this.methodName = builder.methodName;
            this.onDuty = builder.onDuty;
            this.onDutyAccountName = builder.onDutyAccountName;
            this.openSwitch = builder.openSwitch;
            this.operator = builder.operator;
            this.predictType = builder.predictType;
            this.property = builder.property;
            this.ruleName = builder.ruleName;
            this.ruleType = builder.ruleType;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.trend = builder.trend;
            this.warningThreshold = builder.warningThreshold;
            this.whereCondition = builder.whereCondition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return blockType
         */
        public Integer getBlockType() {
            return this.blockType;
        }

        /**
         * @return checker
         */
        public Integer getChecker() {
            return this.checker;
        }

        /**
         * @return checkerName
         */
        public String getCheckerName() {
            return this.checkerName;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return criticalThreshold
         */
        public String getCriticalThreshold() {
            return this.criticalThreshold;
        }

        /**
         * @return entityId
         */
        public Long getEntityId() {
            return this.entityId;
        }

        /**
         * @return expectValue
         */
        public String getExpectValue() {
            return this.expectValue;
        }

        /**
         * @return fixCheck
         */
        public Boolean getFixCheck() {
            return this.fixCheck;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return methodId
         */
        public Integer getMethodId() {
            return this.methodId;
        }

        /**
         * @return methodName
         */
        public String getMethodName() {
            return this.methodName;
        }

        /**
         * @return onDuty
         */
        public String getOnDuty() {
            return this.onDuty;
        }

        /**
         * @return onDutyAccountName
         */
        public String getOnDutyAccountName() {
            return this.onDutyAccountName;
        }

        /**
         * @return openSwitch
         */
        public Boolean getOpenSwitch() {
            return this.openSwitch;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return predictType
         */
        public Integer getPredictType() {
            return this.predictType;
        }

        /**
         * @return property
         */
        public String getProperty() {
            return this.property;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleType
         */
        public Integer getRuleType() {
            return this.ruleType;
        }

        /**
         * @return templateId
         */
        public Integer getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return trend
         */
        public String getTrend() {
            return this.trend;
        }

        /**
         * @return warningThreshold
         */
        public String getWarningThreshold() {
            return this.warningThreshold;
        }

        /**
         * @return whereCondition
         */
        public String getWhereCondition() {
            return this.whereCondition;
        }

        public static final class Builder {
            private Integer blockType; 
            private Integer checker; 
            private String checkerName; 
            private String comment; 
            private String criticalThreshold; 
            private Long entityId; 
            private String expectValue; 
            private Boolean fixCheck; 
            private Long id; 
            private Integer methodId; 
            private String methodName; 
            private String onDuty; 
            private String onDutyAccountName; 
            private Boolean openSwitch; 
            private String operator; 
            private Integer predictType; 
            private String property; 
            private String ruleName; 
            private Integer ruleType; 
            private Integer templateId; 
            private String templateName; 
            private String trend; 
            private String warningThreshold; 
            private String whereCondition; 

            /**
             * The strength of the monitoring rule. The strength of a monitoring rule indicates the importance of the rule. Valid values:
             * <p>
             * 
             * *   1: indicates that the monitoring rule is a strong rule.
             * 
             * *   0: indicates that the monitoring rule is a weak rule.
             * 
             *     You can specify whether a monitoring rule is a strong rule based on your business requirements. If a strong rule is used and an error alert is triggered, nodes are blocked.
             */
            public Builder blockType(Integer blockType) {
                this.blockType = blockType;
                return this;
            }

            /**
             * The ID of the checker. The value of this parameter corresponds to the ID at the frontend and is converted from the ID of the primary key.
             */
            public Builder checker(Integer checker) {
                this.checker = checker;
                return this;
            }

            /**
             * The name of the checker.
             */
            public Builder checkerName(String checkerName) {
                this.checkerName = checkerName;
                return this;
            }

            /**
             * The description of the monitoring rule.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The threshold for an error alert. The threshold indicates the deviation of the monitoring result from the expected value. You can customize this threshold based on your business requirements. If a strong rule is used and an error alert is triggered, nodes are blocked.
             */
            public Builder criticalThreshold(String criticalThreshold) {
                this.criticalThreshold = criticalThreshold;
                return this;
            }

            /**
             * The ID of the partition filter expression.
             */
            public Builder entityId(Long entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * The expected value.
             */
            public Builder expectValue(String expectValue) {
                this.expectValue = expectValue;
                return this;
            }

            /**
             * Indicates whether the monitoring is performed based on a fixed value.
             */
            public Builder fixCheck(Boolean fixCheck) {
                this.fixCheck = fixCheck;
                return this;
            }

            /**
             * The ID of the monitoring rule.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the sampling method of the monitoring rule.
             */
            public Builder methodId(Integer methodId) {
                this.methodId = methodId;
                return this;
            }

            /**
             * The name of the method that is used to collect sample data, such as avg, count, sum, min, max, count_distinct, user_defined, table_count, table_size, table_dt_load_count, table_dt_refuseload_count, null_value, null_value/table_count, (table_count-count_distinct)/table_count, or table_count-count_distinct.
             */
            public Builder methodName(String methodName) {
                this.methodName = methodName;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to configure the monitoring rule.
             */
            public Builder onDuty(String onDuty) {
                this.onDuty = onDuty;
                return this;
            }

            /**
             * The name of the Alibaba Cloud account that is used to configure the monitoring rule.
             */
            public Builder onDutyAccountName(String onDutyAccountName) {
                this.onDutyAccountName = onDutyAccountName;
                return this;
            }

            /**
             * OpenSwitch.
             */
            public Builder openSwitch(Boolean openSwitch) {
                this.openSwitch = openSwitch;
                return this;
            }

            /**
             * The comparison operator of the monitoring rule.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Indicates whether the threshold is a dynamic threshold. Valid values:
             * <p>
             * 
             * *   0: The threshold is not a dynamic threshold.
             * *   1: The threshold is a dynamic threshold.
             */
            public Builder predictType(Integer predictType) {
                this.predictType = predictType;
                return this;
            }

            /**
             * The field that is monitored. This field is a column name in the data source table that is monitored.
             */
            public Builder property(String property) {
                this.property = property;
                return this;
            }

            /**
             * The name of the monitoring rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The type of the monitoring rule.
             */
            public Builder ruleType(Integer ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * The ID of the monitoring template.
             */
            public Builder templateId(Integer templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * The name of the monitoring template.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * The trend of the monitoring result.
             */
            public Builder trend(String trend) {
                this.trend = trend;
                return this;
            }

            /**
             * The threshold for a warning alert. The threshold indicates the deviation of the monitoring result from the expected value. You can customize this threshold based on your business requirements.
             */
            public Builder warningThreshold(String warningThreshold) {
                this.warningThreshold = warningThreshold;
                return this;
            }

            /**
             * The filter condition or custom SQL statement that is used for monitoring.
             */
            public Builder whereCondition(String whereCondition) {
                this.whereCondition = whereCondition;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
