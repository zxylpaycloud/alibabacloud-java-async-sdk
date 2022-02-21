// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOfficePreviewURLResponse} extends {@link TeaModel}
 *
 * <p>GetOfficePreviewURLResponse</p>
 */
public class GetOfficePreviewURLResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOfficePreviewURLResponseBody body;

    private GetOfficePreviewURLResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOfficePreviewURLResponse create() {
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
    public GetOfficePreviewURLResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOfficePreviewURLResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOfficePreviewURLResponseBody body);

        @Override
        GetOfficePreviewURLResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOfficePreviewURLResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOfficePreviewURLResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOfficePreviewURLResponse response) {
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
        public Builder body(GetOfficePreviewURLResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOfficePreviewURLResponse build() {
            return new GetOfficePreviewURLResponse(this);
        } 

    } 

}
