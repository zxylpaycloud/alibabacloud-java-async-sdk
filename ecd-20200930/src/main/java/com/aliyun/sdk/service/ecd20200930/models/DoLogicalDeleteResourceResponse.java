// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DoLogicalDeleteResourceResponse} extends {@link TeaModel}
 *
 * <p>DoLogicalDeleteResourceResponse</p>
 */
public class DoLogicalDeleteResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DoLogicalDeleteResourceResponseBody body;

    private DoLogicalDeleteResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DoLogicalDeleteResourceResponse create() {
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
    public DoLogicalDeleteResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DoLogicalDeleteResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DoLogicalDeleteResourceResponseBody body);

        @Override
        DoLogicalDeleteResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DoLogicalDeleteResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DoLogicalDeleteResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DoLogicalDeleteResourceResponse response) {
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
        public Builder body(DoLogicalDeleteResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DoLogicalDeleteResourceResponse build() {
            return new DoLogicalDeleteResourceResponse(this);
        } 

    } 

}
