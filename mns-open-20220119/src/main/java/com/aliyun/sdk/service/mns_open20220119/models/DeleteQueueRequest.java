// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteQueueRequest} extends {@link RequestModel}
 *
 * <p>DeleteQueueRequest</p>
 */
public class DeleteQueueRequest extends Request {
    @Query
    @NameInMap("QueueName")
    @Validation(required = true)
    private String queueName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeleteQueueRequest(Builder builder) {
        super(builder);
        this.queueName = builder.queueName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteQueueRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteQueueRequest, Builder> {
        private String queueName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteQueueRequest request) {
            super(request);
            this.queueName = request.queueName;
            this.regionId = request.regionId;
        } 

        /**
         * QueueName.
         */
        public Builder queueName(String queueName) {
            this.putQueryParameter("QueueName", queueName);
            this.queueName = queueName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteQueueRequest build() {
            return new DeleteQueueRequest(this);
        } 

    } 

}
