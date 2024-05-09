// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNodePoolNodeConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyNodePoolNodeConfigRequest</p>
 */
public class ModifyNodePoolNodeConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("NodepoolId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodepoolId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kubelet_config")
    private KubeletConfig kubeletConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("os_config")
    private OsConfig osConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("rolling_policy")
    private RollingPolicy rollingPolicy;

    private ModifyNodePoolNodeConfigRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
        this.kubeletConfig = builder.kubeletConfig;
        this.osConfig = builder.osConfig;
        this.rollingPolicy = builder.rollingPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNodePoolNodeConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    /**
     * @return kubeletConfig
     */
    public KubeletConfig getKubeletConfig() {
        return this.kubeletConfig;
    }

    /**
     * @return osConfig
     */
    public OsConfig getOsConfig() {
        return this.osConfig;
    }

    /**
     * @return rollingPolicy
     */
    public RollingPolicy getRollingPolicy() {
        return this.rollingPolicy;
    }

    public static final class Builder extends Request.Builder<ModifyNodePoolNodeConfigRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 
        private KubeletConfig kubeletConfig; 
        private OsConfig osConfig; 
        private RollingPolicy rollingPolicy; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNodePoolNodeConfigRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
            this.kubeletConfig = request.kubeletConfig;
            this.osConfig = request.osConfig;
            this.rollingPolicy = request.rollingPolicy;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The node pool ID.
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putPathParameter("NodepoolId", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * The kubelet configuration.
         */
        public Builder kubeletConfig(KubeletConfig kubeletConfig) {
            this.putBodyParameter("kubelet_config", kubeletConfig);
            this.kubeletConfig = kubeletConfig;
            return this;
        }

        /**
         * os_config.
         */
        public Builder osConfig(OsConfig osConfig) {
            this.putBodyParameter("os_config", osConfig);
            this.osConfig = osConfig;
            return this;
        }

        /**
         * The rotation configuration.
         */
        public Builder rollingPolicy(RollingPolicy rollingPolicy) {
            this.putBodyParameter("rolling_policy", rollingPolicy);
            this.rollingPolicy = rollingPolicy;
            return this;
        }

        @Override
        public ModifyNodePoolNodeConfigRequest build() {
            return new ModifyNodePoolNodeConfigRequest(this);
        } 

    } 

    public static class OsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("sysctl")
        private java.util.Map < String, ? > sysctl;

        private OsConfig(Builder builder) {
            this.sysctl = builder.sysctl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OsConfig create() {
            return builder().build();
        }

        /**
         * @return sysctl
         */
        public java.util.Map < String, ? > getSysctl() {
            return this.sysctl;
        }

        public static final class Builder {
            private java.util.Map < String, ? > sysctl; 

            /**
             * sysctl.
             */
            public Builder sysctl(java.util.Map < String, ? > sysctl) {
                this.sysctl = sysctl;
                return this;
            }

            public OsConfig build() {
                return new OsConfig(this);
            } 

        } 

    }
    public static class RollingPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("max_parallelism")
        private Long maxParallelism;

        private RollingPolicy(Builder builder) {
            this.maxParallelism = builder.maxParallelism;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RollingPolicy create() {
            return builder().build();
        }

        /**
         * @return maxParallelism
         */
        public Long getMaxParallelism() {
            return this.maxParallelism;
        }

        public static final class Builder {
            private Long maxParallelism; 

            /**
             * The maximum number of nodes in the Unschedulable state.
             */
            public Builder maxParallelism(Long maxParallelism) {
                this.maxParallelism = maxParallelism;
                return this;
            }

            public RollingPolicy build() {
                return new RollingPolicy(this);
            } 

        } 

    }
}
