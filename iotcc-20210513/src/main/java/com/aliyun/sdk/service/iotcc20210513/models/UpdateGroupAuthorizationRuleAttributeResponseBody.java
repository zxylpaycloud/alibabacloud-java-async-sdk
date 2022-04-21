// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGroupAuthorizationRuleAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateGroupAuthorizationRuleAttributeResponseBody</p>
 */
public class UpdateGroupAuthorizationRuleAttributeResponseBody extends TeaModel {
    @NameInMap("AuthorizationRuleId")
    private String authorizationRuleId;

    @NameInMap("IoTCloudConnectorGroupId")
    private String ioTCloudConnectorGroupId;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateGroupAuthorizationRuleAttributeResponseBody(Builder builder) {
        this.authorizationRuleId = builder.authorizationRuleId;
        this.ioTCloudConnectorGroupId = builder.ioTCloudConnectorGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGroupAuthorizationRuleAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return authorizationRuleId
     */
    public String getAuthorizationRuleId() {
        return this.authorizationRuleId;
    }

    /**
     * @return ioTCloudConnectorGroupId
     */
    public String getIoTCloudConnectorGroupId() {
        return this.ioTCloudConnectorGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String authorizationRuleId; 
        private String ioTCloudConnectorGroupId; 
        private String requestId; 

        /**
         * AuthorizationRuleId.
         */
        public Builder authorizationRuleId(String authorizationRuleId) {
            this.authorizationRuleId = authorizationRuleId;
            return this;
        }

        /**
         * IoTCloudConnectorGroupId.
         */
        public Builder ioTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
            this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateGroupAuthorizationRuleAttributeResponseBody build() {
            return new UpdateGroupAuthorizationRuleAttributeResponseBody(this);
        } 

    } 

}
