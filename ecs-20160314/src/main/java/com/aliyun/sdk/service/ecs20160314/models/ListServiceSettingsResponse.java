// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceSettingsResponse} extends {@link TeaModel}
 *
 * <p>ListServiceSettingsResponse</p>
 */
public class ListServiceSettingsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListServiceSettingsResponseBody body;

    private ListServiceSettingsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListServiceSettingsResponse create() {
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
    public ListServiceSettingsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListServiceSettingsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListServiceSettingsResponseBody body);

        @Override
        ListServiceSettingsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListServiceSettingsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListServiceSettingsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListServiceSettingsResponse response) {
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
        public Builder body(ListServiceSettingsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListServiceSettingsResponse build() {
            return new ListServiceSettingsResponse(this);
        } 

    } 

}
