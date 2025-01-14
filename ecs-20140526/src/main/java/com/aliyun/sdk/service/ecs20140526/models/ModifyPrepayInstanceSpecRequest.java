// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPrepayInstanceSpecRequest} extends {@link RequestModel}
 *
 * <p>ModifyPrepayInstanceSpecRequest</p>
 */
public class ModifyPrepayInstanceSpecRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Disk")
    private java.util.List < Disk> disk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MigrateAcrossZone")
    private Boolean migrateAcrossZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyMode")
    private String modifyMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperatorType")
    private String operatorType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RebootTime")
    private String rebootTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RebootWhenFinished")
    private Boolean rebootWhenFinished;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyPrepayInstanceSpecRequest(Builder builder) {
        super(builder);
        this.systemDisk = builder.systemDisk;
        this.sourceRegionId = builder.sourceRegionId;
        this.autoPay = builder.autoPay;
        this.clientToken = builder.clientToken;
        this.disk = builder.disk;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.migrateAcrossZone = builder.migrateAcrossZone;
        this.modifyMode = builder.modifyMode;
        this.operatorType = builder.operatorType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.rebootTime = builder.rebootTime;
        this.rebootWhenFinished = builder.rebootWhenFinished;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPrepayInstanceSpecRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return disk
     */
    public java.util.List < Disk> getDisk() {
        return this.disk;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return migrateAcrossZone
     */
    public Boolean getMigrateAcrossZone() {
        return this.migrateAcrossZone;
    }

    /**
     * @return modifyMode
     */
    public String getModifyMode() {
        return this.modifyMode;
    }

    /**
     * @return operatorType
     */
    public String getOperatorType() {
        return this.operatorType;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return rebootTime
     */
    public String getRebootTime() {
        return this.rebootTime;
    }

    /**
     * @return rebootWhenFinished
     */
    public Boolean getRebootWhenFinished() {
        return this.rebootWhenFinished;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<ModifyPrepayInstanceSpecRequest, Builder> {
        private SystemDisk systemDisk; 
        private String sourceRegionId; 
        private Boolean autoPay; 
        private String clientToken; 
        private java.util.List < Disk> disk; 
        private String endTime; 
        private String instanceId; 
        private String instanceType; 
        private Boolean migrateAcrossZone; 
        private String modifyMode; 
        private String operatorType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String rebootTime; 
        private Boolean rebootWhenFinished; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPrepayInstanceSpecRequest request) {
            super(request);
            this.systemDisk = request.systemDisk;
            this.sourceRegionId = request.sourceRegionId;
            this.autoPay = request.autoPay;
            this.clientToken = request.clientToken;
            this.disk = request.disk;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.migrateAcrossZone = request.migrateAcrossZone;
            this.modifyMode = request.modifyMode;
            this.operatorType = request.operatorType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.rebootTime = request.rebootTime;
            this.rebootWhenFinished = request.rebootWhenFinished;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * SystemDisk.
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.putQueryParameter("SystemDisk", systemDisk);
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * Specifies whether to enable automatic payment when you upgrade the instance type. Valid values:
         * <p>
         * 
         * *   true: enables automatic payment.
         * 
         *     **
         * 
         *     **Note** Make sure that your account balance is sufficient. Otherwise, your order becomes invalid and must be canceled. If your account balance is insufficient, you can set `AutoPay` to `false` to generate an unpaid order. Then, you can log on to the ECS console to pay for the order.
         * 
         * *   false: disables automatic payment. An order is generated but no payment is made.
         * 
         * Default value: true.
         * 
         * When `OperatorType` is set to `downgrade`, `AutoPay` is ignored.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * The client token that you want to use to ensure the idempotency of the request. You can use the client to generate the value, but make sure that the value is unique among different requests. This value allows only ASCII characters and is up to 64 characters in length. For more information, see [How do I ensure the idempotence of a request?](~~25693~~)
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * >  This parameter is not publicly available.
         */
        public Builder disk(java.util.List < Disk> disk) {
            this.putQueryParameter("Disk", disk);
            this.disk = disk;
            return this;
        }

        /**
         * The end time of the temporary change. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The new instance type. For information about available instance types, see [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Specifies whether cross-cluster instance type upgrades are supported. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: false.
         * 
         * When you set `MigrateAcrossZone` to `true` and you upgrade the instance type of an instance based on the returned information, take note of the following items:
         * 
         * Instance that resides in the classic network:
         * 
         * *   For [retired instance types](~~55263~~), when a non-I/O optimized instance is upgraded to an I/O optimized instance, the private IP address, disk device names, and software authorization codes of the instance change. For a Linux instance, basic disks (cloud) are identified as xvd\* such as xvda and xvdb, and ultra disks (cloud_efficiency) and standard SSDs (cloud_ssd) are identified as vd\* such as vda and vdb.
         * *   For [instance families available for purchase](~~25378~~), the private IP address of the instance changes.
         * 
         * Instance that resides in a virtual private cloud (VPC): For retired instance types, when a non-I/O optimized instance is upgraded to an I/O optimized instance, the disk device names and software authorization codes of the instance change. For a Linux instance, basic disks (cloud) are identified as xvd\* such as xvda and xvdb, and ultra disks (cloud_efficiency) and standard SSDs (cloud_ssd) are identified as vd\* such as vda and vdb.
         */
        public Builder migrateAcrossZone(Boolean migrateAcrossZone) {
            this.putQueryParameter("MigrateAcrossZone", migrateAcrossZone);
            this.migrateAcrossZone = migrateAcrossZone;
            return this;
        }

        /**
         * >  This parameter is not publicly available.
         */
        public Builder modifyMode(String modifyMode) {
            this.putQueryParameter("ModifyMode", modifyMode);
            this.modifyMode = modifyMode;
            return this;
        }

        /**
         * The type of the change to the instance. Valid values:
         * <p>
         * 
         * >  This parameter is optional. The system can automatically determine whether the instance change is an upgrade or a downgrade. If you want to specify this parameter, refer to the following valid values of the parameter.
         * 
         * *   upgrade: upgrades the instance type. Make sure that the balance in your account is sufficient.
         * *   downgrade: downgrades the instance type. When the new instance type specified by the `InstanceType` parameter has lower specifications than the current instance type, set `OperatorType` to downgrade.
         * 
         * >  You can refer to the preceding usage notes on how to upgrade or downgrade the instance type.
         */
        public Builder operatorType(String operatorType) {
            this.putQueryParameter("OperatorType", operatorType);
            this.operatorType = operatorType;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The restart time of the instance. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         */
        public Builder rebootTime(String rebootTime) {
            this.putQueryParameter("RebootTime", rebootTime);
            this.rebootTime = rebootTime;
            return this;
        }

        /**
         * Specifies whether to restart the instance immediately after the instance type is changed. Valid values:
         * <p>
         * 
         * *   true: restart the instance immediately after the instance type is changed.
         * *   false: does not restart the instance immediately after the instance type is changed.
         * 
         * Default value: false.
         * 
         * >  If the instance is in the **Stopping** state, the instance status remains unchanged and no operations are performed after the instance type is change regardless of whether you set the `RebootWhenFinished` parameter to true.
         */
        public Builder rebootWhenFinished(Boolean rebootWhenFinished) {
            this.putQueryParameter("RebootWhenFinished", rebootWhenFinished);
            this.rebootWhenFinished = rebootWhenFinished;
            return this;
        }

        /**
         * The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public ModifyPrepayInstanceSpecRequest build() {
            return new ModifyPrepayInstanceSpecRequest(this);
        } 

    } 

    public static class SystemDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        private SystemDisk(Builder builder) {
            this.category = builder.category;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        public static final class Builder {
            private String category; 

            /**
             * The new category of the system disk. Valid values:
             * <p>
             * 
             * *   cloud_efficiency: utra disk
             * *   cloud_ssd: standard SSD
             * 
             * >  This parameter takes effect on an instance only when you change from a [retired instance type](~~55263~~) to an instance type in an [instance family available for purchase](~~25378~~) and upgrade the instance from a non-I/O optimized instance type to an I/O optimized instance type.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
    public static class Disk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        private Disk(Builder builder) {
            this.category = builder.category;
            this.diskId = builder.diskId;
            this.performanceLevel = builder.performanceLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public static final class Builder {
            private String category; 
            private String diskId; 
            private String performanceLevel; 

            /**
             * >  This parameter is not publicly available.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * >  This parameter is not publicly available.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * >  This parameter is not publicly available.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            public Disk build() {
                return new Disk(this);
            } 

        } 

    }
}
