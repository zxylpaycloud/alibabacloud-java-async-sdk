// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBenchmarkTaskReportRequest} extends {@link RequestModel}
 *
 * <p>DescribeBenchmarkTaskReportRequest</p>
 */
public class DescribeBenchmarkTaskReportRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportType")
    private String reportType;

    private DescribeBenchmarkTaskReportRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.taskName = builder.taskName;
        this.reportType = builder.reportType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBenchmarkTaskReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return reportType
     */
    public String getReportType() {
        return this.reportType;
    }

    public static final class Builder extends Request.Builder<DescribeBenchmarkTaskReportRequest, Builder> {
        private String clusterId; 
        private String taskName; 
        private String reportType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBenchmarkTaskReportRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.taskName = request.taskName;
            this.reportType = request.reportType;
        } 

        /**
         * The ID of the region where the stress testing task is performed.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The name of the stress testing task. For more information about how to query the name of a stress testing task, see [ListBenchmarkTask](~~432976~~).
         */
        public Builder taskName(String taskName) {
            this.putPathParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * The report type of the stress testing task. Valid values: RAW and Report.
         */
        public Builder reportType(String reportType) {
            this.putQueryParameter("ReportType", reportType);
            this.reportType = reportType;
            return this;
        }

        @Override
        public DescribeBenchmarkTaskReportRequest build() {
            return new DescribeBenchmarkTaskReportRequest(this);
        } 

    } 

}
