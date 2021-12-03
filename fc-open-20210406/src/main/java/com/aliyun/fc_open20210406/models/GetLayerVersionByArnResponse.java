// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetLayerVersionByArnResponse} extends {@link TeaModel}
 *
 * <p>GetLayerVersionByArnResponse</p>
 */
public class GetLayerVersionByArnResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLayerVersionByArnResponseBody body;


    private GetLayerVersionByArnResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLayerVersionByArnResponse create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public GetLayerVersionByArnResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private GetLayerVersionByArnResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(GetLayerVersionByArnResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * <p>headers.</p>
         */
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>body.</p>
         */
        public Builder body(GetLayerVersionByArnResponseBody body) {
            this.body = body;
            return this;
        }

        public GetLayerVersionByArnResponse build() {
            return new GetLayerVersionByArnResponse(this);
        } 

    } 

}
