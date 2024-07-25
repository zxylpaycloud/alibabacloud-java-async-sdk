// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeK8sClusterKubeConfigRequest} extends {@link RequestModel}
 *
 * <p>RevokeK8sClusterKubeConfigRequest</p>
 */
public class RevokeK8sClusterKubeConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    private RevokeK8sClusterKubeConfigRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeK8sClusterKubeConfigRequest create() {
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

    public static final class Builder extends Request.Builder<RevokeK8sClusterKubeConfigRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(RevokeK8sClusterKubeConfigRequest request) {
            super(request);
            this.clusterId = request.clusterId;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public RevokeK8sClusterKubeConfigRequest build() {
            return new RevokeK8sClusterKubeConfigRequest(this);
        } 

    } 

}
