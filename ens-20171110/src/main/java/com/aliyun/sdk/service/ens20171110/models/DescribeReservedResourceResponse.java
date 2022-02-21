// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReservedResourceResponse} extends {@link TeaModel}
 *
 * <p>DescribeReservedResourceResponse</p>
 */
public class DescribeReservedResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeReservedResourceResponseBody body;

    private DescribeReservedResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeReservedResourceResponse create() {
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
    public DescribeReservedResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeReservedResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeReservedResourceResponseBody body);

        @Override
        DescribeReservedResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeReservedResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeReservedResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeReservedResourceResponse response) {
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
        public Builder body(DescribeReservedResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeReservedResourceResponse build() {
            return new DescribeReservedResourceResponse(this);
        } 

    } 

}
