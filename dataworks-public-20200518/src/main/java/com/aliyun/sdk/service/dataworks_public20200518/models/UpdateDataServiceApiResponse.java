// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDataServiceApiResponse} extends {@link TeaModel}
 *
 * <p>UpdateDataServiceApiResponse</p>
 */
public class UpdateDataServiceApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDataServiceApiResponseBody body;

    private UpdateDataServiceApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDataServiceApiResponse create() {
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
    public UpdateDataServiceApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDataServiceApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDataServiceApiResponseBody body);

        @Override
        UpdateDataServiceApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDataServiceApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDataServiceApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDataServiceApiResponse response) {
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
        public Builder body(UpdateDataServiceApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDataServiceApiResponse build() {
            return new UpdateDataServiceApiResponse(this);
        } 

    } 

}
