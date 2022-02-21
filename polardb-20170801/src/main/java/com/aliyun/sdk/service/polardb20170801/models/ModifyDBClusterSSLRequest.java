// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBClusterSSLRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterSSLRequest</p>
 */
public class ModifyDBClusterSSLRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("DBEndpointId")
    private String DBEndpointId;

    @Query
    @NameInMap("NetType")
    private String netType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SSLAutoRotate")
    private String SSLAutoRotate;

    @Query
    @NameInMap("SSLEnabled")
    private String SSLEnabled;

    private ModifyDBClusterSSLRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.DBEndpointId = builder.DBEndpointId;
        this.netType = builder.netType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.SSLAutoRotate = builder.SSLAutoRotate;
        this.SSLEnabled = builder.SSLEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterSSLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return SSLAutoRotate
     */
    public String getSSLAutoRotate() {
        return this.SSLAutoRotate;
    }

    /**
     * @return SSLEnabled
     */
    public String getSSLEnabled() {
        return this.SSLEnabled;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterSSLRequest, Builder> {
        private String DBClusterId; 
        private String DBEndpointId; 
        private String netType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String SSLAutoRotate; 
        private String SSLEnabled; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterSSLRequest response) {
            super(response);
            this.DBClusterId = response.DBClusterId;
            this.DBEndpointId = response.DBEndpointId;
            this.netType = response.netType;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.SSLAutoRotate = response.SSLAutoRotate;
            this.SSLEnabled = response.SSLEnabled;
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
         * SSLAutoRotate.
         */
        public Builder SSLAutoRotate(String SSLAutoRotate) {
            this.putQueryParameter("SSLAutoRotate", SSLAutoRotate);
            this.SSLAutoRotate = SSLAutoRotate;
            return this;
        }

        /**
         * SSLEnabled.
         */
        public Builder SSLEnabled(String SSLEnabled) {
            this.putQueryParameter("SSLEnabled", SSLEnabled);
            this.SSLEnabled = SSLEnabled;
            return this;
        }

        @Override
        public ModifyDBClusterSSLRequest build() {
            return new ModifyDBClusterSSLRequest(this);
        } 

    } 

}
