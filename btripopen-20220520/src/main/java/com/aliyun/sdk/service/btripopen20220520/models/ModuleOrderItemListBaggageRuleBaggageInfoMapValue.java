// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModuleOrderItemListBaggageRuleBaggageInfoMapValue} extends {@link TeaModel}
 *
 * <p>ModuleOrderItemListBaggageRuleBaggageInfoMapValue</p>
 */
public class ModuleOrderItemListBaggageRuleBaggageInfoMapValue extends TeaModel {
    @NameInMap("carry_freepc")
    private Integer carryFreepc;

    @NameInMap("carry_bag_weight")
    private Integer carryBagWeight;

    @NameInMap("carry_bag_size")
    private String carryBagSize;

    @NameInMap("is_all_carry_bag_weight")
    private Boolean isAllCarryBagWeight;

    @NameInMap("airline")
    private String airline;

    @NameInMap("start_airport")
    private String startAirport;

    @NameInMap("end_airport")
    private String endAirport;

    @NameInMap("start_city_code")
    private String startCityCode;

    @NameInMap("end_city_code")
    private String endCityCode;

    @NameInMap("free_pcs")
    private Long freePcs;

    @NameInMap("baggage_weight")
    private Long baggageWeight;

    @NameInMap("baggage_unit")
    private String baggageUnit;

    @NameInMap("baggage_size")
    private String baggageSize;

    @NameInMap("all_weight")
    private Boolean allWeight;

    @NameInMap("total_pcs")
    private Long totalPcs;

    @NameInMap("total_weight")
    private Long totalWeight;

    private ModuleOrderItemListBaggageRuleBaggageInfoMapValue(Builder builder) {
        this.carryFreepc = builder.carryFreepc;
        this.carryBagWeight = builder.carryBagWeight;
        this.carryBagSize = builder.carryBagSize;
        this.isAllCarryBagWeight = builder.isAllCarryBagWeight;
        this.airline = builder.airline;
        this.startAirport = builder.startAirport;
        this.endAirport = builder.endAirport;
        this.startCityCode = builder.startCityCode;
        this.endCityCode = builder.endCityCode;
        this.freePcs = builder.freePcs;
        this.baggageWeight = builder.baggageWeight;
        this.baggageUnit = builder.baggageUnit;
        this.baggageSize = builder.baggageSize;
        this.allWeight = builder.allWeight;
        this.totalPcs = builder.totalPcs;
        this.totalWeight = builder.totalWeight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleOrderItemListBaggageRuleBaggageInfoMapValue create() {
        return builder().build();
    }

    /**
     * @return carryFreepc
     */
    public Integer getCarryFreepc() {
        return this.carryFreepc;
    }

    /**
     * @return carryBagWeight
     */
    public Integer getCarryBagWeight() {
        return this.carryBagWeight;
    }

    /**
     * @return carryBagSize
     */
    public String getCarryBagSize() {
        return this.carryBagSize;
    }

    /**
     * @return isAllCarryBagWeight
     */
    public Boolean getIsAllCarryBagWeight() {
        return this.isAllCarryBagWeight;
    }

    /**
     * @return airline
     */
    public String getAirline() {
        return this.airline;
    }

    /**
     * @return startAirport
     */
    public String getStartAirport() {
        return this.startAirport;
    }

    /**
     * @return endAirport
     */
    public String getEndAirport() {
        return this.endAirport;
    }

    /**
     * @return startCityCode
     */
    public String getStartCityCode() {
        return this.startCityCode;
    }

    /**
     * @return endCityCode
     */
    public String getEndCityCode() {
        return this.endCityCode;
    }

    /**
     * @return freePcs
     */
    public Long getFreePcs() {
        return this.freePcs;
    }

    /**
     * @return baggageWeight
     */
    public Long getBaggageWeight() {
        return this.baggageWeight;
    }

    /**
     * @return baggageUnit
     */
    public String getBaggageUnit() {
        return this.baggageUnit;
    }

    /**
     * @return baggageSize
     */
    public String getBaggageSize() {
        return this.baggageSize;
    }

    /**
     * @return allWeight
     */
    public Boolean getAllWeight() {
        return this.allWeight;
    }

    /**
     * @return totalPcs
     */
    public Long getTotalPcs() {
        return this.totalPcs;
    }

    /**
     * @return totalWeight
     */
    public Long getTotalWeight() {
        return this.totalWeight;
    }

    public static final class Builder {
        private Integer carryFreepc; 
        private Integer carryBagWeight; 
        private String carryBagSize; 
        private Boolean isAllCarryBagWeight; 
        private String airline; 
        private String startAirport; 
        private String endAirport; 
        private String startCityCode; 
        private String endCityCode; 
        private Long freePcs; 
        private Long baggageWeight; 
        private String baggageUnit; 
        private String baggageSize; 
        private Boolean allWeight; 
        private Long totalPcs; 
        private Long totalWeight; 

        /**
         * carry_freepc.
         */
        public Builder carryFreepc(Integer carryFreepc) {
            this.carryFreepc = carryFreepc;
            return this;
        }

        /**
         * carry_bag_weight.
         */
        public Builder carryBagWeight(Integer carryBagWeight) {
            this.carryBagWeight = carryBagWeight;
            return this;
        }

        /**
         * carry_bag_size.
         */
        public Builder carryBagSize(String carryBagSize) {
            this.carryBagSize = carryBagSize;
            return this;
        }

        /**
         * is_all_carry_bag_weight.
         */
        public Builder isAllCarryBagWeight(Boolean isAllCarryBagWeight) {
            this.isAllCarryBagWeight = isAllCarryBagWeight;
            return this;
        }

        /**
         * airline.
         */
        public Builder airline(String airline) {
            this.airline = airline;
            return this;
        }

        /**
         * start_airport.
         */
        public Builder startAirport(String startAirport) {
            this.startAirport = startAirport;
            return this;
        }

        /**
         * end_airport.
         */
        public Builder endAirport(String endAirport) {
            this.endAirport = endAirport;
            return this;
        }

        /**
         * start_city_code.
         */
        public Builder startCityCode(String startCityCode) {
            this.startCityCode = startCityCode;
            return this;
        }

        /**
         * end_city_code.
         */
        public Builder endCityCode(String endCityCode) {
            this.endCityCode = endCityCode;
            return this;
        }

        /**
         * free_pcs.
         */
        public Builder freePcs(Long freePcs) {
            this.freePcs = freePcs;
            return this;
        }

        /**
         * baggage_weight.
         */
        public Builder baggageWeight(Long baggageWeight) {
            this.baggageWeight = baggageWeight;
            return this;
        }

        /**
         * baggage_unit.
         */
        public Builder baggageUnit(String baggageUnit) {
            this.baggageUnit = baggageUnit;
            return this;
        }

        /**
         * baggage_size.
         */
        public Builder baggageSize(String baggageSize) {
            this.baggageSize = baggageSize;
            return this;
        }

        /**
         * all_weight.
         */
        public Builder allWeight(Boolean allWeight) {
            this.allWeight = allWeight;
            return this;
        }

        /**
         * total_pcs.
         */
        public Builder totalPcs(Long totalPcs) {
            this.totalPcs = totalPcs;
            return this;
        }

        /**
         * total_weight.
         */
        public Builder totalWeight(Long totalWeight) {
            this.totalWeight = totalWeight;
            return this;
        }

        public ModuleOrderItemListBaggageRuleBaggageInfoMapValue build() {
            return new ModuleOrderItemListBaggageRuleBaggageInfoMapValue(this);
        } 

    } 

}
