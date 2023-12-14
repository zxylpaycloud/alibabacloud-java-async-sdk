// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitJobsResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitJobsResponseBody</p>
 */
public class SubmitJobsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Integer data;

    @NameInMap("RequestId")
    private String requestId;

    private SubmitJobsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Integer getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Integer data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SubmitJobsResponseBody build() {
            return new SubmitJobsResponseBody(this);
        } 

    } 

}
