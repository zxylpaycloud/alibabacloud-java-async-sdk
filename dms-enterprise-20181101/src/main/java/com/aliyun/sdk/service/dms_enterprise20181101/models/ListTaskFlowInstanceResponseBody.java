// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaskFlowInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListTaskFlowInstanceResponseBody</p>
 */
public class ListTaskFlowInstanceResponseBody extends TeaModel {
    @NameInMap("DAGInstanceList")
    private DAGInstanceList DAGInstanceList;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListTaskFlowInstanceResponseBody(Builder builder) {
        this.DAGInstanceList = builder.DAGInstanceList;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaskFlowInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return DAGInstanceList
     */
    public DAGInstanceList getDAGInstanceList() {
        return this.DAGInstanceList;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private DAGInstanceList DAGInstanceList; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * The status of the task flow. Valid values:
         * <p>
         * 
         * *   **0**: The task flow is waiting to be scheduled.
         * *   **1**: The task flow is being executed.
         * *   **2**: The task flow is paused.
         * *   **3**: The task flow failed.
         * *   **4**: The task flow is executed.
         * *   **5**: The task flow is complete.
         */
        public Builder DAGInstanceList(DAGInstanceList DAGInstanceList) {
            this.DAGInstanceList = DAGInstanceList;
            return this;
        }

        /**
         * The beginning of the time range to query the execution records of the task flow. Specify the time in the yyyy-MM-DD format.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The mode in which the task flow is triggered. Valid values:
         * <p>
         * 
         * *   **0**: The task flow is automatically triggered based on periodic scheduling.
         * *   **1**: The task flow is manually triggered.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The name of the task flow.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTaskFlowInstanceResponseBody build() {
            return new ListTaskFlowInstanceResponseBody(this);
        } 

    } 

    public static class DAGInstance extends TeaModel {
        @NameInMap("BusinessTime")
        private String businessTime;

        @NameInMap("DagId")
        private String dagId;

        @NameInMap("DagName")
        private String dagName;

        @NameInMap("DagVersion")
        private String dagVersion;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("HistoryDagId")
        private Long historyDagId;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Message")
        private String message;

        @NameInMap("OwnerName")
        private String ownerName;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TriggerType")
        private Integer triggerType;

        private DAGInstance(Builder builder) {
            this.businessTime = builder.businessTime;
            this.dagId = builder.dagId;
            this.dagName = builder.dagName;
            this.dagVersion = builder.dagVersion;
            this.endTime = builder.endTime;
            this.historyDagId = builder.historyDagId;
            this.id = builder.id;
            this.message = builder.message;
            this.ownerName = builder.ownerName;
            this.status = builder.status;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DAGInstance create() {
            return builder().build();
        }

        /**
         * @return businessTime
         */
        public String getBusinessTime() {
            return this.businessTime;
        }

        /**
         * @return dagId
         */
        public String getDagId() {
            return this.dagId;
        }

        /**
         * @return dagName
         */
        public String getDagName() {
            return this.dagName;
        }

        /**
         * @return dagVersion
         */
        public String getDagVersion() {
            return this.dagVersion;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return historyDagId
         */
        public Long getHistoryDagId() {
            return this.historyDagId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return triggerType
         */
        public Integer getTriggerType() {
            return this.triggerType;
        }

        public static final class Builder {
            private String businessTime; 
            private String dagId; 
            private String dagName; 
            private String dagVersion; 
            private String endTime; 
            private Long historyDagId; 
            private Long id; 
            private String message; 
            private String ownerName; 
            private Integer status; 
            private Integer triggerType; 

            /**
             * The information about the execution records returned.
             */
            public Builder businessTime(String businessTime) {
                this.businessTime = businessTime;
                return this;
            }

            /**
             * The description of the task.
             */
            public Builder dagId(String dagId) {
                this.dagId = dagId;
                return this;
            }

            /**
             * DagName.
             */
            public Builder dagName(String dagName) {
                this.dagName = dagName;
                return this;
            }

            /**
             * DagVersion.
             */
            public Builder dagVersion(String dagVersion) {
                this.dagVersion = dagVersion;
                return this;
            }

            /**
             * The end of the time range to query the execution records of the task flow. Specify the time in the yyyy-MM-DD format.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Queries the execution records of a task flow.
             */
            public Builder historyDagId(Long historyDagId) {
                this.historyDagId = historyDagId;
                return this;
            }

            /**
             * The error message returned if the request fails.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The mode in which the task flow is triggered. Valid values:
             * <p>
             * 
             * *   **0**: The task flow is automatically triggered based on periodic scheduling.
             * *   **1**: The task flow is manually triggered.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the execution of the task flow was complete. The time is displayed in the yyyy-MM-DD HH:mm:ss format.
             */
            public Builder triggerType(Integer triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public DAGInstance build() {
                return new DAGInstance(this);
            } 

        } 

    }
    public static class DAGInstanceList extends TeaModel {
        @NameInMap("DAGInstance")
        private java.util.List < DAGInstance> DAGInstance;

        private DAGInstanceList(Builder builder) {
            this.DAGInstance = builder.DAGInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DAGInstanceList create() {
            return builder().build();
        }

        /**
         * @return DAGInstance
         */
        public java.util.List < DAGInstance> getDAGInstance() {
            return this.DAGInstance;
        }

        public static final class Builder {
            private java.util.List < DAGInstance> DAGInstance; 

            /**
             * DAGInstance.
             */
            public Builder DAGInstance(java.util.List < DAGInstance> DAGInstance) {
                this.DAGInstance = DAGInstance;
                return this;
            }

            public DAGInstanceList build() {
                return new DAGInstanceList(this);
            } 

        } 

    }
}
