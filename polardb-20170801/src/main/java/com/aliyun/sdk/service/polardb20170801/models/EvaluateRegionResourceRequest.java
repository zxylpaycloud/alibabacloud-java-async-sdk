// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EvaluateRegionResourceRequest} extends {@link RequestModel}
 *
 * <p>EvaluateRegionResourceRequest</p>
 */
public class EvaluateRegionResourceRequest extends Request {
    @Query
    @NameInMap("DBInstanceConnType")
    private String DBInstanceConnType;

    @Query
    @NameInMap("DBNodeClass")
    @Validation(required = true)
    private String DBNodeClass;

    @Query
    @NameInMap("DBType")
    @Validation(required = true)
    private String DBType;

    @Query
    @NameInMap("DBVersion")
    @Validation(required = true)
    private String DBVersion;

    @Query
    @NameInMap("DispenseMode")
    private String dispenseMode;

    @Query
    @NameInMap("NeedMaxScaleLink")
    @Validation(required = true)
    private String needMaxScaleLink;

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
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SubDomain")
    private String subDomain;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private EvaluateRegionResourceRequest(Builder builder) {
        super(builder);
        this.DBInstanceConnType = builder.DBInstanceConnType;
        this.DBNodeClass = builder.DBNodeClass;
        this.DBType = builder.DBType;
        this.DBVersion = builder.DBVersion;
        this.dispenseMode = builder.dispenseMode;
        this.needMaxScaleLink = builder.needMaxScaleLink;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.subDomain = builder.subDomain;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EvaluateRegionResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceConnType
     */
    public String getDBInstanceConnType() {
        return this.DBInstanceConnType;
    }

    /**
     * @return DBNodeClass
     */
    public String getDBNodeClass() {
        return this.DBNodeClass;
    }

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * @return DBVersion
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * @return dispenseMode
     */
    public String getDispenseMode() {
        return this.dispenseMode;
    }

    /**
     * @return needMaxScaleLink
     */
    public String getNeedMaxScaleLink() {
        return this.needMaxScaleLink;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return subDomain
     */
    public String getSubDomain() {
        return this.subDomain;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<EvaluateRegionResourceRequest, Builder> {
        private String DBInstanceConnType; 
        private String DBNodeClass; 
        private String DBType; 
        private String DBVersion; 
        private String dispenseMode; 
        private String needMaxScaleLink; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String subDomain; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(EvaluateRegionResourceRequest request) {
            super(request);
            this.DBInstanceConnType = request.DBInstanceConnType;
            this.DBNodeClass = request.DBNodeClass;
            this.DBType = request.DBType;
            this.DBVersion = request.DBVersion;
            this.dispenseMode = request.dispenseMode;
            this.needMaxScaleLink = request.needMaxScaleLink;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.subDomain = request.subDomain;
            this.zoneId = request.zoneId;
        } 

        /**
         * 指定实例链路类型，默认为后端随机选择，可取值为：lvs|proxy|dns
         */
        public Builder DBInstanceConnType(String DBInstanceConnType) {
            this.putQueryParameter("DBInstanceConnType", DBInstanceConnType);
            this.DBInstanceConnType = DBInstanceConnType;
            return this;
        }

        /**
         * 实例规格
         */
        public Builder DBNodeClass(String DBNodeClass) {
            this.putQueryParameter("DBNodeClass", DBNodeClass);
            this.DBNodeClass = DBNodeClass;
            return this;
        }

        /**
         * 引擎
         */
        public Builder DBType(String DBType) {
            this.putQueryParameter("DBType", DBType);
            this.DBType = DBType;
            return this;
        }

        /**
         * 引擎版本
         */
        public Builder DBVersion(String DBVersion) {
            this.putQueryParameter("DBVersion", DBVersion);
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * 可用区模式（传统模式、多可用区模式）
         */
        public Builder dispenseMode(String dispenseMode) {
            this.putQueryParameter("DispenseMode", dispenseMode);
            this.dispenseMode = dispenseMode;
            return this;
        }

        /**
         * 是否创建Maxscale
         */
        public Builder needMaxScaleLink(String needMaxScaleLink) {
            this.putQueryParameter("NeedMaxScaleLink", needMaxScaleLink);
            this.needMaxScaleLink = needMaxScaleLink;
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
         * 地域ID
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 资源组Id
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * 子域
         */
        public Builder subDomain(String subDomain) {
            this.putQueryParameter("SubDomain", subDomain);
            this.subDomain = subDomain;
            return this;
        }

        /**
         * 可用区ID
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public EvaluateRegionResourceRequest build() {
            return new EvaluateRegionResourceRequest(this);
        } 

    } 

}
