// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTriggerResponse} extends {@link TeaModel}
 *
 * <p>UpdateTriggerResponse</p>
 */
public class UpdateTriggerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private Trigger body;

    private UpdateTriggerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTriggerResponse create() {
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
    public Trigger getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTriggerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(Trigger body);

        @Override
        UpdateTriggerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTriggerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Trigger body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTriggerResponse response) {
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
        public Builder body(Trigger body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTriggerResponse build() {
            return new UpdateTriggerResponse(this);
        } 

    } 

}