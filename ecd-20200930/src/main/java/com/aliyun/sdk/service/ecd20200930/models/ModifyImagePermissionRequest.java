// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyImagePermissionRequest} extends {@link RequestModel}
 *
 * <p>ModifyImagePermissionRequest</p>
 */
public class ModifyImagePermissionRequest extends Request {
    @Query
    @NameInMap("AddAccount")
    private java.util.List < Long > addAccount;

    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RemoveAccount")
    private java.util.List < Long > removeAccount;

    private ModifyImagePermissionRequest(Builder builder) {
        super(builder);
        this.addAccount = builder.addAccount;
        this.imageId = builder.imageId;
        this.regionId = builder.regionId;
        this.removeAccount = builder.removeAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyImagePermissionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addAccount
     */
    public java.util.List < Long > getAddAccount() {
        return this.addAccount;
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

    /**
     * @return removeAccount
     */
    public java.util.List < Long > getRemoveAccount() {
        return this.removeAccount;
    }

    public static final class Builder extends Request.Builder<ModifyImagePermissionRequest, Builder> {
        private java.util.List < Long > addAccount; 
        private String imageId; 
        private String regionId; 
        private java.util.List < Long > removeAccount; 

        private Builder() {
            super();
        } 

        private Builder(ModifyImagePermissionRequest request) {
            super(request);
            this.addAccount = request.addAccount;
            this.imageId = request.imageId;
            this.regionId = request.regionId;
            this.removeAccount = request.removeAccount;
        } 

        /**
         * The IDs of Alibaba Cloud accounts to which to share the image that will be created based on the image template. You can specify up to 20 account IDs.
         */
        public Builder addAccount(java.util.List < Long > addAccount) {
            this.putQueryParameter("AddAccount", addAccount);
            this.addAccount = addAccount;
            return this;
        }

        /**
         * The IDs of the images.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of Alibaba Cloud account N from which you want to unshare the custom image. Valid values of N: 1 to 10. If the value of N is greater than 10, this parameter is ignored.
         */
        public Builder removeAccount(java.util.List < Long > removeAccount) {
            this.putQueryParameter("RemoveAccount", removeAccount);
            this.removeAccount = removeAccount;
            return this;
        }

        @Override
        public ModifyImagePermissionRequest build() {
            return new ModifyImagePermissionRequest(this);
        } 

    } 

}
