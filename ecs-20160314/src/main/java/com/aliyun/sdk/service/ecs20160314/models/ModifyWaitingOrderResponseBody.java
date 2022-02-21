// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWaitingOrderResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyWaitingOrderResponseBody</p>
 */
public class ModifyWaitingOrderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyWaitingOrderResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWaitingOrderResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyWaitingOrderResponseBody build() {
            return new ModifyWaitingOrderResponseBody(this);
        } 

    } 

}
