// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserInstancesResponse} extends {@link TeaModel}
 *
 * <p>ListUserInstancesResponse</p>
 */
public class ListUserInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUserInstancesResponseBody body;

    private ListUserInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUserInstancesResponse create() {
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
    public ListUserInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUserInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUserInstancesResponseBody body);

        @Override
        ListUserInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUserInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUserInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUserInstancesResponse response) {
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
        public Builder body(ListUserInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUserInstancesResponse build() {
            return new ListUserInstancesResponse(this);
        } 

    } 

}
