// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseSortScriptResponseBody} extends {@link TeaModel}
 *
 * <p>ReleaseSortScriptResponseBody</p>
 */
public class ReleaseSortScriptResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    private ReleaseSortScriptResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseSortScriptResponseBody create() {
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReleaseSortScriptResponseBody build() {
            return new ReleaseSortScriptResponseBody(this);
        } 

    } 

}
