// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IeHotelBillSettlementQueryResponseBody} extends {@link TeaModel}
 *
 * <p>IeHotelBillSettlementQueryResponseBody</p>
 */
public class IeHotelBillSettlementQueryResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("message")
    private String message;

    @NameInMap("module")
    private Module module;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("traceId")
    private String traceId;

    private IeHotelBillSettlementQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IeHotelBillSettlementQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * module
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * traceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public IeHotelBillSettlementQueryResponseBody build() {
            return new IeHotelBillSettlementQueryResponseBody(this);
        } 

    } 

    public static class DataList extends TeaModel {
        @NameInMap("alipay_trade_no")
        private String alipayTradeNo;

        @NameInMap("amount_currency")
        private String amountCurrency;

        @NameInMap("apply_arr_city_code")
        private String applyArrCityCode;

        @NameInMap("apply_arr_city_name")
        private String applyArrCityName;

        @NameInMap("apply_dep_city_code")
        private String applyDepCityCode;

        @NameInMap("apply_dep_city_name")
        private String applyDepCityName;

        @NameInMap("apply_extend_field")
        private String applyExtendField;

        @NameInMap("apply_id")
        private String applyId;

        @NameInMap("average_nights")
        private Double averageNights;

        @NameInMap("bill_record_time")
        private String billRecordTime;

        @NameInMap("book_reason")
        private String bookReason;

        @NameInMap("book_time")
        private String bookTime;

        @NameInMap("booker_id")
        private String bookerId;

        @NameInMap("booker_job_no")
        private String bookerJobNo;

        @NameInMap("booker_name")
        private String bookerName;

        @NameInMap("brand_group")
        private String brandGroup;

        @NameInMap("brand_name")
        private String brandName;

        @NameInMap("business_expense")
        private Long businessExpense;

        @NameInMap("business_trip_result")
        private String businessTripResult;

        @NameInMap("capital_direction")
        private String capitalDirection;

        @NameInMap("cascade_department")
        private String cascadeDepartment;

        @NameInMap("check_in_date")
        private String checkInDate;

        @NameInMap("checkout_date")
        private String checkoutDate;

        @NameInMap("city")
        private String city;

        @NameInMap("city_code")
        private String cityCode;

        @NameInMap("corp_refund_fee")
        private Double corpRefundFee;

        @NameInMap("corp_total_fee")
        private Double corpTotalFee;

        @NameInMap("cost_center")
        private String costCenter;

        @NameInMap("cost_center_number")
        private String costCenterNumber;

        @NameInMap("country")
        private String country;

        @NameInMap("country_code")
        private String countryCode;

        @NameInMap("department")
        private String department;

        @NameInMap("department_id")
        private String departmentId;

        @NameInMap("exceed_reason")
        private String exceedReason;

        @NameInMap("fee_type")
        private String feeType;

        @NameInMap("fines")
        private Double fines;

        @NameInMap("foreign_business_expense")
        private Long foreignBusinessExpense;

        @NameInMap("hotel_name")
        private String hotelName;

        @NameInMap("hotel_star")
        private String hotelStar;

        @NameInMap("index")
        private String index;

        @NameInMap("invoice_title")
        private String invoiceTitle;

        @NameInMap("is_early_departure")
        private String isEarlyDeparture;

        @NameInMap("is_negotiation")
        private String isNegotiation;

        @NameInMap("is_share_str")
        private String isShareStr;

        @NameInMap("main_apply_id")
        private String mainApplyId;

        @NameInMap("nights")
        private Integer nights;

        @NameInMap("order_id")
        private String orderId;

        @NameInMap("order_price")
        private Double orderPrice;

        @NameInMap("order_status_desc")
        private String orderStatusDesc;

        @NameInMap("order_type")
        private String orderType;

        @NameInMap("over_apply_id")
        private String overApplyId;

        @NameInMap("person_refund_fee")
        private Double personRefundFee;

        @NameInMap("person_settle_price")
        private Double personSettlePrice;

        @NameInMap("primary_id")
        private Long primaryId;

        @NameInMap("project_code")
        private String projectCode;

        @NameInMap("project_name")
        private String projectName;

        @NameInMap("promotion_fee")
        private Double promotionFee;

        @NameInMap("rate")
        private String rate;

        @NameInMap("remark")
        private String remark;

        @NameInMap("reserve_rule")
        private Integer reserveRule;

        @NameInMap("room_no")
        private String roomNo;

        @NameInMap("room_number")
        private Integer roomNumber;

        @NameInMap("room_price")
        private Double roomPrice;

        @NameInMap("room_type")
        private String roomType;

        @NameInMap("service_fee")
        private Double serviceFee;

        @NameInMap("settlement_fee")
        private Double settlementFee;

        @NameInMap("settlement_grant_fee")
        private Double settlementGrantFee;

        @NameInMap("settlement_time")
        private String settlementTime;

        @NameInMap("settlement_type")
        private String settlementType;

        @NameInMap("status")
        private Integer status;

        @NameInMap("sub_order_id")
        private String subOrderId;

        @NameInMap("tax_rate")
        private String taxRate;

        @NameInMap("third_invoice_id")
        private String thirdInvoiceId;

        @NameInMap("third_itinerary_id")
        private String thirdItineraryId;

        @NameInMap("third_part_business_id")
        private String thirdPartBusinessId;

        @NameInMap("thirdpart_apply_id")
        private String thirdpartApplyId;

        @NameInMap("total_nights")
        private Integer totalNights;

        @NameInMap("traveler_id")
        private String travelerId;

        @NameInMap("traveler_job_no")
        private String travelerJobNo;

        @NameInMap("traveler_member_type")
        private String travelerMemberType;

        @NameInMap("traveler_name")
        private String travelerName;

        @NameInMap("voucher_type")
        private Integer voucherType;

        private DataList(Builder builder) {
            this.alipayTradeNo = builder.alipayTradeNo;
            this.amountCurrency = builder.amountCurrency;
            this.applyArrCityCode = builder.applyArrCityCode;
            this.applyArrCityName = builder.applyArrCityName;
            this.applyDepCityCode = builder.applyDepCityCode;
            this.applyDepCityName = builder.applyDepCityName;
            this.applyExtendField = builder.applyExtendField;
            this.applyId = builder.applyId;
            this.averageNights = builder.averageNights;
            this.billRecordTime = builder.billRecordTime;
            this.bookReason = builder.bookReason;
            this.bookTime = builder.bookTime;
            this.bookerId = builder.bookerId;
            this.bookerJobNo = builder.bookerJobNo;
            this.bookerName = builder.bookerName;
            this.brandGroup = builder.brandGroup;
            this.brandName = builder.brandName;
            this.businessExpense = builder.businessExpense;
            this.businessTripResult = builder.businessTripResult;
            this.capitalDirection = builder.capitalDirection;
            this.cascadeDepartment = builder.cascadeDepartment;
            this.checkInDate = builder.checkInDate;
            this.checkoutDate = builder.checkoutDate;
            this.city = builder.city;
            this.cityCode = builder.cityCode;
            this.corpRefundFee = builder.corpRefundFee;
            this.corpTotalFee = builder.corpTotalFee;
            this.costCenter = builder.costCenter;
            this.costCenterNumber = builder.costCenterNumber;
            this.country = builder.country;
            this.countryCode = builder.countryCode;
            this.department = builder.department;
            this.departmentId = builder.departmentId;
            this.exceedReason = builder.exceedReason;
            this.feeType = builder.feeType;
            this.fines = builder.fines;
            this.foreignBusinessExpense = builder.foreignBusinessExpense;
            this.hotelName = builder.hotelName;
            this.hotelStar = builder.hotelStar;
            this.index = builder.index;
            this.invoiceTitle = builder.invoiceTitle;
            this.isEarlyDeparture = builder.isEarlyDeparture;
            this.isNegotiation = builder.isNegotiation;
            this.isShareStr = builder.isShareStr;
            this.mainApplyId = builder.mainApplyId;
            this.nights = builder.nights;
            this.orderId = builder.orderId;
            this.orderPrice = builder.orderPrice;
            this.orderStatusDesc = builder.orderStatusDesc;
            this.orderType = builder.orderType;
            this.overApplyId = builder.overApplyId;
            this.personRefundFee = builder.personRefundFee;
            this.personSettlePrice = builder.personSettlePrice;
            this.primaryId = builder.primaryId;
            this.projectCode = builder.projectCode;
            this.projectName = builder.projectName;
            this.promotionFee = builder.promotionFee;
            this.rate = builder.rate;
            this.remark = builder.remark;
            this.reserveRule = builder.reserveRule;
            this.roomNo = builder.roomNo;
            this.roomNumber = builder.roomNumber;
            this.roomPrice = builder.roomPrice;
            this.roomType = builder.roomType;
            this.serviceFee = builder.serviceFee;
            this.settlementFee = builder.settlementFee;
            this.settlementGrantFee = builder.settlementGrantFee;
            this.settlementTime = builder.settlementTime;
            this.settlementType = builder.settlementType;
            this.status = builder.status;
            this.subOrderId = builder.subOrderId;
            this.taxRate = builder.taxRate;
            this.thirdInvoiceId = builder.thirdInvoiceId;
            this.thirdItineraryId = builder.thirdItineraryId;
            this.thirdPartBusinessId = builder.thirdPartBusinessId;
            this.thirdpartApplyId = builder.thirdpartApplyId;
            this.totalNights = builder.totalNights;
            this.travelerId = builder.travelerId;
            this.travelerJobNo = builder.travelerJobNo;
            this.travelerMemberType = builder.travelerMemberType;
            this.travelerName = builder.travelerName;
            this.voucherType = builder.voucherType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return alipayTradeNo
         */
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
        }

        /**
         * @return amountCurrency
         */
        public String getAmountCurrency() {
            return this.amountCurrency;
        }

        /**
         * @return applyArrCityCode
         */
        public String getApplyArrCityCode() {
            return this.applyArrCityCode;
        }

        /**
         * @return applyArrCityName
         */
        public String getApplyArrCityName() {
            return this.applyArrCityName;
        }

        /**
         * @return applyDepCityCode
         */
        public String getApplyDepCityCode() {
            return this.applyDepCityCode;
        }

        /**
         * @return applyDepCityName
         */
        public String getApplyDepCityName() {
            return this.applyDepCityName;
        }

        /**
         * @return applyExtendField
         */
        public String getApplyExtendField() {
            return this.applyExtendField;
        }

        /**
         * @return applyId
         */
        public String getApplyId() {
            return this.applyId;
        }

        /**
         * @return averageNights
         */
        public Double getAverageNights() {
            return this.averageNights;
        }

        /**
         * @return billRecordTime
         */
        public String getBillRecordTime() {
            return this.billRecordTime;
        }

        /**
         * @return bookReason
         */
        public String getBookReason() {
            return this.bookReason;
        }

        /**
         * @return bookTime
         */
        public String getBookTime() {
            return this.bookTime;
        }

        /**
         * @return bookerId
         */
        public String getBookerId() {
            return this.bookerId;
        }

        /**
         * @return bookerJobNo
         */
        public String getBookerJobNo() {
            return this.bookerJobNo;
        }

        /**
         * @return bookerName
         */
        public String getBookerName() {
            return this.bookerName;
        }

        /**
         * @return brandGroup
         */
        public String getBrandGroup() {
            return this.brandGroup;
        }

        /**
         * @return brandName
         */
        public String getBrandName() {
            return this.brandName;
        }

        /**
         * @return businessExpense
         */
        public Long getBusinessExpense() {
            return this.businessExpense;
        }

        /**
         * @return businessTripResult
         */
        public String getBusinessTripResult() {
            return this.businessTripResult;
        }

        /**
         * @return capitalDirection
         */
        public String getCapitalDirection() {
            return this.capitalDirection;
        }

        /**
         * @return cascadeDepartment
         */
        public String getCascadeDepartment() {
            return this.cascadeDepartment;
        }

        /**
         * @return checkInDate
         */
        public String getCheckInDate() {
            return this.checkInDate;
        }

        /**
         * @return checkoutDate
         */
        public String getCheckoutDate() {
            return this.checkoutDate;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return corpRefundFee
         */
        public Double getCorpRefundFee() {
            return this.corpRefundFee;
        }

        /**
         * @return corpTotalFee
         */
        public Double getCorpTotalFee() {
            return this.corpTotalFee;
        }

        /**
         * @return costCenter
         */
        public String getCostCenter() {
            return this.costCenter;
        }

        /**
         * @return costCenterNumber
         */
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return countryCode
         */
        public String getCountryCode() {
            return this.countryCode;
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return departmentId
         */
        public String getDepartmentId() {
            return this.departmentId;
        }

        /**
         * @return exceedReason
         */
        public String getExceedReason() {
            return this.exceedReason;
        }

        /**
         * @return feeType
         */
        public String getFeeType() {
            return this.feeType;
        }

        /**
         * @return fines
         */
        public Double getFines() {
            return this.fines;
        }

        /**
         * @return foreignBusinessExpense
         */
        public Long getForeignBusinessExpense() {
            return this.foreignBusinessExpense;
        }

        /**
         * @return hotelName
         */
        public String getHotelName() {
            return this.hotelName;
        }

        /**
         * @return hotelStar
         */
        public String getHotelStar() {
            return this.hotelStar;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return invoiceTitle
         */
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        /**
         * @return isEarlyDeparture
         */
        public String getIsEarlyDeparture() {
            return this.isEarlyDeparture;
        }

        /**
         * @return isNegotiation
         */
        public String getIsNegotiation() {
            return this.isNegotiation;
        }

        /**
         * @return isShareStr
         */
        public String getIsShareStr() {
            return this.isShareStr;
        }

        /**
         * @return mainApplyId
         */
        public String getMainApplyId() {
            return this.mainApplyId;
        }

        /**
         * @return nights
         */
        public Integer getNights() {
            return this.nights;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return orderPrice
         */
        public Double getOrderPrice() {
            return this.orderPrice;
        }

        /**
         * @return orderStatusDesc
         */
        public String getOrderStatusDesc() {
            return this.orderStatusDesc;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return overApplyId
         */
        public String getOverApplyId() {
            return this.overApplyId;
        }

        /**
         * @return personRefundFee
         */
        public Double getPersonRefundFee() {
            return this.personRefundFee;
        }

        /**
         * @return personSettlePrice
         */
        public Double getPersonSettlePrice() {
            return this.personSettlePrice;
        }

        /**
         * @return primaryId
         */
        public Long getPrimaryId() {
            return this.primaryId;
        }

        /**
         * @return projectCode
         */
        public String getProjectCode() {
            return this.projectCode;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return promotionFee
         */
        public Double getPromotionFee() {
            return this.promotionFee;
        }

        /**
         * @return rate
         */
        public String getRate() {
            return this.rate;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return reserveRule
         */
        public Integer getReserveRule() {
            return this.reserveRule;
        }

        /**
         * @return roomNo
         */
        public String getRoomNo() {
            return this.roomNo;
        }

        /**
         * @return roomNumber
         */
        public Integer getRoomNumber() {
            return this.roomNumber;
        }

        /**
         * @return roomPrice
         */
        public Double getRoomPrice() {
            return this.roomPrice;
        }

        /**
         * @return roomType
         */
        public String getRoomType() {
            return this.roomType;
        }

        /**
         * @return serviceFee
         */
        public Double getServiceFee() {
            return this.serviceFee;
        }

        /**
         * @return settlementFee
         */
        public Double getSettlementFee() {
            return this.settlementFee;
        }

        /**
         * @return settlementGrantFee
         */
        public Double getSettlementGrantFee() {
            return this.settlementGrantFee;
        }

        /**
         * @return settlementTime
         */
        public String getSettlementTime() {
            return this.settlementTime;
        }

        /**
         * @return settlementType
         */
        public String getSettlementType() {
            return this.settlementType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return subOrderId
         */
        public String getSubOrderId() {
            return this.subOrderId;
        }

        /**
         * @return taxRate
         */
        public String getTaxRate() {
            return this.taxRate;
        }

        /**
         * @return thirdInvoiceId
         */
        public String getThirdInvoiceId() {
            return this.thirdInvoiceId;
        }

        /**
         * @return thirdItineraryId
         */
        public String getThirdItineraryId() {
            return this.thirdItineraryId;
        }

        /**
         * @return thirdPartBusinessId
         */
        public String getThirdPartBusinessId() {
            return this.thirdPartBusinessId;
        }

        /**
         * @return thirdpartApplyId
         */
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        /**
         * @return totalNights
         */
        public Integer getTotalNights() {
            return this.totalNights;
        }

        /**
         * @return travelerId
         */
        public String getTravelerId() {
            return this.travelerId;
        }

        /**
         * @return travelerJobNo
         */
        public String getTravelerJobNo() {
            return this.travelerJobNo;
        }

        /**
         * @return travelerMemberType
         */
        public String getTravelerMemberType() {
            return this.travelerMemberType;
        }

        /**
         * @return travelerName
         */
        public String getTravelerName() {
            return this.travelerName;
        }

        /**
         * @return voucherType
         */
        public Integer getVoucherType() {
            return this.voucherType;
        }

        public static final class Builder {
            private String alipayTradeNo; 
            private String amountCurrency; 
            private String applyArrCityCode; 
            private String applyArrCityName; 
            private String applyDepCityCode; 
            private String applyDepCityName; 
            private String applyExtendField; 
            private String applyId; 
            private Double averageNights; 
            private String billRecordTime; 
            private String bookReason; 
            private String bookTime; 
            private String bookerId; 
            private String bookerJobNo; 
            private String bookerName; 
            private String brandGroup; 
            private String brandName; 
            private Long businessExpense; 
            private String businessTripResult; 
            private String capitalDirection; 
            private String cascadeDepartment; 
            private String checkInDate; 
            private String checkoutDate; 
            private String city; 
            private String cityCode; 
            private Double corpRefundFee; 
            private Double corpTotalFee; 
            private String costCenter; 
            private String costCenterNumber; 
            private String country; 
            private String countryCode; 
            private String department; 
            private String departmentId; 
            private String exceedReason; 
            private String feeType; 
            private Double fines; 
            private Long foreignBusinessExpense; 
            private String hotelName; 
            private String hotelStar; 
            private String index; 
            private String invoiceTitle; 
            private String isEarlyDeparture; 
            private String isNegotiation; 
            private String isShareStr; 
            private String mainApplyId; 
            private Integer nights; 
            private String orderId; 
            private Double orderPrice; 
            private String orderStatusDesc; 
            private String orderType; 
            private String overApplyId; 
            private Double personRefundFee; 
            private Double personSettlePrice; 
            private Long primaryId; 
            private String projectCode; 
            private String projectName; 
            private Double promotionFee; 
            private String rate; 
            private String remark; 
            private Integer reserveRule; 
            private String roomNo; 
            private Integer roomNumber; 
            private Double roomPrice; 
            private String roomType; 
            private Double serviceFee; 
            private Double settlementFee; 
            private Double settlementGrantFee; 
            private String settlementTime; 
            private String settlementType; 
            private Integer status; 
            private String subOrderId; 
            private String taxRate; 
            private String thirdInvoiceId; 
            private String thirdItineraryId; 
            private String thirdPartBusinessId; 
            private String thirdpartApplyId; 
            private Integer totalNights; 
            private String travelerId; 
            private String travelerJobNo; 
            private String travelerMemberType; 
            private String travelerName; 
            private Integer voucherType; 

            /**
             * alipay_trade_no.
             */
            public Builder alipayTradeNo(String alipayTradeNo) {
                this.alipayTradeNo = alipayTradeNo;
                return this;
            }

            /**
             * amount_currency.
             */
            public Builder amountCurrency(String amountCurrency) {
                this.amountCurrency = amountCurrency;
                return this;
            }

            /**
             * apply_arr_city_code.
             */
            public Builder applyArrCityCode(String applyArrCityCode) {
                this.applyArrCityCode = applyArrCityCode;
                return this;
            }

            /**
             * apply_arr_city_name.
             */
            public Builder applyArrCityName(String applyArrCityName) {
                this.applyArrCityName = applyArrCityName;
                return this;
            }

            /**
             * apply_dep_city_code.
             */
            public Builder applyDepCityCode(String applyDepCityCode) {
                this.applyDepCityCode = applyDepCityCode;
                return this;
            }

            /**
             * apply_dep_city_name.
             */
            public Builder applyDepCityName(String applyDepCityName) {
                this.applyDepCityName = applyDepCityName;
                return this;
            }

            /**
             * apply_extend_field.
             */
            public Builder applyExtendField(String applyExtendField) {
                this.applyExtendField = applyExtendField;
                return this;
            }

            /**
             * apply_id.
             */
            public Builder applyId(String applyId) {
                this.applyId = applyId;
                return this;
            }

            /**
             * average_nights.
             */
            public Builder averageNights(Double averageNights) {
                this.averageNights = averageNights;
                return this;
            }

            /**
             * bill_record_time.
             */
            public Builder billRecordTime(String billRecordTime) {
                this.billRecordTime = billRecordTime;
                return this;
            }

            /**
             * book_reason.
             */
            public Builder bookReason(String bookReason) {
                this.bookReason = bookReason;
                return this;
            }

            /**
             * book_time.
             */
            public Builder bookTime(String bookTime) {
                this.bookTime = bookTime;
                return this;
            }

            /**
             * booker_id.
             */
            public Builder bookerId(String bookerId) {
                this.bookerId = bookerId;
                return this;
            }

            /**
             * booker_job_no.
             */
            public Builder bookerJobNo(String bookerJobNo) {
                this.bookerJobNo = bookerJobNo;
                return this;
            }

            /**
             * booker_name.
             */
            public Builder bookerName(String bookerName) {
                this.bookerName = bookerName;
                return this;
            }

            /**
             * brand_group.
             */
            public Builder brandGroup(String brandGroup) {
                this.brandGroup = brandGroup;
                return this;
            }

            /**
             * brand_name.
             */
            public Builder brandName(String brandName) {
                this.brandName = brandName;
                return this;
            }

            /**
             * business_expense.
             */
            public Builder businessExpense(Long businessExpense) {
                this.businessExpense = businessExpense;
                return this;
            }

            /**
             * business_trip_result.
             */
            public Builder businessTripResult(String businessTripResult) {
                this.businessTripResult = businessTripResult;
                return this;
            }

            /**
             * capital_direction.
             */
            public Builder capitalDirection(String capitalDirection) {
                this.capitalDirection = capitalDirection;
                return this;
            }

            /**
             * cascade_department.
             */
            public Builder cascadeDepartment(String cascadeDepartment) {
                this.cascadeDepartment = cascadeDepartment;
                return this;
            }

            /**
             * check_in_date.
             */
            public Builder checkInDate(String checkInDate) {
                this.checkInDate = checkInDate;
                return this;
            }

            /**
             * checkout_date.
             */
            public Builder checkoutDate(String checkoutDate) {
                this.checkoutDate = checkoutDate;
                return this;
            }

            /**
             * city.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * city_code.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * corp_refund_fee.
             */
            public Builder corpRefundFee(Double corpRefundFee) {
                this.corpRefundFee = corpRefundFee;
                return this;
            }

            /**
             * corp_total_fee.
             */
            public Builder corpTotalFee(Double corpTotalFee) {
                this.corpTotalFee = corpTotalFee;
                return this;
            }

            /**
             * cost_center.
             */
            public Builder costCenter(String costCenter) {
                this.costCenter = costCenter;
                return this;
            }

            /**
             * cost_center_number.
             */
            public Builder costCenterNumber(String costCenterNumber) {
                this.costCenterNumber = costCenterNumber;
                return this;
            }

            /**
             * country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * country_code.
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
                return this;
            }

            /**
             * department.
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * department_id.
             */
            public Builder departmentId(String departmentId) {
                this.departmentId = departmentId;
                return this;
            }

            /**
             * exceed_reason.
             */
            public Builder exceedReason(String exceedReason) {
                this.exceedReason = exceedReason;
                return this;
            }

            /**
             * fee_type.
             */
            public Builder feeType(String feeType) {
                this.feeType = feeType;
                return this;
            }

            /**
             * fines.
             */
            public Builder fines(Double fines) {
                this.fines = fines;
                return this;
            }

            /**
             * foreign_business_expense.
             */
            public Builder foreignBusinessExpense(Long foreignBusinessExpense) {
                this.foreignBusinessExpense = foreignBusinessExpense;
                return this;
            }

            /**
             * hotel_name.
             */
            public Builder hotelName(String hotelName) {
                this.hotelName = hotelName;
                return this;
            }

            /**
             * hotel_star.
             */
            public Builder hotelStar(String hotelStar) {
                this.hotelStar = hotelStar;
                return this;
            }

            /**
             * index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * invoice_title.
             */
            public Builder invoiceTitle(String invoiceTitle) {
                this.invoiceTitle = invoiceTitle;
                return this;
            }

            /**
             * is_early_departure.
             */
            public Builder isEarlyDeparture(String isEarlyDeparture) {
                this.isEarlyDeparture = isEarlyDeparture;
                return this;
            }

            /**
             * is_negotiation.
             */
            public Builder isNegotiation(String isNegotiation) {
                this.isNegotiation = isNegotiation;
                return this;
            }

            /**
             * is_share_str.
             */
            public Builder isShareStr(String isShareStr) {
                this.isShareStr = isShareStr;
                return this;
            }

            /**
             * main_apply_id.
             */
            public Builder mainApplyId(String mainApplyId) {
                this.mainApplyId = mainApplyId;
                return this;
            }

            /**
             * nights.
             */
            public Builder nights(Integer nights) {
                this.nights = nights;
                return this;
            }

            /**
             * order_id.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * order_price.
             */
            public Builder orderPrice(Double orderPrice) {
                this.orderPrice = orderPrice;
                return this;
            }

            /**
             * order_status_desc.
             */
            public Builder orderStatusDesc(String orderStatusDesc) {
                this.orderStatusDesc = orderStatusDesc;
                return this;
            }

            /**
             * order_type.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * over_apply_id.
             */
            public Builder overApplyId(String overApplyId) {
                this.overApplyId = overApplyId;
                return this;
            }

            /**
             * person_refund_fee.
             */
            public Builder personRefundFee(Double personRefundFee) {
                this.personRefundFee = personRefundFee;
                return this;
            }

            /**
             * person_settle_price.
             */
            public Builder personSettlePrice(Double personSettlePrice) {
                this.personSettlePrice = personSettlePrice;
                return this;
            }

            /**
             * primary_id.
             */
            public Builder primaryId(Long primaryId) {
                this.primaryId = primaryId;
                return this;
            }

            /**
             * project_code.
             */
            public Builder projectCode(String projectCode) {
                this.projectCode = projectCode;
                return this;
            }

            /**
             * project_name.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * promotion_fee.
             */
            public Builder promotionFee(Double promotionFee) {
                this.promotionFee = promotionFee;
                return this;
            }

            /**
             * rate.
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            /**
             * remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * reserve_rule.
             */
            public Builder reserveRule(Integer reserveRule) {
                this.reserveRule = reserveRule;
                return this;
            }

            /**
             * room_no.
             */
            public Builder roomNo(String roomNo) {
                this.roomNo = roomNo;
                return this;
            }

            /**
             * room_number.
             */
            public Builder roomNumber(Integer roomNumber) {
                this.roomNumber = roomNumber;
                return this;
            }

            /**
             * room_price.
             */
            public Builder roomPrice(Double roomPrice) {
                this.roomPrice = roomPrice;
                return this;
            }

            /**
             * room_type.
             */
            public Builder roomType(String roomType) {
                this.roomType = roomType;
                return this;
            }

            /**
             * service_fee.
             */
            public Builder serviceFee(Double serviceFee) {
                this.serviceFee = serviceFee;
                return this;
            }

            /**
             * settlement_fee.
             */
            public Builder settlementFee(Double settlementFee) {
                this.settlementFee = settlementFee;
                return this;
            }

            /**
             * settlement_grant_fee.
             */
            public Builder settlementGrantFee(Double settlementGrantFee) {
                this.settlementGrantFee = settlementGrantFee;
                return this;
            }

            /**
             * settlement_time.
             */
            public Builder settlementTime(String settlementTime) {
                this.settlementTime = settlementTime;
                return this;
            }

            /**
             * settlement_type.
             */
            public Builder settlementType(String settlementType) {
                this.settlementType = settlementType;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * sub_order_id.
             */
            public Builder subOrderId(String subOrderId) {
                this.subOrderId = subOrderId;
                return this;
            }

            /**
             * tax_rate.
             */
            public Builder taxRate(String taxRate) {
                this.taxRate = taxRate;
                return this;
            }

            /**
             * third_invoice_id.
             */
            public Builder thirdInvoiceId(String thirdInvoiceId) {
                this.thirdInvoiceId = thirdInvoiceId;
                return this;
            }

            /**
             * third_itinerary_id.
             */
            public Builder thirdItineraryId(String thirdItineraryId) {
                this.thirdItineraryId = thirdItineraryId;
                return this;
            }

            /**
             * third_part_business_id.
             */
            public Builder thirdPartBusinessId(String thirdPartBusinessId) {
                this.thirdPartBusinessId = thirdPartBusinessId;
                return this;
            }

            /**
             * thirdpart_apply_id.
             */
            public Builder thirdpartApplyId(String thirdpartApplyId) {
                this.thirdpartApplyId = thirdpartApplyId;
                return this;
            }

            /**
             * total_nights.
             */
            public Builder totalNights(Integer totalNights) {
                this.totalNights = totalNights;
                return this;
            }

            /**
             * traveler_id.
             */
            public Builder travelerId(String travelerId) {
                this.travelerId = travelerId;
                return this;
            }

            /**
             * traveler_job_no.
             */
            public Builder travelerJobNo(String travelerJobNo) {
                this.travelerJobNo = travelerJobNo;
                return this;
            }

            /**
             * traveler_member_type.
             */
            public Builder travelerMemberType(String travelerMemberType) {
                this.travelerMemberType = travelerMemberType;
                return this;
            }

            /**
             * traveler_name.
             */
            public Builder travelerName(String travelerName) {
                this.travelerName = travelerName;
                return this;
            }

            /**
             * voucher_type.
             */
            public Builder voucherType(Integer voucherType) {
                this.voucherType = voucherType;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    public static class Module extends TeaModel {
        @NameInMap("category")
        private Integer category;

        @NameInMap("corp_id")
        private String corpId;

        @NameInMap("data_list")
        private java.util.List < DataList> dataList;

        @NameInMap("order_id")
        private String orderId;

        @NameInMap("period_end")
        private String periodEnd;

        @NameInMap("period_start")
        private String periodStart;

        @NameInMap("total_size")
        private Long totalSize;

        private Module(Builder builder) {
            this.category = builder.category;
            this.corpId = builder.corpId;
            this.dataList = builder.dataList;
            this.orderId = builder.orderId;
            this.periodEnd = builder.periodEnd;
            this.periodStart = builder.periodStart;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public Integer getCategory() {
            return this.category;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return dataList
         */
        public java.util.List < DataList> getDataList() {
            return this.dataList;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return periodEnd
         */
        public String getPeriodEnd() {
            return this.periodEnd;
        }

        /**
         * @return periodStart
         */
        public String getPeriodStart() {
            return this.periodStart;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer category; 
            private String corpId; 
            private java.util.List < DataList> dataList; 
            private String orderId; 
            private String periodEnd; 
            private String periodStart; 
            private Long totalSize; 

            /**
             * category.
             */
            public Builder category(Integer category) {
                this.category = category;
                return this;
            }

            /**
             * corp_id.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * data_list.
             */
            public Builder dataList(java.util.List < DataList> dataList) {
                this.dataList = dataList;
                return this;
            }

            /**
             * order_id.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * period_end.
             */
            public Builder periodEnd(String periodEnd) {
                this.periodEnd = periodEnd;
                return this;
            }

            /**
             * period_start.
             */
            public Builder periodStart(String periodStart) {
                this.periodStart = periodStart;
                return this;
            }

            /**
             * total_size.
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
