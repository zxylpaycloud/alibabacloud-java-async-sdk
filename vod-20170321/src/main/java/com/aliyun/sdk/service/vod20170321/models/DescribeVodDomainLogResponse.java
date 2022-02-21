// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodDomainLogResponse} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainLogResponse</p>
 */
public class DescribeVodDomainLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVodDomainLogResponseBody body;

    private DescribeVodDomainLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVodDomainLogResponse create() {
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
    public DescribeVodDomainLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVodDomainLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVodDomainLogResponseBody body);

        @Override
        DescribeVodDomainLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVodDomainLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVodDomainLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVodDomainLogResponse response) {
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
        public Builder body(DescribeVodDomainLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVodDomainLogResponse build() {
            return new DescribeVodDomainLogResponse(this);
        } 

    } 

}
