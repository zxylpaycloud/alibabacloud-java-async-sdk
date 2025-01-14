// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSensitiveDefineRuleConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetSensitiveDefineRuleConfigResponseBody</p>
 */
public class GetSensitiveDefineRuleConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSensitiveDefineRuleConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSensitiveDefineRuleConfigResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSensitiveDefineRuleConfigResponseBody build() {
            return new GetSensitiveDefineRuleConfigResponseBody(this);
        } 

    } 

    public static class RuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleKey")
        private String ruleKey;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Selected")
        private Boolean selected;

        private RuleList(Builder builder) {
            this.ruleKey = builder.ruleKey;
            this.ruleName = builder.ruleName;
            this.selected = builder.selected;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleList create() {
            return builder().build();
        }

        /**
         * @return ruleKey
         */
        public String getRuleKey() {
            return this.ruleKey;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return selected
         */
        public Boolean getSelected() {
            return this.selected;
        }

        public static final class Builder {
            private String ruleKey; 
            private String ruleName; 
            private Boolean selected; 

            /**
             * The keyword of the check rule.
             */
            public Builder ruleKey(String ruleKey) {
                this.ruleKey = ruleKey;
                return this;
            }

            /**
             * The name of the check rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * Indicates whether the check rule is selected. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder selected(Boolean selected) {
                this.selected = selected;
                return this;
            }

            public RuleList build() {
                return new RuleList(this);
            } 

        } 

    }
    public static class RuleTree extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassKey")
        private String classKey;

        @com.aliyun.core.annotation.NameInMap("ClassName")
        private String className;

        @com.aliyun.core.annotation.NameInMap("RuleList")
        private java.util.List < RuleList> ruleList;

        private RuleTree(Builder builder) {
            this.classKey = builder.classKey;
            this.className = builder.className;
            this.ruleList = builder.ruleList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleTree create() {
            return builder().build();
        }

        /**
         * @return classKey
         */
        public String getClassKey() {
            return this.classKey;
        }

        /**
         * @return className
         */
        public String getClassName() {
            return this.className;
        }

        /**
         * @return ruleList
         */
        public java.util.List < RuleList> getRuleList() {
            return this.ruleList;
        }

        public static final class Builder {
            private String classKey; 
            private String className; 
            private java.util.List < RuleList> ruleList; 

            /**
             * The category keyword of the check rule.
             */
            public Builder classKey(String classKey) {
                this.classKey = classKey;
                return this;
            }

            /**
             * The category name of the check rule.
             */
            public Builder className(String className) {
                this.className = className;
                return this;
            }

            /**
             * The list of check rules.
             */
            public Builder ruleList(java.util.List < RuleList> ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            public RuleTree build() {
                return new RuleTree(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("RuleCount")
        private Integer ruleCount;

        @com.aliyun.core.annotation.NameInMap("RuleTree")
        private java.util.List < RuleTree> ruleTree;

        @com.aliyun.core.annotation.NameInMap("SelectedCount")
        private Integer selectedCount;

        private Data(Builder builder) {
            this.id = builder.id;
            this.ruleCount = builder.ruleCount;
            this.ruleTree = builder.ruleTree;
            this.selectedCount = builder.selectedCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ruleCount
         */
        public Integer getRuleCount() {
            return this.ruleCount;
        }

        /**
         * @return ruleTree
         */
        public java.util.List < RuleTree> getRuleTree() {
            return this.ruleTree;
        }

        /**
         * @return selectedCount
         */
        public Integer getSelectedCount() {
            return this.selectedCount;
        }

        public static final class Builder {
            private Long id; 
            private Integer ruleCount; 
            private java.util.List < RuleTree> ruleTree; 
            private Integer selectedCount; 

            /**
             * The custom configuration ID.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The total number of check rules.
             */
            public Builder ruleCount(Integer ruleCount) {
                this.ruleCount = ruleCount;
                return this;
            }

            /**
             * The tree of the check rules.
             */
            public Builder ruleTree(java.util.List < RuleTree> ruleTree) {
                this.ruleTree = ruleTree;
                return this;
            }

            /**
             * The number of selected check rules.
             */
            public Builder selectedCount(Integer selectedCount) {
                this.selectedCount = selectedCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
