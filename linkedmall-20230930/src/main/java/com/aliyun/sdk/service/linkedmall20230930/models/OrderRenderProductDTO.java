// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OrderRenderProductDTO} extends {@link TeaModel}
 *
 * <p>OrderRenderProductDTO</p>
 */
public class OrderRenderProductDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("productId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productId;

    @com.aliyun.core.annotation.NameInMap("purchaserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String purchaserId;

    @com.aliyun.core.annotation.NameInMap("quantity")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer quantity;

    @com.aliyun.core.annotation.NameInMap("skuId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skuId;

    private OrderRenderProductDTO(Builder builder) {
        this.productId = builder.productId;
        this.purchaserId = builder.purchaserId;
        this.quantity = builder.quantity;
        this.skuId = builder.skuId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OrderRenderProductDTO create() {
        return builder().build();
    }

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return purchaserId
     */
    public String getPurchaserId() {
        return this.purchaserId;
    }

    /**
     * @return quantity
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * @return skuId
     */
    public String getSkuId() {
        return this.skuId;
    }

    public static final class Builder {
        private String productId; 
        private String purchaserId; 
        private Integer quantity; 
        private String skuId; 

        /**
         * productId.
         */
        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        /**
         * purchaserId.
         */
        public Builder purchaserId(String purchaserId) {
            this.purchaserId = purchaserId;
            return this;
        }

        /**
         * quantity.
         */
        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * skuId.
         */
        public Builder skuId(String skuId) {
            this.skuId = skuId;
            return this;
        }

        public OrderRenderProductDTO build() {
            return new OrderRenderProductDTO(this);
        } 

    } 

}
