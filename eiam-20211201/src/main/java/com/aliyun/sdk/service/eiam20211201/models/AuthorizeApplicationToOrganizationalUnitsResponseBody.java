// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeApplicationToOrganizationalUnitsResponseBody} extends {@link TeaModel}
 *
 * <p>AuthorizeApplicationToOrganizationalUnitsResponseBody</p>
 */
public class AuthorizeApplicationToOrganizationalUnitsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AuthorizeApplicationToOrganizationalUnitsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeApplicationToOrganizationalUnitsResponseBody create() {
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

        public AuthorizeApplicationToOrganizationalUnitsResponseBody build() {
            return new AuthorizeApplicationToOrganizationalUnitsResponseBody(this);
        } 

    } 

}
