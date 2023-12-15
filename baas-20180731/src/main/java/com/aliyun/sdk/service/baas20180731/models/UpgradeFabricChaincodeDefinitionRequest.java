// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeFabricChaincodeDefinitionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeFabricChaincodeDefinitionRequest</p>
 */
public class UpgradeFabricChaincodeDefinitionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ChaincodeId")
    @Validation(required = true)
    private String chaincodeId;

    @Body
    @NameInMap("ChaincodePackageId")
    @Validation(required = true)
    private String chaincodePackageId;

    @Body
    @NameInMap("ChaincodeVersion")
    @Validation(required = true)
    private String chaincodeVersion;

    @Body
    @NameInMap("ChannelId")
    private String channelId;

    @Body
    @NameInMap("CollectionConfig")
    private String collectionConfig;

    @Body
    @NameInMap("EndorsePolicy")
    private String endorsePolicy;

    @Body
    @NameInMap("InitRequired")
    private Boolean initRequired;

    @Body
    @NameInMap("Location")
    private String location;

    @Body
    @NameInMap("OrganizationId")
    @Validation(required = true)
    private String organizationId;

    private UpgradeFabricChaincodeDefinitionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.chaincodeId = builder.chaincodeId;
        this.chaincodePackageId = builder.chaincodePackageId;
        this.chaincodeVersion = builder.chaincodeVersion;
        this.channelId = builder.channelId;
        this.collectionConfig = builder.collectionConfig;
        this.endorsePolicy = builder.endorsePolicy;
        this.initRequired = builder.initRequired;
        this.location = builder.location;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeFabricChaincodeDefinitionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return chaincodeId
     */
    public String getChaincodeId() {
        return this.chaincodeId;
    }

    /**
     * @return chaincodePackageId
     */
    public String getChaincodePackageId() {
        return this.chaincodePackageId;
    }

    /**
     * @return chaincodeVersion
     */
    public String getChaincodeVersion() {
        return this.chaincodeVersion;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return collectionConfig
     */
    public String getCollectionConfig() {
        return this.collectionConfig;
    }

    /**
     * @return endorsePolicy
     */
    public String getEndorsePolicy() {
        return this.endorsePolicy;
    }

    /**
     * @return initRequired
     */
    public Boolean getInitRequired() {
        return this.initRequired;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<UpgradeFabricChaincodeDefinitionRequest, Builder> {
        private String regionId; 
        private String chaincodeId; 
        private String chaincodePackageId; 
        private String chaincodeVersion; 
        private String channelId; 
        private String collectionConfig; 
        private String endorsePolicy; 
        private Boolean initRequired; 
        private String location; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeFabricChaincodeDefinitionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.chaincodeId = request.chaincodeId;
            this.chaincodePackageId = request.chaincodePackageId;
            this.chaincodeVersion = request.chaincodeVersion;
            this.channelId = request.channelId;
            this.collectionConfig = request.collectionConfig;
            this.endorsePolicy = request.endorsePolicy;
            this.initRequired = request.initRequired;
            this.location = request.location;
            this.organizationId = request.organizationId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ChaincodeId.
         */
        public Builder chaincodeId(String chaincodeId) {
            this.putBodyParameter("ChaincodeId", chaincodeId);
            this.chaincodeId = chaincodeId;
            return this;
        }

        /**
         * ChaincodePackageId.
         */
        public Builder chaincodePackageId(String chaincodePackageId) {
            this.putBodyParameter("ChaincodePackageId", chaincodePackageId);
            this.chaincodePackageId = chaincodePackageId;
            return this;
        }

        /**
         * ChaincodeVersion.
         */
        public Builder chaincodeVersion(String chaincodeVersion) {
            this.putBodyParameter("ChaincodeVersion", chaincodeVersion);
            this.chaincodeVersion = chaincodeVersion;
            return this;
        }

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putBodyParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * CollectionConfig.
         */
        public Builder collectionConfig(String collectionConfig) {
            this.putBodyParameter("CollectionConfig", collectionConfig);
            this.collectionConfig = collectionConfig;
            return this;
        }

        /**
         * EndorsePolicy.
         */
        public Builder endorsePolicy(String endorsePolicy) {
            this.putBodyParameter("EndorsePolicy", endorsePolicy);
            this.endorsePolicy = endorsePolicy;
            return this;
        }

        /**
         * InitRequired.
         */
        public Builder initRequired(Boolean initRequired) {
            this.putBodyParameter("InitRequired", initRequired);
            this.initRequired = initRequired;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.putBodyParameter("Location", location);
            this.location = location;
            return this;
        }

        /**
         * OrganizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putBodyParameter("OrganizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public UpgradeFabricChaincodeDefinitionRequest build() {
            return new UpgradeFabricChaincodeDefinitionRequest(this);
        } 

    } 

}
