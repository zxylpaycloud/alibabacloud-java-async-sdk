// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnOrderCommodityCodeResponse} extends {@link TeaModel}
 *
 * <p>DescribeCdnOrderCommodityCodeResponse</p>
 */
public class DescribeCdnOrderCommodityCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCdnOrderCommodityCodeResponseBody body;

    private DescribeCdnOrderCommodityCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCdnOrderCommodityCodeResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public DescribeCdnOrderCommodityCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCdnOrderCommodityCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCdnOrderCommodityCodeResponseBody body);

        @Override
        DescribeCdnOrderCommodityCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCdnOrderCommodityCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCdnOrderCommodityCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCdnOrderCommodityCodeResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(DescribeCdnOrderCommodityCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCdnOrderCommodityCodeResponse build() {
            return new DescribeCdnOrderCommodityCodeResponse(this);
        } 

    } 

}