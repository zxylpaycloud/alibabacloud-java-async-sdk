// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableMetricRulesResponse} extends {@link TeaModel}
 *
 * <p>DisableMetricRulesResponse</p>
 */
public class DisableMetricRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableMetricRulesResponseBody body;

    private DisableMetricRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableMetricRulesResponse create() {
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
    public DisableMetricRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableMetricRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableMetricRulesResponseBody body);

        @Override
        DisableMetricRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableMetricRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableMetricRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableMetricRulesResponse response) {
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
        public Builder body(DisableMetricRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableMetricRulesResponse build() {
            return new DisableMetricRulesResponse(this);
        } 

    } 

}