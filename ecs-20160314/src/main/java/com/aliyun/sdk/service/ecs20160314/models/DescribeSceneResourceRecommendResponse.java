// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSceneResourceRecommendResponse} extends {@link TeaModel}
 *
 * <p>DescribeSceneResourceRecommendResponse</p>
 */
public class DescribeSceneResourceRecommendResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSceneResourceRecommendResponseBody body;

    private DescribeSceneResourceRecommendResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSceneResourceRecommendResponse create() {
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
    public DescribeSceneResourceRecommendResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSceneResourceRecommendResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSceneResourceRecommendResponseBody body);

        @Override
        DescribeSceneResourceRecommendResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSceneResourceRecommendResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSceneResourceRecommendResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSceneResourceRecommendResponse response) {
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
        public Builder body(DescribeSceneResourceRecommendResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSceneResourceRecommendResponse build() {
            return new DescribeSceneResourceRecommendResponse(this);
        } 

    } 

}
