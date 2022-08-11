// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRemindRequest} extends {@link RequestModel}
 *
 * <p>CreateRemindRequest</p>
 */
public class CreateRemindRequest extends Request {
    @Body
    @NameInMap("AlertInterval")
    private Integer alertInterval;

    @Body
    @NameInMap("AlertMethods")
    @Validation(required = true)
    private String alertMethods;

    @Body
    @NameInMap("AlertTargets")
    private String alertTargets;

    @Body
    @NameInMap("AlertUnit")
    @Validation(required = true)
    private String alertUnit;

    @Body
    @NameInMap("BaselineIds")
    private String baselineIds;

    @Body
    @NameInMap("BizProcessIds")
    private String bizProcessIds;

    @Body
    @NameInMap("Detail")
    private String detail;

    @Body
    @NameInMap("DndEnd")
    private String dndEnd;

    @Body
    @NameInMap("MaxAlertTimes")
    @Validation(maximum = 10, minimum = 1)
    private Integer maxAlertTimes;

    @Body
    @NameInMap("NodeIds")
    private String nodeIds;

    @Body
    @NameInMap("ProjectId")
    private Long projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("RemindName")
    @Validation(required = true)
    private String remindName;

    @Body
    @NameInMap("RemindType")
    @Validation(required = true)
    private String remindType;

    @Body
    @NameInMap("RemindUnit")
    @Validation(required = true)
    private String remindUnit;

    @Body
    @NameInMap("RobotUrls")
    private String robotUrls;

