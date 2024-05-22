// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindEslDeviceShelfRequest} extends {@link RequestModel}
 *
 * <p>BindEslDeviceShelfRequest</p>
 */
public class BindEslDeviceShelfRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EslBarCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eslBarCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShelfCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shelfCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeId;

    private BindEslDeviceShelfRequest(Builder builder) {
        super(builder);
        this.eslBarCode = builder.eslBarCode;
        this.shelfCode = builder.shelfCode;
        this.storeId = builder.storeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindEslDeviceShelfRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eslBarCode
     */
    public String getEslBarCode() {
        return this.eslBarCode;
    }

    /**
     * @return shelfCode
     */
    public String getShelfCode() {
        return this.shelfCode;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    public static final class Builder extends Request.Builder<BindEslDeviceShelfRequest, Builder> {
        private String eslBarCode; 
        private String shelfCode; 
        private String storeId; 

        private Builder() {
            super();
        } 

        private Builder(BindEslDeviceShelfRequest request) {
            super(request);
            this.eslBarCode = request.eslBarCode;
            this.shelfCode = request.shelfCode;
            this.storeId = request.storeId;
        } 

        /**
         * EslBarCode.
         */
        public Builder eslBarCode(String eslBarCode) {
            this.putBodyParameter("EslBarCode", eslBarCode);
            this.eslBarCode = eslBarCode;
            return this;
        }

        /**
         * ShelfCode.
         */
        public Builder shelfCode(String shelfCode) {
            this.putBodyParameter("ShelfCode", shelfCode);
            this.shelfCode = shelfCode;
            return this;
        }

        /**
         * StoreId.
         */
        public Builder storeId(String storeId) {
            this.putBodyParameter("StoreId", storeId);
            this.storeId = storeId;
            return this;
        }

        @Override
        public BindEslDeviceShelfRequest build() {
            return new BindEslDeviceShelfRequest(this);
        } 

    } 

}
