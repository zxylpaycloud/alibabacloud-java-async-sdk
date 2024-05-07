// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SplitPurchaseOrderResponse} extends {@link TeaModel}
 *
 * <p>SplitPurchaseOrderResponse</p>
 */
public class SplitPurchaseOrderResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private PurchaseOrderRenderResult body;

    private SplitPurchaseOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SplitPurchaseOrderResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public PurchaseOrderRenderResult getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SplitPurchaseOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(PurchaseOrderRenderResult body);

        @Override
        SplitPurchaseOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SplitPurchaseOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private PurchaseOrderRenderResult body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SplitPurchaseOrderResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(PurchaseOrderRenderResult body) {
            this.body = body;
            return this;
        }

        @Override
        public SplitPurchaseOrderResponse build() {
            return new SplitPurchaseOrderResponse(this);
        } 

    } 

}
