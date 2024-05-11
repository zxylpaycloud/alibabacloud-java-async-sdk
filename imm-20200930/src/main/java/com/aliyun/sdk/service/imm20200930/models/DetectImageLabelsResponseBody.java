// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetectImageLabelsResponseBody} extends {@link TeaModel}
 *
 * <p>DetectImageLabelsResponseBody</p>
 */
public class DetectImageLabelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List < Label > labels;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DetectImageLabelsResponseBody(Builder builder) {
        this.labels = builder.labels;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectImageLabelsResponseBody create() {
        return builder().build();
    }

    /**
     * @return labels
     */
    public java.util.List < Label > getLabels() {
        return this.labels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Label > labels; 
        private String requestId; 

        /**
         * Labels.
         */
        public Builder labels(java.util.List < Label > labels) {
            this.labels = labels;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DetectImageLabelsResponseBody build() {
            return new DetectImageLabelsResponseBody(this);
        } 

    } 

}
