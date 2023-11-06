// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAggregateResourceEvaluationResultsRequest} extends {@link RequestModel}
 *
 * <p>ListAggregateResourceEvaluationResultsRequest</p>
 */
public class ListAggregateResourceEvaluationResultsRequest extends Request {
    @Query
    @NameInMap("AggregatorId")
    @Validation(required = true)
    private String aggregatorId;

    @Query
    @NameInMap("ComplianceType")
    private String complianceType;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 500, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    private ListAggregateResourceEvaluationResultsRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.complianceType = builder.complianceType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.region = builder.region;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAggregateResourceEvaluationResultsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return complianceType
     */
    public String getComplianceType() {
        return this.complianceType;
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
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<ListAggregateResourceEvaluationResultsRequest, Builder> {
        private String aggregatorId; 
        private String complianceType; 
        private Integer maxResults; 
        private String nextToken; 
        private String region; 
        private String resourceId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListAggregateResourceEvaluationResultsRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.complianceType = request.complianceType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.region = request.region;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
        } 

        /**
         * The ID of the account group.
         * <p>
         * 
         * For more information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The compliance evaluation result of the resource. Valid values:
         * <p>
         * 
         * *   COMPLIANT: The resource is evaluated as compliant.
         * *   NON_COMPLIANT: The resource is evaluated as non-compliant.
         * *   NOT_APPLICABLE: The rule does not apply to the resource.
         * *   INSUFFICIENT_DATA: No data is available.
         * *   IGNORED: The resource is ignored during compliance evaluation.
         */
        public Builder complianceType(String complianceType) {
            this.putQueryParameter("ComplianceType", complianceType);
            this.complianceType = complianceType;
            return this;
        }

        /**
         * The maximum number of entries to return for a single request. Valid values: 1 to 100.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that you want to use to initiate the current request. If the response of the previous request is truncated, you can use this token to initiate another request and obtain the remaining entries.``
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the region where one or more resources that you want to query reside. For example, the value `global` indicates global regions and the value `cn-hangzhou` indicates the China (Hangzhou) region.
         * <p>
         * 
         * For more information about how to obtain the ID of a region, see [ListAggregateDiscoveredResources](~~265983~~).
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * The ID of the resource.
         * <p>
         * 
         * For more information about how to obtain the ID of a resource, see [ListAggregateDiscoveredResources](~~265983~~).
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * The type of the resource.
         * <p>
         * 
         * For more information about how to query the type of a resource, see [ListAggregateDiscoveredResources](~~265983~~).
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public ListAggregateResourceEvaluationResultsRequest build() {
            return new ListAggregateResourceEvaluationResultsRequest(this);
        } 

    } 

}
