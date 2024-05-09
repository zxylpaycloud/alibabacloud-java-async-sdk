// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkRegionBlockResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkRegionBlockResponseBody</p>
 */
public class DescribeNetworkRegionBlockResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Config")
    private Config config;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeNetworkRegionBlockResponseBody(Builder builder) {
        this.config = builder.config;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkRegionBlockResponseBody create() {
        return builder().build();
    }

    /**
     * @return config
     */
    public Config getConfig() {
        return this.config;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Config config; 
        private String requestId; 

        /**
         * The configuration of blocked locations.
         */
        public Builder config(Config config) {
            this.config = config;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNetworkRegionBlockResponseBody build() {
            return new DescribeNetworkRegionBlockResponseBody(this);
        } 

    } 

    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Countries")
        private java.util.List < String > countries;

        @com.aliyun.core.annotation.NameInMap("Provinces")
        private java.util.List < String > provinces;

        @com.aliyun.core.annotation.NameInMap("RegionBlockSwitch")
        private String regionBlockSwitch;

        private Config(Builder builder) {
            this.countries = builder.countries;
            this.provinces = builder.provinces;
            this.regionBlockSwitch = builder.regionBlockSwitch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return countries
         */
        public java.util.List < String > getCountries() {
            return this.countries;
        }

        /**
         * @return provinces
         */
        public java.util.List < String > getProvinces() {
            return this.provinces;
        }

        /**
         * @return regionBlockSwitch
         */
        public String getRegionBlockSwitch() {
            return this.regionBlockSwitch;
        }

        public static final class Builder {
            private java.util.List < String > countries; 
            private java.util.List < String > provinces; 
            private String regionBlockSwitch; 

            /**
             * An array consisting of the codes of the countries or areas from which the requests are blocked.
             */
            public Builder countries(java.util.List < String > countries) {
                this.countries = countries;
                return this;
            }

            /**
             * An array consisting of the codes of the administrative regions in China from which the requests are blocked.
             */
            public Builder provinces(java.util.List < String > provinces) {
                this.provinces = provinces;
                return this;
            }

            /**
             * The status of the Location Blacklist policy. Valid values:
             * <p>
             * 
             * *   **on**: enabled
             * *   **off**: disabled
             */
            public Builder regionBlockSwitch(String regionBlockSwitch) {
                this.regionBlockSwitch = regionBlockSwitch;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
}
