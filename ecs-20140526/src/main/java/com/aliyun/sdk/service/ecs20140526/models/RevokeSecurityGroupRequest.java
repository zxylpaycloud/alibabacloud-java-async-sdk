// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeSecurityGroupRequest} extends {@link RequestModel}
 *
 * <p>RevokeSecurityGroupRequest</p>
 */
public class RevokeSecurityGroupRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @Deprecated
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestCidrIp")
    @Deprecated
    private String destCidrIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpProtocol")
    @Deprecated
    private String ipProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6DestCidrIp")
    @Deprecated
    private String ipv6DestCidrIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv6SourceCidrIp")
    @Deprecated
    private String ipv6SourceCidrIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NicType")
    @Deprecated
    private String nicType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Permissions")
    private java.util.List < Permissions> permissions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policy")
    @Deprecated
    private String policy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortRange")
    @Deprecated
    private String portRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    @Deprecated
    private String priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupRuleId")
    private java.util.List < String > securityGroupRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
    @Deprecated
    private String sourceCidrIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceGroupId")
    @Deprecated
    private String sourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceGroupOwnerAccount")
    @Deprecated
    private String sourceGroupOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceGroupOwnerId")
    @Deprecated
    private Long sourceGroupOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePortRange")
    @Deprecated
    private String sourcePortRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePrefixListId")
    @Deprecated
    private String sourcePrefixListId;

    private RevokeSecurityGroupRequest(Builder builder) {
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
        this.securityGroupRuleId = builder.securityGroupRuleId;
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

    public static RevokeSecurityGroupRequest create() {
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
     * @return securityGroupRuleId
     */
    public java.util.List < String > getSecurityGroupRuleId() {
        return this.securityGroupRuleId;
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

    public static final class Builder extends Request.Builder<RevokeSecurityGroupRequest, Builder> {
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
        private java.util.List < String > securityGroupRuleId; 
        private String sourceCidrIp; 
        private String sourceGroupId; 
        private String sourceGroupOwnerAccount; 
        private Long sourceGroupOwnerId; 
        private String sourcePortRange; 
        private String sourcePrefixListId; 

        private Builder() {
            super();
        } 

        private Builder(RevokeSecurityGroupRequest request) {
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
            this.securityGroupRuleId = request.securityGroupRuleId;
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
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * This parameter is deprecated. Use `Permissions.N.Description` to specify the rule description.
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
         * This parameter is deprecated. Use `Permissions.N.IpProtocol` to specify the protocol.
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
         * This parameter is deprecated. Use `Permissions.N.NicType` to specify the network interface type.
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
         * Security group rule N. Valid values of N: 1 to 100.
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
         * The ID of the security group.
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * The IDs of the security group rules. Valid values of N: 1 to 100.
         */
        public Builder securityGroupRuleId(java.util.List < String > securityGroupRuleId) {
            this.putQueryParameter("SecurityGroupRuleId", securityGroupRuleId);
            this.securityGroupRuleId = securityGroupRuleId;
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
         * This parameter is deprecated. Use `Permissions.N.SourcePrefixListId` to specify the ID of the source prefix list.
         */
        public Builder sourcePrefixListId(String sourcePrefixListId) {
            this.putQueryParameter("SourcePrefixListId", sourcePrefixListId);
            this.sourcePrefixListId = sourcePrefixListId;
            return this;
        }

        @Override
        public RevokeSecurityGroupRequest build() {
            return new RevokeSecurityGroupRequest(this);
        } 

    } 

    public static class Permissions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestCidrIp")
        private String destCidrIp;

        @com.aliyun.core.annotation.NameInMap("IpProtocol")
        private String ipProtocol;

        @com.aliyun.core.annotation.NameInMap("Ipv6DestCidrIp")
        private String ipv6DestCidrIp;

        @com.aliyun.core.annotation.NameInMap("Ipv6SourceCidrIp")
        private String ipv6SourceCidrIp;

        @com.aliyun.core.annotation.NameInMap("NicType")
        private String nicType;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("PortRange")
        private String portRange;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        @com.aliyun.core.annotation.NameInMap("SourceGroupId")
        private String sourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SourceGroupOwnerAccount")
        private String sourceGroupOwnerAccount;

        @com.aliyun.core.annotation.NameInMap("SourceGroupOwnerId")
        private Long sourceGroupOwnerId;

        @com.aliyun.core.annotation.NameInMap("SourcePortRange")
        private String sourcePortRange;

        @com.aliyun.core.annotation.NameInMap("SourcePrefixListId")
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
             * The destination IPv4 CIDR block. IPv4 CIDR blocks and IPv4 addresses are supported.
             * <p>
             * 
             * This parameter is used to support quintuple rules. For more information, see [Security group quintuple rules](~~97439~~).
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder destCidrIp(String destCidrIp) {
                this.destCidrIp = destCidrIp;
                return this;
            }

            /**
             * The protocol. The values of this parameter are case-insensitive. Valid values:
             * <p>
             * 
             * *   TCP.
             * *   UDP.
             * *   ICMP.
             * *   ICMPv6.
             * *   GRE.
             * *   ALL: All protocols are supported.
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * The destination IPv6 CIDR block. IPv6 CIDR blocks and IPv6 addresses are supported.
             * <p>
             * 
             * This parameter is used to support quintuple rules. For more information, see [Security group quintuple rules](~~97439~~).
             * 
             * Valid values of N: 1 to 100.
             * 
             * >  This parameter is valid only for ECS instances that reside in VPCs and support IPv6 CIDR blocks. You cannot specify both this parameter and `DestCidrIp` in the same request.
             */
            public Builder ipv6DestCidrIp(String ipv6DestCidrIp) {
                this.ipv6DestCidrIp = ipv6DestCidrIp;
                return this;
            }

            /**
             * The source IPv6 CIDR block of the security group rule. IPv6 CIDR blocks and IPv6 addresses are supported.
             * <p>
             * 
             * Valid values of N: 1 to 100.
             * 
             * >  This parameter is valid only for Elastic Compute Service (ECS) instances that reside in virtual private clouds (VPCs) and support IPv6 CIDR blocks. You cannot specify both this parameter and `SourceCidrIp` in the same request.
             */
            public Builder ipv6SourceCidrIp(String ipv6SourceCidrIp) {
                this.ipv6SourceCidrIp = ipv6SourceCidrIp;
                return this;
            }

            /**
             * The network interface controller (NIC) type of the security group rule if the security group resides in the classic network. Valid values:
             * <p>
             * 
             * *   internet: public NIC.
             * *   intranet: internal NIC.
             * 
             * If the security group resides in a VPC, this parameter is set to intranet by default and cannot be modified.
             * 
             * If you specify only `SourceGroupId` when you remove access control configurations between security groups, you must set this parameter to intranet.
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
             * The action of the security group rule. Valid values:
             * <p>
             * 
             * *   accept: allows inbound access.
             * *   drop: denies inbound access and returns no responses. In this case, the request times out or the connection cannot be established.
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
             * The range of destination port numbers for the protocols specified in the security group rule. Valid values:
             * <p>
             * 
             * *   If you set IpProtocol to TCP or UDP, the port number range is 1 to 65535. Specify a port number range in the format of \<Start port number>/\<End port number>. Example: 1/200.
             * *   If you set IpProtocol to ICMP, the port number range is -1/-1.
             * *   If you set IpProtocol to GRE, the port number range is -1/-1.
             * *   If you set IpProtocol to ALL, the port number range is -1/-1, which indicates all port numbers.
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
             * The source IPv4 CIDR block of the security group rule. IPv4 CIDR blocks and IPv4 addresses are supported.
             * <p>
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            /**
             * The ID of the source security group that is specified in the security group rule.
             * <p>
             * 
             * *   You must specify at least one of the following parameters: `SourceGroupId`, `SourceCidrIp`, `Ipv6SourceCidrIp`, and `SourcePrefixListId`.
             * *   If you specify `SourceGroupId` but do not specify `SourceCidrIp` or `Ipv6SourceCidrIp`, you must set NicType to intranet.
             * *   If you specify both `SourceGroupId` and `SourceCidrIp`, `SourceCidrIp` takes precedence.
             * 
             * When you specify this parameter, take note of the following items:
             * 
             * *   In advanced security groups, security groups cannot be used as authorization objects.
             * *   In each basic security group, up to 20 security groups can be used as authorization objects in security group rules.
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder sourceGroupId(String sourceGroupId) {
                this.sourceGroupId = sourceGroupId;
                return this;
            }

            /**
             * The Alibaba Cloud account that manages the source security group specified in the security group rule.
             * <p>
             * 
             * *   If both `SourceGroupOwnerAccount` and `SourceGroupOwnerId` are empty, access control on another security group in your Alibaba Cloud account is removed.
             * *   If you specify `SourceCidrIp`, `SourceGroupOwnerAccount` is ignored.
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder sourceGroupOwnerAccount(String sourceGroupOwnerAccount) {
                this.sourceGroupOwnerAccount = sourceGroupOwnerAccount;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that manages the source security group specified in the security group rule.
             * <p>
             * 
             * *   If both `SourceGroupOwnerId` and `SourceGroupOwnerAccount` are empty, access control on another security group in your Alibaba Cloud account is removed.
             * *   If you specify `SourceCidrIp`, `SourceGroupOwnerId` is ignored.
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder sourceGroupOwnerId(Long sourceGroupOwnerId) {
                this.sourceGroupOwnerId = sourceGroupOwnerId;
                return this;
            }

            /**
             * The range of source port numbers for the protocols specified in the security group rule. Valid values:
             * <p>
             * 
             * *   If you set IpProtocol to TCP or UDP, the port number range is 1 to 65535. Specify a port number range in the format of \<Start port number>/\<End port number>. Example: 1/200.
             * *   If you set IpProtocol to ICMP, the port number range is -1/-1.
             * *   If you set IpProtocol to GRE, the port number range is -1/-1.
             * *   If you set IpProtocol to ALL, the port number range is -1/-1, which indicates all port numbers.
             * 
             * This parameter is used to support quintuple rules. For more information, see [Security group quintuple rules](~~97439~~).
             * 
             * Valid values of N: 1 to 100.
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            /**
             * The ID of the source prefix list of the security group rule. You can call the [DescribePrefixLists](~~205046~~) operation to query the IDs of available prefix lists.
             * <p>
             * 
             * When you specify this parameter, take note of the following items:
             * 
             * *   If a security group resides in the classic network, you cannot specify prefix lists in the rules of the security group. For information about the limits on security groups and prefix lists, see the [Security group limits](~~25412#SecurityGroupQuota1~~) section of the "Limits and quotas" topic.
             * *   If you specify `SourceCidrIp`, `Ipv6SourceCidrIp`, or `SourceGroupId`, this parameter is ignored.
             * 
             * Valid values of N: 1 to 100.
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
