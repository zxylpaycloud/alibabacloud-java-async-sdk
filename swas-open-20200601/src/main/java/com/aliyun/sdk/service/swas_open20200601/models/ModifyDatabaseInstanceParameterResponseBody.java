// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDatabaseInstanceParameterResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDatabaseInstanceParameterResponseBody</p>
 */
public class ModifyDatabaseInstanceParameterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyDatabaseInstanceParameterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDatabaseInstanceParameterResponseBody create() {
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

        public ModifyDatabaseInstanceParameterResponseBody build() {
            return new ModifyDatabaseInstanceParameterResponseBody(this);
        } 

    } 

}
