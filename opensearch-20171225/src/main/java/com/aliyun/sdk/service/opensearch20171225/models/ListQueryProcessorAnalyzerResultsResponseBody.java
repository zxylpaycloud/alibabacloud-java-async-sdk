// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQueryProcessorAnalyzerResultsResponseBody} extends {@link TeaModel}
 *
 * <p>ListQueryProcessorAnalyzerResultsResponseBody</p>
 */
public class ListQueryProcessorAnalyzerResultsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("result")
    private java.util.Map < String, ? > result;

    private ListQueryProcessorAnalyzerResultsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQueryProcessorAnalyzerResultsResponseBody create() {
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
    public java.util.Map < String, ? > getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.Map < String, ? > result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.Map < String, ? > result) {
            this.result = result;
            return this;
        }

        public ListQueryProcessorAnalyzerResultsResponseBody build() {
            return new ListQueryProcessorAnalyzerResultsResponseBody(this);
        } 

    } 

}
