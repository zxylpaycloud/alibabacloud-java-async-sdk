// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConcurrencyConfigsResponse} extends {@link TeaModel}
 *
 * <p>ListConcurrencyConfigsResponse</p>
 */
public class ListConcurrencyConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListConcurrencyConfigsOutput body;

    private ListConcurrencyConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListConcurrencyConfigsResponse create() {
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
    public ListConcurrencyConfigsOutput getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConcurrencyConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListConcurrencyConfigsOutput body);

        @Override
        ListConcurrencyConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConcurrencyConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListConcurrencyConfigsOutput body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConcurrencyConfigsResponse response) {
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
        public Builder body(ListConcurrencyConfigsOutput body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConcurrencyConfigsResponse build() {
            return new ListConcurrencyConfigsResponse(this);
        } 

    } 

}
