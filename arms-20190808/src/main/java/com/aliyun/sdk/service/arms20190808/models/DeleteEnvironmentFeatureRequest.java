// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEnvironmentFeatureRequest} extends {@link RequestModel}
 *
 * <p>DeleteEnvironmentFeatureRequest</p>
 */
public class DeleteEnvironmentFeatureRequest extends Request {
    @Query
    @NameInMap("EnvironmentId")
    @Validation(required = true)
    private String environmentId;

    @Query
    @NameInMap("FeatureName")
    @Validation(required = true)
    private String featureName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DeleteEnvironmentFeatureRequest(Builder builder) {
        super(builder);
        this.environmentId = builder.environmentId;
        this.featureName = builder.featureName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEnvironmentFeatureRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return featureName
     */
    public String getFeatureName() {
        return this.featureName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteEnvironmentFeatureRequest, Builder> {
        private String environmentId; 
        private String featureName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEnvironmentFeatureRequest request) {
            super(request);
            this.environmentId = request.environmentId;
            this.featureName = request.featureName;
            this.regionId = request.regionId;
        } 

        /**
         * EnvironmentId.
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("EnvironmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * FeatureName.
         */
        public Builder featureName(String featureName) {
            this.putQueryParameter("FeatureName", featureName);
            this.featureName = featureName;
            return this;
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
        public DeleteEnvironmentFeatureRequest build() {
            return new DeleteEnvironmentFeatureRequest(this);
        } 

    } 

}
