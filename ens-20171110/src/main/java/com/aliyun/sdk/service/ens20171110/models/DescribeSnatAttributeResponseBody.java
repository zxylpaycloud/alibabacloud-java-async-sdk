// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnatAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnatAttributeResponseBody</p>
 */
public class DescribeSnatAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("DestCIDR")
    private String destCIDR;

    @com.aliyun.core.annotation.NameInMap("IdleTimeout")
    private Integer idleTimeout;

    @com.aliyun.core.annotation.NameInMap("NatGatewayId")
    private String natGatewayId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnatEntryId")
    private String snatEntryId;

    @com.aliyun.core.annotation.NameInMap("SnatEntryName")
    private String snatEntryName;

    @com.aliyun.core.annotation.NameInMap("SnatIp")
    private String snatIp;

    @com.aliyun.core.annotation.NameInMap("SnatIps")
    private java.util.List < SnatIps> snatIps;

    @com.aliyun.core.annotation.NameInMap("SourceCIDR")
    private String sourceCIDR;

    @com.aliyun.core.annotation.NameInMap("StandbySnatIp")
    private String standbySnatIp;

    @com.aliyun.core.annotation.NameInMap("StandbyStatus")
    private String standbyStatus;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribeSnatAttributeResponseBody(Builder builder) {
        this.creationTime = builder.creationTime;
        this.destCIDR = builder.destCIDR;
        this.idleTimeout = builder.idleTimeout;
        this.natGatewayId = builder.natGatewayId;
        this.requestId = builder.requestId;
        this.snatEntryId = builder.snatEntryId;
        this.snatEntryName = builder.snatEntryName;
        this.snatIp = builder.snatIp;
        this.snatIps = builder.snatIps;
        this.sourceCIDR = builder.sourceCIDR;
        this.standbySnatIp = builder.standbySnatIp;
        this.standbyStatus = builder.standbyStatus;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnatAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return destCIDR
     */
    public String getDestCIDR() {
        return this.destCIDR;
    }

    /**
     * @return idleTimeout
     */
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    /**
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snatEntryId
     */
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

    /**
     * @return snatEntryName
     */
    public String getSnatEntryName() {
        return this.snatEntryName;
    }

    /**
     * @return snatIp
     */
    public String getSnatIp() {
        return this.snatIp;
    }

    /**
     * @return snatIps
     */
    public java.util.List < SnatIps> getSnatIps() {
        return this.snatIps;
    }

    /**
     * @return sourceCIDR
     */
    public String getSourceCIDR() {
        return this.sourceCIDR;
    }

    /**
     * @return standbySnatIp
     */
    public String getStandbySnatIp() {
        return this.standbySnatIp;
    }

    /**
     * @return standbyStatus
     */
    public String getStandbyStatus() {
        return this.standbyStatus;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String creationTime; 
        private String destCIDR; 
        private Integer idleTimeout; 
        private String natGatewayId; 
        private String requestId; 
        private String snatEntryId; 
        private String snatEntryName; 
        private String snatIp; 
        private java.util.List < SnatIps> snatIps; 
        private String sourceCIDR; 
        private String standbySnatIp; 
        private String standbyStatus; 
        private String status; 
        private String type; 

        /**
         * The time when the entry was created. The time is displayed in UTC.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * The destination CIDR block. The rule takes effect only on requests that access the destination CIDR block.
         */
        public Builder destCIDR(String destCIDR) {
            this.destCIDR = destCIDR;
            return this;
        }

        /**
         * Timeout period.
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * The ID of the Network Address Translation (NAT) gateway.
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
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
         * The ID of the SNAT entry.
         */
        public Builder snatEntryId(String snatEntryId) {
            this.snatEntryId = snatEntryId;
            return this;
        }

        /**
         * The name of the SNAT entry.
         */
        public Builder snatEntryName(String snatEntryName) {
            this.snatEntryName = snatEntryName;
            return this;
        }

        /**
         * The EIP specified in the SNAT entry. Multiple EIPs are separated by commas (,).
         */
        public Builder snatIp(String snatIp) {
            this.snatIp = snatIp;
            return this;
        }

        /**
         * The information about the EIP specified in the SNAT entry.
         */
        public Builder snatIps(java.util.List < SnatIps> snatIps) {
            this.snatIps = snatIps;
            return this;
        }

        /**
         * The source CIDR block specified in the SNAT entry.
         */
        public Builder sourceCIDR(String sourceCIDR) {
            this.sourceCIDR = sourceCIDR;
            return this;
        }

        /**
         * The secondary EIP specified in the SNAT entry. Multiple secondary EIPs are separated by commas (,).
         */
        public Builder standbySnatIp(String standbySnatIp) {
            this.standbySnatIp = standbySnatIp;
            return this;
        }

        /**
         * The status of the secondary EIP.
         * <p>
         * 
         * *   Running
         * *   Stopping
         * *   Stopped
         * *   Starting
         */
        public Builder standbyStatus(String standbyStatus) {
            this.standbyStatus = standbyStatus;
            return this;
        }

        /**
         * The status of the SNAT entry.
         * <p>
         * 
         * *   Pending: The SNAT entry is being created or modified.
         * *   Available: The SNAT entry is available.
         * *   Deleting: The SNAT entry is being deleted.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The type of the NAT. Valid values: 
         * <p>
         * 
         * - Empty: symmetric NAT.
         * 
         * - FullCone: full cone NAT.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribeSnatAttributeResponseBody build() {
            return new DescribeSnatAttributeResponseBody(this);
        } 

    } 

    public static class SnatIps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private SnatIps(Builder builder) {
            this.creationTime = builder.creationTime;
            this.ip = builder.ip;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnatIps create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String creationTime; 
            private String ip; 
            private String status; 

            /**
             * The time when the IP address was created. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The IP address.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The status of the IP address.
             * <p>
             * 
             * *   Running
             * *   Stopping
             * *   Stopped
             * *   Starting
             * *   Releasing
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SnatIps build() {
                return new SnatIps(this);
            } 

        } 

    }
}
