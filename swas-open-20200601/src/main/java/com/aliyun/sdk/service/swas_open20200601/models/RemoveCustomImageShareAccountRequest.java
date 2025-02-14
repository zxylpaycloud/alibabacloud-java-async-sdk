// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveCustomImageShareAccountRequest} extends {@link RequestModel}
 *
 * <p>RemoveCustomImageShareAccountRequest</p>
 */
public class RemoveCustomImageShareAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Account")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Long > account;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private RemoveCustomImageShareAccountRequest(Builder builder) {
        super(builder);
        this.account = builder.account;
        this.clientToken = builder.clientToken;
        this.imageId = builder.imageId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveCustomImageShareAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return account
     */
    public java.util.List < Long > getAccount() {
        return this.account;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RemoveCustomImageShareAccountRequest, Builder> {
        private java.util.List < Long > account; 
        private String clientToken; 
        private String imageId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveCustomImageShareAccountRequest request) {
            super(request);
            this.account = request.account;
            this.clientToken = request.clientToken;
            this.imageId = request.imageId;
            this.regionId = request.regionId;
        } 

        /**
         * The IDs of the Alibaba Cloud accounts with which you want to unshare the image.
         */
        public Builder account(java.util.List < Long > account) {
            this.putQueryParameter("Account", account);
            this.account = account;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the shared custom image.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The region ID of the simple application server. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RemoveCustomImageShareAccountRequest build() {
            return new RemoveCustomImageShareAccountRequest(this);
        } 

    } 

}
