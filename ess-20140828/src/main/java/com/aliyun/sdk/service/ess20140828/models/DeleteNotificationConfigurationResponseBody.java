// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNotificationConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteNotificationConfigurationResponseBody</p>
 */
public class DeleteNotificationConfigurationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteNotificationConfigurationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNotificationConfigurationResponseBody create() {
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

        public DeleteNotificationConfigurationResponseBody build() {
            return new DeleteNotificationConfigurationResponseBody(this);
        } 

    } 

}
