// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetricGroupRequest} extends {@link RequestModel}
 *
 * <p>GetMetricGroupRequest</p>
 */
public class GetMetricGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("MetricGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricGroupId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetMetricGroupRequest(Builder builder) {
        super(builder);
        this.metricGroupId = builder.metricGroupId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetricGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metricGroupId
     */
    public String getMetricGroupId() {
        return this.metricGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetMetricGroupRequest, Builder> {
        private String metricGroupId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetMetricGroupRequest request) {
            super(request);
            this.metricGroupId = request.metricGroupId;
            this.regionId = request.regionId;
        } 

        /**
         * MetricGroupId.
         */
        public Builder metricGroupId(String metricGroupId) {
            this.putPathParameter("MetricGroupId", metricGroupId);
            this.metricGroupId = metricGroupId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetMetricGroupRequest build() {
            return new GetMetricGroupRequest(this);
        } 

    } 

}
