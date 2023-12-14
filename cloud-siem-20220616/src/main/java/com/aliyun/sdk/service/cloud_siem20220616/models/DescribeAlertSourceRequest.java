// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertSourceRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertSourceRequest</p>
 */
public class DescribeAlertSourceRequest extends Request {
    @Body
    @NameInMap("EndTime")
    private Long endTime;

    @Body
    @NameInMap("Level")
    private java.util.List < String > level;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("StartTime")
    private Long startTime;

    private DescribeAlertSourceRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.level = builder.level;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return level
     */
    public java.util.List < String > getLevel() {
        return this.level;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeAlertSourceRequest, Builder> {
        private Long endTime; 
        private java.util.List < String > level; 
        private String regionId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlertSourceRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.level = request.level;
            this.regionId = request.regionId;
            this.startTime = request.startTime;
        } 

        /**
         * The end of the time range to query. Unit: milliseconds.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The risk levels. The value is a JSON array. Valid values:
         * <p>
         * 
         * *   serious: high
         * *   suspicious: medium
         * *   remind: low
         */
        public Builder level(java.util.List < String > level) {
            this.putBodyParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions in China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The beginning of the time range to query. Unit: milliseconds.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeAlertSourceRequest build() {
            return new DescribeAlertSourceRequest(this);
        } 

    } 

}
