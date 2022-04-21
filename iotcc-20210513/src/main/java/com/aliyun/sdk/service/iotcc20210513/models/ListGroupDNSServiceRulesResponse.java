// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupDNSServiceRulesResponse} extends {@link TeaModel}
 *
 * <p>ListGroupDNSServiceRulesResponse</p>
 */
public class ListGroupDNSServiceRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListGroupDNSServiceRulesResponseBody body;

    private ListGroupDNSServiceRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListGroupDNSServiceRulesResponse create() {
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
    public ListGroupDNSServiceRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListGroupDNSServiceRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListGroupDNSServiceRulesResponseBody body);

        @Override
        ListGroupDNSServiceRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListGroupDNSServiceRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListGroupDNSServiceRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListGroupDNSServiceRulesResponse response) {
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
        public Builder body(ListGroupDNSServiceRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListGroupDNSServiceRulesResponse build() {
            return new ListGroupDNSServiceRulesResponse(this);
        } 

    } 

}
