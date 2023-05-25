// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeSecurityGroupRequest} extends {@link RequestModel}
 *
 * <p>AuthorizeSecurityGroupRequest</p>
 */
public class AuthorizeSecurityGroupRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DestCidrIp")
    private String destCidrIp;

    @Query
    @NameInMap("IpProtocol")
    private String ipProtocol;

    @Query
    @NameInMap("Ipv6DestCidrIp")
    private String ipv6DestCidrIp;

    @Query
    @NameInMap("Ipv6SourceCidrIp")
    private String ipv6SourceCidrIp;

    @Query
    @NameInMap("NicType")
    private String nicType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Permissions")
    private java.util.List < Permissions> permissions;

    @Query
    @NameInMap("Policy")
    private String policy;

    @Query
    @NameInMap("PortRange")
    private String portRange;

    @Query
    @NameInMap("Priority")
    private String priority;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecurityGroupId")
    @Validation(required = true)
    private String securityGroupId;

    @Query
    @NameInMap("SourceCidrIp")
    private String sourceCidrIp;

    @Query
    @NameInMap("SourceGroupId")
    private String sourceGroupId;

    @Query
    @NameInMap("SourceGroupOwnerAccount")
    private String sourceGroupOwnerAccount;

    @Query
    @NameInMap("SourceGroupOwnerId")
    private Long sourceGroupOwnerId;

    @Query
    @NameInMap("SourcePortRange")
    private String sourcePortRange;

    @Query
    @NameInMap("SourcePrefixListId")
    private String sourcePrefixListId;

    private AuthorizeSecurityGroupRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.destCidrIp = builder.destCidrIp;
        this.ipProtocol = builder.ipProtocol;
        this.ipv6DestCidrIp = builder.ipv6DestCidrIp;
        this.ipv6SourceCidrIp = builder.ipv6SourceCidrIp;
        this.nicType = builder.nicType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.permissions = builder.permissions;
        this.policy = builder.policy;
        this.portRange = builder.portRange;
        this.priority = builder.priority;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityGroupId = builder.securityGroupId;
        this.sourceCidrIp = builder.sourceCidrIp;
        this.sourceGroupId = builder.sourceGroupId;
        this.sourceGroupOwnerAccount = builder.sourceGroupOwnerAccount;
        this.sourceGroupOwnerId = builder.sourceGroupOwnerId;
        this.sourcePortRange = builder.sourcePortRange;
        this.sourcePrefixListId = builder.sourcePrefixListId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthorizeSecurityGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destCidrIp
     */
    public String getDestCidrIp() {
        return this.destCidrIp;
    }

    /**
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * @return ipv6DestCidrIp
     */
    public String getIpv6DestCidrIp() {
        return this.ipv6DestCidrIp;
    }

    /**
     * @return ipv6SourceCidrIp
     */
    public String getIpv6SourceCidrIp() {
        return this.ipv6SourceCidrIp;
    }

    /**
     * @return nicType
     */
    public String getNicType() {
        return this.nicType;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return permissions
     */
    public java.util.List < Permissions> getPermissions() {
        return this.permissions;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return portRange
     */
    public String getPortRange() {
        return this.portRange;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return sourceCidrIp
     */
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    /**
     * @return sourceGroupId
     */
    public String getSourceGroupId() {
        return this.sourceGroupId;
    }

    /**
     * @return sourceGroupOwnerAccount
     */
    public String getSourceGroupOwnerAccount() {
        return this.sourceGroupOwnerAccount;
    }

    /**
     * @return sourceGroupOwnerId
     */
    public Long getSourceGroupOwnerId() {
        return this.sourceGroupOwnerId;
    }

    /**
     * @return sourcePortRange
     */
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    /**
     * @return sourcePrefixListId
     */
    public String getSourcePrefixListId() {
        return this.sourcePrefixListId;
    }

    public static final class Builder extends Request.Builder<AuthorizeSecurityGroupRequest, Builder> {
        private String sourceRegionId; 
        private String clientToken; 
        private String description; 
        private String destCidrIp; 
        private String ipProtocol; 
        private String ipv6DestCidrIp; 
        private String ipv6SourceCidrIp; 
        private String nicType; 
        private String ownerAccount; 
        private Long ownerId; 
        private java.util.List < Permissions> permissions; 
        private String policy; 
        private String portRange; 
        private String priority; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityGroupId; 
        private String sourceCidrIp; 
        private String sourceGroupId; 
        private String sourceGroupOwnerAccount; 
        private Long sourceGroupOwnerId; 
        private String sourcePortRange; 
        private String sourcePrefixListId; 

        private Builder() {
            super();
        } 

        private Builder(AuthorizeSecurityGroupRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.destCidrIp = request.destCidrIp;
            this.ipProtocol = request.ipProtocol;
            this.ipv6DestCidrIp = request.ipv6DestCidrIp;
            this.ipv6SourceCidrIp = request.ipv6SourceCidrIp;
            this.nicType = request.nicType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.permissions = request.permissions;
            this.policy = request.policy;
            this.portRange = request.portRange;
            this.priority = request.priority;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityGroupId = request.securityGroupId;
            this.sourceCidrIp = request.sourceCidrIp;
            this.sourceGroupId = request.sourceGroupId;
            this.sourceGroupOwnerAccount = request.sourceGroupOwnerAccount;
            this.sourceGroupOwnerId = request.sourceGroupOwnerId;
            this.sourcePortRange = request.sourcePortRange;
            this.sourcePrefixListId = request.sourcePrefixListId;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.Description` to specify the description of the security group rule.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.DestCidrIp` to specify the destination IPv4 CIDR block.
         */
        public Builder destCidrIp(String destCidrIp) {
            this.putQueryParameter("DestCidrIp", destCidrIp);
            this.destCidrIp = destCidrIp;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.IpProtocol` to specify the transport layer protocol.
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.Ipv6DestCidrIp` to specify the destination IPv6 CIDR block.
         */
        public Builder ipv6DestCidrIp(String ipv6DestCidrIp) {
            this.putQueryParameter("Ipv6DestCidrIp", ipv6DestCidrIp);
            this.ipv6DestCidrIp = ipv6DestCidrIp;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.Ipv6SourceCidrIp` to specify the source IPv6 CIDR block.
         */
        public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
            this.putQueryParameter("Ipv6SourceCidrIp", ipv6SourceCidrIp);
            this.ipv6SourceCidrIp = ipv6SourceCidrIp;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.NicType` to specify the NIC type.
         */
        public Builder nicType(String nicType) {
            this.putQueryParameter("NicType", nicType);
            this.nicType = nicType;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The inbound rules that you want to add to the security group. Valid values of N: 1 to 100.
         */
        public Builder permissions(java.util.List < Permissions> permissions) {
            this.putQueryParameter("Permissions", permissions);
            this.permissions = permissions;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.Policy` to specify whether to allow inbound access.
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.PortRange` to specify the range of destination ports.
         */
        public Builder portRange(String portRange) {
            this.putQueryParameter("PortRange", portRange);
            this.portRange = portRange;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.Priority` to specify the rule priority.
         */
        public Builder priority(String priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * The region ID of the security group. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the security group to which you want to add inbound rules.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.SourceCidrIp` to specify the source IPv4 CIDR block.
         */
        public Builder sourceCidrIp(String sourceCidrIp) {
            this.putQueryParameter("SourceCidrIp", sourceCidrIp);
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.SourceGroupId` to specify the ID of the source security group.
         */
        public Builder sourceGroupId(String sourceGroupId) {
            this.putQueryParameter("SourceGroupId", sourceGroupId);
            this.sourceGroupId = sourceGroupId;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.SourceGroupOwnerAccount` to specify the Alibaba Cloud account that manages the source security group.
         */
        public Builder sourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
            this.putQueryParameter("SourceGroupOwnerAccount", sourceGroupOwnerAccount);
            this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.SourceGroupOwnerId` to specify the ID of the Alibaba Cloud account that manages the source security group.
         */
        public Builder sourceGroupOwnerId(Long sourceGroupOwnerId) {
            this.putQueryParameter("SourceGroupOwnerId", sourceGroupOwnerId);
            this.sourceGroupOwnerId = sourceGroupOwnerId;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.SourcePortRange` to specify the range of source ports.
         */
        public Builder sourcePortRange(String sourcePortRange) {
            this.putQueryParameter("SourcePortRange", sourcePortRange);
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.SourcePrefixListId`to specify the ID of the source prefix list.
         */
        public Builder sourcePrefixListId(String sourcePrefixListId) {
            this.putQueryParameter("SourcePrefixListId", sourcePrefixListId);
            this.sourcePrefixListId = sourcePrefixListId;
            return this;
        }

        @Override
        public AuthorizeSecurityGroupRequest build() {
            return new AuthorizeSecurityGroupRequest(this);
        } 

    } 

    public static class Permissions extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DestCidrIp")
        private String destCidrIp;

        @NameInMap("IpProtocol")
        private String ipProtocol;

        @NameInMap("Ipv6DestCidrIp")
        private String ipv6DestCidrIp;

        @NameInMap("Ipv6SourceCidrIp")
        private String ipv6SourceCidrIp;

        @NameInMap("NicType")
        private String nicType;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("PortRange")
        private String portRange;

        @NameInMap("Priority")
        private String priority;

        @NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        @NameInMap("SourceGroupId")
        private String sourceGroupId;

        @NameInMap("SourceGroupOwnerAccount")
        private String sourceGroupOwnerAccount;

        @NameInMap("SourceGroupOwnerId")
        private Long sourceGroupOwnerId;

        @NameInMap("SourcePortRange")
        private String sourcePortRange;

        @NameInMap("SourcePrefixListId")
        private String sourcePrefixListId;

        private Permissions(Builder builder) {
            this.description = builder.description;
            this.destCidrIp = builder.destCidrIp;
            this.ipProtocol = builder.ipProtocol;
            this.ipv6DestCidrIp = builder.ipv6DestCidrIp;
            this.ipv6SourceCidrIp = builder.ipv6SourceCidrIp;
            this.nicType = builder.nicType;
            this.policy = builder.policy;
            this.portRange = builder.portRange;
            this.priority = builder.priority;
            this.sourceCidrIp = builder.sourceCidrIp;
            this.sourceGroupId = builder.sourceGroupId;
            this.sourceGroupOwnerAccount = builder.sourceGroupOwnerAccount;
            this.sourceGroupOwnerId = builder.sourceGroupOwnerId;
            this.sourcePortRange = builder.sourcePortRange;
            this.sourcePrefixListId = builder.sourcePrefixListId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Permissions create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destCidrIp
         */
        public String getDestCidrIp() {
            return this.destCidrIp;
        }

        /**
         * @return ipProtocol
         */
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        /**
         * @return ipv6DestCidrIp
         */
        public String getIpv6DestCidrIp() {
            return this.ipv6DestCidrIp;
        }

        /**
         * @return ipv6SourceCidrIp
         */
        public String getIpv6SourceCidrIp() {
            return this.ipv6SourceCidrIp;
        }

        /**
         * @return nicType
         */
        public String getNicType() {
            return this.nicType;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return portRange
         */
        public String getPortRange() {
            return this.portRange;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return sourceCidrIp
         */
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        /**
         * @return sourceGroupId
         */
        public String getSourceGroupId() {
            return this.sourceGroupId;
        }

        /**
         * @return sourceGroupOwnerAccount
         */
        public String getSourceGroupOwnerAccount() {
            return this.sourceGroupOwnerAccount;
        }

        /**
         * @return sourceGroupOwnerId
         */
        public Long getSourceGroupOwnerId() {
            return this.sourceGroupOwnerId;
        }

        /**
         * @return sourcePortRange
         */
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        /**
         * @return sourcePrefixListId
         */
        public String getSourcePrefixListId() {
            return this.sourcePrefixListId;
        }

        public static final class Builder {
            private String description; 
            private String destCidrIp; 
            private String ipProtocol; 
            private String ipv6DestCidrIp; 
            private String ipv6SourceCidrIp; 
            private String nicType; 
            private String policy; 
            private String portRange; 
            private String priority; 
            private String sourceCidrIp; 
            private String sourceGroupId; 
            private String sourceGroupOwnerAccount; 
            private Long sourceGroupOwnerId; 
            private String sourcePortRange; 
            private String sourcePrefixListId; 

            /**
             * The description of the security group rule. The description must be 1 to 512 characters in length.
             * <p>
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The destination IPv4 CIDR block. CIDR blocks and IPv4 addresses are supported.
             * <p>
             * 
             * This parameter is supported by quintuple rules. For more information, see [Security group quintuple rules](~~97439~~).
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder destCidrIp(String destCidrIp) {
                this.destCidrIp = destCidrIp;
                return this;
            }

            /**
             * The transport layer protocol of the security group rule. The value of this parameter is not case-sensitive. Valid values:
             * <p>
             * 
             * *   TCP
             * *   UDP
             * *   ICMP
             * *   ICMPv6
             * *   GRE
             * *   ALL: All protocols are supported.
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * The destination IPv6 CIDR block. CIDR blocks and IPv6 addresses are supported.
             * <p>
             * 
             * This parameter is supported by quintuple rules. For more information, see [Security group quintuple rules](~~97439~~).
             * 
             * Valid values of N: 1 to 100.
             * 
             * > This parameter takes effect only when the destinations are ECS instances that reside in VPCs and support IPv6 CIDR blocks. You cannot specify this parameter and `DestCidrIp` at the same time.
             */
            public Builder ipv6DestCidrIp(String ipv6DestCidrIp) {
                this.ipv6DestCidrIp = ipv6DestCidrIp;
                return this;
            }

            /**
             * The source IPv6 CIDR block of the security group rule. CIDR blocks and IPv6 addresses are supported.
             * <p>
             * 
             * Valid values of N: 1 to 100.
             * 
             * > This parameter takes effect only when the sources are ECS instances that reside in VPCs and support IPv6 CIDR blocks. You cannot specify this parameter and `SourceCidrIp` at the same time.
             */
            public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
                this.ipv6SourceCidrIp = ipv6SourceCidrIp;
                return this;
            }

            /**
             * The network interface card (NIC) type of the security group rule when the security group is in the classic network. Valid values:
             * <p>
             * 
             * *   internet
             * *   intranet
             * 
             * If the security group is in a VPC, the value of this parameter is fixed to intranet.
             * 
             * If you specify only DestGroupId when you configure access between security groups, you must set this parameter to intranet.
             * 
             * Default value: internet.
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder nicType(String nicType) {
                this.nicType = nicType;
                return this;
            }

            /**
             * The authorization policy. Valid values:
             * <p>
             * 
             * *   accept: allows access.
             * *   drop: denies access and does not return responses. In this case, the request times out or the connection cannot be established.
             * 
             * Default value: accept.
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * The range of destination ports that correspond to the transport layer protocol of the security group rule. Valid values:
             * <p>
             * 
             * *   If you set Permissions.N.IpProtocol to TCP or UDP, the port number range is 1 to 65535. Separate the start port number and the end port number with a forward slash (/). Example: 1/200.
             * *   If you set Permissions.N.IpProtocol to ICMP, the port number range is -1/-1.
             * *   If you set Permissions.N.IpProtocol to GRE, the port number range is -1/-1.
             * *   If you set Permissions.N.IpProtocol to ALL, the port number range is -1/-1.
             * 
             * For more information, see [Common ports used by applications](~~40724~~).
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * The priority of the security group rule. A smaller value specifies a higher priority. Valid values: 1 to 100.
             * <p>
             * 
             * Default value: 1.
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The source IPv4 CIDR block of the security group rule. CIDR blocks and IPv4 addresses are supported.
             * <p>
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * The ID of the source security group that you want to reference in the security group rule.
             * <p>
             * 
             * *   Specify at least one of the following parameters: `SourceGroupId`, `SourceCidrIp`, `Ipv6SourceCidrIp`, and `SourcePrefixListId`.
             * *   If you specify `SourceGroupId` but do not specify `SourceCidrIp` or `Ipv6SourceCidrIp`, you must set `NicType` to `intranet`.
             * *   If you specify `SourceGroupId` and `SourceCidrIp`, `SourceCidrIp` takes precedence.
             * 
             * Valid values of N: 1 to 100.
             * 
             * When you specify this parameter, take note of the following items:
             * 
             * *   You cannot reference security groups as sources or destinations in the rules of advanced security groups.
             * *   You can reference up to 20 security groups as sources or destinations in the rules of each basic security group.
             */
            public Builder sourceGroupId(String sourceGroupId) {
                this.sourceGroupId = sourceGroupId;
                return this;
            }

            /**
             * The Alibaba Cloud account that manages the source security group when you set a security group rule across accounts.
             * <p>
             * 
             * *   If `SourceGroupOwnerAccount` and `SourceGroupOwnerId` are empty, access permissions are configured for another security group that is managed by your account.
             * *   If you specify `SourceCidrIp`, `SourceGroupOwnerAccount` becomes invalid.
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder sourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
                this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that manages the source security group when you set a security group rule across accounts.
             * <p>
             * 
             * *   If both `SourceGroupOwnerAccount` and `SourceGroupOwnerId` are empty, access permissions are configured for another security group managed by your account.
             * *   If you specify `SourceCidrIp`, `SourceGroupOwnerAccount` becomes invalid.
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder sourceGroupOwnerId(Long sourceGroupOwnerId) {
                this.sourceGroupOwnerId = sourceGroupOwnerId;
                return this;
            }

            /**
             * The range of source ports that correspond to the transport layer protocol of the security group rule. Valid values:
             * <p>
             * 
             * *   If you set Permissions.N.IpProtocol to TCP or UDP, the port number range is 1 to 65535. Separate the start port number and the end port number with a forward slash (/). Example: 1/200.
             * *   If you set Permissions.N.IpProtocol to ICMP, the port number range is -1/-1.
             * *   If you set Permissions.N.IpProtocol to GRE, the port number range is -1/-1.
             * *   If you set Permissions.N.IpProtocol to ALL, the port number range is -1/-1.
             * 
             * This parameter is supported by quintuple rules. For more information, see [Security group quintuple rules](~~97439~~).
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            /**
             * The ID of the source prefix list that you want to reference in the security group rule. You can call the [DescribePrefixLists](~~205046~~) operation to query the IDs of available prefix lists.
             * <p>
             * 
             * Valid values of N: 1 to 100.
             * 
             * When you specify this parameter, take note of the following items:
             * *   If the security group is of the classic network type, you cannot reference prefix lists in the security group rules. For information about the limits on security groups and prefix lists, see the "Security group limits" section in [Limits](~~25412#SecurityGroupQuota1~~).
             * *   If you specify `SourceCidrIp`, `Ipv6SourceCidrIp`, or `SourceGroupId`, this parameter is ignored.
             */
            public Builder sourcePrefixListId(String sourcePrefixListId) {
                this.sourcePrefixListId = sourcePrefixListId;
                return this;
            }

            public Permissions build() {
                return new Permissions(this);
            } 

        } 

    }
}
