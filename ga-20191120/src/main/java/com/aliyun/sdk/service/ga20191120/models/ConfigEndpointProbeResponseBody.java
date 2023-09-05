// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigEndpointProbeResponseBody} extends {@link TeaModel}
 *
 * <p>ConfigEndpointProbeResponseBody</p>
 */
public class ConfigEndpointProbeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ConfigEndpointProbeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigEndpointProbeResponseBody create() {
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

        public ConfigEndpointProbeResponseBody build() {
            return new ConfigEndpointProbeResponseBody(this);
        } 

    } 

}
