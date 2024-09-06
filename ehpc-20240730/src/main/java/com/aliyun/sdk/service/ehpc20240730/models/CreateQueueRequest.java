// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQueueRequest} extends {@link RequestModel}
 *
 * <p>CreateQueueRequest</p>
 */
public class CreateQueueRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Queue")
    private QueueTemplate queue;

    private CreateQueueRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.queue = builder.queue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQueueRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return queue
     */
    public QueueTemplate getQueue() {
        return this.queue;
    }

    public static final class Builder extends Request.Builder<CreateQueueRequest, Builder> {
        private String clusterId; 
        private QueueTemplate queue; 

        private Builder() {
            super();
        } 

        private Builder(CreateQueueRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.queue = request.queue;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The configurations of the queue to be created.
         */
        public Builder queue(QueueTemplate queue) {
            String queueShrink = shrink(queue, "Queue", "json");
            this.putQueryParameter("Queue", queueShrink);
            this.queue = queue;
            return this;
        }

        @Override
        public CreateQueueRequest build() {
            return new CreateQueueRequest(this);
        } 

    } 

}
