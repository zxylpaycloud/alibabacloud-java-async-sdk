// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStrategyTargetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStrategyTargetResponseBody</p>
 */
public class DescribeStrategyTargetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StrategyTargets")
    private java.util.List < StrategyTargets> strategyTargets;

    private DescribeStrategyTargetResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.strategyTargets = builder.strategyTargets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStrategyTargetResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return strategyTargets
     */
    public java.util.List < StrategyTargets> getStrategyTargets() {
        return this.strategyTargets;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < StrategyTargets> strategyTargets; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the assets to which the baseline check policy is applied.
         */
        public Builder strategyTargets(java.util.List < StrategyTargets> strategyTargets) {
            this.strategyTargets = strategyTargets;
            return this;
        }

        public DescribeStrategyTargetResponseBody build() {
            return new DescribeStrategyTargetResponseBody(this);
        } 

    } 

    public static class StrategyTargets extends TeaModel {
        @NameInMap("BindUuidCount")
        private Integer bindUuidCount;

        @NameInMap("Flag")
        private String flag;

        @NameInMap("Target")
        private String target;

        @NameInMap("TargetType")
        private String targetType;

        private StrategyTargets(Builder builder) {
            this.bindUuidCount = builder.bindUuidCount;
            this.flag = builder.flag;
            this.target = builder.target;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StrategyTargets create() {
            return builder().build();
        }

        /**
         * @return bindUuidCount
         */
        public Integer getBindUuidCount() {
            return this.bindUuidCount;
        }

        /**
         * @return flag
         */
        public String getFlag() {
            return this.flag;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private Integer bindUuidCount; 
            private String flag; 
            private String target; 
            private String targetType; 

            /**
             * The number of the assets that belong to the asset group.
             */
            public Builder bindUuidCount(Integer bindUuidCount) {
                this.bindUuidCount = bindUuidCount;
                return this;
            }

            /**
             * Indicates whether the baseline check policy is applied to the asset group. Valid values:
             * <p>
             * 
             * *   **add**: The baseline check policy is applied to the asset group.
             * *   **del**: the baseline check policy is not applied to the asset group.
             */
            public Builder flag(String flag) {
                this.flag = flag;
                return this;
            }

            /**
             * The ID of the asset group to which the assets belong or the UUID of the asset.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * The method that is used to add the assets to the baseline check policy. Valid values:
             * <p>
             * 
             * *   **groupId**: the ID of the asset group
             * *   **uuid**: the UUID of the asset
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public StrategyTargets build() {
                return new StrategyTargets(this);
            } 

        } 

    }
}
