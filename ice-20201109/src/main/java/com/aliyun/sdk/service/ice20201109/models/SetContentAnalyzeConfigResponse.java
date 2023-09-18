// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetContentAnalyzeConfigResponse} extends {@link TeaModel}
 *
 * <p>SetContentAnalyzeConfigResponse</p>
 */
public class SetContentAnalyzeConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private SetContentAnalyzeConfigResponseBody body;

    private SetContentAnalyzeConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SetContentAnalyzeConfigResponse create() {
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
    public SetContentAnalyzeConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetContentAnalyzeConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SetContentAnalyzeConfigResponseBody body);

        @Override
        SetContentAnalyzeConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetContentAnalyzeConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SetContentAnalyzeConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetContentAnalyzeConfigResponse response) {
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
        public Builder body(SetContentAnalyzeConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetContentAnalyzeConfigResponse build() {
            return new SetContentAnalyzeConfigResponse(this);
        } 

    } 

}