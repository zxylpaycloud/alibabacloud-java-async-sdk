// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFunctionInstanceResponse} extends {@link TeaModel}
 *
 * <p>GetFunctionInstanceResponse</p>
 */
public class GetFunctionInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFunctionInstanceResponseBody body;

    private GetFunctionInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFunctionInstanceResponse create() {
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
    public GetFunctionInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFunctionInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFunctionInstanceResponseBody body);

        @Override
        GetFunctionInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFunctionInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFunctionInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFunctionInstanceResponse response) {
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
        public Builder body(GetFunctionInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFunctionInstanceResponse build() {
            return new GetFunctionInstanceResponse(this);
        } 

    } 

}
