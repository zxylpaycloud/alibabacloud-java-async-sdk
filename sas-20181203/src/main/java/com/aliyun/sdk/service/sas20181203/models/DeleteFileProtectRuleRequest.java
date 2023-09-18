// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFileProtectRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteFileProtectRuleRequest</p>
 */
public class DeleteFileProtectRuleRequest extends Request {
    @Query
    @NameInMap("Id")
    private java.util.List < Long > id;

    private DeleteFileProtectRuleRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFileProtectRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public java.util.List < Long > getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteFileProtectRuleRequest, Builder> {
        private java.util.List < Long > id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFileProtectRuleRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * Id.
         */
        public Builder id(java.util.List < Long > id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteFileProtectRuleRequest build() {
            return new DeleteFileProtectRuleRequest(this);
        } 

    } 

}