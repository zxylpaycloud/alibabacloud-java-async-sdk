// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteBackupPolicyRequest</p>
 */
public class DeleteBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyVersion")
    private String policyVersion;

    private DeleteBackupPolicyRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.policyVersion = builder.policyVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBackupPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return policyVersion
     */
    public String getPolicyVersion() {
        return this.policyVersion;
    }

    public static final class Builder extends Request.Builder<DeleteBackupPolicyRequest, Builder> {
        private Long id; 
        private String policyVersion; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBackupPolicyRequest request) {
            super(request);
            this.id = request.id;
            this.policyVersion = request.policyVersion;
        } 

        /**
         * The ID of the anti-ransomware policy that you want to delete.
         * <p>
         * 
         * >  You can call the [DescribeBackupPolicies](~~DescribeBackupPolicies~~) operation to query the IDs of anti-ransomware policies.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The version of the anti-ransomware policy that you want to delete. You can call the [DescribeBackupPolicies](~~DescribeBackupPolicies~~) operation to query the versions of anti-ransomware policies. Valid values:
         * <p>
         * 
         * *   **1.0.0**
         * *   **2.0.0**
         */
        public Builder policyVersion(String policyVersion) {
            this.putQueryParameter("PolicyVersion", policyVersion);
            this.policyVersion = policyVersion;
            return this;
        }

        @Override
        public DeleteBackupPolicyRequest build() {
            return new DeleteBackupPolicyRequest(this);
        } 

    } 

}
