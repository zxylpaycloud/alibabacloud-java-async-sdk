// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyComponentAssetRequest} extends {@link RequestModel}
 *
 * <p>ModifyComponentAssetRequest</p>
 */
public class ModifyComponentAssetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assetConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private ModifyComponentAssetRequest(Builder builder) {
        super(builder);
        this.assetConfig = builder.assetConfig;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyComponentAssetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetConfig
     */
    public String getAssetConfig() {
        return this.assetConfig;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<ModifyComponentAssetRequest, Builder> {
        private String assetConfig; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(ModifyComponentAssetRequest request) {
            super(request);
            this.assetConfig = request.assetConfig;
            this.lang = request.lang;
        } 

        /**
         * The configuration of the asset. The value is a JSON object.
         */
        public Builder assetConfig(String assetConfig) {
            this.putQueryParameter("AssetConfig", assetConfig);
            this.assetConfig = assetConfig;
            return this;
        }

        /**
         * The language of the content within the request and response.
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public ModifyComponentAssetRequest build() {
            return new ModifyComponentAssetRequest(this);
        } 

    } 

}
