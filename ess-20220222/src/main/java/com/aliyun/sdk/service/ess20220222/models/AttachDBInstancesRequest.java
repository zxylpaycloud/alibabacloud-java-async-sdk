// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachDBInstancesRequest} extends {@link RequestModel}
 *
 * <p>AttachDBInstancesRequest</p>
 */
public class AttachDBInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttachMode")
    private String attachMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstances")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > DBInstances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceAttach")
    private Boolean forceAttach;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private AttachDBInstancesRequest(Builder builder) {
        super(builder);
        this.attachMode = builder.attachMode;
        this.clientToken = builder.clientToken;
        this.DBInstances = builder.DBInstances;
        this.forceAttach = builder.forceAttach;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachDBInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachMode
     */
    public String getAttachMode() {
        return this.attachMode;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBInstances
     */
    public java.util.List < String > getDBInstances() {
        return this.DBInstances;
    }

    /**
     * @return forceAttach
     */
    public Boolean getForceAttach() {
        return this.forceAttach;
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
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<AttachDBInstancesRequest, Builder> {
        private String attachMode; 
        private String clientToken; 
        private java.util.List < String > DBInstances; 
        private Boolean forceAttach; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(AttachDBInstancesRequest request) {
            super(request);
            this.attachMode = request.attachMode;
            this.clientToken = request.clientToken;
            this.DBInstances = request.DBInstances;
            this.forceAttach = request.forceAttach;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupId = request.scalingGroupId;
            this.type = request.type;
        } 

        /**
         * The mode in which you want to attach the ApsaraDB RDS instance to the scaling group. Valid values:
         * <p>
         * 
         * *   SecurityIp: the SecurityIp mode. Auto Scaling automatically adds the private IP addresses of the scaled out instances to the IP address whitelist of the ApsaraDB RDS instance. You can select this mode only when you attach an ApsaraDB RDS instance to a scaling group.
         * *   SecurityGroup: the security group mode. Auto Scaling adds the security group of the scaling configuration to the security group whitelist for registration and association.
         */
        public Builder attachMode(String attachMode) {
            this.putQueryParameter("AttachMode", attachMode);
            this.attachMode = attachMode;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests.
         * <p>
         * 
         * The token can only contain ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure the idempotence of a request](~~25965~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the ApsaraDB RDS instance.
         */
        public Builder DBInstances(java.util.List < String > DBInstances) {
            this.putQueryParameter("DBInstances", DBInstances);
            this.DBInstances = DBInstances;
            return this;
        }

        /**
         * Specifies whether to add the private IP addresses of all instances in the scaling group to the IP address whitelist of the ApsaraDB RDS instance. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * Default value: false.
         */
        public Builder forceAttach(Boolean forceAttach) {
            this.putQueryParameter("ForceAttach", forceAttach);
            this.forceAttach = forceAttach;
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
         * The region ID of the scaling group.
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
         * The ID of the scaling group.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * The type of the database that you want to attach to the scaling group. Valid values:
         * <p>
         * 
         * *   ApsaraDB RDS
         * *   ApsaraDB for Redis
         * *   ApsaraDB for MongoDB
         * 
         * Default value: RDS.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public AttachDBInstancesRequest build() {
            return new AttachDBInstancesRequest(this);
        } 

    } 

}
