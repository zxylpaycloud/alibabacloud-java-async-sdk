// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVscMountPointsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVscMountPointsResponseBody</p>
 */
public class DescribeVscMountPointsResponseBody extends TeaModel {
    @NameInMap("MountPoints")
    private java.util.List < MountPoints> mountPoints;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeVscMountPointsResponseBody(Builder builder) {
        this.mountPoints = builder.mountPoints;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVscMountPointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return mountPoints
     */
    public java.util.List < MountPoints> getMountPoints() {
        return this.mountPoints;
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
        private java.util.List < MountPoints> mountPoints; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * MountPoints.
         */
        public Builder mountPoints(java.util.List < MountPoints> mountPoints) {
            this.mountPoints = mountPoints;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeVscMountPointsResponseBody build() {
            return new DescribeVscMountPointsResponseBody(this);
        } 

    } 

    public static class Vscs extends TeaModel {
        @NameInMap("VscId")
        private String vscId;

        @NameInMap("VscStatus")
        private String vscStatus;

        @NameInMap("VscType")
        private String vscType;

        private Vscs(Builder builder) {
            this.vscId = builder.vscId;
            this.vscStatus = builder.vscStatus;
            this.vscType = builder.vscType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vscs create() {
            return builder().build();
        }

        /**
         * @return vscId
         */
        public String getVscId() {
            return this.vscId;
        }

        /**
         * @return vscStatus
         */
        public String getVscStatus() {
            return this.vscStatus;
        }

        /**
         * @return vscType
         */
        public String getVscType() {
            return this.vscType;
        }

        public static final class Builder {
            private String vscId; 
            private String vscStatus; 
            private String vscType; 

            /**
             * VscId.
             */
            public Builder vscId(String vscId) {
                this.vscId = vscId;
                return this;
            }

            /**
             * VscStatus.
             */
            public Builder vscStatus(String vscStatus) {
                this.vscStatus = vscStatus;
                return this;
            }

            /**
             * VscType.
             */
            public Builder vscType(String vscType) {
                this.vscType = vscType;
                return this;
            }

            public Vscs build() {
                return new Vscs(this);
            } 

        } 

    }
    public static class Instances extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Vscs")
        private java.util.List < Vscs> vscs;

        private Instances(Builder builder) {
            this.instanceId = builder.instanceId;
            this.status = builder.status;
            this.vscs = builder.vscs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vscs
         */
        public java.util.List < Vscs> getVscs() {
            return this.vscs;
        }

        public static final class Builder {
            private String instanceId; 
            private String status; 
            private java.util.List < Vscs> vscs; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Vscs.
             */
            public Builder vscs(java.util.List < Vscs> vscs) {
                this.vscs = vscs;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
    public static class MountPoints extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("InstanceTotalCount")
        private Integer instanceTotalCount;

        @NameInMap("Instances")
        private java.util.List < Instances> instances;

        @NameInMap("MountPointAlias")
        private String mountPointAlias;

        @NameInMap("MountPointId")
        private String mountPointId;

        private MountPoints(Builder builder) {
            this.description = builder.description;
            this.instanceTotalCount = builder.instanceTotalCount;
            this.instances = builder.instances;
            this.mountPointAlias = builder.mountPointAlias;
            this.mountPointId = builder.mountPointId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountPoints create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceTotalCount
         */
        public Integer getInstanceTotalCount() {
            return this.instanceTotalCount;
        }

        /**
         * @return instances
         */
        public java.util.List < Instances> getInstances() {
            return this.instances;
        }

        /**
         * @return mountPointAlias
         */
        public String getMountPointAlias() {
            return this.mountPointAlias;
        }

        /**
         * @return mountPointId
         */
        public String getMountPointId() {
            return this.mountPointId;
        }

        public static final class Builder {
            private String description; 
            private Integer instanceTotalCount; 
            private java.util.List < Instances> instances; 
            private String mountPointAlias; 
            private String mountPointId; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * InstanceTotalCount.
             */
            public Builder instanceTotalCount(Integer instanceTotalCount) {
                this.instanceTotalCount = instanceTotalCount;
                return this;
            }

            /**
             * Instances.
             */
            public Builder instances(java.util.List < Instances> instances) {
                this.instances = instances;
                return this;
            }

            /**
             * MountPointAlias.
             */
            public Builder mountPointAlias(String mountPointAlias) {
                this.mountPointAlias = mountPointAlias;
                return this;
            }

            /**
             * MountPointId.
             */
            public Builder mountPointId(String mountPointId) {
                this.mountPointId = mountPointId;
                return this;
            }

            public MountPoints build() {
                return new MountPoints(this);
            } 

        } 

    }
}
