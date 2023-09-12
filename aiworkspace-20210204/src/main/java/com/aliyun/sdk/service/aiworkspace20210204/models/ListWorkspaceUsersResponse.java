// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkspaceUsersResponse} extends {@link TeaModel}
 *
 * <p>ListWorkspaceUsersResponse</p>
 */
public class ListWorkspaceUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListWorkspaceUsersResponseBody body;

    private ListWorkspaceUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListWorkspaceUsersResponse create() {
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
    public ListWorkspaceUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListWorkspaceUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListWorkspaceUsersResponseBody body);

        @Override
        ListWorkspaceUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListWorkspaceUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListWorkspaceUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListWorkspaceUsersResponse response) {
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
        public Builder body(ListWorkspaceUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListWorkspaceUsersResponse build() {
            return new ListWorkspaceUsersResponse(this);
        } 

    } 

}