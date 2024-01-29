// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableAssociatedTransferResponseBody} extends {@link TeaModel}
 *
 * <p>DisableAssociatedTransferResponseBody</p>
 */
public class DisableAssociatedTransferResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DisableAssociatedTransferResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableAssociatedTransferResponseBody create() {
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

        public DisableAssociatedTransferResponseBody build() {
            return new DisableAssociatedTransferResponseBody(this);
        } 

    } 

}
