// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefuseDemandResponse} extends {@link TeaModel}
 *
 * <p>RefuseDemandResponse</p>
 */
public class RefuseDemandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefuseDemandResponseBody body;

    private RefuseDemandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RefuseDemandResponse create() {
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
    public RefuseDemandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefuseDemandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RefuseDemandResponseBody body);

        @Override
        RefuseDemandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefuseDemandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RefuseDemandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefuseDemandResponse response) {
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
        public Builder body(RefuseDemandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefuseDemandResponse build() {
            return new RefuseDemandResponse(this);
        } 

    } 

}