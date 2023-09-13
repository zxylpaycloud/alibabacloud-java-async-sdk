// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link CreateConnectionRequest} extends {@link RequestModel}
 *
 * <p>CreateConnectionRequest</p>
 */
public class CreateConnectionRequest extends Request {
    @Query
    @NameInMap("AuthParameters")
    private AuthParameters authParameters;

    @Query
    @NameInMap("ConnectionName")
    @Validation(required = true, maxLength = 127, minLength = 2)
    private String connectionName;

    @Query
    @NameInMap("Description")
    @Validation(maxLength = 255)
    private String description;

    @Query
    @NameInMap("NetworkParameters")
    @Validation(required = true)
    private NetworkParameters networkParameters;

    private CreateConnectionRequest(Builder builder) {
        super(builder);
        this.authParameters = builder.authParameters;
        this.connectionName = builder.connectionName;
        this.description = builder.description;
        this.networkParameters = builder.networkParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConnectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authParameters
     */
    public AuthParameters getAuthParameters() {
        return this.authParameters;
    }

    /**
     * @return connectionName
     */
    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return networkParameters
     */
    public NetworkParameters getNetworkParameters() {
        return this.networkParameters;
    }

    public static final class Builder extends Request.Builder<CreateConnectionRequest, Builder> {
        private AuthParameters authParameters; 
        private String connectionName; 
        private String description; 
        private NetworkParameters networkParameters; 

        private Builder() {
            super();
        } 

        private Builder(CreateConnectionRequest request) {
            super(request);
            this.authParameters = request.authParameters;
            this.connectionName = request.connectionName;
            this.description = request.description;
            this.networkParameters = request.networkParameters;
        } 

        /**
         * The parameters that are configured for authentication.
         */
        public Builder authParameters(AuthParameters authParameters) {
            String authParametersShrink = shrink(authParameters, "AuthParameters", "json");
            this.putQueryParameter("AuthParameters", authParametersShrink);
            this.authParameters = authParameters;
            return this;
        }

        /**
         * The name of the connection. The name must be 2 to 127 characters in length.
         */
        public Builder connectionName(String connectionName) {
            this.putQueryParameter("ConnectionName", connectionName);
            this.connectionName = connectionName;
            return this;
        }

        /**
         * The description of the connection. The description can be up to 255 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The parameters that are configured for the network.
         */
        public Builder networkParameters(NetworkParameters networkParameters) {
            String networkParametersShrink = shrink(networkParameters, "NetworkParameters", "json");
            this.putQueryParameter("NetworkParameters", networkParametersShrink);
            this.networkParameters = networkParameters;
            return this;
        }

        @Override
        public CreateConnectionRequest build() {
            return new CreateConnectionRequest(this);
        } 

    } 

    public static class ApiKeyAuthParameters extends TeaModel {
        @NameInMap("ApiKeyName")
        @Validation(maxLength = 127)
        private String apiKeyName;

        @NameInMap("ApiKeyValue")
        @Validation(maxLength = 127)
        private String apiKeyValue;

        private ApiKeyAuthParameters(Builder builder) {
            this.apiKeyName = builder.apiKeyName;
            this.apiKeyValue = builder.apiKeyValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiKeyAuthParameters create() {
            return builder().build();
        }

        /**
         * @return apiKeyName
         */
        public String getApiKeyName() {
            return this.apiKeyName;
        }

        /**
         * @return apiKeyValue
         */
        public String getApiKeyValue() {
            return this.apiKeyValue;
        }

        public static final class Builder {
            private String apiKeyName; 
            private String apiKeyValue; 

            /**
             * The key of the API key.
             */
            public Builder apiKeyName(String apiKeyName) {
                this.apiKeyName = apiKeyName;
                return this;
            }

            /**
             * The value of the API key.
             */
            public Builder apiKeyValue(String apiKeyValue) {
                this.apiKeyValue = apiKeyValue;
                return this;
            }

            public ApiKeyAuthParameters build() {
                return new ApiKeyAuthParameters(this);
            } 

        } 

    }
    public static class BasicAuthParameters extends TeaModel {
        @NameInMap("Password")
        @Validation(maxLength = 127)
        private String password;

        @NameInMap("Username")
        @Validation(maxLength = 127)
        private String username;

        private BasicAuthParameters(Builder builder) {
            this.password = builder.password;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BasicAuthParameters create() {
            return builder().build();
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String password; 
            private String username; 

            /**
             * The password for basic authentication.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * The username for basic authentication.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public BasicAuthParameters build() {
                return new BasicAuthParameters(this);
            } 

        } 

    }
    public static class ClientParameters extends TeaModel {
        @NameInMap("ClientID")
        @Validation(maxLength = 127)
        private String clientID;

        @NameInMap("ClientSecret")
        @Validation(maxLength = 127)
        private String clientSecret;

        private ClientParameters(Builder builder) {
            this.clientID = builder.clientID;
            this.clientSecret = builder.clientSecret;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientParameters create() {
            return builder().build();
        }

        /**
         * @return clientID
         */
        public String getClientID() {
            return this.clientID;
        }

        /**
         * @return clientSecret
         */
        public String getClientSecret() {
            return this.clientSecret;
        }

        public static final class Builder {
            private String clientID; 
            private String clientSecret; 

            /**
             * The client ID.
             */
            public Builder clientID(String clientID) {
                this.clientID = clientID;
                return this;
            }

            /**
             * The AccessKey secret of the client.
             */
            public Builder clientSecret(String clientSecret) {
                this.clientSecret = clientSecret;
                return this;
            }

            public ClientParameters build() {
                return new ClientParameters(this);
            } 

        } 

    }
    public static class BodyParameters extends TeaModel {
        @NameInMap("IsValueSecret")
        private String isValueSecret;

        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private BodyParameters(Builder builder) {
            this.isValueSecret = builder.isValueSecret;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BodyParameters create() {
            return builder().build();
        }

        /**
         * @return isValueSecret
         */
        public String getIsValueSecret() {
            return this.isValueSecret;
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
            private String isValueSecret; 
            private String key; 
            private String value; 

            /**
             * Specifies whether to enable authentication.
             */
            public Builder isValueSecret(String isValueSecret) {
                this.isValueSecret = isValueSecret;
                return this;
            }

            /**
             * The key of the request body.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the request body.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public BodyParameters build() {
                return new BodyParameters(this);
            } 

        } 

    }
    public static class HeaderParameters extends TeaModel {
        @NameInMap("IsValueSecret")
        private String isValueSecret;

        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private HeaderParameters(Builder builder) {
            this.isValueSecret = builder.isValueSecret;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HeaderParameters create() {
            return builder().build();
        }

        /**
         * @return isValueSecret
         */
        public String getIsValueSecret() {
            return this.isValueSecret;
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
            private String isValueSecret; 
            private String key; 
            private String value; 

            /**
             * Specifies whether to enable authentication.
             */
            public Builder isValueSecret(String isValueSecret) {
                this.isValueSecret = isValueSecret;
                return this;
            }

            /**
             * The key of the request header.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the request header.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public HeaderParameters build() {
                return new HeaderParameters(this);
            } 

        } 

    }
    public static class QueryStringParameters extends TeaModel {
        @NameInMap("IsValueSecret")
        private String isValueSecret;

        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private QueryStringParameters(Builder builder) {
            this.isValueSecret = builder.isValueSecret;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryStringParameters create() {
            return builder().build();
        }

        /**
         * @return isValueSecret
         */
        public String getIsValueSecret() {
            return this.isValueSecret;
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
            private String isValueSecret; 
            private String key; 
            private String value; 

            /**
             * Specifies whether to enable authentication.
             */
            public Builder isValueSecret(String isValueSecret) {
                this.isValueSecret = isValueSecret;
                return this;
            }

            /**
             * The key of the request path.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the request path.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public QueryStringParameters build() {
                return new QueryStringParameters(this);
            } 

        } 

    }
    public static class OAuthHttpParameters extends TeaModel {
        @NameInMap("BodyParameters")
        private java.util.List < BodyParameters> bodyParameters;

        @NameInMap("HeaderParameters")
        private java.util.List < HeaderParameters> headerParameters;

        @NameInMap("QueryStringParameters")
        private java.util.List < QueryStringParameters> queryStringParameters;

        private OAuthHttpParameters(Builder builder) {
            this.bodyParameters = builder.bodyParameters;
            this.headerParameters = builder.headerParameters;
            this.queryStringParameters = builder.queryStringParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OAuthHttpParameters create() {
            return builder().build();
        }

        /**
         * @return bodyParameters
         */
        public java.util.List < BodyParameters> getBodyParameters() {
            return this.bodyParameters;
        }

        /**
         * @return headerParameters
         */
        public java.util.List < HeaderParameters> getHeaderParameters() {
            return this.headerParameters;
        }

        /**
         * @return queryStringParameters
         */
        public java.util.List < QueryStringParameters> getQueryStringParameters() {
            return this.queryStringParameters;
        }

        public static final class Builder {
            private java.util.List < BodyParameters> bodyParameters; 
            private java.util.List < HeaderParameters> headerParameters; 
            private java.util.List < QueryStringParameters> queryStringParameters; 

            /**
             * The parameters that are configured for the request body.
             */
            public Builder bodyParameters(java.util.List < BodyParameters> bodyParameters) {
                this.bodyParameters = bodyParameters;
                return this;
            }

            /**
             * The parameters that are configured for the request header.
             */
            public Builder headerParameters(java.util.List < HeaderParameters> headerParameters) {
                this.headerParameters = headerParameters;
                return this;
            }

            /**
             * The parameters that are configured for the request path.
             */
            public Builder queryStringParameters(java.util.List < QueryStringParameters> queryStringParameters) {
                this.queryStringParameters = queryStringParameters;
                return this;
            }

            public OAuthHttpParameters build() {
                return new OAuthHttpParameters(this);
            } 

        } 

    }
    public static class OAuthParameters extends TeaModel {
        @NameInMap("AuthorizationEndpoint")
        @Validation(maxLength = 127)
        private String authorizationEndpoint;

        @NameInMap("ClientParameters")
        private ClientParameters clientParameters;

        @NameInMap("HttpMethod")
        private String httpMethod;

        @NameInMap("OAuthHttpParameters")
        private OAuthHttpParameters oAuthHttpParameters;

        private OAuthParameters(Builder builder) {
            this.authorizationEndpoint = builder.authorizationEndpoint;
            this.clientParameters = builder.clientParameters;
            this.httpMethod = builder.httpMethod;
            this.oAuthHttpParameters = builder.oAuthHttpParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OAuthParameters create() {
            return builder().build();
        }

        /**
         * @return authorizationEndpoint
         */
        public String getAuthorizationEndpoint() {
            return this.authorizationEndpoint;
        }

        /**
         * @return clientParameters
         */
        public ClientParameters getClientParameters() {
            return this.clientParameters;
        }

        /**
         * @return httpMethod
         */
        public String getHttpMethod() {
            return this.httpMethod;
        }

        /**
         * @return oAuthHttpParameters
         */
        public OAuthHttpParameters getOAuthHttpParameters() {
            return this.oAuthHttpParameters;
        }

        public static final class Builder {
            private String authorizationEndpoint; 
            private ClientParameters clientParameters; 
            private String httpMethod; 
            private OAuthHttpParameters oAuthHttpParameters; 

            /**
             * The IP address of the authorized endpoint. The default value of a column can be up to 127 characters in length.
             */
            public Builder authorizationEndpoint(String authorizationEndpoint) {
                this.authorizationEndpoint = authorizationEndpoint;
                return this;
            }

            /**
             * The parameters that are configured for the client.
             */
            public Builder clientParameters(ClientParameters clientParameters) {
                this.clientParameters = clientParameters;
                return this;
            }

            /**
             * The HTTP request method. Valid values:
             * <p>
             * 
             * *   GET
             * *   POST
             * *   HEAD
             * *   DELETE
             * *   PUT
             * *   PATCH
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * The request parameters that are configured for OAuth authentication.
             */
            public Builder oAuthHttpParameters(OAuthHttpParameters oAuthHttpParameters) {
                this.oAuthHttpParameters = oAuthHttpParameters;
                return this;
            }

            public OAuthParameters build() {
                return new OAuthParameters(this);
            } 

        } 

    }
    public static class AuthParameters extends TeaModel {
        @NameInMap("ApiKeyAuthParameters")
        private ApiKeyAuthParameters apiKeyAuthParameters;

        @NameInMap("AuthorizationType")
        private String authorizationType;

        @NameInMap("BasicAuthParameters")
        private BasicAuthParameters basicAuthParameters;

        @NameInMap("OAuthParameters")
        private OAuthParameters oAuthParameters;

        private AuthParameters(Builder builder) {
            this.apiKeyAuthParameters = builder.apiKeyAuthParameters;
            this.authorizationType = builder.authorizationType;
            this.basicAuthParameters = builder.basicAuthParameters;
            this.oAuthParameters = builder.oAuthParameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthParameters create() {
            return builder().build();
        }

        /**
         * @return apiKeyAuthParameters
         */
        public ApiKeyAuthParameters getApiKeyAuthParameters() {
            return this.apiKeyAuthParameters;
        }

        /**
         * @return authorizationType
         */
        public String getAuthorizationType() {
            return this.authorizationType;
        }

        /**
         * @return basicAuthParameters
         */
        public BasicAuthParameters getBasicAuthParameters() {
            return this.basicAuthParameters;
        }

        /**
         * @return oAuthParameters
         */
        public OAuthParameters getOAuthParameters() {
            return this.oAuthParameters;
        }

        public static final class Builder {
            private ApiKeyAuthParameters apiKeyAuthParameters; 
            private String authorizationType; 
            private BasicAuthParameters basicAuthParameters; 
            private OAuthParameters oAuthParameters; 

            /**
             * The parameters that are configured for API key authentication.
             */
            public Builder apiKeyAuthParameters(ApiKeyAuthParameters apiKeyAuthParameters) {
                this.apiKeyAuthParameters = apiKeyAuthParameters;
                return this;
            }

            /**
             * The authentication type. Valid values:
             * <p>
             * 
             * BASIC_AUTH: basic authentication.
             * 
             * Introduction: Basic authentication is a simple authentication scheme built into the HTTP protocol. When you use the HTTP protocol for communications, the authentication method that the HTTP server uses to authenticate user identities on the client is defined in the protocol. The request header is in the Authorization: Basic Base64-encoded string (Username:Password) format.
             * 
             * 1.  Username and Password are required.
             * 
             * API_KEY_AUTH: API key authentication.
             * 
             * Introduction: The request header is in the Token: Token value format.
             * 
             * *   ApiKeyName and ApiKeyValue are required.
             * 
             * OAUTH_AUTH: OAuth authentication.
             * 
             * Introduction: OAuth2.0 is an authentication mechanism. In normal cases, a system that does not use OAuth2.0 can access the resources of the server from the client. To ensure access security, access tokens are used to authenticate users in OAuth 2.0. The client must use an access token to access protected resources. This way, OAuth 2.0 protects resources from being accessed from malicious clients and improves system security.
             * 
             * *   AuthorizationEndpoint, OAuthHttpParameters, and HttpMethod are required.
             */
            public Builder authorizationType(String authorizationType) {
                this.authorizationType = authorizationType;
                return this;
            }

            /**
             * The parameters that are configured for basic authentication.
             */
            public Builder basicAuthParameters(BasicAuthParameters basicAuthParameters) {
                this.basicAuthParameters = basicAuthParameters;
                return this;
            }

            /**
             * The parameters that are configured for OAuth authentication.
             */
            public Builder oAuthParameters(OAuthParameters oAuthParameters) {
                this.oAuthParameters = oAuthParameters;
                return this;
            }

            public AuthParameters build() {
                return new AuthParameters(this);
            } 

        } 

    }
    public static class NetworkParameters extends TeaModel {
        @NameInMap("NetworkType")
        @Validation(required = true)
        private String networkType;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswitcheId")
        private String vswitcheId;

        private NetworkParameters(Builder builder) {
            this.networkType = builder.networkType;
            this.securityGroupId = builder.securityGroupId;
            this.vpcId = builder.vpcId;
            this.vswitcheId = builder.vswitcheId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkParameters create() {
            return builder().build();
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitcheId
         */
        public String getVswitcheId() {
            return this.vswitcheId;
        }

        public static final class Builder {
            private String networkType; 
            private String securityGroupId; 
            private String vpcId; 
            private String vswitcheId; 

            /**
             * The network type. Valid values:
             * <p>
             * 
             * PublicNetwork and PrivateNetwork.
             * 
             * *   Note: If you set this parameter to PrivateNetwork, you must configure VpcId, VswitcheId, and SecurityGroupId.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The ID of the security group.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * The VPC. ID
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The vSwitch ID.
             */
            public Builder vswitcheId(String vswitcheId) {
                this.vswitcheId = vswitcheId;
                return this;
            }

            public NetworkParameters build() {
                return new NetworkParameters(this);
            } 

        } 

    }
}
