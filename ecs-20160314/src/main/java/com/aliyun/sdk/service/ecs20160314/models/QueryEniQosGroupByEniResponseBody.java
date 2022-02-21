// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEniQosGroupByEniResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEniQosGroupByEniResponseBody</p>
 */
public class QueryEniQosGroupByEniResponseBody extends TeaModel {
    @NameInMap("QosGroupName")
    private String qosGroupName;

    @NameInMap("RequestId")
    private String requestId;

    private QueryEniQosGroupByEniResponseBody(Builder builder) {
        this.qosGroupName = builder.qosGroupName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEniQosGroupByEniResponseBody create() {
        return builder().build();
    }

    /**
     * @return qosGroupName
     */
    public String getQosGroupName() {
        return this.qosGroupName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String qosGroupName; 
        private String requestId; 

        /**
         * QosGroupName.
         */
        public Builder qosGroupName(String qosGroupName) {
            this.qosGroupName = qosGroupName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryEniQosGroupByEniResponseBody build() {
            return new QueryEniQosGroupByEniResponseBody(this);
        } 

    } 

}
