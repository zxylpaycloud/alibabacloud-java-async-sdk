// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFileUploadLimitResponse} extends {@link TeaModel}
 *
 * <p>UpdateFileUploadLimitResponse</p>
 */
public class UpdateFileUploadLimitResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private UpdateFileUploadLimitResponseBody body;

    private UpdateFileUploadLimitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateFileUploadLimitResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public UpdateFileUploadLimitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateFileUploadLimitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateFileUploadLimitResponseBody body);

        @Override
        UpdateFileUploadLimitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateFileUploadLimitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateFileUploadLimitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateFileUploadLimitResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(UpdateFileUploadLimitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateFileUploadLimitResponse build() {
            return new UpdateFileUploadLimitResponse(this);
        } 

    } 

}
