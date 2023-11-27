// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListListenersResponseBody} extends {@link TeaModel}
 *
 * <p>ListListenersResponseBody</p>
 */
public class ListListenersResponseBody extends TeaModel {
    @NameInMap("Listeners")
    private java.util.List < Listeners> listeners;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListListenersResponseBody(Builder builder) {
        this.listeners = builder.listeners;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListListenersResponseBody create() {
        return builder().build();
    }

    /**
     * @return listeners
     */
    public java.util.List < Listeners> getListeners() {
        return this.listeners;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List < Listeners> listeners; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The list of listeners.
         */
        public Builder listeners(java.util.List < Listeners> listeners) {
            this.listeners = listeners;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used for the next query. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, it indicates that no next query is to be sent.
         * *   If a value of **NextToken** is returned, the value is the token used for the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListListenersResponseBody build() {
            return new ListListenersResponseBody(this);
        } 

    } 

    public static class ProxyProtocolV2Config extends TeaModel {
        @NameInMap("Ppv2PrivateLinkEpIdEnabled")
        private String ppv2PrivateLinkEpIdEnabled;

        @NameInMap("Ppv2PrivateLinkEpsIdEnabled")
        private String ppv2PrivateLinkEpsIdEnabled;

        @NameInMap("Ppv2VpcIdEnabled")
        private String ppv2VpcIdEnabled;

        private ProxyProtocolV2Config(Builder builder) {
            this.ppv2PrivateLinkEpIdEnabled = builder.ppv2PrivateLinkEpIdEnabled;
            this.ppv2PrivateLinkEpsIdEnabled = builder.ppv2PrivateLinkEpsIdEnabled;
            this.ppv2VpcIdEnabled = builder.ppv2VpcIdEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProxyProtocolV2Config create() {
            return builder().build();
        }

        /**
         * @return ppv2PrivateLinkEpIdEnabled
         */
        public String getPpv2PrivateLinkEpIdEnabled() {
            return this.ppv2PrivateLinkEpIdEnabled;
        }

        /**
         * @return ppv2PrivateLinkEpsIdEnabled
         */
        public String getPpv2PrivateLinkEpsIdEnabled() {
            return this.ppv2PrivateLinkEpsIdEnabled;
        }

        /**
         * @return ppv2VpcIdEnabled
         */
        public String getPpv2VpcIdEnabled() {
            return this.ppv2VpcIdEnabled;
        }

        public static final class Builder {
            private String ppv2PrivateLinkEpIdEnabled; 
            private String ppv2PrivateLinkEpsIdEnabled; 
            private String ppv2VpcIdEnabled; 

            /**
             * Ppv2PrivateLinkEpIdEnabled.
             */
            public Builder ppv2PrivateLinkEpIdEnabled(String ppv2PrivateLinkEpIdEnabled) {
                this.ppv2PrivateLinkEpIdEnabled = ppv2PrivateLinkEpIdEnabled;
                return this;
            }

            /**
             * Ppv2PrivateLinkEpsIdEnabled.
             */
            public Builder ppv2PrivateLinkEpsIdEnabled(String ppv2PrivateLinkEpsIdEnabled) {
                this.ppv2PrivateLinkEpsIdEnabled = ppv2PrivateLinkEpsIdEnabled;
                return this;
            }

            /**
             * Ppv2VpcIdEnabled.
             */
            public Builder ppv2VpcIdEnabled(String ppv2VpcIdEnabled) {
                this.ppv2VpcIdEnabled = ppv2VpcIdEnabled;
                return this;
            }

            public ProxyProtocolV2Config build() {
                return new ProxyProtocolV2Config(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag option.
             * <p>
             * 
             * The value can be up to 128 characters in length. It cannot start with `acs:` and cannot contain `http://` or `https://`.
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
    public static class Listeners extends TeaModel {
        @NameInMap("AlpnEnabled")
        private Boolean alpnEnabled;

        @NameInMap("AlpnPolicy")
        private String alpnPolicy;

        @NameInMap("CaCertificateIds")
        private java.util.List < String > caCertificateIds;

        @NameInMap("CaEnabled")
        private Boolean caEnabled;

        @NameInMap("CertificateIds")
        private java.util.List < String > certificateIds;

        @NameInMap("Cps")
        private Integer cps;

        @NameInMap("EndPort")
        private String endPort;

        @NameInMap("IdleTimeout")
        private Integer idleTimeout;

        @NameInMap("ListenerDescription")
        private String listenerDescription;

        @NameInMap("ListenerId")
        private String listenerId;

        @NameInMap("ListenerPort")
        private Integer listenerPort;

        @NameInMap("ListenerProtocol")
        private String listenerProtocol;

        @NameInMap("ListenerStatus")
        private String listenerStatus;

        @NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @NameInMap("Mss")
        private Integer mss;

        @NameInMap("ProxyProtocolEnabled")
        private Boolean proxyProtocolEnabled;

        @NameInMap("ProxyProtocolV2Config")
        private ProxyProtocolV2Config proxyProtocolV2Config;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SecSensorEnabled")
        private Boolean secSensorEnabled;

        @NameInMap("SecurityPolicyId")
        private String securityPolicyId;

        @NameInMap("ServerGroupId")
        private String serverGroupId;

        @NameInMap("StartPort")
        private String startPort;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        private Listeners(Builder builder) {
            this.alpnEnabled = builder.alpnEnabled;
            this.alpnPolicy = builder.alpnPolicy;
            this.caCertificateIds = builder.caCertificateIds;
            this.caEnabled = builder.caEnabled;
            this.certificateIds = builder.certificateIds;
            this.cps = builder.cps;
            this.endPort = builder.endPort;
            this.idleTimeout = builder.idleTimeout;
            this.listenerDescription = builder.listenerDescription;
            this.listenerId = builder.listenerId;
            this.listenerPort = builder.listenerPort;
            this.listenerProtocol = builder.listenerProtocol;
            this.listenerStatus = builder.listenerStatus;
            this.loadBalancerId = builder.loadBalancerId;
            this.mss = builder.mss;
            this.proxyProtocolEnabled = builder.proxyProtocolEnabled;
            this.proxyProtocolV2Config = builder.proxyProtocolV2Config;
            this.regionId = builder.regionId;
            this.secSensorEnabled = builder.secSensorEnabled;
            this.securityPolicyId = builder.securityPolicyId;
            this.serverGroupId = builder.serverGroupId;
            this.startPort = builder.startPort;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Listeners create() {
            return builder().build();
        }

        /**
         * @return alpnEnabled
         */
        public Boolean getAlpnEnabled() {
            return this.alpnEnabled;
        }

        /**
         * @return alpnPolicy
         */
        public String getAlpnPolicy() {
            return this.alpnPolicy;
        }

        /**
         * @return caCertificateIds
         */
        public java.util.List < String > getCaCertificateIds() {
            return this.caCertificateIds;
        }

        /**
         * @return caEnabled
         */
        public Boolean getCaEnabled() {
            return this.caEnabled;
        }

        /**
         * @return certificateIds
         */
        public java.util.List < String > getCertificateIds() {
            return this.certificateIds;
        }

        /**
         * @return cps
         */
        public Integer getCps() {
            return this.cps;
        }

        /**
         * @return endPort
         */
        public String getEndPort() {
            return this.endPort;
        }

        /**
         * @return idleTimeout
         */
        public Integer getIdleTimeout() {
            return this.idleTimeout;
        }

        /**
         * @return listenerDescription
         */
        public String getListenerDescription() {
            return this.listenerDescription;
        }

        /**
         * @return listenerId
         */
        public String getListenerId() {
            return this.listenerId;
        }

        /**
         * @return listenerPort
         */
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        /**
         * @return listenerProtocol
         */
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        /**
         * @return listenerStatus
         */
        public String getListenerStatus() {
            return this.listenerStatus;
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return mss
         */
        public Integer getMss() {
            return this.mss;
        }

        /**
         * @return proxyProtocolEnabled
         */
        public Boolean getProxyProtocolEnabled() {
            return this.proxyProtocolEnabled;
        }

        /**
         * @return proxyProtocolV2Config
         */
        public ProxyProtocolV2Config getProxyProtocolV2Config() {
            return this.proxyProtocolV2Config;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return secSensorEnabled
         */
        public Boolean getSecSensorEnabled() {
            return this.secSensorEnabled;
        }

        /**
         * @return securityPolicyId
         */
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

        /**
         * @return serverGroupId
         */
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        /**
         * @return startPort
         */
        public String getStartPort() {
            return this.startPort;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Boolean alpnEnabled; 
            private String alpnPolicy; 
            private java.util.List < String > caCertificateIds; 
            private Boolean caEnabled; 
            private java.util.List < String > certificateIds; 
            private Integer cps; 
            private String endPort; 
            private Integer idleTimeout; 
            private String listenerDescription; 
            private String listenerId; 
            private Integer listenerPort; 
            private String listenerProtocol; 
            private String listenerStatus; 
            private String loadBalancerId; 
            private Integer mss; 
            private Boolean proxyProtocolEnabled; 
            private ProxyProtocolV2Config proxyProtocolV2Config; 
            private String regionId; 
            private Boolean secSensorEnabled; 
            private String securityPolicyId; 
            private String serverGroupId; 
            private String startPort; 
            private java.util.List < Tags> tags; 

            /**
             * Indicates whether Application-Layer Protocol Negotiation (ALPN) is enabled. Valid values:
             * <p>
             * 
             * *   **true**: enabled
             * *   **false**: disabled
             */
            public Builder alpnEnabled(Boolean alpnEnabled) {
                this.alpnEnabled = alpnEnabled;
                return this;
            }

            /**
             * The ALPN policy. Valid values:
             * <p>
             * 
             * *   **HTTP1Only**
             * *   **HTTP2Only**
             * *   **HTTP2Preferred**
             * *   **HTTP2Optional**
             */
            public Builder alpnPolicy(String alpnPolicy) {
                this.alpnPolicy = alpnPolicy;
                return this;
            }

            /**
             * The list of CA certificates.
             * <p>
             * 
             * >  This parameter takes effect only for listeners that use SSL over TCP.
             */
            public Builder caCertificateIds(java.util.List < String > caCertificateIds) {
                this.caCertificateIds = caCertificateIds;
                return this;
            }

            /**
             * Indicates whether mutual authentication is enabled. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder caEnabled(Boolean caEnabled) {
                this.caEnabled = caEnabled;
                return this;
            }

            /**
             * The list of server certificates.
             * <p>
             * 
             * >  This parameter takes effect only for listeners that use SSL over TCP.
             */
            public Builder certificateIds(java.util.List < String > certificateIds) {
                this.certificateIds = certificateIds;
                return this;
            }

            /**
             * The maximum number of connections that can be created per second on the NLB instance. Valid values: **0** to **1000000**. **0** indicates that the number of connections is unlimited.
             */
            public Builder cps(Integer cps) {
                this.cps = cps;
                return this;
            }

            /**
             * The last port in the listening port range.
             */
            public Builder endPort(String endPort) {
                this.endPort = endPort;
                return this;
            }

            /**
             * The timeout period of an idle connection. Unit: seconds. Valid values: **1** to **900**. Default value: **900**.
             */
            public Builder idleTimeout(Integer idleTimeout) {
                this.idleTimeout = idleTimeout;
                return this;
            }

            /**
             * The name of the listener.
             * <p>
             * 
             * The name must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (\_), and hyphens (-).
             */
            public Builder listenerDescription(String listenerDescription) {
                this.listenerDescription = listenerDescription;
                return this;
            }

            /**
             * The ID of the listener.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * The listening port.
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * The listening protocol. Valid values: **TCP**, **UDP**, and **TCPSSL**.
             */
            public Builder listenerProtocol(String listenerProtocol) {
                this.listenerProtocol = listenerProtocol;
                return this;
            }

            /**
             * The status of the listener. Valid values:
             * <p>
             * 
             * *   **Provisioning**
             * *   **Running**
             * *   **Configuring**
             * *   **Stopping**
             * *   **Stopped**
             * *   **Starting**
             * *   **Deleting**
             * *   **Deleted**
             */
            public Builder listenerStatus(String listenerStatus) {
                this.listenerStatus = listenerStatus;
                return this;
            }

            /**
             * The ID of the NLB instance.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * The maximum size of a TCP segment. Unit: bytes. Valid values: **0** to **1500**. **0** indicates that the maximum segment size remains unchanged.
             * <p>
             * 
             * >  This parameter is supported only by listeners that use SSL over TCP.
             */
            public Builder mss(Integer mss) {
                this.mss = mss;
                return this;
            }

            /**
             * Indicates whether the Proxy protocol is used to pass client IP addresses to backend servers. Valid values:
             * <p>
             * 
             * *   **true**: enabled
             * *   **false**: disabled
             */
            public Builder proxyProtocolEnabled(Boolean proxyProtocolEnabled) {
                this.proxyProtocolEnabled = proxyProtocolEnabled;
                return this;
            }

            /**
             * ProxyProtocolV2Config.
             */
            public Builder proxyProtocolV2Config(ProxyProtocolV2Config proxyProtocolV2Config) {
                this.proxyProtocolV2Config = proxyProtocolV2Config;
                return this;
            }

            /**
             * The ID of the region where the NLB instance is deployed.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Indicates whether fine-grained monitoring is enabled. Valid values:
             * <p>
             * 
             * *   **true**: enabled
             * *   **false**: disabled
             */
            public Builder secSensorEnabled(Boolean secSensorEnabled) {
                this.secSensorEnabled = secSensorEnabled;
                return this;
            }

            /**
             * The ID of the security policy.
             * <p>
             * 
             * >  This parameter takes effect only for listeners that use SSL over TCP.
             */
            public Builder securityPolicyId(String securityPolicyId) {
                this.securityPolicyId = securityPolicyId;
                return this;
            }

            /**
             * The ID of the server group.
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * The first port in the listening port range.
             */
            public Builder startPort(String startPort) {
                this.startPort = startPort;
                return this;
            }

            /**
             * The tag key.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Listeners build() {
                return new Listeners(this);
            } 

        } 

    }
}
