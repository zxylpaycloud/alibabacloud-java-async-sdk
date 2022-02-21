// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteABTestSceneResponse} extends {@link TeaModel}
 *
 * <p>DeleteABTestSceneResponse</p>
 */
public class DeleteABTestSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteABTestSceneResponseBody body;

    private DeleteABTestSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteABTestSceneResponse create() {
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
    public DeleteABTestSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteABTestSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteABTestSceneResponseBody body);

        @Override
        DeleteABTestSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteABTestSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteABTestSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteABTestSceneResponse response) {
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
        public Builder body(DeleteABTestSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteABTestSceneResponse build() {
            return new DeleteABTestSceneResponse(this);
        } 

    } 

}
