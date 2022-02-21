// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainQRCodeAuthorizationV2Request} extends {@link RequestModel}
 *
 * <p>DescribeAntChainQRCodeAuthorizationV2Request</p>
 */
public class DescribeAntChainQRCodeAuthorizationV2Request extends Request {
    @Body
    @NameInMap("AntChainId")
    @Validation(required = true)
    private String antChainId;

    @Body
    @NameInMap("QRCodeType")
    @Validation(required = true)
    private String QRCodeType;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeAntChainQRCodeAuthorizationV2Request(Builder builder) {
        super(builder);
        this.antChainId = builder.antChainId;
        this.QRCodeType = builder.QRCodeType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainQRCodeAuthorizationV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeAntChainQRCodeAuthorizationV2Request, Builder> {
        private String antChainId; 
        private String QRCodeType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAntChainQRCodeAuthorizationV2Request response) {
            super(response);
            this.antChainId = response.antChainId;
            this.QRCodeType = response.QRCodeType;
            this.regionId = response.regionId;
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeAntChainQRCodeAuthorizationV2Request build() {
            return new DescribeAntChainQRCodeAuthorizationV2Request(this);
        } 

    } 

}
