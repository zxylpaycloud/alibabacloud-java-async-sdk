// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOssPropertiesRequest} extends {@link RequestModel}
 *
 * <p>GetOssPropertiesRequest</p>
 */
public class GetOssPropertiesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bizid")
    private String bizid;

    private GetOssPropertiesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizid = builder.bizid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssPropertiesRequest create() {
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
     * @return bizid
     */
    public String getBizid() {
        return this.bizid;
    }

    public static final class Builder extends Request.Builder<GetOssPropertiesRequest, Builder> {
        private String regionId; 
        private String bizid; 

        private Builder() {
            super();
        } 

        private Builder(GetOssPropertiesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizid = request.bizid;
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
         * Bizid.
         */
        public Builder bizid(String bizid) {
            this.putBodyParameter("Bizid", bizid);
            this.bizid = bizid;
            return this;
        }

        @Override
        public GetOssPropertiesRequest build() {
            return new GetOssPropertiesRequest(this);
        } 

    } 

}
