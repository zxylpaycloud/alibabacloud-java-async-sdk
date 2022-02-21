// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResizeMultiZoneClusterDiskSizeResponseBody} extends {@link TeaModel}
 *
 * <p>ResizeMultiZoneClusterDiskSizeResponseBody</p>
 */
public class ResizeMultiZoneClusterDiskSizeResponseBody extends TeaModel {
    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("RequestId")
    private String requestId;

    private ResizeMultiZoneClusterDiskSizeResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResizeMultiZoneClusterDiskSizeResponseBody create() {
        return builder().build();
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String orderId; 
        private String requestId; 

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ResizeMultiZoneClusterDiskSizeResponseBody build() {
            return new ResizeMultiZoneClusterDiskSizeResponseBody(this);
        } 

    } 

}
