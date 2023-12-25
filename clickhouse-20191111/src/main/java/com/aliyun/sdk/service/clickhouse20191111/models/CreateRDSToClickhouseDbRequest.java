// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRDSToClickhouseDbRequest} extends {@link RequestModel}
 *
 * <p>CreateRDSToClickhouseDbRequest</p>
 */
public class CreateRDSToClickhouseDbRequest extends Request {
    @Query
    @NameInMap("CkPassword")
    @Validation(required = true)
    private String ckPassword;

    @Query
    @NameInMap("CkUserName")
    @Validation(required = true)
    private String ckUserName;

    @Query
    @NameInMap("ClickhousePort")
    private Long clickhousePort;

    @Query
    @NameInMap("DbClusterId")
    @Validation(required = true)
    private String dbClusterId;

    @Query
    @NameInMap("LimitUpper")
    private Long limitUpper;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RdsId")
    @Validation(required = true)
    private String rdsId;

    @Query
    @NameInMap("RdsPassword")
    @Validation(required = true)
    private String rdsPassword;

    @Query
    @NameInMap("RdsPort")
    private Long rdsPort;

    @Query
    @NameInMap("RdsUserName")
    @Validation(required = true)
    private String rdsUserName;

    @Query
    @NameInMap("RdsVpcId")
    private String rdsVpcId;

    @Query
    @NameInMap("RdsVpcUrl")
    private String rdsVpcUrl;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SkipUnsupported")
    @Validation(required = true)
    private Boolean skipUnsupported;

    @Query
    @NameInMap("SynDbTables")
    @Validation(required = true)
    private String synDbTables;

