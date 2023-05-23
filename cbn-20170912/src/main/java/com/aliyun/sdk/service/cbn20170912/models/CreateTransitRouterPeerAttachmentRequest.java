// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTransitRouterPeerAttachmentRequest} extends {@link RequestModel}
 *
 * <p>CreateTransitRouterPeerAttachmentRequest</p>
 */
public class CreateTransitRouterPeerAttachmentRequest extends Request {
    @Query
    @NameInMap("AutoPublishRouteEnabled")
    private Boolean autoPublishRouteEnabled;

    @Query
    @NameInMap("Bandwidth")
    @Validation(maximum = 100000000)
    private Integer bandwidth;

    @Query
    @NameInMap("BandwidthType")
    private String bandwidthType;

    @Query
    @NameInMap("CenBandwidthPackageId")
    private String cenBandwidthPackageId;

    @Query
    @NameInMap("CenId")
    private String cenId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PeerTransitRouterId")
    @Validation(required = true)
    private String peerTransitRouterId;

    @Query
    @NameInMap("PeerTransitRouterRegionId")
    private String peerTransitRouterRegionId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("TransitRouterAttachmentDescription")
    private String transitRouterAttachmentDescription;

    @Query
    @NameInMap("TransitRouterAttachmentName")
    private String transitRouterAttachmentName;

    @Query
    @NameInMap("TransitRouterId")
    private String transitRouterId;

