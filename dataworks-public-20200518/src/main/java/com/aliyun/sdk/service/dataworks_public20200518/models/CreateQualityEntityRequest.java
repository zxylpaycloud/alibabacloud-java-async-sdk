// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQualityEntityRequest} extends {@link RequestModel}
 *
 * <p>CreateQualityEntityRequest</p>
 */
public class CreateQualityEntityRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EntityLevel")
    @com.aliyun.core.annotation.Validation(maximum = 99)
    private Integer entityLevel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnvType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String envType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MatchExpression")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String matchExpression;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String tableName;

    private CreateQualityEntityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.entityLevel = builder.entityLevel;
        this.envType = builder.envType;
        this.matchExpression = builder.matchExpression;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<CreateQualityEntityRequest, Builder> {
        private String regionId; 
        private Integer entityLevel; 
        private String envType; 
        private String matchExpression; 
        private Long projectId; 
        private String projectName; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(CreateQualityEntityRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.entityLevel = request.entityLevel;
            this.envType = request.envType;
            this.matchExpression = request.matchExpression;
            this.projectId = request.projectId;
            this.projectName = request.projectName;
            this.tableName = request.tableName;
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
         * Valid values: 0 (corrected when SQl is completed) and 1 (corrected when task is completed).
         */
        public Builder entityLevel(Integer entityLevel) {
            this.putBodyParameter("EntityLevel", entityLevel);
            this.entityLevel = entityLevel;
            return this;
        }

        /**
         * The engine or data source type.
         */
        public Builder envType(String envType) {
            this.putBodyParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * The partition expression.
         */
        public Builder matchExpression(String matchExpression) {
            this.putBodyParameter("MatchExpression", matchExpression);
            this.matchExpression = matchExpression;
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
         * The name of the maxcompute project or data source.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * The name of the table.
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
