// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFormDataRequest} extends {@link RequestModel}
 *
 * <p>UpdateFormDataRequest</p>
 */
public class UpdateFormDataRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("AppType")
    private String appType;

    @Body
    @NameInMap("FormInstanceId")
    private String formInstanceId;

    @Body
    @NameInMap("Language")
    private String language;

    @Body
    @NameInMap("SystemToken")
    private String systemToken;

    @Body
    @NameInMap("UpdateFormDataJson")
    private String updateFormDataJson;

    @Body
    @NameInMap("UseLatestVersion")
    private Boolean useLatestVersion;

    private UpdateFormDataRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.appType = builder.appType;
        this.formInstanceId = builder.formInstanceId;
        this.language = builder.language;
        this.systemToken = builder.systemToken;
        this.updateFormDataJson = builder.updateFormDataJson;
        this.useLatestVersion = builder.useLatestVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFormDataRequest create() {
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
     * @return formInstanceId
     */
    public String getFormInstanceId() {
        return this.formInstanceId;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return systemToken
     */
    public String getSystemToken() {
        return this.systemToken;
    }

    /**
     * @return updateFormDataJson
     */
    public String getUpdateFormDataJson() {
        return this.updateFormDataJson;
    }

    /**
     * @return useLatestVersion
     */
    public Boolean getUseLatestVersion() {
        return this.useLatestVersion;
    }

    public static final class Builder extends Request.Builder<UpdateFormDataRequest, Builder> {
        private AccountContext accountContext; 
        private String appType; 
        private String formInstanceId; 
        private String language; 
        private String systemToken; 
        private String updateFormDataJson; 
        private Boolean useLatestVersion; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFormDataRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.appType = request.appType;
            this.formInstanceId = request.formInstanceId;
            this.language = request.language;
            this.systemToken = request.systemToken;
            this.updateFormDataJson = request.updateFormDataJson;
            this.useLatestVersion = request.useLatestVersion;
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
         * FormInstanceId.
         */
        public Builder formInstanceId(String formInstanceId) {
            this.putBodyParameter("FormInstanceId", formInstanceId);
            this.formInstanceId = formInstanceId;
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
         * SystemToken.
         */
        public Builder systemToken(String systemToken) {
            this.putBodyParameter("SystemToken", systemToken);
            this.systemToken = systemToken;
            return this;
        }

        /**
         * UpdateFormDataJson.
         */
        public Builder updateFormDataJson(String updateFormDataJson) {
            this.putBodyParameter("UpdateFormDataJson", updateFormDataJson);
            this.updateFormDataJson = updateFormDataJson;
            return this;
        }

        /**
         * UseLatestVersion.
         */
        public Builder useLatestVersion(Boolean useLatestVersion) {
            this.putBodyParameter("UseLatestVersion", useLatestVersion);
            this.useLatestVersion = useLatestVersion;
            return this;
        }

        @Override
        public UpdateFormDataRequest build() {
            return new UpdateFormDataRequest(this);
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
