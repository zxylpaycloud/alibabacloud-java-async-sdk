// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckUserIsGroupMemberRequest} extends {@link RequestModel}
 *
 * <p>CheckUserIsGroupMemberRequest</p>
 */
public class CheckUserIsGroupMemberRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpenConversationId")
    private String openConversationId;

    private CheckUserIsGroupMemberRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.openConversationId = builder.openConversationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckUserIsGroupMemberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountContext
     */
    public AccountContext getAccountContext() {
        return this.accountContext;
    }

    /**
     * @return openConversationId
     */
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    public static final class Builder extends Request.Builder<CheckUserIsGroupMemberRequest, Builder> {
        private AccountContext accountContext; 
        private String openConversationId; 

        private Builder() {
            super();
        } 

        private Builder(CheckUserIsGroupMemberRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.openConversationId = request.openConversationId;
        } 

        /**
         * AccountContext.
         */
        public Builder accountContext(AccountContext accountContext) {
            String accountContextShrink = shrink(accountContext, "AccountContext", "json");
            this.putHeaderParameter("AccountContext", accountContextShrink);
            this.accountContext = accountContext;
            return this;
        }

        /**
         * OpenConversationId.
         */
        public Builder openConversationId(String openConversationId) {
            this.putBodyParameter("OpenConversationId", openConversationId);
            this.openConversationId = openConversationId;
            return this;
        }

        @Override
        public CheckUserIsGroupMemberRequest build() {
            return new CheckUserIsGroupMemberRequest(this);
        } 

    } 

    public static class AccountContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accountId;

        private AccountContext(Builder builder) {
            this.accountId = builder.accountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountContext create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        public static final class Builder {
            private String accountId; 

            /**
             * accountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            public AccountContext build() {
                return new AccountContext(this);
            } 

        } 

    }
}
