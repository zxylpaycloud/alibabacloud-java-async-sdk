// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MergeMergeRequestResponse} extends {@link TeaModel}
 *
 * <p>MergeMergeRequestResponse</p>
 */
public class MergeMergeRequestResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private MergeMergeRequestResponseBody body;

    private MergeMergeRequestResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static MergeMergeRequestResponse create() {
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
    public MergeMergeRequestResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MergeMergeRequestResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(MergeMergeRequestResponseBody body);

        @Override
        MergeMergeRequestResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MergeMergeRequestResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private MergeMergeRequestResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MergeMergeRequestResponse response) {
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
        public Builder body(MergeMergeRequestResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MergeMergeRequestResponse build() {
            return new MergeMergeRequestResponse(this);
        } 

    } 

}