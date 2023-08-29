// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAddressBookResponse} extends {@link TeaModel}
 *
 * <p>ModifyAddressBookResponse</p>
 */
public class ModifyAddressBookResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyAddressBookResponseBody body;

    private ModifyAddressBookResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyAddressBookResponse create() {
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
    public ModifyAddressBookResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyAddressBookResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyAddressBookResponseBody body);

        @Override
        ModifyAddressBookResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAddressBookResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyAddressBookResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAddressBookResponse response) {
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
        public Builder body(ModifyAddressBookResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyAddressBookResponse build() {
            return new ModifyAddressBookResponse(this);
        } 

    } 

}