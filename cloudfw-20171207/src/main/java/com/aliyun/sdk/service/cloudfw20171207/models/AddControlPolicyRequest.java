// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddControlPolicyRequest} extends {@link RequestModel}
 *
 * <p>AddControlPolicyRequest</p>
 */
public class AddControlPolicyRequest extends Request {
    @Query
    @NameInMap("AclAction")
    @Validation(required = true)
    private String aclAction;

    @Query
    @NameInMap("ApplicationName")
    private String applicationName;

    @Query
    @NameInMap("ApplicationNameList")
    private java.util.List < String > applicationNameList;

    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("DestPort")
    private String destPort;

    @Query
    @NameInMap("DestPortGroup")
    private String destPortGroup;

    @Query
    @NameInMap("DestPortType")
    private String destPortType;

    @Query
    @NameInMap("Destination")
    @Validation(required = true)
    private String destination;

    @Query
    @NameInMap("DestinationType")
    @Validation(required = true)
    private String destinationType;

    @Query
    @NameInMap("Direction")
    @Validation(required = true)
    private String direction;

    @Query
    @NameInMap("IpVersion")
    private String ipVersion;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("NewOrder")
    @Validation(required = true)
    private String newOrder;

    @Query
    @NameInMap("Proto")
    @Validation(required = true)
    private String proto;

    @Query
    @NameInMap("Release")
    private String release;

    @Query
    @NameInMap("Source")
    @Validation(required = true)
    private String source;

    @Query
    @NameInMap("SourceIp")
    @Deprecated
    private String sourceIp;

    @Query
    @NameInMap("SourceType")
    @Validation(required = true)
    private String sourceType;

