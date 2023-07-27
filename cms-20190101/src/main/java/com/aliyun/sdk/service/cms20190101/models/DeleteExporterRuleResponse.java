// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteExporterRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteExporterRuleResponse</p>
 */
public class DeleteExporterRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteExporterRuleResponseBody body;

    private DeleteExporterRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteExporterRuleResponse create() {
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
    public DeleteExporterRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteExporterRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteExporterRuleResponseBody body);

        @Override
        DeleteExporterRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteExporterRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteExporterRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteExporterRuleResponse response) {
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
        public Builder body(DeleteExporterRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteExporterRuleResponse build() {
            return new DeleteExporterRuleResponse(this);
        } 

    } 

}