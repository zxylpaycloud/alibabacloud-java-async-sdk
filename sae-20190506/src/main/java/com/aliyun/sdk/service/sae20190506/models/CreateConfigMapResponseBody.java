// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConfigMapResponseBody} extends {@link TeaModel}
 *
 * <p>CreateConfigMapResponseBody</p>
 */
public class CreateConfigMapResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private CreateConfigMapResponseBody(Builder builder) {
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

    public static CreateConfigMapResponseBody create() {
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
         * Empty
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The trace ID that is used to query the details of the request.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the ConfigMap that was created.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * *   **2xx**: The call was successful.
         * *   **3xx**: The call was redirected.
         * *   **4xx**: The call failed.
         * *   **5xx**: A server error occurred.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public CreateConfigMapResponseBody build() {
            return new CreateConfigMapResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigMapId")
        private Long configMapId;

        private Data(Builder builder) {
            this.configMapId = builder.configMapId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configMapId
         */
        public Long getConfigMapId() {
            return this.configMapId;
        }

        public static final class Builder {
            private Long configMapId; 

            /**
             * The returned result.
             */
            public Builder configMapId(Long configMapId) {
                this.configMapId = configMapId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
