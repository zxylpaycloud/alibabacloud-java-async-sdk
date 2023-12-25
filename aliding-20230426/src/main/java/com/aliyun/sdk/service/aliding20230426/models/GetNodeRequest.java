// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNodeRequest} extends {@link RequestModel}
 *
 * <p>GetNodeRequest</p>
 */
public class GetNodeRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("NodeId")
    @Validation(required = true)
    private String nodeId;

    @Body
    @NameInMap("TenantContext")
    private TenantContext tenantContext;

    @Body
    @NameInMap("WithPermissionRole")
    private Boolean withPermissionRole;

    @Body
    @NameInMap("WithStatisticalInfo")
    private Boolean withStatisticalInfo;

    private GetNodeRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.nodeId = builder.nodeId;
        this.tenantContext = builder.tenantContext;
        this.withPermissionRole = builder.withPermissionRole;
        this.withStatisticalInfo = builder.withStatisticalInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeRequest create() {
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
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return withPermissionRole
     */
    public Boolean getWithPermissionRole() {
        return this.withPermissionRole;
    }

    /**
     * @return withStatisticalInfo
     */
    public Boolean getWithStatisticalInfo() {
        return this.withStatisticalInfo;
    }

    public static final class Builder extends Request.Builder<GetNodeRequest, Builder> {
        private AccountContext accountContext; 
        private String nodeId; 
        private TenantContext tenantContext; 
        private Boolean withPermissionRole; 
        private Boolean withStatisticalInfo; 

        private Builder() {
            super();
        } 

        private Builder(GetNodeRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.nodeId = request.nodeId;
            this.tenantContext = request.tenantContext;
            this.withPermissionRole = request.withPermissionRole;
            this.withStatisticalInfo = request.withStatisticalInfo;
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
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
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
         * WithPermissionRole.
         */
        public Builder withPermissionRole(Boolean withPermissionRole) {
            this.putBodyParameter("WithPermissionRole", withPermissionRole);
            this.withPermissionRole = withPermissionRole;
            return this;
        }

        /**
         * WithStatisticalInfo.
         */
        public Builder withStatisticalInfo(Boolean withStatisticalInfo) {
            this.putBodyParameter("WithStatisticalInfo", withStatisticalInfo);
            this.withStatisticalInfo = withStatisticalInfo;
            return this;
        }

        @Override
        public GetNodeRequest build() {
            return new GetNodeRequest(this);
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
