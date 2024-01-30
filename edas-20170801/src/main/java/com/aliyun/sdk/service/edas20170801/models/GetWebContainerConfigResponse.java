// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWebContainerConfigResponse} extends {@link TeaModel}
 *
 * <p>GetWebContainerConfigResponse</p>
 */
public class GetWebContainerConfigResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private GetWebContainerConfigResponseBody body;

    private GetWebContainerConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetWebContainerConfigResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public GetWebContainerConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWebContainerConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetWebContainerConfigResponseBody body);

        @Override
        GetWebContainerConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWebContainerConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetWebContainerConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWebContainerConfigResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(GetWebContainerConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWebContainerConfigResponse build() {
            return new GetWebContainerConfigResponse(this);
        } 

    } 

}
