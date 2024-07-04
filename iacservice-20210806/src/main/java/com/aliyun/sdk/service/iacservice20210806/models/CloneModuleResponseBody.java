// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloneModuleResponseBody} extends {@link TeaModel}
 *
 * <p>CloneModuleResponseBody</p>
 */
public class CloneModuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("moduleId")
    private String moduleId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CloneModuleResponseBody(Builder builder) {
        this.moduleId = builder.moduleId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneModuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String moduleId; 
        private String requestId; 

        /**
         * moduleId.
         */
        public Builder moduleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CloneModuleResponseBody build() {
            return new CloneModuleResponseBody(this);
        } 

    } 

}
