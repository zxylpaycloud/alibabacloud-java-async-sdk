// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskEventPayloadResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskEventPayloadResponseBody</p>
 */
public class DescribeRiskEventPayloadResponseBody extends TeaModel {
    @NameInMap("DstIP")
    private String dstIP;

    @NameInMap("DstPort")
    private Integer dstPort;

    @NameInMap("DstVpcId")
    private String dstVpcId;

    @NameInMap("Payload")
    private String payload;

    @NameInMap("PayloadLen")
    private Integer payloadLen;

    @NameInMap("Proto")
    private String proto;

    @NameInMap("RealIp")
    private String realIp;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SrcIP")
    private String srcIP;

    @NameInMap("SrcPort")
    private Integer srcPort;

    @NameInMap("SrcVpcId")
    private String srcVpcId;

    @NameInMap("XForwardFor")
    private String xForwardFor;

    private DescribeRiskEventPayloadResponseBody(Builder builder) {
        this.dstIP = builder.dstIP;
        this.dstPort = builder.dstPort;
        this.dstVpcId = builder.dstVpcId;
        this.payload = builder.payload;
        this.payloadLen = builder.payloadLen;
        this.proto = builder.proto;
        this.realIp = builder.realIp;
        this.requestId = builder.requestId;
        this.srcIP = builder.srcIP;
        this.srcPort = builder.srcPort;
        this.srcVpcId = builder.srcVpcId;
        this.xForwardFor = builder.xForwardFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskEventPayloadResponseBody create() {
        return builder().build();
    }

    /**
     * @return dstIP
     */
    public String getDstIP() {
        return this.dstIP;
    }

    /**
     * @return dstPort
     */
    public Integer getDstPort() {
        return this.dstPort;
    }

    /**
     * @return dstVpcId
     */
    public String getDstVpcId() {
        return this.dstVpcId;
    }

    /**
     * @return payload
     */
    public String getPayload() {
        return this.payload;
    }

    /**
     * @return payloadLen
     */
    public Integer getPayloadLen() {
        return this.payloadLen;
    }

    /**
     * @return proto
     */
    public String getProto() {
        return this.proto;
    }

    /**
     * @return realIp
     */
    public String getRealIp() {
        return this.realIp;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return srcIP
     */
    public String getSrcIP() {
        return this.srcIP;
    }

    /**
     * @return srcPort
     */
    public Integer getSrcPort() {
        return this.srcPort;
    }

    /**
     * @return srcVpcId
     */
    public String getSrcVpcId() {
        return this.srcVpcId;
    }

    /**
     * @return xForwardFor
     */
    public String getXForwardFor() {
        return this.xForwardFor;
    }

    public static final class Builder {
        private String dstIP; 
        private Integer dstPort; 
        private String dstVpcId; 
        private String payload; 
        private Integer payloadLen; 
        private String proto; 
        private String realIp; 
        private String requestId; 
        private String srcIP; 
        private Integer srcPort; 
        private String srcVpcId; 
        private String xForwardFor; 

        /**
         * DstIP.
         */
        public Builder dstIP(String dstIP) {
            this.dstIP = dstIP;
            return this;
        }

        /**
         * DstPort.
         */
        public Builder dstPort(Integer dstPort) {
            this.dstPort = dstPort;
            return this;
        }

        /**
         * DstVpcId.
         */
        public Builder dstVpcId(String dstVpcId) {
            this.dstVpcId = dstVpcId;
            return this;
        }

        /**
         * Payload.
         */
        public Builder payload(String payload) {
            this.payload = payload;
            return this;
        }

        /**
         * PayloadLen.
         */
        public Builder payloadLen(Integer payloadLen) {
            this.payloadLen = payloadLen;
            return this;
        }

        /**
         * Proto.
         */
        public Builder proto(String proto) {
            this.proto = proto;
            return this;
        }

        /**
         * RealIp.
         */
        public Builder realIp(String realIp) {
            this.realIp = realIp;
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
         * SrcIP.
         */
        public Builder srcIP(String srcIP) {
            this.srcIP = srcIP;
            return this;
        }

        /**
         * SrcPort.
         */
        public Builder srcPort(Integer srcPort) {
            this.srcPort = srcPort;
            return this;
        }

        /**
         * SrcVpcId.
         */
        public Builder srcVpcId(String srcVpcId) {
            this.srcVpcId = srcVpcId;
            return this;
        }

        /**
         * XForwardFor.
         */
        public Builder xForwardFor(String xForwardFor) {
            this.xForwardFor = xForwardFor;
            return this;
        }

        public DescribeRiskEventPayloadResponseBody build() {
            return new DescribeRiskEventPayloadResponseBody(this);
        } 

    } 

}