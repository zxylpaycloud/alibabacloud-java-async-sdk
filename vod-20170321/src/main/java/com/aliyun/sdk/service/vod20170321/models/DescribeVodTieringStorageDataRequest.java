// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodTieringStorageDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeVodTieringStorageDataRequest</p>
 */
public class DescribeVodTieringStorageDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageClass")
    private String storageClass;

    private DescribeVodTieringStorageDataRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
        this.startTime = builder.startTime;
        this.storageClass = builder.storageClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodTieringStorageDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return storageClass
     */
    public String getStorageClass() {
        return this.storageClass;
    }

    public static final class Builder extends Request.Builder<DescribeVodTieringStorageDataRequest, Builder> {
        private String endTime; 
        private Long ownerId; 
        private String region; 
        private String startTime; 
        private String storageClass; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVodTieringStorageDataRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.ownerId = request.ownerId;
            this.region = request.region;
            this.startTime = request.startTime;
            this.storageClass = request.storageClass;
        } 

        /**
         * The end time at which data is obtained. The end time must be later than the start time. The difference cannot exceed 31 days. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * The region in which you want to query data. If you leave this parameter empty, data in all regions is returned. Separate multiple regions with commas (,).
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC. If you leave this parameter empty, data in the last 24 hours is queried.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The storage type. By default, all storage types are returned. Valid values:
         * <p>
         * 
         * *   **IA**
         * *   **Archive**
         * *   **ColdArchive**
         */
        public Builder storageClass(String storageClass) {
            this.putQueryParameter("StorageClass", storageClass);
            this.storageClass = storageClass;
            return this;
        }

        @Override
        public DescribeVodTieringStorageDataRequest build() {
            return new DescribeVodTieringStorageDataRequest(this);
        } 

    } 

}
