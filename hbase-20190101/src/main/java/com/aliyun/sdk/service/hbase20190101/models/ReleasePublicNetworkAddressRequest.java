// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleasePublicNetworkAddressRequest} extends {@link RequestModel}
 *
 * <p>ReleasePublicNetworkAddressRequest</p>
 */
public class ReleasePublicNetworkAddressRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    private ReleasePublicNetworkAddressRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleasePublicNetworkAddressRequest create() {
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

    public static final class Builder extends Request.Builder<ReleasePublicNetworkAddressRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(ReleasePublicNetworkAddressRequest response) {
            super(response);
            this.clusterId = response.clusterId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public ReleasePublicNetworkAddressRequest build() {
            return new ReleasePublicNetworkAddressRequest(this);
        } 

    } 

}
