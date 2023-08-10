// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateABTestFixedFlowDividersResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateABTestFixedFlowDividersResponseBody</p>
 */
public class UpdateABTestFixedFlowDividersResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < String > result;

    private UpdateABTestFixedFlowDividersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateABTestFixedFlowDividersResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < String > getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > result; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The whitelists after the update.
         */
        public Builder result(java.util.List < String > result) {
            this.result = result;
            return this;
        }

        public UpdateABTestFixedFlowDividersResponseBody build() {
            return new UpdateABTestFixedFlowDividersResponseBody(this);
        } 

    } 

}
