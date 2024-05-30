// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPhoneEncryptionPublicKeyResponse} extends {@link TeaModel}
 *
 * <p>GetPhoneEncryptionPublicKeyResponse</p>
 */
public class GetPhoneEncryptionPublicKeyResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetPhoneEncryptionPublicKeyResponseBody body;

    private GetPhoneEncryptionPublicKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetPhoneEncryptionPublicKeyResponse create() {
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
    public GetPhoneEncryptionPublicKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPhoneEncryptionPublicKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetPhoneEncryptionPublicKeyResponseBody body);

        @Override
        GetPhoneEncryptionPublicKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPhoneEncryptionPublicKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetPhoneEncryptionPublicKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPhoneEncryptionPublicKeyResponse response) {
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
        public Builder body(GetPhoneEncryptionPublicKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPhoneEncryptionPublicKeyResponse build() {
            return new GetPhoneEncryptionPublicKeyResponse(this);
        } 

    } 

}
