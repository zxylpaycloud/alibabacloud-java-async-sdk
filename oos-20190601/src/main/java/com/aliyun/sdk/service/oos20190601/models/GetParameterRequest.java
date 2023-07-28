// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetParameterRequest} extends {@link RequestModel}
 *
 * <p>GetParameterRequest</p>
 */
public class GetParameterRequest extends Request {
    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ParameterVersion")
    private Integer parameterVersion;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private GetParameterRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.parameterVersion = builder.parameterVersion;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetParameterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parameterVersion
     */
    public Integer getParameterVersion() {
        return this.parameterVersion;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<GetParameterRequest, Builder> {
        private String name; 
        private Integer parameterVersion; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetParameterRequest request) {
            super(request);
            this.name = request.name;
            this.parameterVersion = request.parameterVersion;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The operation that you want to perform. Set the value to GetParameter.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The time when the common parameter was updated.
         */
        public Builder parameterVersion(Integer parameterVersion) {
            this.putQueryParameter("ParameterVersion", parameterVersion);
            this.parameterVersion = parameterVersion;
            return this;
        }

        /**
         * The name of the common parameter.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The user who created the common parameter.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public GetParameterRequest build() {
            return new GetParameterRequest(this);
        } 

    } 

}
