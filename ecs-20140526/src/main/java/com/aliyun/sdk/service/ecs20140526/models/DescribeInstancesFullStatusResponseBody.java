// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesFullStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesFullStatusResponseBody</p>
 */
public class DescribeInstancesFullStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceFullStatusSet")
    private InstanceFullStatusSet instanceFullStatusSet;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeInstancesFullStatusResponseBody(Builder builder) {
        this.instanceFullStatusSet = builder.instanceFullStatusSet;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesFullStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceFullStatusSet
     */
    public InstanceFullStatusSet getInstanceFullStatusSet() {
        return this.instanceFullStatusSet;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private InstanceFullStatusSet instanceFullStatusSet; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The queried instances.
         * <p>
         * 
         * >  If no instances exist, this parameter is empty.
         */
        public Builder instanceFullStatusSet(InstanceFullStatusSet instanceFullStatusSet) {
            this.instanceFullStatusSet = instanceFullStatusSet;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancesFullStatusResponseBody build() {
            return new DescribeInstancesFullStatusResponseBody(this);
        } 

    } 

    public static class HealthStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private HealthStatus(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthStatus create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer code; 
            private String name; 

            /**
             * The code of the health state.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * The name of the health state.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public HealthStatus build() {
                return new HealthStatus(this);
            } 

        } 

    }
    public static class EventCycleStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private EventCycleStatus(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventCycleStatus create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer code; 
            private String name; 

            /**
             * The code of the system event state.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * The name of the system event state.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public EventCycleStatus build() {
                return new EventCycleStatus(this);
            } 

        } 

    }
    public static class EventType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private EventType(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventType create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer code; 
            private String name; 

            /**
             * The code of the system event type.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * The name of the system event type.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public EventType build() {
                return new EventType(this);
            } 

        } 

    }
    public static class InactiveDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DeviceCategory")
        private String deviceCategory;

        @com.aliyun.core.annotation.NameInMap("DeviceSize")
        private String deviceSize;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("ReleaseTime")
        private String releaseTime;

        private InactiveDisk(Builder builder) {
            this.creationTime = builder.creationTime;
            this.deviceCategory = builder.deviceCategory;
            this.deviceSize = builder.deviceSize;
            this.deviceType = builder.deviceType;
            this.releaseTime = builder.releaseTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InactiveDisk create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return deviceCategory
         */
        public String getDeviceCategory() {
            return this.deviceCategory;
        }

        /**
         * @return deviceSize
         */
        public String getDeviceSize() {
            return this.deviceSize;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return releaseTime
         */
        public String getReleaseTime() {
            return this.releaseTime;
        }

        public static final class Builder {
            private String creationTime; 
            private String deviceCategory; 
            private String deviceSize; 
            private String deviceType; 
            private String releaseTime; 

            /**
             * The time when the disk was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The category of the disk. Valid values:
             * <p>
             * 
             * *   cloud: basic disk
             * *   cloud_efficiency: ultra disk
             * *   cloud_ssd: standard SSD
             * *   cloud_essd: Enterprise SSD (ESSD)
             * *   local_ssd_pro: I/O-intensive local disk
             * *   local_hdd_pro: throughput-intensive local disk
             * *   ephemeral: retired local disk
             * *   ephemeral_ssd: retired local SSD
             */
            public Builder deviceCategory(String deviceCategory) {
                this.deviceCategory = deviceCategory;
                return this;
            }

            /**
             * The size of the disk. Unit: GiB.
             */
            public Builder deviceSize(String deviceSize) {
                this.deviceSize = deviceSize;
                return this;
            }

            /**
             * The type of the disk. Valid values:
             * <p>
             * 
             * *   system
             * *   data
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * The time when the disk was released. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            public InactiveDisk build() {
                return new InactiveDisk(this);
            } 

        } 

    }
    public static class InactiveDisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InactiveDisk")
        private java.util.List < InactiveDisk> inactiveDisk;

        private InactiveDisks(Builder builder) {
            this.inactiveDisk = builder.inactiveDisk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InactiveDisks create() {
            return builder().build();
        }

        /**
         * @return inactiveDisk
         */
        public java.util.List < InactiveDisk> getInactiveDisk() {
            return this.inactiveDisk;
        }

        public static final class Builder {
            private java.util.List < InactiveDisk> inactiveDisk; 

            /**
             * InactiveDisk.
             */
            public Builder inactiveDisk(java.util.List < InactiveDisk> inactiveDisk) {
                this.inactiveDisk = inactiveDisk;
                return this;
            }

            public InactiveDisks build() {
                return new InactiveDisks(this);
            } 

        } 

    }
    public static class ExtendedAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Device")
        private String device;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("InactiveDisks")
        private InactiveDisks inactiveDisks;

        private ExtendedAttribute(Builder builder) {
            this.device = builder.device;
            this.diskId = builder.diskId;
            this.inactiveDisks = builder.inactiveDisks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendedAttribute create() {
            return builder().build();
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return inactiveDisks
         */
        public InactiveDisks getInactiveDisks() {
            return this.inactiveDisks;
        }

        public static final class Builder {
            private String device; 
            private String diskId; 
            private InactiveDisks inactiveDisks; 

            /**
             * The device name of the local disk.
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * The ID of the local disk.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * The inactive disks that have been released and must be cleared.
             */
            public Builder inactiveDisks(InactiveDisks inactiveDisks) {
                this.inactiveDisks = inactiveDisks;
                return this;
            }

            public ExtendedAttribute build() {
                return new ExtendedAttribute(this);
            } 

        } 

    }
    public static class ScheduledSystemEventType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventCycleStatus")
        private EventCycleStatus eventCycleStatus;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("EventPublishTime")
        private String eventPublishTime;

        @com.aliyun.core.annotation.NameInMap("EventType")
        private EventType eventType;

        @com.aliyun.core.annotation.NameInMap("ExtendedAttribute")
        private ExtendedAttribute extendedAttribute;

        @com.aliyun.core.annotation.NameInMap("ImpactLevel")
        private String impactLevel;

        @com.aliyun.core.annotation.NameInMap("NotBefore")
        private String notBefore;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        private ScheduledSystemEventType(Builder builder) {
            this.eventCycleStatus = builder.eventCycleStatus;
            this.eventId = builder.eventId;
            this.eventPublishTime = builder.eventPublishTime;
            this.eventType = builder.eventType;
            this.extendedAttribute = builder.extendedAttribute;
            this.impactLevel = builder.impactLevel;
            this.notBefore = builder.notBefore;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduledSystemEventType create() {
            return builder().build();
        }

        /**
         * @return eventCycleStatus
         */
        public EventCycleStatus getEventCycleStatus() {
            return this.eventCycleStatus;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventPublishTime
         */
        public String getEventPublishTime() {
            return this.eventPublishTime;
        }

        /**
         * @return eventType
         */
        public EventType getEventType() {
            return this.eventType;
        }

        /**
         * @return extendedAttribute
         */
        public ExtendedAttribute getExtendedAttribute() {
            return this.extendedAttribute;
        }

        /**
         * @return impactLevel
         */
        public String getImpactLevel() {
            return this.impactLevel;
        }

        /**
         * @return notBefore
         */
        public String getNotBefore() {
            return this.notBefore;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private EventCycleStatus eventCycleStatus; 
            private String eventId; 
            private String eventPublishTime; 
            private EventType eventType; 
            private ExtendedAttribute extendedAttribute; 
            private String impactLevel; 
            private String notBefore; 
            private String reason; 

            /**
             * The state of the system event.
             */
            public Builder eventCycleStatus(EventCycleStatus eventCycleStatus) {
                this.eventCycleStatus = eventCycleStatus;
                return this;
            }

            /**
             * The system event ID.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * The time when the system event was published. The time is displayed in UTC.
             */
            public Builder eventPublishTime(String eventPublishTime) {
                this.eventPublishTime = eventPublishTime;
                return this;
            }

            /**
             * The type of the system event.
             */
            public Builder eventType(EventType eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * The extended attributes of system events generated for instances that have local disks attached.
             * <p>
             * 
             * The return values vary based on the system event type.
             * 
             * If the system event type is not one of the following types, this parameter is empty:
             * 
             * *   SystemMaintenance.StopAndRepair
             * *   SystemMaintenance.CleanInactiveDisks
             * *   SecurityPunish.Locked
             * *   SecurityPunish.WebsiteBanned
             * *   SystemUpgrade.Migrate
             * *   SystemMaintenance.RebootAndIsolateErrorDisk
             * *   SystemMaintenance.RebootAndReInitErrorDisk
             * *   SystemMaintenance.ReInitErrorDisk
             * *   SystemMaintenance.IsolateErrorDisk
             */
            public Builder extendedAttribute(ExtendedAttribute extendedAttribute) {
                this.extendedAttribute = extendedAttribute;
                return this;
            }

            /**
             * The impact level of the system event.
             * <p>
             * 
             * >  If the user is not in a whitelist, this parameter is empty.
             */
            public Builder impactLevel(String impactLevel) {
                this.impactLevel = impactLevel;
                return this;
            }

            /**
             * The scheduled time at which to execute the O\&M task related to the system event. The time is displayed in UTC.
             */
            public Builder notBefore(String notBefore) {
                this.notBefore = notBefore;
                return this;
            }

            /**
             * The reason why the system event was scheduled.
             * <p>
             * 
             * >  If the exception cause is not detected, this parameter is empty.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public ScheduledSystemEventType build() {
                return new ScheduledSystemEventType(this);
            } 

        } 

    }
    public static class ScheduledSystemEventSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScheduledSystemEventType")
        private java.util.List < ScheduledSystemEventType> scheduledSystemEventType;

        private ScheduledSystemEventSet(Builder builder) {
            this.scheduledSystemEventType = builder.scheduledSystemEventType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduledSystemEventSet create() {
            return builder().build();
        }

        /**
         * @return scheduledSystemEventType
         */
        public java.util.List < ScheduledSystemEventType> getScheduledSystemEventType() {
            return this.scheduledSystemEventType;
        }

        public static final class Builder {
            private java.util.List < ScheduledSystemEventType> scheduledSystemEventType; 

            /**
             * ScheduledSystemEventType.
             */
            public Builder scheduledSystemEventType(java.util.List < ScheduledSystemEventType> scheduledSystemEventType) {
                this.scheduledSystemEventType = scheduledSystemEventType;
                return this;
            }

            public ScheduledSystemEventSet build() {
                return new ScheduledSystemEventSet(this);
            } 

        } 

    }
    public static class Status extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Status(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Status create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer code; 
            private String name; 

            /**
             * The code of the instance lifecycle state.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * The name of the instance lifecycle state.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Status build() {
                return new Status(this);
            } 

        } 

    }
    public static class InstanceFullStatusType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HealthStatus")
        private HealthStatus healthStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ScheduledSystemEventSet")
        private ScheduledSystemEventSet scheduledSystemEventSet;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Status status;

        private InstanceFullStatusType(Builder builder) {
            this.healthStatus = builder.healthStatus;
            this.instanceId = builder.instanceId;
            this.scheduledSystemEventSet = builder.scheduledSystemEventSet;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceFullStatusType create() {
            return builder().build();
        }

        /**
         * @return healthStatus
         */
        public HealthStatus getHealthStatus() {
            return this.healthStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return scheduledSystemEventSet
         */
        public ScheduledSystemEventSet getScheduledSystemEventSet() {
            return this.scheduledSystemEventSet;
        }

        /**
         * @return status
         */
        public Status getStatus() {
            return this.status;
        }

        public static final class Builder {
            private HealthStatus healthStatus; 
            private String instanceId; 
            private ScheduledSystemEventSet scheduledSystemEventSet; 
            private Status status; 

            /**
             * The health state of the instance.
             */
            public Builder healthStatus(HealthStatus healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The system events that are in the Scheduled or Inquiring state.
             */
            public Builder scheduledSystemEventSet(ScheduledSystemEventSet scheduledSystemEventSet) {
                this.scheduledSystemEventSet = scheduledSystemEventSet;
                return this;
            }

            /**
             * The lifecycle state of the instance.
             */
            public Builder status(Status status) {
                this.status = status;
                return this;
            }

            public InstanceFullStatusType build() {
                return new InstanceFullStatusType(this);
            } 

        } 

    }
    public static class InstanceFullStatusSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceFullStatusType")
        private java.util.List < InstanceFullStatusType> instanceFullStatusType;

        private InstanceFullStatusSet(Builder builder) {
            this.instanceFullStatusType = builder.instanceFullStatusType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceFullStatusSet create() {
            return builder().build();
        }

        /**
         * @return instanceFullStatusType
         */
        public java.util.List < InstanceFullStatusType> getInstanceFullStatusType() {
            return this.instanceFullStatusType;
        }

        public static final class Builder {
            private java.util.List < InstanceFullStatusType> instanceFullStatusType; 

            /**
             * InstanceFullStatusType.
             */
            public Builder instanceFullStatusType(java.util.List < InstanceFullStatusType> instanceFullStatusType) {
                this.instanceFullStatusType = instanceFullStatusType;
                return this;
            }

            public InstanceFullStatusSet build() {
                return new InstanceFullStatusSet(this);
            } 

        } 

    }
}
