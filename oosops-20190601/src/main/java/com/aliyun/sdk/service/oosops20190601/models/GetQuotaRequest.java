// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQuotaRequest} extends {@link RequestModel}
 *
 * <p>GetQuotaRequest</p>
 */
public class GetQuotaRequest extends Request {
    @Query
    @NameInMap("QuotaName")
    @Validation(required = true)
    private String quotaName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Uid")
    @Validation(required = true)
    private String uid;

    private GetQuotaRequest(Builder builder) {
        super(builder);
        this.quotaName = builder.quotaName;
        this.regionId = builder.regionId;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quotaName
     */
    public String getQuotaName() {
        return this.quotaName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<GetQuotaRequest, Builder> {
        private String quotaName; 
        private String regionId; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(GetQuotaRequest request) {
            super(request);
            this.quotaName = request.quotaName;
            this.regionId = request.regionId;
            this.uid = request.uid;
        } 

        /**
         * QuotaName.
         */
        public Builder quotaName(String quotaName) {
            this.putQueryParameter("QuotaName", quotaName);
            this.quotaName = quotaName;
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

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public GetQuotaRequest build() {
            return new GetQuotaRequest(this);
        } 

    } 

}
