// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOpaClusterPluginRequest} extends {@link RequestModel}
 *
 * <p>CreateOpaClusterPluginRequest</p>
 */
public class CreateOpaClusterPluginRequest extends Request {
    @Query
    @NameInMap("ClusterIds")
    @Validation(required = true)
    private java.util.List < String > clusterIds;

    private CreateOpaClusterPluginRequest(Builder builder) {
        super(builder);
        this.clusterIds = builder.clusterIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOpaClusterPluginRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterIds
     */
    public java.util.List < String > getClusterIds() {
        return this.clusterIds;
    }

    public static final class Builder extends Request.Builder<CreateOpaClusterPluginRequest, Builder> {
        private java.util.List < String > clusterIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateOpaClusterPluginRequest request) {
            super(request);
            this.clusterIds = request.clusterIds;
        } 

        /**
         * ClusterIds.
         */
        public Builder clusterIds(java.util.List < String > clusterIds) {
            this.putQueryParameter("ClusterIds", clusterIds);
            this.clusterIds = clusterIds;
            return this;
        }

        @Override
        public CreateOpaClusterPluginRequest build() {
            return new CreateOpaClusterPluginRequest(this);
        } 

    } 

}
