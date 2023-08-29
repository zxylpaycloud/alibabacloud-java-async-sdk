// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrFirewallsV2ListResponse} extends {@link TeaModel}
 *
 * <p>DescribeTrFirewallsV2ListResponse</p>
 */
public class DescribeTrFirewallsV2ListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTrFirewallsV2ListResponseBody body;

    private DescribeTrFirewallsV2ListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTrFirewallsV2ListResponse create() {
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
    public DescribeTrFirewallsV2ListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTrFirewallsV2ListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTrFirewallsV2ListResponseBody body);

        @Override
        DescribeTrFirewallsV2ListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTrFirewallsV2ListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTrFirewallsV2ListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTrFirewallsV2ListResponse response) {
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
        public Builder body(DescribeTrFirewallsV2ListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTrFirewallsV2ListResponse build() {
            return new DescribeTrFirewallsV2ListResponse(this);
        } 

    } 

}