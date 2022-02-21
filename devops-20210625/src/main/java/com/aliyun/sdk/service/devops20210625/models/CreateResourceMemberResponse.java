// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceMemberResponse} extends {@link TeaModel}
 *
 * <p>CreateResourceMemberResponse</p>
 */
public class CreateResourceMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateResourceMemberResponseBody body;

    private CreateResourceMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateResourceMemberResponse create() {
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
    public CreateResourceMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateResourceMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateResourceMemberResponseBody body);

        @Override
        CreateResourceMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateResourceMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateResourceMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateResourceMemberResponse response) {
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
        public Builder body(CreateResourceMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateResourceMemberResponse build() {
            return new CreateResourceMemberResponse(this);
        } 

    } 

}