    private CreateTransitRouterPeerAttachmentRequest(Builder builder) {
        super(builder);
        this.autoPublishRouteEnabled = builder.autoPublishRouteEnabled;
        this.bandwidth = builder.bandwidth;
        this.bandwidthType = builder.bandwidthType;
        this.cenBandwidthPackageId = builder.cenBandwidthPackageId;
        this.cenId = builder.cenId;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.peerTransitRouterId = builder.peerTransitRouterId;
        this.peerTransitRouterRegionId = builder.peerTransitRouterRegionId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.transitRouterAttachmentDescription = builder.transitRouterAttachmentDescription;
        this.transitRouterAttachmentName = builder.transitRouterAttachmentName;
        this.transitRouterId = builder.transitRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterPeerAttachmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPublishRouteEnabled
     */
    public Boolean getAutoPublishRouteEnabled() {
        return this.autoPublishRouteEnabled;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return bandwidthType
     */
    public String getBandwidthType() {
        return this.bandwidthType;
    }

    /**
     * @return cenBandwidthPackageId
     */
    public String getCenBandwidthPackageId() {
        return this.cenBandwidthPackageId;
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
     * @return peerTransitRouterId
     */
    public String getPeerTransitRouterId() {
        return this.peerTransitRouterId;
    }

    /**
     * @return peerTransitRouterRegionId
     */
    public String getPeerTransitRouterRegionId() {
        return this.peerTransitRouterRegionId;
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
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return transitRouterAttachmentDescription
     */
    public String getTransitRouterAttachmentDescription() {
        return this.transitRouterAttachmentDescription;
    }

    /**
     * @return transitRouterAttachmentName
     */
    public String getTransitRouterAttachmentName() {
        return this.transitRouterAttachmentName;
    }

    /**
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public static final class Builder extends Request.Builder<CreateTransitRouterPeerAttachmentRequest, Builder> {
        private Boolean autoPublishRouteEnabled; 
        private Integer bandwidth; 
        private String bandwidthType; 
        private String cenBandwidthPackageId; 
        private String cenId; 
        private String clientToken; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String peerTransitRouterId; 
        private String peerTransitRouterRegionId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < Tag> tag; 
        private String transitRouterAttachmentDescription; 
        private String transitRouterAttachmentName; 
        private String transitRouterId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTransitRouterPeerAttachmentRequest request) {
            super(request);
            this.autoPublishRouteEnabled = request.autoPublishRouteEnabled;
            this.bandwidth = request.bandwidth;
            this.bandwidthType = request.bandwidthType;
            this.cenBandwidthPackageId = request.cenBandwidthPackageId;
            this.cenId = request.cenId;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.peerTransitRouterId = request.peerTransitRouterId;
            this.peerTransitRouterRegionId = request.peerTransitRouterRegionId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tag = request.tag;
            this.transitRouterAttachmentDescription = request.transitRouterAttachmentDescription;
            this.transitRouterAttachmentName = request.transitRouterAttachmentName;
            this.transitRouterId = request.transitRouterId;
        } 

        /**
         * The tags.
         */
        public Builder autoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
            this.putQueryParameter("AutoPublishRouteEnabled", autoPublishRouteEnabled);
            this.autoPublishRouteEnabled = autoPublishRouteEnabled;
            return this;
        }

        /**
         * The tag keys of the resources. 
         * <p>
         * 
         * The tag keys cannot be an empty string. The tag keys can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.  
         * 
         * You can specify at most 20 tag keys.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder bandwidthType(String bandwidthType) {
            this.putQueryParameter("BandwidthType", bandwidthType);
            this.bandwidthType = bandwidthType;
            return this;
        }

        /**
         * The tag values of the resources. 
         * <p>
         * 
         * The tag values can be 0 to 128 characters in length, and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.  
         * 
         * Each tag key has a unique tag value. You can specify at most 20 tag values in each call.
         */
        public Builder cenBandwidthPackageId(String cenBandwidthPackageId) {
            this.putQueryParameter("CenBandwidthPackageId", cenBandwidthPackageId);
            this.cenBandwidthPackageId = cenBandwidthPackageId;
            return this;
        }

        /**
         * The ID of the peer transit router.
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * The description of the inter-region connection.
         * <p>
         * 
         * The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the inter-region connection.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
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
         * Specifies whether to check the request but not perform the operation. The system checks the permissions and the status of the specified instances. Valid values:
         * <p>
         * 
         * *   **false** (default): checks the request. If the request passes the check, the inter-region connection is created.
         * *   **true**: checks the request but does not perform the operation. The inter-region connection is not created after the request passes the check. If you use this value, the system checks the required parameters and the request syntax. If the request fails to pass the precheck, an error message is returned. If the request passes the check, the system returns the ID of the request.
         */
        public Builder peerTransitRouterId(String peerTransitRouterId) {
            this.putQueryParameter("PeerTransitRouterId", peerTransitRouterId);
            this.peerTransitRouterId = peerTransitRouterId;
            return this;
        }

        /**
         * The method that is used to allocate bandwidth to the inter-region connection. Valid values:
         * <p>
         * 
         * **BandwidthPackage**: allocates bandwidth from a bandwidth plan.
         * 
         * **DataTransfer**: uses pay-by-data-transfer bandwidth.
         */
        public Builder peerTransitRouterRegionId(String peerTransitRouterRegionId) {
            this.putQueryParameter("PeerTransitRouterRegionId", peerTransitRouterRegionId);
            this.peerTransitRouterRegionId = peerTransitRouterRegionId;
            return this;
        }

        /**
         * Specifies whether to enable the local Enterprise Edition transit router to automatically advertise the routes of the inter-region connection to the peer transit router. Valid values:
         * <p>
         * 
         * *   **false** (default): no.
         * *   **true**: yes.
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
         * 614519
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the bandwidth plan that is used to allocate bandwidth to the inter-region connection.
         * <p>
         * 
         * >  If you set **BandwidthType** to **DataTransfer**, you do not need to set this parameter.
         */
        public Builder transitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
            this.putQueryParameter("TransitRouterAttachmentDescription", transitRouterAttachmentDescription);
            this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
            return this;
        }

        /**
         * The bandwidth value of the inter-region connection. Unit: Mbit/s.
         * <p>
         * 
         * *   If you set **BandwidthType** to **BandwidthPackage**, this parameter specifies the bandwidth that is available for the inter-region connection.
         * 
         * <!---->
         * 
         * *   If you set **BandwidthType** to **DataTransfer**, this parameter specifies the bandwidth limit of the inter-region connection.
         */
        public Builder transitRouterAttachmentName(String transitRouterAttachmentName) {
            this.putQueryParameter("TransitRouterAttachmentName", transitRouterAttachmentName);
            this.transitRouterAttachmentName = transitRouterAttachmentName;
            return this;
        }

        /**
         * The ID of the region where the peer transit router is deployed.
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        @Override
        public CreateTransitRouterPeerAttachmentRequest build() {
            return new CreateTransitRouterPeerAttachmentRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
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
            private String key; 
            private String value; 

            /**
             * master
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * ## Background information
             * <p>
             * 
             * By default, 1 Kbit/s of bandwidth is provided for inter-region communication between transit routers. This allows you to test the connectivity of inter-region IPv4 networks. To allow services that are deployed in different regions to communicate with each other, you must create an inter-region connection and allocate bandwidth resources to the connection.  
             * 
             * Enterprise Edition transit routers allow you to allocate bandwidth resources to inter-region connections by using the following methods: 
             * 
             * - **Allocate bandwidth resources from a bandwidth plan**:  You must purchase a bandwidth plan, and then allocate bandwidth resources from the bandwidth plan to inter-region connections. For more information, see [CreateCenBandwidthPackage](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/createcenbandwidthpackage).
             * 
             * - **Use pay-by-data-transfer bandwidth resources**:  You can set a maximum bandwidth value for an inter-region connection. Then, you are charged for the amount of data transfer over the connection. For more information, see [Cross-region data transfers](https://www.alibabacloud.com/help/en/cloud-data-transmission/latest/cross-region-data-transfers).
             * 
             * 
             * ## Usage notes
             * 
             * **CreateTransitRouterPeerAttachment** is an asynchronous operation. After you send a request, the system returns the inter-region connection ID but the operation is still being performed in the system background. You can call **ListTransitRouterPeerAttachments** to query the status of an inter-region connection.  
             * 
             * - If an inter-region connection is in the **Attaching** state, the inter-region connection is being created. You can query the inter-region connection but cannot perform other regions.
             * - If an inter-region connection is in the **Attached** state, the inter-region connection is created.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
