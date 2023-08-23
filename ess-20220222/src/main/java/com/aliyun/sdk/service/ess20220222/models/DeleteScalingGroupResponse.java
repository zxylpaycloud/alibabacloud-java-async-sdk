// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteScalingGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteScalingGroupResponse</p>
 */
public class DeleteScalingGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteScalingGroupResponseBody body;

    private DeleteScalingGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteScalingGroupResponse create() {
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
    public DeleteScalingGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteScalingGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteScalingGroupResponseBody body);

        @Override
        DeleteScalingGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteScalingGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteScalingGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteScalingGroupResponse response) {
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
        public Builder body(DeleteScalingGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteScalingGroupResponse build() {
            return new DeleteScalingGroupResponse(this);
        } 

    } 

}
