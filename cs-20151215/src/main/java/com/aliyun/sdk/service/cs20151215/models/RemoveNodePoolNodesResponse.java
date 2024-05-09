// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveNodePoolNodesResponse} extends {@link TeaModel}
 *
 * <p>RemoveNodePoolNodesResponse</p>
 */
public class RemoveNodePoolNodesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private RemoveNodePoolNodesResponseBody body;

    private RemoveNodePoolNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static RemoveNodePoolNodesResponse create() {
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
    public RemoveNodePoolNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveNodePoolNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(RemoveNodePoolNodesResponseBody body);

        @Override
        RemoveNodePoolNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveNodePoolNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private RemoveNodePoolNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveNodePoolNodesResponse response) {
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
        public Builder body(RemoveNodePoolNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveNodePoolNodesResponse build() {
            return new RemoveNodePoolNodesResponse(this);
        } 

    } 

}
