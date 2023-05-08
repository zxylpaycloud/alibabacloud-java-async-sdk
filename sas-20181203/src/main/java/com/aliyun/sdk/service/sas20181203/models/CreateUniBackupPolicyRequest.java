// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUniBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateUniBackupPolicyRequest</p>
 */
public class CreateUniBackupPolicyRequest extends Request {
    @Query
    @NameInMap("AccountName")
    private String accountName;

    @Query
    @NameInMap("AccountPassword")
    private String accountPassword;

    @Query
    @NameInMap("DatabaseAddByUser")
    private String databaseAddByUser;

    @Query
    @NameInMap("DatabaseType")
    @Validation(required = true)
    private String databaseType;

    @Query
    @NameInMap("FullPlan")
    @Validation(required = true)
    private java.util.Map < String, ? > fullPlan;

    @Query
    @NameInMap("IncPlan")
    @Validation(required = true)
    private java.util.Map < String, ? > incPlan;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PolicyName")
    @Validation(required = true)
    private String policyName;

    @Query
    @NameInMap("Retention")
    @Validation(required = true)
    private Integer retention;

    @Query
    @NameInMap("SpeedLimiter")
    @Validation(required = true)
    private Long speedLimiter;

    @Query
    @NameInMap("UniRegionId")
    @Validation(required = true)
    private String uniRegionId;

    @Query
    @NameInMap("Uuid")
    private String uuid;

    private CreateUniBackupPolicyRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.accountPassword = builder.accountPassword;
        this.databaseAddByUser = builder.databaseAddByUser;
        this.databaseType = builder.databaseType;
        this.fullPlan = builder.fullPlan;
        this.incPlan = builder.incPlan;
        this.instanceId = builder.instanceId;
        this.policyName = builder.policyName;
        this.retention = builder.retention;
        this.speedLimiter = builder.speedLimiter;
        this.uniRegionId = builder.uniRegionId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUniBackupPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return accountPassword
     */
    public String getAccountPassword() {
        return this.accountPassword;
    }

    /**
     * @return databaseAddByUser
     */
    public String getDatabaseAddByUser() {
        return this.databaseAddByUser;
    }

    /**
     * @return databaseType
     */
    public String getDatabaseType() {
        return this.databaseType;
    }

    /**
     * @return fullPlan
     */
    public java.util.Map < String, ? > getFullPlan() {
        return this.fullPlan;
    }

    /**
     * @return incPlan
     */
    public java.util.Map < String, ? > getIncPlan() {
        return this.incPlan;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return retention
     */
    public Integer getRetention() {
        return this.retention;
    }

    /**
     * @return speedLimiter
     */
    public Long getSpeedLimiter() {
        return this.speedLimiter;
    }

    /**
     * @return uniRegionId
     */
    public String getUniRegionId() {
        return this.uniRegionId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<CreateUniBackupPolicyRequest, Builder> {
        private String accountName; 
        private String accountPassword; 
        private String databaseAddByUser; 
        private String databaseType; 
        private java.util.Map < String, ? > fullPlan; 
        private java.util.Map < String, ? > incPlan; 
        private String instanceId; 
        private String policyName; 
        private Integer retention; 
        private Long speedLimiter; 
        private String uniRegionId; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(CreateUniBackupPolicyRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.accountPassword = request.accountPassword;
            this.databaseAddByUser = request.databaseAddByUser;
            this.databaseType = request.databaseType;
            this.fullPlan = request.fullPlan;
            this.incPlan = request.incPlan;
            this.instanceId = request.instanceId;
            this.policyName = request.policyName;
            this.retention = request.retention;
            this.speedLimiter = request.speedLimiter;
            this.uniRegionId = request.uniRegionId;
            this.uuid = request.uuid;
        } 

        /**
         * AccountName.
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * AccountPassword.
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * DatabaseAddByUser.
         */
        public Builder databaseAddByUser(String databaseAddByUser) {
            this.putQueryParameter("DatabaseAddByUser", databaseAddByUser);
            this.databaseAddByUser = databaseAddByUser;
            return this;
        }

        /**
         * DatabaseType.
         */
        public Builder databaseType(String databaseType) {
            this.putQueryParameter("DatabaseType", databaseType);
            this.databaseType = databaseType;
            return this;
        }

        /**
         * FullPlan.
         */
        public Builder fullPlan(java.util.Map < String, ? > fullPlan) {
            String fullPlanShrink = shrink(fullPlan, "FullPlan", "json");
            this.putQueryParameter("FullPlan", fullPlanShrink);
            this.fullPlan = fullPlan;
            return this;
        }

        /**
         * IncPlan.
         */
        public Builder incPlan(java.util.Map < String, ? > incPlan) {
            String incPlanShrink = shrink(incPlan, "IncPlan", "json");
            this.putQueryParameter("IncPlan", incPlanShrink);
            this.incPlan = incPlan;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PolicyName.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * Retention.
         */
        public Builder retention(Integer retention) {
            this.putQueryParameter("Retention", retention);
            this.retention = retention;
            return this;
        }

        /**
         * SpeedLimiter.
         */
        public Builder speedLimiter(Long speedLimiter) {
            this.putQueryParameter("SpeedLimiter", speedLimiter);
            this.speedLimiter = speedLimiter;
            return this;
        }

        /**
         * UniRegionId.
         */
        public Builder uniRegionId(String uniRegionId) {
            this.putQueryParameter("UniRegionId", uniRegionId);
            this.uniRegionId = uniRegionId;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public CreateUniBackupPolicyRequest build() {
            return new CreateUniBackupPolicyRequest(this);
        } 

    } 

}
