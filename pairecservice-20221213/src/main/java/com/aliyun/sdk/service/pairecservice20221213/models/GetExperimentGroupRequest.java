// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExperimentGroupRequest} extends {@link RequestModel}
 *
 * <p>GetExperimentGroupRequest</p>
 */
public class GetExperimentGroupRequest extends Request {
    @Path
    @NameInMap("ExperimentGroupId")
    @Validation(required = true)
    private String experimentGroupId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetExperimentGroupRequest(Builder builder) {
        super(builder);
        this.experimentGroupId = builder.experimentGroupId;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return experimentGroupId
     */
    public String getExperimentGroupId() {
        return this.experimentGroupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetExperimentGroupRequest, Builder> {
        private String experimentGroupId; 
        private String regionId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetExperimentGroupRequest request) {
            super(request);
            this.experimentGroupId = request.experimentGroupId;
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
        } 

        /**
         * ExperimentGroupId.
         */
        public Builder experimentGroupId(String experimentGroupId) {
            this.putPathParameter("ExperimentGroupId", experimentGroupId);
            this.experimentGroupId = experimentGroupId;
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

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetExperimentGroupRequest build() {
            return new GetExperimentGroupRequest(this);
        } 

    } 

}
