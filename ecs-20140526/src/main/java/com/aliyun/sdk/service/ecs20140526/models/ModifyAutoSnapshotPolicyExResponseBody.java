// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAutoSnapshotPolicyExResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyAutoSnapshotPolicyExResponseBody</p>
 */
public class ModifyAutoSnapshotPolicyExResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyAutoSnapshotPolicyExResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAutoSnapshotPolicyExResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyAutoSnapshotPolicyExResponseBody build() {
            return new ModifyAutoSnapshotPolicyExResponseBody(this);
        } 

    } 

}
