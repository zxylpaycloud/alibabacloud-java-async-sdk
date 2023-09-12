// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAcrImageRepositoriesResponse} extends {@link TeaModel}
 *
 * <p>ListAcrImageRepositoriesResponse</p>
 */
public class ListAcrImageRepositoriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAcrImageRepositoriesResponseBody body;

    private ListAcrImageRepositoriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAcrImageRepositoriesResponse create() {
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
    public ListAcrImageRepositoriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAcrImageRepositoriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAcrImageRepositoriesResponseBody body);

        @Override
        ListAcrImageRepositoriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAcrImageRepositoriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAcrImageRepositoriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAcrImageRepositoriesResponse response) {
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
        public Builder body(ListAcrImageRepositoriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAcrImageRepositoriesResponse build() {
            return new ListAcrImageRepositoriesResponse(this);
        } 

    } 

}