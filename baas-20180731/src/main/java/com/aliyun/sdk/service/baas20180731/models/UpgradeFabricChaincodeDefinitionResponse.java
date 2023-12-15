// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeFabricChaincodeDefinitionResponse} extends {@link TeaModel}
 *
 * <p>UpgradeFabricChaincodeDefinitionResponse</p>
 */
public class UpgradeFabricChaincodeDefinitionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private UpgradeFabricChaincodeDefinitionResponseBody body;

    private UpgradeFabricChaincodeDefinitionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpgradeFabricChaincodeDefinitionResponse create() {
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
    public UpgradeFabricChaincodeDefinitionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeFabricChaincodeDefinitionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpgradeFabricChaincodeDefinitionResponseBody body);

        @Override
        UpgradeFabricChaincodeDefinitionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeFabricChaincodeDefinitionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpgradeFabricChaincodeDefinitionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeFabricChaincodeDefinitionResponse response) {
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
        public Builder body(UpgradeFabricChaincodeDefinitionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeFabricChaincodeDefinitionResponse build() {
            return new UpgradeFabricChaincodeDefinitionResponse(this);
        } 

    } 

}
