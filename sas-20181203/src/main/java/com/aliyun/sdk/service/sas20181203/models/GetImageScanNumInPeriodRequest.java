// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageScanNumInPeriodRequest} extends {@link RequestModel}
 *
 * <p>GetImageScanNumInPeriodRequest</p>
 */
public class GetImageScanNumInPeriodRequest extends Request {
    @Query
    @NameInMap("PastDay")
    @Validation(required = true)
    private String pastDay;

    private GetImageScanNumInPeriodRequest(Builder builder) {
        super(builder);
        this.pastDay = builder.pastDay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageScanNumInPeriodRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pastDay
     */
    public String getPastDay() {
        return this.pastDay;
    }

    public static final class Builder extends Request.Builder<GetImageScanNumInPeriodRequest, Builder> {
        private String pastDay; 

        private Builder() {
            super();
        } 

        private Builder(GetImageScanNumInPeriodRequest request) {
            super(request);
            this.pastDay = request.pastDay;
        } 

        /**
         * The number of days.
         */
        public Builder pastDay(String pastDay) {
            this.putQueryParameter("PastDay", pastDay);
            this.pastDay = pastDay;
            return this;
        }

        @Override
        public GetImageScanNumInPeriodRequest build() {
            return new GetImageScanNumInPeriodRequest(this);
        } 

    } 

}
