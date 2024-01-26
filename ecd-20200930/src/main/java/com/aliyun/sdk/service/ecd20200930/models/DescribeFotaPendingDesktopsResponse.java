// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFotaPendingDesktopsResponse} extends {@link TeaModel}
 *
 * <p>DescribeFotaPendingDesktopsResponse</p>
 */
public class DescribeFotaPendingDesktopsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeFotaPendingDesktopsResponseBody body;

    private DescribeFotaPendingDesktopsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeFotaPendingDesktopsResponse create() {
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
    public DescribeFotaPendingDesktopsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFotaPendingDesktopsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeFotaPendingDesktopsResponseBody body);

        @Override
        DescribeFotaPendingDesktopsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFotaPendingDesktopsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeFotaPendingDesktopsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFotaPendingDesktopsResponse response) {
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
        public Builder body(DescribeFotaPendingDesktopsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFotaPendingDesktopsResponse build() {
            return new DescribeFotaPendingDesktopsResponse(this);
        } 

    } 

}
