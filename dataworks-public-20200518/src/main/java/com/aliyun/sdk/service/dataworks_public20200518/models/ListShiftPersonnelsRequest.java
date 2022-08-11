// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListShiftPersonnelsRequest} extends {@link RequestModel}
 *
 * <p>ListShiftPersonnelsRequest</p>
 */
public class ListShiftPersonnelsRequest extends Request {
    @Body
    @NameInMap("BeginTime")
    private Long beginTime;

    @Body
    @NameInMap("EndTime")
    private Long endTime;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ShiftPersonUID")
    private String shiftPersonUID;

    @Body
    @NameInMap("ShiftScheduleIdentifier")
    private String shiftScheduleIdentifier;

    @Body
    @NameInMap("UserType")
    private String userType;

    private ListShiftPersonnelsRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.endTime = builder.endTime;
        this.regionId = builder.regionId;
        this.shiftPersonUID = builder.shiftPersonUID;
        this.shiftScheduleIdentifier = builder.shiftScheduleIdentifier;
        this.userType = builder.userType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListShiftPersonnelsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return shiftPersonUID
     */
    public String getShiftPersonUID() {
        return this.shiftPersonUID;
    }

    /**
     * @return shiftScheduleIdentifier
     */
    public String getShiftScheduleIdentifier() {
        return this.shiftScheduleIdentifier;
    }

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    public static final class Builder extends Request.Builder<ListShiftPersonnelsRequest, Builder> {
        private Long beginTime; 
        private Long endTime; 
        private String regionId; 
        private String shiftPersonUID; 
        private String shiftScheduleIdentifier; 
        private String userType; 

        private Builder() {
            super();
        } 

        private Builder(ListShiftPersonnelsRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.endTime = request.endTime;
            this.regionId = request.regionId;
            this.shiftPersonUID = request.shiftPersonUID;
            this.shiftScheduleIdentifier = request.shiftScheduleIdentifier;
            this.userType = request.userType;
        } 

        /**
         * BeginTime.
         */
        public Builder beginTime(Long beginTime) {
            this.putBodyParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
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

        /**
         * ShiftPersonUID.
         */
        public Builder shiftPersonUID(String shiftPersonUID) {
            this.putBodyParameter("ShiftPersonUID", shiftPersonUID);
            this.shiftPersonUID = shiftPersonUID;
            return this;
        }

        /**
         * ShiftScheduleIdentifier.
         */
        public Builder shiftScheduleIdentifier(String shiftScheduleIdentifier) {
            this.putBodyParameter("ShiftScheduleIdentifier", shiftScheduleIdentifier);
            this.shiftScheduleIdentifier = shiftScheduleIdentifier;
            return this;
        }

        /**
         * UserType.
         */
        public Builder userType(String userType) {
            this.putBodyParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        @Override
        public ListShiftPersonnelsRequest build() {
            return new ListShiftPersonnelsRequest(this);
        } 

    } 

}
