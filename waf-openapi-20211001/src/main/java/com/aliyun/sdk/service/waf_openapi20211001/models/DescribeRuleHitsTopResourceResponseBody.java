// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleHitsTopResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRuleHitsTopResourceResponseBody</p>
 */
public class DescribeRuleHitsTopResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleHitsTopResource")
    private java.util.List < RuleHitsTopResource> ruleHitsTopResource;

    private DescribeRuleHitsTopResourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleHitsTopResource = builder.ruleHitsTopResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRuleHitsTopResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleHitsTopResource
     */
    public java.util.List < RuleHitsTopResource> getRuleHitsTopResource() {
        return this.ruleHitsTopResource;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RuleHitsTopResource> ruleHitsTopResource; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The array of the top 10 protected objects that trigger protection rules.
         */
        public Builder ruleHitsTopResource(java.util.List < RuleHitsTopResource> ruleHitsTopResource) {
            this.ruleHitsTopResource = ruleHitsTopResource;
            return this;
        }

        public DescribeRuleHitsTopResourceResponseBody build() {
            return new DescribeRuleHitsTopResourceResponseBody(this);
        } 

    } 

    public static class RuleHitsTopResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        private RuleHitsTopResource(Builder builder) {
            this.count = builder.count;
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleHitsTopResource create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        public static final class Builder {
            private Long count; 
            private String resource; 

            /**
             * The number of requests that match protection rules.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * The protected object.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            public RuleHitsTopResource build() {
                return new RuleHitsTopResource(this);
            } 

        } 

    }
}
