// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBruteForceRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBruteForceRecordsResponseBody</p>
 */
public class DescribeBruteForceRecordsResponseBody extends TeaModel {
    @NameInMap("MachineList")
    private java.util.List < MachineList> machineList;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBruteForceRecordsResponseBody(Builder builder) {
        this.machineList = builder.machineList;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBruteForceRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return machineList
     */
    public java.util.List < MachineList> getMachineList() {
        return this.machineList;
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

    public static final class Builder {
        private java.util.List < MachineList> machineList; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * MachineList.
         */
        public Builder machineList(java.util.List < MachineList> machineList) {
            this.machineList = machineList;
            return this;
        }

        /**
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBruteForceRecordsResponseBody build() {
            return new DescribeBruteForceRecordsResponseBody(this);
        } 

    } 

    public static class MachineList extends TeaModel {
        @NameInMap("AliNetOnline")
        private Boolean aliNetOnline;

        @NameInMap("BlockExpireDate")
        private Long blockExpireDate;

        @NameInMap("BlockIp")
        private String blockIp;

        @NameInMap("BlockType")
        private String blockType;

        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("Port")
        private String port;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("Source")
        private String source;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Uuid")
        private String uuid;

        private MachineList(Builder builder) {
            this.aliNetOnline = builder.aliNetOnline;
            this.blockExpireDate = builder.blockExpireDate;
            this.blockIp = builder.blockIp;
            this.blockType = builder.blockType;
            this.errorCode = builder.errorCode;
            this.id = builder.id;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.port = builder.port;
            this.ruleName = builder.ruleName;
            this.source = builder.source;
            this.status = builder.status;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MachineList create() {
            return builder().build();
        }

        /**
         * @return aliNetOnline
         */
        public Boolean getAliNetOnline() {
            return this.aliNetOnline;
        }

        /**
         * @return blockExpireDate
         */
        public Long getBlockExpireDate() {
            return this.blockExpireDate;
        }

        /**
         * @return blockIp
         */
        public String getBlockIp() {
            return this.blockIp;
        }

        /**
         * @return blockType
         */
        public String getBlockType() {
            return this.blockType;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Boolean aliNetOnline; 
            private Long blockExpireDate; 
            private String blockIp; 
            private String blockType; 
            private String errorCode; 
            private Long id; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private String port; 
            private String ruleName; 
            private String source; 
            private Integer status; 
            private String uuid; 

            /**
             * AliNetOnline.
             */
            public Builder aliNetOnline(Boolean aliNetOnline) {
                this.aliNetOnline = aliNetOnline;
                return this;
            }

            /**
             * BlockExpireDate.
             */
            public Builder blockExpireDate(Long blockExpireDate) {
                this.blockExpireDate = blockExpireDate;
                return this;
            }

            /**
             * BlockIp.
             */
            public Builder blockIp(String blockIp) {
                this.blockIp = blockIp;
                return this;
            }

            /**
             * BlockType.
             */
            public Builder blockType(String blockType) {
                this.blockType = blockType;
                return this;
            }

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InternetIp.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * IntranetIp.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public MachineList build() {
                return new MachineList(this);
            } 

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
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
