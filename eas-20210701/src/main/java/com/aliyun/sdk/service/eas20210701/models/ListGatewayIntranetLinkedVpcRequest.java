// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGatewayIntranetLinkedVpcRequest} extends {@link RequestModel}
 *
 * <p>ListGatewayIntranetLinkedVpcRequest</p>
 */
public class ListGatewayIntranetLinkedVpcRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    private String clusterId;

    @Path
    @NameInMap("GatewayId")
    private String gatewayId;

    private ListGatewayIntranetLinkedVpcRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.gatewayId = builder.gatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayIntranetLinkedVpcRequest create() {
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
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    public static final class Builder extends Request.Builder<ListGatewayIntranetLinkedVpcRequest, Builder> {
        private String clusterId; 
        private String gatewayId; 

        private Builder() {
            super();
        } 

        private Builder(ListGatewayIntranetLinkedVpcRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.gatewayId = request.gatewayId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        @Override
        public ListGatewayIntranetLinkedVpcRequest build() {
            return new ListGatewayIntranetLinkedVpcRequest(this);
        } 

    } 

}
