// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePrometheusGlobalViewResponseBody} extends {@link TeaModel}
 *
 * <p>DeletePrometheusGlobalViewResponseBody</p>
 */
public class DeletePrometheusGlobalViewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeletePrometheusGlobalViewResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePrometheusGlobalViewResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
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

    public static final class Builder {
        private Integer code; 
        private String data; 
        private String message; 
        private String requestId; 

        /**
         * Status code. 200 is success, other status codes are exceptions.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The response parameters in the JSON format.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * Additional Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID. You can use the ID to query logs and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeletePrometheusGlobalViewResponseBody build() {
            return new DeletePrometheusGlobalViewResponseBody(this);
        } 

    } 

}
