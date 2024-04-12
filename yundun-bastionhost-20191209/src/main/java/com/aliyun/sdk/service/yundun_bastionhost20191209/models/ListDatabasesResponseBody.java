// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDatabasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatabasesResponseBody</p>
 */
public class ListDatabasesResponseBody extends TeaModel {
    @NameInMap("Databases")
    private java.util.List < Databases> databases;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListDatabasesResponseBody(Builder builder) {
        this.databases = builder.databases;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatabasesResponseBody create() {
        return builder().build();
    }

    /**
     * @return databases
     */
    public java.util.List < Databases> getDatabases() {
        return this.databases;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Databases> databases; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Databases.
         */
        public Builder databases(java.util.List < Databases> databases) {
            this.databases = databases;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDatabasesResponseBody build() {
            return new ListDatabasesResponseBody(this);
        } 

    } 

    public static class Databases extends TeaModel {
        @NameInMap("ActiveAddressType")
        private String activeAddressType;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("DatabaseId")
        private String databaseId;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("DatabasePort")
        private Integer databasePort;

        @NameInMap("DatabasePrivateAddress")
        private String databasePrivateAddress;

        @NameInMap("DatabasePublicAddress")
        private String databasePublicAddress;

        @NameInMap("DatabaseType")
        private String databaseType;

        @NameInMap("NetworkDomainId")
        private String networkDomainId;

        @NameInMap("Source")
        private String source;

        @NameInMap("SourceInstanceId")
        private String sourceInstanceId;

        @NameInMap("SourceInstanceRegionId")
        private String sourceInstanceRegionId;

        @NameInMap("SourceInstanceState")
        private String sourceInstanceState;

        private Databases(Builder builder) {
            this.activeAddressType = builder.activeAddressType;
            this.comment = builder.comment;
            this.databaseId = builder.databaseId;
            this.databaseName = builder.databaseName;
            this.databasePort = builder.databasePort;
            this.databasePrivateAddress = builder.databasePrivateAddress;
            this.databasePublicAddress = builder.databasePublicAddress;
            this.databaseType = builder.databaseType;
            this.networkDomainId = builder.networkDomainId;
            this.source = builder.source;
            this.sourceInstanceId = builder.sourceInstanceId;
            this.sourceInstanceRegionId = builder.sourceInstanceRegionId;
            this.sourceInstanceState = builder.sourceInstanceState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Databases create() {
            return builder().build();
        }

        /**
         * @return activeAddressType
         */
        public String getActiveAddressType() {
            return this.activeAddressType;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return databaseId
         */
        public String getDatabaseId() {
            return this.databaseId;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return databasePort
         */
        public Integer getDatabasePort() {
            return this.databasePort;
        }

        /**
         * @return databasePrivateAddress
         */
        public String getDatabasePrivateAddress() {
            return this.databasePrivateAddress;
        }

        /**
         * @return databasePublicAddress
         */
        public String getDatabasePublicAddress() {
            return this.databasePublicAddress;
        }

        /**
         * @return databaseType
         */
        public String getDatabaseType() {
            return this.databaseType;
        }

        /**
         * @return networkDomainId
         */
        public String getNetworkDomainId() {
            return this.networkDomainId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceInstanceId
         */
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        /**
         * @return sourceInstanceRegionId
         */
        public String getSourceInstanceRegionId() {
            return this.sourceInstanceRegionId;
        }

        /**
         * @return sourceInstanceState
         */
        public String getSourceInstanceState() {
            return this.sourceInstanceState;
        }

        public static final class Builder {
            private String activeAddressType; 
            private String comment; 
            private String databaseId; 
            private String databaseName; 
            private Integer databasePort; 
            private String databasePrivateAddress; 
            private String databasePublicAddress; 
            private String databaseType; 
            private String networkDomainId; 
            private String source; 
            private String sourceInstanceId; 
            private String sourceInstanceRegionId; 
            private String sourceInstanceState; 

            /**
             * ActiveAddressType.
             */
            public Builder activeAddressType(String activeAddressType) {
                this.activeAddressType = activeAddressType;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * DatabaseId.
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
                return this;
            }

            /**
             * DatabaseName.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * DatabasePort.
             */
            public Builder databasePort(Integer databasePort) {
                this.databasePort = databasePort;
                return this;
            }

            /**
             * DatabasePrivateAddress.
             */
            public Builder databasePrivateAddress(String databasePrivateAddress) {
                this.databasePrivateAddress = databasePrivateAddress;
                return this;
            }

            /**
             * DatabasePublicAddress.
             */
            public Builder databasePublicAddress(String databasePublicAddress) {
                this.databasePublicAddress = databasePublicAddress;
                return this;
            }

            /**
             * DatabaseType.
             */
            public Builder databaseType(String databaseType) {
                this.databaseType = databaseType;
                return this;
            }

            /**
             * NetworkDomainId.
             */
            public Builder networkDomainId(String networkDomainId) {
                this.networkDomainId = networkDomainId;
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
             * SourceInstanceId.
             */
            public Builder sourceInstanceId(String sourceInstanceId) {
                this.sourceInstanceId = sourceInstanceId;
                return this;
            }

            /**
             * SourceInstanceRegionId.
             */
            public Builder sourceInstanceRegionId(String sourceInstanceRegionId) {
                this.sourceInstanceRegionId = sourceInstanceRegionId;
                return this;
            }

            /**
             * SourceInstanceState.
             */
            public Builder sourceInstanceState(String sourceInstanceState) {
                this.sourceInstanceState = sourceInstanceState;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
}
