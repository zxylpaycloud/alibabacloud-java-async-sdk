// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceStatusResponse} extends {@link TeaModel}
 *
 * <p>ListInstanceStatusResponse</p>
 */
public class ListInstanceStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInstanceStatusResponseBody body;

    private ListInstanceStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInstanceStatusResponse create() {
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
    public ListInstanceStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInstanceStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInstanceStatusResponseBody body);

        @Override
        ListInstanceStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInstanceStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInstanceStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInstanceStatusResponse response) {
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
        public Builder body(ListInstanceStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInstanceStatusResponse build() {
            return new ListInstanceStatusResponse(this);
        } 

    } 

}