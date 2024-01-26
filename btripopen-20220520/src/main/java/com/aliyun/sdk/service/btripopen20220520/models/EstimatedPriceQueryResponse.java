// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EstimatedPriceQueryResponse} extends {@link TeaModel}
 *
 * <p>EstimatedPriceQueryResponse</p>
 */
public class EstimatedPriceQueryResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private EstimatedPriceQueryResponseBody body;

    private EstimatedPriceQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static EstimatedPriceQueryResponse create() {
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
    public EstimatedPriceQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EstimatedPriceQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(EstimatedPriceQueryResponseBody body);

        @Override
        EstimatedPriceQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EstimatedPriceQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private EstimatedPriceQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EstimatedPriceQueryResponse response) {
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
        public Builder body(EstimatedPriceQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EstimatedPriceQueryResponse build() {
            return new EstimatedPriceQueryResponse(this);
        } 

    } 

}
