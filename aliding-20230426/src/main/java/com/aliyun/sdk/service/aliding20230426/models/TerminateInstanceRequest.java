// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TerminateInstanceRequest} extends {@link RequestModel}
 *
 * <p>TerminateInstanceRequest</p>
 */
public class TerminateInstanceRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("AppType")
    private String appType;

    @Body
    @NameInMap("Language")
    private String language;

    @Body
    @NameInMap("ProcessInstanceId")
    private String processInstanceId;

    @Body
    @NameInMap("SystemToken")
    private String systemToken;

    private TerminateInstanceRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.appType = builder.appType;
        this.language = builder.language;
        this.processInstanceId = builder.processInstanceId;
        this.systemToken = builder.systemToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TerminateInstanceRequest create() {
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
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return processInstanceId
     */
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    /**
     * @return systemToken
     */
    public String getSystemToken() {
        return this.systemToken;
    }

    public static final class Builder extends Request.Builder<TerminateInstanceRequest, Builder> {
        private AccountContext accountContext; 
        private String appType; 
        private String language; 
        private String processInstanceId; 
        private String systemToken; 

        private Builder() {
            super();
        } 

        private Builder(TerminateInstanceRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.appType = request.appType;
            this.language = request.language;
            this.processInstanceId = request.processInstanceId;
            this.systemToken = request.systemToken;
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
         * AppType.
         */
        public Builder appType(String appType) {
            this.putBodyParameter("AppType", appType);
            this.appType = appType;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * ProcessInstanceId.
         */
        public Builder processInstanceId(String processInstanceId) {
            this.putBodyParameter("ProcessInstanceId", processInstanceId);
            this.processInstanceId = processInstanceId;
            return this;
        }

        /**
         * SystemToken.
         */
        public Builder systemToken(String systemToken) {
            this.putBodyParameter("SystemToken", systemToken);
            this.systemToken = systemToken;
            return this;
        }

        @Override
        public TerminateInstanceRequest build() {
            return new TerminateInstanceRequest(this);
        } 

    } 

    public static class AccountContext extends TeaModel {
        @NameInMap("accountId")
        @Validation(required = true)
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
