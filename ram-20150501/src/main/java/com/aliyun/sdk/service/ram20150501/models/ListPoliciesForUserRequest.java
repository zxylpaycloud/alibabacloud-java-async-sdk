// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPoliciesForUserRequest} extends {@link RequestModel}
 *
 * <p>ListPoliciesForUserRequest</p>
 */
public class ListPoliciesForUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private ListPoliciesForUserRequest(Builder builder) {
        super(builder);
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPoliciesForUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<ListPoliciesForUserRequest, Builder> {
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(ListPoliciesForUserRequest request) {
            super(request);
            this.userName = request.userName;
        } 

        /**
         * The name of the RAM user.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public ListPoliciesForUserRequest build() {
            return new ListPoliciesForUserRequest(this);
        } 

    } 

}
