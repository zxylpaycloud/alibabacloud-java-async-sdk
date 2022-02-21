// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlayUserTotalResponse} extends {@link TeaModel}
 *
 * <p>DescribePlayUserTotalResponse</p>
 */
public class DescribePlayUserTotalResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePlayUserTotalResponseBody body;

    private DescribePlayUserTotalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePlayUserTotalResponse create() {
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
    public DescribePlayUserTotalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePlayUserTotalResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePlayUserTotalResponseBody body);

        @Override
        DescribePlayUserTotalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePlayUserTotalResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePlayUserTotalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePlayUserTotalResponse response) {
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
        public Builder body(DescribePlayUserTotalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePlayUserTotalResponse build() {
            return new DescribePlayUserTotalResponse(this);
        } 

    } 

}
