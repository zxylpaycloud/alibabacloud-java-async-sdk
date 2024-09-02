// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListABTestFixedFlowDividersResponseBody} extends {@link TeaModel}
 *
 * <p>ListABTestFixedFlowDividersResponseBody</p>
 */
public class ListABTestFixedFlowDividersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < String > result;

    private ListABTestFixedFlowDividersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListABTestFixedFlowDividersResponseBody create() {
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
         * The queried whitelists.
         */
        public Builder result(java.util.List < String > result) {
            this.result = result;
            return this;
        }

        public ListABTestFixedFlowDividersResponseBody build() {
            return new ListABTestFixedFlowDividersResponseBody(this);
        } 

    } 

}
