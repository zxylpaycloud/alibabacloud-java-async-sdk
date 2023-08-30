// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceMinorVersionResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyInstanceMinorVersionResponseBody</p>
 */
public class ModifyInstanceMinorVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyInstanceMinorVersionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceMinorVersionResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyInstanceMinorVersionResponseBody build() {
            return new ModifyInstanceMinorVersionResponseBody(this);
        } 

    } 

}
