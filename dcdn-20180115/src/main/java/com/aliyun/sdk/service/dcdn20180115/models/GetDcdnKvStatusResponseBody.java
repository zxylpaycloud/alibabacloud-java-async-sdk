// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDcdnKvStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetDcdnKvStatusResponseBody</p>
 */
public class GetDcdnKvStatusResponseBody extends TeaModel {
    @NameInMap("Complete")
    private Boolean complete;

    @NameInMap("Expire")
    private String expire;

    @NameInMap("RequestId")
    private String requestId;

    private GetDcdnKvStatusResponseBody(Builder builder) {
        this.complete = builder.complete;
        this.expire = builder.expire;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDcdnKvStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return complete
     */
    public Boolean getComplete() {
        return this.complete;
    }

    /**
     * @return expire
     */
    public String getExpire() {
        return this.expire;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean complete; 
        private String expire; 
        private String requestId; 

        /**
         * Specifies whether the configured key has taken effect on all points of presence (POPs).
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder complete(Boolean complete) {
            this.complete = complete;
            return this;
        }

        /**
         * The timeout period of the configured key. The value is an absolute timestamp, such as 2023-09-11T15:39:44+08:00. This parameter is not returned if the key is permanently stored.
         */
        public Builder expire(String expire) {
            this.expire = expire;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDcdnKvStatusResponseBody build() {
            return new GetDcdnKvStatusResponseBody(this);
        } 

    } 

}
