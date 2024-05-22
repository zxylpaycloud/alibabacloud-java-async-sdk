// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMembersRequest} extends {@link RequestModel}
 *
 * <p>AddMembersRequest</p>
 */
public class AddMembersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("memberArns")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > memberArns;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private AddMembersRequest(Builder builder) {
        super(builder);
        this.memberArns = builder.memberArns;
        this.workspaceId = builder.workspaceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMembersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return memberArns
     */
    public java.util.List < String > getMemberArns() {
        return this.memberArns;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AddMembersRequest, Builder> {
        private java.util.List < String > memberArns; 
        private String workspaceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddMembersRequest request) {
            super(request);
            this.memberArns = request.memberArns;
            this.workspaceId = request.workspaceId;
            this.regionId = request.regionId;
        } 

        /**
         * memberArns.
         */
        public Builder memberArns(java.util.List < String > memberArns) {
            this.putBodyParameter("memberArns", memberArns);
            this.memberArns = memberArns;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AddMembersRequest build() {
            return new AddMembersRequest(this);
        } 

    } 

}
