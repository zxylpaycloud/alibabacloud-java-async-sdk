// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterVulStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterVulStatisticsRequest</p>
 */
public class DescribeClusterVulStatisticsRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("Types")
    private String types;

    private DescribeClusterVulStatisticsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterVulStatisticsRequest create() {
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
     * @return types
     */
    public String getTypes() {
        return this.types;
    }

    public static final class Builder extends Request.Builder<DescribeClusterVulStatisticsRequest, Builder> {
        private String clusterId; 
        private String types; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterVulStatisticsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.types = request.types;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Types.
         */
        public Builder types(String types) {
            this.putQueryParameter("Types", types);
            this.types = types;
            return this;
        }

        @Override
        public DescribeClusterVulStatisticsRequest build() {
            return new DescribeClusterVulStatisticsRequest(this);
        } 

    } 

}
