// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQuotaPlanResponse} extends {@link TeaModel}
 *
 * <p>GetQuotaPlanResponse</p>
 */
public class GetQuotaPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetQuotaPlanResponseBody body;

    private GetQuotaPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetQuotaPlanResponse create() {
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
    public GetQuotaPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetQuotaPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetQuotaPlanResponseBody body);

        @Override
        GetQuotaPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetQuotaPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetQuotaPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetQuotaPlanResponse response) {
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
        public Builder body(GetQuotaPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetQuotaPlanResponse build() {
            return new GetQuotaPlanResponse(this);
        } 

    } 

}