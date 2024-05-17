// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCenInterRegionBandwidthLimitRequest} extends {@link RequestModel}
 *
 * <p>SetCenInterRegionBandwidthLimitRequest</p>
 */
public class SetCenInterRegionBandwidthLimitRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BandwidthLimit")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long bandwidthLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BandwidthType")
    private String bandwidthType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String localRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OppositeRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String oppositeRegionId;

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

    private SetCenInterRegionBandwidthLimitRequest(Builder builder) {
        super(builder);
        this.bandwidthLimit = builder.bandwidthLimit;
        this.bandwidthType = builder.bandwidthType;
        this.cenId = builder.cenId;
        this.localRegionId = builder.localRegionId;
        this.oppositeRegionId = builder.oppositeRegionId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCenInterRegionBandwidthLimitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidthLimit
     */
    public Long getBandwidthLimit() {
        return this.bandwidthLimit;
    }

    /**
     * @return bandwidthType
     */
    public String getBandwidthType() {
        return this.bandwidthType;
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return localRegionId
     */
    public String getLocalRegionId() {
        return this.localRegionId;
    }

    /**
     * @return oppositeRegionId
     */
    public String getOppositeRegionId() {
        return this.oppositeRegionId;
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

    public static final class Builder extends Request.Builder<SetCenInterRegionBandwidthLimitRequest, Builder> {
        private Long bandwidthLimit; 
        private String bandwidthType; 
        private String cenId; 
        private String localRegionId; 
        private String oppositeRegionId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(SetCenInterRegionBandwidthLimitRequest request) {
            super(request);
            this.bandwidthLimit = request.bandwidthLimit;
            this.bandwidthType = request.bandwidthType;
            this.cenId = request.cenId;
            this.localRegionId = request.localRegionId;
            this.oppositeRegionId = request.oppositeRegionId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * BandwidthLimit.
         */
        public Builder bandwidthLimit(Long bandwidthLimit) {
            this.putQueryParameter("BandwidthLimit", bandwidthLimit);
            this.bandwidthLimit = bandwidthLimit;
            return this;
        }

        /**
         * BandwidthType.
         */
        public Builder bandwidthType(String bandwidthType) {
            this.putQueryParameter("BandwidthType", bandwidthType);
            this.bandwidthType = bandwidthType;
            return this;
        }

        /**
         * CenId.
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * LocalRegionId.
         */
        public Builder localRegionId(String localRegionId) {
            this.putQueryParameter("LocalRegionId", localRegionId);
            this.localRegionId = localRegionId;
            return this;
        }

        /**
         * OppositeRegionId.
         */
        public Builder oppositeRegionId(String oppositeRegionId) {
            this.putQueryParameter("OppositeRegionId", oppositeRegionId);
            this.oppositeRegionId = oppositeRegionId;
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

        @Override
        public SetCenInterRegionBandwidthLimitRequest build() {
            return new SetCenInterRegionBandwidthLimitRequest(this);
        } 

    } 

}
