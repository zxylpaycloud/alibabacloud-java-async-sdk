// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDataServiceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateDataServiceGroupRequest</p>
 */
public class CreateDataServiceGroupRequest extends Request {
    @Body
    @NameInMap("ApiGatewayGroupId")
    @Validation(required = true)
    private String apiGatewayGroupId;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true, minimum = 1)
    private Long projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true, minimum = 1)
    private Long tenantId;

    private CreateDataServiceGroupRequest(Builder builder) {
        super(builder);
        this.apiGatewayGroupId = builder.apiGatewayGroupId;
        this.description = builder.description;
        this.groupName = builder.groupName;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataServiceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiGatewayGroupId
     */
    public String getApiGatewayGroupId() {
        return this.apiGatewayGroupId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CreateDataServiceGroupRequest, Builder> {
        private String apiGatewayGroupId; 
        private String description; 
        private String groupName; 
        private Long projectId; 
        private String regionId; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataServiceGroupRequest request) {
            super(request);
            this.apiGatewayGroupId = request.apiGatewayGroupId;
            this.description = request.description;
            this.groupName = request.groupName;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.tenantId = request.tenantId;
        } 

        /**
         * ApiGatewayGroupId.
         */
        public Builder apiGatewayGroupId(String apiGatewayGroupId) {
            this.putBodyParameter("ApiGatewayGroupId", apiGatewayGroupId);
            this.apiGatewayGroupId = apiGatewayGroupId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putBodyParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
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
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreateDataServiceGroupRequest build() {
            return new CreateDataServiceGroupRequest(this);
        } 

    } 

}
