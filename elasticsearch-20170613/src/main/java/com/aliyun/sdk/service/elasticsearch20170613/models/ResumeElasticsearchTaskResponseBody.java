// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeElasticsearchTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ResumeElasticsearchTaskResponseBody</p>
 */
public class ResumeElasticsearchTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Boolean result;

    private ResumeElasticsearchTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResumeElasticsearchTaskResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Return results:
         * <p>
         * 
         * *   true: resume the interrupted change successfully
         * *   false: resume the interrupted change successfully failed
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public ResumeElasticsearchTaskResponseBody build() {
            return new ResumeElasticsearchTaskResponseBody(this);
        } 

    } 

}
