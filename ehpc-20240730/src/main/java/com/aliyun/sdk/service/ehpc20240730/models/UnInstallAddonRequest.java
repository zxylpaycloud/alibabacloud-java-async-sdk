// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnInstallAddonRequest} extends {@link RequestModel}
 *
 * <p>UnInstallAddonRequest</p>
 */
public class UnInstallAddonRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddonId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addonId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    private UnInstallAddonRequest(Builder builder) {
        super(builder);
        this.addonId = builder.addonId;
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnInstallAddonRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addonId
     */
    public String getAddonId() {
        return this.addonId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    public static final class Builder extends Request.Builder<UnInstallAddonRequest, Builder> {
        private String addonId; 
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(UnInstallAddonRequest request) {
            super(request);
            this.addonId = request.addonId;
            this.clusterId = request.clusterId;
        } 

        /**
         * The addon ID.
         */
        public Builder addonId(String addonId) {
            this.putQueryParameter("AddonId", addonId);
            this.addonId = addonId;
            return this;
        }

        /**
         * The cluster ID.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public UnInstallAddonRequest build() {
            return new UnInstallAddonRequest(this);
        } 

    } 

}
