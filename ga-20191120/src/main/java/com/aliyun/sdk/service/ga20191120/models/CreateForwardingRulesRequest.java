// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateForwardingRulesRequest} extends {@link RequestModel}
 *
 * <p>CreateForwardingRulesRequest</p>
 */
public class CreateForwardingRulesRequest extends Request {
    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ForwardingRules")
    @Validation(required = true)
    private java.util.List < ForwardingRules> forwardingRules;

    @Query
    @NameInMap("ListenerId")
    @Validation(required = true)
    private String listenerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateForwardingRulesRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.forwardingRules = builder.forwardingRules;
        this.listenerId = builder.listenerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateForwardingRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return forwardingRules
     */
    public java.util.List < ForwardingRules> getForwardingRules() {
        return this.forwardingRules;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateForwardingRulesRequest, Builder> {
        private String acceleratorId; 
        private String clientToken; 
        private java.util.List < ForwardingRules> forwardingRules; 
        private String listenerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateForwardingRulesRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.clientToken = request.clientToken;
            this.forwardingRules = request.forwardingRules;
            this.listenerId = request.listenerId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the GA instance.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Details about the forwarding rules.
         */
        public Builder forwardingRules(java.util.List < ForwardingRules> forwardingRules) {
            this.putQueryParameter("ForwardingRules", forwardingRules);
            this.forwardingRules = forwardingRules;
            return this;
        }

        /**
         * The ID of the listener.
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateForwardingRulesRequest build() {
            return new CreateForwardingRulesRequest(this);
        } 

    } 

    public static class ServerGroupTuples extends TeaModel {
        @NameInMap("EndpointGroupId")
        @Validation(required = true)
        private String endpointGroupId;

        private ServerGroupTuples(Builder builder) {
            this.endpointGroupId = builder.endpointGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerGroupTuples create() {
            return builder().build();
        }

        /**
         * @return endpointGroupId
         */
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        public static final class Builder {
            private String endpointGroupId; 

            /**
             * The ID of the endpoint group.
             * <p>
             * 
             * >  For GA instances created after July 12, 2022, all forwarding condition types and forwarding action types are supported. We recommend that you call **RuleActionType** and **RuleActionValue** to query forwarding actions.
             */
            public Builder endpointGroupId(String endpointGroupId) {
                this.endpointGroupId = endpointGroupId;
                return this;
            }

            public ServerGroupTuples build() {
                return new ServerGroupTuples(this);
            } 

        } 

    }
    public static class ForwardGroupConfig extends TeaModel {
        @NameInMap("ServerGroupTuples")
        @Validation(required = true)
        private java.util.List < ServerGroupTuples> serverGroupTuples;

        private ForwardGroupConfig(Builder builder) {
            this.serverGroupTuples = builder.serverGroupTuples;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardGroupConfig create() {
            return builder().build();
        }

        /**
         * @return serverGroupTuples
         */
        public java.util.List < ServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

        public static final class Builder {
            private java.util.List < ServerGroupTuples> serverGroupTuples; 

            /**
             * The information about the endpoint group.
             * <p>
             * 
             * >  For GA instances created after July 12, 2022, all forwarding condition types and forwarding action types are supported. We recommend that you call **RuleActionType** and **RuleActionValue** to query forwarding actions.
             */
            public Builder serverGroupTuples(java.util.List < ServerGroupTuples> serverGroupTuples) {
                this.serverGroupTuples = serverGroupTuples;
                return this;
            }

            public ForwardGroupConfig build() {
                return new ForwardGroupConfig(this);
            } 

        } 

    }
    public static class RuleActions extends TeaModel {
        @NameInMap("ForwardGroupConfig")
        private ForwardGroupConfig forwardGroupConfig;

        @NameInMap("Order")
        @Validation(required = true)
        private Integer order;

        @NameInMap("RuleActionType")
        @Validation(required = true)
        private String ruleActionType;

        @NameInMap("RuleActionValue")
        private String ruleActionValue;

        private RuleActions(Builder builder) {
            this.forwardGroupConfig = builder.forwardGroupConfig;
            this.order = builder.order;
            this.ruleActionType = builder.ruleActionType;
            this.ruleActionValue = builder.ruleActionValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleActions create() {
            return builder().build();
        }

        /**
         * @return forwardGroupConfig
         */
        public ForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        /**
         * @return order
         */
        public Integer getOrder() {
            return this.order;
        }

        /**
         * @return ruleActionType
         */
        public String getRuleActionType() {
            return this.ruleActionType;
        }

        /**
         * @return ruleActionValue
         */
        public String getRuleActionValue() {
            return this.ruleActionValue;
        }

        public static final class Builder {
            private ForwardGroupConfig forwardGroupConfig; 
            private Integer order; 
            private String ruleActionType; 
            private String ruleActionValue; 

            /**
             * The forwarding configurations.
             * <p>
             * 
             * >  We recommend that you do not use this parameter. We recommend that you use the **RuleActionType** and **RuleActionValue** parameters to configure forwarding actions.
             */
            public Builder forwardGroupConfig(ForwardGroupConfig forwardGroupConfig) {
                this.forwardGroupConfig = forwardGroupConfig;
                return this;
            }

            /**
             * The forwarding priority.
             * <p>
             * 
             * >  This parameter does not take effect. Ignore this parameter.
             */
            public Builder order(Integer order) {
                this.order = order;
                return this;
            }

            /**
             * The type of the forwarding action. Valid values:
             * <p>
             * 
             * *   **ForwardGroup**: forwards a request.
             * *   **Redirect**: redirects a request.
             * *   **FixResponse**: returns a fixed response.
             * *   **Rewrite**: rewrites a request.
             * *   **AddHeader**: adds a header to a request.
             * *   **RemoveHeaderConfig**: deletes the header from a request.
             */
            public Builder ruleActionType(String ruleActionType) {
                this.ruleActionType = ruleActionType;
                return this;
            }

            /**
             * The value of the forwarding action type.
             * <p>
             * 
             * You must specify different JSON strings based on the **RuleActionType** parameter.
             * 
             * A forwarding rule can contain only one forwarding action whose type is **ForwardGroup**, **Redirect**, or **FixResponse**. You must specify a forwarding action whose type is **Rewrite**, **AddHeader**, or **RemoveHeader** before a forwarding action whose type is **ForwardGroup**.
             * 
             * *   If **RuleActionType** is set to **ForwardGroup**, this parameter specifies the information of a virtual endpoint group. You can forward requests to only one virtual endpoint group. Example: `{"type":"endpointgroup", "value":"epg-bp1enpdcrqhl78g6r****"}`.
             * 
             *     *   `type`: set this parameter to `endpointgroup`.
             *     *   `value`: set this parameter to the ID of a virtual endpoint group.
             * 
             * *   If **RuleActionType** is set to **Redirect**, this parameter specifies redirecting configurations. You cannot leave all of the following parameters empty or configure all of these parameters to use the default values for a forwarding action whose type is **Redirect**: `protocol`, `domain`, `port`, `path`, and `query`. Example: `{"protocol":"HTTP", "domain":"www.example.com", "port":"80", "path":"/a","query":"value1", "code":"301" }`.
             * 
             *     *   `protocol`: the protocol of requests after the requests are redirected. Valid values: `${protocol}` (default), `HTTP`, and `HTTPS`.
             *     *   `domain`: the domain name to which requests are redirected. Default value: `${host}`. You can also enter a domain name. The domain name must be 3 to 128 characters in length, and can contain only letters, digits, and the following special characters: `. - ? = ~ _ - + / ^ * ! $ & | ( ) [ ]`.
             *     *   `port`: the port to which requests are redirected. Default value: `${port}`. You can enter a port number that ranges from 1 to 63335.
             *     *   `path`: the path to which requests are redirected. Default value: `${path}`. The path must be 1 to 128 characters in length. To use a regular expression, the path can contain letters, digits, and the following special characters: `. - _ / = ? ~ ^ * $ : ( ) [ ] + |`. The path must start with a tilde (~). If you do not want to use a regular expression, the path can contain letters, digits, and the following special characters: `. - _ / = ? :`. The path must start with a forward slash (/).
             *     *   `query`: the query string of the requests to be redirected. Default value: `${query}`. You can also specify a query string. The query string must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are `greater than or equal to 32 and smaller than 127`. The query string cannot contain uppercase letters, space characters, or the following special characters: `[ ] { } < > # | &`.
             *     *   `code`: the redirecting code. Valid values: `301`, `302`, `303`, `307`, and `308`.
             * 
             * *   If **RuleActionType** is set to **FixResponse**, this parameter specifies a fixed response. Example: `{"code":"200", "type":"text/plain", "content":"dssacav" }`.
             * 
             *     *   `code`: the HTTP status code to return. The response status code must be one of the following numeric strings: `2xx`, `4xx`, and `5xx`. The letter `x` indicates a number from 0 to 9.
             *     *   `type`: the type of the response content. Valid values: **text/plain**, **text/css**, **text/html**, **application/javascript**, and **application/json**.
             *     *   `content`: the response content. The response content cannot exceed 1,000 characters in length and does not support Chinese characters.
             * 
             * *   If **RuleActionType** is set to **AddHeader**, this parameter specifies an HTTP header to be added. If a forwarding rule contains a forwarding action whose type is **AddHeader**, you must specify another forwarding action whose type is **ForwardGroup**. Example: `[{"name":"header1","type":"userdefined", "value":"value"}]`.
             * 
             *     *   `name`: the name of the HTTP header. The name must be 1 to 40 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_). The name of the HTTP header specified by **AddHeader** must be unique and cannot be the same as the name of the HTTP header specified by **RemoveHeader**.
             *     *   `type`: the content type of the HTTP header. Valid values: `user-defined`, `ref`, and `system-defined`.
             *     *   `value`: the content of the HTTP header. You cannot leave this parameter empty. If you set `type` to `user-defined`, the content must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are `greater than or equal to 32 and smaller than 127`. The content can contain letters, digits, hyphens (-), and underscores (\_). The content cannot start or end with a space character. If you set `type` to `ref`, the content must be 1 to 128 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_). The content cannot start or end with a space character. If you set `type` to `system-defined`, only `ClientSrcIp` is supported.
             * 
             * *   If **RuleActionType** is set to **RemoveHeader**, this parameter specifies an HTTP header to be removed. If a forwarding rule contains a forwarding action whose type is **RemoveHeader**, you must specify another forwarding action whose type is **ForwardGroup**. The header must be 1 to 40 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_). Example: `["header1"]`.
             * 
             * *   If **RuleActionType** is set to **Rewrite**, this parameter specifies the rewriting configuration. If a forwarding rule contains a forwarding action whose type is **Rewrite**, you must specify another forwarding action whose type is **ForwardGroup**. Example: `{"domain":"value1", "path":"value2", "query":"value3"}`.
             * 
             *     *   `domain`: the domain name to which requests are redirected. Default value: `${host}`. You can also enter a domain name. The domain name must be 3 to 128 characters in length, and can contain only lowercase letters, digits, and the following special characters: `. - ? = ~ _ - + / ^ * ! $ & | ( ) [ ]`.
             *     *   `path`: the path to which requests are redirected. Default value: `${path}`. The path must be 1 to 128 characters in length. To use a regular expression, the path can contain letters, digits, and the following special characters: `. - _ / = ? ~ ^ * $ : ( ) [ ] + |`. The path must start with a tilde (~). If you do not want to use a regular expression, the path can contain letters, digits, and the following special characters: `. - _ / = ? :`. The path must start with a forward slash (/).
             *     *   `query`: the query string of the requests to be redirected. Default value: `${query}`. You can also specify a query string. The query string must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are `greater than or equal to 32 and smaller than 127`. The query string cannot contain uppercase letters, space characters, or the following special characters: `[ ] { } < > # | &`.
             */
            public Builder ruleActionValue(String ruleActionValue) {
                this.ruleActionValue = ruleActionValue;
                return this;
            }

            public RuleActions build() {
                return new RuleActions(this);
            } 

        } 

    }
    public static class HostConfig extends TeaModel {
        @NameInMap("Values")
        private java.util.List < String > values;

        private HostConfig(Builder builder) {
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostConfig create() {
            return builder().build();
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List < String > values; 

            /**
             * The domain name.
             * <p>
             * 
             * The domain name must be 3 to 128 characters in length, and can contain letters, digits, hyphens (-), and periods (.). Supported wildcard characters are asterisks (\*) and question marks (?).
             * 
             * >  For GA instances created after July 12, 2022, all forwarding condition types and forwarding action types are supported. We recommend that you use **RuleConditionType** and **RuleConditionValue** to query forwarding conditions.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public HostConfig build() {
                return new HostConfig(this);
            } 

        } 

    }
    public static class PathConfig extends TeaModel {
        @NameInMap("Values")
        private java.util.List < String > values;

        private PathConfig(Builder builder) {
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PathConfig create() {
            return builder().build();
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List < String > values; 

            /**
             * The path.
             * <p>
             * 
             * The path must be 1 to 128 characters in length and must start with a forward slash (/). The path can contain only letters, digits, and the following special characters: $ - \_ . + / & ~ @ : \". Supported wildcard characters are asterisks (\*) and question marks (?).
             * 
             * >  For GA instances created after July 12, 2022, all forwarding condition types and forwarding action types are supported. We recommend that you use **RuleConditionType** and **RuleConditionValue** to query forwarding conditions.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public PathConfig build() {
                return new PathConfig(this);
            } 

        } 

    }
    public static class RuleConditions extends TeaModel {
        @NameInMap("HostConfig")
        private HostConfig hostConfig;

        @NameInMap("PathConfig")
        private PathConfig pathConfig;

        @NameInMap("RuleConditionType")
        private String ruleConditionType;

        @NameInMap("RuleConditionValue")
        private String ruleConditionValue;

        private RuleConditions(Builder builder) {
            this.hostConfig = builder.hostConfig;
            this.pathConfig = builder.pathConfig;
            this.ruleConditionType = builder.ruleConditionType;
            this.ruleConditionValue = builder.ruleConditionValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleConditions create() {
            return builder().build();
        }

        /**
         * @return hostConfig
         */
        public HostConfig getHostConfig() {
            return this.hostConfig;
        }

        /**
         * @return pathConfig
         */
        public PathConfig getPathConfig() {
            return this.pathConfig;
        }

        /**
         * @return ruleConditionType
         */
        public String getRuleConditionType() {
            return this.ruleConditionType;
        }

        /**
         * @return ruleConditionValue
         */
        public String getRuleConditionValue() {
            return this.ruleConditionValue;
        }

        public static final class Builder {
            private HostConfig hostConfig; 
            private PathConfig pathConfig; 
            private String ruleConditionType; 
            private String ruleConditionValue; 

            /**
             * The configuration of the domain name.
             * <p>
             * 
             * >  We recommend that you do not use this parameter. We recommend that you use the **RuleConditionType** and **RuleConditionValue** parameters to configure forwarding conditions.
             */
            public Builder hostConfig(HostConfig hostConfig) {
                this.hostConfig = hostConfig;
                return this;
            }

            /**
             * The configuration of the path.
             * <p>
             * 
             * >  We recommend that you do not use this parameter. We recommend that you use the **RuleConditionType** and **RuleConditionValue** parameters to configure forwarding conditions.
             */
            public Builder pathConfig(PathConfig pathConfig) {
                this.pathConfig = pathConfig;
                return this;
            }

            /**
             * The type of the forwarding conditions. Valid values:
             * <p>
             * 
             * *   **Host**: domain name
             * *   **Path**: path
             * *   **RequestHeader**: HTTP header
             * *   **Query**: query string
             * *   **Method**: HTTP method
             * *   **Cookie**: cookie
             * *   **SourceIP**: source IP address
             */
            public Builder ruleConditionType(String ruleConditionType) {
                this.ruleConditionType = ruleConditionType;
                return this;
            }

            /**
             * The value of the forwarding condition type.
             * <p>
             * 
             * You must specify different JSON strings based on the **RuleConditionType** parameter.
             * 
             * *   If **RuleConditionType** is set to **Host**, this parameter specifies a domain name condition. A forwarding rule can contain only one forwarding condition whose type is host. You can specify multiple domain names in a forwarding condition. The relationship between multiple domain names is OR. The domain name must be 3 to 128 characters in length, and can contain letters, digits, hyphens (-), and periods (.). Supported wildcard characters are asterisks (\*) and question marks (?). Example: `["www.example.com", "www.aliyun.com"]`.
             * 
             * *   If **RuleConditionType** is set to **Path**, this parameter specifies a path condition. A forwarding rule can contain multiple forwarding conditions whose types are path. The relationship between multiple path conditions is OR. You can specify multiple paths in a forwarding condition. The relationship between multiple paths is OR. The path must be 1 to 128 characters in length and must start with a forward slash (/). The path can contain letters, digits, and the following special characters: $ - \_ . + / & ~ @ : \". Supported wildcard characters are asterisks (\*) and question marks (?). Example: `["/a", "/b/"]`.
             * 
             * *   If **RuleConditionType** is set to **RequestHeader**, this parameter specifies an HTTP header condition that consists of key-value pairs. The header values in a forwarding condition must be unique. Example: `[{"header1":["value1","value2"]}]`.
             * 
             *     *   Key: The key of an HTTP header must be 1 to 40 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).
             *     *   Value: The value of an HTTP header must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are `greater than or equal to 32 and smaller than 127`. The value cannot start or end with a space character.
             * 
             * *   If **RuleConditionType** is set to **Query**, this parameter specifies a query string condition that consists of key-value pairs. Example: `[{"query1":["value1"]}, {"query2":["value2"]}]`.
             * 
             *     *   Key: The key of an HTTP header must be 1 to 100 characters in length, and can contain printable characters whose ASCII values are `greater than or equal to 32 and smaller than 127`. The key cannot contain uppercase letters, space characters, or the following special characters: `[ ] { } < > \ ; / ? : @ & = + , $ % | " ^ ~`.
             *     *   Value: The value of an HTTP header must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are `greater than or equal to 32 and smaller than 127`. The value cannot contain uppercase letters, space characters, or the following special characters: `[ ] { } < > \ ; / ? : @ & = + , $ % | " ^ ~`.
             * 
             * *   If **RuleConditionType** is set to **Method**, this parameter specifies an HTTP method condition. Valid values: **HEAD**, **GET**, **POST**, **OPTIONS**, **PUT**, **PATCH**, and **DELETE**. Example: `["GET", "OPTIONS", "POST"]`.
             * 
             * *   If **RuleConditionType** is set to **Cookie**, this parameter specifies a cookie condition that consists of key-value pairs. Example: `[{"cookie1":["value1"]}, {"cookie2":["value2"]}]`.
             * 
             *     *   Key: The key of a cookie must be 1 to 100 characters in length, and can contain printable characters whose ASCII values are `greater than or equal to 32 and smaller than 127`. The key cannot contain uppercase letters, space characters, or the following special characters: `# [ ] { } \ | < > &`.
             *     *   Value: The value of a cookie must be 1 to 128 characters in length, and can contain printable characters whose ASCII values are `greater than or equal to 32 and lower than 127`. The value cannot contain uppercase letters, space characters, or the following special characters: `# [ ] { } \ | < > &`.
             * 
             * *   If **RuleConditionType** is set to **SourceIP**, this parameter specifies a source IP address condition. You can specify IP addresses, such as 1.1.XX.XX/32. You can also specify CIDR blocks, such as 2.2.XX.XX/24. A forwarding rule can contain only one forwarding condition whose type is source IP address. You can specify multiple source IP addresses in a forwarding condition. The relationship between multiple source IP addresses is OR. Example: `["1.1.XX.XX/32", "2.2.XX.XX/24"]`.
             */
            public Builder ruleConditionValue(String ruleConditionValue) {
                this.ruleConditionValue = ruleConditionValue;
                return this;
            }

            public RuleConditions build() {
                return new RuleConditions(this);
            } 

        } 

    }
    public static class ForwardingRules extends TeaModel {
        @NameInMap("ForwardingRuleName")
        private String forwardingRuleName;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("RuleActions")
        @Validation(required = true)
        private java.util.List < RuleActions> ruleActions;

        @NameInMap("RuleConditions")
        @Validation(required = true)
        private java.util.List < RuleConditions> ruleConditions;

        @NameInMap("RuleDirection")
        private String ruleDirection;

        private ForwardingRules(Builder builder) {
            this.forwardingRuleName = builder.forwardingRuleName;
            this.priority = builder.priority;
            this.ruleActions = builder.ruleActions;
            this.ruleConditions = builder.ruleConditions;
            this.ruleDirection = builder.ruleDirection;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardingRules create() {
            return builder().build();
        }

        /**
         * @return forwardingRuleName
         */
        public String getForwardingRuleName() {
            return this.forwardingRuleName;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return ruleActions
         */
        public java.util.List < RuleActions> getRuleActions() {
            return this.ruleActions;
        }

        /**
         * @return ruleConditions
         */
        public java.util.List < RuleConditions> getRuleConditions() {
            return this.ruleConditions;
        }

        /**
         * @return ruleDirection
         */
        public String getRuleDirection() {
            return this.ruleDirection;
        }

        public static final class Builder {
            private String forwardingRuleName; 
            private Integer priority; 
            private java.util.List < RuleActions> ruleActions; 
            private java.util.List < RuleConditions> ruleConditions; 
            private String ruleDirection; 

            /**
             * The name of the forwarding rule.
             * <p>
             * 
             * The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.
             */
            public Builder forwardingRuleName(String forwardingRuleName) {
                this.forwardingRuleName = forwardingRuleName;
                return this;
            }

            /**
             * The priority of the forwarding rule. Valid values: **1** to **10000**. A lower value indicates a higher priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The forwarding action.
             */
            public Builder ruleActions(java.util.List < RuleActions> ruleActions) {
                this.ruleActions = ruleActions;
                return this;
            }

            /**
             * The forwarding conditions.
             */
            public Builder ruleConditions(java.util.List < RuleConditions> ruleConditions) {
                this.ruleConditions = ruleConditions;
                return this;
            }

            /**
             * The direction in which the rule takes effect. You do not need to set this parameter.
             * <p>
             * 
             * By default, this parameter is set to **request**, which indicates that the rule takes effect on requests.
             */
            public Builder ruleDirection(String ruleDirection) {
                this.ruleDirection = ruleDirection;
                return this;
            }

            public ForwardingRules build() {
                return new ForwardingRules(this);
            } 

        } 

    }
}
