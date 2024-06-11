// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPolicyGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListPolicyGroupsRequest</p>
 */
public class ListPolicyGroupsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyGroupIds")
    private java.util.List < String > policyGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyGroupName")
    private String policyGroupName;

    private ListPolicyGroupsRequest(Builder builder) {
        super(builder);
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.policyGroupIds = builder.policyGroupIds;
        this.policyGroupName = builder.policyGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolicyGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return policyGroupIds
     */
    public java.util.List < String > getPolicyGroupIds() {
        return this.policyGroupIds;
    }

    /**
     * @return policyGroupName
     */
    public String getPolicyGroupName() {
        return this.policyGroupName;
    }

    public static final class Builder extends Request.Builder<ListPolicyGroupsRequest, Builder> {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < String > policyGroupIds; 
        private String policyGroupName; 

        private Builder() {
            super();
        } 

        private Builder(ListPolicyGroupsRequest request) {
            super(request);
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.policyGroupIds = request.policyGroupIds;
            this.policyGroupName = request.policyGroupName;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PolicyGroupIds.
         */
        public Builder policyGroupIds(java.util.List < String > policyGroupIds) {
            this.putBodyParameter("PolicyGroupIds", policyGroupIds);
            this.policyGroupIds = policyGroupIds;
            return this;
        }

        /**
         * PolicyGroupName.
         */
        public Builder policyGroupName(String policyGroupName) {
            this.putBodyParameter("PolicyGroupName", policyGroupName);
            this.policyGroupName = policyGroupName;
            return this;
        }

        @Override
        public ListPolicyGroupsRequest build() {
            return new ListPolicyGroupsRequest(this);
        } 

    } 

}
