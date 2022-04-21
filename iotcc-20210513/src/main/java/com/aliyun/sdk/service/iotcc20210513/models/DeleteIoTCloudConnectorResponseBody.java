// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIoTCloudConnectorResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteIoTCloudConnectorResponseBody</p>
 */
public class DeleteIoTCloudConnectorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteIoTCloudConnectorResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIoTCloudConnectorResponseBody create() {
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

        public DeleteIoTCloudConnectorResponseBody build() {
            return new DeleteIoTCloudConnectorResponseBody(this);
        } 

    } 

}
