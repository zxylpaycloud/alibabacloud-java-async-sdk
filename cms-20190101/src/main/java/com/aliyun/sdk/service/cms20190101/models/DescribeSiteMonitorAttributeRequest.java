// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSiteMonitorAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribeSiteMonitorAttributeRequest</p>
 */
public class DescribeSiteMonitorAttributeRequest extends Request {
    @Query
    @NameInMap("IncludeAlert")
    private Boolean includeAlert;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private DescribeSiteMonitorAttributeRequest(Builder builder) {
        super(builder);
        this.includeAlert = builder.includeAlert;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSiteMonitorAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return includeAlert
     */
    public Boolean getIncludeAlert() {
        return this.includeAlert;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeSiteMonitorAttributeRequest, Builder> {
        private Boolean includeAlert; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSiteMonitorAttributeRequest request) {
            super(request);
            this.includeAlert = request.includeAlert;
            this.taskId = request.taskId;
        } 

        /**
         * Specifies whether to return the information of the alert rules that are configured for the site monitoring task. Valid values:
         * <p>
         * 
         * *   true: The system returns the information of the alert rules that are configured for the site monitoring task.
         * *   false (default): The system does not return the information of the alert rules that are configured for the site monitoring task.
         */
        public Builder includeAlert(Boolean includeAlert) {
            this.putQueryParameter("IncludeAlert", includeAlert);
            this.includeAlert = includeAlert;
            return this;
        }

        /**
         * The ID of the site monitoring task.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeSiteMonitorAttributeRequest build() {
            return new DescribeSiteMonitorAttributeRequest(this);
        } 

    } 

}
