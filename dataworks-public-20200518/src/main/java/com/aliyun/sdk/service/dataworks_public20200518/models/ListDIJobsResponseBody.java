// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDIJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDIJobsResponseBody</p>
 */
public class ListDIJobsResponseBody extends TeaModel {
    @NameInMap("DIJobPaging")
    private DIJobPaging DIJobPaging;

    @NameInMap("RequestId")
    private String requestId;

    private ListDIJobsResponseBody(Builder builder) {
        this.DIJobPaging = builder.DIJobPaging;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDIJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return DIJobPaging
     */
    public DIJobPaging getDIJobPaging() {
        return this.DIJobPaging;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DIJobPaging DIJobPaging; 
        private String requestId; 

        /**
         * DIJobPaging.
         */
        public Builder DIJobPaging(DIJobPaging DIJobPaging) {
            this.DIJobPaging = DIJobPaging;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDIJobsResponseBody build() {
            return new ListDIJobsResponseBody(this);
        } 

    } 

    public static class DIJobs extends TeaModel {
        @NameInMap("DIJobId")
        private Long DIJobId;

        @NameInMap("DestinationDataSourceType")
        private String destinationDataSourceType;

        @NameInMap("JobName")
        private String jobName;

        @NameInMap("JobStatus")
        private String jobStatus;

        @NameInMap("MigrationType")
        private String migrationType;

        @NameInMap("ProjectId")
        private Long projectId;

        @NameInMap("SourceDataSourceType")
        private String sourceDataSourceType;

        private DIJobs(Builder builder) {
            this.DIJobId = builder.DIJobId;
            this.destinationDataSourceType = builder.destinationDataSourceType;
            this.jobName = builder.jobName;
            this.jobStatus = builder.jobStatus;
            this.migrationType = builder.migrationType;
            this.projectId = builder.projectId;
            this.sourceDataSourceType = builder.sourceDataSourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DIJobs create() {
            return builder().build();
        }

        /**
         * @return DIJobId
         */
        public Long getDIJobId() {
            return this.DIJobId;
        }

        /**
         * @return destinationDataSourceType
         */
        public String getDestinationDataSourceType() {
            return this.destinationDataSourceType;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return jobStatus
         */
        public String getJobStatus() {
            return this.jobStatus;
        }

        /**
         * @return migrationType
         */
        public String getMigrationType() {
            return this.migrationType;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return sourceDataSourceType
         */
        public String getSourceDataSourceType() {
            return this.sourceDataSourceType;
        }

        public static final class Builder {
            private Long DIJobId; 
            private String destinationDataSourceType; 
            private String jobName; 
            private String jobStatus; 
            private String migrationType; 
            private Long projectId; 
            private String sourceDataSourceType; 

            /**
             * DIJobId.
             */
            public Builder DIJobId(Long DIJobId) {
                this.DIJobId = DIJobId;
                return this;
            }

            /**
             * DestinationDataSourceType.
             */
            public Builder destinationDataSourceType(String destinationDataSourceType) {
                this.destinationDataSourceType = destinationDataSourceType;
                return this;
            }

            /**
             * JobName.
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * JobStatus.
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * MigrationType.
             */
            public Builder migrationType(String migrationType) {
                this.migrationType = migrationType;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * SourceDataSourceType.
             */
            public Builder sourceDataSourceType(String sourceDataSourceType) {
                this.sourceDataSourceType = sourceDataSourceType;
                return this;
            }

            public DIJobs build() {
                return new DIJobs(this);
            } 

        } 

    }
    public static class DIJobPaging extends TeaModel {
        @NameInMap("DIJobs")
        private java.util.List < DIJobs> DIJobs;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private DIJobPaging(Builder builder) {
            this.DIJobs = builder.DIJobs;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DIJobPaging create() {
            return builder().build();
        }

        /**
         * @return DIJobs
         */
        public java.util.List < DIJobs> getDIJobs() {
            return this.DIJobs;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < DIJobs> DIJobs; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * DIJobs.
             */
            public Builder DIJobs(java.util.List < DIJobs> DIJobs) {
                this.DIJobs = DIJobs;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public DIJobPaging build() {
                return new DIJobPaging(this);
            } 

        } 

    }
}
