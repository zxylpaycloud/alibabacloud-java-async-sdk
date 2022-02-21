// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAIActionResponse} extends {@link TeaModel}
 *
 * <p>QueryAIActionResponse</p>
 */
public class QueryAIActionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryAIActionResponseBody body;

    private QueryAIActionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryAIActionResponse create() {
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
    public QueryAIActionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAIActionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryAIActionResponseBody body);

        @Override
        QueryAIActionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAIActionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryAIActionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAIActionResponse response) {
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
        public Builder body(QueryAIActionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAIActionResponse build() {
            return new QueryAIActionResponse(this);
        } 

    } 

}
