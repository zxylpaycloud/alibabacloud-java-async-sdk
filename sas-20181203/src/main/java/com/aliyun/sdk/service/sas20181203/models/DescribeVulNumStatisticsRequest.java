// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulNumStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DescribeVulNumStatisticsRequest</p>
 */
public class DescribeVulNumStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    private DescribeVulNumStatisticsRequest(Builder builder) {
        super(builder);
        this.from = builder.from;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulNumStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    public static final class Builder extends Request.Builder<DescribeVulNumStatisticsRequest, Builder> {
        private String from; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVulNumStatisticsRequest request) {
            super(request);
            this.from = request.from;
        } 

        /**
         * The source of the request.
         * <p>
         * 
         * *   If you want to query Security Center-related data, set the value to **sas**.
         * *   If you want to query Server Guard-related data, you do not need to specify this parameter.
         */
        public Builder from(String from) {
            this.putQueryParameter("From", from);
            this.from = from;
            return this;
        }

        @Override
        public DescribeVulNumStatisticsRequest build() {
            return new DescribeVulNumStatisticsRequest(this);
        } 

    } 

}
