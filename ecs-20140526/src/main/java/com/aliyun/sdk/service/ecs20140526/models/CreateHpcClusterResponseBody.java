// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHpcClusterResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHpcClusterResponseBody</p>
 */
public class CreateHpcClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HpcClusterId")
    private String hpcClusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateHpcClusterResponseBody(Builder builder) {
        this.hpcClusterId = builder.hpcClusterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHpcClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return hpcClusterId
     */
    public String getHpcClusterId() {
        return this.hpcClusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String hpcClusterId; 
        private String requestId; 

        /**
         * The ID of cluster.
         */
        public Builder hpcClusterId(String hpcClusterId) {
            this.hpcClusterId = hpcClusterId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateHpcClusterResponseBody build() {
            return new CreateHpcClusterResponseBody(this);
        } 

    } 

}
