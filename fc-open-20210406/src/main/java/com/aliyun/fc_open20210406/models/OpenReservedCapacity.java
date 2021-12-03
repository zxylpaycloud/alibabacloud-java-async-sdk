// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link OpenReservedCapacity} extends {@link TeaModel}
 *
 * <p>OpenReservedCapacity</p>
 */
public class OpenReservedCapacity extends TeaModel {
    @NameInMap("createdTime")
    private String createdTime;

    @NameInMap("cu")
    private Long cu;

    @NameInMap("deadline")
    private String deadline;

    @NameInMap("instanceId")
    private String instanceId;

    @NameInMap("isRefunded")
    private String isRefunded;

    @NameInMap("lastModifiedTime")
    private String lastModifiedTime;


    private OpenReservedCapacity(Builder builder) {
        this.createdTime = builder.createdTime;
        this.cu = builder.cu;
        this.deadline = builder.deadline;
        this.instanceId = builder.instanceId;
        this.isRefunded = builder.isRefunded;
        this.lastModifiedTime = builder.lastModifiedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenReservedCapacity create() {
        return builder().build();
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return cu
     */
    public Long getCu() {
        return this.cu;
    }

    /**
     * @return deadline
     */
    public String getDeadline() {
        return this.deadline;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isRefunded
     */
    public String getIsRefunded() {
        return this.isRefunded;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public static final class Builder {
        private String createdTime; 
        private Long cu; 
        private String deadline; 
        private String instanceId; 
        private String isRefunded; 
        private String lastModifiedTime; 

        /**
         * <p>createdTime</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>cu</p>
         */
        public Builder cu(Long cu) {
            this.cu = cu;
            return this;
        }

        /**
         * <p>deadline</p>
         */
        public Builder deadline(String deadline) {
            this.deadline = deadline;
            return this;
        }

        /**
         * <p>instanceId</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>isRefunded</p>
         */
        public Builder isRefunded(String isRefunded) {
            this.isRefunded = isRefunded;
            return this;
        }

        /**
         * <p>lastModifiedTime</p>
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        public OpenReservedCapacity build() {
            return new OpenReservedCapacity(this);
        } 

    } 

}
