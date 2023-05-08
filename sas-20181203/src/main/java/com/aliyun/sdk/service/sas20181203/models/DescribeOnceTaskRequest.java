// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOnceTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeOnceTaskRequest</p>
 */
public class DescribeOnceTaskRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("EndTimeQuery")
    private Long endTimeQuery;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RootTaskId")
    private String rootTaskId;

    @Query
    @NameInMap("StartTimeQuery")
    private Long startTimeQuery;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    @Query
    @NameInMap("TaskType")
    private String taskType;

    private DescribeOnceTaskRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.endTimeQuery = builder.endTimeQuery;
        this.pageSize = builder.pageSize;
        this.rootTaskId = builder.rootTaskId;
        this.startTimeQuery = builder.startTimeQuery;
        this.taskId = builder.taskId;
        this.taskType = builder.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOnceTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTimeQuery
     */
    public Long getEndTimeQuery() {
        return this.endTimeQuery;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return rootTaskId
     */
    public String getRootTaskId() {
        return this.rootTaskId;
    }

    /**
     * @return startTimeQuery
     */
    public Long getStartTimeQuery() {
        return this.startTimeQuery;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    public static final class Builder extends Request.Builder<DescribeOnceTaskRequest, Builder> {
        private Integer currentPage; 
        private Long endTimeQuery; 
        private Integer pageSize; 
        private String rootTaskId; 
        private Long startTimeQuery; 
        private String taskId; 
        private String taskType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeOnceTaskRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.endTimeQuery = request.endTimeQuery;
            this.pageSize = request.pageSize;
            this.rootTaskId = request.rootTaskId;
            this.startTimeQuery = request.startTimeQuery;
            this.taskId = request.taskId;
            this.taskType = request.taskType;
        } 

        /**
         * The pagination information.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder endTimeQuery(Long endTimeQuery) {
            this.putQueryParameter("EndTimeQuery", endTimeQuery);
            this.endTimeQuery = endTimeQuery;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the task.
         */
        public Builder rootTaskId(String rootTaskId) {
            this.putQueryParameter("RootTaskId", rootTaskId);
            this.rootTaskId = rootTaskId;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder startTimeQuery(Long startTimeQuery) {
            this.putQueryParameter("StartTimeQuery", startTimeQuery);
            this.startTimeQuery = startTimeQuery;
            return this;
        }

        /**
         * The number of entries returned per page. Default value: **20**.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **20**.
         */
        public Builder taskType(String taskType) {
            this.putQueryParameter("TaskType", taskType);
            this.taskType = taskType;
            return this;
        }

        @Override
        public DescribeOnceTaskRequest build() {
            return new DescribeOnceTaskRequest(this);
        } 

    } 

}
