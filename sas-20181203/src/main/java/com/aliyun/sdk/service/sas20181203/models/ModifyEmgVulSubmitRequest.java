// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyEmgVulSubmitRequest} extends {@link RequestModel}
 *
 * <p>ModifyEmgVulSubmitRequest</p>
 */
public class ModifyEmgVulSubmitRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAgreement")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userAgreement;

    private ModifyEmgVulSubmitRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.name = builder.name;
        this.userAgreement = builder.userAgreement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyEmgVulSubmitRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return userAgreement
     */
    public String getUserAgreement() {
        return this.userAgreement;
    }

    public static final class Builder extends Request.Builder<ModifyEmgVulSubmitRequest, Builder> {
        private String lang; 
        private String name; 
        private String userAgreement; 

        private Builder() {
            super();
        } 

        private Builder(ModifyEmgVulSubmitRequest request) {
            super(request);
            this.lang = request.lang;
            this.name = request.name;
            this.userAgreement = request.userAgreement;
        } 

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The name of the vulnerability.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Specifies whether to scan for urgent vulnerabilities. Valid values:
         * <p>
         * 
         * *   **yes**
         * *   **no**
         */
        public Builder userAgreement(String userAgreement) {
            this.putQueryParameter("UserAgreement", userAgreement);
            this.userAgreement = userAgreement;
            return this;
        }

        @Override
        public ModifyEmgVulSubmitRequest build() {
            return new ModifyEmgVulSubmitRequest(this);
        } 

    } 

}
