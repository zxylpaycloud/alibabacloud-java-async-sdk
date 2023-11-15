// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserGroupsMappingResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUserGroupsMappingResponseBody</p>
 */
public class CreateUserGroupsMappingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CreateUserGroupsMappingResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserGroupsMappingResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateUserGroupsMappingResponseBody build() {
            return new CreateUserGroupsMappingResponseBody(this);
        } 

    } 

}
