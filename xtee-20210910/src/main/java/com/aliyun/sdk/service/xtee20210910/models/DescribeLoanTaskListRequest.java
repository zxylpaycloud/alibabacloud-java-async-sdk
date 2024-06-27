// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoanTaskListRequest} extends {@link RequestModel}
 *
 * <p>DescribeLoanTaskListRequest</p>
 */
public class DescribeLoanTaskListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("batchNo")
    private String batchNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("monitorStatus")
    private String monitorStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribeLoanTaskListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.batchNo = builder.batchNo;
        this.currentPage = builder.currentPage;
        this.monitorStatus = builder.monitorStatus;
        this.pageSize = builder.pageSize;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoanTaskListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return batchNo
     */
    public String getBatchNo() {
        return this.batchNo;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return monitorStatus
     */
    public String getMonitorStatus() {
        return this.monitorStatus;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeLoanTaskListRequest, Builder> {
        private String lang; 
        private String batchNo; 
        private String currentPage; 
        private String monitorStatus; 
        private String pageSize; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLoanTaskListRequest request) {
            super(request);
            this.lang = request.lang;
            this.batchNo = request.batchNo;
            this.currentPage = request.currentPage;
            this.monitorStatus = request.monitorStatus;
            this.pageSize = request.pageSize;
            this.regId = request.regId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * batchNo.
         */
        public Builder batchNo(String batchNo) {
            this.putQueryParameter("batchNo", batchNo);
            this.batchNo = batchNo;
            return this;
        }

        /**
         * currentPage.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * monitorStatus.
         */
        public Builder monitorStatus(String monitorStatus) {
            this.putQueryParameter("monitorStatus", monitorStatus);
            this.monitorStatus = monitorStatus;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public DescribeLoanTaskListRequest build() {
            return new DescribeLoanTaskListRequest(this);
        } 

    } 

}
