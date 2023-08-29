// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrFirewallPolicyBackUpAssociationListResponse} extends {@link TeaModel}
 *
 * <p>DescribeTrFirewallPolicyBackUpAssociationListResponse</p>
 */
public class DescribeTrFirewallPolicyBackUpAssociationListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTrFirewallPolicyBackUpAssociationListResponseBody body;

    private DescribeTrFirewallPolicyBackUpAssociationListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTrFirewallPolicyBackUpAssociationListResponse create() {
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
    public DescribeTrFirewallPolicyBackUpAssociationListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTrFirewallPolicyBackUpAssociationListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTrFirewallPolicyBackUpAssociationListResponseBody body);

        @Override
        DescribeTrFirewallPolicyBackUpAssociationListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTrFirewallPolicyBackUpAssociationListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTrFirewallPolicyBackUpAssociationListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTrFirewallPolicyBackUpAssociationListResponse response) {
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
        public Builder body(DescribeTrFirewallPolicyBackUpAssociationListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTrFirewallPolicyBackUpAssociationListResponse build() {
            return new DescribeTrFirewallPolicyBackUpAssociationListResponse(this);
        } 

    } 

}