// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteResourceGroupRequest</p>
 */
public class DeleteResourceGroupRequest extends Request {
    @Query
    @NameInMap("AccountId")
    private String accountId;

    @Query
    @NameInMap("ResourceGroupId")
    @Validation(required = true)
    private String resourceGroupId;

    private DeleteResourceGroupRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteResourceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<DeleteResourceGroupRequest, Builder> {
        private String accountId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteResourceGroupRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * AccountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public DeleteResourceGroupRequest build() {
            return new DeleteResourceGroupRequest(this);
        } 

    } 

}
