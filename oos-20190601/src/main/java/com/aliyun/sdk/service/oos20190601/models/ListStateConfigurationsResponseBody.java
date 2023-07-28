// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStateConfigurationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListStateConfigurationsResponseBody</p>
 */
public class ListStateConfigurationsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StateConfigurations")
    private java.util.List < StateConfigurations> stateConfigurations;

    private ListStateConfigurationsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.stateConfigurations = builder.stateConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStateConfigurationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stateConfigurations
     */
    public java.util.List < StateConfigurations> getStateConfigurations() {
        return this.stateConfigurations;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < StateConfigurations> stateConfigurations; 

        /**
         * The token that is used to retrieve the next page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The desired-state configurations.
         */
        public Builder stateConfigurations(java.util.List < StateConfigurations> stateConfigurations) {
            this.stateConfigurations = stateConfigurations;
            return this;
        }

        public ListStateConfigurationsResponseBody build() {
            return new ListStateConfigurationsResponseBody(this);
        } 

    } 

    public static class StateConfigurations extends TeaModel {
        @NameInMap("ConfigureMode")
        private String configureMode;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Parameters")
        private String parameters;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ScheduleExpression")
        private String scheduleExpression;

        @NameInMap("ScheduleType")
        private String scheduleType;

        @NameInMap("StateConfigurationId")
        private String stateConfigurationId;

        @NameInMap("Tags")
        private java.util.Map < String, ? > tags;

        @NameInMap("Targets")
        private String targets;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("TemplateVersion")
        private String templateVersion;

        @NameInMap("UpdateTime")
        private String updateTime;

        private StateConfigurations(Builder builder) {
            this.configureMode = builder.configureMode;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.parameters = builder.parameters;
            this.resourceGroupId = builder.resourceGroupId;
            this.scheduleExpression = builder.scheduleExpression;
            this.scheduleType = builder.scheduleType;
            this.stateConfigurationId = builder.stateConfigurationId;
            this.tags = builder.tags;
            this.targets = builder.targets;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateVersion = builder.templateVersion;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StateConfigurations create() {
            return builder().build();
        }

        /**
         * @return configureMode
         */
        public String getConfigureMode() {
            return this.configureMode;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return parameters
         */
        public String getParameters() {
            return this.parameters;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return scheduleExpression
         */
        public String getScheduleExpression() {
            return this.scheduleExpression;
        }

        /**
         * @return scheduleType
         */
        public String getScheduleType() {
            return this.scheduleType;
        }

        /**
         * @return stateConfigurationId
         */
        public String getStateConfigurationId() {
            return this.stateConfigurationId;
        }

        /**
         * @return tags
         */
        public java.util.Map < String, ? > getTags() {
            return this.tags;
        }

        /**
         * @return targets
         */
        public String getTargets() {
            return this.targets;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return templateVersion
         */
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String configureMode; 
            private String createTime; 
            private String description; 
            private String parameters; 
            private String resourceGroupId; 
            private String scheduleExpression; 
            private String scheduleType; 
            private String stateConfigurationId; 
            private java.util.Map < String, ? > tags; 
            private String targets; 
            private String templateId; 
            private String templateName; 
            private String templateVersion; 
            private String updateTime; 

            /**
             * The configuration mode.
             */
            public Builder configureMode(String configureMode) {
                this.configureMode = configureMode;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The parameters.
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The schedule expression.
             */
            public Builder scheduleExpression(String scheduleExpression) {
                this.scheduleExpression = scheduleExpression;
                return this;
            }

            /**
             * The schedule type.
             */
            public Builder scheduleType(String scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * The ID of the desired-state configuration.
             */
            public Builder stateConfigurationId(String stateConfigurationId) {
                this.stateConfigurationId = stateConfigurationId;
                return this;
            }

            /**
             * The tag of the auxiliary media asset.
             */
            public Builder tags(java.util.Map < String, ? > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The target EMR resource.
             */
            public Builder targets(String targets) {
                this.targets = targets;
                return this;
            }

            /**
             * The ID of the cluster template.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * The name of the template.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * The version of the template.
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * The time when the configuration is updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public StateConfigurations build() {
                return new StateConfigurations(this);
            } 

        } 

    }
}
