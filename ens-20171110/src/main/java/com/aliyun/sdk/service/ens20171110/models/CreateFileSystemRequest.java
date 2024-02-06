// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFileSystemRequest} extends {@link RequestModel}
 *
 * <p>CreateFileSystemRequest</p>
 */
public class CreateFileSystemRequest extends Request {
    @Query
    @NameInMap("OrderDetails")
    @Validation(required = true)
    private java.util.List < OrderDetails> orderDetails;

    private CreateFileSystemRequest(Builder builder) {
        super(builder);
        this.orderDetails = builder.orderDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileSystemRequest create() {
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

    public static final class Builder extends Request.Builder<CreateFileSystemRequest, Builder> {
        private java.util.List < OrderDetails> orderDetails; 

        private Builder() {
            super();
        } 

        private Builder(CreateFileSystemRequest request) {
            super(request);
            this.orderDetails = request.orderDetails;
        } 

        /**
         * The information about the orders.
         */
        public Builder orderDetails(java.util.List < OrderDetails> orderDetails) {
            String orderDetailsShrink = shrink(orderDetails, "OrderDetails", "json");
            this.putQueryParameter("OrderDetails", orderDetailsShrink);
            this.orderDetails = orderDetails;
            return this;
        }

        @Override
        public CreateFileSystemRequest build() {
            return new CreateFileSystemRequest(this);
        } 

    } 

    public static class OrderDetails extends TeaModel {
        @NameInMap("ChargeType")
        @Validation(required = true)
        private String chargeType;

        @NameInMap("EnsRegionId")
        @Validation(required = true)
        private String ensRegionId;

        @NameInMap("FileSystemName")
        @Validation(required = true)
        private String fileSystemName;

        @NameInMap("MountTargetDomain")
        @Validation(required = true)
        private String mountTargetDomain;

        @NameInMap("NetworkId")
        @Validation(required = true)
        private String networkId;

        @NameInMap("OrderType")
        @Validation(required = true)
        private String orderType;

        @NameInMap("ProtocolType")
        @Validation(required = true)
        private String protocolType;

        @NameInMap("StorgeType")
        @Validation(required = true)
        private String storgeType;

        private OrderDetails(Builder builder) {
            this.chargeType = builder.chargeType;
            this.ensRegionId = builder.ensRegionId;
            this.fileSystemName = builder.fileSystemName;
            this.mountTargetDomain = builder.mountTargetDomain;
            this.networkId = builder.networkId;
            this.orderType = builder.orderType;
            this.protocolType = builder.protocolType;
            this.storgeType = builder.storgeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderDetails create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return fileSystemName
         */
        public String getFileSystemName() {
            return this.fileSystemName;
        }

        /**
         * @return mountTargetDomain
         */
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        /**
         * @return networkId
         */
        public String getNetworkId() {
            return this.networkId;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return storgeType
         */
        public String getStorgeType() {
            return this.storgeType;
        }

        public static final class Builder {
            private String chargeType; 
            private String ensRegionId; 
            private String fileSystemName; 
            private String mountTargetDomain; 
            private String networkId; 
            private String orderType; 
            private String protocolType; 
            private String storgeType; 

            /**
             * The billing method of the NAS file system. Valid values:
             * <p>
             * 
             * *   PrePaid: subscription. This billing method is not supported.
             * *   PostPaid: pay-as-you-go.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
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
             * The name of the file system.
             */
            public Builder fileSystemName(String fileSystemName) {
                this.fileSystemName = fileSystemName;
                return this;
            }

            /**
             * The name of the mount target.
             */
            public Builder mountTargetDomain(String mountTargetDomain) {
                this.mountTargetDomain = mountTargetDomain;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder networkId(String networkId) {
                this.networkId = networkId;
                return this;
            }

            /**
             * The type of the order.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * The storage protocol. Valid values: nsf and smb.
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * The type of the storage. Set the value to capacity.
             */
            public Builder storgeType(String storgeType) {
                this.storgeType = storgeType;
                return this;
            }

            public OrderDetails build() {
                return new OrderDetails(this);
            } 

        } 

    }
}
