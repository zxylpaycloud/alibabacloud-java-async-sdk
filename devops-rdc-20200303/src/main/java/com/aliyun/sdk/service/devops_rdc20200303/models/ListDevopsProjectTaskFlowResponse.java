// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDevopsProjectTaskFlowResponse} extends {@link TeaModel}
 *
 * <p>ListDevopsProjectTaskFlowResponse</p>
 */
public class ListDevopsProjectTaskFlowResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDevopsProjectTaskFlowResponseBody body;

    private ListDevopsProjectTaskFlowResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDevopsProjectTaskFlowResponse create() {
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
    public ListDevopsProjectTaskFlowResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDevopsProjectTaskFlowResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDevopsProjectTaskFlowResponseBody body);

        @Override
        ListDevopsProjectTaskFlowResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDevopsProjectTaskFlowResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDevopsProjectTaskFlowResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDevopsProjectTaskFlowResponse response) {
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
        public Builder body(ListDevopsProjectTaskFlowResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDevopsProjectTaskFlowResponse build() {
            return new ListDevopsProjectTaskFlowResponse(this);
        } 

    } 

}
