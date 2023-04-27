// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTasksInTaskFlowResponseBody} extends {@link TeaModel}
 *
 * <p>ListTasksInTaskFlowResponseBody</p>
 */
public class ListTasksInTaskFlowResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Tasks")
    private Tasks tasks;

    private ListTasksInTaskFlowResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTasksInTaskFlowResponseBody create() {
        return builder().build();
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
     * @return tasks
     */
    public Tasks getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Tasks tasks; 

        /**
         * The type of the node. For more information about the valid values for this parameter, see [NodeType parameter](~~424705~~).
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **ListTasksInTaskFlow**.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The tasks in the task flow.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The advanced configuration for the node.
         */
        public Builder tasks(Tasks tasks) {
            this.tasks = tasks;
            return this;
        }

        public ListTasksInTaskFlowResponseBody build() {
            return new ListTasksInTaskFlowResponseBody(this);
        } 

    } 

    public static class Task extends TeaModel {
        @NameInMap("GraphParam")
        private String graphParam;

        @NameInMap("NodeConfig")
        private String nodeConfig;

        @NameInMap("NodeContent")
        private String nodeContent;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("NodeName")
        private String nodeName;

        @NameInMap("NodeOutput")
        private String nodeOutput;

        @NameInMap("NodeType")
        private String nodeType;

        @NameInMap("TimeVariables")
        private String timeVariables;

        private Task(Builder builder) {
            this.graphParam = builder.graphParam;
            this.nodeConfig = builder.nodeConfig;
            this.nodeContent = builder.nodeContent;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.nodeOutput = builder.nodeOutput;
            this.nodeType = builder.nodeType;
            this.timeVariables = builder.timeVariables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return graphParam
         */
        public String getGraphParam() {
            return this.graphParam;
        }

        /**
         * @return nodeConfig
         */
        public String getNodeConfig() {
            return this.nodeConfig;
        }

        /**
         * @return nodeContent
         */
        public String getNodeContent() {
            return this.nodeContent;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeOutput
         */
        public String getNodeOutput() {
            return this.nodeOutput;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return timeVariables
         */
        public String getTimeVariables() {
            return this.timeVariables;
        }

        public static final class Builder {
            private String graphParam; 
            private String nodeConfig; 
            private String nodeContent; 
            private String nodeId; 
            private String nodeName; 
            private String nodeOutput; 
            private String nodeType; 
            private String timeVariables; 

            /**
             * GraphParam.
             */
            public Builder graphParam(String graphParam) {
                this.graphParam = graphParam;
                return this;
            }

            /**
             * The ID of the request. You can use the ID to locate logs and troubleshoot issues.
             */
            public Builder nodeConfig(String nodeConfig) {
                this.nodeConfig = nodeConfig;
                return this;
            }

            /**
             * The time variables configured for the node.
             */
            public Builder nodeContent(String nodeContent) {
                this.nodeContent = nodeContent;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The ID of the tenant.
             * <p>
             * 
             * >  To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see [View information about the current tenant](~~181330~~).
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * NodeOutput.
             */
            public Builder nodeOutput(String nodeOutput) {
                this.nodeOutput = nodeOutput;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * The configuration for the node.
             */
            public Builder timeVariables(String timeVariables) {
                this.timeVariables = timeVariables;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
    public static class Tasks extends TeaModel {
        @NameInMap("Task")
        private java.util.List < Task> task;

        private Tasks(Builder builder) {
            this.task = builder.task;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return task
         */
        public java.util.List < Task> getTask() {
            return this.task;
        }

        public static final class Builder {
            private java.util.List < Task> task; 

            /**
             * Task.
             */
            public Builder task(java.util.List < Task> task) {
                this.task = task;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
