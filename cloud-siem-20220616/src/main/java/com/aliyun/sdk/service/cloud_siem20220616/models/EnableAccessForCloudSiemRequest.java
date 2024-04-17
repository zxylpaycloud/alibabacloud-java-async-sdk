// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableAccessForCloudSiemRequest} extends {@link RequestModel}
 *
 * <p>EnableAccessForCloudSiemRequest</p>
 */
public class EnableAccessForCloudSiemRequest extends Request {
    @Body
    @NameInMap("AutoSubmit")
    private Integer autoSubmit;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RoleFor")
    private Long roleFor;

    @Body
    @NameInMap("RoleType")
    private Integer roleType;

    private EnableAccessForCloudSiemRequest(Builder builder) {
        super(builder);
        this.autoSubmit = builder.autoSubmit;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableAccessForCloudSiemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoSubmit
     */
    public Integer getAutoSubmit() {
        return this.autoSubmit;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public Integer getRoleType() {
        return this.roleType;
    }

    public static final class Builder extends Request.Builder<EnableAccessForCloudSiemRequest, Builder> {
        private Integer autoSubmit; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 

        private Builder() {
            super();
        } 

        private Builder(EnableAccessForCloudSiemRequest request) {
            super(request);
            this.autoSubmit = request.autoSubmit;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
        } 

        /**
         * AutoSubmit.
         */
        public Builder autoSubmit(Integer autoSubmit) {
            this.putBodyParameter("AutoSubmit", autoSubmit);
            this.autoSubmit = autoSubmit;
            return this;
        }

        /**
         * The data management center of the threat analysis feature. Specify this parameter based on the region where your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions inside China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * RoleType.
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        @Override
        public EnableAccessForCloudSiemRequest build() {
            return new EnableAccessForCloudSiemRequest(this);
        } 

    } 

}
