// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAndroidInstanceGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyAndroidInstanceGroupRequest</p>
 */
public class ModifyAndroidInstanceGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceGroupId")
    private String instanceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewInstanceGroupName")
    private String newInstanceGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    private String policyGroupId;

    private ModifyAndroidInstanceGroupRequest(Builder builder) {
        super(builder);
        this.instanceGroupId = builder.instanceGroupId;
        this.newInstanceGroupName = builder.newInstanceGroupName;
        this.policyGroupId = builder.policyGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAndroidInstanceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceGroupId
     */
    public String getInstanceGroupId() {
        return this.instanceGroupId;
    }

    /**
     * @return newInstanceGroupName
     */
    public String getNewInstanceGroupName() {
        return this.newInstanceGroupName;
    }

    /**
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public static final class Builder extends Request.Builder<ModifyAndroidInstanceGroupRequest, Builder> {
        private String instanceGroupId; 
        private String newInstanceGroupName; 
        private String policyGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAndroidInstanceGroupRequest request) {
            super(request);
            this.instanceGroupId = request.instanceGroupId;
            this.newInstanceGroupName = request.newInstanceGroupName;
            this.policyGroupId = request.policyGroupId;
        } 

        /**
         * InstanceGroupId.
         */
        public Builder instanceGroupId(String instanceGroupId) {
            this.putQueryParameter("InstanceGroupId", instanceGroupId);
            this.instanceGroupId = instanceGroupId;
            return this;
        }

        /**
         * NewInstanceGroupName.
         */
        public Builder newInstanceGroupName(String newInstanceGroupName) {
            this.putQueryParameter("NewInstanceGroupName", newInstanceGroupName);
            this.newInstanceGroupName = newInstanceGroupName;
            return this;
        }

        /**
         * PolicyGroupId.
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        @Override
        public ModifyAndroidInstanceGroupRequest build() {
            return new ModifyAndroidInstanceGroupRequest(this);
        } 

    } 

}
