// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddVodTemplateResponse} extends {@link TeaModel}
 *
 * <p>AddVodTemplateResponse</p>
 */
public class AddVodTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddVodTemplateResponseBody body;

    private AddVodTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddVodTemplateResponse create() {
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
    public AddVodTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddVodTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddVodTemplateResponseBody body);

        @Override
        AddVodTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddVodTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddVodTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddVodTemplateResponse response) {
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
        public Builder body(AddVodTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddVodTemplateResponse build() {
            return new AddVodTemplateResponse(this);
        } 

    } 

}
