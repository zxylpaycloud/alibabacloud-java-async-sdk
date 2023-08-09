// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeploymentSetRequest} extends {@link RequestModel}
 *
 * <p>CreateDeploymentSetRequest</p>
 */
public class CreateDeploymentSetRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DeploymentSetName")
    private String deploymentSetName;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("Granularity")
    private String granularity;

    @Query
    @NameInMap("GroupCount")
    private Long groupCount;

    @Query
    @NameInMap("OnUnableToRedeployFailedInstance")
    private String onUnableToRedeployFailedInstance;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

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
    @NameInMap("Strategy")
    private String strategy;

    private CreateDeploymentSetRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.clientToken = builder.clientToken;
        this.deploymentSetName = builder.deploymentSetName;
        this.description = builder.description;
        this.domain = builder.domain;
        this.granularity = builder.granularity;
        this.groupCount = builder.groupCount;
        this.onUnableToRedeployFailedInstance = builder.onUnableToRedeployFailedInstance;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.strategy = builder.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDeploymentSetRequest create() {
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
     * @return deploymentSetName
     */
    public String getDeploymentSetName() {
        return this.deploymentSetName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return granularity
     */
    public String getGranularity() {
        return this.granularity;
    }

    /**
     * @return groupCount
     */
    public Long getGroupCount() {
        return this.groupCount;
    }

    /**
     * @return onUnableToRedeployFailedInstance
     */
    public String getOnUnableToRedeployFailedInstance() {
        return this.onUnableToRedeployFailedInstance;
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
     * @return strategy
     */
    public String getStrategy() {
        return this.strategy;
    }

    public static final class Builder extends Request.Builder<CreateDeploymentSetRequest, Builder> {
        private String sourceRegionId; 
        private String clientToken; 
        private String deploymentSetName; 
        private String description; 
        private String domain; 
        private String granularity; 
        private Long groupCount; 
        private String onUnableToRedeployFailedInstance; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String strategy; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeploymentSetRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.clientToken = request.clientToken;
            this.deploymentSetName = request.deploymentSetName;
            this.description = request.description;
            this.domain = request.domain;
            this.granularity = request.granularity;
            this.groupCount = request.groupCount;
            this.onUnableToRedeployFailedInstance = request.onUnableToRedeployFailedInstance;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.strategy = request.strategy;
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
         * The description of the deployment set. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate a client token. Make sure that a unique client token is used for each request. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder deploymentSetName(String deploymentSetName) {
            this.putQueryParameter("DeploymentSetName", deploymentSetName);
            this.deploymentSetName = deploymentSetName;
            return this;
        }

        /**
         * The emergency solution to use in the situation where instances in the deployment set cannot be evenly distributed to different zones due to resource insufficiency after the instances failover. Valid values:
         * <p>
         * 
         * *   CancelMembershipAndStart: removes the instances from the deployment set and starts the instances immediately after they are failed over.
         * *   KeepStopped: leaves the instances in the Stopped state and starts them after resources are replenished.
         * 
         * Default value: CancelMembershipAndStart.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the deployment set. The name must be 2 to 128 characters in length, It must start with a letter and cannot start with `http://` or `https://`. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The deployment domain. Set the value to Default.
         * <p>
         * 
         * Default: Instances in the deployment set are distributed only within the current zone.
         */
        public Builder granularity(String granularity) {
            this.putQueryParameter("Granularity", granularity);
            this.granularity = granularity;
            return this;
        }

        /**
         * The deployment strategy. Valid values:
         * <p>
         * 
         * *   Availability: high availability strategy.
         * *   AvailabilityGroup: high availability group strategy.
         * 
         * Default value: Availability.
         */
        public Builder groupCount(Long groupCount) {
            this.putQueryParameter("GroupCount", groupCount);
            this.groupCount = groupCount;
            return this;
        }

        /**
         * The region ID of the deployment set. You can call the [DescribeRegions](~~25609~~) operation to query the most recent list of regions.
         */
        public Builder onUnableToRedeployFailedInstance(String onUnableToRedeployFailedInstance) {
            this.putQueryParameter("OnUnableToRedeployFailedInstance", onUnableToRedeployFailedInstance);
            this.onUnableToRedeployFailedInstance = onUnableToRedeployFailedInstance;
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
         * Creates a deployment set in a specific region.
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
         * The deployment granularity. Set the value to host.
         * <p>
         * 
         * host: Instances in the deployment set are dispersed at the granularity of hosts.
         */
        public Builder strategy(String strategy) {
            this.putQueryParameter("Strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        @Override
        public CreateDeploymentSetRequest build() {
            return new CreateDeploymentSetRequest(this);
        } 

    } 

}
