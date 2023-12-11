// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataServiceAuthorizedApisResponse} extends {@link TeaModel}
 *
 * <p>ListDataServiceAuthorizedApisResponse</p>
 */
public class ListDataServiceAuthorizedApisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDataServiceAuthorizedApisResponseBody body;

    private ListDataServiceAuthorizedApisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDataServiceAuthorizedApisResponse create() {
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
    public ListDataServiceAuthorizedApisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDataServiceAuthorizedApisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDataServiceAuthorizedApisResponseBody body);

        @Override
        ListDataServiceAuthorizedApisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDataServiceAuthorizedApisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDataServiceAuthorizedApisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDataServiceAuthorizedApisResponse response) {
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
        public Builder body(ListDataServiceAuthorizedApisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDataServiceAuthorizedApisResponse build() {
            return new ListDataServiceAuthorizedApisResponse(this);
        } 

    } 

}
