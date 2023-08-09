// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNetworkReachableAnalysisResponse} extends {@link TeaModel}
 *
 * <p>GetNetworkReachableAnalysisResponse</p>
 */
public class GetNetworkReachableAnalysisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetNetworkReachableAnalysisResponseBody body;

    private GetNetworkReachableAnalysisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetNetworkReachableAnalysisResponse create() {
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
    public GetNetworkReachableAnalysisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetNetworkReachableAnalysisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetNetworkReachableAnalysisResponseBody body);

        @Override
        GetNetworkReachableAnalysisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetNetworkReachableAnalysisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetNetworkReachableAnalysisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetNetworkReachableAnalysisResponse response) {
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
        public Builder body(GetNetworkReachableAnalysisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetNetworkReachableAnalysisResponse build() {
            return new GetNetworkReachableAnalysisResponse(this);
        } 

    } 

}