    private CreateRemindRequest(Builder builder) {
        super(builder);
        this.alertInterval = builder.alertInterval;
        this.alertMethods = builder.alertMethods;
        this.alertTargets = builder.alertTargets;
        this.alertUnit = builder.alertUnit;
        this.baselineIds = builder.baselineIds;
        this.bizProcessIds = builder.bizProcessIds;
        this.detail = builder.detail;
        this.dndEnd = builder.dndEnd;
        this.maxAlertTimes = builder.maxAlertTimes;
        this.nodeIds = builder.nodeIds;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.remindName = builder.remindName;
        this.remindType = builder.remindType;
        this.remindUnit = builder.remindUnit;
        this.robotUrls = builder.robotUrls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRemindRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertInterval
     */
    public Integer getAlertInterval() {
        return this.alertInterval;
    }

    /**
     * @return alertMethods
     */
    public String getAlertMethods() {
        return this.alertMethods;
    }

    /**
     * @return alertTargets
     */
    public String getAlertTargets() {
        return this.alertTargets;
    }

    /**
     * @return alertUnit
     */
    public String getAlertUnit() {
        return this.alertUnit;
    }

    /**
     * @return baselineIds
     */
    public String getBaselineIds() {
        return this.baselineIds;
    }

    /**
     * @return bizProcessIds
     */
    public String getBizProcessIds() {
        return this.bizProcessIds;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return dndEnd
     */
    public String getDndEnd() {
        return this.dndEnd;
    }

    /**
     * @return maxAlertTimes
     */
    public Integer getMaxAlertTimes() {
        return this.maxAlertTimes;
    }

    /**
     * @return nodeIds
     */
    public String getNodeIds() {
        return this.nodeIds;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remindName
     */
    public String getRemindName() {
        return this.remindName;
    }

    /**
     * @return remindType
     */
    public String getRemindType() {
        return this.remindType;
    }

    /**
     * @return remindUnit
     */
    public String getRemindUnit() {
        return this.remindUnit;
    }

    /**
     * @return robotUrls
     */
    public String getRobotUrls() {
        return this.robotUrls;
    }

    public static final class Builder extends Request.Builder<CreateRemindRequest, Builder> {
        private Integer alertInterval; 
        private String alertMethods; 
        private String alertTargets; 
        private String alertUnit; 
        private String baselineIds; 
        private String bizProcessIds; 
        private String detail; 
        private String dndEnd; 
        private Integer maxAlertTimes; 
        private String nodeIds; 
        private Long projectId; 
        private String regionId; 
        private String remindName; 
        private String remindType; 
        private String remindUnit; 
        private String robotUrls; 

        private Builder() {
            super();
        } 

        private Builder(CreateRemindRequest request) {
            super(request);
            this.alertInterval = request.alertInterval;
            this.alertMethods = request.alertMethods;
            this.alertTargets = request.alertTargets;
            this.alertUnit = request.alertUnit;
            this.baselineIds = request.baselineIds;
            this.bizProcessIds = request.bizProcessIds;
            this.detail = request.detail;
            this.dndEnd = request.dndEnd;
            this.maxAlertTimes = request.maxAlertTimes;
            this.nodeIds = request.nodeIds;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.remindName = request.remindName;
            this.remindType = request.remindType;
            this.remindUnit = request.remindUnit;
            this.robotUrls = request.robotUrls;
        } 

        /**
         * AlertInterval.
         */
        public Builder alertInterval(Integer alertInterval) {
            this.putBodyParameter("AlertInterval", alertInterval);
            this.alertInterval = alertInterval;
            return this;
        }

        /**
         * AlertMethods.
         */
        public Builder alertMethods(String alertMethods) {
            this.putBodyParameter("AlertMethods", alertMethods);
            this.alertMethods = alertMethods;
            return this;
        }

        /**
         * AlertTargets.
         */
        public Builder alertTargets(String alertTargets) {
            this.putBodyParameter("AlertTargets", alertTargets);
            this.alertTargets = alertTargets;
            return this;
        }

        /**
         * AlertUnit.
         */
        public Builder alertUnit(String alertUnit) {
            this.putBodyParameter("AlertUnit", alertUnit);
            this.alertUnit = alertUnit;
            return this;
        }

        /**
         * BaselineIds.
         */
        public Builder baselineIds(String baselineIds) {
            this.putBodyParameter("BaselineIds", baselineIds);
            this.baselineIds = baselineIds;
            return this;
        }

        /**
         * BizProcessIds.
         */
        public Builder bizProcessIds(String bizProcessIds) {
            this.putBodyParameter("BizProcessIds", bizProcessIds);
            this.bizProcessIds = bizProcessIds;
            return this;
        }

        /**
         * Detail.
         */
        public Builder detail(String detail) {
            this.putBodyParameter("Detail", detail);
            this.detail = detail;
            return this;
        }

        /**
         * DndEnd.
         */
        public Builder dndEnd(String dndEnd) {
            this.putBodyParameter("DndEnd", dndEnd);
            this.dndEnd = dndEnd;
            return this;
        }

        /**
         * MaxAlertTimes.
         */
        public Builder maxAlertTimes(Integer maxAlertTimes) {
            this.putBodyParameter("MaxAlertTimes", maxAlertTimes);
            this.maxAlertTimes = maxAlertTimes;
            return this;
        }

        /**
         * NodeIds.
         */
        public Builder nodeIds(String nodeIds) {
            this.putBodyParameter("NodeIds", nodeIds);
            this.nodeIds = nodeIds;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
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
         * RemindName.
         */
        public Builder remindName(String remindName) {
            this.putBodyParameter("RemindName", remindName);
            this.remindName = remindName;
            return this;
        }

        /**
         * RemindType.
         */
        public Builder remindType(String remindType) {
            this.putBodyParameter("RemindType", remindType);
            this.remindType = remindType;
            return this;
        }

        /**
         * RemindUnit.
         */
        public Builder remindUnit(String remindUnit) {
            this.putBodyParameter("RemindUnit", remindUnit);
            this.remindUnit = remindUnit;
            return this;
        }

        /**
         * RobotUrls.
         */
        public Builder robotUrls(String robotUrls) {
            this.putBodyParameter("RobotUrls", robotUrls);
            this.robotUrls = robotUrls;
            return this;
        }

        @Override
        public CreateRemindRequest build() {
            return new CreateRemindRequest(this);
        } 

    } 

}
