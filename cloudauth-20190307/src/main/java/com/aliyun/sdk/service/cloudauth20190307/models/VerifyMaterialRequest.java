// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyMaterialRequest} extends {@link RequestModel}
 *
 * <p>VerifyMaterialRequest</p>
 */
public class VerifyMaterialRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    @Query
    @NameInMap("FaceImageUrl")
    @Validation(required = true)
    private String faceImageUrl;

    @Query
    @NameInMap("IdCardBackImageUrl")
    private String idCardBackImageUrl;

    @Query
    @NameInMap("IdCardFrontImageUrl")
    private String idCardFrontImageUrl;

    @Query
    @NameInMap("IdCardNumber")
    @Validation(required = true)
    private String idCardNumber;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("UserId")
    private String userId;

    private VerifyMaterialRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.bizType = builder.bizType;
        this.faceImageUrl = builder.faceImageUrl;
        this.idCardBackImageUrl = builder.idCardBackImageUrl;
        this.idCardFrontImageUrl = builder.idCardFrontImageUrl;
        this.idCardNumber = builder.idCardNumber;
        this.name = builder.name;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyMaterialRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return faceImageUrl
     */
    public String getFaceImageUrl() {
        return this.faceImageUrl;
    }

    /**
     * @return idCardBackImageUrl
     */
    public String getIdCardBackImageUrl() {
        return this.idCardBackImageUrl;
    }

    /**
     * @return idCardFrontImageUrl
     */
    public String getIdCardFrontImageUrl() {
        return this.idCardFrontImageUrl;
    }

    /**
     * @return idCardNumber
     */
    public String getIdCardNumber() {
        return this.idCardNumber;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<VerifyMaterialRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String bizType; 
        private String faceImageUrl; 
        private String idCardBackImageUrl; 
        private String idCardFrontImageUrl; 
        private String idCardNumber; 
        private String name; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(VerifyMaterialRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.bizType = request.bizType;
            this.faceImageUrl = request.faceImageUrl;
            this.idCardBackImageUrl = request.idCardBackImageUrl;
            this.idCardFrontImageUrl = request.idCardFrontImageUrl;
            this.idCardNumber = request.idCardNumber;
            this.name = request.name;
            this.userId = request.userId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * FaceImageUrl.
         */
        public Builder faceImageUrl(String faceImageUrl) {
            this.putQueryParameter("FaceImageUrl", faceImageUrl);
            this.faceImageUrl = faceImageUrl;
            return this;
        }

        /**
         * IdCardBackImageUrl.
         */
        public Builder idCardBackImageUrl(String idCardBackImageUrl) {
            this.putQueryParameter("IdCardBackImageUrl", idCardBackImageUrl);
            this.idCardBackImageUrl = idCardBackImageUrl;
            return this;
        }

        /**
         * IdCardFrontImageUrl.
         */
        public Builder idCardFrontImageUrl(String idCardFrontImageUrl) {
            this.putQueryParameter("IdCardFrontImageUrl", idCardFrontImageUrl);
            this.idCardFrontImageUrl = idCardFrontImageUrl;
            return this;
        }

        /**
         * IdCardNumber.
         */
        public Builder idCardNumber(String idCardNumber) {
            this.putQueryParameter("IdCardNumber", idCardNumber);
            this.idCardNumber = idCardNumber;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public VerifyMaterialRequest build() {
            return new VerifyMaterialRequest(this);
        } 

    } 

}
