// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCustomFieldOptionResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomFieldOptionResponseBody</p>
 */
public class GetCustomFieldOptionResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMsg")
    private String errorMsg;

    @NameInMap("fileds")
    private java.util.List < Fileds> fileds;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private GetCustomFieldOptionResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.fileds = builder.fileds;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomFieldOptionResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return fileds
     */
    public java.util.List < Fileds> getFileds() {
        return this.fileds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private java.util.List < Fileds> fileds; 
        private String requestId; 
        private Boolean success; 

        /**
         * 错误码
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * 字段值信息
         */
        public Builder fileds(java.util.List < Fileds> fileds) {
            this.fileds = fileds;
            return this;
        }

        /**
         * 请求id，每次请求都是唯一值，便于后续排查问题
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * true或者false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetCustomFieldOptionResponseBody build() {
            return new GetCustomFieldOptionResponseBody(this);
        } 

    } 

    public static class Fileds extends TeaModel {
        @NameInMap("displayValue")
        private String displayValue;

        @NameInMap("fieldIdentifier")
        private String fieldIdentifier;

        @NameInMap("identifier")
        private String identifier;

        @NameInMap("level")
        private Long level;

        @NameInMap("position")
        private Long position;

        @NameInMap("value")
        private String value;

        @NameInMap("valueEn")
        private String valueEn;

        private Fileds(Builder builder) {
            this.displayValue = builder.displayValue;
            this.fieldIdentifier = builder.fieldIdentifier;
            this.identifier = builder.identifier;
            this.level = builder.level;
            this.position = builder.position;
            this.value = builder.value;
            this.valueEn = builder.valueEn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fileds create() {
            return builder().build();
        }

        /**
         * @return displayValue
         */
        public String getDisplayValue() {
            return this.displayValue;
        }

        /**
         * @return fieldIdentifier
         */
        public String getFieldIdentifier() {
            return this.fieldIdentifier;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return level
         */
        public Long getLevel() {
            return this.level;
        }

        /**
         * @return position
         */
        public Long getPosition() {
            return this.position;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueEn
         */
        public String getValueEn() {
            return this.valueEn;
        }

        public static final class Builder {
            private String displayValue; 
            private String fieldIdentifier; 
            private String identifier; 
            private Long level; 
            private Long position; 
            private String value; 
            private String valueEn; 

            /**
             * 展示的值
             */
            public Builder displayValue(String displayValue) {
                this.displayValue = displayValue;
                return this;
            }

            /**
             * 字段唯一标识
             */
            public Builder fieldIdentifier(String fieldIdentifier) {
                this.fieldIdentifier = fieldIdentifier;
                return this;
            }

            /**
             * 迭代唯一标识符
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * 展示级别，数字范围1~9，数字越大，颜色越浅
             */
            public Builder level(Long level) {
                this.level = level;
                return this;
            }

            /**
             * 待选值顺序
             */
            public Builder position(Long position) {
                this.position = position;
                return this;
            }

            /**
             * 字段中文名称
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * 字段英文名称
             */
            public Builder valueEn(String valueEn) {
                this.valueEn = valueEn;
                return this;
            }

            public Fileds build() {
                return new Fileds(this);
            } 

        } 

    }
}
