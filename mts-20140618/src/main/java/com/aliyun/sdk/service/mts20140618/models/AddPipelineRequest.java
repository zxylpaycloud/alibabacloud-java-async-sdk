// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPipelineRequest} extends {@link RequestModel}
 *
 * <p>AddPipelineRequest</p>
 */
public class AddPipelineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyConfig")
    private String notifyConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Speed")
    private String speed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpeedLevel")
    private Long speedLevel;

    private AddPipelineRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.notifyConfig = builder.notifyConfig;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.role = builder.role;
        this.speed = builder.speed;
        this.speedLevel = builder.speedLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPipelineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return notifyConfig
     */
    public String getNotifyConfig() {
        return this.notifyConfig;
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
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return speed
     */
    public String getSpeed() {
        return this.speed;
    }

    /**
     * @return speedLevel
     */
    public Long getSpeedLevel() {
        return this.speedLevel;
    }

    public static final class Builder extends Request.Builder<AddPipelineRequest, Builder> {
        private String name; 
        private String notifyConfig; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String role; 
        private String speed; 
        private Long speedLevel; 

        private Builder() {
            super();
        } 

        private Builder(AddPipelineRequest request) {
            super(request);
            this.name = request.name;
            this.notifyConfig = request.notifyConfig;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.role = request.role;
            this.speed = request.speed;
            this.speedLevel = request.speedLevel;
        } 

        /**
         * The name of the MPS queue. The name can be up to 128 bytes in size.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The Message Service (MNS) configuration.
         */
        public Builder notifyConfig(String notifyConfig) {
            this.putQueryParameter("NotifyConfig", notifyConfig);
            this.notifyConfig = notifyConfig;
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
         * The role.
         */
        public Builder role(String role) {
            this.putQueryParameter("Role", role);
            this.role = role;
            return this;
        }

        /**
         * The type of the MPS queue. Valid values:
         * <p>
         * 
         * *   **Boost**: MPS queue with transcoding speed boosted.
         * *   **Standard**: standard MPS queue.
         * *   **NarrowBandHDV2**: MPS queue that supports Narrowband HD 2.0.
         * *   **AIVideoCover**: MPS queue for intelligent snapshot capture.
         * *   **AIVideoTag**: MPS queue for video tagging. The supported regions are China (Shanghai), China (Beijing), and China (Hangzhou).
         * 
         * Default value: **Standard**.
         */
        public Builder speed(String speed) {
            this.putQueryParameter("Speed", speed);
            this.speed = speed;
            return this;
        }

        /**
         * The level of the MPS queue. Valid values: **1 to 3**.
         */
        public Builder speedLevel(Long speedLevel) {
            this.putQueryParameter("SpeedLevel", speedLevel);
            this.speedLevel = speedLevel;
            return this;
        }

        @Override
        public AddPipelineRequest build() {
            return new AddPipelineRequest(this);
        } 

    } 

}
