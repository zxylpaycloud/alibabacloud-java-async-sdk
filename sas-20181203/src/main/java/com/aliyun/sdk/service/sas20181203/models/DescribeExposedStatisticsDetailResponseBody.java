// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExposedStatisticsDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExposedStatisticsDetailResponseBody</p>
 */
public class DescribeExposedStatisticsDetailResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StatisticsDetails")
    private java.util.List < StatisticsDetails> statisticsDetails;

    private DescribeExposedStatisticsDetailResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.statisticsDetails = builder.statisticsDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExposedStatisticsDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statisticsDetails
     */
    public java.util.List < StatisticsDetails> getStatisticsDetails() {
        return this.statisticsDetails;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List < StatisticsDetails> statisticsDetails; 

        /**
         * The number of the page to return.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The resource from which the asset is exposed. Valid values:
         * <p>
         * 
         * *   **INTERNET_IP**: the IP address of the Elastic Compute Service (ECS) instance
         * *   **SLB**: the public IP address of the SLB instance
         * *   **EIP**: the elastic IP address (EIP)
         * *   **DNAT**: the NAT gateway that connects to the Internet by using the DNAT feature
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The region ID of the asset.
         */
        public Builder statisticsDetails(java.util.List < StatisticsDetails> statisticsDetails) {
            this.statisticsDetails = statisticsDetails;
            return this;
        }

        public DescribeExposedStatisticsDetailResponseBody build() {
            return new DescribeExposedStatisticsDetailResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * An array consisting of the gateway assets, ports, system components, or public IP addresses that are exposed on the Internet and are returned.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * exposureType
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The port that is exposed on the Internet.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * lb-2ze4rso39h4nczcqs****
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    public static class StatisticsDetails extends TeaModel {
        @NameInMap("ExposedCount")
        private Integer exposedCount;

        @NameInMap("ExposureComponent")
        private String exposureComponent;

        @NameInMap("ExposureIp")
        private String exposureIp;

        @NameInMap("ExposurePort")
        private String exposurePort;

        @NameInMap("ExposureType")
        private String exposureType;

        @NameInMap("ExposureTypeId")
        private String exposureTypeId;

        @NameInMap("ExposureTypeInstanceName")
        private String exposureTypeInstanceName;

        @NameInMap("RegionId")
        private String regionId;

        private StatisticsDetails(Builder builder) {
            this.exposedCount = builder.exposedCount;
            this.exposureComponent = builder.exposureComponent;
            this.exposureIp = builder.exposureIp;
            this.exposurePort = builder.exposurePort;
            this.exposureType = builder.exposureType;
            this.exposureTypeId = builder.exposureTypeId;
            this.exposureTypeInstanceName = builder.exposureTypeInstanceName;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatisticsDetails create() {
            return builder().build();
        }

        /**
         * @return exposedCount
         */
        public Integer getExposedCount() {
            return this.exposedCount;
        }

        /**
         * @return exposureComponent
         */
        public String getExposureComponent() {
            return this.exposureComponent;
        }

        /**
         * @return exposureIp
         */
        public String getExposureIp() {
            return this.exposureIp;
        }

        /**
         * @return exposurePort
         */
        public String getExposurePort() {
            return this.exposurePort;
        }

        /**
         * @return exposureType
         */
        public String getExposureType() {
            return this.exposureType;
        }

        /**
         * @return exposureTypeId
         */
        public String getExposureTypeId() {
            return this.exposureTypeId;
        }

        /**
         * @return exposureTypeInstanceName
         */
        public String getExposureTypeInstanceName() {
            return this.exposureTypeInstanceName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private Integer exposedCount; 
            private String exposureComponent; 
            private String exposureIp; 
            private String exposurePort; 
            private String exposureType; 
            private String exposureTypeId; 
            private String exposureTypeInstanceName; 
            private String regionId; 

            /**
             * The total number of system vulnerabilities that are detected on your server and are exposed on the Internet.
             */
            public Builder exposedCount(Integer exposedCount) {
                this.exposedCount = exposedCount;
                return this;
            }

            /**
             * Queries the gateway assets, ports, system components, or public IP addresses that are exposed on the Internet.
             */
            public Builder exposureComponent(String exposureComponent) {
                this.exposureComponent = exposureComponent;
                return this;
            }

            /**
             * The type of the gateway asset. This parameter is required when the **StatisticsType** parameter is set to **exposureType**. Valid values:
             * <p>
             * 
             * *   **SLB**: the public IP address of a Server Load Balancer (SLB) instance
             * *   **DNAT**: the NAT gateway that connects to the Internet by using the DNAT feature
             */
            public Builder exposureIp(String exposureIp) {
                this.exposureIp = exposureIp;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder exposurePort(String exposurePort) {
                this.exposurePort = exposurePort;
                return this;
            }

            /**
             * The ID of the request, which is used to locate and troubleshoot issues.
             */
            public Builder exposureType(String exposureType) {
                this.exposureType = exposureType;
                return this;
            }

            /**
             * DescribeExposedStatisticsDetail
             */
            public Builder exposureTypeId(String exposureTypeId) {
                this.exposureTypeId = exposureTypeId;
                return this;
            }

            /**
             * The name of the gateway asset that is exposed on the Internet.
             */
            public Builder exposureTypeInstanceName(String exposureTypeInstanceName) {
                this.exposureTypeInstanceName = exposureTypeInstanceName;
                return this;
            }

            /**
             * 20
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public StatisticsDetails build() {
                return new StatisticsDetails(this);
            } 

        } 

    }
}
