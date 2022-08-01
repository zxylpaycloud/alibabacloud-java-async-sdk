// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetShipperStatusResponse} extends {@link TeaModel}
 *
 * <p>GetShipperStatusResponse</p>
 */
public class GetShipperStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetShipperStatusResponseBody body;

    private GetShipperStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetShipperStatusResponse create() {
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
    public GetShipperStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetShipperStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetShipperStatusResponseBody body);

        @Override
        GetShipperStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetShipperStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetShipperStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetShipperStatusResponse response) {
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
        public Builder body(GetShipperStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetShipperStatusResponse build() {
            return new GetShipperStatusResponse(this);
        } 

    } 

}
