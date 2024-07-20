// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIpSetsRequest} extends {@link RequestModel}
 *
 * <p>UpdateIpSetsRequest</p>
 */
public class UpdateIpSetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpSets")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < IpSets> ipSets;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UpdateIpSetsRequest(Builder builder) {
        super(builder);
        this.ipSets = builder.ipSets;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIpSetsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipSets
     */
    public java.util.List < IpSets> getIpSets() {
        return this.ipSets;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateIpSetsRequest, Builder> {
        private java.util.List < IpSets> ipSets; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIpSetsRequest request) {
            super(request);
            this.ipSets = request.ipSets;
            this.regionId = request.regionId;
        } 

        /**
         * The acceleration regions.
         */
        public Builder ipSets(java.util.List < IpSets> ipSets) {
            this.putQueryParameter("IpSets", ipSets);
            this.ipSets = ipSets;
            return this;
        }

        /**
         * The region ID of the Global Accelerator (GA) instance. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateIpSetsRequest build() {
            return new UpdateIpSetsRequest(this);
        } 

    } 

    public static class IpSets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("IpSetId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ipSetId;

        private IpSets(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.ipSetId = builder.ipSetId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpSets create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return ipSetId
         */
        public String getIpSetId() {
            return this.ipSetId;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private String ipSetId; 

            /**
             * The new bandwidth that you want to allocate to the acceleration regions. Unit: Mbit/s.
             * <p>
             * 
             * You must allocate at least 2 Mbit/s of bandwidth to each acceleration region. You can specify the bandwidth for up to 100 acceleration regions.
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The IDs of the acceleration regions that you want to modify.
             * <p>
             * 
             * You can specify the IDs of up to 100 acceleration regions.
             */
            public Builder ipSetId(String ipSetId) {
                this.ipSetId = ipSetId;
                return this;
            }

            public IpSets build() {
                return new IpSets(this);
            } 

        } 

    }
}
