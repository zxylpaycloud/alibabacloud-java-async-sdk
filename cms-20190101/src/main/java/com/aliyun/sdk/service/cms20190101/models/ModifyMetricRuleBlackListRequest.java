// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMetricRuleBlackListRequest} extends {@link RequestModel}
 *
 * <p>ModifyMetricRuleBlackListRequest</p>
 */
public class ModifyMetricRuleBlackListRequest extends Request {
    @Query
    @NameInMap("Category")
    @Validation(required = true)
    private String category;

    @Query
    @NameInMap("EffectiveTime")
    private String effectiveTime;

    @Query
    @NameInMap("EnableEndTime")
    private String enableEndTime;

    @Query
    @NameInMap("EnableStartTime")
    private String enableStartTime;

    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("Instances")
    @Validation(required = true)
    private java.util.List < String > instances;

    @Query
    @NameInMap("Metrics")
    private java.util.List < Metrics> metrics;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("ScopeType")
    private String scopeType;

    @Query
    @NameInMap("ScopeValue")
    private String scopeValue;

    private ModifyMetricRuleBlackListRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.effectiveTime = builder.effectiveTime;
        this.enableEndTime = builder.enableEndTime;
        this.enableStartTime = builder.enableStartTime;
        this.id = builder.id;
        this.instances = builder.instances;
        this.metrics = builder.metrics;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.scopeType = builder.scopeType;
        this.scopeValue = builder.scopeValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMetricRuleBlackListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return enableEndTime
     */
    public String getEnableEndTime() {
        return this.enableEndTime;
    }

    /**
     * @return enableStartTime
     */
    public String getEnableStartTime() {
        return this.enableStartTime;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return instances
     */
    public java.util.List < String > getInstances() {
        return this.instances;
    }

    /**
     * @return metrics
     */
    public java.util.List < Metrics> getMetrics() {
        return this.metrics;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return scopeType
     */
    public String getScopeType() {
        return this.scopeType;
    }

    /**
     * @return scopeValue
     */
    public String getScopeValue() {
        return this.scopeValue;
    }

    public static final class Builder extends Request.Builder<ModifyMetricRuleBlackListRequest, Builder> {
        private String category; 
        private String effectiveTime; 
        private String enableEndTime; 
        private String enableStartTime; 
        private String id; 
        private java.util.List < String > instances; 
        private java.util.List < Metrics> metrics; 
        private String name; 
        private String namespace; 
        private String scopeType; 
        private String scopeValue; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMetricRuleBlackListRequest request) {
            super(request);
            this.category = request.category;
            this.effectiveTime = request.effectiveTime;
            this.enableEndTime = request.enableEndTime;
            this.enableStartTime = request.enableStartTime;
            this.id = request.id;
            this.instances = request.instances;
            this.metrics = request.metrics;
            this.name = request.name;
            this.namespace = request.namespace;
            this.scopeType = request.scopeType;
            this.scopeValue = request.scopeValue;
        } 

        /**
         * The category of the Alibaba Cloud service. For example, ApsaraDB for Redis includes the following categories: ApsaraDB for Redis (standard architecture), ApsaraDB for Redis (cluster architecture), and ApsaraDB for Redis (read/write splitting architecture). In this case, the valid values of this parameter for ApsaraDB for Redis include `kvstore_standard`, `kvstore_sharding`, and `kvstore_splitrw`.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The time range within which the blacklist policy is effective. Take note of the following information:
         * <p>
         * 
         * *   If you do not configure this parameter, the blacklist policy is permanently effective.
         * 
         * *   If you configure this parameter, the blacklist policy is effective only within the specified time range. Examples:
         * 
         *     *   `03:00-04:59`: The blacklist policy is effective from 03:00 to 05:00 local time. 05:00 local time is excluded.
         *     *   `03:00-04:59 UTC+0700`: The blacklist policy is effective from 03:00 to 05:00 (UTC+7). 05:00 (UTC+7) is excluded.
         */
        public Builder effectiveTime(String effectiveTime) {
            this.putQueryParameter("EffectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * The timestamp when the blacklist policy expires.
         * <p>
         * 
         * Unit: milliseconds.
         */
        public Builder enableEndTime(String enableEndTime) {
            this.putQueryParameter("EnableEndTime", enableEndTime);
            this.enableEndTime = enableEndTime;
            return this;
        }

        /**
         * The timestamp when the blacklist policy starts to take effect.
         * <p>
         * 
         * Unit: milliseconds.
         */
        public Builder enableStartTime(String enableStartTime) {
            this.putQueryParameter("EnableStartTime", enableStartTime);
            this.enableStartTime = enableStartTime;
            return this;
        }

        /**
         * The ID of the blacklist policy.
         * <p>
         * 
         * For information about how to obtain the ID of a blacklist policy, see [DescribeMetricRuleBlackList](~~457257~~).
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The IDs of the instances that belong to the specified cloud service.
         */
        public Builder instances(java.util.List < String > instances) {
            this.putQueryParameter("Instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * The metrics of the instance.
         * <p>
         * 
         * *   If you do not configure this parameter, the blacklist policy applies to all metrics of the specified cloud service.
         * *   If you configure this parameter, the blacklist policy applies only to the current metric.
         */
        public Builder metrics(java.util.List < Metrics> metrics) {
            this.putQueryParameter("Metrics", metrics);
            this.metrics = metrics;
            return this;
        }

        /**
         * The name of the blacklist policy.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The namespace of the cloud service.
         * <p>
         * 
         * For more information about the namespaces of different cloud services, see [Appendix 1: Metrics](~~163515~~).
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The effective scope of the blacklist policy. Valid values:
         * <p>
         * 
         * *   USER: The blacklist policy takes effect only within the current Alibaba Cloud account.
         * *   GROUP (default): The blacklist policy takes effect only within the specified application group. For information about how to obtain the ID of an application group, see [DescribeMonitorGroups](~~115032~~).
         */
        public Builder scopeType(String scopeType) {
            this.putQueryParameter("ScopeType", scopeType);
            this.scopeType = scopeType;
            return this;
        }

        /**
         * The IDs of the application groups. Specify a JSON array.
         * <p>
         * 
         * > This parameter must be specified when `ScopeType` is set to `GROUP`.
         */
        public Builder scopeValue(String scopeValue) {
            this.putQueryParameter("ScopeValue", scopeValue);
            this.scopeValue = scopeValue;
            return this;
        }

        @Override
        public ModifyMetricRuleBlackListRequest build() {
            return new ModifyMetricRuleBlackListRequest(this);
        } 

    } 

    public static class Metrics extends TeaModel {
        @NameInMap("MetricName")
        @Validation(required = true)
        private String metricName;

        @NameInMap("Resource")
        private String resource;

        private Metrics(Builder builder) {
            this.metricName = builder.metricName;
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        public static final class Builder {
            private String metricName; 
            private String resource; 

            /**
             * The name of the metric.
             * <p>
             * 
             * Valid values of N: 1 to 10.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The extended dimension of the instance. For example, `{"device":"C:"}` specifies that the blacklist policy is applied to all C disks of the specified Elastic Compute Service (ECS) instance.
             * <p>
             * 
             * Valid values of N: 1 to 10.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
}
