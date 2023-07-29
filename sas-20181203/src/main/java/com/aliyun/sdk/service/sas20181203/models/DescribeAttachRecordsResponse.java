// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAttachRecordsResponse} extends {@link TeaModel}
 *
 * <p>DescribeAttachRecordsResponse</p>
 */
public class DescribeAttachRecordsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAttachRecordsResponseBody body;

    private DescribeAttachRecordsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAttachRecordsResponse create() {
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
    public DescribeAttachRecordsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAttachRecordsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAttachRecordsResponseBody body);

        @Override
        DescribeAttachRecordsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAttachRecordsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAttachRecordsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAttachRecordsResponse response) {
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
        public Builder body(DescribeAttachRecordsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAttachRecordsResponse build() {
            return new DescribeAttachRecordsResponse(this);
        } 

    } 

}