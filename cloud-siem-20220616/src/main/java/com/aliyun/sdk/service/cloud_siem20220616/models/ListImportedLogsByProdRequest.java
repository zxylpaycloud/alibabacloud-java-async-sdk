// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListImportedLogsByProdRequest} extends {@link RequestModel}
 *
 * <p>ListImportedLogsByProdRequest</p>
 */
public class ListImportedLogsByProdRequest extends Request {
    @Body
    @NameInMap("CloudCode")
    @Validation(required = true)
    private String cloudCode;

    @Body
    @NameInMap("ProdCode")
    @Validation(required = true)
    private String prodCode;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private ListImportedLogsByProdRequest(Builder builder) {
        super(builder);
        this.cloudCode = builder.cloudCode;
        this.prodCode = builder.prodCode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImportedLogsByProdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudCode
     */
    public String getCloudCode() {
        return this.cloudCode;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListImportedLogsByProdRequest, Builder> {
        private String cloudCode; 
        private String prodCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListImportedLogsByProdRequest request) {
            super(request);
            this.cloudCode = request.cloudCode;
            this.prodCode = request.prodCode;
            this.regionId = request.regionId;
        } 

        /**
         * CloudCode.
         */
        public Builder cloudCode(String cloudCode) {
            this.putBodyParameter("CloudCode", cloudCode);
            this.cloudCode = cloudCode;
            return this;
        }

        /**
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putBodyParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListImportedLogsByProdRequest build() {
            return new ListImportedLogsByProdRequest(this);
        } 

    } 

}
