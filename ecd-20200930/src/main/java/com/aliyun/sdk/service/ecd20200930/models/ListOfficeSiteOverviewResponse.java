// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOfficeSiteOverviewResponse} extends {@link TeaModel}
 *
 * <p>ListOfficeSiteOverviewResponse</p>
 */
public class ListOfficeSiteOverviewResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOfficeSiteOverviewResponseBody body;

    private ListOfficeSiteOverviewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOfficeSiteOverviewResponse create() {
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
    public ListOfficeSiteOverviewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOfficeSiteOverviewResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOfficeSiteOverviewResponseBody body);

        @Override
        ListOfficeSiteOverviewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOfficeSiteOverviewResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOfficeSiteOverviewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOfficeSiteOverviewResponse response) {
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
        public Builder body(ListOfficeSiteOverviewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOfficeSiteOverviewResponse build() {
            return new ListOfficeSiteOverviewResponse(this);
        } 

    } 

}
