// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDatasetItemResponse} extends {@link TeaModel}
 *
 * <p>DeleteDatasetItemResponse</p>
 */
public class DeleteDatasetItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDatasetItemResponseBody body;

    private DeleteDatasetItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDatasetItemResponse create() {
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
    public DeleteDatasetItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDatasetItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDatasetItemResponseBody body);

        @Override
        DeleteDatasetItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDatasetItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDatasetItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDatasetItemResponse response) {
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
        public Builder body(DeleteDatasetItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDatasetItemResponse build() {
            return new DeleteDatasetItemResponse(this);
        } 

    } 

}
