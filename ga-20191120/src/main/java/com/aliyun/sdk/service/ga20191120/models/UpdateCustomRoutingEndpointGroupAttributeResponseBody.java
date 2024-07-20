// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCustomRoutingEndpointGroupAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCustomRoutingEndpointGroupAttributeResponseBody</p>
 */
public class UpdateCustomRoutingEndpointGroupAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateCustomRoutingEndpointGroupAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomRoutingEndpointGroupAttributeResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateCustomRoutingEndpointGroupAttributeResponseBody build() {
            return new UpdateCustomRoutingEndpointGroupAttributeResponseBody(this);
        } 

    } 

}
