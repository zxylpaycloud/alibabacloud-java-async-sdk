// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutEventRuleResponse} extends {@link TeaModel}
 *
 * <p>PutEventRuleResponse</p>
 */
public class PutEventRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutEventRuleResponseBody body;

    private PutEventRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutEventRuleResponse create() {
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
    public PutEventRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutEventRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutEventRuleResponseBody body);

        @Override
        PutEventRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutEventRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutEventRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutEventRuleResponse response) {
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
        public Builder body(PutEventRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutEventRuleResponse build() {
            return new PutEventRuleResponse(this);
        } 

    } 

}