// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallAddonResponseBody} extends {@link TeaModel}
 *
 * <p>InstallAddonResponseBody</p>
 */
public class InstallAddonResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddonId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addonId;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private InstallAddonResponseBody(Builder builder) {
        this.addonId = builder.addonId;
        this.clusterId = builder.clusterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallAddonResponseBody create() {
        return builder().build();
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String addonId; 
        private String clusterId; 
        private String requestId; 

        /**
         * The addon ID.
         */
        public Builder addonId(String addonId) {
            this.addonId = addonId;
            return this;
        }

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InstallAddonResponseBody build() {
            return new InstallAddonResponseBody(this);
        } 

    } 

}
