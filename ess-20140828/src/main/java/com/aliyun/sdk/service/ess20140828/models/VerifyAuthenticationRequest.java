// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyAuthenticationRequest} extends {@link RequestModel}
 *
 * <p>VerifyAuthenticationRequest</p>
 */
public class VerifyAuthenticationRequest extends Request {
    @Query
    @NameInMap("OnlyCheck")
    private Boolean onlyCheck;

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
    @NameInMap("Uid")
    private Long uid;

    private VerifyAuthenticationRequest(Builder builder) {
        super(builder);
        this.onlyCheck = builder.onlyCheck;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyAuthenticationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return onlyCheck
     */
    public Boolean getOnlyCheck() {
        return this.onlyCheck;
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
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<VerifyAuthenticationRequest, Builder> {
        private Boolean onlyCheck; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(VerifyAuthenticationRequest response) {
            super(response);
            this.onlyCheck = response.onlyCheck;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.uid = response.uid;
        } 

        /**
         * OnlyCheck.
         */
        public Builder onlyCheck(Boolean onlyCheck) {
            this.putQueryParameter("OnlyCheck", onlyCheck);
            this.onlyCheck = onlyCheck;
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
         * Uid.
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public VerifyAuthenticationRequest build() {
            return new VerifyAuthenticationRequest(this);
        } 

    } 

}
