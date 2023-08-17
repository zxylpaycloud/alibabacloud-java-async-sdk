// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FailDemandResponse} extends {@link TeaModel}
 *
 * <p>FailDemandResponse</p>
 */
public class FailDemandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FailDemandResponseBody body;

    private FailDemandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FailDemandResponse create() {
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
    public FailDemandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FailDemandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FailDemandResponseBody body);

        @Override
        FailDemandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FailDemandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FailDemandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FailDemandResponse response) {
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
        public Builder body(FailDemandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FailDemandResponse build() {
            return new FailDemandResponse(this);
        } 

    } 

}