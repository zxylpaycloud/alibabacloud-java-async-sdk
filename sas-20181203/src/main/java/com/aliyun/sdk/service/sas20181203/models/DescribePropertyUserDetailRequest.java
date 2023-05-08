// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyUserDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyUserDetailRequest</p>
 */
public class DescribePropertyUserDetailRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Extend")
    private String extend;

    @Query
    @NameInMap("IsRoot")
    private String isRoot;

    @Query
    @NameInMap("LastLoginTimeEnd")
    private Long lastLoginTimeEnd;

    @Query
    @NameInMap("LastLoginTimeStart")
    private Long lastLoginTimeStart;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Remark")
    private String remark;

    @Query
    @NameInMap("User")
    private String user;

    @Query
    @NameInMap("Uuid")
    private String uuid;

    private DescribePropertyUserDetailRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.extend = builder.extend;
        this.isRoot = builder.isRoot;
        this.lastLoginTimeEnd = builder.lastLoginTimeEnd;
        this.lastLoginTimeStart = builder.lastLoginTimeStart;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.user = builder.user;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePropertyUserDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return extend
     */
    public String getExtend() {
        return this.extend;
    }

    /**
     * @return isRoot
     */
    public String getIsRoot() {
        return this.isRoot;
    }

    /**
     * @return lastLoginTimeEnd
     */
    public Long getLastLoginTimeEnd() {
        return this.lastLoginTimeEnd;
    }

    /**
     * @return lastLoginTimeStart
     */
    public Long getLastLoginTimeStart() {
        return this.lastLoginTimeStart;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return user
     */
    public String getUser() {
        return this.user;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DescribePropertyUserDetailRequest, Builder> {
        private Integer currentPage; 
        private String extend; 
        private String isRoot; 
        private Long lastLoginTimeEnd; 
        private Long lastLoginTimeStart; 
        private Integer pageSize; 
        private String remark; 
        private String user; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribePropertyUserDetailRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.extend = request.extend;
            this.isRoot = request.isRoot;
            this.lastLoginTimeEnd = request.lastLoginTimeEnd;
            this.lastLoginTimeStart = request.lastLoginTimeStart;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.user = request.user;
            this.uuid = request.uuid;
        } 

        /**
         * The number of entries to return on each page. Default value: **10**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The details of asset fingerprints for the account.
         */
        public Builder extend(String extend) {
            this.putQueryParameter("Extend", extend);
            this.extend = extend;
            return this;
        }

        /**
         * The details of the user groups to which the account belongs.
         */
        public Builder isRoot(String isRoot) {
            this.putQueryParameter("IsRoot", isRoot);
            this.isRoot = isRoot;
            return this;
        }

        /**
         * The details of the user groups to which the account belongs.
         */
        public Builder lastLoginTimeEnd(Long lastLoginTimeEnd) {
            this.putQueryParameter("LastLoginTimeEnd", lastLoginTimeEnd);
            this.lastLoginTimeEnd = lastLoginTimeEnd;
            return this;
        }

        /**
         * The date on which the account expires.
         */
        public Builder lastLoginTimeStart(Long lastLoginTimeStart) {
            this.putQueryParameter("LastLoginTimeStart", lastLoginTimeStart);
            this.lastLoginTimeStart = lastLoginTimeStart;
            return this;
        }

        /**
         * The name or IP address of the server.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Indicates whether the password expires. Valid values:
         * <p>
         * 
         * *   **0**: yes
         * *   **1**: no
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder user(String user) {
            this.putQueryParameter("User", user);
            this.user = user;
            return this;
        }

        /**
         * The public IP address of the server.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribePropertyUserDetailRequest build() {
            return new DescribePropertyUserDetailRequest(this);
        } 

    } 

}
