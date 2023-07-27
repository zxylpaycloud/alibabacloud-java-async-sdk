// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WorkitemAttachmentCreateResponse} extends {@link TeaModel}
 *
 * <p>WorkitemAttachmentCreateResponse</p>
 */
public class WorkitemAttachmentCreateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private WorkitemAttachmentCreateResponseBody body;

    private WorkitemAttachmentCreateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static WorkitemAttachmentCreateResponse create() {
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
    public WorkitemAttachmentCreateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<WorkitemAttachmentCreateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(WorkitemAttachmentCreateResponseBody body);

        @Override
        WorkitemAttachmentCreateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<WorkitemAttachmentCreateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private WorkitemAttachmentCreateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(WorkitemAttachmentCreateResponse response) {
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
        public Builder body(WorkitemAttachmentCreateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public WorkitemAttachmentCreateResponse build() {
            return new WorkitemAttachmentCreateResponse(this);
        } 

    } 

}