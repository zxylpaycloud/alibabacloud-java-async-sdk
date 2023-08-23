// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReopenMergeRequestResponse} extends {@link TeaModel}
 *
 * <p>ReopenMergeRequestResponse</p>
 */
public class ReopenMergeRequestResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReopenMergeRequestResponseBody body;

    private ReopenMergeRequestResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReopenMergeRequestResponse create() {
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
    public ReopenMergeRequestResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReopenMergeRequestResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReopenMergeRequestResponseBody body);

        @Override
        ReopenMergeRequestResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReopenMergeRequestResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReopenMergeRequestResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReopenMergeRequestResponse response) {
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
        public Builder body(ReopenMergeRequestResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReopenMergeRequestResponse build() {
            return new ReopenMergeRequestResponse(this);
        } 

    } 

}