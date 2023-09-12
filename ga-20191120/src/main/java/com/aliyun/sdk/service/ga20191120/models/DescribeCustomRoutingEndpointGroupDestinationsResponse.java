// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomRoutingEndpointGroupDestinationsResponse} extends {@link TeaModel}
 *
 * <p>DescribeCustomRoutingEndpointGroupDestinationsResponse</p>
 */
public class DescribeCustomRoutingEndpointGroupDestinationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCustomRoutingEndpointGroupDestinationsResponseBody body;

    private DescribeCustomRoutingEndpointGroupDestinationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCustomRoutingEndpointGroupDestinationsResponse create() {
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
    public DescribeCustomRoutingEndpointGroupDestinationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCustomRoutingEndpointGroupDestinationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCustomRoutingEndpointGroupDestinationsResponseBody body);

        @Override
        DescribeCustomRoutingEndpointGroupDestinationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCustomRoutingEndpointGroupDestinationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCustomRoutingEndpointGroupDestinationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCustomRoutingEndpointGroupDestinationsResponse response) {
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
        public Builder body(DescribeCustomRoutingEndpointGroupDestinationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCustomRoutingEndpointGroupDestinationsResponse build() {
            return new DescribeCustomRoutingEndpointGroupDestinationsResponse(this);
        } 

    } 

}