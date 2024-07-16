// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCreateCustomerInfomationRequest} extends {@link RequestModel}
 *
 * <p>GetCreateCustomerInfomationRequest</p>
 */
public class GetCreateCustomerInfomationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetCreateCustomerInfomationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCreateCustomerInfomationRequest create() {
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

    public static final class Builder extends Request.Builder<GetCreateCustomerInfomationRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetCreateCustomerInfomationRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetCreateCustomerInfomationRequest build() {
            return new GetCreateCustomerInfomationRequest(this);
        } 

    } 

}
