// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEventRecordPlanDeviceByPlanResponse} extends {@link TeaModel}
 *
 * <p>QueryEventRecordPlanDeviceByPlanResponse</p>
 */
public class QueryEventRecordPlanDeviceByPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryEventRecordPlanDeviceByPlanResponseBody body;

    private QueryEventRecordPlanDeviceByPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryEventRecordPlanDeviceByPlanResponse create() {
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
    public QueryEventRecordPlanDeviceByPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryEventRecordPlanDeviceByPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryEventRecordPlanDeviceByPlanResponseBody body);

        @Override
        QueryEventRecordPlanDeviceByPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryEventRecordPlanDeviceByPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryEventRecordPlanDeviceByPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryEventRecordPlanDeviceByPlanResponse response) {
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
        public Builder body(QueryEventRecordPlanDeviceByPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryEventRecordPlanDeviceByPlanResponse build() {
            return new QueryEventRecordPlanDeviceByPlanResponse(this);
        } 

    } 

}
