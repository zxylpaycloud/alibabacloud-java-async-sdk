// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLifecycleActionsResponse} extends {@link TeaModel}
 *
 * <p>DescribeLifecycleActionsResponse</p>
 */
public class DescribeLifecycleActionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLifecycleActionsResponseBody body;

    private DescribeLifecycleActionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLifecycleActionsResponse create() {
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
    public DescribeLifecycleActionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLifecycleActionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLifecycleActionsResponseBody body);

        @Override
        DescribeLifecycleActionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLifecycleActionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLifecycleActionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLifecycleActionsResponse response) {
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
        public Builder body(DescribeLifecycleActionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLifecycleActionsResponse build() {
            return new DescribeLifecycleActionsResponse(this);
        } 

    } 

}
