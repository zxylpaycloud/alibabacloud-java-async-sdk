// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPtsSceneRunningDataResponse} extends {@link TeaModel}
 *
 * <p>GetPtsSceneRunningDataResponse</p>
 */
public class GetPtsSceneRunningDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPtsSceneRunningDataResponseBody body;

    private GetPtsSceneRunningDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPtsSceneRunningDataResponse create() {
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
    public GetPtsSceneRunningDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPtsSceneRunningDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPtsSceneRunningDataResponseBody body);

        @Override
        GetPtsSceneRunningDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPtsSceneRunningDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPtsSceneRunningDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPtsSceneRunningDataResponse response) {
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
        public Builder body(GetPtsSceneRunningDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPtsSceneRunningDataResponse build() {
            return new GetPtsSceneRunningDataResponse(this);
        } 

    } 

}
