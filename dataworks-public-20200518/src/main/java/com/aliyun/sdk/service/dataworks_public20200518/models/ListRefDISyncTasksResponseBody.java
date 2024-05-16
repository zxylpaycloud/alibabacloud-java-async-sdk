// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRefDISyncTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListRefDISyncTasksResponseBody</p>
 */
public class ListRefDISyncTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListRefDISyncTasksResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRefDISyncTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * The data returned for the query.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true: The request was successful.
         * *   false: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListRefDISyncTasksResponseBody build() {
            return new ListRefDISyncTasksResponseBody(this);
        } 

    } 

    public static class DISyncTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiDestinationDatasource")
        private String diDestinationDatasource;

        @com.aliyun.core.annotation.NameInMap("DiSourceDatasource")
        private String diSourceDatasource;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        private DISyncTasks(Builder builder) {
            this.diDestinationDatasource = builder.diDestinationDatasource;
            this.diSourceDatasource = builder.diSourceDatasource;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DISyncTasks create() {
            return builder().build();
        }

        /**
         * @return diDestinationDatasource
         */
        public String getDiDestinationDatasource() {
            return this.diDestinationDatasource;
        }

        /**
         * @return diSourceDatasource
         */
        public String getDiSourceDatasource() {
            return this.diSourceDatasource;
        }

        /**
         * @return nodeId
         */
        public Long getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String diDestinationDatasource; 
            private String diSourceDatasource; 
            private Long nodeId; 
            private String nodeName; 
            private String taskType; 

            /**
             * The destination data source of the sync node.
             * <p>
             * 
             * If the sync node has multiple destination data sources, the return value is a JSON array, such as \\"odps_writer\\", \\"mysql\\".
             * 
             * If the RefType parameter is set to to, the sync nodes that use the specified data source as the destination data source are returned. In this case, the value of this parameter indicates the specified data source.
             */
            public Builder diDestinationDatasource(String diDestinationDatasource) {
                this.diDestinationDatasource = diDestinationDatasource;
                return this;
            }

            /**
             * The source data source of the sync node.
             * <p>
             * 
             * If the sync node has multiple source data sources, the return value is a JSON array, such as \\"odps_writer\\", \\"mysql\\".
             * 
             * If the RefType parameter is set to from, the sync nodes that use the specified data source as the source data source are returned. In this case, the value of this parameter indicates the specified data source.
             */
            public Builder diSourceDatasource(String diSourceDatasource) {
                this.diSourceDatasource = diSourceDatasource;
                return this;
            }

            /**
             * The ID of the sync node.
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The name of the sync node.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * The type of the sync node. Valid values:
             * <p>
             * 
             * *   DI_OFFLINE: batch sync node
             * *   DI_REALTIME: real-time sync node
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public DISyncTasks build() {
                return new DISyncTasks(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DISyncTasks")
        private java.util.List < DISyncTasks> DISyncTasks;

        private Data(Builder builder) {
            this.DISyncTasks = builder.DISyncTasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return DISyncTasks
         */
        public java.util.List < DISyncTasks> getDISyncTasks() {
            return this.DISyncTasks;
        }

        public static final class Builder {
            private java.util.List < DISyncTasks> DISyncTasks; 

            /**
             * The details of the sync nodes.
             * <p>
             * 
             * A data source is usually associated with multiple sync nodes. Therefore, the value of this parameter is an array. The following parameters are the elements in the array. The sample values of these parameters show the details of a sync node.
             */
            public Builder DISyncTasks(java.util.List < DISyncTasks> DISyncTasks) {
                this.DISyncTasks = DISyncTasks;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
