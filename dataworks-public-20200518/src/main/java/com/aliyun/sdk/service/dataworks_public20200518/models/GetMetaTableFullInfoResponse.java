// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTableFullInfoResponse} extends {@link TeaModel}
 *
 * <p>GetMetaTableFullInfoResponse</p>
 */
public class GetMetaTableFullInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMetaTableFullInfoResponseBody body;

    private GetMetaTableFullInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMetaTableFullInfoResponse create() {
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
    public GetMetaTableFullInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMetaTableFullInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMetaTableFullInfoResponseBody body);

        @Override
        GetMetaTableFullInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMetaTableFullInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMetaTableFullInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMetaTableFullInfoResponse response) {
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
        public Builder body(GetMetaTableFullInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMetaTableFullInfoResponse build() {
            return new GetMetaTableFullInfoResponse(this);
        } 

    } 

}
