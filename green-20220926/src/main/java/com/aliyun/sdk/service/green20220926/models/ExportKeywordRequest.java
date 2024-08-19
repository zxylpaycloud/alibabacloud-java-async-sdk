// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportKeywordRequest} extends {@link RequestModel}
 *
 * <p>ExportKeywordRequest</p>
 */
public class ExportKeywordRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LibId")
    private String libId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ExportKeywordRequest(Builder builder) {
        super(builder);
        this.libId = builder.libId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportKeywordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return libId
     */
    public String getLibId() {
        return this.libId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ExportKeywordRequest, Builder> {
        private String libId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ExportKeywordRequest request) {
            super(request);
            this.libId = request.libId;
            this.regionId = request.regionId;
        } 

        /**
         * LibId.
         */
        public Builder libId(String libId) {
            this.putBodyParameter("LibId", libId);
            this.libId = libId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ExportKeywordRequest build() {
            return new ExportKeywordRequest(this);
        } 

    } 

}
