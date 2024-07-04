// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStorageGatewayRequest} extends {@link RequestModel}
 *
 * <p>CreateStorageGatewayRequest</p>
 */
public class CreateStorageGatewayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderDetails")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < OrderDetails> orderDetails;

    private CreateStorageGatewayRequest(Builder builder) {
        super(builder);
        this.orderDetails = builder.orderDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStorageGatewayRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderDetails
     */
    public java.util.List < OrderDetails> getOrderDetails() {
        return this.orderDetails;
    }

    public static final class Builder extends Request.Builder<CreateStorageGatewayRequest, Builder> {
        private java.util.List < OrderDetails> orderDetails; 

        private Builder() {
            super();
        } 

        private Builder(CreateStorageGatewayRequest request) {
            super(request);
            this.orderDetails = request.orderDetails;
        } 

        /**
         * The array of orders.
         */
        public Builder orderDetails(java.util.List < OrderDetails> orderDetails) {
            String orderDetailsShrink = shrink(orderDetails, "OrderDetails", "json");
            this.putQueryParameter("OrderDetails", orderDetailsShrink);
            this.orderDetails = orderDetails;
            return this;
        }

        @Override
        public CreateStorageGatewayRequest build() {
            return new CreateStorageGatewayRequest(this);
        } 

    } 

    public static class OrderDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("GatewayName")
        private String gatewayName;

        @com.aliyun.core.annotation.NameInMap("GatewayType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String gatewayType;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String vpcId;

        private OrderDetails(Builder builder) {
            this.description = builder.description;
            this.ensRegionId = builder.ensRegionId;
            this.gatewayName = builder.gatewayName;
            this.gatewayType = builder.gatewayType;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderDetails create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return gatewayName
         */
        public String getGatewayName() {
            return this.gatewayName;
        }

        /**
         * @return gatewayType
         */
        public String getGatewayType() {
            return this.gatewayType;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String description; 
            private String ensRegionId; 
            private String gatewayName; 
            private String gatewayType; 
            private String vpcId; 

            /**
             * The description of the gateway. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * The name of the gateway. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with `http://` or `https://`. The name can contain letters, digits, colons (.), underscores (\_), and hyphens (-).
             */
            public Builder gatewayName(String gatewayName) {
                this.gatewayName = gatewayName;
                return this;
            }

            /**
             * The type of the gateway. Set this parameter to **1**. **1** indicates iSCSI.
             */
            public Builder gatewayType(String gatewayType) {
                this.gatewayType = gatewayType;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public OrderDetails build() {
                return new OrderDetails(this);
            } 

        } 

    }
}
