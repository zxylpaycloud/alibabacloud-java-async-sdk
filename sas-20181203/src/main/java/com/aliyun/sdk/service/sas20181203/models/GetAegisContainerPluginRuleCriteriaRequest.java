// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAegisContainerPluginRuleCriteriaRequest} extends {@link RequestModel}
 *
 * <p>GetAegisContainerPluginRuleCriteriaRequest</p>
 */
public class GetAegisContainerPluginRuleCriteriaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private GetAegisContainerPluginRuleCriteriaRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAegisContainerPluginRuleCriteriaRequest create() {
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
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<GetAegisContainerPluginRuleCriteriaRequest, Builder> {
        private String lang; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(GetAegisContainerPluginRuleCriteriaRequest request) {
            super(request);
            this.lang = request.lang;
            this.value = request.value;
        } 

        /**
         * The language of the content within the request and response. Valid values:
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
         * The value of the search condition.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public GetAegisContainerPluginRuleCriteriaRequest build() {
            return new GetAegisContainerPluginRuleCriteriaRequest(this);
        } 

    } 

}
