// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AcceptDemandResponse} extends {@link TeaModel}
 *
 * <p>AcceptDemandResponse</p>
 */
public class AcceptDemandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AcceptDemandResponseBody body;

    private AcceptDemandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AcceptDemandResponse create() {
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
    public AcceptDemandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AcceptDemandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AcceptDemandResponseBody body);

        @Override
        AcceptDemandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AcceptDemandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AcceptDemandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AcceptDemandResponse response) {
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
        public Builder body(AcceptDemandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AcceptDemandResponse build() {
            return new AcceptDemandResponse(this);
        } 

    } 

}