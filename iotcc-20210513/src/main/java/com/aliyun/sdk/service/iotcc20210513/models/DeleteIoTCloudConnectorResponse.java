// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIoTCloudConnectorResponse} extends {@link TeaModel}
 *
 * <p>DeleteIoTCloudConnectorResponse</p>
 */
public class DeleteIoTCloudConnectorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteIoTCloudConnectorResponseBody body;

    private DeleteIoTCloudConnectorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteIoTCloudConnectorResponse create() {
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
    public DeleteIoTCloudConnectorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteIoTCloudConnectorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteIoTCloudConnectorResponseBody body);

        @Override
        DeleteIoTCloudConnectorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteIoTCloudConnectorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteIoTCloudConnectorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteIoTCloudConnectorResponse response) {
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
        public Builder body(DeleteIoTCloudConnectorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteIoTCloudConnectorResponse build() {
            return new DeleteIoTCloudConnectorResponse(this);
        } 

    } 

}
