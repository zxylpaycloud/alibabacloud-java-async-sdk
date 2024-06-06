// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGwpBenchmarkListResponseBody} extends {@link TeaModel}
 *
 * <p>GetGwpBenchmarkListResponseBody</p>
 */
public class GetGwpBenchmarkListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetGwpBenchmarkListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGwpBenchmarkListResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The response parameters.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request. The value is unique for each request. This facilitates subsequent troubleshooting.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGwpBenchmarkListResponseBody build() {
            return new GetGwpBenchmarkListResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("activeReduction")
        private Double activeReduction;

        @com.aliyun.core.annotation.NameInMap("benchmarkEmission")
        private Double benchmarkEmission;

        @com.aliyun.core.annotation.NameInMap("benchmarkName")
        private String benchmarkName;

        @com.aliyun.core.annotation.NameInMap("carbonEmission")
        private Double carbonEmission;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("percent")
        private String percent;

        private Items(Builder builder) {
            this.activeReduction = builder.activeReduction;
            this.benchmarkEmission = builder.benchmarkEmission;
            this.benchmarkName = builder.benchmarkName;
            this.carbonEmission = builder.carbonEmission;
            this.name = builder.name;
            this.percent = builder.percent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return activeReduction
         */
        public Double getActiveReduction() {
            return this.activeReduction;
        }

        /**
         * @return benchmarkEmission
         */
        public Double getBenchmarkEmission() {
            return this.benchmarkEmission;
        }

        /**
         * @return benchmarkName
         */
        public String getBenchmarkName() {
            return this.benchmarkName;
        }

        /**
         * @return carbonEmission
         */
        public Double getCarbonEmission() {
            return this.carbonEmission;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return percent
         */
        public String getPercent() {
            return this.percent;
        }

        public static final class Builder {
            private Double activeReduction; 
            private Double benchmarkEmission; 
            private String benchmarkName; 
            private Double carbonEmission; 
            private String name; 
            private String percent; 

            /**
             * `activeReduction=benchmarkEmission-carbonEmission` Generally, baseline emissions are greater than inventory emissions. Maintain four decimal places. Unit pertains to a higher-level unit.
             */
            public Builder activeReduction(Double activeReduction) {
                this.activeReduction = activeReduction;
                return this;
            }

            /**
             * Benchmark emissions. Maintain four decimal places. Unit pertains to a higher-level unit.
             */
            public Builder benchmarkEmission(Double benchmarkEmission) {
                this.benchmarkEmission = benchmarkEmission;
                return this;
            }

            /**
             * Benchmark name
             */
            public Builder benchmarkName(String benchmarkName) {
                this.benchmarkName = benchmarkName;
                return this;
            }

            /**
             * Inventory emissions. Maintain four decimal places. Unit pertains to a higher-level unit.
             */
            public Builder carbonEmission(Double carbonEmission) {
                this.carbonEmission = carbonEmission;
                return this;
            }

            /**
             * name
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Unused temporarily.
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List < Items> items;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        private Data(Builder builder) {
            this.items = builder.items;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private java.util.List < Items> items; 
            private String unit; 

            /**
             * Active carbon reduction ranking list.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * unit of emissions. The default value is `kgCO₂e/productUnit`. 
             * <p>
             * The `productUnit` is the unit selected for the product. The unit value is changed to `tCO₂e/productUnit` or `gCO₂e/productUnit`. For more information, see the remarks in the quantity column.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
