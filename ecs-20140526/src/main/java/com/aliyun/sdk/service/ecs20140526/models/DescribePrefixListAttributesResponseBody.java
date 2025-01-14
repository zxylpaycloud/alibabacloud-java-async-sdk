// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePrefixListAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePrefixListAttributesResponseBody</p>
 */
public class DescribePrefixListAttributesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddressFamily")
    private String addressFamily;

    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Entries")
    private Entries entries;

    @com.aliyun.core.annotation.NameInMap("MaxEntries")
    private Integer maxEntries;

    @com.aliyun.core.annotation.NameInMap("PrefixListId")
    private String prefixListId;

    @com.aliyun.core.annotation.NameInMap("PrefixListName")
    private String prefixListName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePrefixListAttributesResponseBody(Builder builder) {
        this.addressFamily = builder.addressFamily;
        this.creationTime = builder.creationTime;
        this.description = builder.description;
        this.entries = builder.entries;
        this.maxEntries = builder.maxEntries;
        this.prefixListId = builder.prefixListId;
        this.prefixListName = builder.prefixListName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrefixListAttributesResponseBody create() {
        return builder().build();
    }

    /**
     * @return addressFamily
     */
    public String getAddressFamily() {
        return this.addressFamily;
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return entries
     */
    public Entries getEntries() {
        return this.entries;
    }

    /**
     * @return maxEntries
     */
    public Integer getMaxEntries() {
        return this.maxEntries;
    }

    /**
     * @return prefixListId
     */
    public String getPrefixListId() {
        return this.prefixListId;
    }

    /**
     * @return prefixListName
     */
    public String getPrefixListName() {
        return this.prefixListName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String addressFamily; 
        private String creationTime; 
        private String description; 
        private Entries entries; 
        private Integer maxEntries; 
        private String prefixListId; 
        private String prefixListName; 
        private String requestId; 

        /**
         * The name of the prefix list.
         */
        public Builder addressFamily(String addressFamily) {
            this.addressFamily = addressFamily;
            return this;
        }

        /**
         * The maximum number of entries that the prefix list can contain.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * The IP address family of the prefix list. Valid values:
         * <p>
         * 
         * *   IPv4
         * *   IPv6
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The description of the entry in the prefix list.
         */
        public Builder entries(Entries entries) {
            this.entries = entries;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder maxEntries(Integer maxEntries) {
            this.maxEntries = maxEntries;
            return this;
        }

        /**
         * Details about the entries in the prefix list.
         */
        public Builder prefixListId(String prefixListId) {
            this.prefixListId = prefixListId;
            return this;
        }

        /**
         * The ID of the prefix list.
         */
        public Builder prefixListName(String prefixListName) {
            this.prefixListName = prefixListName;
            return this;
        }

        /**
         * The description of the prefix list.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePrefixListAttributesResponseBody build() {
            return new DescribePrefixListAttributesResponseBody(this);
        } 

    } 

    public static class Entry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        private Entry(Builder builder) {
            this.cidr = builder.cidr;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entry create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String cidr; 
            private String description; 

            /**
             * Cidr.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * The CIDR block in the entry in the prefix list.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public Entry build() {
                return new Entry(this);
            } 

        } 

    }
    public static class Entries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Entry")
        private java.util.List < Entry> entry;

        private Entries(Builder builder) {
            this.entry = builder.entry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entries create() {
            return builder().build();
        }

        /**
         * @return entry
         */
        public java.util.List < Entry> getEntry() {
            return this.entry;
        }

        public static final class Builder {
            private java.util.List < Entry> entry; 

            /**
             * Entry.
             */
            public Builder entry(java.util.List < Entry> entry) {
                this.entry = entry;
                return this;
            }

            public Entries build() {
                return new Entries(this);
            } 

        } 

    }
}
