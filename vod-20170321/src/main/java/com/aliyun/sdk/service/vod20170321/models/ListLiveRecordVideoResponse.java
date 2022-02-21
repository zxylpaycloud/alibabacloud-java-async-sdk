// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveRecordVideoResponse} extends {@link TeaModel}
 *
 * <p>ListLiveRecordVideoResponse</p>
 */
public class ListLiveRecordVideoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLiveRecordVideoResponseBody body;

    private ListLiveRecordVideoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLiveRecordVideoResponse create() {
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
    public ListLiveRecordVideoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLiveRecordVideoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLiveRecordVideoResponseBody body);

        @Override
        ListLiveRecordVideoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLiveRecordVideoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLiveRecordVideoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLiveRecordVideoResponse response) {
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
        public Builder body(ListLiveRecordVideoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLiveRecordVideoResponse build() {
            return new ListLiveRecordVideoResponse(this);
        } 

    } 

}
