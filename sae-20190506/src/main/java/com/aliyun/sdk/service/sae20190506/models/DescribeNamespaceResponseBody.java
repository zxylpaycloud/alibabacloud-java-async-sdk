// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNamespaceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNamespaceResponseBody</p>
 */
public class DescribeNamespaceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TraceId")
    private String traceId;

    private DescribeNamespaceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNamespaceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * The ID of the trace. It can be used to query the details of a request.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The information of the namespace.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The error code.
         * <p>
         * 
         * *   The **ErrorCode** parameter is not returned when the request succeeds.
         * *   The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information of the namespace.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * *   **2xx**: indicates that the request was successful.
         * *   **3xx**: indicates that the request was redirected.
         * *   **4xx**: indicates that the request was invalid.
         * *   **5xx**: indicates that a server error occurred.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeNamespaceResponseBody build() {
            return new DescribeNamespaceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("EnableMicroRegistration")
        private Boolean enableMicroRegistration;

        @NameInMap("NameSpaceShortId")
        private String nameSpaceShortId;

        @NameInMap("NamespaceDescription")
        private String namespaceDescription;

        @NameInMap("NamespaceId")
        private String namespaceId;

        @NameInMap("NamespaceName")
        private String namespaceName;

        @NameInMap("RegionId")
        private String regionId;

        private Data(Builder builder) {
            this.enableMicroRegistration = builder.enableMicroRegistration;
            this.nameSpaceShortId = builder.nameSpaceShortId;
            this.namespaceDescription = builder.namespaceDescription;
            this.namespaceId = builder.namespaceId;
            this.namespaceName = builder.namespaceName;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return enableMicroRegistration
         */
        public Boolean getEnableMicroRegistration() {
            return this.enableMicroRegistration;
        }

        /**
         * @return nameSpaceShortId
         */
        public String getNameSpaceShortId() {
            return this.nameSpaceShortId;
        }

        /**
         * @return namespaceDescription
         */
        public String getNamespaceDescription() {
            return this.namespaceDescription;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return namespaceName
         */
        public String getNamespaceName() {
            return this.namespaceName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private Boolean enableMicroRegistration; 
            private String nameSpaceShortId; 
            private String namespaceDescription; 
            private String namespaceId; 
            private String namespaceName; 
            private String regionId; 

            /**
             * EnableMicroRegistration.
             */
            public Builder enableMicroRegistration(Boolean enableMicroRegistration) {
                this.enableMicroRegistration = enableMicroRegistration;
                return this;
            }

            /**
             * NameSpaceShortId.
             */
            public Builder nameSpaceShortId(String nameSpaceShortId) {
                this.nameSpaceShortId = nameSpaceShortId;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder namespaceDescription(String namespaceDescription) {
                this.namespaceDescription = namespaceDescription;
                return this;
            }

            /**
             * cn-beijing:test
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * The name of the namespace.
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            /**
             * cn-beijing:test
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
