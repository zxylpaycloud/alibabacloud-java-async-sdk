// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulTargetStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulTargetStatisticsResponseBody</p>
 */
public class DescribeVulTargetStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TargetStats")
    private java.util.List < TargetStats> targetStats;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeVulTargetStatisticsResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.targetStats = builder.targetStats;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulTargetStatisticsResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return targetStats
     */
    public java.util.List < TargetStats> getTargetStats() {
        return this.targetStats;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < TargetStats> targetStats; 
        private Integer totalCount; 

        /**
         * The page number.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * An array that consists of the configurations of the vulnerability scan feature.
         */
        public Builder targetStats(java.util.List < TargetStats> targetStats) {
            this.targetStats = targetStats;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeVulTargetStatisticsResponseBody build() {
            return new DescribeVulTargetStatisticsResponseBody(this);
        } 

    } 

    public static class Targets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Flag")
        private String flag;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        private Targets(Builder builder) {
            this.flag = builder.flag;
            this.target = builder.target;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Targets create() {
            return builder().build();
        }

        /**
         * @return flag
         */
        public String getFlag() {
            return this.flag;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String flag; 
            private String target; 
            private String targetType; 

            /**
             * Indicates whether the configurations are applied to the server. Valid values:
             * <p>
             * 
             * *   **add**: yes
             * *   **del**: no
             */
            public Builder flag(String flag) {
                this.flag = flag;
                return this;
            }

            /**
             * The group ID or UUID of the server to which the configurations are applied.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * The condition by which the configurations are applied to the server. Valid values:
             * <p>
             * 
             * *   **uuid**: the UUID of the server
             * *   **groupId**: the ID of the server group
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public Targets build() {
                return new Targets(this);
            } 

        } 

    }
    public static class TargetStats extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Targets")
        private java.util.List < Targets> targets;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("UuidCount")
        private Integer uuidCount;

        @com.aliyun.core.annotation.NameInMap("VulType")
        private String vulType;

        private TargetStats(Builder builder) {
            this.targets = builder.targets;
            this.totalCount = builder.totalCount;
            this.uuidCount = builder.uuidCount;
            this.vulType = builder.vulType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetStats create() {
            return builder().build();
        }

        /**
         * @return targets
         */
        public java.util.List < Targets> getTargets() {
            return this.targets;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return uuidCount
         */
        public Integer getUuidCount() {
            return this.uuidCount;
        }

        /**
         * @return vulType
         */
        public String getVulType() {
            return this.vulType;
        }

        public static final class Builder {
            private java.util.List < Targets> targets; 
            private Integer totalCount; 
            private Integer uuidCount; 
            private String vulType; 

            /**
             * An array that consists of available servers.
             */
            public Builder targets(java.util.List < Targets> targets) {
                this.targets = targets;
                return this;
            }

            /**
             * The total number of servers.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * The number of servers to which the configurations are applied.
             */
            public Builder uuidCount(Integer uuidCount) {
                this.uuidCount = uuidCount;
                return this;
            }

            /**
             * The type of the vulnerability. Valid values:
             * <p>
             * 
             * *   cve: Linux software vulnerabilities
             * *   sys: Windows system vulnerabilities
             * *   cms: Web-CMS vulnerabilities
             * *   emg: urgent vulnerabilities
             */
            public Builder vulType(String vulType) {
                this.vulType = vulType;
                return this;
            }

            public TargetStats build() {
                return new TargetStats(this);
            } 

        } 

    }
}
