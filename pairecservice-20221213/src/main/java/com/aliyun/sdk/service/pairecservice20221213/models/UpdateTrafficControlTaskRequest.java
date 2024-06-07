// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTrafficControlTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateTrafficControlTaskRequest</p>
 */
public class UpdateTrafficControlTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TrafficControlTaskId")
    private String trafficControlTaskId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BehaviorTableMetaId")
    private String behaviorTableMetaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ControlGranularity")
    private String controlGranularity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ControlLogic")
    private String controlLogic;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ControlType")
    private String controlType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExecutionTime")
    private String executionTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemConditionArray")
    private String itemConditionArray;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemConditionExpress")
    private String itemConditionExpress;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemConditionType")
    private String itemConditionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemTableMetaId")
    private String itemTableMetaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private String sceneId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StatisBaeaviorConditionArray")
    private String statisBaeaviorConditionArray;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StatisBehaviorConditionExpress")
    private String statisBehaviorConditionExpress;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StatisBehaviorConditionType")
    private String statisBehaviorConditionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TrafficControlTargets")
    private java.util.List < TrafficControlTargets> trafficControlTargets;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserConditionArray")
    private String userConditionArray;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserConditionExpress")
    private String userConditionExpress;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserConditionType")
    private String userConditionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserTableMetaId")
    private String userTableMetaId;

    private UpdateTrafficControlTaskRequest(Builder builder) {
        super(builder);
        this.trafficControlTaskId = builder.trafficControlTaskId;
        this.regionId = builder.regionId;
        this.behaviorTableMetaId = builder.behaviorTableMetaId;
        this.controlGranularity = builder.controlGranularity;
        this.controlLogic = builder.controlLogic;
        this.controlType = builder.controlType;
        this.description = builder.description;
        this.endTime = builder.endTime;
        this.executionTime = builder.executionTime;
        this.instanceId = builder.instanceId;
        this.itemConditionArray = builder.itemConditionArray;
        this.itemConditionExpress = builder.itemConditionExpress;
        this.itemConditionType = builder.itemConditionType;
        this.itemTableMetaId = builder.itemTableMetaId;
        this.name = builder.name;
        this.sceneId = builder.sceneId;
        this.startTime = builder.startTime;
        this.statisBaeaviorConditionArray = builder.statisBaeaviorConditionArray;
        this.statisBehaviorConditionExpress = builder.statisBehaviorConditionExpress;
        this.statisBehaviorConditionType = builder.statisBehaviorConditionType;
        this.trafficControlTargets = builder.trafficControlTargets;
        this.userConditionArray = builder.userConditionArray;
        this.userConditionExpress = builder.userConditionExpress;
        this.userConditionType = builder.userConditionType;
        this.userTableMetaId = builder.userTableMetaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTrafficControlTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return trafficControlTaskId
     */
    public String getTrafficControlTaskId() {
        return this.trafficControlTaskId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return behaviorTableMetaId
     */
    public String getBehaviorTableMetaId() {
        return this.behaviorTableMetaId;
    }

    /**
     * @return controlGranularity
     */
    public String getControlGranularity() {
        return this.controlGranularity;
    }

    /**
     * @return controlLogic
     */
    public String getControlLogic() {
        return this.controlLogic;
    }

    /**
     * @return controlType
     */
    public String getControlType() {
        return this.controlType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return executionTime
     */
    public String getExecutionTime() {
        return this.executionTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return itemConditionArray
     */
    public String getItemConditionArray() {
        return this.itemConditionArray;
    }

    /**
     * @return itemConditionExpress
     */
    public String getItemConditionExpress() {
        return this.itemConditionExpress;
    }

    /**
     * @return itemConditionType
     */
    public String getItemConditionType() {
        return this.itemConditionType;
    }

    /**
     * @return itemTableMetaId
     */
    public String getItemTableMetaId() {
        return this.itemTableMetaId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return statisBaeaviorConditionArray
     */
    public String getStatisBaeaviorConditionArray() {
        return this.statisBaeaviorConditionArray;
    }

    /**
     * @return statisBehaviorConditionExpress
     */
    public String getStatisBehaviorConditionExpress() {
        return this.statisBehaviorConditionExpress;
    }

    /**
     * @return statisBehaviorConditionType
     */
    public String getStatisBehaviorConditionType() {
        return this.statisBehaviorConditionType;
    }

    /**
     * @return trafficControlTargets
     */
    public java.util.List < TrafficControlTargets> getTrafficControlTargets() {
        return this.trafficControlTargets;
    }

    /**
     * @return userConditionArray
     */
    public String getUserConditionArray() {
        return this.userConditionArray;
    }

    /**
     * @return userConditionExpress
     */
    public String getUserConditionExpress() {
        return this.userConditionExpress;
    }

    /**
     * @return userConditionType
     */
    public String getUserConditionType() {
        return this.userConditionType;
    }

    /**
     * @return userTableMetaId
     */
    public String getUserTableMetaId() {
        return this.userTableMetaId;
    }

    public static final class Builder extends Request.Builder<UpdateTrafficControlTaskRequest, Builder> {
        private String trafficControlTaskId; 
        private String regionId; 
        private String behaviorTableMetaId; 
        private String controlGranularity; 
        private String controlLogic; 
        private String controlType; 
        private String description; 
        private String endTime; 
        private String executionTime; 
        private String instanceId; 
        private String itemConditionArray; 
        private String itemConditionExpress; 
        private String itemConditionType; 
        private String itemTableMetaId; 
        private String name; 
        private String sceneId; 
        private String startTime; 
        private String statisBaeaviorConditionArray; 
        private String statisBehaviorConditionExpress; 
        private String statisBehaviorConditionType; 
        private java.util.List < TrafficControlTargets> trafficControlTargets; 
        private String userConditionArray; 
        private String userConditionExpress; 
        private String userConditionType; 
        private String userTableMetaId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTrafficControlTaskRequest request) {
            super(request);
            this.trafficControlTaskId = request.trafficControlTaskId;
            this.regionId = request.regionId;
            this.behaviorTableMetaId = request.behaviorTableMetaId;
            this.controlGranularity = request.controlGranularity;
            this.controlLogic = request.controlLogic;
            this.controlType = request.controlType;
            this.description = request.description;
            this.endTime = request.endTime;
            this.executionTime = request.executionTime;
            this.instanceId = request.instanceId;
            this.itemConditionArray = request.itemConditionArray;
            this.itemConditionExpress = request.itemConditionExpress;
            this.itemConditionType = request.itemConditionType;
            this.itemTableMetaId = request.itemTableMetaId;
            this.name = request.name;
            this.sceneId = request.sceneId;
            this.startTime = request.startTime;
            this.statisBaeaviorConditionArray = request.statisBaeaviorConditionArray;
            this.statisBehaviorConditionExpress = request.statisBehaviorConditionExpress;
            this.statisBehaviorConditionType = request.statisBehaviorConditionType;
            this.trafficControlTargets = request.trafficControlTargets;
            this.userConditionArray = request.userConditionArray;
            this.userConditionExpress = request.userConditionExpress;
            this.userConditionType = request.userConditionType;
            this.userTableMetaId = request.userTableMetaId;
        } 

        /**
         * TrafficControlTaskId.
         */
        public Builder trafficControlTaskId(String trafficControlTaskId) {
            this.putPathParameter("TrafficControlTaskId", trafficControlTaskId);
            this.trafficControlTaskId = trafficControlTaskId;
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
         * BehaviorTableMetaId.
         */
        public Builder behaviorTableMetaId(String behaviorTableMetaId) {
            this.putBodyParameter("BehaviorTableMetaId", behaviorTableMetaId);
            this.behaviorTableMetaId = behaviorTableMetaId;
            return this;
        }

        /**
         * ControlGranularity.
         */
        public Builder controlGranularity(String controlGranularity) {
            this.putBodyParameter("ControlGranularity", controlGranularity);
            this.controlGranularity = controlGranularity;
            return this;
        }

        /**
         * ControlLogic.
         */
        public Builder controlLogic(String controlLogic) {
            this.putBodyParameter("ControlLogic", controlLogic);
            this.controlLogic = controlLogic;
            return this;
        }

        /**
         * ControlType.
         */
        public Builder controlType(String controlType) {
            this.putBodyParameter("ControlType", controlType);
            this.controlType = controlType;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ExecutionTime.
         */
        public Builder executionTime(String executionTime) {
            this.putBodyParameter("ExecutionTime", executionTime);
            this.executionTime = executionTime;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ItemConditionArray.
         */
        public Builder itemConditionArray(String itemConditionArray) {
            this.putBodyParameter("ItemConditionArray", itemConditionArray);
            this.itemConditionArray = itemConditionArray;
            return this;
        }

        /**
         * ItemConditionExpress.
         */
        public Builder itemConditionExpress(String itemConditionExpress) {
            this.putBodyParameter("ItemConditionExpress", itemConditionExpress);
            this.itemConditionExpress = itemConditionExpress;
            return this;
        }

        /**
         * ItemConditionType.
         */
        public Builder itemConditionType(String itemConditionType) {
            this.putBodyParameter("ItemConditionType", itemConditionType);
            this.itemConditionType = itemConditionType;
            return this;
        }

        /**
         * ItemTableMetaId.
         */
        public Builder itemTableMetaId(String itemTableMetaId) {
            this.putBodyParameter("ItemTableMetaId", itemTableMetaId);
            this.itemTableMetaId = itemTableMetaId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.putBodyParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * StatisBaeaviorConditionArray.
         */
        public Builder statisBaeaviorConditionArray(String statisBaeaviorConditionArray) {
            this.putBodyParameter("StatisBaeaviorConditionArray", statisBaeaviorConditionArray);
            this.statisBaeaviorConditionArray = statisBaeaviorConditionArray;
            return this;
        }

        /**
         * StatisBehaviorConditionExpress.
         */
        public Builder statisBehaviorConditionExpress(String statisBehaviorConditionExpress) {
            this.putBodyParameter("StatisBehaviorConditionExpress", statisBehaviorConditionExpress);
            this.statisBehaviorConditionExpress = statisBehaviorConditionExpress;
            return this;
        }

        /**
         * StatisBehaviorConditionType.
         */
        public Builder statisBehaviorConditionType(String statisBehaviorConditionType) {
            this.putBodyParameter("StatisBehaviorConditionType", statisBehaviorConditionType);
            this.statisBehaviorConditionType = statisBehaviorConditionType;
            return this;
        }

        /**
         * TrafficControlTargets.
         */
        public Builder trafficControlTargets(java.util.List < TrafficControlTargets> trafficControlTargets) {
            this.putBodyParameter("TrafficControlTargets", trafficControlTargets);
            this.trafficControlTargets = trafficControlTargets;
            return this;
        }

        /**
         * UserConditionArray.
         */
        public Builder userConditionArray(String userConditionArray) {
            this.putBodyParameter("UserConditionArray", userConditionArray);
            this.userConditionArray = userConditionArray;
            return this;
        }

        /**
         * UserConditionExpress.
         */
        public Builder userConditionExpress(String userConditionExpress) {
            this.putBodyParameter("UserConditionExpress", userConditionExpress);
            this.userConditionExpress = userConditionExpress;
            return this;
        }

        /**
         * UserConditionType.
         */
        public Builder userConditionType(String userConditionType) {
            this.putBodyParameter("UserConditionType", userConditionType);
            this.userConditionType = userConditionType;
            return this;
        }

        /**
         * UserTableMetaId.
         */
        public Builder userTableMetaId(String userTableMetaId) {
            this.putBodyParameter("UserTableMetaId", userTableMetaId);
            this.userTableMetaId = userTableMetaId;
            return this;
        }

        @Override
        public UpdateTrafficControlTaskRequest build() {
            return new UpdateTrafficControlTaskRequest(this);
        } 

    } 

    public static class TrafficControlTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Event")
        private String event;

        @com.aliyun.core.annotation.NameInMap("ItemConditionArray")
        private String itemConditionArray;

        @com.aliyun.core.annotation.NameInMap("ItemConditionExpress")
        private String itemConditionExpress;

        @com.aliyun.core.annotation.NameInMap("ItemConditionType")
        private String itemConditionType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NewProductRegulation")
        private Boolean newProductRegulation;

        @com.aliyun.core.annotation.NameInMap("RecallName")
        private String recallName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("StatisPeriod")
        private String statisPeriod;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("ToleranceValue")
        private Long toleranceValue;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Float value;

        private TrafficControlTargets(Builder builder) {
            this.endTime = builder.endTime;
            this.event = builder.event;
            this.itemConditionArray = builder.itemConditionArray;
            this.itemConditionExpress = builder.itemConditionExpress;
            this.itemConditionType = builder.itemConditionType;
            this.name = builder.name;
            this.newProductRegulation = builder.newProductRegulation;
            this.recallName = builder.recallName;
            this.startTime = builder.startTime;
            this.statisPeriod = builder.statisPeriod;
            this.status = builder.status;
            this.toleranceValue = builder.toleranceValue;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficControlTargets create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return event
         */
        public String getEvent() {
            return this.event;
        }

        /**
         * @return itemConditionArray
         */
        public String getItemConditionArray() {
            return this.itemConditionArray;
        }

        /**
         * @return itemConditionExpress
         */
        public String getItemConditionExpress() {
            return this.itemConditionExpress;
        }

        /**
         * @return itemConditionType
         */
        public String getItemConditionType() {
            return this.itemConditionType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return newProductRegulation
         */
        public Boolean getNewProductRegulation() {
            return this.newProductRegulation;
        }

        /**
         * @return recallName
         */
        public String getRecallName() {
            return this.recallName;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return statisPeriod
         */
        public String getStatisPeriod() {
            return this.statisPeriod;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return toleranceValue
         */
        public Long getToleranceValue() {
            return this.toleranceValue;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private String endTime; 
            private String event; 
            private String itemConditionArray; 
            private String itemConditionExpress; 
            private String itemConditionType; 
            private String name; 
            private Boolean newProductRegulation; 
            private String recallName; 
            private String startTime; 
            private String statisPeriod; 
            private String status; 
            private Long toleranceValue; 
            private Float value; 

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Event.
             */
            public Builder event(String event) {
                this.event = event;
                return this;
            }

            /**
             * ItemConditionArray.
             */
            public Builder itemConditionArray(String itemConditionArray) {
                this.itemConditionArray = itemConditionArray;
                return this;
            }

            /**
             * ItemConditionExpress.
             */
            public Builder itemConditionExpress(String itemConditionExpress) {
                this.itemConditionExpress = itemConditionExpress;
                return this;
            }

            /**
             * ItemConditionType.
             */
            public Builder itemConditionType(String itemConditionType) {
                this.itemConditionType = itemConditionType;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NewProductRegulation.
             */
            public Builder newProductRegulation(Boolean newProductRegulation) {
                this.newProductRegulation = newProductRegulation;
                return this;
            }

            /**
             * RecallName.
             */
            public Builder recallName(String recallName) {
                this.recallName = recallName;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StatisPeriod.
             */
            public Builder statisPeriod(String statisPeriod) {
                this.statisPeriod = statisPeriod;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * ToleranceValue.
             */
            public Builder toleranceValue(Long toleranceValue) {
                this.toleranceValue = toleranceValue;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public TrafficControlTargets build() {
                return new TrafficControlTargets(this);
            } 

        } 

    }
}
