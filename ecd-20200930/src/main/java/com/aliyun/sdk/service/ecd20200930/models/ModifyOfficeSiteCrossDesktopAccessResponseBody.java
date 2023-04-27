// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyOfficeSiteCrossDesktopAccessResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyOfficeSiteCrossDesktopAccessResponseBody</p>
 */
public class ModifyOfficeSiteCrossDesktopAccessResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private ModifyOfficeSiteCrossDesktopAccessResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOfficeSiteCrossDesktopAccessResponseBody create() {
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

        public ModifyOfficeSiteCrossDesktopAccessResponseBody build() {
            return new ModifyOfficeSiteCrossDesktopAccessResponseBody(this);
        } 

    } 

}
