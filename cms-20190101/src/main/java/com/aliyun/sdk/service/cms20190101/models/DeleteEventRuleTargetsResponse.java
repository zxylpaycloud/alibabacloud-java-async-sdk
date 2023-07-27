// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEventRuleTargetsResponse} extends {@link TeaModel}
 *
 * <p>DeleteEventRuleTargetsResponse</p>
 */
public class DeleteEventRuleTargetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteEventRuleTargetsResponseBody body;

    private DeleteEventRuleTargetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteEventRuleTargetsResponse create() {
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
    public DeleteEventRuleTargetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEventRuleTargetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteEventRuleTargetsResponseBody body);

        @Override
        DeleteEventRuleTargetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEventRuleTargetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteEventRuleTargetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEventRuleTargetsResponse response) {
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
        public Builder body(DeleteEventRuleTargetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEventRuleTargetsResponse build() {
            return new DeleteEventRuleTargetsResponse(this);
        } 

    } 

}