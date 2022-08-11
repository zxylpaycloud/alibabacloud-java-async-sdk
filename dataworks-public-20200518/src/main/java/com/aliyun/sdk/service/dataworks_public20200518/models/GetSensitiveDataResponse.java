// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSensitiveDataResponse} extends {@link TeaModel}
 *
 * <p>GetSensitiveDataResponse</p>
 */
public class GetSensitiveDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSensitiveDataResponseBody body;

    private GetSensitiveDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSensitiveDataResponse create() {
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
    public GetSensitiveDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSensitiveDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSensitiveDataResponseBody body);

        @Override
        GetSensitiveDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSensitiveDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSensitiveDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSensitiveDataResponse response) {
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
        public Builder body(GetSensitiveDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSensitiveDataResponse build() {
            return new GetSensitiveDataResponse(this);
        } 

    } 

}
