// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetActivityListResponseBody} extends {@link TeaModel}
 *
 * <p>GetActivityListResponseBody</p>
 */
public class GetActivityListResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    @NameInMap("vendorRequestId")
    private String vendorRequestId;

    @NameInMap("vendorType")
    private String vendorType;

    private GetActivityListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetActivityListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetActivityListResponseBody build() {
            return new GetActivityListResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("ActivityId")
        private String activityId;

        @NameInMap("ActivityName")
        private String activityName;

        @NameInMap("ActivityNameInEnglish")
        private String activityNameInEnglish;

        private Result(Builder builder) {
            this.activityId = builder.activityId;
            this.activityName = builder.activityName;
            this.activityNameInEnglish = builder.activityNameInEnglish;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return activityId
         */
        public String getActivityId() {
            return this.activityId;
        }

        /**
         * @return activityName
         */
        public String getActivityName() {
            return this.activityName;
        }

        /**
         * @return activityNameInEnglish
         */
        public String getActivityNameInEnglish() {
            return this.activityNameInEnglish;
        }

        public static final class Builder {
            private String activityId; 
            private String activityName; 
            private String activityNameInEnglish; 

            /**
             * ActivityId.
             */
            public Builder activityId(String activityId) {
                this.activityId = activityId;
                return this;
            }

            /**
             * ActivityName.
             */
            public Builder activityName(String activityName) {
                this.activityName = activityName;
                return this;
            }

            /**
             * ActivityNameInEnglish.
             */
            public Builder activityNameInEnglish(String activityNameInEnglish) {
                this.activityNameInEnglish = activityNameInEnglish;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
