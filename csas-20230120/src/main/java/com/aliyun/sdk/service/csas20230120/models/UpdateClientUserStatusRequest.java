// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateClientUserStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateClientUserStatusRequest</p>
 */
public class UpdateClientUserStatusRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    private UpdateClientUserStatusRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateClientUserStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateClientUserStatusRequest, Builder> {
        private String id; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateClientUserStatusRequest request) {
            super(request);
            this.id = request.id;
            this.status = request.status;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateClientUserStatusRequest build() {
            return new UpdateClientUserStatusRequest(this);
        } 

    } 

}
