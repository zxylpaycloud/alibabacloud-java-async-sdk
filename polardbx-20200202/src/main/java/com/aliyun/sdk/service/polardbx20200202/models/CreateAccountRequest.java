// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateAccountRequest</p>
 */
public class CreateAccountRequest extends Request {
    @Query
    @NameInMap("AccountDescription")
    private String accountDescription;

    @Query
    @NameInMap("AccountName")
    @Validation(required = true)
    private String accountName;

    @Query
    @NameInMap("AccountPassword")
    @Validation(required = true)
    private String accountPassword;

    @Query
    @NameInMap("AccountPrivilege")
    private String accountPrivilege;

    @Query
    @NameInMap("DBInstanceName")
    @Validation(required = true)
    private String DBInstanceName;

    @Query
    @NameInMap("DBName")
    private String DBName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SecurityAccountName")
    private String securityAccountName;

    @Query
    @NameInMap("SecurityAccountPassword")
    private String securityAccountPassword;

    private CreateAccountRequest(Builder builder) {
        super(builder);
        this.accountDescription = builder.accountDescription;
        this.accountName = builder.accountName;
        this.accountPassword = builder.accountPassword;
        this.accountPrivilege = builder.accountPrivilege;
        this.DBInstanceName = builder.DBInstanceName;
        this.DBName = builder.DBName;
        this.regionId = builder.regionId;
        this.securityAccountName = builder.securityAccountName;
        this.securityAccountPassword = builder.securityAccountPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountDescription
     */
    public String getAccountDescription() {
        return this.accountDescription;
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return accountPassword
     */
    public String getAccountPassword() {
        return this.accountPassword;
    }

    /**
     * @return accountPrivilege
     */
    public String getAccountPrivilege() {
        return this.accountPrivilege;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return DBName
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityAccountName
     */
    public String getSecurityAccountName() {
        return this.securityAccountName;
    }

    /**
     * @return securityAccountPassword
     */
    public String getSecurityAccountPassword() {
        return this.securityAccountPassword;
    }

    public static final class Builder extends Request.Builder<CreateAccountRequest, Builder> {
        private String accountDescription; 
        private String accountName; 
        private String accountPassword; 
        private String accountPrivilege; 
        private String DBInstanceName; 
        private String DBName; 
        private String regionId; 
        private String securityAccountName; 
        private String securityAccountPassword; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccountRequest response) {
            super(response);
            this.accountDescription = response.accountDescription;
            this.accountName = response.accountName;
            this.accountPassword = response.accountPassword;
            this.accountPrivilege = response.accountPrivilege;
            this.DBInstanceName = response.DBInstanceName;
            this.DBName = response.DBName;
            this.regionId = response.regionId;
            this.securityAccountName = response.securityAccountName;
            this.securityAccountPassword = response.securityAccountPassword;
        } 

        /**
         * AccountDescription.
         */
        public Builder accountDescription(String accountDescription) {
            this.putQueryParameter("AccountDescription", accountDescription);
            this.accountDescription = accountDescription;
            return this;
        }

        /**
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * AccountPassword.
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * AccountPrivilege.
         */
        public Builder accountPrivilege(String accountPrivilege) {
            this.putQueryParameter("AccountPrivilege", accountPrivilege);
            this.accountPrivilege = accountPrivilege;
            return this;
        }

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * DBName.
         */
        public Builder DBName(String DBName) {
            this.putQueryParameter("DBName", DBName);
            this.DBName = DBName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SecurityAccountName.
         */
        public Builder securityAccountName(String securityAccountName) {
            this.putQueryParameter("SecurityAccountName", securityAccountName);
            this.securityAccountName = securityAccountName;
            return this;
        }

        /**
         * SecurityAccountPassword.
         */
        public Builder securityAccountPassword(String securityAccountPassword) {
            this.putQueryParameter("SecurityAccountPassword", securityAccountPassword);
            this.securityAccountPassword = securityAccountPassword;
            return this;
        }

        @Override
        public CreateAccountRequest build() {
            return new CreateAccountRequest(this);
        } 

    } 

}
