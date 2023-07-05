// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBInstanceForRebuildResponse} extends {@link TeaModel}
 *
 * <p>CreateDBInstanceForRebuildResponse</p>
 */
public class CreateDBInstanceForRebuildResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDBInstanceForRebuildResponseBody body;

    private CreateDBInstanceForRebuildResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDBInstanceForRebuildResponse create() {
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
    public CreateDBInstanceForRebuildResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDBInstanceForRebuildResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDBInstanceForRebuildResponseBody body);

        @Override
        CreateDBInstanceForRebuildResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDBInstanceForRebuildResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDBInstanceForRebuildResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDBInstanceForRebuildResponse response) {
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
        public Builder body(CreateDBInstanceForRebuildResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDBInstanceForRebuildResponse build() {
            return new CreateDBInstanceForRebuildResponse(this);
        } 

    } 

}