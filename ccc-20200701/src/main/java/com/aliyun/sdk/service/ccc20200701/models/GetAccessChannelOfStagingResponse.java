// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessChannelOfStagingResponse} extends {@link TeaModel}
 *
 * <p>GetAccessChannelOfStagingResponse</p>
 */
public class GetAccessChannelOfStagingResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetAccessChannelOfStagingResponseBody body;

    private GetAccessChannelOfStagingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static GetAccessChannelOfStagingResponse create() {
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
    public GetAccessChannelOfStagingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAccessChannelOfStagingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetAccessChannelOfStagingResponseBody body);

        @Override
        GetAccessChannelOfStagingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAccessChannelOfStagingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetAccessChannelOfStagingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAccessChannelOfStagingResponse response) {
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
        public Builder body(GetAccessChannelOfStagingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAccessChannelOfStagingResponse build() {
            return new GetAccessChannelOfStagingResponse(this);
        } 

    } 

}
