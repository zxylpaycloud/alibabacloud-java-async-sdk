// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStorageSetsResponse} extends {@link TeaModel}
 *
 * <p>DescribeStorageSetsResponse</p>
 */
public class DescribeStorageSetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeStorageSetsResponseBody body;

    private DescribeStorageSetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeStorageSetsResponse create() {
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
    public DescribeStorageSetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeStorageSetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeStorageSetsResponseBody body);

        @Override
        DescribeStorageSetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeStorageSetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeStorageSetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeStorageSetsResponse response) {
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
        public Builder body(DescribeStorageSetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeStorageSetsResponse build() {
            return new DescribeStorageSetsResponse(this);
        } 

    } 

}
