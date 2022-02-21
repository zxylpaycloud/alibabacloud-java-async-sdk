// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteScheduledTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteScheduledTaskRequest</p>
 */
public class DeleteScheduledTaskRequest extends Request {
    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ScheduledTaskId")
    @Validation(required = true)
    private String scheduledTaskId;

    private DeleteScheduledTaskRequest(Builder builder) {
        super(builder);
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scheduledTaskId = builder.scheduledTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteScheduledTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return scheduledTaskId
     */
    public String getScheduledTaskId() {
        return this.scheduledTaskId;
    }

    public static final class Builder extends Request.Builder<DeleteScheduledTaskRequest, Builder> {
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private String scheduledTaskId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteScheduledTaskRequest response) {
            super(response);
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.scheduledTaskId = response.scheduledTaskId;
        } 

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ScheduledTaskId.
         */
        public Builder scheduledTaskId(String scheduledTaskId) {
            this.putQueryParameter("ScheduledTaskId", scheduledTaskId);
            this.scheduledTaskId = scheduledTaskId;
            return this;
        }

        @Override
        public DeleteScheduledTaskRequest build() {
            return new DeleteScheduledTaskRequest(this);
        } 

    } 

}