    private CreateRDSToClickhouseDbRequest(Builder builder) {
        super(builder);
        this.ckPassword = builder.ckPassword;
        this.ckUserName = builder.ckUserName;
        this.clickhousePort = builder.clickhousePort;
        this.dbClusterId = builder.dbClusterId;
        this.limitUpper = builder.limitUpper;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.rdsId = builder.rdsId;
        this.rdsPassword = builder.rdsPassword;
        this.rdsPort = builder.rdsPort;
        this.rdsUserName = builder.rdsUserName;
        this.rdsVpcId = builder.rdsVpcId;
        this.rdsVpcUrl = builder.rdsVpcUrl;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.skipUnsupported = builder.skipUnsupported;
        this.synDbTables = builder.synDbTables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRDSToClickhouseDbRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ckPassword
     */
    public String getCkPassword() {
        return this.ckPassword;
    }

    /**
     * @return ckUserName
     */
    public String getCkUserName() {
        return this.ckUserName;
    }

    /**
     * @return clickhousePort
     */
    public Long getClickhousePort() {
        return this.clickhousePort;
    }

    /**
     * @return dbClusterId
     */
    public String getDbClusterId() {
        return this.dbClusterId;
    }

    /**
     * @return limitUpper
     */
    public Long getLimitUpper() {
        return this.limitUpper;
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
     * @return rdsId
     */
    public String getRdsId() {
        return this.rdsId;
    }

    /**
     * @return rdsPassword
     */
    public String getRdsPassword() {
        return this.rdsPassword;
    }

    /**
     * @return rdsPort
     */
    public Long getRdsPort() {
        return this.rdsPort;
    }

    /**
     * @return rdsUserName
     */
    public String getRdsUserName() {
        return this.rdsUserName;
    }

    /**
     * @return rdsVpcId
     */
    public String getRdsVpcId() {
        return this.rdsVpcId;
    }

    /**
     * @return rdsVpcUrl
     */
    public String getRdsVpcUrl() {
        return this.rdsVpcUrl;
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
     * @return skipUnsupported
     */
    public Boolean getSkipUnsupported() {
        return this.skipUnsupported;
    }

    /**
     * @return synDbTables
     */
    public String getSynDbTables() {
        return this.synDbTables;
    }

    public static final class Builder extends Request.Builder<CreateRDSToClickhouseDbRequest, Builder> {
        private String ckPassword; 
        private String ckUserName; 
        private Long clickhousePort; 
        private String dbClusterId; 
        private Long limitUpper; 
        private String ownerAccount; 
        private Long ownerId; 
        private String rdsId; 
        private String rdsPassword; 
        private Long rdsPort; 
        private String rdsUserName; 
        private String rdsVpcId; 
        private String rdsVpcUrl; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Boolean skipUnsupported; 
        private String synDbTables; 

        private Builder() {
            super();
        } 

        private Builder(CreateRDSToClickhouseDbRequest request) {
            super(request);
            this.ckPassword = request.ckPassword;
            this.ckUserName = request.ckUserName;
            this.clickhousePort = request.clickhousePort;
            this.dbClusterId = request.dbClusterId;
            this.limitUpper = request.limitUpper;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.rdsId = request.rdsId;
            this.rdsPassword = request.rdsPassword;
            this.rdsPort = request.rdsPort;
            this.rdsUserName = request.rdsUserName;
            this.rdsVpcId = request.rdsVpcId;
            this.rdsVpcUrl = request.rdsVpcUrl;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.skipUnsupported = request.skipUnsupported;
            this.synDbTables = request.synDbTables;
        } 

        /**
         * The password of the account that is used to log on to the database in the ApsaraDB for ClickHouse cluster.
         */
        public Builder ckPassword(String ckPassword) {
            this.putQueryParameter("CkPassword", ckPassword);
            this.ckPassword = ckPassword;
            return this;
        }

        /**
         * The account that is used to log on to the database in the ApsaraDB for ClickHouse cluster.
         */
        public Builder ckUserName(String ckUserName) {
            this.putQueryParameter("CkUserName", ckUserName);
            this.ckUserName = ckUserName;
            return this;
        }

        /**
         * The port number of the ApsaraDB for ClickHouse cluster.
         */
        public Builder clickhousePort(Long clickhousePort) {
            this.putQueryParameter("ClickhousePort", clickhousePort);
            this.clickhousePort = clickhousePort;
            return this;
        }

        /**
         * The ID of the ApsaraDB for ClickHouse cluster.
         */
        public Builder dbClusterId(String dbClusterId) {
            this.putQueryParameter("DbClusterId", dbClusterId);
            this.dbClusterId = dbClusterId;
            return this;
        }

        /**
         * The maximum number of rows that can be synchronized per second.
         */
        public Builder limitUpper(Long limitUpper) {
            this.putQueryParameter("LimitUpper", limitUpper);
            this.limitUpper = limitUpper;
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
         * The ID of the ApsaraDB RDS for MySQL instance.
         */
        public Builder rdsId(String rdsId) {
            this.putQueryParameter("RdsId", rdsId);
            this.rdsId = rdsId;
            return this;
        }

        /**
         * The password of the account that is used to log on to the ApsaraDB RDS for MySQL instance.
         */
        public Builder rdsPassword(String rdsPassword) {
            this.putQueryParameter("RdsPassword", rdsPassword);
            this.rdsPassword = rdsPassword;
            return this;
        }

        /**
         * The port number of the ApsaraDB RDS for MySQL instance.
         */
        public Builder rdsPort(Long rdsPort) {
            this.putQueryParameter("RdsPort", rdsPort);
            this.rdsPort = rdsPort;
            return this;
        }

        /**
         * The account that is used to log on to the database in the ApsaraDB RDS for MySQL instance.
         */
        public Builder rdsUserName(String rdsUserName) {
            this.putQueryParameter("RdsUserName", rdsUserName);
            this.rdsUserName = rdsUserName;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC) to which the ApsaraDB RDS for MySQL instance belongs.
         */
        public Builder rdsVpcId(String rdsVpcId) {
            this.putQueryParameter("RdsVpcId", rdsVpcId);
            this.rdsVpcId = rdsVpcId;
            return this;
        }

        /**
         * The private endpoint of the ApsaraDB RDS for MySQL instance.
         */
        public Builder rdsVpcUrl(String rdsVpcUrl) {
            this.putQueryParameter("RdsVpcUrl", rdsVpcUrl);
            this.rdsVpcUrl = rdsVpcUrl;
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
         * Specifies whether to ignore the table schemas that do not support synchronization. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder skipUnsupported(Boolean skipUnsupported) {
            this.putQueryParameter("SkipUnsupported", skipUnsupported);
            this.skipUnsupported = skipUnsupported;
            return this;
        }

        /**
         * The tables whose data you want to synchronize.
         */
        public Builder synDbTables(String synDbTables) {
            this.putQueryParameter("SynDbTables", synDbTables);
            this.synDbTables = synDbTables;
            return this;
        }

        @Override
        public CreateRDSToClickhouseDbRequest build() {
            return new CreateRDSToClickhouseDbRequest(this);
        } 

    } 

}
