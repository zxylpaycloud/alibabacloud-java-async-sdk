// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricOrganizationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFabricOrganizationResponseBody</p>
 */
public class DescribeFabricOrganizationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeFabricOrganizationResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricOrganizationResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer errorCode; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeFabricOrganizationResponseBody build() {
            return new DescribeFabricOrganizationResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CANAME")
        private String CANAME;

        @com.aliyun.core.annotation.NameInMap("CAUrl")
        private String CAUrl;

        @com.aliyun.core.annotation.NameInMap("CodeName")
        private String codeName;

        @com.aliyun.core.annotation.NameInMap("ConsortiumCount")
        private Integer consortiumCount;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("MSP")
        private String MSP;

        @com.aliyun.core.annotation.NameInMap("OrganizationDescription")
        private String organizationDescription;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("OrganizationName")
        private String organizationName;

        @com.aliyun.core.annotation.NameInMap("OwnerBid")
        private String ownerBid;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("OwnerUid")
        private Long ownerUid;

        @com.aliyun.core.annotation.NameInMap("PeerCount")
        private Integer peerCount;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("SpecName")
        private String specName;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UserCount")
        private Integer userCount;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Result(Builder builder) {
            this.CANAME = builder.CANAME;
            this.CAUrl = builder.CAUrl;
            this.codeName = builder.codeName;
            this.consortiumCount = builder.consortiumCount;
            this.createTime = builder.createTime;
            this.domain = builder.domain;
            this.MSP = builder.MSP;
            this.organizationDescription = builder.organizationDescription;
            this.organizationId = builder.organizationId;
            this.organizationName = builder.organizationName;
            this.ownerBid = builder.ownerBid;
            this.ownerName = builder.ownerName;
            this.ownerUid = builder.ownerUid;
            this.peerCount = builder.peerCount;
            this.regionId = builder.regionId;
            this.requestId = builder.requestId;
            this.specName = builder.specName;
            this.state = builder.state;
            this.tags = builder.tags;
            this.userCount = builder.userCount;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return CANAME
         */
        public String getCANAME() {
            return this.CANAME;
        }

        /**
         * @return CAUrl
         */
        public String getCAUrl() {
            return this.CAUrl;
        }

        /**
         * @return codeName
         */
        public String getCodeName() {
            return this.codeName;
        }

        /**
         * @return consortiumCount
         */
        public Integer getConsortiumCount() {
            return this.consortiumCount;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return MSP
         */
        public String getMSP() {
            return this.MSP;
        }

        /**
         * @return organizationDescription
         */
        public String getOrganizationDescription() {
            return this.organizationDescription;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return organizationName
         */
        public String getOrganizationName() {
            return this.organizationName;
        }

        /**
         * @return ownerBid
         */
        public String getOwnerBid() {
            return this.ownerBid;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return ownerUid
         */
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        /**
         * @return peerCount
         */
        public Integer getPeerCount() {
            return this.peerCount;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return specName
         */
        public String getSpecName() {
            return this.specName;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return userCount
         */
        public Integer getUserCount() {
            return this.userCount;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String CANAME; 
            private String CAUrl; 
            private String codeName; 
            private Integer consortiumCount; 
            private String createTime; 
            private String domain; 
            private String MSP; 
            private String organizationDescription; 
            private String organizationId; 
            private String organizationName; 
            private String ownerBid; 
            private String ownerName; 
            private Long ownerUid; 
            private Integer peerCount; 
            private String regionId; 
            private String requestId; 
            private String specName; 
            private String state; 
            private java.util.List < Tags> tags; 
            private Integer userCount; 
            private String zoneId; 

            /**
             * CANAME.
             */
            public Builder CANAME(String CANAME) {
                this.CANAME = CANAME;
                return this;
            }

            /**
             * CAUrl.
             */
            public Builder CAUrl(String CAUrl) {
                this.CAUrl = CAUrl;
                return this;
            }

            /**
             * CodeName.
             */
            public Builder codeName(String codeName) {
                this.codeName = codeName;
                return this;
            }

            /**
             * ConsortiumCount.
             */
            public Builder consortiumCount(Integer consortiumCount) {
                this.consortiumCount = consortiumCount;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * MSP.
             */
            public Builder MSP(String MSP) {
                this.MSP = MSP;
                return this;
            }

            /**
             * OrganizationDescription.
             */
            public Builder organizationDescription(String organizationDescription) {
                this.organizationDescription = organizationDescription;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * OrganizationName.
             */
            public Builder organizationName(String organizationName) {
                this.organizationName = organizationName;
                return this;
            }

            /**
             * OwnerBid.
             */
            public Builder ownerBid(String ownerBid) {
                this.ownerBid = ownerBid;
                return this;
            }

            /**
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * OwnerUid.
             */
            public Builder ownerUid(Long ownerUid) {
                this.ownerUid = ownerUid;
                return this;
            }

            /**
             * PeerCount.
             */
            public Builder peerCount(Integer peerCount) {
                this.peerCount = peerCount;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * SpecName.
             */
            public Builder specName(String specName) {
                this.specName = specName;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * UserCount.
             */
            public Builder userCount(Integer userCount) {
                this.userCount = userCount;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
