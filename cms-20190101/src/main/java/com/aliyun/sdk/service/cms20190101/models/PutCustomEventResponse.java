// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutCustomEventResponse} extends {@link TeaModel}
 *
 * <p>PutCustomEventResponse</p>
 */
public class PutCustomEventResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutCustomEventResponseBody body;

    private PutCustomEventResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutCustomEventResponse create() {
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
    public PutCustomEventResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutCustomEventResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutCustomEventResponseBody body);

        @Override
        PutCustomEventResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutCustomEventResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutCustomEventResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutCustomEventResponse response) {
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
        public Builder body(PutCustomEventResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutCustomEventResponse build() {
            return new PutCustomEventResponse(this);
        } 

    } 

}