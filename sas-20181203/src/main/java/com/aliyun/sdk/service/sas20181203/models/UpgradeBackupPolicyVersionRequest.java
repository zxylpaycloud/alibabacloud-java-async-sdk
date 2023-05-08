// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeBackupPolicyVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeBackupPolicyVersionRequest</p>
 */
public class UpgradeBackupPolicyVersionRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    private UpgradeBackupPolicyVersionRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeBackupPolicyVersionRequest create() {
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

    public static final class Builder extends Request.Builder<UpgradeBackupPolicyVersionRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeBackupPolicyVersionRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * The ID of the anti-ransomware policy.
         * <p>
         * 
         * > You can call the [DescribeBackupPolicies](~~DescribeBackupPolicies~~) operation to query the IDs of anti-ransomware policies.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public UpgradeBackupPolicyVersionRequest build() {
            return new UpgradeBackupPolicyVersionRequest(this);
        } 

    } 

}
