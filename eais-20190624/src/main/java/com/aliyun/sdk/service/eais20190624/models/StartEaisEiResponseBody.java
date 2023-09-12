// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eais20190624.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartEaisEiResponseBody} extends {@link TeaModel}
 *
 * <p>StartEaisEiResponseBody</p>
 */
public class StartEaisEiResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private StartEaisEiResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartEaisEiResponseBody create() {
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

        public StartEaisEiResponseBody build() {
            return new StartEaisEiResponseBody(this);
        } 

    } 

}