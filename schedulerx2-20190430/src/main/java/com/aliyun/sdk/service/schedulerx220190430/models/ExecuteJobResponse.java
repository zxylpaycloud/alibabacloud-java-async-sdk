// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteJobResponse} extends {@link TeaModel}
 *
 * <p>ExecuteJobResponse</p>
 */
public class ExecuteJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExecuteJobResponseBody body;

    private ExecuteJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExecuteJobResponse create() {
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
    public ExecuteJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExecuteJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExecuteJobResponseBody body);

        @Override
        ExecuteJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExecuteJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExecuteJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExecuteJobResponse response) {
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
        public Builder body(ExecuteJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExecuteJobResponse build() {
            return new ExecuteJobResponse(this);
        } 

    } 

}
