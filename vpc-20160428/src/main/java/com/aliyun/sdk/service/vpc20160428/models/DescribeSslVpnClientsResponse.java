// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSslVpnClientsResponse} extends {@link TeaModel}
 *
 * <p>DescribeSslVpnClientsResponse</p>
 */
public class DescribeSslVpnClientsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSslVpnClientsResponseBody body;

    private DescribeSslVpnClientsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSslVpnClientsResponse create() {
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
    public DescribeSslVpnClientsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSslVpnClientsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSslVpnClientsResponseBody body);

        @Override
        DescribeSslVpnClientsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSslVpnClientsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSslVpnClientsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSslVpnClientsResponse response) {
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
        public Builder body(DescribeSslVpnClientsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSslVpnClientsResponse build() {
            return new DescribeSslVpnClientsResponse(this);
        } 

    } 

}