// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSourceSchemasResponse} extends {@link TeaModel}
 *
 * <p>ListDataSourceSchemasResponse</p>
 */
public class ListDataSourceSchemasResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDataSourceSchemasResponseBody body;

    private ListDataSourceSchemasResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDataSourceSchemasResponse create() {
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
    public ListDataSourceSchemasResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDataSourceSchemasResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDataSourceSchemasResponseBody body);

        @Override
        ListDataSourceSchemasResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDataSourceSchemasResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDataSourceSchemasResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDataSourceSchemasResponse response) {
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
        public Builder body(ListDataSourceSchemasResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDataSourceSchemasResponse build() {
            return new ListDataSourceSchemasResponse(this);
        } 

    } 

}