// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTableThemeRequest} extends {@link RequestModel}
 *
 * <p>ListTableThemeRequest</p>
 */
public class ListTableThemeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    @com.aliyun.core.annotation.Validation(maximum = 2147483647, minimum = 1)
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentId")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long parentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long projectId;

    private ListTableThemeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.parentId = builder.parentId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTableThemeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return parentId
     */
    public Long getParentId() {
        return this.parentId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<ListTableThemeRequest, Builder> {
        private String regionId; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Long parentId; 
        private Long projectId; 

        private Builder() {
            super();
        } 

        private Builder(ListTableThemeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.parentId = request.parentId;
            this.projectId = request.projectId;
        } 

        /**
         * The ID of the region where the service is activated.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value:10. Maximum value: 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the parent table folder.
         */
        public Builder parentId(Long parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * The ID of the DataWorks workspace.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public ListTableThemeRequest build() {
            return new ListTableThemeRequest(this);
        } 

    } 

}
