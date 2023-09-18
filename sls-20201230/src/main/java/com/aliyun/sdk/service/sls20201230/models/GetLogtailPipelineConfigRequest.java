// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetLogtailPipelineConfigRequest} extends {@link RequestModel}
 *
 * <p>GetLogtailPipelineConfigRequest</p>
 */
public class GetLogtailPipelineConfigRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Path
    @NameInMap("configName")
    @Validation(required = true)
    private String configName;

    private GetLogtailPipelineConfigRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.configName = builder.configName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLogtailPipelineConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    public static final class Builder extends Request.Builder<GetLogtailPipelineConfigRequest, Builder> {
        private String project; 
        private String configName; 

        private Builder() {
            super();
        } 

        private Builder(GetLogtailPipelineConfigRequest request) {
            super(request);
            this.project = request.project;
            this.configName = request.configName;
        } 

        /**
         * project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * configName.
         */
        public Builder configName(String configName) {
            this.putPathParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        @Override
        public GetLogtailPipelineConfigRequest build() {
            return new GetLogtailPipelineConfigRequest(this);
        } 

    } 

}