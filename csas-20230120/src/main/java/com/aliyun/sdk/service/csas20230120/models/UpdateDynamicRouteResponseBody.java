// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDynamicRouteResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDynamicRouteResponseBody</p>
 */
public class UpdateDynamicRouteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateDynamicRouteResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDynamicRouteResponseBody create() {
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

        public UpdateDynamicRouteResponseBody build() {
            return new UpdateDynamicRouteResponseBody(this);
        } 

    } 

}