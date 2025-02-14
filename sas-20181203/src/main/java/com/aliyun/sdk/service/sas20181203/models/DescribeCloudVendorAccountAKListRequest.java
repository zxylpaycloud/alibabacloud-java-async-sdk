// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudVendorAccountAKListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudVendorAccountAKListRequest</p>
 */
public class DescribeCloudVendorAccountAKListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthIds")
    private String authIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubAccountName")
    private String subAccountName;

    private DescribeCloudVendorAccountAKListRequest(Builder builder) {
        super(builder);
        this.authIds = builder.authIds;
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.subAccountName = builder.subAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudVendorAccountAKListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authIds
     */
    public String getAuthIds() {
        return this.authIds;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return subAccountName
     */
    public String getSubAccountName() {
        return this.subAccountName;
    }

    public static final class Builder extends Request.Builder<DescribeCloudVendorAccountAKListRequest, Builder> {
        private String authIds; 
        private Integer currentPage; 
        private String lang; 
        private Integer pageSize; 
        private Integer status; 
        private String subAccountName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudVendorAccountAKListRequest request) {
            super(request);
            this.authIds = request.authIds;
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.subAccountName = request.subAccountName;
        } 

        /**
         * The unique ID of the AccessKey pair.
         */
        public Builder authIds(String authIds) {
            this.putQueryParameter("AuthIds", authIds);
            this.authIds = authIds;
            return this;
        }

        /**
         * The page number. Default value: 1.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of entries per page. Default value: 20.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The status of the AccessKey pair. Valid values:
         * <p>
         * 
         * *   **0**: enabled
         * *   **1**: disabled
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The username of the sub-account of the cloud service provider to which the AccessKey pair belongs.
         */
        public Builder subAccountName(String subAccountName) {
            this.putQueryParameter("SubAccountName", subAccountName);
            this.subAccountName = subAccountName;
            return this;
        }

        @Override
        public DescribeCloudVendorAccountAKListRequest build() {
            return new DescribeCloudVendorAccountAKListRequest(this);
        } 

    } 

}
