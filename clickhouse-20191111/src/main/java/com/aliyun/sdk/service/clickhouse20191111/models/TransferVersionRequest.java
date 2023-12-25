// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransferVersionRequest} extends {@link RequestModel}
 *
 * <p>TransferVersionRequest</p>
 */
public class TransferVersionRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

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
    @NameInMap("SourceAccount")
    @Validation(required = true)
    private String sourceAccount;

    @Query
    @NameInMap("SourcePassword")
    @Validation(required = true)
    private String sourcePassword;

    @Query
    @NameInMap("TargetAccount")
    @Validation(required = true)
    private String targetAccount;

    @Query
    @NameInMap("TargetDbClusterId")
    @Validation(required = true)
    private String targetDbClusterId;

    @Query
    @NameInMap("TargetPassword")
    @Validation(required = true)
    private String targetPassword;

    private TransferVersionRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceAccount = builder.sourceAccount;
        this.sourcePassword = builder.sourcePassword;
        this.targetAccount = builder.targetAccount;
        this.targetDbClusterId = builder.targetDbClusterId;
        this.targetPassword = builder.targetPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferVersionRequest create() {
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return sourceAccount
     */
    public String getSourceAccount() {
        return this.sourceAccount;
    }

    /**
     * @return sourcePassword
     */
    public String getSourcePassword() {
        return this.sourcePassword;
    }

    /**
     * @return targetAccount
     */
    public String getTargetAccount() {
        return this.targetAccount;
    }

    /**
     * @return targetDbClusterId
     */
    public String getTargetDbClusterId() {
        return this.targetDbClusterId;
    }

    /**
     * @return targetPassword
     */
    public String getTargetPassword() {
        return this.targetPassword;
    }

    public static final class Builder extends Request.Builder<TransferVersionRequest, Builder> {
        private String DBClusterId; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sourceAccount; 
        private String sourcePassword; 
        private String targetAccount; 
        private String targetDbClusterId; 
        private String targetPassword; 

        private Builder() {
            super();
        } 

        private Builder(TransferVersionRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceAccount = request.sourceAccount;
            this.sourcePassword = request.sourcePassword;
            this.targetAccount = request.targetAccount;
            this.targetDbClusterId = request.targetDbClusterId;
            this.targetPassword = request.targetPassword;
        } 

        /**
         * The ID of the source ApsaraDB for ClickHouse cluster.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
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
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values:
         * <p>
         * 
         * *   **30** (default)
         * *   **50**
         * *   **100**
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~170875~~) operation to query the most recent region list.
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
         * The database account that is used to log on to the database in the source ApsaraDB for ClickHouse cluster.
         */
        public Builder sourceAccount(String sourceAccount) {
            this.putQueryParameter("SourceAccount", sourceAccount);
            this.sourceAccount = sourceAccount;
            return this;
        }

        /**
         * The password that corresponds to the database account for logging on to the database in the source ApsaraDB for ClickHouse cluster.
         */
        public Builder sourcePassword(String sourcePassword) {
            this.putQueryParameter("SourcePassword", sourcePassword);
            this.sourcePassword = sourcePassword;
            return this;
        }

        /**
         * The database account that is used to log on to the database in the destination ApsaraDB for ClickHouse cluster.
         */
        public Builder targetAccount(String targetAccount) {
            this.putQueryParameter("TargetAccount", targetAccount);
            this.targetAccount = targetAccount;
            return this;
        }

        /**
         * The ID of the destination ApsaraDB for ClickHouse cluster.
         */
        public Builder targetDbClusterId(String targetDbClusterId) {
            this.putQueryParameter("TargetDbClusterId", targetDbClusterId);
            this.targetDbClusterId = targetDbClusterId;
            return this;
        }

        /**
         * The password that corresponds to the database account for logging on to the database in the destination ApsaraDB for ClickHouse cluster.
         */
        public Builder targetPassword(String targetPassword) {
            this.putQueryParameter("TargetPassword", targetPassword);
            this.targetPassword = targetPassword;
            return this;
        }

        @Override
        public TransferVersionRequest build() {
            return new TransferVersionRequest(this);
        } 

    } 

}
