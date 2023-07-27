// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticPlansResponse} extends {@link TeaModel}
 *
 * <p>DescribeElasticPlansResponse</p>
 */
public class DescribeElasticPlansResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeElasticPlansResponseBody body;

    private DescribeElasticPlansResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeElasticPlansResponse create() {
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
    public DescribeElasticPlansResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeElasticPlansResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeElasticPlansResponseBody body);

        @Override
        DescribeElasticPlansResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeElasticPlansResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeElasticPlansResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeElasticPlansResponse response) {
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
        public Builder body(DescribeElasticPlansResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeElasticPlansResponse build() {
            return new DescribeElasticPlansResponse(this);
        } 

    } 

}