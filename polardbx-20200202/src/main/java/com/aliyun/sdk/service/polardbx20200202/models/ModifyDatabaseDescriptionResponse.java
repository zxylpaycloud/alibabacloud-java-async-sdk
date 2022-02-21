// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDatabaseDescriptionResponse} extends {@link TeaModel}
 *
 * <p>ModifyDatabaseDescriptionResponse</p>
 */
public class ModifyDatabaseDescriptionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDatabaseDescriptionResponseBody body;

    private ModifyDatabaseDescriptionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDatabaseDescriptionResponse create() {
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
    public ModifyDatabaseDescriptionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDatabaseDescriptionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDatabaseDescriptionResponseBody body);

        @Override
        ModifyDatabaseDescriptionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDatabaseDescriptionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDatabaseDescriptionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDatabaseDescriptionResponse response) {
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
        public Builder body(ModifyDatabaseDescriptionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDatabaseDescriptionResponse build() {
            return new ModifyDatabaseDescriptionResponse(this);
        } 

    } 

}
