// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PositionStructBody} extends {@link TeaModel}
 *
 * <p>PositionStructBody</p>
 */
public class PositionStructBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCount")
    private String errorCount;

    @com.aliyun.core.annotation.NameInMap("Height")
    private String height;

    @com.aliyun.core.annotation.NameInMap("Index")
    private String index;

    @com.aliyun.core.annotation.NameInMap("LastError")
    private String lastError;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private PositionStructBody(Builder builder) {
        this.errorCount = builder.errorCount;
        this.height = builder.height;
        this.index = builder.index;
        this.lastError = builder.lastError;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PositionStructBody create() {
        return builder().build();
    }

    /**
     * @return errorCount
     */
    public String getErrorCount() {
        return this.errorCount;
    }

    /**
     * @return height
     */
    public String getHeight() {
        return this.height;
    }

    /**
     * @return index
     */
    public String getIndex() {
        return this.index;
    }

    /**
     * @return lastError
     */
    public String getLastError() {
        return this.lastError;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String errorCount; 
        private String height; 
        private String index; 
        private String lastError; 
        private String type; 

        /**
         * ErrorCount.
         */
        public Builder errorCount(String errorCount) {
            this.errorCount = errorCount;
            return this;
        }

        /**
         * Height.
         */
        public Builder height(String height) {
            this.height = height;
            return this;
        }

        /**
         * Index.
         */
        public Builder index(String index) {
            this.index = index;
            return this;
        }

        /**
         * LastError.
         */
        public Builder lastError(String lastError) {
            this.lastError = lastError;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public PositionStructBody build() {
            return new PositionStructBody(this);
        } 

    } 

}
