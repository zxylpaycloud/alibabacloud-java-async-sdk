// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDefenseRuleCacheResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDefenseRuleCacheResponseBody</p>
 */
public class ModifyDefenseRuleCacheResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyDefenseRuleCacheResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDefenseRuleCacheResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDefenseRuleCacheResponseBody build() {
            return new ModifyDefenseRuleCacheResponseBody(this);
        } 

    } 

}
