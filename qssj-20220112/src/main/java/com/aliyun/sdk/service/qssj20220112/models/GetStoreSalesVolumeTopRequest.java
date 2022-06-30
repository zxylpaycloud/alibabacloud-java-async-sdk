// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStoreSalesVolumeTopRequest} extends {@link RequestModel}
 *
 * <p>GetStoreSalesVolumeTopRequest</p>
 */
public class GetStoreSalesVolumeTopRequest extends Request {
    @Body
    @NameInMap("CateIds")
    @Validation(required = true)
    private String cateIds;

    private GetStoreSalesVolumeTopRequest(Builder builder) {
        super(builder);
        this.cateIds = builder.cateIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStoreSalesVolumeTopRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cateIds
     */
    public String getCateIds() {
        return this.cateIds;
    }

    public static final class Builder extends Request.Builder<GetStoreSalesVolumeTopRequest, Builder> {
        private String cateIds; 

        private Builder() {
            super();
        } 

        private Builder(GetStoreSalesVolumeTopRequest request) {
            super(request);
            this.cateIds = request.cateIds;
        } 

        /**
         * CateIds.
         */
        public Builder cateIds(String cateIds) {
            this.putBodyParameter("CateIds", cateIds);
            this.cateIds = cateIds;
            return this;
        }

        @Override
        public GetStoreSalesVolumeTopRequest build() {
            return new GetStoreSalesVolumeTopRequest(this);
        } 

    } 

}
