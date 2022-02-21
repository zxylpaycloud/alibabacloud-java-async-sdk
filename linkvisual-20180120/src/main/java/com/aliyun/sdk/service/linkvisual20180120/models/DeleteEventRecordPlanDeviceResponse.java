// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEventRecordPlanDeviceResponse} extends {@link TeaModel}
 *
 * <p>DeleteEventRecordPlanDeviceResponse</p>
 */
public class DeleteEventRecordPlanDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteEventRecordPlanDeviceResponseBody body;

    private DeleteEventRecordPlanDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteEventRecordPlanDeviceResponse create() {
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
    public DeleteEventRecordPlanDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEventRecordPlanDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteEventRecordPlanDeviceResponseBody body);

        @Override
        DeleteEventRecordPlanDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEventRecordPlanDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteEventRecordPlanDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEventRecordPlanDeviceResponse response) {
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
        public Builder body(DeleteEventRecordPlanDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEventRecordPlanDeviceResponse build() {
            return new DeleteEventRecordPlanDeviceResponse(this);
        } 

    } 

}
