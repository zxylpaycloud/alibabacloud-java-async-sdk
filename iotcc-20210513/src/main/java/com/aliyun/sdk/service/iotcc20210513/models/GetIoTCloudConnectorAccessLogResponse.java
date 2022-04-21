// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIoTCloudConnectorAccessLogResponse} extends {@link TeaModel}
 *
 * <p>GetIoTCloudConnectorAccessLogResponse</p>
 */
public class GetIoTCloudConnectorAccessLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetIoTCloudConnectorAccessLogResponseBody body;

    private GetIoTCloudConnectorAccessLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetIoTCloudConnectorAccessLogResponse create() {
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
    public GetIoTCloudConnectorAccessLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetIoTCloudConnectorAccessLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetIoTCloudConnectorAccessLogResponseBody body);

        @Override
        GetIoTCloudConnectorAccessLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetIoTCloudConnectorAccessLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetIoTCloudConnectorAccessLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetIoTCloudConnectorAccessLogResponse response) {
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
        public Builder body(GetIoTCloudConnectorAccessLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetIoTCloudConnectorAccessLogResponse build() {
            return new GetIoTCloudConnectorAccessLogResponse(this);
        } 

    } 

}
