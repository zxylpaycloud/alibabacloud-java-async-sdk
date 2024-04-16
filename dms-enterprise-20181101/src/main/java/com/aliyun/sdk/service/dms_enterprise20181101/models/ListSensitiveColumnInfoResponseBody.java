// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSensitiveColumnInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListSensitiveColumnInfoResponseBody</p>
 */
public class ListSensitiveColumnInfoResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SensitiveColumnList")
    private SensitiveColumnList sensitiveColumnList;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListSensitiveColumnInfoResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.sensitiveColumnList = builder.sensitiveColumnList;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSensitiveColumnInfoResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sensitiveColumnList
     */
    public SensitiveColumnList getSensitiveColumnList() {
        return this.sensitiveColumnList;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private SensitiveColumnList sensitiveColumnList; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * SensitiveColumnList.
         */
        public Builder sensitiveColumnList(SensitiveColumnList sensitiveColumnList) {
            this.sensitiveColumnList = sensitiveColumnList;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSensitiveColumnInfoResponseBody build() {
            return new ListSensitiveColumnInfoResponseBody(this);
        } 

    } 

    public static class DefaultDesensitizationRule extends TeaModel {
        @NameInMap("RuleId")
        private Long ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        private DefaultDesensitizationRule(Builder builder) {
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultDesensitizationRule create() {
            return builder().build();
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private Long ruleId; 
            private String ruleName; 

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public DefaultDesensitizationRule build() {
                return new DefaultDesensitizationRule(this);
            } 

        } 

    }
    public static class SemiDesensitizationRule extends TeaModel {
        @NameInMap("RuleId")
        private Long ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        private SemiDesensitizationRule(Builder builder) {
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SemiDesensitizationRule create() {
            return builder().build();
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private Long ruleId; 
            private String ruleName; 

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public SemiDesensitizationRule build() {
                return new SemiDesensitizationRule(this);
            } 

        } 

    }
    public static class SemiDesensitizationRuleList extends TeaModel {
        @NameInMap("SemiDesensitizationRule")
        private java.util.List < SemiDesensitizationRule> semiDesensitizationRule;

        private SemiDesensitizationRuleList(Builder builder) {
            this.semiDesensitizationRule = builder.semiDesensitizationRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SemiDesensitizationRuleList create() {
            return builder().build();
        }

        /**
         * @return semiDesensitizationRule
         */
        public java.util.List < SemiDesensitizationRule> getSemiDesensitizationRule() {
            return this.semiDesensitizationRule;
        }

        public static final class Builder {
            private java.util.List < SemiDesensitizationRule> semiDesensitizationRule; 

            /**
             * SemiDesensitizationRule.
             */
            public Builder semiDesensitizationRule(java.util.List < SemiDesensitizationRule> semiDesensitizationRule) {
                this.semiDesensitizationRule = semiDesensitizationRule;
                return this;
            }

            public SemiDesensitizationRuleList build() {
                return new SemiDesensitizationRuleList(this);
            } 

        } 

    }
    public static class SensitiveColumn extends TeaModel {
        @NameInMap("CategoryName")
        private String categoryName;

        @NameInMap("ColumnName")
        private String columnName;

        @NameInMap("DefaultDesensitizationRule")
        private DefaultDesensitizationRule defaultDesensitizationRule;

        @NameInMap("InstanceId")
        private Integer instanceId;

        @NameInMap("IsPlain")
        private Boolean isPlain;

        @NameInMap("SampleData")
        private String sampleData;

        @NameInMap("SchemaName")
        private String schemaName;

        @NameInMap("SecurityLevel")
        private String securityLevel;

        @NameInMap("SemiDesensitizationRuleList")
        private SemiDesensitizationRuleList semiDesensitizationRuleList;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("UserSensitivityLevel")
        private String userSensitivityLevel;

        private SensitiveColumn(Builder builder) {
            this.categoryName = builder.categoryName;
            this.columnName = builder.columnName;
            this.defaultDesensitizationRule = builder.defaultDesensitizationRule;
            this.instanceId = builder.instanceId;
            this.isPlain = builder.isPlain;
            this.sampleData = builder.sampleData;
            this.schemaName = builder.schemaName;
            this.securityLevel = builder.securityLevel;
            this.semiDesensitizationRuleList = builder.semiDesensitizationRuleList;
            this.tableName = builder.tableName;
            this.userSensitivityLevel = builder.userSensitivityLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveColumn create() {
            return builder().build();
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return defaultDesensitizationRule
         */
        public DefaultDesensitizationRule getDefaultDesensitizationRule() {
            return this.defaultDesensitizationRule;
        }

        /**
         * @return instanceId
         */
        public Integer getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return isPlain
         */
        public Boolean getIsPlain() {
            return this.isPlain;
        }

        /**
         * @return sampleData
         */
        public String getSampleData() {
            return this.sampleData;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return securityLevel
         */
        public String getSecurityLevel() {
            return this.securityLevel;
        }

        /**
         * @return semiDesensitizationRuleList
         */
        public SemiDesensitizationRuleList getSemiDesensitizationRuleList() {
            return this.semiDesensitizationRuleList;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return userSensitivityLevel
         */
        public String getUserSensitivityLevel() {
            return this.userSensitivityLevel;
        }

        public static final class Builder {
            private String categoryName; 
            private String columnName; 
            private DefaultDesensitizationRule defaultDesensitizationRule; 
            private Integer instanceId; 
            private Boolean isPlain; 
            private String sampleData; 
            private String schemaName; 
            private String securityLevel; 
            private SemiDesensitizationRuleList semiDesensitizationRuleList; 
            private String tableName; 
            private String userSensitivityLevel; 

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * ColumnName.
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * DefaultDesensitizationRule.
             */
            public Builder defaultDesensitizationRule(DefaultDesensitizationRule defaultDesensitizationRule) {
                this.defaultDesensitizationRule = defaultDesensitizationRule;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(Integer instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * IsPlain.
             */
            public Builder isPlain(Boolean isPlain) {
                this.isPlain = isPlain;
                return this;
            }

            /**
             * SampleData.
             */
            public Builder sampleData(String sampleData) {
                this.sampleData = sampleData;
                return this;
            }

            /**
             * SchemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * SecurityLevel.
             */
            public Builder securityLevel(String securityLevel) {
                this.securityLevel = securityLevel;
                return this;
            }

            /**
             * SemiDesensitizationRuleList.
             */
            public Builder semiDesensitizationRuleList(SemiDesensitizationRuleList semiDesensitizationRuleList) {
                this.semiDesensitizationRuleList = semiDesensitizationRuleList;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * UserSensitivityLevel.
             */
            public Builder userSensitivityLevel(String userSensitivityLevel) {
                this.userSensitivityLevel = userSensitivityLevel;
                return this;
            }

            public SensitiveColumn build() {
                return new SensitiveColumn(this);
            } 

        } 

    }
    public static class SensitiveColumnList extends TeaModel {
        @NameInMap("SensitiveColumn")
        private java.util.List < SensitiveColumn> sensitiveColumn;

        private SensitiveColumnList(Builder builder) {
            this.sensitiveColumn = builder.sensitiveColumn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveColumnList create() {
            return builder().build();
        }

        /**
         * @return sensitiveColumn
         */
        public java.util.List < SensitiveColumn> getSensitiveColumn() {
            return this.sensitiveColumn;
        }

        public static final class Builder {
            private java.util.List < SensitiveColumn> sensitiveColumn; 

            /**
             * SensitiveColumn.
             */
            public Builder sensitiveColumn(java.util.List < SensitiveColumn> sensitiveColumn) {
                this.sensitiveColumn = sensitiveColumn;
                return this;
            }

            public SensitiveColumnList build() {
                return new SensitiveColumnList(this);
            } 

        } 

    }
}
