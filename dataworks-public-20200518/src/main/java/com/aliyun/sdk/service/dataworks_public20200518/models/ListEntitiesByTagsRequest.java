// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEntitiesByTagsRequest} extends {@link RequestModel}
 *
 * <p>ListEntitiesByTagsRequest</p>
 */
public class ListEntitiesByTagsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String entityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 1000)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < UserEntityTag > tags;

    private ListEntitiesByTagsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.entityType = builder.entityType;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEntitiesByTagsRequest create() {
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
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return tags
     */
    public java.util.List < UserEntityTag > getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListEntitiesByTagsRequest, Builder> {
        private String regionId; 
        private String entityType; 
        private String nextToken; 
        private Integer pageSize; 
        private java.util.List < UserEntityTag > tags; 

        private Builder() {
            super();
        } 

        private Builder(ListEntitiesByTagsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.entityType = request.entityType;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.tags = request.tags;
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
         * EntityType.
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < UserEntityTag > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public ListEntitiesByTagsRequest build() {
            return new ListEntitiesByTagsRequest(this);
        } 

    } 

}
