// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceAttributeRequest</p>
 */
public class ModifyInstanceAttributeRequest extends Request {
    @Query
    @NameInMap("DeleteVpcIpBlock")
    private String deleteVpcIpBlock;

    @Query
    @NameInMap("EgressIpv6Enable")
    private String egressIpv6Enable;

    @Query
    @NameInMap("HttpsPolicy")
    private String httpsPolicy;

    @Query
    @NameInMap("IPV6Enabled")
    private String IPV6Enabled;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("IntranetSegments")
    private String intranetSegments;

    @Query
    @NameInMap("MaintainEndTime")
    private String maintainEndTime;

    @Query
    @NameInMap("MaintainStartTime")
    private String maintainStartTime;

    @Query
    @NameInMap("ToConnectVpcIpBlock")
    private ToConnectVpcIpBlock toConnectVpcIpBlock;

    @Query
    @NameInMap("Token")
    private String token;

    @Query
    @NameInMap("VpcSlbIntranetEnable")
    private String vpcSlbIntranetEnable;

    private ModifyInstanceAttributeRequest(Builder builder) {
        super(builder);
        this.deleteVpcIpBlock = builder.deleteVpcIpBlock;
        this.egressIpv6Enable = builder.egressIpv6Enable;
        this.httpsPolicy = builder.httpsPolicy;
        this.IPV6Enabled = builder.IPV6Enabled;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.intranetSegments = builder.intranetSegments;
        this.maintainEndTime = builder.maintainEndTime;
        this.maintainStartTime = builder.maintainStartTime;
        this.toConnectVpcIpBlock = builder.toConnectVpcIpBlock;
        this.token = builder.token;
        this.vpcSlbIntranetEnable = builder.vpcSlbIntranetEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleteVpcIpBlock
     */
    public String getDeleteVpcIpBlock() {
        return this.deleteVpcIpBlock;
    }

    /**
     * @return egressIpv6Enable
     */
    public String getEgressIpv6Enable() {
        return this.egressIpv6Enable;
    }

    /**
     * @return httpsPolicy
     */
    public String getHttpsPolicy() {
        return this.httpsPolicy;
    }

    /**
     * @return IPV6Enabled
     */
    public String getIPV6Enabled() {
        return this.IPV6Enabled;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return intranetSegments
     */
    public String getIntranetSegments() {
        return this.intranetSegments;
    }

    /**
     * @return maintainEndTime
     */
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    /**
     * @return maintainStartTime
     */
    public String getMaintainStartTime() {
        return this.maintainStartTime;
    }

    /**
     * @return toConnectVpcIpBlock
     */
    public ToConnectVpcIpBlock getToConnectVpcIpBlock() {
        return this.toConnectVpcIpBlock;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return vpcSlbIntranetEnable
     */
    public String getVpcSlbIntranetEnable() {
        return this.vpcSlbIntranetEnable;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceAttributeRequest, Builder> {
        private String deleteVpcIpBlock; 
        private String egressIpv6Enable; 
        private String httpsPolicy; 
        private String IPV6Enabled; 
        private String instanceId; 
        private String instanceName; 
        private String intranetSegments; 
        private String maintainEndTime; 
        private String maintainStartTime; 
        private ToConnectVpcIpBlock toConnectVpcIpBlock; 
        private String token; 
        private String vpcSlbIntranetEnable; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceAttributeRequest request) {
            super(request);
            this.deleteVpcIpBlock = request.deleteVpcIpBlock;
            this.egressIpv6Enable = request.egressIpv6Enable;
            this.httpsPolicy = request.httpsPolicy;
            this.IPV6Enabled = request.IPV6Enabled;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.intranetSegments = request.intranetSegments;
            this.maintainEndTime = request.maintainEndTime;
            this.maintainStartTime = request.maintainStartTime;
            this.toConnectVpcIpBlock = request.toConnectVpcIpBlock;
            this.token = request.token;
            this.vpcSlbIntranetEnable = request.vpcSlbIntranetEnable;
        } 

        /**
         * DeleteVpcIpBlock.
         */
        public Builder deleteVpcIpBlock(String deleteVpcIpBlock) {
            this.putQueryParameter("DeleteVpcIpBlock", deleteVpcIpBlock);
            this.deleteVpcIpBlock = deleteVpcIpBlock;
            return this;
        }

        /**
         * EgressIpv6Enable.
         */
        public Builder egressIpv6Enable(String egressIpv6Enable) {
            this.putQueryParameter("EgressIpv6Enable", egressIpv6Enable);
            this.egressIpv6Enable = egressIpv6Enable;
            return this;
        }

        /**
         * HttpsPolicy.
         */
        public Builder httpsPolicy(String httpsPolicy) {
            this.putQueryParameter("HttpsPolicy", httpsPolicy);
            this.httpsPolicy = httpsPolicy;
            return this;
        }

        /**
         * IPV6Enabled.
         */
        public Builder IPV6Enabled(String IPV6Enabled) {
            this.putQueryParameter("IPV6Enabled", IPV6Enabled);
            this.IPV6Enabled = IPV6Enabled;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * IntranetSegments.
         */
        public Builder intranetSegments(String intranetSegments) {
            this.putQueryParameter("IntranetSegments", intranetSegments);
            this.intranetSegments = intranetSegments;
            return this;
        }

        /**
         * MaintainEndTime.
         */
        public Builder maintainEndTime(String maintainEndTime) {
            this.putQueryParameter("MaintainEndTime", maintainEndTime);
            this.maintainEndTime = maintainEndTime;
            return this;
        }

        /**
         * MaintainStartTime.
         */
        public Builder maintainStartTime(String maintainStartTime) {
            this.putQueryParameter("MaintainStartTime", maintainStartTime);
            this.maintainStartTime = maintainStartTime;
            return this;
        }

        /**
         * ToConnectVpcIpBlock.
         */
        public Builder toConnectVpcIpBlock(ToConnectVpcIpBlock toConnectVpcIpBlock) {
            String toConnectVpcIpBlockShrink = shrink(toConnectVpcIpBlock, "ToConnectVpcIpBlock", "json");
            this.putQueryParameter("ToConnectVpcIpBlock", toConnectVpcIpBlockShrink);
            this.toConnectVpcIpBlock = toConnectVpcIpBlock;
            return this;
        }

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * VpcSlbIntranetEnable.
         */
        public Builder vpcSlbIntranetEnable(String vpcSlbIntranetEnable) {
            this.putQueryParameter("VpcSlbIntranetEnable", vpcSlbIntranetEnable);
            this.vpcSlbIntranetEnable = vpcSlbIntranetEnable;
            return this;
        }

        @Override
        public ModifyInstanceAttributeRequest build() {
            return new ModifyInstanceAttributeRequest(this);
        } 

    } 

    public static class ToConnectVpcIpBlock extends TeaModel {
        @NameInMap("CidrBlock")
        private String cidrBlock;

        @NameInMap("Customized")
        private Boolean customized;

        @NameInMap("VswitchId")
        private String vswitchId;

        @NameInMap("ZoneId")
        private String zoneId;

        private ToConnectVpcIpBlock(Builder builder) {
            this.cidrBlock = builder.cidrBlock;
            this.customized = builder.customized;
            this.vswitchId = builder.vswitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToConnectVpcIpBlock create() {
            return builder().build();
        }

        /**
         * @return cidrBlock
         */
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        /**
         * @return customized
         */
        public Boolean getCustomized() {
            return this.customized;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String cidrBlock; 
            private Boolean customized; 
            private String vswitchId; 
            private String zoneId; 

            /**
             * CidrBlock.
             */
            public Builder cidrBlock(String cidrBlock) {
                this.cidrBlock = cidrBlock;
                return this;
            }

            /**
             * Customized.
             */
            public Builder customized(Boolean customized) {
                this.customized = customized;
                return this;
            }

            /**
             * VswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ToConnectVpcIpBlock build() {
                return new ToConnectVpcIpBlock(this);
            } 

        } 

    }
}
