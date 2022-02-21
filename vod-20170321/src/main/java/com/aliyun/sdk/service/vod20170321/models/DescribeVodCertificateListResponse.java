// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodCertificateListResponse} extends {@link TeaModel}
 *
 * <p>DescribeVodCertificateListResponse</p>
 */
public class DescribeVodCertificateListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVodCertificateListResponseBody body;

    private DescribeVodCertificateListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVodCertificateListResponse create() {
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
    public DescribeVodCertificateListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVodCertificateListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVodCertificateListResponseBody body);

        @Override
        DescribeVodCertificateListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVodCertificateListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVodCertificateListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVodCertificateListResponse response) {
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
        public Builder body(DescribeVodCertificateListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVodCertificateListResponse build() {
            return new DescribeVodCertificateListResponse(this);
        } 

    } 

}
