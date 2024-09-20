// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTokenRequest} extends {@link RequestModel}
 *
 * <p>GetTokenRequest</p>
 */
public class GetTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("app_key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("app_secret")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appSecret;

    private GetTokenRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.appSecret = builder.appSecret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return appSecret
     */
    public String getAppSecret() {
        return this.appSecret;
    }

    public static final class Builder extends Request.Builder<GetTokenRequest, Builder> {
        private String appKey; 
        private String appSecret; 

        private Builder() {
            super();
        } 

        private Builder(GetTokenRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.appSecret = request.appSecret;
        } 

        /**
         * appKey
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("app_key", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * appSecret
         */
        public Builder appSecret(String appSecret) {
            this.putQueryParameter("app_secret", appSecret);
            this.appSecret = appSecret;
            return this;
        }

        @Override
        public GetTokenRequest build() {
            return new GetTokenRequest(this);
        } 

    } 

}
