// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSourceLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSourceLogsResponseBody</p>
 */
public class ListDataSourceLogsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ListDataSourceLogsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourceLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDataSourceLogsResponseBody build() {
            return new ListDataSourceLogsResponseBody(this);
        } 

    } 

    public static class LogParams extends TeaModel {
        @NameInMap("ParaCode")
        private String paraCode;

        @NameInMap("ParaValue")
        private String paraValue;

        private LogParams(Builder builder) {
            this.paraCode = builder.paraCode;
            this.paraValue = builder.paraValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogParams create() {
            return builder().build();
        }

        /**
         * @return paraCode
         */
        public String getParaCode() {
            return this.paraCode;
        }

        /**
         * @return paraValue
         */
        public String getParaValue() {
            return this.paraValue;
        }

        public static final class Builder {
            private String paraCode; 
            private String paraValue; 

            /**
             * ParaCode.
             */
            public Builder paraCode(String paraCode) {
                this.paraCode = paraCode;
                return this;
            }

            /**
             * ParaValue.
             */
            public Builder paraValue(String paraValue) {
                this.paraValue = paraValue;
                return this;
            }

            public LogParams build() {
                return new LogParams(this);
            } 

        } 

    }
    public static class DataSourceInstanceLogs extends TeaModel {
        @NameInMap("LogCode")
        private String logCode;

        @NameInMap("LogInstanceId")
        private String logInstanceId;

        @NameInMap("LogMdsCode")
        private String logMdsCode;

        @NameInMap("LogParams")
        private java.util.List < LogParams> logParams;

        @NameInMap("TaskStatus")
        private Integer taskStatus;

        private DataSourceInstanceLogs(Builder builder) {
            this.logCode = builder.logCode;
            this.logInstanceId = builder.logInstanceId;
            this.logMdsCode = builder.logMdsCode;
            this.logParams = builder.logParams;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceInstanceLogs create() {
            return builder().build();
        }

        /**
         * @return logCode
         */
        public String getLogCode() {
            return this.logCode;
        }

        /**
         * @return logInstanceId
         */
        public String getLogInstanceId() {
            return this.logInstanceId;
        }

        /**
         * @return logMdsCode
         */
        public String getLogMdsCode() {
            return this.logMdsCode;
        }

        /**
         * @return logParams
         */
        public java.util.List < LogParams> getLogParams() {
            return this.logParams;
        }

        /**
         * @return taskStatus
         */
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private String logCode; 
            private String logInstanceId; 
            private String logMdsCode; 
            private java.util.List < LogParams> logParams; 
            private Integer taskStatus; 

            /**
             * LogCode.
             */
            public Builder logCode(String logCode) {
                this.logCode = logCode;
                return this;
            }

            /**
             * LogInstanceId.
             */
            public Builder logInstanceId(String logInstanceId) {
                this.logInstanceId = logInstanceId;
                return this;
            }

            /**
             * LogMdsCode.
             */
            public Builder logMdsCode(String logMdsCode) {
                this.logMdsCode = logMdsCode;
                return this;
            }

            /**
             * LogParams.
             */
            public Builder logParams(java.util.List < LogParams> logParams) {
                this.logParams = logParams;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(Integer taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public DataSourceInstanceLogs build() {
                return new DataSourceInstanceLogs(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("CloudCode")
        private String cloudCode;

        @NameInMap("DataSourceInstanceId")
        private String dataSourceInstanceId;

        @NameInMap("DataSourceInstanceLogs")
        private java.util.List < DataSourceInstanceLogs> dataSourceInstanceLogs;

        @NameInMap("DataSourceInstanceName")
        private String dataSourceInstanceName;

        @NameInMap("DataSourceInstanceRemark")
        private String dataSourceInstanceRemark;

        @NameInMap("SubUserId")
        private Long subUserId;

        private Data(Builder builder) {
            this.accountId = builder.accountId;
            this.cloudCode = builder.cloudCode;
            this.dataSourceInstanceId = builder.dataSourceInstanceId;
            this.dataSourceInstanceLogs = builder.dataSourceInstanceLogs;
            this.dataSourceInstanceName = builder.dataSourceInstanceName;
            this.dataSourceInstanceRemark = builder.dataSourceInstanceRemark;
            this.subUserId = builder.subUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return cloudCode
         */
        public String getCloudCode() {
            return this.cloudCode;
        }

        /**
         * @return dataSourceInstanceId
         */
        public String getDataSourceInstanceId() {
            return this.dataSourceInstanceId;
        }

        /**
         * @return dataSourceInstanceLogs
         */
        public java.util.List < DataSourceInstanceLogs> getDataSourceInstanceLogs() {
            return this.dataSourceInstanceLogs;
        }

        /**
         * @return dataSourceInstanceName
         */
        public String getDataSourceInstanceName() {
            return this.dataSourceInstanceName;
        }

        /**
         * @return dataSourceInstanceRemark
         */
        public String getDataSourceInstanceRemark() {
            return this.dataSourceInstanceRemark;
        }

        /**
         * @return subUserId
         */
        public Long getSubUserId() {
            return this.subUserId;
        }

        public static final class Builder {
            private String accountId; 
            private String cloudCode; 
            private String dataSourceInstanceId; 
            private java.util.List < DataSourceInstanceLogs> dataSourceInstanceLogs; 
            private String dataSourceInstanceName; 
            private String dataSourceInstanceRemark; 
            private Long subUserId; 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * CloudCode.
             */
            public Builder cloudCode(String cloudCode) {
                this.cloudCode = cloudCode;
                return this;
            }

            /**
             * DataSourceInstanceId.
             */
            public Builder dataSourceInstanceId(String dataSourceInstanceId) {
                this.dataSourceInstanceId = dataSourceInstanceId;
                return this;
            }

            /**
             * DataSourceInstanceLogs.
             */
            public Builder dataSourceInstanceLogs(java.util.List < DataSourceInstanceLogs> dataSourceInstanceLogs) {
                this.dataSourceInstanceLogs = dataSourceInstanceLogs;
                return this;
            }

            /**
             * DataSourceInstanceName.
             */
            public Builder dataSourceInstanceName(String dataSourceInstanceName) {
                this.dataSourceInstanceName = dataSourceInstanceName;
                return this;
            }

            /**
             * DataSourceInstanceRemark.
             */
            public Builder dataSourceInstanceRemark(String dataSourceInstanceRemark) {
                this.dataSourceInstanceRemark = dataSourceInstanceRemark;
                return this;
            }

            /**
             * SubUserId.
             */
            public Builder subUserId(Long subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
