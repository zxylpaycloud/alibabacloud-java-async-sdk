// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventLevelCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventLevelCountResponseBody</p>
 */
public class DescribeEventLevelCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("EventLevels")
    private EventLevels eventLevels;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeEventLevelCountResponseBody(Builder builder) {
        this.code = builder.code;
        this.eventLevels = builder.eventLevels;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventLevelCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return eventLevels
     */
    public EventLevels getEventLevels() {
        return this.eventLevels;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String code; 
        private EventLevels eventLevels; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The statistics of alerts by risk level.
         */
        public Builder eventLevels(EventLevels eventLevels) {
            this.eventLevels = eventLevels;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeEventLevelCountResponseBody build() {
            return new DescribeEventLevelCountResponseBody(this);
        } 

    } 

    public static class EventLevels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Remind")
        private Integer remind;

        @com.aliyun.core.annotation.NameInMap("Serious")
        private Integer serious;

        @com.aliyun.core.annotation.NameInMap("Suspicious")
        private Integer suspicious;

        private EventLevels(Builder builder) {
            this.remind = builder.remind;
            this.serious = builder.serious;
            this.suspicious = builder.suspicious;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventLevels create() {
            return builder().build();
        }

        /**
         * @return remind
         */
        public Integer getRemind() {
            return this.remind;
        }

        /**
         * @return serious
         */
        public Integer getSerious() {
            return this.serious;
        }

        /**
         * @return suspicious
         */
        public Integer getSuspicious() {
            return this.suspicious;
        }

        public static final class Builder {
            private Integer remind; 
            private Integer serious; 
            private Integer suspicious; 

            /**
             * The number of alerts whose Emergency level is Reminder.
             */
            public Builder remind(Integer remind) {
                this.remind = remind;
                return this;
            }

            /**
             * The number of alerts whose Emergency level is Urgent.
             */
            public Builder serious(Integer serious) {
                this.serious = serious;
                return this;
            }

            /**
             * The number of alerts whose Emergency level is Suspicious.
             */
            public Builder suspicious(Integer suspicious) {
                this.suspicious = suspicious;
                return this;
            }

            public EventLevels build() {
                return new EventLevels(this);
            } 

        } 

    }
}
