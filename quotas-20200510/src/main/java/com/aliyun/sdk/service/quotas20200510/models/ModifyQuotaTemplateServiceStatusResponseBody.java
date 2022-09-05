// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyQuotaTemplateServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyQuotaTemplateServiceStatusResponseBody</p>
 */
public class ModifyQuotaTemplateServiceStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TemplateServiceStatus")
    private TemplateServiceStatus templateServiceStatus;

    private ModifyQuotaTemplateServiceStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateServiceStatus = builder.templateServiceStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyQuotaTemplateServiceStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templateServiceStatus
     */
    public TemplateServiceStatus getTemplateServiceStatus() {
        return this.templateServiceStatus;
    }

    public static final class Builder {
        private String requestId; 
        private TemplateServiceStatus templateServiceStatus; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TemplateServiceStatus.
         */
        public Builder templateServiceStatus(TemplateServiceStatus templateServiceStatus) {
            this.templateServiceStatus = templateServiceStatus;
            return this;
        }

        public ModifyQuotaTemplateServiceStatusResponseBody build() {
            return new ModifyQuotaTemplateServiceStatusResponseBody(this);
        } 

    } 

    public static class TemplateServiceStatus extends TeaModel {
        @NameInMap("ResourceDirectoryId")
        private String resourceDirectoryId;

        @NameInMap("ServiceStatus")
        private Integer serviceStatus;

        private TemplateServiceStatus(Builder builder) {
            this.resourceDirectoryId = builder.resourceDirectoryId;
            this.serviceStatus = builder.serviceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateServiceStatus create() {
            return builder().build();
        }

        /**
         * @return resourceDirectoryId
         */
        public String getResourceDirectoryId() {
            return this.resourceDirectoryId;
        }

        /**
         * @return serviceStatus
         */
        public Integer getServiceStatus() {
            return this.serviceStatus;
        }

        public static final class Builder {
            private String resourceDirectoryId; 
            private Integer serviceStatus; 

            /**
             * ResourceDirectoryId.
             */
            public Builder resourceDirectoryId(String resourceDirectoryId) {
                this.resourceDirectoryId = resourceDirectoryId;
                return this;
            }

            /**
             * ServiceStatus.
             */
            public Builder serviceStatus(Integer serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            public TemplateServiceStatus build() {
                return new TemplateServiceStatus(this);
            } 

        } 

    }
}
