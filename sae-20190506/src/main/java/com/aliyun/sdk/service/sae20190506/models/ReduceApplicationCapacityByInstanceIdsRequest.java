// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReduceApplicationCapacityByInstanceIdsRequest} extends {@link RequestModel}
 *
 * <p>ReduceApplicationCapacityByInstanceIdsRequest</p>
 */
public class ReduceApplicationCapacityByInstanceIdsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceIds;

    private ReduceApplicationCapacityByInstanceIdsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReduceApplicationCapacityByInstanceIdsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder extends Request.Builder<ReduceApplicationCapacityByInstanceIdsRequest, Builder> {
        private String appId; 
        private String instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(ReduceApplicationCapacityByInstanceIdsRequest request) {
            super(request);
            this.appId = request.appId;
            this.instanceIds = request.instanceIds;
        } 

        /**
         * The ID of the application.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The ID of the instance. Separate multiple instances with commas (,).
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public ReduceApplicationCapacityByInstanceIdsRequest build() {
            return new ReduceApplicationCapacityByInstanceIdsRequest(this);
        } 

    } 

}
