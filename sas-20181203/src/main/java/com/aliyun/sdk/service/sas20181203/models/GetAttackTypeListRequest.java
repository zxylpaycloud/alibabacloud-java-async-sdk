// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAttackTypeListRequest} extends {@link RequestModel}
 *
 * <p>GetAttackTypeListRequest</p>
 */
public class GetAttackTypeListRequest extends Request {
    private GetAttackTypeListRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAttackTypeListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetAttackTypeListRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetAttackTypeListRequest request) {
            super(request);
        } 

        @Override
        public GetAttackTypeListRequest build() {
            return new GetAttackTypeListRequest(this);
        } 

    } 

}
