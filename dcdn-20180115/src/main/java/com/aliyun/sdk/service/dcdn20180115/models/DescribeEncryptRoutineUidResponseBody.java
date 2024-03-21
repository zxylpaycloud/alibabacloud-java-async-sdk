// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEncryptRoutineUidResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEncryptRoutineUidResponseBody</p>
 */
public class DescribeEncryptRoutineUidResponseBody extends TeaModel {
    @NameInMap("Content")
    private String content;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeEncryptRoutineUidResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEncryptRoutineUidResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String content; 
        private String requestId; 

        /**
         * The returned ciphertext, which contains the Alibaba Cloud account ID, timestamp, and time to live (TTL).
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEncryptRoutineUidResponseBody build() {
            return new DescribeEncryptRoutineUidResponseBody(this);
        } 

    } 

}
