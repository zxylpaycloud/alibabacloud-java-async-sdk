// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link BatchUpdateEtlMetaResponse} extends {@link TeaModel}
 *
 * <p>BatchUpdateEtlMetaResponse</p>
 */
public class BatchUpdateEtlMetaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private BatchUpdateEtlMetaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static BatchUpdateEtlMetaResponse create() {
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

    public interface Builder extends Response.Builder<BatchUpdateEtlMetaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        BatchUpdateEtlMetaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchUpdateEtlMetaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchUpdateEtlMetaResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public BatchUpdateEtlMetaResponse build() {
            return new BatchUpdateEtlMetaResponse(this);
        } 

    } 

}
