// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetDiskDefaultKMSKeyIdResponseBody} extends {@link TeaModel}
 *
 * <p>ResetDiskDefaultKMSKeyIdResponseBody</p>
 */
public class ResetDiskDefaultKMSKeyIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ResetDiskDefaultKMSKeyIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetDiskDefaultKMSKeyIdResponseBody create() {
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

        public ResetDiskDefaultKMSKeyIdResponseBody build() {
            return new ResetDiskDefaultKMSKeyIdResponseBody(this);
        } 

    } 

}
