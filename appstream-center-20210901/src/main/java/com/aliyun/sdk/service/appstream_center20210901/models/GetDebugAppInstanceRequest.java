// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDebugAppInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetDebugAppInstanceRequest</p>
 */
public class GetDebugAppInstanceRequest extends Request {
    @Body
    @NameInMap("AppInstanceGroupId")
    @Validation(required = true)
    private String appInstanceGroupId;

    @Body
    @NameInMap("ProductType")
    @Validation(required = true)
    private String productType;

    private GetDebugAppInstanceRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.productType = builder.productType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDebugAppInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    public static final class Builder extends Request.Builder<GetDebugAppInstanceRequest, Builder> {
        private String appInstanceGroupId; 
        private String productType; 

        private Builder() {
            super();
        } 

        private Builder(GetDebugAppInstanceRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.productType = request.productType;
        } 

        /**
         * AppInstanceGroupId.
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putBodyParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        @Override
        public GetDebugAppInstanceRequest build() {
            return new GetDebugAppInstanceRequest(this);
        } 

    } 

}
