// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetEntityTagsResponse} extends {@link TeaModel}
 *
 * <p>SetEntityTagsResponse</p>
 */
public class SetEntityTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetEntityTagsResponseBody body;

    private SetEntityTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetEntityTagsResponse create() {
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
    public SetEntityTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetEntityTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetEntityTagsResponseBody body);

        @Override
        SetEntityTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetEntityTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetEntityTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetEntityTagsResponse response) {
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
        public Builder body(SetEntityTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetEntityTagsResponse build() {
            return new SetEntityTagsResponse(this);
        } 

    } 

}