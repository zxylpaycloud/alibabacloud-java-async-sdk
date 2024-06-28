// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeComponentListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeComponentListResponseBody</p>
 */
public class DescribeComponentListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Components")
    private String components;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeComponentListResponseBody(Builder builder) {
        this.components = builder.components;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComponentListResponseBody create() {
        return builder().build();
    }

    /**
     * @return components
     */
    public String getComponents() {
        return this.components;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String components; 
        private String requestId; 

        /**
         * The information about the components. The value is a JSON array.
         */
        public Builder components(String components) {
            this.components = components;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeComponentListResponseBody build() {
            return new DescribeComponentListResponseBody(this);
        } 

    } 

}
