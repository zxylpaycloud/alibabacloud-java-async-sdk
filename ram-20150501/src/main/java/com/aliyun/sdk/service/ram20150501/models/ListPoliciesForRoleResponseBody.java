// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPoliciesForRoleResponseBody} extends {@link TeaModel}
 *
 * <p>ListPoliciesForRoleResponseBody</p>
 */
public class ListPoliciesForRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Policies")
    private Policies policies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPoliciesForRoleResponseBody(Builder builder) {
        this.policies = builder.policies;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPoliciesForRoleResponseBody create() {
        return builder().build();
    }

    /**
     * @return policies
     */
    public Policies getPolicies() {
        return this.policies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Policies policies; 
        private String requestId; 

        /**
         * The list of the policies that are attached to the RAM role.
         */
        public Builder policies(Policies policies) {
            this.policies = policies;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPoliciesForRoleResponseBody build() {
            return new ListPoliciesForRoleResponseBody(this);
        } 

    } 

    public static class Policy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachDate")
        private String attachDate;

        @com.aliyun.core.annotation.NameInMap("DefaultVersion")
        private String defaultVersion;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        private Policy(Builder builder) {
            this.attachDate = builder.attachDate;
            this.defaultVersion = builder.defaultVersion;
            this.description = builder.description;
            this.policyName = builder.policyName;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policy create() {
            return builder().build();
        }

        /**
         * @return attachDate
         */
        public String getAttachDate() {
            return this.attachDate;
        }

        /**
         * @return defaultVersion
         */
        public String getDefaultVersion() {
            return this.defaultVersion;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private String attachDate; 
            private String defaultVersion; 
            private String description; 
            private String policyName; 
            private String policyType; 

            /**
             * The time when the policy was attached to the RAM role.
             */
            public Builder attachDate(String attachDate) {
                this.attachDate = attachDate;
                return this;
            }

            /**
             * The default version of the policy.
             */
            public Builder defaultVersion(String defaultVersion) {
                this.defaultVersion = defaultVersion;
                return this;
            }

            /**
             * The description of the policy.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the policy.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * The type of the policy.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Policy")
        private java.util.List < Policy> policy;

        private Policies(Builder builder) {
            this.policy = builder.policy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return policy
         */
        public java.util.List < Policy> getPolicy() {
            return this.policy;
        }

        public static final class Builder {
            private java.util.List < Policy> policy; 

            /**
             * Policy.
             */
            public Builder policy(java.util.List < Policy> policy) {
                this.policy = policy;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
}
