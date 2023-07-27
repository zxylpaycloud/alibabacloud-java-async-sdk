// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSiteMonitorListResponse} extends {@link TeaModel}
 *
 * <p>DescribeSiteMonitorListResponse</p>
 */
public class DescribeSiteMonitorListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSiteMonitorListResponseBody body;

    private DescribeSiteMonitorListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSiteMonitorListResponse create() {
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
    public DescribeSiteMonitorListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSiteMonitorListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSiteMonitorListResponseBody body);

        @Override
        DescribeSiteMonitorListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSiteMonitorListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSiteMonitorListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSiteMonitorListResponse response) {
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
        public Builder body(DescribeSiteMonitorListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSiteMonitorListResponse build() {
            return new DescribeSiteMonitorListResponse(this);
        } 

    } 

}