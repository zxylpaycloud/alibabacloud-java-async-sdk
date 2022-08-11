// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeInstanceRequest} extends {@link RequestModel}
 *
 * <p>ResumeInstanceRequest</p>
 */
public class ResumeInstanceRequest extends Request {
    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private Long instanceId;

    @Body
    @NameInMap("ProjectEnv")
    @Validation(required = true)
    private String projectEnv;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ResumeInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.projectEnv = builder.projectEnv;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResumeInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ResumeInstanceRequest, Builder> {
        private Long instanceId; 
        private String projectEnv; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ResumeInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.projectEnv = request.projectEnv;
            this.regionId = request.regionId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(Long instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ProjectEnv.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
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
        public ResumeInstanceRequest build() {
            return new ResumeInstanceRequest(this);
        } 

    } 

}
