// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetAccountResponse} extends {@link TeaModel}
 *
 * <p>ResetAccountResponse</p>
 */
public class ResetAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetAccountResponseBody body;

    private ResetAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetAccountResponse create() {
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
    public ResetAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetAccountResponseBody body);

        @Override
        ResetAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetAccountResponse response) {
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
        public Builder body(ResetAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetAccountResponse build() {
            return new ResetAccountResponse(this);
        } 

    } 

}
