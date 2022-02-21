// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDevicePurifyJobByJobIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetDevicePurifyJobByJobIdResponseBody</p>
 */
public class GetDevicePurifyJobByJobIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetDevicePurifyJobByJobIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDevicePurifyJobByJobIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDevicePurifyJobByJobIdResponseBody build() {
            return new GetDevicePurifyJobByJobIdResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("PlanId")
        private String planId;

        @NameInMap("ProductKey")
        private String productKey;

        @NameInMap("PurifyRecordIndexUrl")
        private String purifyRecordIndexUrl;

        @NameInMap("PurifyRecordNameUrl")
        private String purifyRecordNameUrl;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("UserId")
        private String userId;

        private Data(Builder builder) {
            this.deviceName = builder.deviceName;
            this.endTime = builder.endTime;
            this.iotId = builder.iotId;
            this.jobId = builder.jobId;
            this.planId = builder.planId;
            this.productKey = builder.productKey;
            this.purifyRecordIndexUrl = builder.purifyRecordIndexUrl;
            this.purifyRecordNameUrl = builder.purifyRecordNameUrl;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.tenantId = builder.tenantId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return planId
         */
        public String getPlanId() {
            return this.planId;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return purifyRecordIndexUrl
         */
        public String getPurifyRecordIndexUrl() {
            return this.purifyRecordIndexUrl;
        }

        /**
         * @return purifyRecordNameUrl
         */
        public String getPurifyRecordNameUrl() {
            return this.purifyRecordNameUrl;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String deviceName; 
            private Long endTime; 
            private String iotId; 
            private String jobId; 
            private String planId; 
            private String productKey; 
            private String purifyRecordIndexUrl; 
            private String purifyRecordNameUrl; 
            private Long startTime; 
            private Integer status; 
            private String tenantId; 
            private String userId; 

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * PlanId.
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * PurifyRecordIndexUrl.
             */
            public Builder purifyRecordIndexUrl(String purifyRecordIndexUrl) {
                this.purifyRecordIndexUrl = purifyRecordIndexUrl;
                return this;
            }

            /**
             * PurifyRecordNameUrl.
             */
            public Builder purifyRecordNameUrl(String purifyRecordNameUrl) {
                this.purifyRecordNameUrl = purifyRecordNameUrl;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
