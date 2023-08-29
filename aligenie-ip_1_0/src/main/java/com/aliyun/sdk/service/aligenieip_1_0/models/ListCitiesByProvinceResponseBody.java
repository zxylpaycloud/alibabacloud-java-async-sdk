// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCitiesByProvinceResponseBody} extends {@link TeaModel}
 *
 * <p>ListCitiesByProvinceResponseBody</p>
 */
public class ListCitiesByProvinceResponseBody extends TeaModel {
    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < String > result;

    @NameInMap("StatusCode")
    private Integer statusCode;

    private ListCitiesByProvinceResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCitiesByProvinceResponseBody create() {
        return builder().build();
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
     * @return result
     */
    public java.util.List < String > getResult() {
        return this.result;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private java.util.List < String > result; 
        private Integer statusCode; 

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < String > result) {
            this.result = result;
            return this;
        }

        /**
         * StatusCode.
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public ListCitiesByProvinceResponseBody build() {
            return new ListCitiesByProvinceResponseBody(this);
        } 

    } 

}