// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuditSecurityIpResponse} extends {@link TeaModel}
 *
 * <p>ListAuditSecurityIpResponse</p>
 */
public class ListAuditSecurityIpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAuditSecurityIpResponseBody body;

    private ListAuditSecurityIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAuditSecurityIpResponse create() {
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
    public ListAuditSecurityIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAuditSecurityIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAuditSecurityIpResponseBody body);

        @Override
        ListAuditSecurityIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAuditSecurityIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAuditSecurityIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAuditSecurityIpResponse response) {
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
        public Builder body(ListAuditSecurityIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAuditSecurityIpResponse build() {
            return new ListAuditSecurityIpResponse(this);
        } 

    } 

}
