// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMFAAuthenticationStatusRequest} extends {@link RequestModel}
 *
 * <p>GetMFAAuthenticationStatusRequest</p>
 */
public class GetMFAAuthenticationStatusRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    private GetMFAAuthenticationStatusRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMFAAuthenticationStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    public static final class Builder extends Request.Builder<GetMFAAuthenticationStatusRequest, Builder> {
        private String directoryId; 

        private Builder() {
            super();
        } 

        private Builder(GetMFAAuthenticationStatusRequest request) {
            super(request);
            this.directoryId = request.directoryId;
        } 

        /**
         * The ID of the directory.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        @Override
        public GetMFAAuthenticationStatusRequest build() {
            return new GetMFAAuthenticationStatusRequest(this);
        } 

    } 

}
