// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIoTCloudConnectorAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateIoTCloudConnectorAttributeResponseBody</p>
 */
public class UpdateIoTCloudConnectorAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceId")
    private String resourceId;

    private UpdateIoTCloudConnectorAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIoTCloudConnectorAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    public static final class Builder {
        private String requestId; 
        private String resourceId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public UpdateIoTCloudConnectorAttributeResponseBody build() {
            return new UpdateIoTCloudConnectorAttributeResponseBody(this);
        } 

    } 

}
