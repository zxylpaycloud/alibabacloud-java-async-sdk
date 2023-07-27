// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkAppLogResponse} extends {@link TeaModel}
 *
 * <p>GetSparkAppLogResponse</p>
 */
public class GetSparkAppLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSparkAppLogResponseBody body;

    private GetSparkAppLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSparkAppLogResponse create() {
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
    public GetSparkAppLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSparkAppLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSparkAppLogResponseBody body);

        @Override
        GetSparkAppLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSparkAppLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSparkAppLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSparkAppLogResponse response) {
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
        public Builder body(GetSparkAppLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSparkAppLogResponse build() {
            return new GetSparkAppLogResponse(this);
        } 

    } 

}