// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeProjectFeatureEntityHotIdVersionRequest} extends {@link RequestModel}
 *
 * <p>ChangeProjectFeatureEntityHotIdVersionRequest</p>
 */
public class ChangeProjectFeatureEntityHotIdVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("FeatureEntityName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureEntityName;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Version")
    @com.aliyun.core.annotation.Validation(required = true)
    private String version;

    private ChangeProjectFeatureEntityHotIdVersionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.projectId = builder.projectId;
        this.featureEntityName = builder.featureEntityName;
        this.regionId = builder.regionId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeProjectFeatureEntityHotIdVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return featureEntityName
     */
    public String getFeatureEntityName() {
        return this.featureEntityName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<ChangeProjectFeatureEntityHotIdVersionRequest, Builder> {
        private String instanceId; 
        private String projectId; 
        private String featureEntityName; 
        private String regionId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(ChangeProjectFeatureEntityHotIdVersionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.projectId = request.projectId;
            this.featureEntityName = request.featureEntityName;
            this.regionId = request.regionId;
            this.version = request.version;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * FeatureEntityName.
         */
        public Builder featureEntityName(String featureEntityName) {
            this.putPathParameter("FeatureEntityName", featureEntityName);
            this.featureEntityName = featureEntityName;
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
         * Version.
         */
        public Builder version(String version) {
            this.putBodyParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public ChangeProjectFeatureEntityHotIdVersionRequest build() {
            return new ChangeProjectFeatureEntityHotIdVersionRequest(this);
        } 

    } 

}
