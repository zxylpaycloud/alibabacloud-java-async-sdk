// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCmsCallNumOrderResponse} extends {@link TeaModel}
 *
 * <p>CreateCmsCallNumOrderResponse</p>
 */
public class CreateCmsCallNumOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCmsCallNumOrderResponseBody body;

    private CreateCmsCallNumOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCmsCallNumOrderResponse create() {
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
    public CreateCmsCallNumOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCmsCallNumOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCmsCallNumOrderResponseBody body);

        @Override
        CreateCmsCallNumOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCmsCallNumOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCmsCallNumOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCmsCallNumOrderResponse response) {
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
        public Builder body(CreateCmsCallNumOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCmsCallNumOrderResponse build() {
            return new CreateCmsCallNumOrderResponse(this);
        } 

    } 

}