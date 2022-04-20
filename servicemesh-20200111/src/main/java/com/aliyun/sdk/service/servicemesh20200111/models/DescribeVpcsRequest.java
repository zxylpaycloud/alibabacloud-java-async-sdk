// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcsRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcsRequest</p>
 */
public class DescribeVpcsRequest extends Request {
    @Body
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeVpcsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeVpcsRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcsRequest request) {
            super(request);
            this.regionId = request.regionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeVpcsRequest build() {
            return new DescribeVpcsRequest(this);
        } 

    } 

}
