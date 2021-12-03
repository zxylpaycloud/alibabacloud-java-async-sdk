// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetFunctionResponse} extends {@link TeaModel}
 *
 * <p>GetFunctionResponse</p>
 */
public class GetFunctionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFunctionResponseBody body;


    private GetFunctionResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFunctionResponse create() {
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
    public GetFunctionResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private GetFunctionResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(GetFunctionResponse response) {
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
        public Builder body(GetFunctionResponseBody body) {
            this.body = body;
            return this;
        }

        public GetFunctionResponse build() {
            return new GetFunctionResponse(this);
        } 

    } 

}
