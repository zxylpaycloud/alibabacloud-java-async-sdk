// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLabelTableResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateLabelTableResponseBody</p>
 */
public class UpdateLabelTableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private UpdateLabelTableResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLabelTableResponseBody create() {
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

        public UpdateLabelTableResponseBody build() {
            return new UpdateLabelTableResponseBody(this);
        } 

    } 

}
