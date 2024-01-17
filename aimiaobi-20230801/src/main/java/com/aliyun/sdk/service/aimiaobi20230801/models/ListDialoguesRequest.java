// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDialoguesRequest} extends {@link RequestModel}
 *
 * <p>ListDialoguesRequest</p>
 */
public class ListDialoguesRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Body
    @NameInMap("Current")
    private Integer current;

    @Body
    @NameInMap("DialogueType")
    private Integer dialogueType;

    @Body
    @NameInMap("EndTime")
    private String endTime;

    @Body
    @NameInMap("Size")
    private Integer size;

    @Body
    @NameInMap("StartTime")
    private String startTime;

    @Body
    @NameInMap("TaskId")
    @Validation(maxLength = 64, minLength = 6)
    private String taskId;

    private ListDialoguesRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.current = builder.current;
        this.dialogueType = builder.dialogueType;
        this.endTime = builder.endTime;
        this.size = builder.size;
        this.startTime = builder.startTime;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDialoguesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return dialogueType
     */
    public Integer getDialogueType() {
        return this.dialogueType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<ListDialoguesRequest, Builder> {
        private String agentKey; 
        private Integer current; 
        private Integer dialogueType; 
        private String endTime; 
        private Integer size; 
        private String startTime; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(ListDialoguesRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.current = request.current;
            this.dialogueType = request.dialogueType;
            this.endTime = request.endTime;
            this.size = request.size;
            this.startTime = request.startTime;
            this.taskId = request.taskId;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * Current.
         */
        public Builder current(Integer current) {
            this.putBodyParameter("Current", current);
            this.current = current;
            return this;
        }

        /**
         * DialogueType.
         */
        public Builder dialogueType(Integer dialogueType) {
            this.putBodyParameter("DialogueType", dialogueType);
            this.dialogueType = dialogueType;
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
         * Size.
         */
        public Builder size(Integer size) {
            this.putBodyParameter("Size", size);
            this.size = size;
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
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ListDialoguesRequest build() {
            return new ListDialoguesRequest(this);
        } 

    } 

}
