// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAntChainContractProjectResponse} extends {@link TeaModel}
 *
 * <p>CreateAntChainContractProjectResponse</p>
 */
public class CreateAntChainContractProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAntChainContractProjectResponseBody body;

    private CreateAntChainContractProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAntChainContractProjectResponse create() {
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
    public CreateAntChainContractProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAntChainContractProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAntChainContractProjectResponseBody body);

        @Override
        CreateAntChainContractProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAntChainContractProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAntChainContractProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAntChainContractProjectResponse response) {
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
        public Builder body(CreateAntChainContractProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAntChainContractProjectResponse build() {
            return new CreateAntChainContractProjectResponse(this);
        } 

    } 

}
