// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ReleaseAnycastEipAddressResponseBody} extends {@link TeaModel}
 *
 * <p>ReleaseAnycastEipAddressResponseBody</p>
 */
public class ReleaseAnycastEipAddressResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private ReleaseAnycastEipAddressResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseAnycastEipAddressResponseBody create() {
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
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReleaseAnycastEipAddressResponseBody build() {
            return new ReleaseAnycastEipAddressResponseBody(this);
        } 

    } 

}
