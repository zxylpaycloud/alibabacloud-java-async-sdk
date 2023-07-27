// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHostAvailabilityResponse} extends {@link TeaModel}
 *
 * <p>CreateHostAvailabilityResponse</p>
 */
public class CreateHostAvailabilityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateHostAvailabilityResponseBody body;

    private CreateHostAvailabilityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateHostAvailabilityResponse create() {
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
    public CreateHostAvailabilityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateHostAvailabilityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateHostAvailabilityResponseBody body);

        @Override
        CreateHostAvailabilityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateHostAvailabilityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateHostAvailabilityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateHostAvailabilityResponse response) {
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
        public Builder body(CreateHostAvailabilityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateHostAvailabilityResponse build() {
            return new CreateHostAvailabilityResponse(this);
        } 

    } 

}