// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuthSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetAuthSummaryRequest</p>
 */
public class GetAuthSummaryRequest extends Request {
    private GetAuthSummaryRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetAuthSummaryRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetAuthSummaryRequest request) {
            super(request);
        } 

        @Override
        public GetAuthSummaryRequest build() {
            return new GetAuthSummaryRequest(this);
        } 

    } 

}
