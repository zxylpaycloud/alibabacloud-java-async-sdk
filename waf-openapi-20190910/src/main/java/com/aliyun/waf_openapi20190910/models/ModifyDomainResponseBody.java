// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyDomainResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDomainResponseBody</p>
 */
public class ModifyDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;


    private ModifyDomainResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDomainResponseBody create() {
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
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDomainResponseBody build() {
            return new ModifyDomainResponseBody(this);
        } 

    } 

}
