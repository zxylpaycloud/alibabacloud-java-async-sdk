// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEntitiesByTagsResponse} extends {@link TeaModel}
 *
 * <p>ListEntitiesByTagsResponse</p>
 */
public class ListEntitiesByTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEntitiesByTagsResponseBody body;

    private ListEntitiesByTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEntitiesByTagsResponse create() {
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
    public ListEntitiesByTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEntitiesByTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEntitiesByTagsResponseBody body);

        @Override
        ListEntitiesByTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEntitiesByTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEntitiesByTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEntitiesByTagsResponse response) {
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
        public Builder body(ListEntitiesByTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEntitiesByTagsResponse build() {
            return new ListEntitiesByTagsResponse(this);
        } 

    } 

}