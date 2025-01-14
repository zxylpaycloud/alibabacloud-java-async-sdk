// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingGroupsResponseBody</p>
 */
public class DescribeScalingGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingGroups")
    private java.util.List < ScalingGroups> scalingGroups;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeScalingGroupsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.scalingGroups = builder.scalingGroups;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingGroups
     */
    public java.util.List < ScalingGroups> getScalingGroups() {
        return this.scalingGroups;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < ScalingGroups> scalingGroups; 
        private Integer totalCount; 

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The scaling groups.
         */
        public Builder scalingGroups(java.util.List < ScalingGroups> scalingGroups) {
            this.scalingGroups = scalingGroups;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeScalingGroupsResponseBody build() {
            return new DescribeScalingGroupsResponseBody(this);
        } 

    } 

    public static class AlbServerGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlbServerGroupId")
        private String albServerGroupId;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private AlbServerGroups(Builder builder) {
            this.albServerGroupId = builder.albServerGroupId;
            this.port = builder.port;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlbServerGroups create() {
            return builder().build();
        }

        /**
         * @return albServerGroupId
         */
        public String getAlbServerGroupId() {
            return this.albServerGroupId;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String albServerGroupId; 
            private Integer port; 
            private Integer weight; 

            /**
             * The ID of the ALB server group.
             */
            public Builder albServerGroupId(String albServerGroupId) {
                this.albServerGroupId = albServerGroupId;
                return this;
            }

            /**
             * The port number used by an ECS instance as a backend server in the ALB server group.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The weight of an ECS instance as a backend server in the ALB server group.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public AlbServerGroups build() {
                return new AlbServerGroups(this);
            } 

        } 

    }
    public static class DBInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private java.util.List < String > securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DBInstances(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
            this.securityGroupIds = builder.securityGroupIds;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstances create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return securityGroupIds
         */
        public java.util.List < String > getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String DBInstanceId; 
            private java.util.List < String > securityGroupIds; 
            private String type; 

            /**
             * The ID of the database.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * The IDs of the security groups that are added to the security group whitelist of the attached database.
             */
            public Builder securityGroupIds(java.util.List < String > securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * The type of the database. Valid values:
             * <p>
             * 
             * *   RDS.
             * *   Redis.
             * *   MongoDB.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DBInstances build() {
                return new DBInstances(this);
            } 

        } 

    }
    public static class LaunchTemplateOverrides extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
        private Float spotPriceLimit;

        @com.aliyun.core.annotation.NameInMap("WeightedCapacity")
        private Integer weightedCapacity;

        private LaunchTemplateOverrides(Builder builder) {
            this.instanceType = builder.instanceType;
            this.spotPriceLimit = builder.spotPriceLimit;
            this.weightedCapacity = builder.weightedCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateOverrides create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return spotPriceLimit
         */
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        /**
         * @return weightedCapacity
         */
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

        public static final class Builder {
            private String instanceType; 
            private Float spotPriceLimit; 
            private Integer weightedCapacity; 

            /**
             * The instance type. The instance type that is specified by this parameter overrides the instance type that is specified in the launch template.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The maximum bid price of the instance type that is specified by `LaunchTemplateOverride.InstanceType`.
             * <p>
             * 
             * >  This parameter takes effect only if you use `LaunchTemplateId` to specify a launch template.
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * The weight of the instance type. The value of this parameter indicates the capacity of a single instance of the specified instance type in the scaling group. A higher weight indicates that a smaller number of instances of the specified instance type are required to meet the expected capacity.
             */
            public Builder weightedCapacity(Integer weightedCapacity) {
                this.weightedCapacity = weightedCapacity;
                return this;
            }

            public LaunchTemplateOverrides build() {
                return new LaunchTemplateOverrides(this);
            } 

        } 

    }
    public static class LoadBalancerConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private LoadBalancerConfigs(Builder builder) {
            this.loadBalancerId = builder.loadBalancerId;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerConfigs create() {
            return builder().build();
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String loadBalancerId; 
            private Integer weight; 

            /**
             * The ID of the CLB instance.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * The weight of an ECS instance as a backend server in the CLB server group. An increase in the weight of an ECS instance indicates an increase in the number of access requests that are forwarded to the ECS instance. If you set the weight of an ECS instance to 0, no access requests are forwarded to the ECS instance. Valid values: 0 to 100.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public LoadBalancerConfigs build() {
                return new LoadBalancerConfigs(this);
            } 

        } 

    }
    public static class ServerGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("ServerGroupId")
        private String serverGroupId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private ServerGroups(Builder builder) {
            this.port = builder.port;
            this.serverGroupId = builder.serverGroupId;
            this.type = builder.type;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerGroups create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return serverGroupId
         */
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Integer port; 
            private String serverGroupId; 
            private String type; 
            private Integer weight; 

            /**
             * The port number used by an ECS instance as a backend server in the server group.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the server group.
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * The type of the server group. Valid values:
             * <p>
             * 
             * *   ALB
             * *   NLB
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The weight of an ECS instance as a backend server in the server group.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public ServerGroups build() {
                return new ServerGroups(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Propagate")
        private Boolean propagate;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.propagate = builder.propagate;
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return propagate
         */
        public Boolean getPropagate() {
            return this.propagate;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private Boolean propagate; 
            private String tagKey; 
            private String tagValue; 

            /**
             * Indicates whether the tags of the scaling group can be propagated to instances. Valid values:
             * <p>
             * 
             * *   true: The tags of the scaling group can be propagated only to new instances.
             * *   false: The tags of the scaling group cannot be propagated to instances.
             * 
             * Default value: false.
             */
            public Builder propagate(Boolean propagate) {
                this.propagate = propagate;
                return this;
            }

            /**
             * The tag key of the scaling group.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value of the scaling group.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class VServerGroupAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("VServerGroupId")
        private String vServerGroupId;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private VServerGroupAttributes(Builder builder) {
            this.port = builder.port;
            this.vServerGroupId = builder.vServerGroupId;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VServerGroupAttributes create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return vServerGroupId
         */
        public String getVServerGroupId() {
            return this.vServerGroupId;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Integer port; 
            private String vServerGroupId; 
            private Integer weight; 

            /**
             * The port number that is used by the load balancer to provide external services.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the backend vServer group.
             */
            public Builder vServerGroupId(String vServerGroupId) {
                this.vServerGroupId = vServerGroupId;
                return this;
            }

            /**
             * The weight of the backend vServer group.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public VServerGroupAttributes build() {
                return new VServerGroupAttributes(this);
            } 

        } 

    }
    public static class VServerGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("VServerGroupAttributes")
        private java.util.List < VServerGroupAttributes> vServerGroupAttributes;

        private VServerGroups(Builder builder) {
            this.loadBalancerId = builder.loadBalancerId;
            this.vServerGroupAttributes = builder.vServerGroupAttributes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VServerGroups create() {
            return builder().build();
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return vServerGroupAttributes
         */
        public java.util.List < VServerGroupAttributes> getVServerGroupAttributes() {
            return this.vServerGroupAttributes;
        }

        public static final class Builder {
            private String loadBalancerId; 
            private java.util.List < VServerGroupAttributes> vServerGroupAttributes; 

            /**
             * The ID of the load balancer to which the backend vServer group belongs.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * The attributes of the backend vServer groups.
             */
            public Builder vServerGroupAttributes(java.util.List < VServerGroupAttributes> vServerGroupAttributes) {
                this.vServerGroupAttributes = vServerGroupAttributes;
                return this;
            }

            public VServerGroups build() {
                return new VServerGroups(this);
            } 

        } 

    }
    public static class ScalingGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveCapacity")
        private Integer activeCapacity;

        @com.aliyun.core.annotation.NameInMap("ActiveScalingConfigurationId")
        private String activeScalingConfigurationId;

        @com.aliyun.core.annotation.NameInMap("AlbServerGroups")
        private java.util.List < AlbServerGroups> albServerGroups;

        @com.aliyun.core.annotation.NameInMap("AllocationStrategy")
        private String allocationStrategy;

        @com.aliyun.core.annotation.NameInMap("AzBalance")
        private Boolean azBalance;

        @com.aliyun.core.annotation.NameInMap("CompensateWithOnDemand")
        private Boolean compensateWithOnDemand;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("CurrentHostName")
        private String currentHostName;

        @com.aliyun.core.annotation.NameInMap("CustomPolicyARN")
        private String customPolicyARN;

        @com.aliyun.core.annotation.NameInMap("DBInstanceIds")
        private java.util.List < String > DBInstanceIds;

        @com.aliyun.core.annotation.NameInMap("DBInstances")
        private java.util.List < DBInstances> DBInstances;

        @com.aliyun.core.annotation.NameInMap("DefaultCooldown")
        private Integer defaultCooldown;

        @com.aliyun.core.annotation.NameInMap("DesiredCapacity")
        private Integer desiredCapacity;

        @com.aliyun.core.annotation.NameInMap("EnableDesiredCapacity")
        private Boolean enableDesiredCapacity;

        @com.aliyun.core.annotation.NameInMap("GroupDeletionProtection")
        private Boolean groupDeletionProtection;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private String groupType;

        @com.aliyun.core.annotation.NameInMap("HealthCheckType")
        private String healthCheckType;

        @com.aliyun.core.annotation.NameInMap("HealthCheckTypes")
        private java.util.List < String > healthCheckTypes;

        @com.aliyun.core.annotation.NameInMap("InitCapacity")
        private Integer initCapacity;

        @com.aliyun.core.annotation.NameInMap("IsElasticStrengthInAlarm")
        private Boolean isElasticStrengthInAlarm;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
        private String launchTemplateId;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateOverrides")
        private java.util.List < LaunchTemplateOverrides> launchTemplateOverrides;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersion")
        private String launchTemplateVersion;

        @com.aliyun.core.annotation.NameInMap("LifecycleState")
        private String lifecycleState;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerConfigs")
        private java.util.List < LoadBalancerConfigs> loadBalancerConfigs;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerIds")
        private java.util.List < String > loadBalancerIds;

        @com.aliyun.core.annotation.NameInMap("MaxInstanceLifetime")
        private Integer maxInstanceLifetime;

        @com.aliyun.core.annotation.NameInMap("MaxSize")
        private Integer maxSize;

        @com.aliyun.core.annotation.NameInMap("MinSize")
        private Integer minSize;

        @com.aliyun.core.annotation.NameInMap("ModificationTime")
        private String modificationTime;

        @com.aliyun.core.annotation.NameInMap("MonitorGroupId")
        private String monitorGroupId;

        @com.aliyun.core.annotation.NameInMap("MultiAZPolicy")
        private String multiAZPolicy;

        @com.aliyun.core.annotation.NameInMap("OnDemandBaseCapacity")
        private Integer onDemandBaseCapacity;

        @com.aliyun.core.annotation.NameInMap("OnDemandPercentageAboveBaseCapacity")
        private Integer onDemandPercentageAboveBaseCapacity;

        @com.aliyun.core.annotation.NameInMap("PendingCapacity")
        private Integer pendingCapacity;

        @com.aliyun.core.annotation.NameInMap("PendingWaitCapacity")
        private Integer pendingWaitCapacity;

        @com.aliyun.core.annotation.NameInMap("ProtectedCapacity")
        private Integer protectedCapacity;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RemovalPolicies")
        private java.util.List < String > removalPolicies;

        @com.aliyun.core.annotation.NameInMap("RemovingCapacity")
        private Integer removingCapacity;

        @com.aliyun.core.annotation.NameInMap("RemovingWaitCapacity")
        private Integer removingWaitCapacity;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupName")
        private String scalingGroupName;

        @com.aliyun.core.annotation.NameInMap("ScalingPolicy")
        private String scalingPolicy;

        @com.aliyun.core.annotation.NameInMap("ServerGroups")
        private java.util.List < ServerGroups> serverGroups;

        @com.aliyun.core.annotation.NameInMap("SpotAllocationStrategy")
        private String spotAllocationStrategy;

        @com.aliyun.core.annotation.NameInMap("SpotCapacity")
        private Integer spotCapacity;

        @com.aliyun.core.annotation.NameInMap("SpotInstancePools")
        private Integer spotInstancePools;

        @com.aliyun.core.annotation.NameInMap("SpotInstanceRemedy")
        private Boolean spotInstanceRemedy;

        @com.aliyun.core.annotation.NameInMap("StandbyCapacity")
        private Integer standbyCapacity;

        @com.aliyun.core.annotation.NameInMap("StoppedCapacity")
        private Integer stoppedCapacity;

        @com.aliyun.core.annotation.NameInMap("SuspendedProcesses")
        private java.util.List < String > suspendedProcesses;

        @com.aliyun.core.annotation.NameInMap("SystemSuspended")
        private Boolean systemSuspended;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TotalCapacity")
        private Integer totalCapacity;

        @com.aliyun.core.annotation.NameInMap("TotalInstanceCount")
        private Integer totalInstanceCount;

        @com.aliyun.core.annotation.NameInMap("VServerGroups")
        private java.util.List < VServerGroups> vServerGroups;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List < String > vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private ScalingGroups(Builder builder) {
            this.activeCapacity = builder.activeCapacity;
            this.activeScalingConfigurationId = builder.activeScalingConfigurationId;
            this.albServerGroups = builder.albServerGroups;
            this.allocationStrategy = builder.allocationStrategy;
            this.azBalance = builder.azBalance;
            this.compensateWithOnDemand = builder.compensateWithOnDemand;
            this.creationTime = builder.creationTime;
            this.currentHostName = builder.currentHostName;
            this.customPolicyARN = builder.customPolicyARN;
            this.DBInstanceIds = builder.DBInstanceIds;
            this.DBInstances = builder.DBInstances;
            this.defaultCooldown = builder.defaultCooldown;
            this.desiredCapacity = builder.desiredCapacity;
            this.enableDesiredCapacity = builder.enableDesiredCapacity;
            this.groupDeletionProtection = builder.groupDeletionProtection;
            this.groupType = builder.groupType;
            this.healthCheckType = builder.healthCheckType;
            this.healthCheckTypes = builder.healthCheckTypes;
            this.initCapacity = builder.initCapacity;
            this.isElasticStrengthInAlarm = builder.isElasticStrengthInAlarm;
            this.launchTemplateId = builder.launchTemplateId;
            this.launchTemplateOverrides = builder.launchTemplateOverrides;
            this.launchTemplateVersion = builder.launchTemplateVersion;
            this.lifecycleState = builder.lifecycleState;
            this.loadBalancerConfigs = builder.loadBalancerConfigs;
            this.loadBalancerIds = builder.loadBalancerIds;
            this.maxInstanceLifetime = builder.maxInstanceLifetime;
            this.maxSize = builder.maxSize;
            this.minSize = builder.minSize;
            this.modificationTime = builder.modificationTime;
            this.monitorGroupId = builder.monitorGroupId;
            this.multiAZPolicy = builder.multiAZPolicy;
            this.onDemandBaseCapacity = builder.onDemandBaseCapacity;
            this.onDemandPercentageAboveBaseCapacity = builder.onDemandPercentageAboveBaseCapacity;
            this.pendingCapacity = builder.pendingCapacity;
            this.pendingWaitCapacity = builder.pendingWaitCapacity;
            this.protectedCapacity = builder.protectedCapacity;
            this.regionId = builder.regionId;
            this.removalPolicies = builder.removalPolicies;
            this.removingCapacity = builder.removingCapacity;
            this.removingWaitCapacity = builder.removingWaitCapacity;
            this.resourceGroupId = builder.resourceGroupId;
            this.scalingGroupId = builder.scalingGroupId;
            this.scalingGroupName = builder.scalingGroupName;
            this.scalingPolicy = builder.scalingPolicy;
            this.serverGroups = builder.serverGroups;
            this.spotAllocationStrategy = builder.spotAllocationStrategy;
            this.spotCapacity = builder.spotCapacity;
            this.spotInstancePools = builder.spotInstancePools;
            this.spotInstanceRemedy = builder.spotInstanceRemedy;
            this.standbyCapacity = builder.standbyCapacity;
            this.stoppedCapacity = builder.stoppedCapacity;
            this.suspendedProcesses = builder.suspendedProcesses;
            this.systemSuspended = builder.systemSuspended;
            this.tags = builder.tags;
            this.totalCapacity = builder.totalCapacity;
            this.totalInstanceCount = builder.totalInstanceCount;
            this.vServerGroups = builder.vServerGroups;
            this.vSwitchId = builder.vSwitchId;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingGroups create() {
            return builder().build();
        }

        /**
         * @return activeCapacity
         */
        public Integer getActiveCapacity() {
            return this.activeCapacity;
        }

        /**
         * @return activeScalingConfigurationId
         */
        public String getActiveScalingConfigurationId() {
            return this.activeScalingConfigurationId;
        }

        /**
         * @return albServerGroups
         */
        public java.util.List < AlbServerGroups> getAlbServerGroups() {
            return this.albServerGroups;
        }

        /**
         * @return allocationStrategy
         */
        public String getAllocationStrategy() {
            return this.allocationStrategy;
        }

        /**
         * @return azBalance
         */
        public Boolean getAzBalance() {
            return this.azBalance;
        }

        /**
         * @return compensateWithOnDemand
         */
        public Boolean getCompensateWithOnDemand() {
            return this.compensateWithOnDemand;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return currentHostName
         */
        public String getCurrentHostName() {
            return this.currentHostName;
        }

        /**
         * @return customPolicyARN
         */
        public String getCustomPolicyARN() {
            return this.customPolicyARN;
        }

        /**
         * @return DBInstanceIds
         */
        public java.util.List < String > getDBInstanceIds() {
            return this.DBInstanceIds;
        }

        /**
         * @return DBInstances
         */
        public java.util.List < DBInstances> getDBInstances() {
            return this.DBInstances;
        }

        /**
         * @return defaultCooldown
         */
        public Integer getDefaultCooldown() {
            return this.defaultCooldown;
        }

        /**
         * @return desiredCapacity
         */
        public Integer getDesiredCapacity() {
            return this.desiredCapacity;
        }

        /**
         * @return enableDesiredCapacity
         */
        public Boolean getEnableDesiredCapacity() {
            return this.enableDesiredCapacity;
        }

        /**
         * @return groupDeletionProtection
         */
        public Boolean getGroupDeletionProtection() {
            return this.groupDeletionProtection;
        }

        /**
         * @return groupType
         */
        public String getGroupType() {
            return this.groupType;
        }

        /**
         * @return healthCheckType
         */
        public String getHealthCheckType() {
            return this.healthCheckType;
        }

        /**
         * @return healthCheckTypes
         */
        public java.util.List < String > getHealthCheckTypes() {
            return this.healthCheckTypes;
        }

        /**
         * @return initCapacity
         */
        public Integer getInitCapacity() {
            return this.initCapacity;
        }

        /**
         * @return isElasticStrengthInAlarm
         */
        public Boolean getIsElasticStrengthInAlarm() {
            return this.isElasticStrengthInAlarm;
        }

        /**
         * @return launchTemplateId
         */
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        /**
         * @return launchTemplateOverrides
         */
        public java.util.List < LaunchTemplateOverrides> getLaunchTemplateOverrides() {
            return this.launchTemplateOverrides;
        }

        /**
         * @return launchTemplateVersion
         */
        public String getLaunchTemplateVersion() {
            return this.launchTemplateVersion;
        }

        /**
         * @return lifecycleState
         */
        public String getLifecycleState() {
            return this.lifecycleState;
        }

        /**
         * @return loadBalancerConfigs
         */
        public java.util.List < LoadBalancerConfigs> getLoadBalancerConfigs() {
            return this.loadBalancerConfigs;
        }

        /**
         * @return loadBalancerIds
         */
        public java.util.List < String > getLoadBalancerIds() {
            return this.loadBalancerIds;
        }

        /**
         * @return maxInstanceLifetime
         */
        public Integer getMaxInstanceLifetime() {
            return this.maxInstanceLifetime;
        }

        /**
         * @return maxSize
         */
        public Integer getMaxSize() {
            return this.maxSize;
        }

        /**
         * @return minSize
         */
        public Integer getMinSize() {
            return this.minSize;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return monitorGroupId
         */
        public String getMonitorGroupId() {
            return this.monitorGroupId;
        }

        /**
         * @return multiAZPolicy
         */
        public String getMultiAZPolicy() {
            return this.multiAZPolicy;
        }

        /**
         * @return onDemandBaseCapacity
         */
        public Integer getOnDemandBaseCapacity() {
            return this.onDemandBaseCapacity;
        }

        /**
         * @return onDemandPercentageAboveBaseCapacity
         */
        public Integer getOnDemandPercentageAboveBaseCapacity() {
            return this.onDemandPercentageAboveBaseCapacity;
        }

        /**
         * @return pendingCapacity
         */
        public Integer getPendingCapacity() {
            return this.pendingCapacity;
        }

        /**
         * @return pendingWaitCapacity
         */
        public Integer getPendingWaitCapacity() {
            return this.pendingWaitCapacity;
        }

        /**
         * @return protectedCapacity
         */
        public Integer getProtectedCapacity() {
            return this.protectedCapacity;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return removalPolicies
         */
        public java.util.List < String > getRemovalPolicies() {
            return this.removalPolicies;
        }

        /**
         * @return removingCapacity
         */
        public Integer getRemovingCapacity() {
            return this.removingCapacity;
        }

        /**
         * @return removingWaitCapacity
         */
        public Integer getRemovingWaitCapacity() {
            return this.removingWaitCapacity;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return scalingGroupId
         */
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        /**
         * @return scalingGroupName
         */
        public String getScalingGroupName() {
            return this.scalingGroupName;
        }

        /**
         * @return scalingPolicy
         */
        public String getScalingPolicy() {
            return this.scalingPolicy;
        }

        /**
         * @return serverGroups
         */
        public java.util.List < ServerGroups> getServerGroups() {
            return this.serverGroups;
        }

        /**
         * @return spotAllocationStrategy
         */
        public String getSpotAllocationStrategy() {
            return this.spotAllocationStrategy;
        }

        /**
         * @return spotCapacity
         */
        public Integer getSpotCapacity() {
            return this.spotCapacity;
        }

        /**
         * @return spotInstancePools
         */
        public Integer getSpotInstancePools() {
            return this.spotInstancePools;
        }

        /**
         * @return spotInstanceRemedy
         */
        public Boolean getSpotInstanceRemedy() {
            return this.spotInstanceRemedy;
        }

        /**
         * @return standbyCapacity
         */
        public Integer getStandbyCapacity() {
            return this.standbyCapacity;
        }

        /**
         * @return stoppedCapacity
         */
        public Integer getStoppedCapacity() {
            return this.stoppedCapacity;
        }

        /**
         * @return suspendedProcesses
         */
        public java.util.List < String > getSuspendedProcesses() {
            return this.suspendedProcesses;
        }

        /**
         * @return systemSuspended
         */
        public Boolean getSystemSuspended() {
            return this.systemSuspended;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return totalCapacity
         */
        public Integer getTotalCapacity() {
            return this.totalCapacity;
        }

        /**
         * @return totalInstanceCount
         */
        public Integer getTotalInstanceCount() {
            return this.totalInstanceCount;
        }

        /**
         * @return vServerGroups
         */
        public java.util.List < VServerGroups> getVServerGroups() {
            return this.vServerGroups;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List < String > getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Integer activeCapacity; 
            private String activeScalingConfigurationId; 
            private java.util.List < AlbServerGroups> albServerGroups; 
            private String allocationStrategy; 
            private Boolean azBalance; 
            private Boolean compensateWithOnDemand; 
            private String creationTime; 
            private String currentHostName; 
            private String customPolicyARN; 
            private java.util.List < String > DBInstanceIds; 
            private java.util.List < DBInstances> DBInstances; 
            private Integer defaultCooldown; 
            private Integer desiredCapacity; 
            private Boolean enableDesiredCapacity; 
            private Boolean groupDeletionProtection; 
            private String groupType; 
            private String healthCheckType; 
            private java.util.List < String > healthCheckTypes; 
            private Integer initCapacity; 
            private Boolean isElasticStrengthInAlarm; 
            private String launchTemplateId; 
            private java.util.List < LaunchTemplateOverrides> launchTemplateOverrides; 
            private String launchTemplateVersion; 
            private String lifecycleState; 
            private java.util.List < LoadBalancerConfigs> loadBalancerConfigs; 
            private java.util.List < String > loadBalancerIds; 
            private Integer maxInstanceLifetime; 
            private Integer maxSize; 
            private Integer minSize; 
            private String modificationTime; 
            private String monitorGroupId; 
            private String multiAZPolicy; 
            private Integer onDemandBaseCapacity; 
            private Integer onDemandPercentageAboveBaseCapacity; 
            private Integer pendingCapacity; 
            private Integer pendingWaitCapacity; 
            private Integer protectedCapacity; 
            private String regionId; 
            private java.util.List < String > removalPolicies; 
            private Integer removingCapacity; 
            private Integer removingWaitCapacity; 
            private String resourceGroupId; 
            private String scalingGroupId; 
            private String scalingGroupName; 
            private String scalingPolicy; 
            private java.util.List < ServerGroups> serverGroups; 
            private String spotAllocationStrategy; 
            private Integer spotCapacity; 
            private Integer spotInstancePools; 
            private Boolean spotInstanceRemedy; 
            private Integer standbyCapacity; 
            private Integer stoppedCapacity; 
            private java.util.List < String > suspendedProcesses; 
            private Boolean systemSuspended; 
            private java.util.List < Tags> tags; 
            private Integer totalCapacity; 
            private Integer totalInstanceCount; 
            private java.util.List < VServerGroups> vServerGroups; 
            private String vSwitchId; 
            private java.util.List < String > vSwitchIds; 
            private String vpcId; 

            /**
             * The number of ECS instances that are in the In Service state in the scaling group.
             */
            public Builder activeCapacity(Integer activeCapacity) {
                this.activeCapacity = activeCapacity;
                return this;
            }

            /**
             * The ID of the active scaling configuration in the scaling group.
             */
            public Builder activeScalingConfigurationId(String activeScalingConfigurationId) {
                this.activeScalingConfigurationId = activeScalingConfigurationId;
                return this;
            }

            /**
             * The Application Load Balancer (ALB) server groups.
             */
            public Builder albServerGroups(java.util.List < AlbServerGroups> albServerGroups) {
                this.albServerGroups = albServerGroups;
                return this;
            }

            /**
             * The instance allocation policy. Auto Scaling selects instance types based on the allocation policy to create the required number of preemptible instances. The policy is suitable for pay-as-you-go instances and preemptible instances. This parameter takes effect only if you set `MultiAZPolicy` to `COMPOSABLE`. Valid values:
             * <p>
             * 
             * *   priority: Auto Scaling adopts the predefined instance type sequence to create the required number of preemptible instances.
             * *   lowestPrice: Auto Scaling selects instance types that have the most economical vCPU pricing to create the required number of instances.
             */
            public Builder allocationStrategy(String allocationStrategy) {
                this.allocationStrategy = allocationStrategy;
                return this;
            }

            /**
             * Indicates whether instances in the scaling group are evenly distributed across the specified zones. This parameter takes effect only if you set `MultiAZPolicy` to `COMPOSABLE`. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder azBalance(Boolean azBalance) {
                this.azBalance = azBalance;
                return this;
            }

            /**
             * Indicates whether Auto Scaling can create pay-as-you-go instances to supplement preemptible instances if preemptible instances cannot be created due to price-related factors or insufficient inventory when MultiAZPolicy is set to COST_OPTIMIZED. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder compensateWithOnDemand(Boolean compensateWithOnDemand) {
                this.compensateWithOnDemand = compensateWithOnDemand;
                return this;
            }

            /**
             * The time when the scaling group was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * >  This parameter is unavailable.
             */
            public Builder currentHostName(String currentHostName) {
                this.currentHostName = currentHostName;
                return this;
            }

            /**
             * The Alibaba Cloud Resource Name (ARN) of the function that is specified in the custom scale-in policy. This parameter takes effect only if you set the first value of RemovalPolicies to CustomPolicy.
             */
            public Builder customPolicyARN(String customPolicyARN) {
                this.customPolicyARN = customPolicyARN;
                return this;
            }

            /**
             * The IDs of the ApsaraDB RDS instances that are attached to the scaling group.
             */
            public Builder DBInstanceIds(java.util.List < String > DBInstanceIds) {
                this.DBInstanceIds = DBInstanceIds;
                return this;
            }

            /**
             * The databases that are attached to the scaling group.
             */
            public Builder DBInstances(java.util.List < DBInstances> DBInstances) {
                this.DBInstances = DBInstances;
                return this;
            }

            /**
             * The cooldown period of the scaling group. During the cooldown period, Auto Scaling does not execute the scaling activities that are triggered by [CloudMonitor](~~35170~~) event-triggered tasks.
             */
            public Builder defaultCooldown(Integer defaultCooldown) {
                this.defaultCooldown = defaultCooldown;
                return this;
            }

            /**
             * The expected number of ECS instances in the scaling group. Auto Scaling automatically maintains the expected number of ECS instances.
             */
            public Builder desiredCapacity(Integer desiredCapacity) {
                this.desiredCapacity = desiredCapacity;
                return this;
            }

            /**
             * Indicates whether the Expected Number of Instances feature is enabled. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder enableDesiredCapacity(Boolean enableDesiredCapacity) {
                this.enableDesiredCapacity = enableDesiredCapacity;
                return this;
            }

            /**
             * Indicates whether the Deletion Protection feature is enabled for the scaling group. Valid values:
             * <p>
             * 
             * *   true: The Deletion Protection feature is enabled for the scaling group. The scaling group cannot be deleted.
             * *   false: The Deletion Protection feature is disabled for the scaling group.
             */
            public Builder groupDeletionProtection(Boolean groupDeletionProtection) {
                this.groupDeletionProtection = groupDeletionProtection;
                return this;
            }

            /**
             * The type of instances that are managed by the scaling group.
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * The health check mode of the scaling group. Valid values:
             * <p>
             * 
             * *   NONE: Auto Scaling does not perform health checks.
             * *   ECS: Auto Scaling checks the health status of ECS instances in the scaling group.
             * *   LOAD_BALANCER: Auto Scaling checks the health status of instances in the scaling group based on the health check results of load balancers. The health check results of Classic Load Balancer (CLB, formerly known as Server Load Balancer or SLB) instances are not used as the basis to perform health checks on the instances in the scaling group.
             */
            public Builder healthCheckType(String healthCheckType) {
                this.healthCheckType = healthCheckType;
                return this;
            }

            /**
             * The health check modes of the scaling group. Valid values:
             * <p>
             * 
             * *   NONE: Auto Scaling does not perform health checks.
             * *   ECS: Auto Scaling checks the health status of ECS instances in the scaling group.
             * *   LOAD_BALANCER: Auto Scaling checks the health status of instances in the scaling group based on the health check results of load balancers. The health check results of CLB instances are not used as the basis to perform health checks on the instances in the scaling group.
             */
            public Builder healthCheckTypes(java.util.List < String > healthCheckTypes) {
                this.healthCheckTypes = healthCheckTypes;
                return this;
            }

            /**
             * The number of instances that are initialized before they are added into the scaling group.
             */
            public Builder initCapacity(Integer initCapacity) {
                this.initCapacity = initCapacity;
                return this;
            }

            /**
             * >  This parameter is not available for use.
             */
            public Builder isElasticStrengthInAlarm(Boolean isElasticStrengthInAlarm) {
                this.isElasticStrengthInAlarm = isElasticStrengthInAlarm;
                return this;
            }

            /**
             * The ID of the launch template that is used by the scaling group.
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * The instance types that are extended in the launch template.
             */
            public Builder launchTemplateOverrides(java.util.List < LaunchTemplateOverrides> launchTemplateOverrides) {
                this.launchTemplateOverrides = launchTemplateOverrides;
                return this;
            }

            /**
             * The version of the launch template that is used by the scaling group.
             */
            public Builder launchTemplateVersion(String launchTemplateVersion) {
                this.launchTemplateVersion = launchTemplateVersion;
                return this;
            }

            /**
             * The status of the scaling group. Valid values:
             * <p>
             * 
             * *   Active: The scaling group is active. Active scaling groups can receive requests to execute scaling rules and trigger scaling activities.
             * *   Inactive: The scaling group is in the Disabled state. Disabled scaling groups cannot receive requests to execute scaling rules.
             * *   Deleting: The scaling group is being deleted. Scaling groups that are being deleted cannot receive requests to execute scaling rules, and the parameter settings of the scaling groups cannot be modified.
             */
            public Builder lifecycleState(String lifecycleState) {
                this.lifecycleState = lifecycleState;
                return this;
            }

            /**
             * The load balancer configurations.
             */
            public Builder loadBalancerConfigs(java.util.List < LoadBalancerConfigs> loadBalancerConfigs) {
                this.loadBalancerConfigs = loadBalancerConfigs;
                return this;
            }

            /**
             * The IDs of the load balancers that are attached to the scaling group.
             */
            public Builder loadBalancerIds(java.util.List < String > loadBalancerIds) {
                this.loadBalancerIds = loadBalancerIds;
                return this;
            }

            /**
             * The maximum life span of each ECS instance in the scaling group. Unit: seconds.
             * <p>
             * 
             * Valid values: 0 or `[86400, Integer.maxValue]`. A value of 0 for MaxInstanceLifetime indicates that a previously set limit has been removed. This effectively disables the maximum instance lifetime constraint.
             * 
             * Default value: null.
             * 
             * >  This parameter is not supported by scaling groups of the Elastic Container Instance type and scaling groups whose ScalingPolicy is set to Recycle.
             */
            public Builder maxInstanceLifetime(Integer maxInstanceLifetime) {
                this.maxInstanceLifetime = maxInstanceLifetime;
                return this;
            }

            /**
             * The maximum number of ECS instances that can be contained in the scaling group.
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * The minimum number of ECS instances that must be contained in the scaling group.
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * The time when the scaling group was last modified.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * The ID of the CloudMonitor application group that is associated with the scaling group.
             */
            public Builder monitorGroupId(String monitorGroupId) {
                this.monitorGroupId = monitorGroupId;
                return this;
            }

            /**
             * The scaling policy of the ECS instances in the multi-zone scaling group. Valid values:
             * <p>
             * 
             * *   PRIORITY: ECS instances are created based on the value of VSwitchIds. If Auto Scaling cannot create ECS instances in the zone where the vSwitch of the highest priority resides, Auto Scaling creates ECS instances in the zone where the vSwitch of the next highest priority resides.
             * 
             * *   COST_OPTIMIZED: ECS instances are created based on the unit prices of their vCPUs. Auto Scaling preferentially creates ECS instances whose vCPUs are provided at the lowest price. If preemptible instance types are specified in the scaling configuration, Auto Scaling preferentially creates preemptible instances. You can also specify CompensateWithOnDemand to allow Auto Scaling to create pay-as-you-go instances if preemptible instances cannot be created due to limited stock.
             * 
             *     **
             * 
             *     **Note** The COST_OPTIMIZED setting takes effect only if your scaling configuration contains multiple instance types or contains preemptible instance types.
             * 
             * *   BALANCE: ECS instances are evenly distributed across the zones that are specified for the scaling group. If ECS instances become unevenly distributed across the specified zones due to limited instance type availability, you can call the RebalanceInstance operation to balance the distribution of the ECS instances.
             */
            public Builder multiAZPolicy(String multiAZPolicy) {
                this.multiAZPolicy = multiAZPolicy;
                return this;
            }

            /**
             * The minimum number of pay-as-you-go instances that must be contained in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances is less than the value of this parameter, Auto Scaling preferentially creates pay-as-you-go instances.
             */
            public Builder onDemandBaseCapacity(Integer onDemandBaseCapacity) {
                this.onDemandBaseCapacity = onDemandBaseCapacity;
                return this;
            }

            /**
             * The percentage of pay-as-you-go instances in excess when the minimum number of pay-as-you-go instances reaches the threshold. Valid values: 0 to 100.
             */
            public Builder onDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
                this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
                return this;
            }

            /**
             * The number of ECS instances that are being added to the scaling group and configured.
             */
            public Builder pendingCapacity(Integer pendingCapacity) {
                this.pendingCapacity = pendingCapacity;
                return this;
            }

            /**
             * The number of ECS instances that are in the Pending Add state in the scaling group.
             */
            public Builder pendingWaitCapacity(Integer pendingWaitCapacity) {
                this.pendingWaitCapacity = pendingWaitCapacity;
                return this;
            }

            /**
             * The number of ECS instances that are in the Protected state in the scaling group.
             */
            public Builder protectedCapacity(Integer protectedCapacity) {
                this.protectedCapacity = protectedCapacity;
                return this;
            }

            /**
             * The region ID of the scaling group.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The instance removal policies. Valid values:
             * <p>
             * 
             * *   OldestInstance: Auto Scaling removes ECS instances that are added at the earliest point in time to the scaling group.
             * *   NewestInstance: Auto Scaling removes ECS instances that are most recently added to the scaling group.
             * *   OldestScalingConfiguration: Auto Scaling removes ECS instances that are created from the earliest scaling configuration.
             */
            public Builder removalPolicies(java.util.List < String > removalPolicies) {
                this.removalPolicies = removalPolicies;
                return this;
            }

            /**
             * The number of ECS instances that are being removed from the scaling group.
             */
            public Builder removingCapacity(Integer removingCapacity) {
                this.removingCapacity = removingCapacity;
                return this;
            }

            /**
             * The number of ECS instances that are in the Pending Remove state in the scaling group.
             */
            public Builder removingWaitCapacity(Integer removingWaitCapacity) {
                this.removingWaitCapacity = removingWaitCapacity;
                return this;
            }

            /**
             * The ID of the resource group to which the scaling group belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ID of the scaling group.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * The name of the scaling group.
             */
            public Builder scalingGroupName(String scalingGroupName) {
                this.scalingGroupName = scalingGroupName;
                return this;
            }

            /**
             * The instance reclaim mode of the scaling group. Valid values:
             * <p>
             * 
             * *   recycle: economical mode.
             * *   release: release mode.
             * *   forcerelease: forced release mode.
             * 
             * For more information, see [RemoveInstances](~~25955~~).
             */
            public Builder scalingPolicy(String scalingPolicy) {
                this.scalingPolicy = scalingPolicy;
                return this;
            }

            /**
             * The server groups.
             * <p>
             * 
             * >  You can use this parameter to obtain information about ALB server groups and Network Load Balancer (NLB) server groups attached to the scaling group.
             */
            public Builder serverGroups(java.util.List < ServerGroups> serverGroups) {
                this.serverGroups = serverGroups;
                return this;
            }

            /**
             * The allocation policy of preemptible instances. This parameter indicates the manner in which Auto Scaling selects instance types to create the required number of preemptible instances. This parameter takes effect only if you set `MultiAZPolicy` to `COMPOSABLE`. Valid values:
             * <p>
             * 
             * *   priority: Auto Scaling adopts the predefined instance type sequence to create the required number of preemptible instances.
             * *   lowestPrice: Auto Scaling selects instance types that have the most economical vCPU pricing to create the required number of preemptible instances.
             * 
             * Default value: priority.
             */
            public Builder spotAllocationStrategy(String spotAllocationStrategy) {
                this.spotAllocationStrategy = spotAllocationStrategy;
                return this;
            }

            /**
             * 伸缩组中抢占式实例的数量。
             */
            public Builder spotCapacity(Integer spotCapacity) {
                this.spotCapacity = spotCapacity;
                return this;
            }

            /**
             * The number of instance types in the scaling group. Auto Scaling evenly creates preemptible instances of multiple instance types that are provided at the lowest price across the zones of the scaling group. Valid values: 0 to 10.
             */
            public Builder spotInstancePools(Integer spotInstancePools) {
                this.spotInstancePools = spotInstancePools;
                return this;
            }

            /**
             * Indicates whether preemptible instances can be supplemented. If this parameter is set to true, Auto Scaling proactively creates instances to replace the preemptible instances for reclamation when Auto Scaling receives a system notification.
             */
            public Builder spotInstanceRemedy(Boolean spotInstanceRemedy) {
                this.spotInstanceRemedy = spotInstanceRemedy;
                return this;
            }

            /**
             * The number of ECS instances that are in the Standby state in the scaling group.
             */
            public Builder standbyCapacity(Integer standbyCapacity) {
                this.standbyCapacity = standbyCapacity;
                return this;
            }

            /**
             * The number of instances that was stopped in Economical Mode in the scaling group.
             */
            public Builder stoppedCapacity(Integer stoppedCapacity) {
                this.stoppedCapacity = stoppedCapacity;
                return this;
            }

            /**
             * The processes that are suspended. If no process is suspended, null is returned. Valid values:
             * <p>
             * 
             * *   ScaleIn: scale-in processes.
             * *   ScaleOut: scale-out processes.
             * *   HealthCheck: health check processes.
             * *   AlarmNotification: event-triggered task processes.
             * *   ScheduledAction: scheduled task processes.
             */
            public Builder suspendedProcesses(java.util.List < String > suspendedProcesses) {
                this.suspendedProcesses = suspendedProcesses;
                return this;
            }

            /**
             * Indicates whether Auto Scaling stops executing scaling activities in the scaling group. Valid values:
             * <p>
             * 
             * *   true: Auto Scaling stops executing scaling activities in the scaling group if the scaling activities failed for more than seven consecutive days in the scaling group. In this case, you must modify the scaling group or scaling configuration to resume the scaling activities.
             * *   false: Auto Scaling does not stop executing scaling activities in the scaling group.
             */
            public Builder systemSuspended(Boolean systemSuspended) {
                this.systemSuspended = systemSuspended;
                return this;
            }

            /**
             * The tags of the scaling group.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The total weighted capacity of all ECS instances in the scaling group if Weighted is specified. In other cases, this parameter specifies the total number of ECS instances in the scaling group.
             */
            public Builder totalCapacity(Integer totalCapacity) {
                this.totalCapacity = totalCapacity;
                return this;
            }

            /**
             * The total number of ECS instances in the scaling group.
             */
            public Builder totalInstanceCount(Integer totalInstanceCount) {
                this.totalInstanceCount = totalInstanceCount;
                return this;
            }

            /**
             * The backend vServer groups.
             */
            public Builder vServerGroups(java.util.List < VServerGroups> vServerGroups) {
                this.vServerGroups = vServerGroups;
                return this;
            }

            /**
             * The vSwitch ID of the scaling group.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The IDs of the vSwitches that are associated with the scaling group. If you specify VSwitchIds, VSwitchId is ignored.
             */
            public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC) in which the scaling group resides.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public ScalingGroups build() {
                return new ScalingGroups(this);
            } 

        } 

    }
}
