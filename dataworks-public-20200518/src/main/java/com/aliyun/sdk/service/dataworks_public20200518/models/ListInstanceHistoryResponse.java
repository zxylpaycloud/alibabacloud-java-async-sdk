// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceHistoryResponse} extends {@link TeaModel}
 *
 * <p>ListInstanceHistoryResponse</p>
 */
public class ListInstanceHistoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInstanceHistoryResponseBody body;

    private ListInstanceHistoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInstanceHistoryResponse create() {
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
    public ListInstanceHistoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInstanceHistoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInstanceHistoryResponseBody body);

        @Override
        ListInstanceHistoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInstanceHistoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInstanceHistoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInstanceHistoryResponse response) {
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
        public Builder body(ListInstanceHistoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInstanceHistoryResponse build() {
            return new ListInstanceHistoryResponse(this);
        } 

    } 

}
