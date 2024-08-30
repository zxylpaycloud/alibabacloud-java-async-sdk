// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLimitationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLimitationResponseBody</p>
 */
public class DescribeLimitationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxNumberOfAlbServerGroup")
    private Integer maxNumberOfAlbServerGroup;

    @com.aliyun.core.annotation.NameInMap("MaxNumberOfDBInstances")
    private Integer maxNumberOfDBInstances;

    @com.aliyun.core.annotation.NameInMap("MaxNumberOfLifecycleHooks")
    private Integer maxNumberOfLifecycleHooks;

    @com.aliyun.core.annotation.NameInMap("MaxNumberOfLoadBalancers")
    private Integer maxNumberOfLoadBalancers;

    @com.aliyun.core.annotation.NameInMap("MaxNumberOfMaxSize")
    private Integer maxNumberOfMaxSize;

    @com.aliyun.core.annotation.NameInMap("MaxNumberOfMinSize")
    private Integer maxNumberOfMinSize;

    @com.aliyun.core.annotation.NameInMap("MaxNumberOfNlbServerGroup")
    private Integer maxNumberOfNlbServerGroup;

    @com.aliyun.core.annotation.NameInMap("MaxNumberOfNotificationConfigurations")
    private Integer maxNumberOfNotificationConfigurations;

    @com.aliyun.core.annotation.NameInMap("MaxNumberOfScalingConfigurations")
    private Integer maxNumberOfScalingConfigurations;

    @com.aliyun.core.annotation.NameInMap("MaxNumberOfScalingGroups")
    private Integer maxNumberOfScalingGroups;

    @com.aliyun.core.annotation.NameInMap("MaxNumberOfScalingInstances")
    private Integer maxNumberOfScalingInstances;

    @com.aliyun.core.annotation.NameInMap("MaxNumberOfScalingRules")
    private Integer maxNumberOfScalingRules;

    @com.aliyun.core.annotation.NameInMap("MaxNumberOfScheduledTasks")
    private Integer maxNumberOfScheduledTasks;

    @com.aliyun.core.annotation.NameInMap("MaxNumberOfVServerGroups")
    private Integer maxNumberOfVServerGroups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLimitationResponseBody(Builder builder) {
        this.maxNumberOfAlbServerGroup = builder.maxNumberOfAlbServerGroup;
        this.maxNumberOfDBInstances = builder.maxNumberOfDBInstances;
        this.maxNumberOfLifecycleHooks = builder.maxNumberOfLifecycleHooks;
        this.maxNumberOfLoadBalancers = builder.maxNumberOfLoadBalancers;
        this.maxNumberOfMaxSize = builder.maxNumberOfMaxSize;
        this.maxNumberOfMinSize = builder.maxNumberOfMinSize;
        this.maxNumberOfNlbServerGroup = builder.maxNumberOfNlbServerGroup;
        this.maxNumberOfNotificationConfigurations = builder.maxNumberOfNotificationConfigurations;
        this.maxNumberOfScalingConfigurations = builder.maxNumberOfScalingConfigurations;
        this.maxNumberOfScalingGroups = builder.maxNumberOfScalingGroups;
        this.maxNumberOfScalingInstances = builder.maxNumberOfScalingInstances;
        this.maxNumberOfScalingRules = builder.maxNumberOfScalingRules;
        this.maxNumberOfScheduledTasks = builder.maxNumberOfScheduledTasks;
        this.maxNumberOfVServerGroups = builder.maxNumberOfVServerGroups;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLimitationResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxNumberOfAlbServerGroup
     */
    public Integer getMaxNumberOfAlbServerGroup() {
        return this.maxNumberOfAlbServerGroup;
    }

    /**
     * @return maxNumberOfDBInstances
     */
    public Integer getMaxNumberOfDBInstances() {
        return this.maxNumberOfDBInstances;
    }

    /**
     * @return maxNumberOfLifecycleHooks
     */
    public Integer getMaxNumberOfLifecycleHooks() {
        return this.maxNumberOfLifecycleHooks;
    }

    /**
     * @return maxNumberOfLoadBalancers
     */
    public Integer getMaxNumberOfLoadBalancers() {
        return this.maxNumberOfLoadBalancers;
    }

    /**
     * @return maxNumberOfMaxSize
     */
    public Integer getMaxNumberOfMaxSize() {
        return this.maxNumberOfMaxSize;
    }

    /**
     * @return maxNumberOfMinSize
     */
    public Integer getMaxNumberOfMinSize() {
        return this.maxNumberOfMinSize;
    }

    /**
     * @return maxNumberOfNlbServerGroup
     */
    public Integer getMaxNumberOfNlbServerGroup() {
        return this.maxNumberOfNlbServerGroup;
    }

    /**
     * @return maxNumberOfNotificationConfigurations
     */
    public Integer getMaxNumberOfNotificationConfigurations() {
        return this.maxNumberOfNotificationConfigurations;
    }

    /**
     * @return maxNumberOfScalingConfigurations
     */
    public Integer getMaxNumberOfScalingConfigurations() {
        return this.maxNumberOfScalingConfigurations;
    }

    /**
     * @return maxNumberOfScalingGroups
     */
    public Integer getMaxNumberOfScalingGroups() {
        return this.maxNumberOfScalingGroups;
    }

    /**
     * @return maxNumberOfScalingInstances
     */
    public Integer getMaxNumberOfScalingInstances() {
        return this.maxNumberOfScalingInstances;
    }

    /**
     * @return maxNumberOfScalingRules
     */
    public Integer getMaxNumberOfScalingRules() {
        return this.maxNumberOfScalingRules;
    }

    /**
     * @return maxNumberOfScheduledTasks
     */
    public Integer getMaxNumberOfScheduledTasks() {
        return this.maxNumberOfScheduledTasks;
    }

    /**
     * @return maxNumberOfVServerGroups
     */
    public Integer getMaxNumberOfVServerGroups() {
        return this.maxNumberOfVServerGroups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer maxNumberOfAlbServerGroup; 
        private Integer maxNumberOfDBInstances; 
        private Integer maxNumberOfLifecycleHooks; 
        private Integer maxNumberOfLoadBalancers; 
        private Integer maxNumberOfMaxSize; 
        private Integer maxNumberOfMinSize; 
        private Integer maxNumberOfNlbServerGroup; 
        private Integer maxNumberOfNotificationConfigurations; 
        private Integer maxNumberOfScalingConfigurations; 
        private Integer maxNumberOfScalingGroups; 
        private Integer maxNumberOfScalingInstances; 
        private Integer maxNumberOfScalingRules; 
        private Integer maxNumberOfScheduledTasks; 
        private Integer maxNumberOfVServerGroups; 
        private String requestId; 

        /**
         * The maximum number of Application Load Balancer (ALB) server groups that can be attached to a scaling group.
         * <p>
         * 
         * >  To view the quota or request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).
         */
        public Builder maxNumberOfAlbServerGroup(Integer maxNumberOfAlbServerGroup) {
            this.maxNumberOfAlbServerGroup = maxNumberOfAlbServerGroup;
            return this;
        }

        /**
         * The maximum number of ApsaraDB RDS instances that can be associated with a scaling group.
         * <p>
         * 
         * >  To view the quota or request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).
         */
        public Builder maxNumberOfDBInstances(Integer maxNumberOfDBInstances) {
            this.maxNumberOfDBInstances = maxNumberOfDBInstances;
            return this;
        }

        /**
         * The maximum number of lifecycle hooks that can be created in a scaling group.
         */
        public Builder maxNumberOfLifecycleHooks(Integer maxNumberOfLifecycleHooks) {
            this.maxNumberOfLifecycleHooks = maxNumberOfLifecycleHooks;
            return this;
        }

        /**
         * The maximum number of Classic Load Balancer (CLB, formerly known as SLB) instances that can be associated with a scaling group.
         * <p>
         * 
         * >  To view the quota or request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).
         */
        public Builder maxNumberOfLoadBalancers(Integer maxNumberOfLoadBalancers) {
            this.maxNumberOfLoadBalancers = maxNumberOfLoadBalancers;
            return this;
        }

        /**
         * The maximum number of instances that can be contained in a scaling group.
         * <p>
         * 
         * >  To view the quota or request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).
         */
        public Builder maxNumberOfMaxSize(Integer maxNumberOfMaxSize) {
            this.maxNumberOfMaxSize = maxNumberOfMaxSize;
            return this;
        }

        /**
         * The minimum number of instances that must be contained in a scaling group. The value of `MaxNumberOfMinSize` must be consistent with the value of `MaxNumberOfMaxSize`.
         */
        public Builder maxNumberOfMinSize(Integer maxNumberOfMinSize) {
            this.maxNumberOfMinSize = maxNumberOfMinSize;
            return this;
        }

        /**
         * The maximum number of Network Load Balancer (NLB) server groups that can be attached to a scaling group.
         * <p>
         * 
         * >  To view the quota or request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).
         */
        public Builder maxNumberOfNlbServerGroup(Integer maxNumberOfNlbServerGroup) {
            this.maxNumberOfNlbServerGroup = maxNumberOfNlbServerGroup;
            return this;
        }

        /**
         * The maximum number of notification rules that can be created in a scaling group.
         */
        public Builder maxNumberOfNotificationConfigurations(Integer maxNumberOfNotificationConfigurations) {
            this.maxNumberOfNotificationConfigurations = maxNumberOfNotificationConfigurations;
            return this;
        }

        /**
         * The maximum number of scaling configurations that can be created in a scaling group.
         * <p>
         * 
         * >  To view the quota or request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).
         */
        public Builder maxNumberOfScalingConfigurations(Integer maxNumberOfScalingConfigurations) {
            this.maxNumberOfScalingConfigurations = maxNumberOfScalingConfigurations;
            return this;
        }

        /**
         * The maximum number of scaling groups that can be created in a region by using an Alibaba Cloud account.
         * <p>
         * 
         * >  To view the quota or request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).
         */
        public Builder maxNumberOfScalingGroups(Integer maxNumberOfScalingGroups) {
            this.maxNumberOfScalingGroups = maxNumberOfScalingGroups;
            return this;
        }

        /**
         * The maximum number of Elastic Compute Service (ECS) instances or elastic container instances that can be automatically scaled in a scaling group at the same time.
         */
        public Builder maxNumberOfScalingInstances(Integer maxNumberOfScalingInstances) {
            this.maxNumberOfScalingInstances = maxNumberOfScalingInstances;
            return this;
        }

        /**
         * The maximum number of scaling rules that can be created in a scaling group.
         * <p>
         * 
         * >  To view the quota or request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).
         */
        public Builder maxNumberOfScalingRules(Integer maxNumberOfScalingRules) {
            this.maxNumberOfScalingRules = maxNumberOfScalingRules;
            return this;
        }

        /**
         * The maximum number of scheduled tasks that can be created in a region by using an Alibaba Cloud account.
         * <p>
         * 
         * >  To view the quota or request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).
         */
        public Builder maxNumberOfScheduledTasks(Integer maxNumberOfScheduledTasks) {
            this.maxNumberOfScheduledTasks = maxNumberOfScheduledTasks;
            return this;
        }

        /**
         * The maximum number of CLB vServer groups that can be attached to a scaling group.
         * <p>
         * 
         * >  To view the quota or request a quota increase, go to [Quota Center](https://quotas.console.aliyun.com/products/ess/quotas).
         */
        public Builder maxNumberOfVServerGroups(Integer maxNumberOfVServerGroups) {
            this.maxNumberOfVServerGroups = maxNumberOfVServerGroups;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLimitationResponseBody build() {
            return new DescribeLimitationResponseBody(this);
        } 

    } 

}
