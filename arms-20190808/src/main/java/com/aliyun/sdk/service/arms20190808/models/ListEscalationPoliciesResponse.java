// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEscalationPoliciesResponse} extends {@link TeaModel}
 *
 * <p>ListEscalationPoliciesResponse</p>
 */
public class ListEscalationPoliciesResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListEscalationPoliciesResponseBody body;

    private ListEscalationPoliciesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListEscalationPoliciesResponse create() {
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
    public ListEscalationPoliciesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEscalationPoliciesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListEscalationPoliciesResponseBody body);

        @Override
        ListEscalationPoliciesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEscalationPoliciesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListEscalationPoliciesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEscalationPoliciesResponse response) {
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
        public Builder body(ListEscalationPoliciesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEscalationPoliciesResponse build() {
            return new ListEscalationPoliciesResponse(this);
        } 

    } 

}
