// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetElecTrendRequest} extends {@link RequestModel}
 *
 * <p>GetElecTrendRequest</p>
 */
public class GetElecTrendRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("yearList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Integer > yearList;

    private GetElecTrendRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.yearList = builder.yearList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetElecTrendRequest create() {
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
     * @return yearList
     */
    public java.util.List < Integer > getYearList() {
        return this.yearList;
    }

    public static final class Builder extends Request.Builder<GetElecTrendRequest, Builder> {
        private String code; 
        private java.util.List < Integer > yearList; 

        private Builder() {
            super();
        } 

        private Builder(GetElecTrendRequest request) {
            super(request);
            this.code = request.code;
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
         * List of years.
         */
        public Builder yearList(java.util.List < Integer > yearList) {
            this.putBodyParameter("yearList", yearList);
            this.yearList = yearList;
            return this;
        }

        @Override
        public GetElecTrendRequest build() {
            return new GetElecTrendRequest(this);
        } 

    } 

}
