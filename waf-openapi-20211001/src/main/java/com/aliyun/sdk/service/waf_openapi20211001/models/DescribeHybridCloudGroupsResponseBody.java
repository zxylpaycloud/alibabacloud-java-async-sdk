// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHybridCloudGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridCloudGroupsResponseBody</p>
 */
public class DescribeHybridCloudGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Groups")
    private java.util.List < Groups> groups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeHybridCloudGroupsResponseBody(Builder builder) {
        this.groups = builder.groups;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridCloudGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return groups
     */
    public java.util.List < Groups> getGroups() {
        return this.groups;
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

    public static final class Builder {
        private java.util.List < Groups> groups; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The node groups.
         */
        public Builder groups(java.util.List < Groups> groups) {
            this.groups = groups;
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHybridCloudGroupsResponseBody build() {
            return new DescribeHybridCloudGroupsResponseBody(this);
        } 

    } 

    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackSourceMark")
        private String backSourceMark;

        @com.aliyun.core.annotation.NameInMap("ContinentsValue")
        private Integer continentsValue;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Integer groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private String groupType;

        @com.aliyun.core.annotation.NameInMap("LoadBalanceIp")
        private String loadBalanceIp;

        @com.aliyun.core.annotation.NameInMap("LocationId")
        private Long locationId;

        @com.aliyun.core.annotation.NameInMap("OperatorValue")
        private Integer operatorValue;

        @com.aliyun.core.annotation.NameInMap("Ports")
        private String ports;

        @com.aliyun.core.annotation.NameInMap("RegionCodeValue")
        private Integer regionCodeValue;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        private Groups(Builder builder) {
            this.backSourceMark = builder.backSourceMark;
            this.continentsValue = builder.continentsValue;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.loadBalanceIp = builder.loadBalanceIp;
            this.locationId = builder.locationId;
            this.operatorValue = builder.operatorValue;
            this.ports = builder.ports;
            this.regionCodeValue = builder.regionCodeValue;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return backSourceMark
         */
        public String getBackSourceMark() {
            return this.backSourceMark;
        }

        /**
         * @return continentsValue
         */
        public Integer getContinentsValue() {
            return this.continentsValue;
        }

        /**
         * @return groupId
         */
        public Integer getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return groupType
         */
        public String getGroupType() {
            return this.groupType;
        }

        /**
         * @return loadBalanceIp
         */
        public String getLoadBalanceIp() {
            return this.loadBalanceIp;
        }

        /**
         * @return locationId
         */
        public Long getLocationId() {
            return this.locationId;
        }

        /**
         * @return operatorValue
         */
        public Integer getOperatorValue() {
            return this.operatorValue;
        }

        /**
         * @return ports
         */
        public String getPorts() {
            return this.ports;
        }

        /**
         * @return regionCodeValue
         */
        public Integer getRegionCodeValue() {
            return this.regionCodeValue;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private String backSourceMark; 
            private Integer continentsValue; 
            private Integer groupId; 
            private String groupName; 
            private String groupType; 
            private String loadBalanceIp; 
            private Long locationId; 
            private Integer operatorValue; 
            private String ports; 
            private Integer regionCodeValue; 
            private String remark; 

            /**
             * The back-to-origin mark of the protected cluster. The value is in the {ISP name}-{Continent name}-{City name}-{Back-to-origin identifier} format. The back-to-origin identifier is optional.
             * <p>
             * 
             * >  For more information about ISP names, continent names, city names, and back-to-origin identifiers, see the following sections.
             */
            public Builder backSourceMark(String backSourceMark) {
                this.backSourceMark = backSourceMark;
                return this;
            }

            /**
             * The continent code of the protected cluster.
             * <p>
             * 
             * >  For more information about continent codes, see Continent codes in this topic.
             */
            public Builder continentsValue(Integer continentsValue) {
                this.continentsValue = continentsValue;
                return this;
            }

            /**
             * The ID of the node group.
             */
            public Builder groupId(Integer groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the node group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The type of the node group. Valid values:
             * <p>
             * 
             * *   **protect**
             * *   **control**
             * *   **storage**
             * *   **controlStorage**
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * The IP address of the server used for load balancing.
             */
            public Builder loadBalanceIp(String loadBalanceIp) {
                this.loadBalanceIp = loadBalanceIp;
                return this;
            }

            /**
             * The ID of the protection node.
             */
            public Builder locationId(Long locationId) {
                this.locationId = locationId;
                return this;
            }

            /**
             * The ISP code of the protected cluster.
             * <p>
             * 
             * >  For more information about ISP codes, see ISP codes in this topic.
             */
            public Builder operatorValue(Integer operatorValue) {
                this.operatorValue = operatorValue;
                return this;
            }

            /**
             * The port that is used by the hybrid cloud cluster. The value of this parameter is a string. If multiple ports are returned, the value is in the **port1,port2,port3** format.
             */
            public Builder ports(String ports) {
                this.ports = ports;
                return this;
            }

            /**
             * The city code of the protected cluster.
             * <p>
             * 
             * >  For more information about city codes, see City codes in this topic.
             */
            public Builder regionCodeValue(Integer regionCodeValue) {
                this.regionCodeValue = regionCodeValue;
                return this;
            }

            /**
             * The description of the node group.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
}
