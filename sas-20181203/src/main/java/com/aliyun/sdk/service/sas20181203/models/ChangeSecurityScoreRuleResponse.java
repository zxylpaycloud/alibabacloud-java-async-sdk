// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeSecurityScoreRuleResponse} extends {@link TeaModel}
 *
 * <p>ChangeSecurityScoreRuleResponse</p>
 */
public class ChangeSecurityScoreRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ChangeSecurityScoreRuleResponseBody body;

    private ChangeSecurityScoreRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ChangeSecurityScoreRuleResponse create() {
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
    public ChangeSecurityScoreRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ChangeSecurityScoreRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ChangeSecurityScoreRuleResponseBody body);

        @Override
        ChangeSecurityScoreRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ChangeSecurityScoreRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ChangeSecurityScoreRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ChangeSecurityScoreRuleResponse response) {
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
        public Builder body(ChangeSecurityScoreRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ChangeSecurityScoreRuleResponse build() {
            return new ChangeSecurityScoreRuleResponse(this);
        } 

    } 

}
