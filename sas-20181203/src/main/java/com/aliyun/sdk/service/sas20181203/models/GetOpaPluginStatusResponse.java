// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpaPluginStatusResponse} extends {@link TeaModel}
 *
 * <p>GetOpaPluginStatusResponse</p>
 */
public class GetOpaPluginStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOpaPluginStatusResponseBody body;

    private GetOpaPluginStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOpaPluginStatusResponse create() {
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
    public GetOpaPluginStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOpaPluginStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOpaPluginStatusResponseBody body);

        @Override
        GetOpaPluginStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOpaPluginStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOpaPluginStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOpaPluginStatusResponse response) {
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
        public Builder body(GetOpaPluginStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOpaPluginStatusResponse build() {
            return new GetOpaPluginStatusResponse(this);
        } 

    } 

}
