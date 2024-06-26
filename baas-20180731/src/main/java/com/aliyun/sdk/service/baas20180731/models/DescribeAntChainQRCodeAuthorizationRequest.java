// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainQRCodeAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>DescribeAntChainQRCodeAuthorizationRequest</p>
 */
public class DescribeAntChainQRCodeAuthorizationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AntChainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String antChainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QRCodeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String QRCodeType;

    private DescribeAntChainQRCodeAuthorizationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.antChainId = builder.antChainId;
        this.QRCodeType = builder.QRCodeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainQRCodeAuthorizationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return antChainId
     */
    public String getAntChainId() {
        return this.antChainId;
    }

    /**
     * @return QRCodeType
     */
    public String getQRCodeType() {
        return this.QRCodeType;
    }

    public static final class Builder extends Request.Builder<DescribeAntChainQRCodeAuthorizationRequest, Builder> {
        private String regionId; 
        private String antChainId; 
        private String QRCodeType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainQRCodeAuthorizationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.antChainId = request.antChainId;
            this.QRCodeType = request.QRCodeType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AntChainId.
         */
        public Builder antChainId(String antChainId) {
            this.putBodyParameter("AntChainId", antChainId);
            this.antChainId = antChainId;
            return this;
        }

        /**
         * QRCodeType.
         */
        public Builder QRCodeType(String QRCodeType) {
            this.putBodyParameter("QRCodeType", QRCodeType);
            this.QRCodeType = QRCodeType;
            return this;
        }

        @Override
        public DescribeAntChainQRCodeAuthorizationRequest build() {
            return new DescribeAntChainQRCodeAuthorizationRequest(this);
        } 

    } 

}
