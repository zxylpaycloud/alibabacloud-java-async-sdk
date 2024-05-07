// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAllSwimmingLaneGroupRequest} extends {@link RequestModel}
 *
 * <p>QueryAllSwimmingLaneGroupRequest</p>
 */
public class QueryAllSwimmingLaneGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String namespace;

    private QueryAllSwimmingLaneGroupRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAllSwimmingLaneGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<QueryAllSwimmingLaneGroupRequest, Builder> {
        private String acceptLanguage; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(QueryAllSwimmingLaneGroupRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.namespace = request.namespace;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The name of the Microservices Engine (MSE) namespace that you want to query.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public QueryAllSwimmingLaneGroupRequest build() {
            return new QueryAllSwimmingLaneGroupRequest(this);
        } 

    } 

}
