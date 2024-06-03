// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AckNodeSelector} extends {@link TeaModel}
 *
 * <p>AckNodeSelector</p>
 */
public class AckNodeSelector extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List < Labels> labels;

    @com.aliyun.core.annotation.NameInMap("Taints")
    private java.util.List < Taints> taints;

    private AckNodeSelector(Builder builder) {
        this.labels = builder.labels;
        this.taints = builder.taints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AckNodeSelector create() {
        return builder().build();
    }

    /**
     * @return labels
     */
    public java.util.List < Labels> getLabels() {
        return this.labels;
    }

    /**
     * @return taints
     */
    public java.util.List < Taints> getTaints() {
        return this.taints;
    }

    public static final class Builder {
        private java.util.List < Labels> labels; 
        private java.util.List < Taints> taints; 

        /**
         * 污点列表。
         */
        public Builder labels(java.util.List < Labels> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * 污点列表。
         */
        public Builder taints(java.util.List < Taints> taints) {
            this.taints = taints;
            return this;
        }

        public AckNodeSelector build() {
            return new AckNodeSelector(this);
        } 

    } 

    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * 标签键。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 标签值。
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    public static class Taints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Effect")
        private String effect;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Taints(Builder builder) {
            this.effect = builder.effect;
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Taints create() {
            return builder().build();
        }

        /**
         * @return effect
         */
        public String getEffect() {
            return this.effect;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String effect; 
            private String key; 
            private String value; 

            /**
             * 污点效果。
             */
            public Builder effect(String effect) {
                this.effect = effect;
                return this;
            }

            /**
             * 污点键。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 污点值。
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Taints build() {
                return new Taints(this);
            } 

        } 

    }
}
