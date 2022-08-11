// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQualityEntityRequest} extends {@link RequestModel}
 *
 * <p>CreateQualityEntityRequest</p>
 */
public class CreateQualityEntityRequest extends Request {
    @Body
    @NameInMap("EntityLevel")
    @Validation(required = true, maximum = 99)
    private Integer entityLevel;

    @Body
    @NameInMap("EnvType")
    @Validation(required = true, maxLength = 64, minLength = 1)
    private String envType;

    @Body
    @NameInMap("MatchExpression")
    @Validation(required = true, maxLength = 128, minLength = 1)
    private String matchExpression;

    @Body
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("TableName")
    @Validation(required = true, maxLength = 128, minLength = 1)
    private String tableName;

    private CreateQualityEntityRequest(Builder builder) {
        super(builder);
        this.entityLevel = builder.entityLevel;
        this.envType = builder.envType;
        this.matchExpression = builder.matchExpression;
        this.projectName = builder.projectName;
        this.regionId = builder.regionId;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQualityEntityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityLevel
     */
    public Integer getEntityLevel() {
        return this.entityLevel;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return matchExpression
     */
    public String getMatchExpression() {
        return this.matchExpression;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<CreateQualityEntityRequest, Builder> {
        private Integer entityLevel; 
        private String envType; 
        private String matchExpression; 
        private String projectName; 
        private String regionId; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(CreateQualityEntityRequest request) {
            super(request);
            this.entityLevel = request.entityLevel;
            this.envType = request.envType;
            this.matchExpression = request.matchExpression;
            this.projectName = request.projectName;
            this.regionId = request.regionId;
            this.tableName = request.tableName;
        } 

        /**
         * EntityLevel.
         */
        public Builder entityLevel(Integer entityLevel) {
            this.putBodyParameter("EntityLevel", entityLevel);
            this.entityLevel = entityLevel;
            return this;
        }

        /**
         * EnvType.
         */
        public Builder envType(String envType) {
            this.putBodyParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * MatchExpression.
         */
        public Builder matchExpression(String matchExpression) {
            this.putBodyParameter("MatchExpression", matchExpression);
            this.matchExpression = matchExpression;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
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
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public CreateQualityEntityRequest build() {
            return new CreateQualityEntityRequest(this);
        } 

    } 

}
