// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserUsageDetailDataExportTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserUsageDetailDataExportTaskRequest</p>
 */
public class DescribeUserUsageDetailDataExportTaskRequest extends Request {
    @Query
    @NameInMap("PageNumber")
    private String pageNumber;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    private DescribeUserUsageDetailDataExportTaskRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserUsageDetailDataExportTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeUserUsageDetailDataExportTaskRequest, Builder> {
        private String pageNumber; 
        private String pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserUsageDetailDataExportTaskRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * The number of the page to return. Valid values: **1** to **100000**.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **20**. Maximum value: **50**.
         * <p>
         * 
         * Valid values: an integer from **1** to **50**.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeUserUsageDetailDataExportTaskRequest build() {
            return new DescribeUserUsageDetailDataExportTaskRequest(this);
        } 

    } 

}
