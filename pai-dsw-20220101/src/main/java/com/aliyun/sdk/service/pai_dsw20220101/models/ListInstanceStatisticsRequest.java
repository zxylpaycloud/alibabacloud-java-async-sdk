// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceStatisticsRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceStatisticsRequest</p>
 */
public class ListInstanceStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceIds;

    private ListInstanceStatisticsRequest(Builder builder) {
        super(builder);
        this.workspaceIds = builder.workspaceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceIds
     */
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

    public static final class Builder extends Request.Builder<ListInstanceStatisticsRequest, Builder> {
        private String workspaceIds; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceStatisticsRequest request) {
            super(request);
            this.workspaceIds = request.workspaceIds;
        } 

        /**
         * WorkspaceIds.
         */
        public Builder workspaceIds(String workspaceIds) {
            this.putQueryParameter("WorkspaceIds", workspaceIds);
            this.workspaceIds = workspaceIds;
            return this;
        }

        @Override
        public ListInstanceStatisticsRequest build() {
            return new ListInstanceStatisticsRequest(this);
        } 

    } 

}
