// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBEndpointAddressRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBEndpointAddressRequest</p>
 */
public class ModifyDBEndpointAddressRequest extends Request {
    @Query
    @NameInMap("ConnectionStringPrefix")
    private String connectionStringPrefix;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("DBEndpointId")
    @Validation(required = true)
    private String DBEndpointId;

    @Query
    @NameInMap("NetType")
    @Validation(required = true)
    private String netType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Port")
    private String port;

    @Query
    @NameInMap("PrivateZoneAddressPrefix")
    private String privateZoneAddressPrefix;

    @Query
    @NameInMap("PrivateZoneName")
    private String privateZoneName;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyDBEndpointAddressRequest(Builder builder) {
        super(builder);
        this.connectionStringPrefix = builder.connectionStringPrefix;
        this.DBClusterId = builder.DBClusterId;
        this.DBEndpointId = builder.DBEndpointId;
        this.netType = builder.netType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.port = builder.port;
        this.privateZoneAddressPrefix = builder.privateZoneAddressPrefix;
        this.privateZoneName = builder.privateZoneName;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBEndpointAddressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionStringPrefix
     */
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBEndpointId
     */
    public String getDBEndpointId() {
        return this.DBEndpointId;
    }

    /**
     * @return netType
     */
    public String getNetType() {
        return this.netType;
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
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return privateZoneAddressPrefix
     */
    public String getPrivateZoneAddressPrefix() {
        return this.privateZoneAddressPrefix;
    }

    /**
     * @return privateZoneName
     */
    public String getPrivateZoneName() {
        return this.privateZoneName;
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

    public static final class Builder extends Request.Builder<ModifyDBEndpointAddressRequest, Builder> {
        private String connectionStringPrefix; 
        private String DBClusterId; 
        private String DBEndpointId; 
        private String netType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String port; 
        private String privateZoneAddressPrefix; 
        private String privateZoneName; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBEndpointAddressRequest request) {
            super(request);
            this.connectionStringPrefix = request.connectionStringPrefix;
            this.DBClusterId = request.DBClusterId;
            this.DBEndpointId = request.DBEndpointId;
            this.netType = request.netType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.port = request.port;
            this.privateZoneAddressPrefix = request.privateZoneAddressPrefix;
            this.privateZoneName = request.privateZoneName;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * ConnectionStringPrefix.
         */
        public Builder connectionStringPrefix(String connectionStringPrefix) {
            this.putQueryParameter("ConnectionStringPrefix", connectionStringPrefix);
            this.connectionStringPrefix = connectionStringPrefix;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * DBEndpointId.
         */
        public Builder DBEndpointId(String DBEndpointId) {
            this.putQueryParameter("DBEndpointId", DBEndpointId);
            this.DBEndpointId = DBEndpointId;
            return this;
        }

        /**
         * NetType.
         */
        public Builder netType(String netType) {
            this.putQueryParameter("NetType", netType);
            this.netType = netType;
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
         * Port.
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * PrivateZoneAddressPrefix.
         */
        public Builder privateZoneAddressPrefix(String privateZoneAddressPrefix) {
            this.putQueryParameter("PrivateZoneAddressPrefix", privateZoneAddressPrefix);
            this.privateZoneAddressPrefix = privateZoneAddressPrefix;
            return this;
        }

        /**
         * PrivateZoneName.
         */
        public Builder privateZoneName(String privateZoneName) {
            this.putQueryParameter("PrivateZoneName", privateZoneName);
            this.privateZoneName = privateZoneName;
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
        public ModifyDBEndpointAddressRequest build() {
            return new ModifyDBEndpointAddressRequest(this);
        } 

    } 

}
