// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAutonomousNotifyEventsInRangeRequest} extends {@link RequestModel}
 *
 * <p>GetAutonomousNotifyEventsInRangeRequest</p>
 */
public class GetAutonomousNotifyEventsInRangeRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("EventContext")
    private String eventContext;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Level")
    private String level;

    @Query
    @NameInMap("MinLevel")
    private String minLevel;

    @Query
    @NameInMap("NodeId")
    private String nodeId;

    @Query
    @NameInMap("PageOffset")
    private String pageOffset;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("__context")
    private String context;

    private GetAutonomousNotifyEventsInRangeRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.eventContext = builder.eventContext;
        this.instanceId = builder.instanceId;
        this.level = builder.level;
        this.minLevel = builder.minLevel;
        this.nodeId = builder.nodeId;
        this.pageOffset = builder.pageOffset;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
        this.context = builder.context;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutonomousNotifyEventsInRangeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return eventContext
     */
    public String getEventContext() {
        return this.eventContext;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return minLevel
     */
    public String getMinLevel() {
        return this.minLevel;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return pageOffset
     */
    public String getPageOffset() {
        return this.pageOffset;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return context
     */
    public String getContext() {
        return this.context;
    }

    public static final class Builder extends Request.Builder<GetAutonomousNotifyEventsInRangeRequest, Builder> {
        private String endTime; 
        private String eventContext; 
        private String instanceId; 
        private String level; 
        private String minLevel; 
        private String nodeId; 
        private String pageOffset; 
        private String pageSize; 
        private String startTime; 
        private String context; 

        private Builder() {
            super();
        } 

        private Builder(GetAutonomousNotifyEventsInRangeRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.eventContext = request.eventContext;
            this.instanceId = request.instanceId;
            this.level = request.level;
            this.minLevel = request.minLevel;
            this.nodeId = request.nodeId;
            this.pageOffset = request.pageOffset;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
            this.context = request.context;
        } 

        /**
         * The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * <p>
         * 
         * >  The end time must be later than the start time.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The reserved parameter.
         */
        public Builder eventContext(String eventContext) {
            this.putQueryParameter("EventContext", eventContext);
            this.eventContext = eventContext;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The urgency level of the events. If you specify this parameter, the MinLevel parameter does not take effect. Valid values:
         * <p>
         * 
         * *   **Notice**: events for which the system sends notifications.
         * *   **Optimization**: events that need to be optimized.
         * *   **Warn**: events for which the system sends warnings.
         * *   **Critical**: critical events.
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * The minimum urgency level of the events. Valid values:
         * <p>
         * 
         * *   **Notice**: events for which the system sends notifications.
         * *   **Optimization**: events that need to be optimized.
         * *   **Warn**: events for which the system sends warnings.
         * *   **Critical**: critical events.
         */
        public Builder minLevel(String minLevel) {
            this.putQueryParameter("MinLevel", minLevel);
            this.minLevel = minLevel;
            return this;
        }

        /**
         * The ID of the node in a PolarDB for MySQL cluster. You can call the [DescribeDBClusters](~~98094~~) operation to query the node ID returned by the DBNodeId response parameter.
         * <p>
         * 
         * >  You must specify the node ID if your database instance is a PolarDB for MySQL cluster.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The page number. The value must be a positive integer. Default value: 1.
         */
        public Builder pageOffset(String pageOffset) {
            this.putQueryParameter("PageOffset", pageOffset);
            this.pageOffset = pageOffset;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The reserved parameter.
         */
        public Builder context(String context) {
            this.putQueryParameter("__context", context);
            this.context = context;
            return this;
        }

        @Override
        public GetAutonomousNotifyEventsInRangeRequest build() {
            return new GetAutonomousNotifyEventsInRangeRequest(this);
        } 

    } 

}
