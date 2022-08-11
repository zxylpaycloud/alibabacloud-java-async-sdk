// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIDEEventResultResponse} extends {@link TeaModel}
 *
 * <p>UpdateIDEEventResultResponse</p>
 */
public class UpdateIDEEventResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateIDEEventResultResponseBody body;

    private UpdateIDEEventResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateIDEEventResultResponse create() {
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
    public UpdateIDEEventResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateIDEEventResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateIDEEventResultResponseBody body);

        @Override
        UpdateIDEEventResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateIDEEventResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateIDEEventResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateIDEEventResultResponse response) {
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
        public Builder body(UpdateIDEEventResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateIDEEventResultResponse build() {
            return new UpdateIDEEventResultResponse(this);
        } 

    } 

}
