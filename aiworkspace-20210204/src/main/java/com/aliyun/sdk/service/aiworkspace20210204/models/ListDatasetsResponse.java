// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDatasetsResponse} extends {@link TeaModel}
 *
 * <p>ListDatasetsResponse</p>
 */
public class ListDatasetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDatasetsResponseBody body;

    private ListDatasetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDatasetsResponse create() {
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
    public ListDatasetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDatasetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDatasetsResponseBody body);

        @Override
        ListDatasetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDatasetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDatasetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDatasetsResponse response) {
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
        public Builder body(ListDatasetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDatasetsResponse build() {
            return new ListDatasetsResponse(this);
        } 

    } 

}