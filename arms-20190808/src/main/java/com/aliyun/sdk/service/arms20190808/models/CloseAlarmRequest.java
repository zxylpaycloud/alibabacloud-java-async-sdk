// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseAlarmRequest} extends {@link RequestModel}
 *
 * <p>CloseAlarmRequest</p>
 */
public class CloseAlarmRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long alarmId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HandlerId")
    private Long handlerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Solution")
    private String solution;

    private CloseAlarmRequest(Builder builder) {
        super(builder);
        this.alarmId = builder.alarmId;
        this.handlerId = builder.handlerId;
        this.regionId = builder.regionId;
        this.solution = builder.solution;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloseAlarmRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmId
     */
    public Long getAlarmId() {
        return this.alarmId;
    }

    /**
     * @return handlerId
     */
    public Long getHandlerId() {
        return this.handlerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return solution
     */
    public String getSolution() {
        return this.solution;
    }

    public static final class Builder extends Request.Builder<CloseAlarmRequest, Builder> {
        private Long alarmId; 
        private Long handlerId; 
        private String regionId; 
        private String solution; 

        private Builder() {
            super();
        } 

        private Builder(CloseAlarmRequest request) {
            super(request);
            this.alarmId = request.alarmId;
            this.handlerId = request.handlerId;
            this.regionId = request.regionId;
            this.solution = request.solution;
        } 

        /**
         * The ID of the alert.
         * <p>
         * 
         * For more information about how to obtain the ID of an alert, see [ListAlertEvents](~~2612346~~).
         */
        public Builder alarmId(Long alarmId) {
            this.putQueryParameter("AlarmId", alarmId);
            this.alarmId = alarmId;
            return this;
        }

        /**
         * The ID of the alert handler.
         */
        public Builder handlerId(Long handlerId) {
            this.putQueryParameter("HandlerId", handlerId);
            this.handlerId = handlerId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The alert solution.
         */
        public Builder solution(String solution) {
            this.putQueryParameter("Solution", solution);
            this.solution = solution;
            return this;
        }

        @Override
        public CloseAlarmRequest build() {
            return new CloseAlarmRequest(this);
        } 

    } 

}
