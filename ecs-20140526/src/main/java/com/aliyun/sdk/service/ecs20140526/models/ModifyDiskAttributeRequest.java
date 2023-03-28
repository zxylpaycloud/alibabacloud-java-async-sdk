// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDiskAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDiskAttributeRequest</p>
 */
public class ModifyDiskAttributeRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("BurstingEnabled")
    private Boolean burstingEnabled;

    @Query
    @NameInMap("DeleteAutoSnapshot")
    private Boolean deleteAutoSnapshot;

    @Query
    @NameInMap("DeleteWithInstance")
    private Boolean deleteWithInstance;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DiskId")
    private String diskId;

    @Query
    @NameInMap("DiskIds")
    private java.util.List < String > diskIds;

    @Query
    @NameInMap("DiskName")
    private String diskName;

    @Query
    @NameInMap("EnableAutoSnapshot")
    private Boolean enableAutoSnapshot;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyDiskAttributeRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.burstingEnabled = builder.burstingEnabled;
        this.deleteAutoSnapshot = builder.deleteAutoSnapshot;
        this.deleteWithInstance = builder.deleteWithInstance;
        this.description = builder.description;
        this.diskId = builder.diskId;
        this.diskIds = builder.diskIds;
        this.diskName = builder.diskName;
        this.enableAutoSnapshot = builder.enableAutoSnapshot;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDiskAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return burstingEnabled
     */
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    /**
     * @return deleteAutoSnapshot
     */
    public Boolean getDeleteAutoSnapshot() {
        return this.deleteAutoSnapshot;
    }

    /**
     * @return deleteWithInstance
     */
    public Boolean getDeleteWithInstance() {
        return this.deleteWithInstance;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return diskIds
     */
    public java.util.List < String > getDiskIds() {
        return this.diskIds;
    }

    /**
     * @return diskName
     */
    public String getDiskName() {
        return this.diskName;
    }

    /**
     * @return enableAutoSnapshot
     */
    public Boolean getEnableAutoSnapshot() {
        return this.enableAutoSnapshot;
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

    public static final class Builder extends Request.Builder<ModifyDiskAttributeRequest, Builder> {
        private String sourceRegionId; 
        private Boolean burstingEnabled; 
        private Boolean deleteAutoSnapshot; 
        private Boolean deleteWithInstance; 
        private String description; 
        private String diskId; 
        private java.util.List < String > diskIds; 
        private String diskName; 
        private Boolean enableAutoSnapshot; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDiskAttributeRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.burstingEnabled = request.burstingEnabled;
            this.deleteAutoSnapshot = request.deleteAutoSnapshot;
            this.deleteWithInstance = request.deleteWithInstance;
            this.description = request.description;
            this.diskId = request.diskId;
            this.diskIds = request.diskIds;
            this.diskName = request.diskName;
            this.enableAutoSnapshot = request.enableAutoSnapshot;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
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
         * Specifies whether to enable the performance burst feature for disk N. Valid values:
         * <p>
         * 
         * *   true: enables the performance burst feature.
         * *   false: disables the performance burst feature.
         */
        public Builder burstingEnabled(Boolean burstingEnabled) {
            this.putQueryParameter("BurstingEnabled", burstingEnabled);
            this.burstingEnabled = burstingEnabled;
            return this;
        }

        /**
         * Specifies whether to delete the automatic snapshots of the disk when the disk is released. By default, this parameter is left empty, which specifies that the current value remains unchanged.
         */
        public Builder deleteAutoSnapshot(Boolean deleteAutoSnapshot) {
            this.putQueryParameter("DeleteAutoSnapshot", deleteAutoSnapshot);
            this.deleteAutoSnapshot = deleteAutoSnapshot;
            return this;
        }

        /**
         * Specifies whether to release the disk together with the associated instance. By default, this parameter is left empty, which specifies that the current value remains unchanged.
         * <p>
         * 
         * If you set the `DeleteWithInstance` parameter to `false` in one of the following cases, an error is returned:
         * 
         * *   The disk is a local disk.
         * *   The disk is a basic disk and not removable. If the Portable attribute of a disk is set to false, the disk is not removable.
         */
        public Builder deleteWithInstance(Boolean deleteWithInstance) {
            this.putQueryParameter("DeleteWithInstance", deleteWithInstance);
            this.deleteWithInstance = deleteWithInstance;
            return this;
        }

        /**
         * The description of the disk. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the disk.
         * <p>
         * 
         * >  You can specify the `DiskId` parameter or the `DiskIds.N` parameter, but you cannot specify both parameters at the same time.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * The IDs of the disks whose attributes you want to modify. Valid values of N: 0 to 100.
         * <p>
         * 
         * >  You can specify the `DiskId` parameter or the `DiskIds.N` parameter, but you cannot specify both parameters at the same time.
         */
        public Builder diskIds(java.util.List < String > diskIds) {
            this.putQueryParameter("DiskIds", diskIds);
            this.diskIds = diskIds;
            return this;
        }

        /**
         * The name of the disk. The name must be 2 to 128 characters in length. The name must start with a letter but cannot start with `http://` or `https://`. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
         */
        public Builder diskName(String diskName) {
            this.putQueryParameter("DiskName", diskName);
            this.diskName = diskName;
            return this;
        }

        /**
         * Specifies whether to enable the automatic snapshot policy feature for the disk.
         * <p>
         * 
         * *   true: enables the automatic snapshot policy feature for the disk.
         * *   false: disables the automatic snapshot policy feature for the disk.
         * 
         * By default, this parameter is left empty, which specifies that the current value remains unchanged.
         * 
         * > : By default, the automatic snapshot policy feature is enabled for new disks. You need to only apply an automatic snapshot policy to a disk for the policy to take effect.
         */
        public Builder enableAutoSnapshot(Boolean enableAutoSnapshot) {
            this.putQueryParameter("EnableAutoSnapshot", enableAutoSnapshot);
            this.enableAutoSnapshot = enableAutoSnapshot;
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
         * The ID of the region. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
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
        public ModifyDiskAttributeRequest build() {
            return new ModifyDiskAttributeRequest(this);
        } 

    } 

}
