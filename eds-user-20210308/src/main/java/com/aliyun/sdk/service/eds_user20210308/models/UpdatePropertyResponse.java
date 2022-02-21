// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePropertyResponse} extends {@link TeaModel}
 *
 * <p>UpdatePropertyResponse</p>
 */
public class UpdatePropertyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdatePropertyResponseBody body;

    private UpdatePropertyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdatePropertyResponse create() {
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
    public UpdatePropertyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdatePropertyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdatePropertyResponseBody body);

        @Override
        UpdatePropertyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdatePropertyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdatePropertyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdatePropertyResponse response) {
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
        public Builder body(UpdatePropertyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdatePropertyResponse build() {
            return new UpdatePropertyResponse(this);
        } 

    } 

}
