// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisassociateAdditionalCertificatesWithListenerRequest} extends {@link RequestModel}
 *
 * <p>DisassociateAdditionalCertificatesWithListenerRequest</p>
 */
public class DisassociateAdditionalCertificatesWithListenerRequest extends Request {
    @Body
    @NameInMap("AdditionalCertificateIds")
    @Validation(required = true)
    private java.util.List < String > additionalCertificateIds;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Body
    @NameInMap("ListenerId")
    @Validation(required = true)
    private String listenerId;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private DisassociateAdditionalCertificatesWithListenerRequest(Builder builder) {
        super(builder);
        this.additionalCertificateIds = builder.additionalCertificateIds;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.listenerId = builder.listenerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisassociateAdditionalCertificatesWithListenerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additionalCertificateIds
     */
    public java.util.List < String > getAdditionalCertificateIds() {
        return this.additionalCertificateIds;
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

    public static final class Builder extends Request.Builder<DisassociateAdditionalCertificatesWithListenerRequest, Builder> {
        private java.util.List < String > additionalCertificateIds; 
        private String clientToken; 
        private Boolean dryRun; 
        private String listenerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DisassociateAdditionalCertificatesWithListenerRequest request) {
            super(request);
            this.additionalCertificateIds = request.additionalCertificateIds;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.listenerId = request.listenerId;
            this.regionId = request.regionId;
        } 

        /**
         * AdditionalCertificateIds.
         */
        public Builder additionalCertificateIds(java.util.List < String > additionalCertificateIds) {
            this.putBodyParameter("AdditionalCertificateIds", additionalCertificateIds);
            this.additionalCertificateIds = additionalCertificateIds;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * > If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to only precheck this request. Valid values:
         * <p>
         * 
         * *   **true**: prechecks the request without creating the resource. The system prechecks the required parameters, request syntax, and limits. If the request fails the precheck, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.
         * *   **false** (default): sends the request. If the request passes the precheck, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The listener ID.
         */
        public Builder listenerId(String listenerId) {
            this.putBodyParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * The ID of the region where the NLB instance is deployed.
         * <p>
         * 
         * You can call the [DescribeRegions](~~443657~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DisassociateAdditionalCertificatesWithListenerRequest build() {
            return new DisassociateAdditionalCertificatesWithListenerRequest(this);
        } 

    } 

}