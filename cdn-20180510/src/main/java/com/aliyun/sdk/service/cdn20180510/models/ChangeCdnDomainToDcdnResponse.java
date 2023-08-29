// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeCdnDomainToDcdnResponse} extends {@link TeaModel}
 *
 * <p>ChangeCdnDomainToDcdnResponse</p>
 */
public class ChangeCdnDomainToDcdnResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChangeCdnDomainToDcdnResponseBody body;

    private ChangeCdnDomainToDcdnResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChangeCdnDomainToDcdnResponse create() {
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
    public ChangeCdnDomainToDcdnResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeCdnDomainToDcdnResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChangeCdnDomainToDcdnResponseBody body);

        @Override
        ChangeCdnDomainToDcdnResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeCdnDomainToDcdnResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChangeCdnDomainToDcdnResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeCdnDomainToDcdnResponse response) {
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
        public Builder body(ChangeCdnDomainToDcdnResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeCdnDomainToDcdnResponse build() {
            return new ChangeCdnDomainToDcdnResponse(this);
        } 

    } 

}