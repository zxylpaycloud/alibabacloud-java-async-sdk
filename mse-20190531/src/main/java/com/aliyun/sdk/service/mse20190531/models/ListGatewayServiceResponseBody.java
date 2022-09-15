// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGatewayServiceResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayServiceResponseBody</p>
 */
public class ListGatewayServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListGatewayServiceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListGatewayServiceResponseBody build() {
            return new ListGatewayServiceResponseBody(this);
        } 

    } 

    public static class HttpCookie extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Path")
        private String path;

        @NameInMap("Ttl")
        private String ttl;

        private HttpCookie(Builder builder) {
            this.name = builder.name;
            this.path = builder.path;
            this.ttl = builder.ttl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpCookie create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return ttl
         */
        public String getTtl() {
            return this.ttl;
        }

        public static final class Builder {
            private String name; 
            private String path; 
            private String ttl; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Ttl.
             */
            public Builder ttl(String ttl) {
                this.ttl = ttl;
                return this;
            }

            public HttpCookie build() {
                return new HttpCookie(this);
            } 

        } 

    }
    public static class ConsistentHashLBConfig extends TeaModel {
        @NameInMap("ConsistentHashLBType")
        private String consistentHashLBType;

        @NameInMap("HttpCookie")
        private HttpCookie httpCookie;

        @NameInMap("MinimumRingSize")
        private Long minimumRingSize;

        @NameInMap("ParameterName")
        private String parameterName;

        private ConsistentHashLBConfig(Builder builder) {
            this.consistentHashLBType = builder.consistentHashLBType;
            this.httpCookie = builder.httpCookie;
            this.minimumRingSize = builder.minimumRingSize;
            this.parameterName = builder.parameterName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsistentHashLBConfig create() {
            return builder().build();
        }

        /**
         * @return consistentHashLBType
         */
        public String getConsistentHashLBType() {
            return this.consistentHashLBType;
        }

        /**
         * @return httpCookie
         */
        public HttpCookie getHttpCookie() {
            return this.httpCookie;
        }

        /**
         * @return minimumRingSize
         */
        public Long getMinimumRingSize() {
            return this.minimumRingSize;
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        public static final class Builder {
            private String consistentHashLBType; 
            private HttpCookie httpCookie; 
            private Long minimumRingSize; 
            private String parameterName; 

            /**
             * HEADER, COOKIE, SOURCE_IP, QUERY_PARAMETER
             */
            public Builder consistentHashLBType(String consistentHashLBType) {
                this.consistentHashLBType = consistentHashLBType;
                return this;
            }

            /**
             * HttpCookie.
             */
            public Builder httpCookie(HttpCookie httpCookie) {
                this.httpCookie = httpCookie;
                return this;
            }

            /**
             * MinimumRingSize.
             */
            public Builder minimumRingSize(Long minimumRingSize) {
                this.minimumRingSize = minimumRingSize;
                return this;
            }

            /**
             * ParameterName.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            public ConsistentHashLBConfig build() {
                return new ConsistentHashLBConfig(this);
            } 

        } 

    }
    public static class LoadBalancerSettings extends TeaModel {
        @NameInMap("ConsistentHashLBConfig")
        private ConsistentHashLBConfig consistentHashLBConfig;

        @NameInMap("LoadbalancerType")
        private String loadbalancerType;

        @NameInMap("WarmupDuration")
        private Integer warmupDuration;

        private LoadBalancerSettings(Builder builder) {
            this.consistentHashLBConfig = builder.consistentHashLBConfig;
            this.loadbalancerType = builder.loadbalancerType;
            this.warmupDuration = builder.warmupDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerSettings create() {
            return builder().build();
        }

        /**
         * @return consistentHashLBConfig
         */
        public ConsistentHashLBConfig getConsistentHashLBConfig() {
            return this.consistentHashLBConfig;
        }

        /**
         * @return loadbalancerType
         */
        public String getLoadbalancerType() {
            return this.loadbalancerType;
        }

        /**
         * @return warmupDuration
         */
        public Integer getWarmupDuration() {
            return this.warmupDuration;
        }

        public static final class Builder {
            private ConsistentHashLBConfig consistentHashLBConfig; 
            private String loadbalancerType; 
            private Integer warmupDuration; 

            /**
             * ConsistentHashLBConfig.
             */
            public Builder consistentHashLBConfig(ConsistentHashLBConfig consistentHashLBConfig) {
                this.consistentHashLBConfig = consistentHashLBConfig;
                return this;
            }

            /**
             * ROUND_ROBIN, LEAST_CONN, RANDOM, CONSISTENT_HASH
             */
            public Builder loadbalancerType(String loadbalancerType) {
                this.loadbalancerType = loadbalancerType;
                return this;
            }

            /**
             * WarmupDuration.
             */
            public Builder warmupDuration(Integer warmupDuration) {
                this.warmupDuration = warmupDuration;
                return this;
            }

            public LoadBalancerSettings build() {
                return new LoadBalancerSettings(this);
            } 

        } 

    }
    public static class Tls extends TeaModel {
        @NameInMap("CaCertContent")
        private String caCertContent;

        @NameInMap("CaCertId")
        private String caCertId;

        @NameInMap("CertId")
        private String certId;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("Sni")
        private String sni;

        @NameInMap("SubjectAltNames")
        private java.util.List < String > subjectAltNames;

        private Tls(Builder builder) {
            this.caCertContent = builder.caCertContent;
            this.caCertId = builder.caCertId;
            this.certId = builder.certId;
            this.mode = builder.mode;
            this.sni = builder.sni;
            this.subjectAltNames = builder.subjectAltNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tls create() {
            return builder().build();
        }

        /**
         * @return caCertContent
         */
        public String getCaCertContent() {
            return this.caCertContent;
        }

        /**
         * @return caCertId
         */
        public String getCaCertId() {
            return this.caCertId;
        }

        /**
         * @return certId
         */
        public String getCertId() {
            return this.certId;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return sni
         */
        public String getSni() {
            return this.sni;
        }

        /**
         * @return subjectAltNames
         */
        public java.util.List < String > getSubjectAltNames() {
            return this.subjectAltNames;
        }

        public static final class Builder {
            private String caCertContent; 
            private String caCertId; 
            private String certId; 
            private String mode; 
            private String sni; 
            private java.util.List < String > subjectAltNames; 

            /**
             * CaCertContent.
             */
            public Builder caCertContent(String caCertContent) {
                this.caCertContent = caCertContent;
                return this;
            }

            /**
             * CaCertId.
             */
            public Builder caCertId(String caCertId) {
                this.caCertId = caCertId;
                return this;
            }

            /**
             * CertId.
             */
            public Builder certId(String certId) {
                this.certId = certId;
                return this;
            }

            /**
             * DISABLE, SIMPLE, MUTUAL, ISTIO_MUTUAL
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Sni.
             */
            public Builder sni(String sni) {
                this.sni = sni;
                return this;
            }

            /**
             * SubjectAltNames.
             */
            public Builder subjectAltNames(java.util.List < String > subjectAltNames) {
                this.subjectAltNames = subjectAltNames;
                return this;
            }

            public Tls build() {
                return new Tls(this);
            } 

        } 

    }
    public static class GatewayTrafficPolicy extends TeaModel {
        @NameInMap("LoadBalancerSettings")
        private LoadBalancerSettings loadBalancerSettings;

        @NameInMap("Tls")
        private Tls tls;

        private GatewayTrafficPolicy(Builder builder) {
            this.loadBalancerSettings = builder.loadBalancerSettings;
            this.tls = builder.tls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayTrafficPolicy create() {
            return builder().build();
        }

        /**
         * @return loadBalancerSettings
         */
        public LoadBalancerSettings getLoadBalancerSettings() {
            return this.loadBalancerSettings;
        }

        /**
         * @return tls
         */
        public Tls getTls() {
            return this.tls;
        }

        public static final class Builder {
            private LoadBalancerSettings loadBalancerSettings; 
            private Tls tls; 

            /**
             * LoadBalancerSettings.
             */
            public Builder loadBalancerSettings(LoadBalancerSettings loadBalancerSettings) {
                this.loadBalancerSettings = loadBalancerSettings;
                return this;
            }

            /**
             * Tls.
             */
            public Builder tls(Tls tls) {
                this.tls = tls;
                return this;
            }

            public GatewayTrafficPolicy build() {
                return new GatewayTrafficPolicy(this);
            } 

        } 

    }
    public static class HealthCheckInfo extends TeaModel {
        @NameInMap("Check")
        private Boolean check;

        @NameInMap("ExpectedStatuses")
        private java.util.List < Integer > expectedStatuses;

        @NameInMap("HealthyThreshold")
        private Integer healthyThreshold;

        @NameInMap("HttpHost")
        private String httpHost;

        @NameInMap("HttpPath")
        private String httpPath;

        @NameInMap("Interval")
        private Integer interval;

        @NameInMap("Protocol")
        private String protocol;

        @NameInMap("Timeout")
        private Integer timeout;

        @NameInMap("UnhealthyThreshold")
        private Integer unhealthyThreshold;

        private HealthCheckInfo(Builder builder) {
            this.check = builder.check;
            this.expectedStatuses = builder.expectedStatuses;
            this.healthyThreshold = builder.healthyThreshold;
            this.httpHost = builder.httpHost;
            this.httpPath = builder.httpPath;
            this.interval = builder.interval;
            this.protocol = builder.protocol;
            this.timeout = builder.timeout;
            this.unhealthyThreshold = builder.unhealthyThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthCheckInfo create() {
            return builder().build();
        }

        /**
         * @return check
         */
        public Boolean getCheck() {
            return this.check;
        }

        /**
         * @return expectedStatuses
         */
        public java.util.List < Integer > getExpectedStatuses() {
            return this.expectedStatuses;
        }

        /**
         * @return healthyThreshold
         */
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        /**
         * @return httpHost
         */
        public String getHttpHost() {
            return this.httpHost;
        }

        /**
         * @return httpPath
         */
        public String getHttpPath() {
            return this.httpPath;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return unhealthyThreshold
         */
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public static final class Builder {
            private Boolean check; 
            private java.util.List < Integer > expectedStatuses; 
            private Integer healthyThreshold; 
            private String httpHost; 
            private String httpPath; 
            private Integer interval; 
            private String protocol; 
            private Integer timeout; 
            private Integer unhealthyThreshold; 

            /**
             * Check.
             */
            public Builder check(Boolean check) {
                this.check = check;
                return this;
            }

            /**
             * ExpectedStatuses.
             */
            public Builder expectedStatuses(java.util.List < Integer > expectedStatuses) {
                this.expectedStatuses = expectedStatuses;
                return this;
            }

            /**
             * HealthyThreshold.
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * HttpHost.
             */
            public Builder httpHost(String httpHost) {
                this.httpHost = httpHost;
                return this;
            }

            /**
             * HttpPath.
             */
            public Builder httpPath(String httpPath) {
                this.httpPath = httpPath;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * Timeout.
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * UnhealthyThreshold.
             */
            public Builder unhealthyThreshold(Integer unhealthyThreshold) {
                this.unhealthyThreshold = unhealthyThreshold;
                return this;
            }

            public HealthCheckInfo build() {
                return new HealthCheckInfo(this);
            } 

        } 

    }
    public static class Versions extends TeaModel {
        @NameInMap("Name")
        private String name;

        private Versions(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Versions create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("GatewayId")
        private Long gatewayId;

        @NameInMap("GatewayTrafficPolicy")
        private GatewayTrafficPolicy gatewayTrafficPolicy;

        @NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("HealehStatus")
        private String healehStatus;

        @NameInMap("HealthCheck")
        private Boolean healthCheck;

        @NameInMap("HealthCheckInfo")
        private HealthCheckInfo healthCheckInfo;

        @NameInMap("HealthStatus")
        private String healthStatus;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Ips")
        private java.util.List < String > ips;

        @NameInMap("MetaInfo")
        private String metaInfo;

        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("ServiceNameInRegistry")
        private String serviceNameInRegistry;

        @NameInMap("ServicePort")
        private Long servicePort;

        @NameInMap("ServiceProtocol")
        private String serviceProtocol;

        @NameInMap("SourceId")
        private Long sourceId;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("UnhealthyEndpoints")
        private java.util.List < String > unhealthyEndpoints;

        @NameInMap("Versions")
        private java.util.List < Versions> versions;

        private Result(Builder builder) {
            this.gatewayId = builder.gatewayId;
            this.gatewayTrafficPolicy = builder.gatewayTrafficPolicy;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.groupName = builder.groupName;
            this.healehStatus = builder.healehStatus;
            this.healthCheck = builder.healthCheck;
            this.healthCheckInfo = builder.healthCheckInfo;
            this.healthStatus = builder.healthStatus;
            this.id = builder.id;
            this.ips = builder.ips;
            this.metaInfo = builder.metaInfo;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.serviceNameInRegistry = builder.serviceNameInRegistry;
            this.servicePort = builder.servicePort;
            this.serviceProtocol = builder.serviceProtocol;
            this.sourceId = builder.sourceId;
            this.sourceType = builder.sourceType;
            this.unhealthyEndpoints = builder.unhealthyEndpoints;
            this.versions = builder.versions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return gatewayId
         */
        public Long getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayTrafficPolicy
         */
        public GatewayTrafficPolicy getGatewayTrafficPolicy() {
            return this.gatewayTrafficPolicy;
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return healehStatus
         */
        public String getHealehStatus() {
            return this.healehStatus;
        }

        /**
         * @return healthCheck
         */
        public Boolean getHealthCheck() {
            return this.healthCheck;
        }

        /**
         * @return healthCheckInfo
         */
        public HealthCheckInfo getHealthCheckInfo() {
            return this.healthCheckInfo;
        }

        /**
         * @return healthStatus
         */
        public String getHealthStatus() {
            return this.healthStatus;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ips
         */
        public java.util.List < String > getIps() {
            return this.ips;
        }

        /**
         * @return metaInfo
         */
        public String getMetaInfo() {
            return this.metaInfo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return serviceNameInRegistry
         */
        public String getServiceNameInRegistry() {
            return this.serviceNameInRegistry;
        }

        /**
         * @return servicePort
         */
        public Long getServicePort() {
            return this.servicePort;
        }

        /**
         * @return serviceProtocol
         */
        public String getServiceProtocol() {
            return this.serviceProtocol;
        }

        /**
         * @return sourceId
         */
        public Long getSourceId() {
            return this.sourceId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return unhealthyEndpoints
         */
        public java.util.List < String > getUnhealthyEndpoints() {
            return this.unhealthyEndpoints;
        }

        /**
         * @return versions
         */
        public java.util.List < Versions> getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private Long gatewayId; 
            private GatewayTrafficPolicy gatewayTrafficPolicy; 
            private String gatewayUniqueId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String groupName; 
            private String healehStatus; 
            private Boolean healthCheck; 
            private HealthCheckInfo healthCheckInfo; 
            private String healthStatus; 
            private Long id; 
            private java.util.List < String > ips; 
            private String metaInfo; 
            private String name; 
            private String namespace; 
            private String serviceNameInRegistry; 
            private Long servicePort; 
            private String serviceProtocol; 
            private Long sourceId; 
            private String sourceType; 
            private java.util.List < String > unhealthyEndpoints; 
            private java.util.List < Versions> versions; 

            /**
             * GatewayId.
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * GatewayTrafficPolicy.
             */
            public Builder gatewayTrafficPolicy(GatewayTrafficPolicy gatewayTrafficPolicy) {
                this.gatewayTrafficPolicy = gatewayTrafficPolicy;
                return this;
            }

            /**
             * GatewayUniqueId.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * HealehStatus.
             */
            public Builder healehStatus(String healehStatus) {
                this.healehStatus = healehStatus;
                return this;
            }

            /**
             * HealthCheck.
             */
            public Builder healthCheck(Boolean healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * HealthCheckInfo.
             */
            public Builder healthCheckInfo(HealthCheckInfo healthCheckInfo) {
                this.healthCheckInfo = healthCheckInfo;
                return this;
            }

            /**
             * HealthStatus.
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
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
             * Ips.
             */
            public Builder ips(java.util.List < String > ips) {
                this.ips = ips;
                return this;
            }

            /**
             * MetaInfo.
             */
            public Builder metaInfo(String metaInfo) {
                this.metaInfo = metaInfo;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * ServiceNameInRegistry.
             */
            public Builder serviceNameInRegistry(String serviceNameInRegistry) {
                this.serviceNameInRegistry = serviceNameInRegistry;
                return this;
            }

            /**
             * ServicePort.
             */
            public Builder servicePort(Long servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * ServiceProtocol.
             */
            public Builder serviceProtocol(String serviceProtocol) {
                this.serviceProtocol = serviceProtocol;
                return this;
            }

            /**
             * SourceId.
             */
            public Builder sourceId(Long sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * UnhealthyEndpoints.
             */
            public Builder unhealthyEndpoints(java.util.List < String > unhealthyEndpoints) {
                this.unhealthyEndpoints = unhealthyEndpoints;
                return this;
            }

            /**
             * Versions.
             */
            public Builder versions(java.util.List < Versions> versions) {
                this.versions = versions;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Result")
        private java.util.List < Result> result;

        @NameInMap("TotalSize")
        private Long totalSize;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.result = builder.result;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return result
         */
        public java.util.List < Result> getResult() {
            return this.result;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List < Result> result; 
            private Long totalSize; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
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
             * Result.
             */
            public Builder result(java.util.List < Result> result) {
                this.result = result;
                return this;
            }

            /**
             * TotalSize.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
