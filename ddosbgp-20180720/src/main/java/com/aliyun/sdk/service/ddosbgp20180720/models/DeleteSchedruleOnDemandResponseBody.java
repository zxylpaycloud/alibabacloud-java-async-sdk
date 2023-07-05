// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSchedruleOnDemandResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSchedruleOnDemandResponseBody</p>
 */
public class DeleteSchedruleOnDemandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteSchedruleOnDemandResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSchedruleOnDemandResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~118841~~).
         * <p>
         * 
         * For more information about sample requests, see the **"Examples"** section of this topic.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteSchedruleOnDemandResponseBody build() {
            return new DeleteSchedruleOnDemandResponseBody(this);
        } 

    } 

}