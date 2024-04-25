// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIdpDepartmentResponse} extends {@link TeaModel}
 *
 * <p>CreateIdpDepartmentResponse</p>
 */
public class CreateIdpDepartmentResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private CreateIdpDepartmentResponseBody body;

    private CreateIdpDepartmentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateIdpDepartmentResponse create() {
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
    public CreateIdpDepartmentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateIdpDepartmentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateIdpDepartmentResponseBody body);

        @Override
        CreateIdpDepartmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateIdpDepartmentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CreateIdpDepartmentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateIdpDepartmentResponse response) {
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
        public Builder body(CreateIdpDepartmentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateIdpDepartmentResponse build() {
            return new CreateIdpDepartmentResponse(this);
        } 

    } 

}
