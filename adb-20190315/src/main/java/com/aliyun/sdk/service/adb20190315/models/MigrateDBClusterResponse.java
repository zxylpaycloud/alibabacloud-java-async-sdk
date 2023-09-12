// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrateDBClusterResponse} extends {@link TeaModel}
 *
 * <p>MigrateDBClusterResponse</p>
 */
public class MigrateDBClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MigrateDBClusterResponseBody body;

    private MigrateDBClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MigrateDBClusterResponse create() {
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
    public MigrateDBClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MigrateDBClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MigrateDBClusterResponseBody body);

        @Override
        MigrateDBClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MigrateDBClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MigrateDBClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MigrateDBClusterResponse response) {
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
        public Builder body(MigrateDBClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MigrateDBClusterResponse build() {
            return new MigrateDBClusterResponse(this);
        } 

    } 

}