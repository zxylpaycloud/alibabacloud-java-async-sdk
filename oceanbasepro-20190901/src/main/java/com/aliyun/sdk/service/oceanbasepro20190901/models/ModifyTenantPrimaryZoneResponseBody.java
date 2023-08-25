// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTenantPrimaryZoneResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyTenantPrimaryZoneResponseBody</p>
 */
public class ModifyTenantPrimaryZoneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyTenantPrimaryZoneResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTenantPrimaryZoneResponseBody create() {
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

        public ModifyTenantPrimaryZoneResponseBody build() {
            return new ModifyTenantPrimaryZoneResponseBody(this);
        } 

    } 

}
