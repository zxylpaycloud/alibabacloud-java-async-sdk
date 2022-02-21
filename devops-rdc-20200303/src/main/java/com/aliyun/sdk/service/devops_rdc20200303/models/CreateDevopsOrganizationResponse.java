// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDevopsOrganizationResponse} extends {@link TeaModel}
 *
 * <p>CreateDevopsOrganizationResponse</p>
 */
public class CreateDevopsOrganizationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDevopsOrganizationResponseBody body;

    private CreateDevopsOrganizationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDevopsOrganizationResponse create() {
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
    public CreateDevopsOrganizationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDevopsOrganizationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDevopsOrganizationResponseBody body);

        @Override
        CreateDevopsOrganizationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDevopsOrganizationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDevopsOrganizationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDevopsOrganizationResponse response) {
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
        public Builder body(CreateDevopsOrganizationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDevopsOrganizationResponse build() {
            return new CreateDevopsOrganizationResponse(this);
        } 

    } 

}
