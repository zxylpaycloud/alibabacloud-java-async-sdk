// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserExecutionLogsRequest} extends {@link RequestModel}
 *
 * <p>ListUserExecutionLogsRequest</p>
 */
public class ListUserExecutionLogsRequest extends Request {
    @Query
    @NameInMap("AliUid")
    @Validation(required = true)
    private String aliUid;

    @Query
    @NameInMap("ExecutionId")
    @Validation(required = true)
    private String executionId;

    @Query
    @NameInMap("LogType")
    private String logType;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TaskExecutionId")
    private String taskExecutionId;

    private ListUserExecutionLogsRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.executionId = builder.executionId;
        this.logType = builder.logType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.taskExecutionId = builder.taskExecutionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserExecutionLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
    }

    /**
     * @return executionId
     */
    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * @return logType
     */
    public String getLogType() {
        return this.logType;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return taskExecutionId
     */
    public String getTaskExecutionId() {
        return this.taskExecutionId;
    }

    public static final class Builder extends Request.Builder<ListUserExecutionLogsRequest, Builder> {
        private String aliUid; 
        private String executionId; 
        private String logType; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String taskExecutionId; 

        private Builder() {
            super();
        } 

        private Builder(ListUserExecutionLogsRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.executionId = request.executionId;
            this.logType = request.logType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.taskExecutionId = request.taskExecutionId;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(String aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * ExecutionId.
         */
        public Builder executionId(String executionId) {
            this.putQueryParameter("ExecutionId", executionId);
            this.executionId = executionId;
            return this;
        }

        /**
         * LogType.
         */
        public Builder logType(String logType) {
            this.putQueryParameter("LogType", logType);
            this.logType = logType;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TaskExecutionId.
         */
        public Builder taskExecutionId(String taskExecutionId) {
            this.putQueryParameter("TaskExecutionId", taskExecutionId);
            this.taskExecutionId = taskExecutionId;
            return this;
        }

        @Override
        public ListUserExecutionLogsRequest build() {
            return new ListUserExecutionLogsRequest(this);
        } 

    } 

}
