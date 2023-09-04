// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCostBudgetsSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeCostBudgetsSummaryRequest</p>
 */
public class DescribeCostBudgetsSummaryRequest extends Request {
    @Query
    @NameInMap("BudgetName")
    private String budgetName;

    @Query
    @NameInMap("BudgetStatus")
    private String budgetStatus;

    @Query
    @NameInMap("BudgetType")
    private String budgetType;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    private DescribeCostBudgetsSummaryRequest(Builder builder) {
        super(builder);
        this.budgetName = builder.budgetName;
        this.budgetStatus = builder.budgetStatus;
        this.budgetType = builder.budgetType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCostBudgetsSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return budgetName
     */
    public String getBudgetName() {
        return this.budgetName;
    }

    /**
     * @return budgetStatus
     */
    public String getBudgetStatus() {
        return this.budgetStatus;
    }

    /**
     * @return budgetType
     */
    public String getBudgetType() {
        return this.budgetType;
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

    public static final class Builder extends Request.Builder<DescribeCostBudgetsSummaryRequest, Builder> {
        private String budgetName; 
        private String budgetStatus; 
        private String budgetType; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCostBudgetsSummaryRequest request) {
            super(request);
            this.budgetName = request.budgetName;
            this.budgetStatus = request.budgetStatus;
            this.budgetType = request.budgetType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * The name of the budget. Fuzzy match is supported.
         */
        public Builder budgetName(String budgetName) {
            this.putQueryParameter("BudgetName", budgetName);
            this.budgetName = budgetName;
            return this;
        }

        /**
         * The status of the budget. Valid values: overdue and notOverdue. A value of overdue specifies to filter expired budgets. A value of notOverdue specifies to filter budgets that do not expire. By default, if you do not specify this parameter, information about all budgets is to be returned.
         */
        public Builder budgetStatus(String budgetStatus) {
            this.putQueryParameter("BudgetStatus", budgetStatus);
            this.budgetStatus = budgetStatus;
            return this;
        }

        /**
         * The type of the budget. Valid values: cost, byquantity, and asset. A value of cost specifies to filter expense budgets. A value of byquantity specifies to filter budgets calculated based on the resource usage. A value of asset specifies to filter usage or coverage budgets. By default, information about all budgets is returned if you do not specify this parameter.
         */
        public Builder budgetType(String budgetType) {
            this.putQueryParameter("BudgetType", budgetType);
            this.budgetType = budgetType;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 10. Maximum value: 10. Minimum value: 1.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The position in which the query starts. You must set this parameter to null or the token that is obtained from the previous query. Otherwise, an error is returned. If you set the NextToken parameter to null, the query starts from the beginning. The default value is null.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public DescribeCostBudgetsSummaryRequest build() {
            return new DescribeCostBudgetsSummaryRequest(this);
        } 

    } 

}
