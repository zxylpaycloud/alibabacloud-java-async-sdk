// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeCheckCustomConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ChangeCheckCustomConfigResponseBody</p>
 */
public class ChangeCheckCustomConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IllegalCustomConfigs")
    private java.util.List < IllegalCustomConfigs> illegalCustomConfigs;

    @com.aliyun.core.annotation.NameInMap("IllegalRepairConfigs")
    private java.util.List < IllegalRepairConfigs> illegalRepairConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ChangeCheckCustomConfigResponseBody(Builder builder) {
        this.illegalCustomConfigs = builder.illegalCustomConfigs;
        this.illegalRepairConfigs = builder.illegalRepairConfigs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeCheckCustomConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return illegalCustomConfigs
     */
    public java.util.List < IllegalCustomConfigs> getIllegalCustomConfigs() {
        return this.illegalCustomConfigs;
    }

    /**
     * @return illegalRepairConfigs
     */
    public java.util.List < IllegalRepairConfigs> getIllegalRepairConfigs() {
        return this.illegalRepairConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < IllegalCustomConfigs> illegalCustomConfigs; 
        private java.util.List < IllegalRepairConfigs> illegalRepairConfigs; 
        private String requestId; 

        /**
         * An array that consists of the invalid custom configuration items of the check item.
         */
        public Builder illegalCustomConfigs(java.util.List < IllegalCustomConfigs> illegalCustomConfigs) {
            this.illegalCustomConfigs = illegalCustomConfigs;
            return this;
        }

        /**
         * IllegalRepairConfigs.
         */
        public Builder illegalRepairConfigs(java.util.List < IllegalRepairConfigs> illegalRepairConfigs) {
            this.illegalRepairConfigs = illegalRepairConfigs;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ChangeCheckCustomConfigResponseBody build() {
            return new ChangeCheckCustomConfigResponseBody(this);
        } 

    } 

    public static class IllegalCustomConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private IllegalCustomConfigs(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IllegalCustomConfigs create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            /**
             * The name of the custom configuration item. The name of a custom configuration item is unique in a check item.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public IllegalCustomConfigs build() {
                return new IllegalCustomConfigs(this);
            } 

        } 

    }
    public static class IllegalRepairConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private IllegalRepairConfigs(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IllegalRepairConfigs create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            /**
             * The name of the custom configuration item. The name of a custom configuration item is unique in a check item.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public IllegalRepairConfigs build() {
                return new IllegalRepairConfigs(this);
            } 

        } 

    }
}
