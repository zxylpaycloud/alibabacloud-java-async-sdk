// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMetricRuleBlackListResponse} extends {@link TeaModel}
 *
 * <p>DeleteMetricRuleBlackListResponse</p>
 */
public class DeleteMetricRuleBlackListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMetricRuleBlackListResponseBody body;

    private DeleteMetricRuleBlackListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMetricRuleBlackListResponse create() {
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
    public DeleteMetricRuleBlackListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMetricRuleBlackListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMetricRuleBlackListResponseBody body);

        @Override
        DeleteMetricRuleBlackListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMetricRuleBlackListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMetricRuleBlackListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMetricRuleBlackListResponse response) {
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
        public Builder body(DeleteMetricRuleBlackListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMetricRuleBlackListResponse build() {
            return new DeleteMetricRuleBlackListResponse(this);
        } 

    } 

}