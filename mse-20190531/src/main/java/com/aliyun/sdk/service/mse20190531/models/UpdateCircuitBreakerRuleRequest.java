// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCircuitBreakerRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateCircuitBreakerRuleRequest</p>
 */
public class UpdateCircuitBreakerRuleRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("Enable")
    private Boolean enable;

    @Query
    @NameInMap("HalfOpenBaseAmountPerStep")
    private Integer halfOpenBaseAmountPerStep;

    @Query
    @NameInMap("HalfOpenRecoveryStepNum")
    private Integer halfOpenRecoveryStepNum;

    @Query
    @NameInMap("MaxAllowedRtMs")
    private Integer maxAllowedRtMs;

    @Query
    @NameInMap("MinRequestAmount")
    private Integer minRequestAmount;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("RetryTimeoutMs")
    private Integer retryTimeoutMs;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private Long ruleId;

    @Query
    @NameInMap("StatIntervalMs")
    private Integer statIntervalMs;

    @Query
    @NameInMap("Strategy")
    private Integer strategy;

    @Query
    @NameInMap("Threshold")
    private Float threshold;

    private UpdateCircuitBreakerRuleRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appId = builder.appId;
        this.appName = builder.appName;
        this.enable = builder.enable;
        this.halfOpenBaseAmountPerStep = builder.halfOpenBaseAmountPerStep;
        this.halfOpenRecoveryStepNum = builder.halfOpenRecoveryStepNum;
        this.maxAllowedRtMs = builder.maxAllowedRtMs;
        this.minRequestAmount = builder.minRequestAmount;
        this.namespace = builder.namespace;
        this.retryTimeoutMs = builder.retryTimeoutMs;
        this.ruleId = builder.ruleId;
        this.statIntervalMs = builder.statIntervalMs;
        this.strategy = builder.strategy;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCircuitBreakerRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return halfOpenBaseAmountPerStep
     */
    public Integer getHalfOpenBaseAmountPerStep() {
        return this.halfOpenBaseAmountPerStep;
    }

    /**
     * @return halfOpenRecoveryStepNum
     */
    public Integer getHalfOpenRecoveryStepNum() {
        return this.halfOpenRecoveryStepNum;
    }

    /**
     * @return maxAllowedRtMs
     */
    public Integer getMaxAllowedRtMs() {
        return this.maxAllowedRtMs;
    }

    /**
     * @return minRequestAmount
     */
    public Integer getMinRequestAmount() {
        return this.minRequestAmount;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return retryTimeoutMs
     */
    public Integer getRetryTimeoutMs() {
        return this.retryTimeoutMs;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return statIntervalMs
     */
    public Integer getStatIntervalMs() {
        return this.statIntervalMs;
    }

    /**
     * @return strategy
     */
    public Integer getStrategy() {
        return this.strategy;
    }

    /**
     * @return threshold
     */
    public Float getThreshold() {
        return this.threshold;
    }

    public static final class Builder extends Request.Builder<UpdateCircuitBreakerRuleRequest, Builder> {
        private String acceptLanguage; 
        private String appId; 
        private String appName; 
        private Boolean enable; 
        private Integer halfOpenBaseAmountPerStep; 
        private Integer halfOpenRecoveryStepNum; 
        private Integer maxAllowedRtMs; 
        private Integer minRequestAmount; 
        private String namespace; 
        private Integer retryTimeoutMs; 
        private Long ruleId; 
        private Integer statIntervalMs; 
        private Integer strategy; 
        private Float threshold; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCircuitBreakerRuleRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appId = request.appId;
            this.appName = request.appName;
            this.enable = request.enable;
            this.halfOpenBaseAmountPerStep = request.halfOpenBaseAmountPerStep;
            this.halfOpenRecoveryStepNum = request.halfOpenRecoveryStepNum;
            this.maxAllowedRtMs = request.maxAllowedRtMs;
            this.minRequestAmount = request.minRequestAmount;
            this.namespace = request.namespace;
            this.retryTimeoutMs = request.retryTimeoutMs;
            this.ruleId = request.ruleId;
            this.statIntervalMs = request.statIntervalMs;
            this.strategy = request.strategy;
            this.threshold = request.threshold;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * HalfOpenBaseAmountPerStep.
         */
        public Builder halfOpenBaseAmountPerStep(Integer halfOpenBaseAmountPerStep) {
            this.putQueryParameter("HalfOpenBaseAmountPerStep", halfOpenBaseAmountPerStep);
            this.halfOpenBaseAmountPerStep = halfOpenBaseAmountPerStep;
            return this;
        }

        /**
         * HalfOpenRecoveryStepNum.
         */
        public Builder halfOpenRecoveryStepNum(Integer halfOpenRecoveryStepNum) {
            this.putQueryParameter("HalfOpenRecoveryStepNum", halfOpenRecoveryStepNum);
            this.halfOpenRecoveryStepNum = halfOpenRecoveryStepNum;
            return this;
        }

        /**
         * MaxAllowedRtMs.
         */
        public Builder maxAllowedRtMs(Integer maxAllowedRtMs) {
            this.putQueryParameter("MaxAllowedRtMs", maxAllowedRtMs);
            this.maxAllowedRtMs = maxAllowedRtMs;
            return this;
        }

        /**
         * MinRequestAmount.
         */
        public Builder minRequestAmount(Integer minRequestAmount) {
            this.putQueryParameter("MinRequestAmount", minRequestAmount);
            this.minRequestAmount = minRequestAmount;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * RetryTimeoutMs.
         */
        public Builder retryTimeoutMs(Integer retryTimeoutMs) {
            this.putQueryParameter("RetryTimeoutMs", retryTimeoutMs);
            this.retryTimeoutMs = retryTimeoutMs;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * StatIntervalMs.
         */
        public Builder statIntervalMs(Integer statIntervalMs) {
            this.putQueryParameter("StatIntervalMs", statIntervalMs);
            this.statIntervalMs = statIntervalMs;
            return this;
        }

        /**
         * Strategy.
         */
        public Builder strategy(Integer strategy) {
            this.putQueryParameter("Strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        /**
         * Threshold.
         */
        public Builder threshold(Float threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        @Override
        public UpdateCircuitBreakerRuleRequest build() {
            return new UpdateCircuitBreakerRuleRequest(this);
        } 

    } 

}
