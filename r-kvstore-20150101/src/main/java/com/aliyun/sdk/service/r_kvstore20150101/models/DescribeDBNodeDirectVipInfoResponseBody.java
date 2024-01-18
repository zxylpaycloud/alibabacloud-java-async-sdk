// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBNodeDirectVipInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBNodeDirectVipInfoResponseBody</p>
 */
public class DescribeDBNodeDirectVipInfoResponseBody extends TeaModel {
    @NameInMap("DirectVipInfo")
    private DirectVipInfo directVipInfo;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBNodeDirectVipInfoResponseBody(Builder builder) {
        this.directVipInfo = builder.directVipInfo;
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBNodeDirectVipInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return directVipInfo
     */
    public DirectVipInfo getDirectVipInfo() {
        return this.directVipInfo;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DirectVipInfo directVipInfo; 
        private String instanceId; 
        private String requestId; 

        /**
         * DirectVipInfo.
         */
        public Builder directVipInfo(DirectVipInfo directVipInfo) {
            this.directVipInfo = directVipInfo;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBNodeDirectVipInfoResponseBody build() {
            return new DescribeDBNodeDirectVipInfoResponseBody(this);
        } 

    } 

    public static class VipInfo extends TeaModel {
        @NameInMap("NetType")
        private String netType;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("Port")
        private String port;

        @NameInMap("Vip")
        private String vip;

        private VipInfo(Builder builder) {
            this.netType = builder.netType;
            this.nodeId = builder.nodeId;
            this.port = builder.port;
            this.vip = builder.vip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VipInfo create() {
            return builder().build();
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return vip
         */
        public String getVip() {
            return this.vip;
        }

        public static final class Builder {
            private String netType; 
            private String nodeId; 
            private String port; 
            private String vip; 

            /**
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
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
             * Vip.
             */
            public Builder vip(String vip) {
                this.vip = vip;
                return this;
            }

            public VipInfo build() {
                return new VipInfo(this);
            } 

        } 

    }
    public static class DirectVipInfo extends TeaModel {
        @NameInMap("VipInfo")
        private java.util.List < VipInfo> vipInfo;

        private DirectVipInfo(Builder builder) {
            this.vipInfo = builder.vipInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DirectVipInfo create() {
            return builder().build();
        }

        /**
         * @return vipInfo
         */
        public java.util.List < VipInfo> getVipInfo() {
            return this.vipInfo;
        }

        public static final class Builder {
            private java.util.List < VipInfo> vipInfo; 

            /**
             * VipInfo.
             */
            public Builder vipInfo(java.util.List < VipInfo> vipInfo) {
                this.vipInfo = vipInfo;
                return this;
            }

            public DirectVipInfo build() {
                return new DirectVipInfo(this);
            } 

        } 

    }
}
