// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppsResponseBody</p>
 */
public class DescribeAppsResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < java.util.Map<String, ?>> result;

    private DescribeAppsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppsResponseBody create() {
        return builder().build();
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
    public java.util.List < java.util.Map<String, ?>> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < java.util.Map<String, ?>> result; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < java.util.Map<String, ?>> result) {
            this.result = result;
            return this;
        }

        public DescribeAppsResponseBody build() {
            return new DescribeAppsResponseBody(this);
        } 

    } 

}
