// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCenRegionDomainRouteEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCenRegionDomainRouteEntriesResponseBody</p>
 */
public class DescribeCenRegionDomainRouteEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CenRouteEntries")
    private CenRouteEntries cenRouteEntries;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCenRegionDomainRouteEntriesResponseBody(Builder builder) {
        this.cenRouteEntries = builder.cenRouteEntries;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCenRegionDomainRouteEntriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return cenRouteEntries
     */
    public CenRouteEntries getCenRouteEntries() {
        return this.cenRouteEntries;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private CenRouteEntries cenRouteEntries; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * A list of route entries.
         */
        public Builder cenRouteEntries(CenRouteEntries cenRouteEntries) {
            this.cenRouteEntries = cenRouteEntries;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCenRegionDomainRouteEntriesResponseBody build() {
            return new DescribeCenRegionDomainRouteEntriesResponseBody(this);
        } 

    } 

    public static class AsPaths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsPath")
        private java.util.List < String > asPath;

        private AsPaths(Builder builder) {
            this.asPath = builder.asPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AsPaths create() {
            return builder().build();
        }

        /**
         * @return asPath
         */
        public java.util.List < String > getAsPath() {
            return this.asPath;
        }

        public static final class Builder {
            private java.util.List < String > asPath; 

            /**
             * AsPath.
             */
            public Builder asPath(java.util.List < String > asPath) {
                this.asPath = asPath;
                return this;
            }

            public AsPaths build() {
                return new AsPaths(this);
            } 

        } 

    }
    public static class CenOutRouteMapRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RouteMapId")
        private String routeMapId;

        private CenOutRouteMapRecord(Builder builder) {
            this.regionId = builder.regionId;
            this.routeMapId = builder.routeMapId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CenOutRouteMapRecord create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return routeMapId
         */
        public String getRouteMapId() {
            return this.routeMapId;
        }

        public static final class Builder {
            private String regionId; 
            private String routeMapId; 

            /**
             * The ID of the region where the routing policy is applied.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the routing policy.
             */
            public Builder routeMapId(String routeMapId) {
                this.routeMapId = routeMapId;
                return this;
            }

            public CenOutRouteMapRecord build() {
                return new CenOutRouteMapRecord(this);
            } 

        } 

    }
    public static class CenOutRouteMapRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenOutRouteMapRecord")
        private java.util.List < CenOutRouteMapRecord> cenOutRouteMapRecord;

        private CenOutRouteMapRecords(Builder builder) {
            this.cenOutRouteMapRecord = builder.cenOutRouteMapRecord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CenOutRouteMapRecords create() {
            return builder().build();
        }

        /**
         * @return cenOutRouteMapRecord
         */
        public java.util.List < CenOutRouteMapRecord> getCenOutRouteMapRecord() {
            return this.cenOutRouteMapRecord;
        }

        public static final class Builder {
            private java.util.List < CenOutRouteMapRecord> cenOutRouteMapRecord; 

            /**
             * CenOutRouteMapRecord.
             */
            public Builder cenOutRouteMapRecord(java.util.List < CenOutRouteMapRecord> cenOutRouteMapRecord) {
                this.cenOutRouteMapRecord = cenOutRouteMapRecord;
                return this;
            }

            public CenOutRouteMapRecords build() {
                return new CenOutRouteMapRecords(this);
            } 

        } 

    }
    public static class CenRouteMapRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RouteMapId")
        private String routeMapId;

        private CenRouteMapRecord(Builder builder) {
            this.regionId = builder.regionId;
            this.routeMapId = builder.routeMapId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CenRouteMapRecord create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return routeMapId
         */
        public String getRouteMapId() {
            return this.routeMapId;
        }

        public static final class Builder {
            private String regionId; 
            private String routeMapId; 

            /**
             * The ID of the region where the routing policy is applied.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the routing policy.
             */
            public Builder routeMapId(String routeMapId) {
                this.routeMapId = routeMapId;
                return this;
            }

            public CenRouteMapRecord build() {
                return new CenRouteMapRecord(this);
            } 

        } 

    }
    public static class CenRouteMapRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenRouteMapRecord")
        private java.util.List < CenRouteMapRecord> cenRouteMapRecord;

        private CenRouteMapRecords(Builder builder) {
            this.cenRouteMapRecord = builder.cenRouteMapRecord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CenRouteMapRecords create() {
            return builder().build();
        }

        /**
         * @return cenRouteMapRecord
         */
        public java.util.List < CenRouteMapRecord> getCenRouteMapRecord() {
            return this.cenRouteMapRecord;
        }

        public static final class Builder {
            private java.util.List < CenRouteMapRecord> cenRouteMapRecord; 

            /**
             * CenRouteMapRecord.
             */
            public Builder cenRouteMapRecord(java.util.List < CenRouteMapRecord> cenRouteMapRecord) {
                this.cenRouteMapRecord = cenRouteMapRecord;
                return this;
            }

            public CenRouteMapRecords build() {
                return new CenRouteMapRecords(this);
            } 

        } 

    }
    public static class Communities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Community")
        private java.util.List < String > community;

        private Communities(Builder builder) {
            this.community = builder.community;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Communities create() {
            return builder().build();
        }

        /**
         * @return community
         */
        public java.util.List < String > getCommunity() {
            return this.community;
        }

        public static final class Builder {
            private java.util.List < String > community; 

            /**
             * Community.
             */
            public Builder community(java.util.List < String > community) {
                this.community = community;
                return this;
            }

            public Communities build() {
                return new Communities(this);
            } 

        } 

    }
    public static class CenRouteEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsPaths")
        private AsPaths asPaths;

        @com.aliyun.core.annotation.NameInMap("CenOutRouteMapRecords")
        private CenOutRouteMapRecords cenOutRouteMapRecords;

        @com.aliyun.core.annotation.NameInMap("CenRouteMapRecords")
        private CenRouteMapRecords cenRouteMapRecords;

        @com.aliyun.core.annotation.NameInMap("Communities")
        private Communities communities;

        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("NextHopInstanceId")
        private String nextHopInstanceId;

        @com.aliyun.core.annotation.NameInMap("NextHopRegionId")
        private String nextHopRegionId;

        @com.aliyun.core.annotation.NameInMap("NextHopType")
        private String nextHopType;

        @com.aliyun.core.annotation.NameInMap("Preference")
        private Integer preference;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("ToOtherRegionStatus")
        private String toOtherRegionStatus;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private CenRouteEntry(Builder builder) {
            this.asPaths = builder.asPaths;
            this.cenOutRouteMapRecords = builder.cenOutRouteMapRecords;
            this.cenRouteMapRecords = builder.cenRouteMapRecords;
            this.communities = builder.communities;
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.nextHopInstanceId = builder.nextHopInstanceId;
            this.nextHopRegionId = builder.nextHopRegionId;
            this.nextHopType = builder.nextHopType;
            this.preference = builder.preference;
            this.status = builder.status;
            this.toOtherRegionStatus = builder.toOtherRegionStatus;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CenRouteEntry create() {
            return builder().build();
        }

        /**
         * @return asPaths
         */
        public AsPaths getAsPaths() {
            return this.asPaths;
        }

        /**
         * @return cenOutRouteMapRecords
         */
        public CenOutRouteMapRecords getCenOutRouteMapRecords() {
            return this.cenOutRouteMapRecords;
        }

        /**
         * @return cenRouteMapRecords
         */
        public CenRouteMapRecords getCenRouteMapRecords() {
            return this.cenRouteMapRecords;
        }

        /**
         * @return communities
         */
        public Communities getCommunities() {
            return this.communities;
        }

        /**
         * @return destinationCidrBlock
         */
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        /**
         * @return nextHopInstanceId
         */
        public String getNextHopInstanceId() {
            return this.nextHopInstanceId;
        }

        /**
         * @return nextHopRegionId
         */
        public String getNextHopRegionId() {
            return this.nextHopRegionId;
        }

        /**
         * @return nextHopType
         */
        public String getNextHopType() {
            return this.nextHopType;
        }

        /**
         * @return preference
         */
        public Integer getPreference() {
            return this.preference;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return toOtherRegionStatus
         */
        public String getToOtherRegionStatus() {
            return this.toOtherRegionStatus;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private AsPaths asPaths; 
            private CenOutRouteMapRecords cenOutRouteMapRecords; 
            private CenRouteMapRecords cenRouteMapRecords; 
            private Communities communities; 
            private String destinationCidrBlock; 
            private String nextHopInstanceId; 
            private String nextHopRegionId; 
            private String nextHopType; 
            private Integer preference; 
            private String status; 
            private String toOtherRegionStatus; 
            private String type; 

            /**
             * The AS paths of the route.
             */
            public Builder asPaths(AsPaths asPaths) {
                this.asPaths = asPaths;
                return this;
            }

            /**
             * The routing policy that the routes match in the outbound direction.
             */
            public Builder cenOutRouteMapRecords(CenOutRouteMapRecords cenOutRouteMapRecords) {
                this.cenOutRouteMapRecords = cenOutRouteMapRecords;
                return this;
            }

            /**
             * The routing policy that the routes match in the inbound direction.
             */
            public Builder cenRouteMapRecords(CenRouteMapRecords cenRouteMapRecords) {
                this.cenRouteMapRecords = cenRouteMapRecords;
                return this;
            }

            /**
             * The communities of the route.
             */
            public Builder communities(Communities communities) {
                this.communities = communities;
                return this;
            }

            /**
             * The destination CIDR block of the route.
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * The ID of the instance specified as the next hop in the route.
             */
            public Builder nextHopInstanceId(String nextHopInstanceId) {
                this.nextHopInstanceId = nextHopInstanceId;
                return this;
            }

            /**
             * The ID of the region to which the network instance specified as the next hop in the route belongs.
             */
            public Builder nextHopRegionId(String nextHopRegionId) {
                this.nextHopRegionId = nextHopRegionId;
                return this;
            }

            /**
             * The type of the instance specified as the next hop in the route. Valid values:
             * <p>
             * 
             * *   **VPC**: virtual private cloud (VPC)
             * *   **VBR**: virtual border router (VBR)
             * *   **CCN**: Cloud Connect Network (CCN) instance
             * *   **local_service**: system route. No next hop is specified.
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * The route priority.
             * <p>
             * 
             * A smaller value indicates a higher priority.
             */
            public Builder preference(Integer preference) {
                this.preference = preference;
                return this;
            }

            /**
             * The route status. Valid values:
             * <p>
             * 
             * *   **Active**: available
             * *   **Candidate**: standby
             * *   **Rejected**: rejected
             * *   **Prohibited**: prohibited
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Indicates whether the route can be advertised to other regions. Valid values:
             * <p>
             * 
             * *   **Active**: The route can be advertised to other regions.
             * *   **Prohibited**: The route cannot be advertised to other regions.
             */
            public Builder toOtherRegionStatus(String toOtherRegionStatus) {
                this.toOtherRegionStatus = toOtherRegionStatus;
                return this;
            }

            /**
             * The route type. Valid values:
             * <p>
             * 
             * *   **CEN**: route that is advertised through CEN
             * *   **Custom**: custom route
             * *   **System**: system route
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CenRouteEntry build() {
                return new CenRouteEntry(this);
            } 

        } 

    }
    public static class CenRouteEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenRouteEntry")
        private java.util.List < CenRouteEntry> cenRouteEntry;

        private CenRouteEntries(Builder builder) {
            this.cenRouteEntry = builder.cenRouteEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CenRouteEntries create() {
            return builder().build();
        }

        /**
         * @return cenRouteEntry
         */
        public java.util.List < CenRouteEntry> getCenRouteEntry() {
            return this.cenRouteEntry;
        }

        public static final class Builder {
            private java.util.List < CenRouteEntry> cenRouteEntry; 

            /**
             * CenRouteEntry.
             */
            public Builder cenRouteEntry(java.util.List < CenRouteEntry> cenRouteEntry) {
                this.cenRouteEntry = cenRouteEntry;
                return this;
            }

            public CenRouteEntries build() {
                return new CenRouteEntries(this);
            } 

        } 

    }
}
