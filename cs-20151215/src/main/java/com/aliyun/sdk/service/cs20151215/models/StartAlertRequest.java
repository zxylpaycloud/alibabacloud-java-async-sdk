// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartAlertRequest} extends {@link RequestModel}
 *
 * <p>StartAlertRequest</p>
 */
public class StartAlertRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("alert_rule_group_name")
    private String alertRuleGroupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("alert_rule_name")
    private String alertRuleName;

    private StartAlertRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.alertRuleGroupName = builder.alertRuleGroupName;
        this.alertRuleName = builder.alertRuleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartAlertRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return alertRuleGroupName
     */
    public String getAlertRuleGroupName() {
        return this.alertRuleGroupName;
    }

    /**
     * @return alertRuleName
     */
    public String getAlertRuleName() {
        return this.alertRuleName;
    }

    public static final class Builder extends Request.Builder<StartAlertRequest, Builder> {
        private String clusterId; 
        private String alertRuleGroupName; 
        private String alertRuleName; 

        private Builder() {
            super();
        } 

        private Builder(StartAlertRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.alertRuleGroupName = request.alertRuleGroupName;
            this.alertRuleName = request.alertRuleName;
        } 

        /**
         * The cluster ID. You can call the ListClusters operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The name of the alert rule set to be enabled.
         */
        public Builder alertRuleGroupName(String alertRuleGroupName) {
            this.putBodyParameter("alert_rule_group_name", alertRuleGroupName);
            this.alertRuleGroupName = alertRuleGroupName;
            return this;
        }

        /**
         * The name of the alert rule to be enabled. If you do not specify an alert rule name, the alert rule set is enabled.
         */
        public Builder alertRuleName(String alertRuleName) {
            this.putBodyParameter("alert_rule_name", alertRuleName);
            this.alertRuleName = alertRuleName;
            return this;
        }

        @Override
        public StartAlertRequest build() {
            return new StartAlertRequest(this);
        } 

    } 

}
