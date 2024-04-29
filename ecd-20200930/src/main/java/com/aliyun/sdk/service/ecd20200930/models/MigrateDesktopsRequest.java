// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrateDesktopsRequest} extends {@link RequestModel}
 *
 * <p>MigrateDesktopsRequest</p>
 */
public class MigrateDesktopsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetOfficeSiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetOfficeSiteId;

    private MigrateDesktopsRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.regionId = builder.regionId;
        this.targetOfficeSiteId = builder.targetOfficeSiteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateDesktopsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public java.util.List < String > getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return targetOfficeSiteId
     */
    public String getTargetOfficeSiteId() {
        return this.targetOfficeSiteId;
    }

    public static final class Builder extends Request.Builder<MigrateDesktopsRequest, Builder> {
        private java.util.List < String > desktopId; 
        private String regionId; 
        private String targetOfficeSiteId; 

        private Builder() {
            super();
        } 

        private Builder(MigrateDesktopsRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.regionId = request.regionId;
            this.targetOfficeSiteId = request.targetOfficeSiteId;
        } 

        /**
         * The IDs of the cloud computers. You can specify 1 to 100 IDs.
         */
        public Builder desktopId(java.util.List < String > desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the destination office network.
         */
        public Builder targetOfficeSiteId(String targetOfficeSiteId) {
            this.putQueryParameter("TargetOfficeSiteId", targetOfficeSiteId);
            this.targetOfficeSiteId = targetOfficeSiteId;
            return this;
        }

        @Override
        public MigrateDesktopsRequest build() {
            return new MigrateDesktopsRequest(this);
        } 

    } 

}
