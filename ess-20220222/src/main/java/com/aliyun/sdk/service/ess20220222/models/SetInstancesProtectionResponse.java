// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetInstancesProtectionResponse} extends {@link TeaModel}
 *
 * <p>SetInstancesProtectionResponse</p>
 */
public class SetInstancesProtectionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SetInstancesProtectionResponseBody body;

    private SetInstancesProtectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SetInstancesProtectionResponse create() {
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
    public SetInstancesProtectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetInstancesProtectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SetInstancesProtectionResponseBody body);

        @Override
        SetInstancesProtectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetInstancesProtectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SetInstancesProtectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetInstancesProtectionResponse response) {
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
        public Builder body(SetInstancesProtectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetInstancesProtectionResponse build() {
            return new SetInstancesProtectionResponse(this);
        } 

    } 

}
