// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachSceneDefenseObjectResponse} extends {@link TeaModel}
 *
 * <p>DetachSceneDefenseObjectResponse</p>
 */
public class DetachSceneDefenseObjectResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DetachSceneDefenseObjectResponseBody body;

    private DetachSceneDefenseObjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DetachSceneDefenseObjectResponse create() {
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
    public DetachSceneDefenseObjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachSceneDefenseObjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DetachSceneDefenseObjectResponseBody body);

        @Override
        DetachSceneDefenseObjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachSceneDefenseObjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DetachSceneDefenseObjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachSceneDefenseObjectResponse response) {
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
        public Builder body(DetachSceneDefenseObjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachSceneDefenseObjectResponse build() {
            return new DetachSceneDefenseObjectResponse(this);
        } 

    } 

}
