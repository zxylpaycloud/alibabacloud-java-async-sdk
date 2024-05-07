// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayRouteRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayRouteRequest</p>
 */
public class UpdateGatewayRouteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationType")
    private String destinationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectResponseJSON")
    private DirectResponseJSON directResponseJSON;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainIdListJSON")
    private String domainIdListJSON;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableWaf")
    private Boolean enableWaf;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Fallback")
    private Boolean fallback;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FallbackServices")
    private java.util.List < FallbackServices> fallbackServices;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private Long gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @Deprecated
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Predicates")
    private Predicates predicates;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RedirectJSON")
    private RedirectJSON redirectJSON;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteOrder")
    private Integer routeOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Services")
    private java.util.List < Services> services;

    private UpdateGatewayRouteRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.description = builder.description;
        this.destinationType = builder.destinationType;
        this.directResponseJSON = builder.directResponseJSON;
        this.domainIdListJSON = builder.domainIdListJSON;
        this.enableWaf = builder.enableWaf;
        this.fallback = builder.fallback;
        this.fallbackServices = builder.fallbackServices;
        this.gatewayId = builder.gatewayId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.id = builder.id;
        this.name = builder.name;
        this.predicates = builder.predicates;
        this.redirectJSON = builder.redirectJSON;
        this.routeOrder = builder.routeOrder;
        this.services = builder.services;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayRouteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destinationType
     */
    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * @return directResponseJSON
     */
    public DirectResponseJSON getDirectResponseJSON() {
        return this.directResponseJSON;
    }

    /**
     * @return domainIdListJSON
     */
    public String getDomainIdListJSON() {
        return this.domainIdListJSON;
    }

    /**
     * @return enableWaf
     */
    public Boolean getEnableWaf() {
        return this.enableWaf;
    }

    /**
     * @return fallback
     */
    public Boolean getFallback() {
        return this.fallback;
    }

    /**
     * @return fallbackServices
     */
    public java.util.List < FallbackServices> getFallbackServices() {
        return this.fallbackServices;
    }

    /**
     * @return gatewayId
     */
    public Long getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return predicates
     */
    public Predicates getPredicates() {
        return this.predicates;
    }

    /**
     * @return redirectJSON
     */
    public RedirectJSON getRedirectJSON() {
        return this.redirectJSON;
    }

    /**
     * @return routeOrder
     */
    public Integer getRouteOrder() {
        return this.routeOrder;
    }

    /**
     * @return services
     */
    public java.util.List < Services> getServices() {
        return this.services;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayRouteRequest, Builder> {
        private String acceptLanguage; 
        private String description; 
        private String destinationType; 
        private DirectResponseJSON directResponseJSON; 
        private String domainIdListJSON; 
        private Boolean enableWaf; 
        private Boolean fallback; 
        private java.util.List < FallbackServices> fallbackServices; 
        private Long gatewayId; 
        private String gatewayUniqueId; 
        private Long id; 
        private String name; 
        private Predicates predicates; 
        private RedirectJSON redirectJSON; 
        private Integer routeOrder; 
        private java.util.List < Services> services; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayRouteRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.description = request.description;
            this.destinationType = request.destinationType;
            this.directResponseJSON = request.directResponseJSON;
            this.domainIdListJSON = request.domainIdListJSON;
            this.enableWaf = request.enableWaf;
            this.fallback = request.fallback;
            this.fallbackServices = request.fallbackServices;
            this.gatewayId = request.gatewayId;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.id = request.id;
            this.name = request.name;
            this.predicates = request.predicates;
            this.redirectJSON = request.redirectJSON;
            this.routeOrder = request.routeOrder;
            this.services = request.services;
        } 

        /**
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The destination service type.
         */
        public Builder destinationType(String destinationType) {
            this.putQueryParameter("DestinationType", destinationType);
            this.destinationType = destinationType;
            return this;
        }

        /**
         * The information about service mocking.
         */
        public Builder directResponseJSON(DirectResponseJSON directResponseJSON) {
            String directResponseJSONShrink = shrink(directResponseJSON, "DirectResponseJSON", "json");
            this.putQueryParameter("DirectResponseJSON", directResponseJSONShrink);
            this.directResponseJSON = directResponseJSON;
            return this;
        }

        /**
         * The associated domain name.
         */
        public Builder domainIdListJSON(String domainIdListJSON) {
            this.putQueryParameter("DomainIdListJSON", domainIdListJSON);
            this.domainIdListJSON = domainIdListJSON;
            return this;
        }

        /**
         * Specifies whether to activate Web Application Firewall (WAF).
         */
        public Builder enableWaf(Boolean enableWaf) {
            this.putQueryParameter("EnableWaf", enableWaf);
            this.enableWaf = enableWaf;
            return this;
        }

        /**
         * Specifies whether to enable the Fallback service.
         */
        public Builder fallback(Boolean fallback) {
            this.putQueryParameter("Fallback", fallback);
            this.fallback = fallback;
            return this;
        }

        /**
         * The information about the Fallback service.
         */
        public Builder fallbackServices(java.util.List < FallbackServices> fallbackServices) {
            String fallbackServicesShrink = shrink(fallbackServices, "FallbackServices", "json");
            this.putQueryParameter("FallbackServices", fallbackServicesShrink);
            this.fallbackServices = fallbackServices;
            return this;
        }

        /**
         * The ID of the gateway.
         */
        public Builder gatewayId(Long gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * The unique ID of the gateway.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * The ID of the route.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The name of the route.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The route matching conditions.
         */
        public Builder predicates(Predicates predicates) {
            String predicatesShrink = shrink(predicates, "Predicates", "json");
            this.putQueryParameter("Predicates", predicatesShrink);
            this.predicates = predicates;
            return this;
        }

        /**
         * The information about redirection.
         */
        public Builder redirectJSON(RedirectJSON redirectJSON) {
            String redirectJSONShrink = shrink(redirectJSON, "RedirectJSON", "json");
            this.putQueryParameter("RedirectJSON", redirectJSONShrink);
            this.redirectJSON = redirectJSON;
            return this;
        }

        /**
         * The sequence number of the route.
         */
        public Builder routeOrder(Integer routeOrder) {
            this.putQueryParameter("RouteOrder", routeOrder);
            this.routeOrder = routeOrder;
            return this;
        }

        /**
         * The information about destination services.
         */
        public Builder services(java.util.List < Services> services) {
            String servicesShrink = shrink(services, "Services", "json");
            this.putQueryParameter("Services", servicesShrink);
            this.services = services;
            return this;
        }

        @Override
        public UpdateGatewayRouteRequest build() {
            return new UpdateGatewayRouteRequest(this);
        } 

    } 

    public static class DirectResponseJSON extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private String body;

        @com.aliyun.core.annotation.NameInMap("Code")
        private Long code;

        private DirectResponseJSON(Builder builder) {
            this.body = builder.body;
            this.code = builder.code;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DirectResponseJSON create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public String getBody() {
            return this.body;
        }

        /**
         * @return code
         */
        public Long getCode() {
            return this.code;
        }

        public static final class Builder {
            private String body; 
            private Long code; 

            /**
             * The mock return value.
             */
            public Builder body(String body) {
                this.body = body;
                return this;
            }

            /**
             * The mock return code.
             */
            public Builder code(Long code) {
                this.code = code;
                return this;
            }

            public DirectResponseJSON build() {
                return new DirectResponseJSON(this);
            } 

        } 

    }
    public static class FallbackServices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgreementType")
        private String agreementType;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private Integer percent;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private Long serviceId;

        @com.aliyun.core.annotation.NameInMap("ServicePort")
        private Integer servicePort;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private FallbackServices(Builder builder) {
            this.agreementType = builder.agreementType;
            this.groupName = builder.groupName;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.percent = builder.percent;
            this.serviceId = builder.serviceId;
            this.servicePort = builder.servicePort;
            this.sourceType = builder.sourceType;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FallbackServices create() {
            return builder().build();
        }

        /**
         * @return agreementType
         */
        public String getAgreementType() {
            return this.agreementType;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
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
         * @return percent
         */
        public Integer getPercent() {
            return this.percent;
        }

        /**
         * @return serviceId
         */
        public Long getServiceId() {
            return this.serviceId;
        }

        /**
         * @return servicePort
         */
        public Integer getServicePort() {
            return this.servicePort;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String agreementType; 
            private String groupName; 
            private String name; 
            private String namespace; 
            private Integer percent; 
            private Long serviceId; 
            private Integer servicePort; 
            private String sourceType; 
            private String version; 

            /**
             * The type of the protocol. Valid values:
             */
            public Builder agreementType(String agreementType) {
                this.agreementType = agreementType;
                return this;
            }

            /**
             * The name of the group to which the service belongs.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The namespace in which the service resides.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The weight in the form of a percentage value.
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The ID of the service.
             */
            public Builder serviceId(Long serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * The service port number.
             */
            public Builder servicePort(Integer servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * The source type.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * The version of the service.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public FallbackServices build() {
                return new FallbackServices(this);
            } 

        } 

    }
    public static class HeaderPredicates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private HeaderPredicates(Builder builder) {
            this.key = builder.key;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeaderPredicates create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String type; 
            private String value; 

            /**
             * The key of the request header.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The matching type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The value of the request header.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public HeaderPredicates build() {
                return new HeaderPredicates(this);
            } 

        } 

    }
    public static class PathPredicates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IgnoreCase")
        private Boolean ignoreCase;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private PathPredicates(Builder builder) {
            this.ignoreCase = builder.ignoreCase;
            this.path = builder.path;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PathPredicates create() {
            return builder().build();
        }

        /**
         * @return ignoreCase
         */
        public Boolean getIgnoreCase() {
            return this.ignoreCase;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean ignoreCase; 
            private String path; 
            private String type; 

            /**
             * Specifies whether to perform case-insensitive matching.
             */
            public Builder ignoreCase(Boolean ignoreCase) {
                this.ignoreCase = ignoreCase;
                return this;
            }

            /**
             * The path used for route matching.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * The matching type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PathPredicates build() {
                return new PathPredicates(this);
            } 

        } 

    }
    public static class QueryPredicates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private QueryPredicates(Builder builder) {
            this.key = builder.key;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryPredicates create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String type; 
            private String value; 

            /**
             * The name of the parameter.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The matching type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The value of the parameter.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public QueryPredicates build() {
                return new QueryPredicates(this);
            } 

        } 

    }
    public static class Predicates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HeaderPredicates")
        private java.util.List < HeaderPredicates> headerPredicates;

        @com.aliyun.core.annotation.NameInMap("MethodPredicates")
        private java.util.List < String > methodPredicates;

        @com.aliyun.core.annotation.NameInMap("PathPredicates")
        private PathPredicates pathPredicates;

        @com.aliyun.core.annotation.NameInMap("QueryPredicates")
        private java.util.List < QueryPredicates> queryPredicates;

        private Predicates(Builder builder) {
            this.headerPredicates = builder.headerPredicates;
            this.methodPredicates = builder.methodPredicates;
            this.pathPredicates = builder.pathPredicates;
            this.queryPredicates = builder.queryPredicates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Predicates create() {
            return builder().build();
        }

        /**
         * @return headerPredicates
         */
        public java.util.List < HeaderPredicates> getHeaderPredicates() {
            return this.headerPredicates;
        }

        /**
         * @return methodPredicates
         */
        public java.util.List < String > getMethodPredicates() {
            return this.methodPredicates;
        }

        /**
         * @return pathPredicates
         */
        public PathPredicates getPathPredicates() {
            return this.pathPredicates;
        }

        /**
         * @return queryPredicates
         */
        public java.util.List < QueryPredicates> getQueryPredicates() {
            return this.queryPredicates;
        }

        public static final class Builder {
            private java.util.List < HeaderPredicates> headerPredicates; 
            private java.util.List < String > methodPredicates; 
            private PathPredicates pathPredicates; 
            private java.util.List < QueryPredicates> queryPredicates; 

            /**
             * The information about header matching.
             */
            public Builder headerPredicates(java.util.List < HeaderPredicates> headerPredicates) {
                this.headerPredicates = headerPredicates;
                return this;
            }

            /**
             * The information about method matching.
             */
            public Builder methodPredicates(java.util.List < String > methodPredicates) {
                this.methodPredicates = methodPredicates;
                return this;
            }

            /**
             * The information about path matching.
             */
            public Builder pathPredicates(PathPredicates pathPredicates) {
                this.pathPredicates = pathPredicates;
                return this;
            }

            /**
             * The information about parameter matching.
             */
            public Builder queryPredicates(java.util.List < QueryPredicates> queryPredicates) {
                this.queryPredicates = queryPredicates;
                return this;
            }

            public Predicates build() {
                return new Predicates(this);
            } 

        } 

    }
    public static class RedirectJSON extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private RedirectJSON(Builder builder) {
            this.code = builder.code;
            this.host = builder.host;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RedirectJSON create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private Integer code; 
            private String host; 
            private String path; 

            /**
             * The status code returned.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * The hostname to be redirected to.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The path to be redirected to.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public RedirectJSON build() {
                return new RedirectJSON(this);
            } 

        } 

    }
    public static class ParamMapsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtractKey")
        private String extractKey;

        @com.aliyun.core.annotation.NameInMap("ExtractKeySpec")
        private String extractKeySpec;

        @com.aliyun.core.annotation.NameInMap("MappingType")
        private String mappingType;

        private ParamMapsList(Builder builder) {
            this.extractKey = builder.extractKey;
            this.extractKeySpec = builder.extractKeySpec;
            this.mappingType = builder.mappingType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamMapsList create() {
            return builder().build();
        }

        /**
         * @return extractKey
         */
        public String getExtractKey() {
            return this.extractKey;
        }

        /**
         * @return extractKeySpec
         */
        public String getExtractKeySpec() {
            return this.extractKeySpec;
        }

        /**
         * @return mappingType
         */
        public String getMappingType() {
            return this.mappingType;
        }

        public static final class Builder {
            private String extractKey; 
            private String extractKeySpec; 
            private String mappingType; 

            /**
             * The key extracted from the input parameter.
             */
            public Builder extractKey(String extractKey) {
                this.extractKey = extractKey;
                return this;
            }

            /**
             * The position of the input parameter.
             * <p>
             * 
             * > Valid values:
             * 
             * *   `ALL_QUERY_PARAMETER`: request parameter
             * 
             * *   `ALL_HEADER`: request header
             * 
             * *   `ALL_PATH`: request path
             * 
             * *   `ALL_BODY`: request body
             */
            public Builder extractKeySpec(String extractKeySpec) {
                this.extractKeySpec = extractKeySpec;
                return this;
            }

            /**
             * The type of the backend service parameter.
             */
            public Builder mappingType(String mappingType) {
                this.mappingType = mappingType;
                return this;
            }

            public ParamMapsList build() {
                return new ParamMapsList(this);
            } 

        } 

    }
    public static class MothedMapList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DubboMothedName")
        private String dubboMothedName;

        @com.aliyun.core.annotation.NameInMap("HttpMothed")
        private String httpMothed;

        @com.aliyun.core.annotation.NameInMap("Mothedpath")
        private String mothedpath;

        @com.aliyun.core.annotation.NameInMap("ParamMapsList")
        private java.util.List < ParamMapsList> paramMapsList;

        @com.aliyun.core.annotation.NameInMap("PassThroughAllHeaders")
        private String passThroughAllHeaders;

        @com.aliyun.core.annotation.NameInMap("PassThroughList")
        private java.util.List < String > passThroughList;

        private MothedMapList(Builder builder) {
            this.dubboMothedName = builder.dubboMothedName;
            this.httpMothed = builder.httpMothed;
            this.mothedpath = builder.mothedpath;
            this.paramMapsList = builder.paramMapsList;
            this.passThroughAllHeaders = builder.passThroughAllHeaders;
            this.passThroughList = builder.passThroughList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MothedMapList create() {
            return builder().build();
        }

        /**
         * @return dubboMothedName
         */
        public String getDubboMothedName() {
            return this.dubboMothedName;
        }

        /**
         * @return httpMothed
         */
        public String getHttpMothed() {
            return this.httpMothed;
        }

        /**
         * @return mothedpath
         */
        public String getMothedpath() {
            return this.mothedpath;
        }

        /**
         * @return paramMapsList
         */
        public java.util.List < ParamMapsList> getParamMapsList() {
            return this.paramMapsList;
        }

        /**
         * @return passThroughAllHeaders
         */
        public String getPassThroughAllHeaders() {
            return this.passThroughAllHeaders;
        }

        /**
         * @return passThroughList
         */
        public java.util.List < String > getPassThroughList() {
            return this.passThroughList;
        }

        public static final class Builder {
            private String dubboMothedName; 
            private String httpMothed; 
            private String mothedpath; 
            private java.util.List < ParamMapsList> paramMapsList; 
            private String passThroughAllHeaders; 
            private java.util.List < String > passThroughList; 

            /**
             * The method name of the Dubbo service.
             */
            public Builder dubboMothedName(String dubboMothedName) {
                this.dubboMothedName = dubboMothedName;
                return this;
            }

            /**
             * The HTTP method.
             * <p>
             * 
             * > Valid values:
             * 
             * *   ALL_GET
             * 
             * *   ALL_POST
             * 
             * *   ALL_PUT
             * 
             * *   ALL_DELETE
             * 
             * *   ALL_PATCH
             */
            public Builder httpMothed(String httpMothed) {
                this.httpMothed = httpMothed;
                return this;
            }

            /**
             * The path that is used to match a method.
             */
            public Builder mothedpath(String mothedpath) {
                this.mothedpath = mothedpath;
                return this;
            }

            /**
             * The information of parameter mappings.
             */
            public Builder paramMapsList(java.util.List < ParamMapsList> paramMapsList) {
                this.paramMapsList = paramMapsList;
                return this;
            }

            /**
             * The pass-through type of the header.
             * <p>
             * 
             * > Valid values:
             * 
             * *   PASS_ALL: All headers are passed through.
             * 
             * *   PASS_NOT: All headers are not passed through.
             * 
             * *   PASS_ASSIGN: Specified headers are passed through.
             */
            public Builder passThroughAllHeaders(String passThroughAllHeaders) {
                this.passThroughAllHeaders = passThroughAllHeaders;
                return this;
            }

            /**
             * The list of headers to be passed through.
             */
            public Builder passThroughList(java.util.List < String > passThroughList) {
                this.passThroughList = passThroughList;
                return this;
            }

            public MothedMapList build() {
                return new MothedMapList(this);
            } 

        } 

    }
    public static class HttpDubboTranscoder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DubboServiceGroup")
        private String dubboServiceGroup;

        @com.aliyun.core.annotation.NameInMap("DubboServiceName")
        private String dubboServiceName;

        @com.aliyun.core.annotation.NameInMap("DubboServiceVersion")
        private String dubboServiceVersion;

        @com.aliyun.core.annotation.NameInMap("MothedMapList")
        private java.util.List < MothedMapList> mothedMapList;

        private HttpDubboTranscoder(Builder builder) {
            this.dubboServiceGroup = builder.dubboServiceGroup;
            this.dubboServiceName = builder.dubboServiceName;
            this.dubboServiceVersion = builder.dubboServiceVersion;
            this.mothedMapList = builder.mothedMapList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpDubboTranscoder create() {
            return builder().build();
        }

        /**
         * @return dubboServiceGroup
         */
        public String getDubboServiceGroup() {
            return this.dubboServiceGroup;
        }

        /**
         * @return dubboServiceName
         */
        public String getDubboServiceName() {
            return this.dubboServiceName;
        }

        /**
         * @return dubboServiceVersion
         */
        public String getDubboServiceVersion() {
            return this.dubboServiceVersion;
        }

        /**
         * @return mothedMapList
         */
        public java.util.List < MothedMapList> getMothedMapList() {
            return this.mothedMapList;
        }

        public static final class Builder {
            private String dubboServiceGroup; 
            private String dubboServiceName; 
            private String dubboServiceVersion; 
            private java.util.List < MothedMapList> mothedMapList; 

            /**
             * The Dubbo service group.
             */
            public Builder dubboServiceGroup(String dubboServiceGroup) {
                this.dubboServiceGroup = dubboServiceGroup;
                return this;
            }

            /**
             * The name of the Dubbo service.
             */
            public Builder dubboServiceName(String dubboServiceName) {
                this.dubboServiceName = dubboServiceName;
                return this;
            }

            /**
             * The version of the Dubbo service.
             */
            public Builder dubboServiceVersion(String dubboServiceVersion) {
                this.dubboServiceVersion = dubboServiceVersion;
                return this;
            }

            /**
             * The forwarding rules of the Dubbo service.
             */
            public Builder mothedMapList(java.util.List < MothedMapList> mothedMapList) {
                this.mothedMapList = mothedMapList;
                return this;
            }

            public HttpDubboTranscoder build() {
                return new HttpDubboTranscoder(this);
            } 

        } 

    }
    public static class Services extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgreementType")
        private String agreementType;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("HttpDubboTranscoder")
        private HttpDubboTranscoder httpDubboTranscoder;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private Integer percent;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private Long serviceId;

        @com.aliyun.core.annotation.NameInMap("ServicePort")
        private Integer servicePort;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Services(Builder builder) {
            this.agreementType = builder.agreementType;
            this.groupName = builder.groupName;
            this.httpDubboTranscoder = builder.httpDubboTranscoder;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.percent = builder.percent;
            this.serviceId = builder.serviceId;
            this.servicePort = builder.servicePort;
            this.sourceType = builder.sourceType;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Services create() {
            return builder().build();
        }

        /**
         * @return agreementType
         */
        public String getAgreementType() {
            return this.agreementType;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return httpDubboTranscoder
         */
        public HttpDubboTranscoder getHttpDubboTranscoder() {
            return this.httpDubboTranscoder;
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
         * @return percent
         */
        public Integer getPercent() {
            return this.percent;
        }

        /**
         * @return serviceId
         */
        public Long getServiceId() {
            return this.serviceId;
        }

        /**
         * @return servicePort
         */
        public Integer getServicePort() {
            return this.servicePort;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String agreementType; 
            private String groupName; 
            private HttpDubboTranscoder httpDubboTranscoder; 
            private String name; 
            private String namespace; 
            private Integer percent; 
            private Long serviceId; 
            private Integer servicePort; 
            private String sourceType; 
            private String version; 

            /**
             * The type of the protocol. Valid values:
             */
            public Builder agreementType(String agreementType) {
                this.agreementType = agreementType;
                return this;
            }

            /**
             * The name of the group to which the service belongs.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The transcoder of the Dubbo protocol.
             */
            public Builder httpDubboTranscoder(HttpDubboTranscoder httpDubboTranscoder) {
                this.httpDubboTranscoder = httpDubboTranscoder;
                return this;
            }

            /**
             * The name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The namespace in which the service resides.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The percentage.
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
                return this;
            }

            /**
             * The ID of the service.
             */
            public Builder serviceId(Long serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * The Dubbo port number.
             */
            public Builder servicePort(Integer servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * The source type.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * The version of the service.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Services build() {
                return new Services(this);
            } 

        } 

    }
}
