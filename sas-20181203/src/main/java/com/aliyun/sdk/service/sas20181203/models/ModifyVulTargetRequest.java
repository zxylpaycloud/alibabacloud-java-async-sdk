// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVulTargetRequest} extends {@link RequestModel}
 *
 * <p>ModifyVulTargetRequest</p>
 */
public class ModifyVulTargetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    private String target;

    private ModifyVulTargetRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVulTargetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    public static final class Builder extends Request.Builder<ModifyVulTargetRequest, Builder> {
        private String config; 
        private String target; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVulTargetRequest request) {
            super(request);
            this.config = request.config;
            this.target = request.target;
        } 

        /**
         * The configurations. The value of this parameter is in the JSON format and contains the following fields:
         * <p>
         * 
         * *   **vulType**: the type of the vulnerabilities to scan. Valid values:
         * 
         *     *   **cve**: Linux software vulnerabilities
         *     *   **sys**: Windows system vulnerabilities
         *     *   **cms**: Web-CMS vulnerabilities
         *     *   **emg**: urgent vulnerabilities
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * The operation. The value of this parameter is in the JSON format and contains the following fields:
         * <p>
         * 
         * *   **target**: the UUID of the server.
         * 
         * *   **targetType**: the application scope of the operation. Set the value to uuid.
         * 
         * *   **flag**: the type of the operation. Valid values:
         * 
         *     *   **add**: select
         *     *   **del**: deselect
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        @Override
        public ModifyVulTargetRequest build() {
            return new ModifyVulTargetRequest(this);
        } 

    } 

}
