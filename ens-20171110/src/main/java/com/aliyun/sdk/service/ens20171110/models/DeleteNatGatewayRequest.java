// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNatGatewayRequest} extends {@link RequestModel}
 *
 * <p>DeleteNatGatewayRequest</p>
 */
public class DeleteNatGatewayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String natGatewayId;

    private DeleteNatGatewayRequest(Builder builder) {
        super(builder);
        this.natGatewayId = builder.natGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNatGatewayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public static final class Builder extends Request.Builder<DeleteNatGatewayRequest, Builder> {
        private String natGatewayId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNatGatewayRequest request) {
            super(request);
            this.natGatewayId = request.natGatewayId;
        } 

        /**
         * The ID of the NAT gateway that you want to delete.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.putQueryParameter("NatGatewayId", natGatewayId);
            this.natGatewayId = natGatewayId;
            return this;
        }

        @Override
        public DeleteNatGatewayRequest build() {
            return new DeleteNatGatewayRequest(this);
        } 

    } 

}
