// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScenegroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateScenegroupResponseBody</p>
 */
public class CreateScenegroupResponseBody extends TeaModel {
    @NameInMap("openConversationId")
    private String openConversationId;

    @NameInMap("requestId")
    private String requestId;

    private CreateScenegroupResponseBody(Builder builder) {
        this.openConversationId = builder.openConversationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScenegroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return openConversationId
     */
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String openConversationId; 
        private String requestId; 

        /**
         * openConversationId.
         */
        public Builder openConversationId(String openConversationId) {
            this.openConversationId = openConversationId;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateScenegroupResponseBody build() {
            return new CreateScenegroupResponseBody(this);
        } 

    } 

}
