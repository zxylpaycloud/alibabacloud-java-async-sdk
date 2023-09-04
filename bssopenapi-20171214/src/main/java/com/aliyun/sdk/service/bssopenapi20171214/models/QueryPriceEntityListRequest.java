// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPriceEntityListRequest} extends {@link RequestModel}
 *
 * <p>QueryPriceEntityListRequest</p>
 */
public class QueryPriceEntityListRequest extends Request {
    @Query
    @NameInMap("CommodityCode")
    @Validation(required = true)
    private String commodityCode;

    @Query
    @NameInMap("Lang")
    private String lang;

    private QueryPriceEntityListRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPriceEntityListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<QueryPriceEntityListRequest, Builder> {
        private String commodityCode; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(QueryPriceEntityListRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
            this.lang = request.lang;
        } 

        /**
         * The code of the service.
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public QueryPriceEntityListRequest build() {
            return new QueryPriceEntityListRequest(this);
        } 

    } 

}
