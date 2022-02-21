// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAntChainAccountResponse} extends {@link TeaModel}
 *
 * <p>CreateAntChainAccountResponse</p>
 */
public class CreateAntChainAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAntChainAccountResponseBody body;

    private CreateAntChainAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAntChainAccountResponse create() {
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
    public CreateAntChainAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAntChainAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAntChainAccountResponseBody body);

        @Override
        CreateAntChainAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAntChainAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAntChainAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAntChainAccountResponse response) {
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
        public Builder body(CreateAntChainAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAntChainAccountResponse build() {
            return new CreateAntChainAccountResponse(this);
        } 

    } 

}
