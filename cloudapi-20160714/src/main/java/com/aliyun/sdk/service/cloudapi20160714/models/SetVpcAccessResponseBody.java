// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetVpcAccessResponseBody} extends {@link TeaModel}
 *
 * <p>SetVpcAccessResponseBody</p>
 */
public class SetVpcAccessResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VpcAccessId")
    private String vpcAccessId;

    private SetVpcAccessResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vpcAccessId = builder.vpcAccessId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetVpcAccessResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vpcAccessId
     */
    public String getVpcAccessId() {
        return this.vpcAccessId;
    }

    public static final class Builder {
        private String requestId; 
        private String vpcAccessId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the VPC access authorization.
         */
        public Builder vpcAccessId(String vpcAccessId) {
            this.vpcAccessId = vpcAccessId;
            return this;
        }

        public SetVpcAccessResponseBody build() {
            return new SetVpcAccessResponseBody(this);
        } 

    } 

}
