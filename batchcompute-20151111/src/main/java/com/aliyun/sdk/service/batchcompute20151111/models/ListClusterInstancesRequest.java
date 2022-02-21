// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.batchcompute20151111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListClusterInstancesRequest</p>
 */
public class ListClusterInstancesRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("GroupName")
    @Validation(required = true)
    private String groupName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ListClusterInstancesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.groupName = builder.groupName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterInstancesRequest create() {
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
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListClusterInstancesRequest, Builder> {
        private String clusterId; 
        private String groupName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterInstancesRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.groupName = response.groupName;
            this.regionId = response.regionId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putPathParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListClusterInstancesRequest build() {
            return new ListClusterInstancesRequest(this);
        } 

    } 

}
