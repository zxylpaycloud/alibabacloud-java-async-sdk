// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrafficMarkingPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrafficMarkingPoliciesResponseBody</p>
 */
public class ListTrafficMarkingPoliciesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("TrafficMarkingPolicies")
    private java.util.List < TrafficMarkingPolicies> trafficMarkingPolicies;

    private ListTrafficMarkingPoliciesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.trafficMarkingPolicies = builder.trafficMarkingPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrafficMarkingPoliciesResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return trafficMarkingPolicies
     */
    public java.util.List < TrafficMarkingPolicies> getTrafficMarkingPolicies() {
        return this.trafficMarkingPolicies;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < TrafficMarkingPolicies> trafficMarkingPolicies; 

        /**
         * The number of entries returned on each page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that determines the start point of the query.
         * <p>
         * 
         * *   If **NextToken** was not returned in the previous query, it indicates that no additional results exist.
         * *   If **NextToken** was returned in the previous query, specify the value to obtain the next set of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The list of traffic marking policies.
         */
        public Builder trafficMarkingPolicies(java.util.List < TrafficMarkingPolicies> trafficMarkingPolicies) {
            this.trafficMarkingPolicies = trafficMarkingPolicies;
            return this;
        }

        public ListTrafficMarkingPoliciesResponseBody build() {
            return new ListTrafficMarkingPoliciesResponseBody(this);
        } 

    } 

    public static class TrafficMatchRules extends TeaModel {
        @NameInMap("DstCidr")
        private String dstCidr;

        @NameInMap("DstPortRange")
        private java.util.List < Integer > dstPortRange;

        @NameInMap("MatchDscp")
        private Integer matchDscp;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("SrcCidr")
        private String srcCidr;

        @NameInMap("SrcPortRange")
        private java.util.List < Integer > srcPortRange;

        @NameInMap("TrafficMatchRuleDescription")
        private String trafficMatchRuleDescription;

        @NameInMap("TrafficMatchRuleId")
        private String trafficMatchRuleId;

        @NameInMap("TrafficMatchRuleName")
        private String trafficMatchRuleName;

        @NameInMap("TrafficMatchRuleStatus")
        private String trafficMatchRuleStatus;

        private TrafficMatchRules(Builder builder) {
            this.dstCidr = builder.dstCidr;
            this.dstPortRange = builder.dstPortRange;
            this.matchDscp = builder.matchDscp;
            this.protocol = builder.protocol;
            this.srcCidr = builder.srcCidr;
            this.srcPortRange = builder.srcPortRange;
            this.trafficMatchRuleDescription = builder.trafficMatchRuleDescription;
            this.trafficMatchRuleId = builder.trafficMatchRuleId;
            this.trafficMatchRuleName = builder.trafficMatchRuleName;
            this.trafficMatchRuleStatus = builder.trafficMatchRuleStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficMatchRules create() {
            return builder().build();
        }

        /**
         * @return dstCidr
         */
        public String getDstCidr() {
            return this.dstCidr;
        }

        /**
         * @return dstPortRange
         */
        public java.util.List < Integer > getDstPortRange() {
            return this.dstPortRange;
        }

        /**
         * @return matchDscp
         */
        public Integer getMatchDscp() {
            return this.matchDscp;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return srcCidr
         */
        public String getSrcCidr() {
            return this.srcCidr;
        }

        /**
         * @return srcPortRange
         */
        public java.util.List < Integer > getSrcPortRange() {
            return this.srcPortRange;
        }

        /**
         * @return trafficMatchRuleDescription
         */
        public String getTrafficMatchRuleDescription() {
            return this.trafficMatchRuleDescription;
        }

        /**
         * @return trafficMatchRuleId
         */
        public String getTrafficMatchRuleId() {
            return this.trafficMatchRuleId;
        }

        /**
         * @return trafficMatchRuleName
         */
        public String getTrafficMatchRuleName() {
            return this.trafficMatchRuleName;
        }

        /**
         * @return trafficMatchRuleStatus
         */
        public String getTrafficMatchRuleStatus() {
            return this.trafficMatchRuleStatus;
        }

        public static final class Builder {
            private String dstCidr; 
            private java.util.List < Integer > dstPortRange; 
            private Integer matchDscp; 
            private String protocol; 
            private String srcCidr; 
            private java.util.List < Integer > srcPortRange; 
            private String trafficMatchRuleDescription; 
            private String trafficMatchRuleId; 
            private String trafficMatchRuleName; 
            private String trafficMatchRuleStatus; 

            /**
             * The destination CIDR block used to match data packets.
             */
            public Builder dstCidr(String dstCidr) {
                this.dstCidr = dstCidr;
                return this;
            }

            /**
             * The destination port range used to match data packets.
             */
            public Builder dstPortRange(java.util.List < Integer > dstPortRange) {
                this.dstPortRange = dstPortRange;
                return this;
            }

            /**
             * The DSCP value used to match data packets.
             */
            public Builder matchDscp(Integer matchDscp) {
                this.matchDscp = matchDscp;
                return this;
            }

            /**
             * The protocol used to match data packets.
             * <p>
             * 
             * > Traffic marking policies support multiple protocols. For more information, see the documentation of CEN.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The source CIDR block used to match data packets.
             */
            public Builder srcCidr(String srcCidr) {
                this.srcCidr = srcCidr;
                return this;
            }

            /**
             * The source port range used to match data packets.
             */
            public Builder srcPortRange(java.util.List < Integer > srcPortRange) {
                this.srcPortRange = srcPortRange;
                return this;
            }

            /**
             * The description of the traffic classification rule.
             */
            public Builder trafficMatchRuleDescription(String trafficMatchRuleDescription) {
                this.trafficMatchRuleDescription = trafficMatchRuleDescription;
                return this;
            }

            /**
             * The ID of the traffic classification rule.
             */
            public Builder trafficMatchRuleId(String trafficMatchRuleId) {
                this.trafficMatchRuleId = trafficMatchRuleId;
                return this;
            }

            /**
             * The name of the traffic classification rule.
             */
            public Builder trafficMatchRuleName(String trafficMatchRuleName) {
                this.trafficMatchRuleName = trafficMatchRuleName;
                return this;
            }

            /**
             * The status of the traffic classification rule. Valid values:
             * <p>
             * 
             * *   **Creating**: The rule is being created.
             * *   **Active**: The rule is available.
             * *   **Deleting**: The rule is being deleted.
             * *   **Deleted**: The rule is deleted.
             */
            public Builder trafficMatchRuleStatus(String trafficMatchRuleStatus) {
                this.trafficMatchRuleStatus = trafficMatchRuleStatus;
                return this;
            }

            public TrafficMatchRules build() {
                return new TrafficMatchRules(this);
            } 

        } 

    }
    public static class TrafficMarkingPolicies extends TeaModel {
        @NameInMap("MarkingDscp")
        private Integer markingDscp;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("TrafficMarkingPolicyDescription")
        private String trafficMarkingPolicyDescription;

        @NameInMap("TrafficMarkingPolicyId")
        private String trafficMarkingPolicyId;

        @NameInMap("TrafficMarkingPolicyName")
        private String trafficMarkingPolicyName;

        @NameInMap("TrafficMarkingPolicyStatus")
        private String trafficMarkingPolicyStatus;

        @NameInMap("TrafficMatchRules")
        private java.util.List < TrafficMatchRules> trafficMatchRules;

        @NameInMap("TransitRouterId")
        private String transitRouterId;

        private TrafficMarkingPolicies(Builder builder) {
            this.markingDscp = builder.markingDscp;
            this.priority = builder.priority;
            this.trafficMarkingPolicyDescription = builder.trafficMarkingPolicyDescription;
            this.trafficMarkingPolicyId = builder.trafficMarkingPolicyId;
            this.trafficMarkingPolicyName = builder.trafficMarkingPolicyName;
            this.trafficMarkingPolicyStatus = builder.trafficMarkingPolicyStatus;
            this.trafficMatchRules = builder.trafficMatchRules;
            this.transitRouterId = builder.transitRouterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficMarkingPolicies create() {
            return builder().build();
        }

        /**
         * @return markingDscp
         */
        public Integer getMarkingDscp() {
            return this.markingDscp;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return trafficMarkingPolicyDescription
         */
        public String getTrafficMarkingPolicyDescription() {
            return this.trafficMarkingPolicyDescription;
        }

        /**
         * @return trafficMarkingPolicyId
         */
        public String getTrafficMarkingPolicyId() {
            return this.trafficMarkingPolicyId;
        }

        /**
         * @return trafficMarkingPolicyName
         */
        public String getTrafficMarkingPolicyName() {
            return this.trafficMarkingPolicyName;
        }

        /**
         * @return trafficMarkingPolicyStatus
         */
        public String getTrafficMarkingPolicyStatus() {
            return this.trafficMarkingPolicyStatus;
        }

        /**
         * @return trafficMatchRules
         */
        public java.util.List < TrafficMatchRules> getTrafficMatchRules() {
            return this.trafficMatchRules;
        }

        /**
         * @return transitRouterId
         */
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public static final class Builder {
            private Integer markingDscp; 
            private Integer priority; 
            private String trafficMarkingPolicyDescription; 
            private String trafficMarkingPolicyId; 
            private String trafficMarkingPolicyName; 
            private String trafficMarkingPolicyStatus; 
            private java.util.List < TrafficMatchRules> trafficMatchRules; 
            private String transitRouterId; 

            /**
             * The differentiated services code point (DSCP) value of the traffic marking policy.
             */
            public Builder markingDscp(Integer markingDscp) {
                this.markingDscp = markingDscp;
                return this;
            }

            /**
             * The priority of the traffic marking policy.
             * <p>
             * 
             * A smaller value indicates a higher priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The description of the traffic marking policy.
             */
            public Builder trafficMarkingPolicyDescription(String trafficMarkingPolicyDescription) {
                this.trafficMarkingPolicyDescription = trafficMarkingPolicyDescription;
                return this;
            }

            /**
             * The ID of the traffic marking policy.
             */
            public Builder trafficMarkingPolicyId(String trafficMarkingPolicyId) {
                this.trafficMarkingPolicyId = trafficMarkingPolicyId;
                return this;
            }

            /**
             * The name of the traffic marking policy.
             */
            public Builder trafficMarkingPolicyName(String trafficMarkingPolicyName) {
                this.trafficMarkingPolicyName = trafficMarkingPolicyName;
                return this;
            }

            /**
             * The status of the traffic marking policy. Valid values:
             * <p>
             * 
             * *   **Creating**: The policy is being created.
             * *   **Active**: The policy is available.
             * *   **Modifying**: The policy is being modified
             * *   **Deleting**: The policy is being deleted.
             * *   **Deleted**: The policy is deleted.
             */
            public Builder trafficMarkingPolicyStatus(String trafficMarkingPolicyStatus) {
                this.trafficMarkingPolicyStatus = trafficMarkingPolicyStatus;
                return this;
            }

            /**
             * The list of traffic classification rules.
             */
            public Builder trafficMatchRules(java.util.List < TrafficMatchRules> trafficMatchRules) {
                this.trafficMatchRules = trafficMatchRules;
                return this;
            }

            /**
             * The ID of the transit router.
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            public TrafficMarkingPolicies build() {
                return new TrafficMarkingPolicies(this);
            } 

        } 

    }
}
