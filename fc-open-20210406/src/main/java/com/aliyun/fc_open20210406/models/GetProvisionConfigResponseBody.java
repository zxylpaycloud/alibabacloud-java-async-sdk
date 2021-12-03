// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetProvisionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetProvisionConfigResponseBody</p>
 */
public class GetProvisionConfigResponseBody extends TeaModel {
    @NameInMap("current")
    private Long current;

    @NameInMap("currentError")
    private String currentError;

    @NameInMap("resource")
    private String resource;

    @NameInMap("scheduledActions")
    private java.util.List < ScheduledActions > scheduledActions;

    @NameInMap("target")
    private Long target;

    @NameInMap("targetTrackingPolicies")
    private java.util.List < TargetTrackingPolicies > targetTrackingPolicies;


    private GetProvisionConfigResponseBody(Builder builder) {
        this.current = builder.current;
        this.currentError = builder.currentError;
        this.resource = builder.resource;
        this.scheduledActions = builder.scheduledActions;
        this.target = builder.target;
        this.targetTrackingPolicies = builder.targetTrackingPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProvisionConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return current
     */
    public Long getCurrent() {
        return this.current;
    }

    /**
     * @return currentError
     */
    public String getCurrentError() {
        return this.currentError;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * @return scheduledActions
     */
    public java.util.List < ScheduledActions > getScheduledActions() {
        return this.scheduledActions;
    }

    /**
     * @return target
     */
    public Long getTarget() {
        return this.target;
    }

    /**
     * @return targetTrackingPolicies
     */
    public java.util.List < TargetTrackingPolicies > getTargetTrackingPolicies() {
        return this.targetTrackingPolicies;
    }

    public static final class Builder {
        private Long current; 
        private String currentError; 
        private String resource; 
        private java.util.List < ScheduledActions > scheduledActions; 
        private Long target; 
        private java.util.List < TargetTrackingPolicies > targetTrackingPolicies; 

        /**
         * <p>实际资源个数</p>
         */
        public Builder current(Long current) {
            this.current = current;
            return this;
        }

        /**
         * <p>预留实例创建失败时的错误信息</p>
         */
        public Builder currentError(String currentError) {
            this.currentError = currentError;
            return this;
        }

        /**
         * <p>资源描述</p>
         */
        public Builder resource(String resource) {
            this.resource = resource;
            return this;
        }

        /**
         * <p>定时策略配置</p>
         */
        public Builder scheduledActions(java.util.List < ScheduledActions > scheduledActions) {
            this.scheduledActions = scheduledActions;
            return this;
        }

        /**
         * <p>目标资源个数</p>
         */
        public Builder target(Long target) {
            this.target = target;
            return this;
        }

        /**
         * <p>指标追踪伸缩策略配置</p>
         */
        public Builder targetTrackingPolicies(java.util.List < TargetTrackingPolicies > targetTrackingPolicies) {
            this.targetTrackingPolicies = targetTrackingPolicies;
            return this;
        }

        public GetProvisionConfigResponseBody build() {
            return new GetProvisionConfigResponseBody(this);
        } 

    } 

}
