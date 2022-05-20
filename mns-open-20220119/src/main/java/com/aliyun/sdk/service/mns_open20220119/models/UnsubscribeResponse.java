// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnsubscribeResponse} extends {@link TeaModel}
 *
 * <p>UnsubscribeResponse</p>
 */
public class UnsubscribeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnsubscribeResponseBody body;

    private UnsubscribeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnsubscribeResponse create() {
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
    public UnsubscribeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnsubscribeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnsubscribeResponseBody body);

        @Override
        UnsubscribeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnsubscribeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnsubscribeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnsubscribeResponse response) {
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
        public Builder body(UnsubscribeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnsubscribeResponse build() {
            return new UnsubscribeResponse(this);
        } 

    } 

}
