// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBusinessLocationsRequest} extends {@link RequestModel}
 *
 * <p>QueryBusinessLocationsRequest</p>
 */
public class QueryBusinessLocationsRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("MseSessionId")
    private String mseSessionId;

    private QueryBusinessLocationsRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.mseSessionId = builder.mseSessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBusinessLocationsRequest create() {
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
     * @return mseSessionId
     */
    public String getMseSessionId() {
        return this.mseSessionId;
    }

    public static final class Builder extends Request.Builder<QueryBusinessLocationsRequest, Builder> {
        private String acceptLanguage; 
        private String mseSessionId; 

        private Builder() {
            super();
        } 

        private Builder(QueryBusinessLocationsRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.mseSessionId = request.mseSessionId;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * MseSessionId.
         */
        public Builder mseSessionId(String mseSessionId) {
            this.putQueryParameter("MseSessionId", mseSessionId);
            this.mseSessionId = mseSessionId;
            return this;
        }

        @Override
        public QueryBusinessLocationsRequest build() {
            return new QueryBusinessLocationsRequest(this);
        } 

    } 

}