    private AddControlPolicyRequest(Builder builder) {
        super(builder);
        this.aclAction = builder.aclAction;
        this.applicationName = builder.applicationName;
        this.applicationNameList = builder.applicationNameList;
        this.description = builder.description;
        this.destPort = builder.destPort;
        this.destPortGroup = builder.destPortGroup;
        this.destPortType = builder.destPortType;
        this.destination = builder.destination;
        this.destinationType = builder.destinationType;
        this.direction = builder.direction;
        this.ipVersion = builder.ipVersion;
        this.lang = builder.lang;
        this.newOrder = builder.newOrder;
        this.proto = builder.proto;
        this.release = builder.release;
        this.source = builder.source;
        this.sourceIp = builder.sourceIp;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddControlPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclAction
     */
    public String getAclAction() {
        return this.aclAction;
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return applicationNameList
     */
    public java.util.List < String > getApplicationNameList() {
        return this.applicationNameList;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destPort
     */
    public String getDestPort() {
        return this.destPort;
    }

    /**
     * @return destPortGroup
     */
    public String getDestPortGroup() {
        return this.destPortGroup;
    }

    /**
     * @return destPortType
     */
    public String getDestPortType() {
        return this.destPortType;
    }

    /**
     * @return destination
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * @return destinationType
     */
    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return newOrder
     */
    public String getNewOrder() {
        return this.newOrder;
    }

    /**
     * @return proto
     */
    public String getProto() {
        return this.proto;
    }

    /**
     * @return release
     */
    public String getRelease() {
        return this.release;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<AddControlPolicyRequest, Builder> {
        private String aclAction; 
        private String applicationName; 
        private java.util.List < String > applicationNameList; 
        private String description; 
        private String destPort; 
        private String destPortGroup; 
        private String destPortType; 
        private String destination; 
        private String destinationType; 
        private String direction; 
        private String ipVersion; 
        private String lang; 
        private String newOrder; 
        private String proto; 
        private String release; 
        private String source; 
        private String sourceIp; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(AddControlPolicyRequest request) {
            super(request);
            this.aclAction = request.aclAction;
            this.applicationName = request.applicationName;
            this.applicationNameList = request.applicationNameList;
            this.description = request.description;
            this.destPort = request.destPort;
            this.destPortGroup = request.destPortGroup;
            this.destPortType = request.destPortType;
            this.destination = request.destination;
            this.destinationType = request.destinationType;
            this.direction = request.direction;
            this.ipVersion = request.ipVersion;
            this.lang = request.lang;
            this.newOrder = request.newOrder;
            this.proto = request.proto;
            this.release = request.release;
            this.source = request.source;
            this.sourceIp = request.sourceIp;
            this.sourceType = request.sourceType;
        } 

        /**
         * The action that Cloud Firewall performs on the traffic. Valid values:
         * <p>
         * 
         * *   **accept**: allows the traffic.
         * *   **drop**: denies the traffic.
         * *   **log**: monitors the traffic.
         */
        public Builder aclAction(String aclAction) {
            this.putQueryParameter("AclAction", aclAction);
            this.aclAction = aclAction;
            return this;
        }

        /**
         * The application type supported by the access control policy. Valid values:
         * <p>
         * 
         * *   **FTP**
         * *   **HTTP**
         * *   **HTTPS**
         * *   **Memcache**
         * *   **MongoDB**
         * *   **MQTT**
         * *   **MySQL**
         * *   **RDP**
         * *   **Redis**
         * *   **SMTP**
         * *   **SMTPS**
         * *   **SSH**
         * *   **SSL_No_Cert**
         * *   **SSL**
         * *   **VNC**
         * *   **ANY**
         * 
         * > The value of this parameter is based on the value of Proto. If Proto is set to TCP, you can set ApplicationName to any valid value. If Proto is set to UDP, ICMP, or ANY, you can set ApplicationName only to ANY. You must specify at least one of the ApplicationNameList and ApplicationName parameters.
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * The application types supported by the access control policy.
         */
        public Builder applicationNameList(java.util.List < String > applicationNameList) {
            this.putQueryParameter("ApplicationNameList", applicationNameList);
            this.applicationNameList = applicationNameList;
            return this;
        }

        /**
         * The description of the access control policy.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The destination port in the access control policy. Valid values:
         * <p>
         * 
         * *   If Proto is set to ICMP, DestPort is automatically left empty.
         * 
         * > If Proto is set to ICMP, access control does not take effect on the destination port.
         * 
         * *   If Proto is set to TCP, UDP, or ANY and DestPortType is set to group, DestPort is empty.
         * 
         * > If DestPortType is set to group, you do not need to specify the destination port number. All ports on which the access control policy takes effect are included in the destination port address book.
         * 
         * *   If Proto is set to TCP, UDP, or ANY and DestPortType is set to port, the value of DestPort is the destination port number.
         */
        public Builder destPort(String destPort) {
            this.putQueryParameter("DestPort", destPort);
            this.destPort = destPort;
            return this;
        }

        /**
         * The name of the destination port address book in the access control policy.
         * <p>
         * 
         * > If DestPortType is set to group, you must specify the name of the destination port address book.
         */
        public Builder destPortGroup(String destPortGroup) {
            this.putQueryParameter("DestPortGroup", destPortGroup);
            this.destPortGroup = destPortGroup;
            return this;
        }

        /**
         * The type of the destination port in the access control policy.
         * <p>
         * 
         * Valid values:
         * 
         * *   **port**: port
         * *   **group**: port address book
         */
        public Builder destPortType(String destPortType) {
            this.putQueryParameter("DestPortType", destPortType);
            this.destPortType = destPortType;
            return this;
        }

        /**
         * The destination address in the access control policy.
         * <p>
         * 
         * Valid values:
         * 
         * *   If DestinationType is set to net, the value of this parameter is a CIDR block.
         * 
         *     Example: 1.2.XX.XX/24
         * 
         * *   If DestinationType is set to group, the value of this parameter is an address book name.
         * 
         *     Example: db_group
         * 
         * *   If DestinationType is set to domain, the value of this parameter is a domain name.
         * 
         *     Example: \*.aliyuncs.com
         * 
         * *   If DestinationType is set to location, the value of this parameter is a location.
         * 
         *     Example: \["BJ11", "ZB"]
         */
        public Builder destination(String destination) {
            this.putQueryParameter("Destination", destination);
            this.destination = destination;
            return this;
        }

        /**
         * The type of the destination address in the access control policy. Valid values:
         * <p>
         * 
         * *   **net**: CIDR block
         * *   **group**: address book
         * *   **domain**: domain name
         * *   **location**: location
         */
        public Builder destinationType(String destinationType) {
            this.putQueryParameter("DestinationType", destinationType);
            this.destinationType = destinationType;
            return this;
        }

        /**
         * The direction of the traffic to which the access control policy applies. Valid values:
         * <p>
         * 
         * *   **in**: inbound traffic
         * *   **out**: outbound traffic
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * The IP version supported by the access control policy.
         * <p>
         * 
         * Valid values:
         * 
         * *   **4**: IPv4
         * *   **6**: IPv6
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The priority of the access control policy. The priority value starts from 1. A smaller priority value indicates a higher priority.
         */
        public Builder newOrder(String newOrder) {
            this.putQueryParameter("NewOrder", newOrder);
            this.newOrder = newOrder;
            return this;
        }

        /**
         * The protocol type supported by the access control policy. Valid values:
         * <p>
         * 
         * *   **ANY**
         * *   **TCP**
         * *   **UDP**
         * *   **ICMP**
         */
        public Builder proto(String proto) {
            this.putQueryParameter("Proto", proto);
            this.proto = proto;
            return this;
        }

        /**
         * Specifies whether to enable the access control policy. By default, an access control policy is enabled after the policy is created. Valid values:
         * <p>
         * 
         * *   **true**: enables the access control policy.
         * *   **false**: disables the access control policy.
         */
        public Builder release(String release) {
            this.putQueryParameter("Release", release);
            this.release = release;
            return this;
        }

        /**
         * The source address in the access control policy. Valid values:
         * <p>
         * 
         * *   If SourceType is set to net, the value of this parameter is a CIDR block.
         * 
         *     Example: 1.1.XX.XX/24
         * 
         * *   If SourceType is set to group, the value of this parameter is an address book name.
         * 
         *     Example: db_group
         * 
         * *   If SourceType is set to location, the value of this parameter is a location.
         * 
         *     Example: \["BJ11", "ZB"]
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The type of the source address in the access control policy. Valid values:
         * <p>
         * 
         * *   **net**: CIDR block
         * *   **group**: address book
         * *   **location**: location
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public AddControlPolicyRequest build() {
            return new AddControlPolicyRequest(this);
        } 

    } 

}