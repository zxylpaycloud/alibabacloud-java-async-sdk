// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnregisterCustomFaceRequest} extends {@link RequestModel}
 *
 * <p>UnregisterCustomFaceRequest</p>
 */
public class UnregisterCustomFaceRequest extends Request {
    @Query
    @NameInMap("CategoryId")
    @Validation(required = true)
    private String categoryId;

    @Query
    @NameInMap("FaceId")
    @Validation(required = true)
    private String faceId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PersonId")
    @Validation(required = true)
    private String personId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private UnregisterCustomFaceRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.faceId = builder.faceId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.personId = builder.personId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnregisterCustomFaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return faceId
     */
    public String getFaceId() {
        return this.faceId;
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
     * @return personId
     */
    public String getPersonId() {
        return this.personId;
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

    public static final class Builder extends Request.Builder<UnregisterCustomFaceRequest, Builder> {
        private String categoryId; 
        private String faceId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String personId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(UnregisterCustomFaceRequest request) {
            super(request);
            this.categoryId = request.categoryId;
            this.faceId = request.faceId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.personId = request.personId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * CategoryId.
         */
        public Builder categoryId(String categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * FaceId.
         */
        public Builder faceId(String faceId) {
            this.putQueryParameter("FaceId", faceId);
            this.faceId = faceId;
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
         * PersonId.
         */
        public Builder personId(String personId) {
            this.putQueryParameter("PersonId", personId);
            this.personId = personId;
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
        public UnregisterCustomFaceRequest build() {
            return new UnregisterCustomFaceRequest(this);
        } 

    } 

}
