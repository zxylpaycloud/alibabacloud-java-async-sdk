// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDomainStateResponse} extends {@link TeaModel}
 *
 * <p>UpdateDomainStateResponse</p>
 */
public class UpdateDomainStateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDomainStateResponseBody body;

    private UpdateDomainStateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDomainStateResponse create() {
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
    public UpdateDomainStateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDomainStateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDomainStateResponseBody body);

        @Override
        UpdateDomainStateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDomainStateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDomainStateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDomainStateResponse response) {
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
        public Builder body(UpdateDomainStateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDomainStateResponse build() {
            return new UpdateDomainStateResponse(this);
        } 

    } 

}