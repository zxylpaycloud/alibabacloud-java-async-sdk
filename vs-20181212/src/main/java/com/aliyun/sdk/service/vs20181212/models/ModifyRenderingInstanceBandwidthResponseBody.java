// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRenderingInstanceBandwidthResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyRenderingInstanceBandwidthResponseBody</p>
 */
public class ModifyRenderingInstanceBandwidthResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyRenderingInstanceBandwidthResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRenderingInstanceBandwidthResponseBody create() {
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

        public ModifyRenderingInstanceBandwidthResponseBody build() {
            return new ModifyRenderingInstanceBandwidthResponseBody(this);
        } 

    } 

}
