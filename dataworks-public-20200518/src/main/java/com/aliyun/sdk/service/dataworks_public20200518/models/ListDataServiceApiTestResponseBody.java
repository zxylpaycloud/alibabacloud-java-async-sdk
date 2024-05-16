// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataServiceApiTestResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataServiceApiTestResponseBody</p>
 */
public class ListDataServiceApiTestResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDataServiceApiTestResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataServiceApiTestResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * The list of test records.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDataServiceApiTestResponseBody build() {
            return new ListDataServiceApiTestResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private Long apiId;

        @com.aliyun.core.annotation.NameInMap("CostTime")
        private Integer costTime;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("ParamMap")
        private String paramMap;

        @com.aliyun.core.annotation.NameInMap("RetCode")
        private Long retCode;

        @com.aliyun.core.annotation.NameInMap("RetResult")
        private String retResult;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TestId")
        private Long testId;

        private Data(Builder builder) {
            this.apiId = builder.apiId;
            this.costTime = builder.costTime;
            this.createTime = builder.createTime;
            this.paramMap = builder.paramMap;
            this.retCode = builder.retCode;
            this.retResult = builder.retResult;
            this.status = builder.status;
            this.testId = builder.testId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public Long getApiId() {
            return this.apiId;
        }

        /**
         * @return costTime
         */
        public Integer getCostTime() {
            return this.costTime;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return paramMap
         */
        public String getParamMap() {
            return this.paramMap;
        }

        /**
         * @return retCode
         */
        public Long getRetCode() {
            return this.retCode;
        }

        /**
         * @return retResult
         */
        public String getRetResult() {
            return this.retResult;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return testId
         */
        public Long getTestId() {
            return this.testId;
        }

        public static final class Builder {
            private Long apiId; 
            private Integer costTime; 
            private Long createTime; 
            private String paramMap; 
            private Long retCode; 
            private String retResult; 
            private String status; 
            private Long testId; 

            /**
             * The ID of the DataService Studio API on which the test is performed.
             */
            public Builder apiId(Long apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * The time that is consumed to complete the test.
             */
            public Builder costTime(Integer costTime) {
                this.costTime = costTime;
                return this;
            }

            /**
             * The time when the test was initiated.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The request parameters configured for the test.
             */
            public Builder paramMap(String paramMap) {
                this.paramMap = paramMap;
                return this;
            }

            /**
             * The status code returned for the test. If the test is not complete, this parameter is not returned.
             */
            public Builder retCode(Long retCode) {
                this.retCode = retCode;
                return this;
            }

            /**
             * The result returned for the test.
             */
            public Builder retResult(String retResult) {
                this.retResult = retResult;
                return this;
            }

            /**
             * The status of the test. Valid values: RUNNING and FINISHED.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the test.
             */
            public Builder testId(Long testId) {
                this.testId = testId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
