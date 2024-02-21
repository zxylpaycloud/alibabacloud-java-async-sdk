// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IncreaseNodesResponse} extends {@link TeaModel}
 *
 * <p>IncreaseNodesResponse</p>
 */
public class IncreaseNodesResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private IncreaseNodesResponseBody body;

    private IncreaseNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static IncreaseNodesResponse create() {
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
    public IncreaseNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<IncreaseNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(IncreaseNodesResponseBody body);

        @Override
        IncreaseNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<IncreaseNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private IncreaseNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(IncreaseNodesResponse response) {
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
        public Builder body(IncreaseNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public IncreaseNodesResponse build() {
            return new IncreaseNodesResponse(this);
        } 

    } 

}
