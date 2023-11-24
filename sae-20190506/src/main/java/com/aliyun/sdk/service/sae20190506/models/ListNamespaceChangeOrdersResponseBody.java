// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNamespaceChangeOrdersResponseBody} extends {@link TeaModel}
 *
 * <p>ListNamespaceChangeOrdersResponseBody</p>
 */
public class ListNamespaceChangeOrdersResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TraceId")
    private String traceId;

    private ListNamespaceChangeOrdersResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNamespaceChangeOrdersResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * The HTTP status code. Valid values:
         * <p>
         * 
         * *   **2xx**: indicates that the request was successful.
         * *   **3xx**: indicates that the request was redirected.
         * *   **4xx**: indicates that the request was invalid.
         * *   **5xx**: indicates that a server error occurred.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code.
         * <p>
         * 
         * *   The **ErrorCode** parameter is not returned when the request succeeds.
         * *   The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the list of change orders was obtained. Valid values:
         * <p>
         * 
         * *   **true**: indicates that the list was obtained.
         * *   **false**: indicates that the list could not be obtained.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The ID of the trace. It is used to query the details of a request.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public ListNamespaceChangeOrdersResponseBody build() {
            return new ListNamespaceChangeOrdersResponseBody(this);
        } 

    } 

    public static class ChangeOrderList extends TeaModel {
        @NameInMap("BatchCount")
        private Integer batchCount;

        @NameInMap("BatchType")
        private String batchType;

        @NameInMap("ChangeOrderId")
        private String changeOrderId;

        @NameInMap("CoType")
        private String coType;

        @NameInMap("CoTypeCode")
        private String coTypeCode;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateUserId")
        private String createUserId;

        @NameInMap("Description")
        private String description;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("NamespaceId")
        private String namespaceId;

        @NameInMap("Pipelines")
        private String pipelines;

        @NameInMap("Source")
        private String source;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("UserId")
        private String userId;

        private ChangeOrderList(Builder builder) {
            this.batchCount = builder.batchCount;
            this.batchType = builder.batchType;
            this.changeOrderId = builder.changeOrderId;
            this.coType = builder.coType;
            this.coTypeCode = builder.coTypeCode;
            this.createTime = builder.createTime;
            this.createUserId = builder.createUserId;
            this.description = builder.description;
            this.finishTime = builder.finishTime;
            this.groupId = builder.groupId;
            this.namespaceId = builder.namespaceId;
            this.pipelines = builder.pipelines;
            this.source = builder.source;
            this.status = builder.status;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeOrderList create() {
            return builder().build();
        }

        /**
         * @return batchCount
         */
        public Integer getBatchCount() {
            return this.batchCount;
        }

        /**
         * @return batchType
         */
        public String getBatchType() {
            return this.batchType;
        }

        /**
         * @return changeOrderId
         */
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        /**
         * @return coType
         */
        public String getCoType() {
            return this.coType;
        }

        /**
         * @return coTypeCode
         */
        public String getCoTypeCode() {
            return this.coTypeCode;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUserId
         */
        public String getCreateUserId() {
            return this.createUserId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return pipelines
         */
        public String getPipelines() {
            return this.pipelines;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Integer batchCount; 
            private String batchType; 
            private String changeOrderId; 
            private String coType; 
            private String coTypeCode; 
            private String createTime; 
            private String createUserId; 
            private String description; 
            private String finishTime; 
            private String groupId; 
            private String namespaceId; 
            private String pipelines; 
            private String source; 
            private Integer status; 
            private String userId; 

            /**
             * The number of release batches.
             */
            public Builder batchCount(Integer batchCount) {
                this.batchCount = batchCount;
                return this;
            }

            /**
             * The mode in which the release batches are determined. Valid values:
             * <p>
             * 
             * *   **auto**: SAE automatically determines the release batches.
             * *   **manual**: You must manually determine the release batches.
             */
            public Builder batchType(String batchType) {
                this.batchType = batchType;
                return this;
            }

            /**
             * The ID of the change order.
             */
            public Builder changeOrderId(String changeOrderId) {
                this.changeOrderId = changeOrderId;
                return this;
            }

            /**
             * The type of the change order, which corresponds the **CoTypeCode** parameter.
             */
            public Builder coType(String coType) {
                this.coType = coType;
                return this;
            }

            /**
             * The code of the change order type. Valid values:
             * <p>
             * 
             * *   **CoBatchStartApplication**: starts multiple applications concurrently.
             * *   **CoBatchStopApplication**: stops multiple applications concurrently.
             */
            public Builder coTypeCode(String coTypeCode) {
                this.coTypeCode = coTypeCode;
                return this;
            }

            /**
             * The time when the change order was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the user who created the change order.
             */
            public Builder createUserId(String createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * The description of the change order.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the change order was completed.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The ID of the group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The ID of the namespace.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * The information about release batches.
             */
            public Builder pipelines(String pipelines) {
                this.pipelines = pipelines;
                return this;
            }

            /**
             * The source of the change order.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The status of the change order. Valid values:
             * <p>
             * 
             * *   **0**: The change order is being prepared.
             * *   **1**: The change order is being executed.
             * *   **2**: The change order was executed.
             * *   **3**: The change order could not be executed.
             * *   **6**: The change order was terminated.
             * *   **10**: The change order could not be executed due to a system exception.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ChangeOrderList build() {
                return new ChangeOrderList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ChangeOrderList")
        private java.util.List < ChangeOrderList> changeOrderList;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.changeOrderList = builder.changeOrderList;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return changeOrderList
         */
        public java.util.List < ChangeOrderList> getChangeOrderList() {
            return this.changeOrderList;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private java.util.List < ChangeOrderList> changeOrderList; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalSize; 

            /**
             * The list of change orders.
             */
            public Builder changeOrderList(java.util.List < ChangeOrderList> changeOrderList) {
                this.changeOrderList = changeOrderList;
                return this;
            }

            /**
             * The number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned on each page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of change orders.
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
