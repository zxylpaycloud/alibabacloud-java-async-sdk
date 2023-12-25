// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCloudRecordTextRequest} extends {@link RequestModel}
 *
 * <p>QueryCloudRecordTextRequest</p>
 */
public class QueryCloudRecordTextRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("Direction")
    private String direction;

    @Body
    @NameInMap("MaxResults")
    private Long maxResults;

    @Body
    @NameInMap("NextToken")
    private Long nextToken;

    @Body
    @NameInMap("StartTime")
    private Long startTime;

    @Body
    @NameInMap("TenantContext")
    private TenantContext tenantContext;

    @Body
    @NameInMap("conferenceId")
    @Validation(required = true)
    private String conferenceId;

    private QueryCloudRecordTextRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.direction = builder.direction;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.startTime = builder.startTime;
        this.tenantContext = builder.tenantContext;
        this.conferenceId = builder.conferenceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCloudRecordTextRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountContext
     */
    public AccountContext getAccountContext() {
        return this.accountContext;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public Long getNextToken() {
        return this.nextToken;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return conferenceId
     */
    public String getConferenceId() {
        return this.conferenceId;
    }

    public static final class Builder extends Request.Builder<QueryCloudRecordTextRequest, Builder> {
        private AccountContext accountContext; 
        private String direction; 
        private Long maxResults; 
        private Long nextToken; 
        private Long startTime; 
        private TenantContext tenantContext; 
        private String conferenceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryCloudRecordTextRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.direction = request.direction;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.startTime = request.startTime;
            this.tenantContext = request.tenantContext;
            this.conferenceId = request.conferenceId;
        } 

        /**
         * AccountContext.
         */
        public Builder accountContext(AccountContext accountContext) {
            String accountContextShrink = shrink(accountContext, "AccountContext", "json");
            this.putHeaderParameter("AccountContext", accountContextShrink);
            this.accountContext = accountContext;
            return this;
        }

        /**
         * Direction.
         */
        public Builder direction(String direction) {
            this.putBodyParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(Long nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * TenantContext.
         */
        public Builder tenantContext(TenantContext tenantContext) {
            String tenantContextShrink = shrink(tenantContext, "TenantContext", "json");
            this.putBodyParameter("TenantContext", tenantContextShrink);
            this.tenantContext = tenantContext;
            return this;
        }

        /**
         * conferenceId.
         */
        public Builder conferenceId(String conferenceId) {
            this.putBodyParameter("conferenceId", conferenceId);
            this.conferenceId = conferenceId;
            return this;
        }

        @Override
        public QueryCloudRecordTextRequest build() {
            return new QueryCloudRecordTextRequest(this);
        } 

    } 

    public static class AccountContext extends TeaModel {
        @NameInMap("accountId")
        @Validation(required = true)
        private String accountId;

        private AccountContext(Builder builder) {
            this.accountId = builder.accountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountContext create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        public static final class Builder {
            private String accountId; 

            /**
             * accountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            public AccountContext build() {
                return new AccountContext(this);
            } 

        } 

    }
    public static class TenantContext extends TeaModel {
        @NameInMap("tenantId")
        private String tenantId;

        private TenantContext(Builder builder) {
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantContext create() {
            return builder().build();
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String tenantId; 

            /**
             * tenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public TenantContext build() {
                return new TenantContext(this);
            } 

        } 

    }
}
