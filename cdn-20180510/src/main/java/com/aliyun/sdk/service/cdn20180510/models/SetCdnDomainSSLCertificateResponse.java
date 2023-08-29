// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCdnDomainSSLCertificateResponse} extends {@link TeaModel}
 *
 * <p>SetCdnDomainSSLCertificateResponse</p>
 */
public class SetCdnDomainSSLCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetCdnDomainSSLCertificateResponseBody body;

    private SetCdnDomainSSLCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetCdnDomainSSLCertificateResponse create() {
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
    public SetCdnDomainSSLCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetCdnDomainSSLCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetCdnDomainSSLCertificateResponseBody body);

        @Override
        SetCdnDomainSSLCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetCdnDomainSSLCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetCdnDomainSSLCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetCdnDomainSSLCertificateResponse response) {
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
        public Builder body(SetCdnDomainSSLCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetCdnDomainSSLCertificateResponse build() {
            return new SetCdnDomainSSLCertificateResponse(this);
        } 

    } 

}