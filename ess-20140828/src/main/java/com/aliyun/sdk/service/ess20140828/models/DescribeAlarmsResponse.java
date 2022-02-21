// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlarmsResponse} extends {@link TeaModel}
 *
 * <p>DescribeAlarmsResponse</p>
 */
public class DescribeAlarmsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAlarmsResponseBody body;

    private DescribeAlarmsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAlarmsResponse create() {
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
    public DescribeAlarmsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAlarmsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAlarmsResponseBody body);

        @Override
        DescribeAlarmsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAlarmsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAlarmsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAlarmsResponse response) {
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
        public Builder body(DescribeAlarmsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAlarmsResponse build() {
            return new DescribeAlarmsResponse(this);
        } 

    } 

}
