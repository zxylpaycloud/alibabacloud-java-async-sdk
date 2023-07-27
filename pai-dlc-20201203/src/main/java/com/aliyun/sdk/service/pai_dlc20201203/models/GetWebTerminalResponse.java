// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWebTerminalResponse} extends {@link TeaModel}
 *
 * <p>GetWebTerminalResponse</p>
 */
public class GetWebTerminalResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWebTerminalResponseBody body;

    private GetWebTerminalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWebTerminalResponse create() {
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
    public GetWebTerminalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWebTerminalResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWebTerminalResponseBody body);

        @Override
        GetWebTerminalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWebTerminalResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWebTerminalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWebTerminalResponse response) {
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
        public Builder body(GetWebTerminalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWebTerminalResponse build() {
            return new GetWebTerminalResponse(this);
        } 

    } 

}