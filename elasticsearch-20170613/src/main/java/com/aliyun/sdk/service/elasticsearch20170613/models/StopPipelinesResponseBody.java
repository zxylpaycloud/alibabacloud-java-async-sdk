// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopPipelinesResponseBody} extends {@link TeaModel}
 *
 * <p>StopPipelinesResponseBody</p>
 */
public class StopPipelinesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Boolean result;

    private StopPipelinesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopPipelinesResponseBody create() {
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
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean result; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned result. Valid values:
         * <p>
         * 
         * *   true: The pipelines are stopped.
         * *   false: The pipelines fail to be stopped.
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public StopPipelinesResponseBody build() {
            return new StopPipelinesResponseBody(this);
        } 

    } 

}
