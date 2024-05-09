// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySceneDefensePolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifySceneDefensePolicyRequest</p>
 */
public class ModifySceneDefensePolicyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Template")
    @com.aliyun.core.annotation.Validation(required = true)
    private String template;

    private ModifySceneDefensePolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.endTime = builder.endTime;
        this.name = builder.name;
        this.policyId = builder.policyId;
        this.startTime = builder.startTime;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySceneDefensePolicyRequest create() {
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
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    public static final class Builder extends Request.Builder<ModifySceneDefensePolicyRequest, Builder> {
        private String regionId; 
        private Long endTime; 
        private String name; 
        private String policyId; 
        private Long startTime; 
        private String template; 

        private Builder() {
            super();
        } 

        private Builder(ModifySceneDefensePolicyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.endTime = request.endTime;
            this.name = request.name;
            this.policyId = request.policyId;
            this.startTime = request.startTime;
            this.template = request.template;
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
         * The end time of the policy. The value is a UNIX timestamp. Unit: milliseconds.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The name of the policy.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the policy that you want to modify.
         * <p>
         * 
         * > You can call the [DescribeSceneDefensePolicies](~~159382~~) operation to query the IDs of all policies.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * The start time of the policy. The value is a UNIX timestamp. Unit: milliseconds.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The template of the policy. Valid values:
         * <p>
         * 
         * *   **promotion**: important activity
         * *   **bypass**: all traffic forwarded
         */
        public Builder template(String template) {
            this.putQueryParameter("Template", template);
            this.template = template;
            return this;
        }

        @Override
        public ModifySceneDefensePolicyRequest build() {
            return new ModifySceneDefensePolicyRequest(this);
        } 

    } 

}
