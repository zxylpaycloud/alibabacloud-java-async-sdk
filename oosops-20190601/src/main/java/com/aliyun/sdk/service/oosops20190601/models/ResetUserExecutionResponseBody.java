// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetUserExecutionResponseBody} extends {@link TeaModel}
 *
 * <p>ResetUserExecutionResponseBody</p>
 */
public class ResetUserExecutionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ResetUserExecutionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetUserExecutionResponseBody create() {
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

        public ResetUserExecutionResponseBody build() {
            return new ResetUserExecutionResponseBody(this);
        } 

    } 

}
