// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceDirectoryRequest} extends {@link RequestModel}
 *
 * <p>GetResourceDirectoryRequest</p>
 */
public class GetResourceDirectoryRequest extends Request {
    private GetResourceDirectoryRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceDirectoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetResourceDirectoryRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetResourceDirectoryRequest request) {
            super(request);
        } 

        @Override
        public GetResourceDirectoryRequest build() {
            return new GetResourceDirectoryRequest(this);
        } 

    } 

}
