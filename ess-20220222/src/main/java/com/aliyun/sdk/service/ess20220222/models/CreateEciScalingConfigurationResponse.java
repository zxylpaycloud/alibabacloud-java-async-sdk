// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEciScalingConfigurationResponse} extends {@link TeaModel}
 *
 * <p>CreateEciScalingConfigurationResponse</p>
 */
public class CreateEciScalingConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEciScalingConfigurationResponseBody body;

    private CreateEciScalingConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateEciScalingConfigurationResponse create() {
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
    public CreateEciScalingConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEciScalingConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateEciScalingConfigurationResponseBody body);

        @Override
        CreateEciScalingConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEciScalingConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateEciScalingConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEciScalingConfigurationResponse response) {
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
        public Builder body(CreateEciScalingConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEciScalingConfigurationResponse build() {
            return new CreateEciScalingConfigurationResponse(this);
        } 

    } 

}