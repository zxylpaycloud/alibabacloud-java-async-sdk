// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelSimulatedSystemEventsResponseBody} extends {@link TeaModel}
 *
 * <p>CancelSimulatedSystemEventsResponseBody</p>
 */
public class CancelSimulatedSystemEventsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private CancelSimulatedSystemEventsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelSimulatedSystemEventsResponseBody create() {
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

        public CancelSimulatedSystemEventsResponseBody build() {
            return new CancelSimulatedSystemEventsResponseBody(this);
        } 

    } 

}
