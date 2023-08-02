// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserResourcesResponse} extends {@link TeaModel}
 *
 * <p>ListUserResourcesResponse</p>
 */
public class ListUserResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUserResourcesResponseBody body;

    private ListUserResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUserResourcesResponse create() {
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
    public ListUserResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUserResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUserResourcesResponseBody body);

        @Override
        ListUserResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUserResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUserResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUserResourcesResponse response) {
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
        public Builder body(ListUserResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUserResourcesResponse build() {
            return new ListUserResourcesResponse(this);
        } 

    } 

}