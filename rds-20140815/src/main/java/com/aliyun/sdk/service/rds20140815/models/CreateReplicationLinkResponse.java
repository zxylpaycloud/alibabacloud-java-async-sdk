// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReplicationLinkResponse} extends {@link TeaModel}
 *
 * <p>CreateReplicationLinkResponse</p>
 */
public class CreateReplicationLinkResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateReplicationLinkResponseBody body;

    private CreateReplicationLinkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateReplicationLinkResponse create() {
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
    public CreateReplicationLinkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateReplicationLinkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateReplicationLinkResponseBody body);

        @Override
        CreateReplicationLinkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateReplicationLinkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateReplicationLinkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateReplicationLinkResponse response) {
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
        public Builder body(CreateReplicationLinkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateReplicationLinkResponse build() {
            return new CreateReplicationLinkResponse(this);
        } 

    } 

}
