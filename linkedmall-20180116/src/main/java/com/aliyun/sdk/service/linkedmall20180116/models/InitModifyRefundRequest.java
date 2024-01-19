// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitModifyRefundRequest} extends {@link RequestModel}
 *
 * <p>InitModifyRefundRequest</p>
 */
public class InitModifyRefundRequest extends Request {
    @Query
    @NameInMap("AccountType")
    private String accountType;

    @Query
    @NameInMap("BizClaimType")
    @Validation(required = true)
    private Integer bizClaimType;

    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("BizUid")
    @Validation(required = true)
    private String bizUid;

    @Query
    @NameInMap("DisputeId")
    private Long disputeId;

    @Query
    @NameInMap("GoodsStatus")
    @Validation(required = true)
    private Integer goodsStatus;

    @Query
    @NameInMap("SubLmOrderId")
    @Validation(required = true)
    private String subLmOrderId;

    @Query
    @NameInMap("ThirdPartyUserId")
    private String thirdPartyUserId;

    @Query
    @NameInMap("UseAnonymousTbAccount")
    private Boolean useAnonymousTbAccount;

    private InitModifyRefundRequest(Builder builder) {
        super(builder);
        this.accountType = builder.accountType;
        this.bizClaimType = builder.bizClaimType;
        this.bizId = builder.bizId;
        this.bizUid = builder.bizUid;
        this.disputeId = builder.disputeId;
        this.goodsStatus = builder.goodsStatus;
        this.subLmOrderId = builder.subLmOrderId;
        this.thirdPartyUserId = builder.thirdPartyUserId;
        this.useAnonymousTbAccount = builder.useAnonymousTbAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitModifyRefundRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return bizClaimType
     */
    public Integer getBizClaimType() {
        return this.bizClaimType;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizUid
     */
    public String getBizUid() {
        return this.bizUid;
    }

    /**
     * @return disputeId
     */
    public Long getDisputeId() {
        return this.disputeId;
    }

    /**
     * @return goodsStatus
     */
    public Integer getGoodsStatus() {
        return this.goodsStatus;
    }

    /**
     * @return subLmOrderId
     */
    public String getSubLmOrderId() {
        return this.subLmOrderId;
    }

    /**
     * @return thirdPartyUserId
     */
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    /**
     * @return useAnonymousTbAccount
     */
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

    public static final class Builder extends Request.Builder<InitModifyRefundRequest, Builder> {
        private String accountType; 
        private Integer bizClaimType; 
        private String bizId; 
        private String bizUid; 
        private Long disputeId; 
        private Integer goodsStatus; 
        private String subLmOrderId; 
        private String thirdPartyUserId; 
        private Boolean useAnonymousTbAccount; 

        private Builder() {
            super();
        } 

        private Builder(InitModifyRefundRequest request) {
            super(request);
            this.accountType = request.accountType;
            this.bizClaimType = request.bizClaimType;
            this.bizId = request.bizId;
            this.bizUid = request.bizUid;
            this.disputeId = request.disputeId;
            this.goodsStatus = request.goodsStatus;
            this.subLmOrderId = request.subLmOrderId;
            this.thirdPartyUserId = request.thirdPartyUserId;
            this.useAnonymousTbAccount = request.useAnonymousTbAccount;
        } 

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.putQueryParameter("AccountType", accountType);
            this.accountType = accountType;
            return this;
        }

        /**
         * BizClaimType.
         */
        public Builder bizClaimType(Integer bizClaimType) {
            this.putQueryParameter("BizClaimType", bizClaimType);
            this.bizClaimType = bizClaimType;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * BizUid.
         */
        public Builder bizUid(String bizUid) {
            this.putQueryParameter("BizUid", bizUid);
            this.bizUid = bizUid;
            return this;
        }

        /**
         * DisputeId.
         */
        public Builder disputeId(Long disputeId) {
            this.putQueryParameter("DisputeId", disputeId);
            this.disputeId = disputeId;
            return this;
        }

        /**
         * GoodsStatus.
         */
        public Builder goodsStatus(Integer goodsStatus) {
            this.putQueryParameter("GoodsStatus", goodsStatus);
            this.goodsStatus = goodsStatus;
            return this;
        }

        /**
         * SubLmOrderId.
         */
        public Builder subLmOrderId(String subLmOrderId) {
            this.putQueryParameter("SubLmOrderId", subLmOrderId);
            this.subLmOrderId = subLmOrderId;
            return this;
        }

        /**
         * ThirdPartyUserId.
         */
        public Builder thirdPartyUserId(String thirdPartyUserId) {
            this.putQueryParameter("ThirdPartyUserId", thirdPartyUserId);
            this.thirdPartyUserId = thirdPartyUserId;
            return this;
        }

        /**
         * UseAnonymousTbAccount.
         */
        public Builder useAnonymousTbAccount(Boolean useAnonymousTbAccount) {
            this.putQueryParameter("UseAnonymousTbAccount", useAnonymousTbAccount);
            this.useAnonymousTbAccount = useAnonymousTbAccount;
            return this;
        }

        @Override
        public InitModifyRefundRequest build() {
            return new InitModifyRefundRequest(this);
        } 

    } 

}
