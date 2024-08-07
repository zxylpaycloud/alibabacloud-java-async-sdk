// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ShowQuickAnalysisRequest} extends {@link RequestModel}
 *
 * <p>ShowQuickAnalysisRequest</p>
 */
public class ShowQuickAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ShowQuickAnalysisRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ShowQuickAnalysisRequest create() {
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

    public static final class Builder extends Request.Builder<ShowQuickAnalysisRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ShowQuickAnalysisRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * The data management center of the threat analysis feature. Specify this parameter based on the region where your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions in the Chinese mainland or in the China (Hong Kong) region.
         * *   ap-southeast-1: Your assets reside in regions outside the Chinese mainland, excluding the China (Hong Kong) region.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ShowQuickAnalysisRequest build() {
            return new ShowQuickAnalysisRequest(this);
        } 

    } 

}
