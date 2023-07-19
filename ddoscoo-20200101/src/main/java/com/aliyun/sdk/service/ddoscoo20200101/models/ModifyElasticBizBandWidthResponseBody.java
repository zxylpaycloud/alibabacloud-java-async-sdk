// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyElasticBizBandWidthResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyElasticBizBandWidthResponseBody</p>
 */
public class ModifyElasticBizBandWidthResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyElasticBizBandWidthResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyElasticBizBandWidthResponseBody create() {
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
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyElasticBizBandWidthResponseBody build() {
            return new ModifyElasticBizBandWidthResponseBody(this);
        } 

    } 

}
