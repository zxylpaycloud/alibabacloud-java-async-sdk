// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceNameResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyInstanceNameResponseBody</p>
 */
public class ModifyInstanceNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyInstanceNameResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceNameResponseBody create() {
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

        public ModifyInstanceNameResponseBody build() {
            return new ModifyInstanceNameResponseBody(this);
        } 

    } 

}
