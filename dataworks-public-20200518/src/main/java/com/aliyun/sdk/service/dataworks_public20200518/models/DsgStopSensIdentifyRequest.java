// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DsgStopSensIdentifyRequest} extends {@link RequestModel}
 *
 * <p>DsgStopSensIdentifyRequest</p>
 */
public class DsgStopSensIdentifyRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("JobId")
    @Validation(required = true)
    private Long jobId;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private String tenantId;

    private DsgStopSensIdentifyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.jobId = builder.jobId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DsgStopSensIdentifyRequest create() {
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
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<DsgStopSensIdentifyRequest, Builder> {
        private String regionId; 
        private Long jobId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(DsgStopSensIdentifyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.jobId = request.jobId;
            this.tenantId = request.tenantId;
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
         * JobId.
         */
        public Builder jobId(Long jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public DsgStopSensIdentifyRequest build() {
            return new DsgStopSensIdentifyRequest(this);
        } 

    } 

}
