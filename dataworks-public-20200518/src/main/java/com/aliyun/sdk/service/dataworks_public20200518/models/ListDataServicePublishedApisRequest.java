// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataServicePublishedApisRequest} extends {@link RequestModel}
 *
 * <p>ListDataServicePublishedApisRequest</p>
 */
public class ListDataServicePublishedApisRequest extends Request {
    @Body
    @NameInMap("ApiNameKeyword")
    private String apiNameKeyword;

    @Body
    @NameInMap("ApiPathKeyword")
    private String apiPathKeyword;

    @Body
    @NameInMap("CreatorId")
    private String creatorId;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private Long projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("TenantId")
    @Validation(required = true)
    private Long tenantId;

    private ListDataServicePublishedApisRequest(Builder builder) {
        super(builder);
        this.apiNameKeyword = builder.apiNameKeyword;
        this.apiPathKeyword = builder.apiPathKeyword;
        this.creatorId = builder.creatorId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataServicePublishedApisRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiNameKeyword
     */
    public String getApiNameKeyword() {
        return this.apiNameKeyword;
    }

    /**
     * @return apiPathKeyword
     */
    public String getApiPathKeyword() {
        return this.apiPathKeyword;
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<ListDataServicePublishedApisRequest, Builder> {
        private String apiNameKeyword; 
        private String apiPathKeyword; 
        private String creatorId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private String regionId; 
        private Long tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListDataServicePublishedApisRequest request) {
            super(request);
            this.apiNameKeyword = request.apiNameKeyword;
            this.apiPathKeyword = request.apiPathKeyword;
            this.creatorId = request.creatorId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.tenantId = request.tenantId;
        } 

        /**
         * ApiNameKeyword.
         */
        public Builder apiNameKeyword(String apiNameKeyword) {
            this.putBodyParameter("ApiNameKeyword", apiNameKeyword);
            this.apiNameKeyword = apiNameKeyword;
            return this;
        }

        /**
         * ApiPathKeyword.
         */
        public Builder apiPathKeyword(String apiPathKeyword) {
            this.putBodyParameter("ApiPathKeyword", apiPathKeyword);
            this.apiPathKeyword = apiPathKeyword;
            return this;
        }

        /**
         * CreatorId.
         */
        public Builder creatorId(String creatorId) {
            this.putBodyParameter("CreatorId", creatorId);
            this.creatorId = creatorId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public ListDataServicePublishedApisRequest build() {
            return new ListDataServicePublishedApisRequest(this);
        } 

    } 

}
