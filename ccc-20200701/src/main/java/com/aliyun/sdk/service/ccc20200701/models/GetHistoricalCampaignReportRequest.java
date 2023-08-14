// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHistoricalCampaignReportRequest} extends {@link RequestModel}
 *
 * <p>GetHistoricalCampaignReportRequest</p>
 */
public class GetHistoricalCampaignReportRequest extends Request {
    @Query
    @NameInMap("CampaignId")
    @Validation(required = true)
    private String campaignId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetHistoricalCampaignReportRequest(Builder builder) {
        super(builder);
        this.campaignId = builder.campaignId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHistoricalCampaignReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return campaignId
     */
    public String getCampaignId() {
        return this.campaignId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetHistoricalCampaignReportRequest, Builder> {
        private String campaignId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetHistoricalCampaignReportRequest request) {
            super(request);
            this.campaignId = request.campaignId;
            this.instanceId = request.instanceId;
        } 

        /**
         * CampaignId.
         */
        public Builder campaignId(String campaignId) {
            this.putQueryParameter("CampaignId", campaignId);
            this.campaignId = campaignId;
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

        @Override
        public GetHistoricalCampaignReportRequest build() {
            return new GetHistoricalCampaignReportRequest(this);
        } 

    } 

}
