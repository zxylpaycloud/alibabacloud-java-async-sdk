// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReplaceMigrationAvailableNumbersResponse} extends {@link TeaModel}
 *
 * <p>ReplaceMigrationAvailableNumbersResponse</p>
 */
public class ReplaceMigrationAvailableNumbersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReplaceMigrationAvailableNumbersResponseBody body;

    private ReplaceMigrationAvailableNumbersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReplaceMigrationAvailableNumbersResponse create() {
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
    public ReplaceMigrationAvailableNumbersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReplaceMigrationAvailableNumbersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReplaceMigrationAvailableNumbersResponseBody body);

        @Override
        ReplaceMigrationAvailableNumbersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReplaceMigrationAvailableNumbersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReplaceMigrationAvailableNumbersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReplaceMigrationAvailableNumbersResponse response) {
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
        public Builder body(ReplaceMigrationAvailableNumbersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReplaceMigrationAvailableNumbersResponse build() {
            return new ReplaceMigrationAvailableNumbersResponse(this);
        } 

    } 

}