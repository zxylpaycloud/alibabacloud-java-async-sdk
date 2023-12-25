// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrgHonorTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrgHonorTemplateResponseBody</p>
 */
public class CreateOrgHonorTemplateResponseBody extends TeaModel {
    @NameInMap("honorId")
    private String honorId;

    @NameInMap("requestId")
    private String requestId;

    private CreateOrgHonorTemplateResponseBody(Builder builder) {
        this.honorId = builder.honorId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrgHonorTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return honorId
     */
    public String getHonorId() {
        return this.honorId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String honorId; 
        private String requestId; 

        /**
         * honorId.
         */
        public Builder honorId(String honorId) {
            this.honorId = honorId;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateOrgHonorTemplateResponseBody build() {
            return new CreateOrgHonorTemplateResponseBody(this);
        } 

    } 

}
