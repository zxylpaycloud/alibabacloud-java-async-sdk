// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DiagnoseInstanceResponse} extends {@link TeaModel}
 *
 * <p>DiagnoseInstanceResponse</p>
 */
public class DiagnoseInstanceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DiagnoseInstanceResponseBody body;

    private DiagnoseInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DiagnoseInstanceResponse create() {
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
    public DiagnoseInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DiagnoseInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DiagnoseInstanceResponseBody body);

        @Override
        DiagnoseInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DiagnoseInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DiagnoseInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DiagnoseInstanceResponse response) {
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
        public Builder body(DiagnoseInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DiagnoseInstanceResponse build() {
            return new DiagnoseInstanceResponse(this);
        } 

    } 

}
