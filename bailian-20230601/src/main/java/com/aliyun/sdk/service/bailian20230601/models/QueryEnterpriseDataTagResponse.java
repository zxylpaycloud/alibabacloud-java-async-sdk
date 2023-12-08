// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEnterpriseDataTagResponse} extends {@link TeaModel}
 *
 * <p>QueryEnterpriseDataTagResponse</p>
 */
public class QueryEnterpriseDataTagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryEnterpriseDataTagResponseBody body;

    private QueryEnterpriseDataTagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryEnterpriseDataTagResponse create() {
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
    public QueryEnterpriseDataTagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryEnterpriseDataTagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryEnterpriseDataTagResponseBody body);

        @Override
        QueryEnterpriseDataTagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryEnterpriseDataTagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryEnterpriseDataTagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryEnterpriseDataTagResponse response) {
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
        public Builder body(QueryEnterpriseDataTagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryEnterpriseDataTagResponse build() {
            return new QueryEnterpriseDataTagResponse(this);
        } 

    } 

}
