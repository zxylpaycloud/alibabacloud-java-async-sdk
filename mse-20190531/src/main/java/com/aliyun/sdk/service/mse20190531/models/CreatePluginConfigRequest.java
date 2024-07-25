// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePluginConfigRequest} extends {@link RequestModel}
 *
 * <p>CreatePluginConfigRequest</p>
 */
public class CreatePluginConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigLevel")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer configLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pluginId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIdList")
    private java.util.List < Long > resourceIdList;

    private CreatePluginConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.config = builder.config;
        this.configLevel = builder.configLevel;
        this.enable = builder.enable;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.pluginId = builder.pluginId;
        this.resourceIdList = builder.resourceIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePluginConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return configLevel
     */
    public Integer getConfigLevel() {
        return this.configLevel;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return pluginId
     */
    public Long getPluginId() {
        return this.pluginId;
    }

    /**
     * @return resourceIdList
     */
    public java.util.List < Long > getResourceIdList() {
        return this.resourceIdList;
    }

    public static final class Builder extends Request.Builder<CreatePluginConfigRequest, Builder> {
        private String acceptLanguage; 
        private String config; 
        private Integer configLevel; 
        private Boolean enable; 
        private String gatewayUniqueId; 
        private Long pluginId; 
        private java.util.List < Long > resourceIdList; 

        private Builder() {
            super();
        } 

        private Builder(CreatePluginConfigRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.config = request.config;
            this.configLevel = request.configLevel;
            this.enable = request.enable;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.pluginId = request.pluginId;
            this.resourceIdList = request.resourceIdList;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * ConfigLevel.
         */
        public Builder configLevel(Integer configLevel) {
            this.putQueryParameter("ConfigLevel", configLevel);
            this.configLevel = configLevel;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * PluginId.
         */
        public Builder pluginId(Long pluginId) {
            this.putQueryParameter("PluginId", pluginId);
            this.pluginId = pluginId;
            return this;
        }

        /**
         * ResourceIdList.
         */
        public Builder resourceIdList(java.util.List < Long > resourceIdList) {
            String resourceIdListShrink = shrink(resourceIdList, "ResourceIdList", "json");
            this.putQueryParameter("ResourceIdList", resourceIdListShrink);
            this.resourceIdList = resourceIdList;
            return this;
        }

        @Override
        public CreatePluginConfigRequest build() {
            return new CreatePluginConfigRequest(this);
        } 

    } 

}
