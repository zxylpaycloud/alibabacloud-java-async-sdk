// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCarbonEmissionTrendRequest} extends {@link RequestModel}
 *
 * <p>GetCarbonEmissionTrendRequest</p>
 */
public class GetCarbonEmissionTrendRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("moduleCode")
    private String moduleCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("moduleType")
    private Integer moduleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("trendType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer trendType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("yearList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Integer > yearList;

    private GetCarbonEmissionTrendRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.moduleCode = builder.moduleCode;
        this.moduleType = builder.moduleType;
        this.trendType = builder.trendType;
        this.yearList = builder.yearList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCarbonEmissionTrendRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return moduleCode
     */
    public String getModuleCode() {
        return this.moduleCode;
    }

    /**
     * @return moduleType
     */
    public Integer getModuleType() {
        return this.moduleType;
    }

    /**
     * @return trendType
     */
    public Integer getTrendType() {
        return this.trendType;
    }

    /**
     * @return yearList
     */
    public java.util.List < Integer > getYearList() {
        return this.yearList;
    }

    public static final class Builder extends Request.Builder<GetCarbonEmissionTrendRequest, Builder> {
        private String code; 
        private String moduleCode; 
        private Integer moduleType; 
        private Integer trendType; 
        private java.util.List < Integer > yearList; 

        private Builder() {
            super();
        } 

        private Builder(GetCarbonEmissionTrendRequest request) {
            super(request);
            this.code = request.code;
            this.moduleCode = request.moduleCode;
            this.moduleType = request.moduleType;
            this.trendType = request.trendType;
            this.yearList = request.yearList;
        } 

        /**
         * The enterprise code.
         */
        public Builder code(String code) {
            this.putBodyParameter("code", code);
            this.code = code;
            return this;
        }

        /**
         * Module code.
         */
        public Builder moduleCode(String moduleCode) {
            this.putBodyParameter("moduleCode", moduleCode);
            this.moduleCode = moduleCode;
            return this;
        }

        /**
         * Module type.
         */
        public Builder moduleType(Integer moduleType) {
            this.putBodyParameter("moduleType", moduleType);
            this.moduleType = moduleType;
            return this;
        }

        /**
         * Trend Type.
         */
        public Builder trendType(Integer trendType) {
            this.putBodyParameter("trendType", trendType);
            this.trendType = trendType;
            return this;
        }

        /**
         * The list of inventory year.
         */
        public Builder yearList(java.util.List < Integer > yearList) {
            this.putBodyParameter("yearList", yearList);
            this.yearList = yearList;
            return this;
        }

        @Override
        public GetCarbonEmissionTrendRequest build() {
            return new GetCarbonEmissionTrendRequest(this);
        } 

    } 

}
