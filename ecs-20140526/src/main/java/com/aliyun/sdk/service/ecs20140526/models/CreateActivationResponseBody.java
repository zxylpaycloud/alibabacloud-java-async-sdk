// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateActivationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateActivationResponseBody</p>
 */
public class CreateActivationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActivationCode")
    private String activationCode;

    @com.aliyun.core.annotation.NameInMap("ActivationId")
    private String activationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateActivationResponseBody(Builder builder) {
        this.activationCode = builder.activationCode;
        this.activationId = builder.activationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateActivationResponseBody create() {
        return builder().build();
    }

    /**
     * @return activationCode
     */
    public String getActivationCode() {
        return this.activationCode;
    }

    /**
     * @return activationId
     */
    public String getActivationId() {
        return this.activationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String activationCode; 
        private String activationId; 
        private String requestId; 

        /**
         * The value of the activation code. The value is returned only once after the CreateActivation operation is called and cannot be queried afterward. Properly save the return value.
         */
        public Builder activationCode(String activationCode) {
            this.activationCode = activationCode;
            return this;
        }

        /**
         * The ID of the activation code.
         */
        public Builder activationId(String activationId) {
            this.activationId = activationId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateActivationResponseBody build() {
            return new CreateActivationResponseBody(this);
        } 

    } 

}
