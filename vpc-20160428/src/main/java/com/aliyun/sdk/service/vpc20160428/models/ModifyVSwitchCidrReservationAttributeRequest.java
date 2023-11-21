// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVSwitchCidrReservationAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyVSwitchCidrReservationAttributeRequest</p>
 */
public class ModifyVSwitchCidrReservationAttributeRequest extends Request {
    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("VSwitchCidrReservationDescription")
    private String vSwitchCidrReservationDescription;

    @Query
    @NameInMap("VSwitchCidrReservationId")
    @Validation(required = true)
    private String vSwitchCidrReservationId;

    @Query
    @NameInMap("VSwitchCidrReservationName")
    private String vSwitchCidrReservationName;

    private ModifyVSwitchCidrReservationAttributeRequest(Builder builder) {
        super(builder);
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.vSwitchCidrReservationDescription = builder.vSwitchCidrReservationDescription;
        this.vSwitchCidrReservationId = builder.vSwitchCidrReservationId;
        this.vSwitchCidrReservationName = builder.vSwitchCidrReservationName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVSwitchCidrReservationAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return vSwitchCidrReservationDescription
     */
    public String getVSwitchCidrReservationDescription() {
        return this.vSwitchCidrReservationDescription;
    }

    /**
     * @return vSwitchCidrReservationId
     */
    public String getVSwitchCidrReservationId() {
        return this.vSwitchCidrReservationId;
    }

    /**
     * @return vSwitchCidrReservationName
     */
    public String getVSwitchCidrReservationName() {
        return this.vSwitchCidrReservationName;
    }

    public static final class Builder extends Request.Builder<ModifyVSwitchCidrReservationAttributeRequest, Builder> {
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String vSwitchCidrReservationDescription; 
        private String vSwitchCidrReservationId; 
        private String vSwitchCidrReservationName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVSwitchCidrReservationAttributeRequest request) {
            super(request);
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.vSwitchCidrReservationDescription = request.vSwitchCidrReservationDescription;
            this.vSwitchCidrReservationId = request.vSwitchCidrReservationId;
            this.vSwitchCidrReservationName = request.vSwitchCidrReservationName;
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
         * The ID of the region where the vSwitch is deployed.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
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

        /**
         * The new description of the reserved CIDR block. The default value is empty.
         * <p>
         * 
         * The description must be 2 to 256 characters in length. It must start with a letter and cannot start with `http://` or `https://`.
         */
        public Builder vSwitchCidrReservationDescription(String vSwitchCidrReservationDescription) {
            this.putQueryParameter("VSwitchCidrReservationDescription", vSwitchCidrReservationDescription);
            this.vSwitchCidrReservationDescription = vSwitchCidrReservationDescription;
            return this;
        }

        /**
         * The ID of the reserved CIDR block.
         */
        public Builder vSwitchCidrReservationId(String vSwitchCidrReservationId) {
            this.putQueryParameter("VSwitchCidrReservationId", vSwitchCidrReservationId);
            this.vSwitchCidrReservationId = vSwitchCidrReservationId;
            return this;
        }

        /**
         * The new name of the reserved CIDR block.
         * <p>
         * 
         * The name must be 2 to 128 characters in length and can contain letters, digits, underscores (\_), and hyphens (-). It must start with a letter.
         */
        public Builder vSwitchCidrReservationName(String vSwitchCidrReservationName) {
            this.putQueryParameter("VSwitchCidrReservationName", vSwitchCidrReservationName);
            this.vSwitchCidrReservationName = vSwitchCidrReservationName;
            return this;
        }

        @Override
        public ModifyVSwitchCidrReservationAttributeRequest build() {
            return new ModifyVSwitchCidrReservationAttributeRequest(this);
        } 

    } 

}
