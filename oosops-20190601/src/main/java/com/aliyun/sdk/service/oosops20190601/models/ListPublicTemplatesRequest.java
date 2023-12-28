// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPublicTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListPublicTemplatesRequest</p>
 */
public class ListPublicTemplatesRequest extends Request {
    @Query
    @NameInMap("CreatedBy")
    private String createdBy;

    @Query
    @NameInMap("CreatedDateAfter")
    private String createdDateAfter;

    @Query
    @NameInMap("CreatedDateBefore")
    private String createdDateBefore;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("Popularity")
    private Integer popularity;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ShareType")
    private String shareType;

    @Query
    @NameInMap("SortField")
    private String sortField;

    @Query
    @NameInMap("SortOrder")
    private String sortOrder;

    @Query
    @NameInMap("TemplateFormat")
    private String templateFormat;

    @Query
    @NameInMap("TemplateName")
    private String templateName;

    private ListPublicTemplatesRequest(Builder builder) {
        super(builder);
        this.createdBy = builder.createdBy;
        this.createdDateAfter = builder.createdDateAfter;
        this.createdDateBefore = builder.createdDateBefore;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.popularity = builder.popularity;
        this.regionId = builder.regionId;
        this.shareType = builder.shareType;
        this.sortField = builder.sortField;
        this.sortOrder = builder.sortOrder;
        this.templateFormat = builder.templateFormat;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublicTemplatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @return createdDateAfter
     */
    public String getCreatedDateAfter() {
        return this.createdDateAfter;
    }

    /**
     * @return createdDateBefore
     */
    public String getCreatedDateBefore() {
        return this.createdDateBefore;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return popularity
     */
    public Integer getPopularity() {
        return this.popularity;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return shareType
     */
    public String getShareType() {
        return this.shareType;
    }

    /**
     * @return sortField
     */
    public String getSortField() {
        return this.sortField;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return templateFormat
     */
    public String getTemplateFormat() {
        return this.templateFormat;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<ListPublicTemplatesRequest, Builder> {
        private String createdBy; 
        private String createdDateAfter; 
        private String createdDateBefore; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer popularity; 
        private String regionId; 
        private String shareType; 
        private String sortField; 
        private String sortOrder; 
        private String templateFormat; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(ListPublicTemplatesRequest request) {
            super(request);
            this.createdBy = request.createdBy;
            this.createdDateAfter = request.createdDateAfter;
            this.createdDateBefore = request.createdDateBefore;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.popularity = request.popularity;
            this.regionId = request.regionId;
            this.shareType = request.shareType;
            this.sortField = request.sortField;
            this.sortOrder = request.sortOrder;
            this.templateFormat = request.templateFormat;
            this.templateName = request.templateName;
        } 

        /**
         * CreatedBy.
         */
        public Builder createdBy(String createdBy) {
            this.putQueryParameter("CreatedBy", createdBy);
            this.createdBy = createdBy;
            return this;
        }

        /**
         * CreatedDateAfter.
         */
        public Builder createdDateAfter(String createdDateAfter) {
            this.putQueryParameter("CreatedDateAfter", createdDateAfter);
            this.createdDateAfter = createdDateAfter;
            return this;
        }

        /**
         * CreatedDateBefore.
         */
        public Builder createdDateBefore(String createdDateBefore) {
            this.putQueryParameter("CreatedDateBefore", createdDateBefore);
            this.createdDateBefore = createdDateBefore;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
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
         * Popularity.
         */
        public Builder popularity(Integer popularity) {
            this.putQueryParameter("Popularity", popularity);
            this.popularity = popularity;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ShareType.
         */
        public Builder shareType(String shareType) {
            this.putQueryParameter("ShareType", shareType);
            this.shareType = shareType;
            return this;
        }

        /**
         * SortField.
         */
        public Builder sortField(String sortField) {
            this.putQueryParameter("SortField", sortField);
            this.sortField = sortField;
            return this;
        }

        /**
         * SortOrder.
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * TemplateFormat.
         */
        public Builder templateFormat(String templateFormat) {
            this.putQueryParameter("TemplateFormat", templateFormat);
            this.templateFormat = templateFormat;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public ListPublicTemplatesRequest build() {
            return new ListPublicTemplatesRequest(this);
        } 

    } 

}
