// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSubscribedCalendarsResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSubscribedCalendarsResponseBody</p>
 */
public class UpdateSubscribedCalendarsResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Boolean result;

    private UpdateSubscribedCalendarsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSubscribedCalendarsResponseBody create() {
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
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public UpdateSubscribedCalendarsResponseBody build() {
            return new UpdateSubscribedCalendarsResponseBody(this);
        } 

    } 

}
