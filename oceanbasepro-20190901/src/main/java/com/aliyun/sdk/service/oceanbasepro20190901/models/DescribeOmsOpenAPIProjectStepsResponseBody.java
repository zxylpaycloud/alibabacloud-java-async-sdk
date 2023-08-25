// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOmsOpenAPIProjectStepsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOmsOpenAPIProjectStepsResponseBody</p>
 */
public class DescribeOmsOpenAPIProjectStepsResponseBody extends TeaModel {
    @NameInMap("Advice")
    private String advice;

    @NameInMap("Code")
    private String code;

    @NameInMap("Cost")
    private String cost;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorDetail")
    private ErrorDetail errorDetail;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeOmsOpenAPIProjectStepsResponseBody(Builder builder) {
        this.advice = builder.advice;
        this.code = builder.code;
        this.cost = builder.cost;
        this.data = builder.data;
        this.errorDetail = builder.errorDetail;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOmsOpenAPIProjectStepsResponseBody create() {
        return builder().build();
    }

    /**
     * @return advice
     */
    public String getAdvice() {
        return this.advice;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return cost
     */
    public String getCost() {
        return this.cost;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorDetail
     */
    public ErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String advice; 
        private String code; 
        private String cost; 
        private java.util.List < Data> data; 
        private ErrorDetail errorDetail; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * The error related parameters.
         */
        public Builder advice(String advice) {
            this.advice = advice;
            return this;
        }

        /**
         * The error code (old), such as AUTHENTICATION_ERROR, PARAM_ERROR, PARAM_ERROR_MESSAGE, NOT_IMPLEMENTED_ERROR, SHARD_COLUMNS_CONFLICT_MESSAGE, FAILED_PARSE_TOKEN_MESSAGE, CONNECT_CHECK_ERROR, NOT_SUPPORT_ERROR, CE_NOT_SUPPORT_ERROR, NOT_FOUND_ERROR, SHARDING_COLUMN_NOT_INCLUDED_ERROR, INNER_ERROR, DB_QUERY_ERROR, DATAHUB_QUERY_ERROR, USER_LACK_SYS_PRIV_ERROR, USER_LACK_TABLE_PRIV_ERROR, RM_API_ERROR, RM_TASK_ERROR, CM_API_ERROR, CM_API_NOT_SUCCESS, BAGUALU_API_ERROR, IDB_API_ERROR, SUPERVISOR_API_ERROR, OCP_API_ERROR, OCP_SERVICE_ERROR, OCP_QUERY_VERSION_FAILED, OCP_VERSION_INCORRECT_ERROR, OCP_VERSION_NOT_SUPPORTED_ERROR, OCP_API_USER_PASSWORD_INCORRECT_ERROR, OBSCHEMA_ERROR, EXECUTOR_THREAD_POOL_BUSY, NO_TABLE_SELECTED, NO_VIEW_SELECTED, SOURCE_CRAWLER_START_FAILED, SOURCE_CRAWLER_START_FAILED_DATA_EXPIRED, SOURCE_CRAWLER_START_TIMEOUT, DEST_WRITER_START_FAILED, WRITER_UNKNOWN_STATUS, DRC_TOPIC_EXISTS_ERROR, TOPIC_EMPTY_ERROR, REACH_WRITER_LIMIT_ERROR, FOUND_NO_FEASIBLE_STORE_ERROR, TOO_MANY_STORES_FOR_SUBTOPIC, TIMEOUT_EXCEPTION, KIPP_API_ERROR, KIPP_API_RESOURCE_NOT_FOUND, KIPP_API_INVALID_PARAM, KIPP_API_UNKNOWN_ERROR, KIPP_API_INTERNAL_ERROR, KIPP_API_SERVICE_UNAVAILABLE, OMS_AGENT_API_ERROR, KMS_API_ERROR, OMS_ENCRYPT_API_ERROR, OMS_DECRYPT_API_ERROR, ALIYUN_SDK_ERROR, YAOCHI_API_ERROR, RESOURCE_WITHOUT_STOCK_ERROR, RESOURCE_NO_AVAILABLE_ZONE, CM_SDK_ERROR, MIGRATION_PROJECT_STEP_PRECHECK_FAILED, PRE_CHECK_ERROR, FAILURES_CORRECT_ERROR, EXECUTE_DDL_FAILURE, EXECUTE_DDL_UNSUPPORTED_OR_FAILURE, STRUCT_RECORD_DDL_NOT_FOUND, STRUCT_RECORD_INDEX_NOT_FOUND, STRUCT_RECORD_NOT_FOUND, STRUCT_RECORD_NOT_FOUND_IN_DBCAT, SCHEMA_OBJECT_TYPE_NOT_SUPPORT_ERROR, POLAR_MYSQL_NETWORK_TYPE_NOT_SUPPORT_ERROR, RDS_NETWORK_TYPE_NOT_SUPPORT_ERROR, RDS_VPC_NETWORK_NOT_SUPPORT_ERROR, DB_TYPE_NOT_SUPPORT_ERROR, SYNC_TYPE_NOT_SUPPORT_ERROR, SLAVE_OPERATION_STEP_NOT_SUPPORT_ERROR, BYTE_USED_TYPE_NOT_SUPPORT_ERROR, MANY_TO_ONE_SCHEMA_TABLE_REVERSE_INCR_NOT_SUPPORT_ERROR, DUPLICATE_SCHEMA_TABLE_ERROR, OMS_STEP_NOT_SUPPORT_ERROR, ORACLE_DATABASE_ROLE_NOT_SUPPORT_ERROR, OLD_PRE_CHECK_NOT_SUPPORT_ERROR, SCHEMA_ONE_TO_MANY_NOT_SUPPORT_ERROR, PROJECT_NOT_FOUND_ERROR, ENDPOINT_NOT_FOUND_ERROR, ENDPOINT_NAME_ALREADY_EXIST_ERROR, ENDPOINT_QUERY_ERROR, ENDPOINT_SQL_QUERY_ERROR, PROJECT_NAME_ALREADY_EXIST_ERROR, CHECKER_NOT_FOUND_ERROR, CHECKER_FAILED_ERROR, CHECKER_STATUS_UNEXPECTED_ERROR, CHECKER_NO_TASK_TYPE_ERROR, WORKER_INSTANCE_NOT_FOUND_ERROR, WORKER_INSTANCE_ALLOCATING_ERROR, LOG_SERVICE_TOPIC_NOT_FOUND_ERROR, CLUSTER_NOT_FOUND_ERROR, TENANT_NOT_FOUND_ERROR, DATABASE_NOT_FOUND_ERROR, TABLE_NOT_FOUND_ERROR, COLUMN_NOT_FOUND_ERROR, TABLE_META_NOT_FOUND_ERROR, SYBASE_CHARSET_NOT_FOUND_ERROR, OCP_NOT_FOUND_ERROR, REGION_NOT_FOUND_ERROR, OCP_ALREADY_EXIST_ERROR, ALARM_CHANNEL_NAME_ALREADY_EXIST_ERROR, SEND_MARKDOWN_TEXT_TO_WEBHOOK_FAILED_EXCEPTION_RESPONSE, SEND_MARKDOWN_TEXT_TO_WEBHOOK_FAILED_EXCEPTION_STATUS, LABEL_ALREADY_EXIST_ERROR, LABEL_NOT_EXIST_ERROR, OCP_ALREADY_USED_ERROR, REGION_INFO_INCONSISTENT_ERROR, OCP_NAME_EMPTY_ERROR, MASTER_SLAVE_ENDPOINT_NAME_INCONSISTENT_ERROR, LOG_FILE_NOT_FOUND_ERROR, OPERATION_NOT_ALLOWED_ERROR, PROJECT_OPERATION_NOT_ALLOWED_ERROR, PROJECT_RELEASE_FAILED, STRUCT_MIGRATION_RETRY_NOT_ALLOWED_ERROR, WORKER_INSTANCE_OPERATION_NOT_ALLOWED_ERROR, USER_OPERATION_NOT_ALLOWED_ERROR, OCP_NAME_OR_REGION_NOT_ALLOWED_UPDATE, UPDATE_CONFIG_WITH_NEWLINE_NOT_ALLOWED, EXIST_UNRELEASED_PROJECT_ERROR, EXIST_UNRELEASED_TOPIC_ERROR, LABEL_CREATE_NOT_ALLOWED_ERROR, LABEL_UPDATE_NOT_ALLOWED_ERROR, LABEL_DELETE_NOT_ALLOWED_ERROR, TOPIC_NAME_INVALID_ERROR, INVALID_STATUS_ERROR, INVALID_CSV_HEAD_ERROR, INVALID_CSV_BODY_ERROR, DUPLICATE_SCHEMA_TABLE_SETTING_ERROR, PROJECT_INVALID_STATUS_ERROR, PROJECT_INVALID_CONNECTOR_COUNT_ERROR, WORKER_INSTANCE_INVALID_STATUS_ERROR, LOG_SERVICE_INVALID_STATUS_ERROR, STEP_INVALID_STATUS_ERROR, UPDATE_ALLOW_DEST_TABLE_NOT_EMPTY_NOT_ALLOWED_ERROR, EXIST_INCONSISTENCY_ERROR, OMS_SWITCH_SUBSTEP_FAILED_ERROR, ENDPOINT_ID_INVALID_ERROR, DB_QUERY_VERSION_EMPTY_ERROR, ENDPOINT_NAME_INVALID_ERROR, ENDPOINT_SCHEMA_NOT_ALLOWED_ERROR, ENDPOINT_SCHEMA_CHAR_NOT_ALLOWED_ERROR, NAME_HAS_SPACE_EXCEPTION, CONFIG_CONVERT_VALUE_ERROR, CONFIG_VALUE_EXCEEDS_LIMIT_ERROR, CONFIG_KEY_NOT_FOUND_KEY_ERROR, CONFIG_VALUE_NOT_EMPTY_ERROR, SCHEMA_HAS_CONVERT_INFO, TIME_SERIES_QUERY_SERVICE_ERROR, ETL_VERIFY_ERROR, ETL_SYNTAX_UNSUPPORTED, ETL_FIELD_NOTFOUND, ETL_FAILED_PARSE_SQL, ETL_VAL_TYPE_ERROR, NOT_SUPPORT_GENERATE_COLUMNS, NOT_SUPPORT_UPDATE_ETL, LOCK_FAILED, OMS_USER_EXIST_ERROR, OMS_USER_NOT_FOUND_ERROR, OMS_USER_NAME_LENGTH_CONSTRAINT, OMS_USER_PASSWORD_ERROR, USER_NAME_OR_PASSWORD_ERROR, OMS_USER_PASSWORD_VALIDATION_ERROR, OMS_USER_PASSWORD_DEFAULT_ERROR, OMS_USER_PERMISSION_DENIED_ERROR, OMS_USER_EDIT_ADMIN_ROLE_INFO_PERMISSION_DENIED_ERROR, OMS_USER_ILLEGAL_DELETED_ERROR, CONNECTOR_TASK_NOT_FOUND_ERROR, CONNECTOR_TASK_NUM_LIMIT_ERROR, CONNECTOR_TASK_DELETE_ERROR, METRIC_SERVICE_ERROR, SYNC_PROJECT_TYPE_INVALID_ERROR, SYNC_SHARDING_COLUMNS_INVALID_ERROR, SYNC_PROJECT_PRODUCER_GROUP_INVALID_ERROR, SYNC_PROJECT_PRODUCER_GROUP_LIMIT_EXCEEDS_ERROR, SYNC_PROJECT_COMPLEMENT_CONFIG_ERROR, META_SCHEMA_CREATE_FAILED, RESUME_STEP_FAILED, SCHEMA_INCONSISTENCY, SCHEMA_CASCADE_MAPPING_NOT_SUPPORT_ERROR, SCHEMA_NOT_EXISTED, SCHEMA_EXISTED, SCHEMA_NOT_EXIST, BLACK_LIST_MATCH_ALL, BLACK_LIST_CONTAIN_NON_WHITE_SCHEMA, BLACK_WHITE_LIST_PARAM_INVALID_ERROR, OPERATOR_ERROR, OPERATOR_DIMENSION_NOT_SUPPORT, OPERATOR_PULL_LOG_ERROR, OPERATOR_UPDATE_CONFIG_NOT_SUPPORT, KAFKA_CREATE_TOPIC_ERROR, KAFKA_QUERY_TOPIC_ERROR, KAFKA_BUILD_PROPERTIES_ERROR, ROCKETMQ_CREATE_TOPIC_ERROR, ROCKETMQ_QUERY_TOPIC_ERROR, SYNC_OBJECT_EMPTY_ERROR, WRITER_NUMBER_NOT_UNIQUE, WRITER_NOT_ACTIVE, PROJECT_NAME_DUPLICATE_ERROR, EMPTY_FAILED_STRUCT_MIGRATION_TABLES_ERROR, LOGIC_TABLE_NOT_SUPPORT_UPDATE_OBJECT_ERROR, LOGIC_REQUEST_ERROR, LOGIC_DTO_BUILD_ERROR, UNEXPECTED_REMOTE_API_RESULT, OCEANBASE_USER_UNEXPECTED, STORE_CREATE_FAILED_ERROR, STORE_START_FAILED, STORE_NOT_PULL_LOG_ERROR, ALL_HOSTS_STATUS_ERROR, WORKER_ECS_NOT_FOUND_ERROR, WORKER_ECS_NOT_FOUND_FOR_USER_ERROR, WORKER_POD_NOT_FOUND_ERROR, WORKER_POD_NOT_FOUND_FOR_USER_ERROR, WORKER_INSTANCE_NOT_FOUND_ERROR_V2, and WORKER_INSTANCE_NOT_FOUND_FOR_USER_ERROR.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The step end time, in the format of "yyyy-MM-ddTHH:mm:ss".
         */
        public Builder cost(String cost) {
            this.cost = cost;
            return this;
        }

        /**
         * Indicates whether the current step must be confirmed by the user, rather than scheduled in the backend.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The step details. The value is a JSON string.
         */
        public Builder errorDetail(ErrorDetail errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }

        /**
         * A system error occurred.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The additional information. The value is a JSON string.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The step start time, in the format of "yyyy-MM-ddTHH:mm:ss".
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The time when the error occurred.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The read throughput baseline of the source data source.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The estimated remaining time. This parameter takes effect in full synchronization.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBody build() {
            return new DescribeOmsOpenAPIProjectStepsResponseBody(this);
        } 

    } 

    public static class ErrorDetails extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Level")
        private String level;

        @NameInMap("Message")
        private String message;

        @NameInMap("Proposal")
        private String proposal;

        private ErrorDetails(Builder builder) {
            this.code = builder.code;
            this.level = builder.level;
            this.message = builder.message;
            this.proposal = builder.proposal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorDetails create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return proposal
         */
        public String getProposal() {
            return this.proposal;
        }

        public static final class Builder {
            private String code; 
            private String level; 
            private String message; 
            private String proposal; 

            /**
             * The suggestions (old).
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Contact the administrator.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * A sub-status that indicates whether the checker has completed full verification.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The amount of data migrated.
             */
            public Builder proposal(String proposal) {
                this.proposal = proposal;
                return this;
            }

            public ErrorDetails build() {
                return new ErrorDetails(this);
            } 

        } 

    }
    public static class ExtraInfo extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorDetails")
        private java.util.List < ErrorDetails> errorDetails;

        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("ErrorParam")
        private java.util.Map < String, String > errorParam;

        @NameInMap("FailedTime")
        private String failedTime;

        private ExtraInfo(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorDetails = builder.errorDetails;
            this.errorMsg = builder.errorMsg;
            this.errorParam = builder.errorParam;
            this.failedTime = builder.failedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtraInfo create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorDetails
         */
        public java.util.List < ErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return errorParam
         */
        public java.util.Map < String, String > getErrorParam() {
            return this.errorParam;
        }

        /**
         * @return failedTime
         */
        public String getFailedTime() {
            return this.failedTime;
        }

        public static final class Builder {
            private String errorCode; 
            private java.util.List < ErrorDetails> errorDetails; 
            private String errorMsg; 
            private java.util.Map < String, String > errorParam; 
            private String failedTime; 

            /**
             * The job ID.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * Schema migration
             */
            public Builder errorDetails(java.util.List < ErrorDetails> errorDetails) {
                this.errorDetails = errorDetails;
                return this;
            }

            /**
             * The resource deployment ID.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * The error code (new).
             */
            public Builder errorParam(java.util.Map < String, String > errorParam) {
                this.errorParam = errorParam;
                return this;
            }

            /**
             * The additional information. The value is a JSON string.
             */
            public Builder failedTime(String failedTime) {
                this.failedTime = failedTime;
                return this;
            }

            public ExtraInfo build() {
                return new ExtraInfo(this);
            } 

        } 

    }
    public static class ConnectorFullProgressOverview extends TeaModel {
        @NameInMap("EstimatedRemainingTimeOfSec")
        private Long estimatedRemainingTimeOfSec;

        @NameInMap("EstimatedTotalCount")
        private Long estimatedTotalCount;

        @NameInMap("FinishedCount")
        private Long finishedCount;

        @NameInMap("Progress")
        private Integer progress;

        private ConnectorFullProgressOverview(Builder builder) {
            this.estimatedRemainingTimeOfSec = builder.estimatedRemainingTimeOfSec;
            this.estimatedTotalCount = builder.estimatedTotalCount;
            this.finishedCount = builder.finishedCount;
            this.progress = builder.progress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectorFullProgressOverview create() {
            return builder().build();
        }

        /**
         * @return estimatedRemainingTimeOfSec
         */
        public Long getEstimatedRemainingTimeOfSec() {
            return this.estimatedRemainingTimeOfSec;
        }

        /**
         * @return estimatedTotalCount
         */
        public Long getEstimatedTotalCount() {
            return this.estimatedTotalCount;
        }

        /**
         * @return finishedCount
         */
        public Long getFinishedCount() {
            return this.finishedCount;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        public static final class Builder {
            private Long estimatedRemainingTimeOfSec; 
            private Long estimatedTotalCount; 
            private Long finishedCount; 
            private Integer progress; 

            /**
             * A sub-status that indicates whether this step is skipped.
             */
            public Builder estimatedRemainingTimeOfSec(Long estimatedRemainingTimeOfSec) {
                this.estimatedRemainingTimeOfSec = estimatedRemainingTimeOfSec;
                return this;
            }

            /**
             * The read RPS baseline of the source data source.
             */
            public Builder estimatedTotalCount(Long estimatedTotalCount) {
                this.estimatedTotalCount = estimatedTotalCount;
                return this;
            }

            /**
             * The read/write RT per record of the destination data source, in ms.
             */
            public Builder finishedCount(Long finishedCount) {
                this.finishedCount = finishedCount;
                return this;
            }

            /**
             * The business data returned.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            public ConnectorFullProgressOverview build() {
                return new ConnectorFullProgressOverview(this);
            } 

        } 

    }
    public static class StepInfo extends TeaModel {
        @NameInMap("Capacity")
        private Long capacity;

        @NameInMap("Checkpoint")
        private String checkpoint;

        @NameInMap("ConnectorFullProgressOverview")
        private ConnectorFullProgressOverview connectorFullProgressOverview;

        @NameInMap("DeployId")
        private String deployId;

        @NameInMap("DstIops")
        private Long dstIops;

        @NameInMap("DstRps")
        private Long dstRps;

        @NameInMap("DstRpsRef")
        private Long dstRpsRef;

        @NameInMap("DstRt")
        private Long dstRt;

        @NameInMap("DstRtRef")
        private Long dstRtRef;

        @NameInMap("Gmt")
        private Long gmt;

        @NameInMap("Inconsistencies")
        private Long inconsistencies;

        @NameInMap("IncrTimestampCheckpoint")
        private Long incrTimestampCheckpoint;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("ProcessedRecords")
        private Long processedRecords;

        @NameInMap("Skipped")
        private Boolean skipped;

        @NameInMap("SrcIops")
        private Long srcIops;

        @NameInMap("SrcIopsRef")
        private Long srcIopsRef;

        @NameInMap("SrcRps")
        private Long srcRps;

        @NameInMap("SrcRpsRef")
        private Long srcRpsRef;

        @NameInMap("SrcRt")
        private Long srcRt;

        @NameInMap("SrcRtRef")
        private Long srcRtRef;

        @NameInMap("Validated")
        private Boolean validated;

        private StepInfo(Builder builder) {
            this.capacity = builder.capacity;
            this.checkpoint = builder.checkpoint;
            this.connectorFullProgressOverview = builder.connectorFullProgressOverview;
            this.deployId = builder.deployId;
            this.dstIops = builder.dstIops;
            this.dstRps = builder.dstRps;
            this.dstRpsRef = builder.dstRpsRef;
            this.dstRt = builder.dstRt;
            this.dstRtRef = builder.dstRtRef;
            this.gmt = builder.gmt;
            this.inconsistencies = builder.inconsistencies;
            this.incrTimestampCheckpoint = builder.incrTimestampCheckpoint;
            this.jobId = builder.jobId;
            this.processedRecords = builder.processedRecords;
            this.skipped = builder.skipped;
            this.srcIops = builder.srcIops;
            this.srcIopsRef = builder.srcIopsRef;
            this.srcRps = builder.srcRps;
            this.srcRpsRef = builder.srcRpsRef;
            this.srcRt = builder.srcRt;
            this.srcRtRef = builder.srcRtRef;
            this.validated = builder.validated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StepInfo create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public Long getCapacity() {
            return this.capacity;
        }

        /**
         * @return checkpoint
         */
        public String getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return connectorFullProgressOverview
         */
        public ConnectorFullProgressOverview getConnectorFullProgressOverview() {
            return this.connectorFullProgressOverview;
        }

        /**
         * @return deployId
         */
        public String getDeployId() {
            return this.deployId;
        }

        /**
         * @return dstIops
         */
        public Long getDstIops() {
            return this.dstIops;
        }

        /**
         * @return dstRps
         */
        public Long getDstRps() {
            return this.dstRps;
        }

        /**
         * @return dstRpsRef
         */
        public Long getDstRpsRef() {
            return this.dstRpsRef;
        }

        /**
         * @return dstRt
         */
        public Long getDstRt() {
            return this.dstRt;
        }

        /**
         * @return dstRtRef
         */
        public Long getDstRtRef() {
            return this.dstRtRef;
        }

        /**
         * @return gmt
         */
        public Long getGmt() {
            return this.gmt;
        }

        /**
         * @return inconsistencies
         */
        public Long getInconsistencies() {
            return this.inconsistencies;
        }

        /**
         * @return incrTimestampCheckpoint
         */
        public Long getIncrTimestampCheckpoint() {
            return this.incrTimestampCheckpoint;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return processedRecords
         */
        public Long getProcessedRecords() {
            return this.processedRecords;
        }

        /**
         * @return skipped
         */
        public Boolean getSkipped() {
            return this.skipped;
        }

        /**
         * @return srcIops
         */
        public Long getSrcIops() {
            return this.srcIops;
        }

        /**
         * @return srcIopsRef
         */
        public Long getSrcIopsRef() {
            return this.srcIopsRef;
        }

        /**
         * @return srcRps
         */
        public Long getSrcRps() {
            return this.srcRps;
        }

        /**
         * @return srcRpsRef
         */
        public Long getSrcRpsRef() {
            return this.srcRpsRef;
        }

        /**
         * @return srcRt
         */
        public Long getSrcRt() {
            return this.srcRt;
        }

        /**
         * @return srcRtRef
         */
        public Long getSrcRtRef() {
            return this.srcRtRef;
        }

        /**
         * @return validated
         */
        public Boolean getValidated() {
            return this.validated;
        }

        public static final class Builder {
            private Long capacity; 
            private String checkpoint; 
            private ConnectorFullProgressOverview connectorFullProgressOverview; 
            private String deployId; 
            private Long dstIops; 
            private Long dstRps; 
            private Long dstRpsRef; 
            private Long dstRt; 
            private Long dstRtRef; 
            private Long gmt; 
            private Long inconsistencies; 
            private Long incrTimestampCheckpoint; 
            private String jobId; 
            private Long processedRecords; 
            private Boolean skipped; 
            private Long srcIops; 
            private Long srcIopsRef; 
            private Long srcRps; 
            private Long srcRpsRef; 
            private Long srcRt; 
            private Long srcRtRef; 
            private Boolean validated; 

            /**
             * The total count, which takes effect in a pagination query.
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * The operation that you want to perform. Set the value to **DescribeOmsOpenAPIProjectSteps**.
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * The error code, such as AUTHENTICATION_ERROR, PARAM_ERROR, PARAM_ERROR_MESSAGE, NOT_IMPLEMENTED_ERROR, SHARD_COLUMNS_CONFLICT_MESSAGE, FAILED_PARSE_TOKEN_MESSAGE, CONNECT_CHECK_ERROR, NOT_SUPPORT_ERROR, CE_NOT_SUPPORT_ERROR, NOT_FOUND_ERROR, SHARDING_COLUMN_NOT_INCLUDED_ERROR, INNER_ERROR, DB_QUERY_ERROR, DATAHUB_QUERY_ERROR, USER_LACK_SYS_PRIV_ERROR, USER_LACK_TABLE_PRIV_ERROR, RM_API_ERROR, RM_TASK_ERROR, CM_API_ERROR, CM_API_NOT_SUCCESS, BAGUALU_API_ERROR, IDB_API_ERROR, SUPERVISOR_API_ERROR, OCP_API_ERROR, OCP_SERVICE_ERROR, OCP_QUERY_VERSION_FAILED, OCP_VERSION_INCORRECT_ERROR, OCP_VERSION_NOT_SUPPORTED_ERROR, OCP_API_USER_PASSWORD_INCORRECT_ERROR, OBSCHEMA_ERROR, EXECUTOR_THREAD_POOL_BUSY, NO_TABLE_SELECTED, NO_VIEW_SELECTED, SOURCE_CRAWLER_START_FAILED, SOURCE_CRAWLER_START_FAILED_DATA_EXPIRED, SOURCE_CRAWLER_START_TIMEOUT, DEST_WRITER_START_FAILED, WRITER_UNKNOWN_STATUS, DRC_TOPIC_EXISTS_ERROR, TOPIC_EMPTY_ERROR, REACH_WRITER_LIMIT_ERROR, FOUND_NO_FEASIBLE_STORE_ERROR, TOO_MANY_STORES_FOR_SUBTOPIC, TIMEOUT_EXCEPTION, KIPP_API_ERROR, KIPP_API_RESOURCE_NOT_FOUND, KIPP_API_INVALID_PARAM, KIPP_API_UNKNOWN_ERROR, KIPP_API_INTERNAL_ERROR, KIPP_API_SERVICE_UNAVAILABLE, OMS_AGENT_API_ERROR, KMS_API_ERROR, OMS_ENCRYPT_API_ERROR, OMS_DECRYPT_API_ERROR, ALIYUN_SDK_ERROR, YAOCHI_API_ERROR, RESOURCE_WITHOUT_STOCK_ERROR, RESOURCE_NO_AVAILABLE_ZONE, CM_SDK_ERROR, MIGRATION_PROJECT_STEP_PRECHECK_FAILED, PRE_CHECK_ERROR, FAILURES_CORRECT_ERROR, EXECUTE_DDL_FAILURE, EXECUTE_DDL_UNSUPPORTED_OR_FAILURE, STRUCT_RECORD_DDL_NOT_FOUND, STRUCT_RECORD_INDEX_NOT_FOUND, STRUCT_RECORD_NOT_FOUND, STRUCT_RECORD_NOT_FOUND_IN_DBCAT, SCHEMA_OBJECT_TYPE_NOT_SUPPORT_ERROR, POLAR_MYSQL_NETWORK_TYPE_NOT_SUPPORT_ERROR, RDS_NETWORK_TYPE_NOT_SUPPORT_ERROR, RDS_VPC_NETWORK_NOT_SUPPORT_ERROR, DB_TYPE_NOT_SUPPORT_ERROR, SYNC_TYPE_NOT_SUPPORT_ERROR, SLAVE_OPERATION_STEP_NOT_SUPPORT_ERROR, BYTE_USED_TYPE_NOT_SUPPORT_ERROR, MANY_TO_ONE_SCHEMA_TABLE_REVERSE_INCR_NOT_SUPPORT_ERROR, DUPLICATE_SCHEMA_TABLE_ERROR, OMS_STEP_NOT_SUPPORT_ERROR, ORACLE_DATABASE_ROLE_NOT_SUPPORT_ERROR, OLD_PRE_CHECK_NOT_SUPPORT_ERROR, SCHEMA_ONE_TO_MANY_NOT_SUPPORT_ERROR, PROJECT_NOT_FOUND_ERROR, ENDPOINT_NOT_FOUND_ERROR, ENDPOINT_NAME_ALREADY_EXIST_ERROR, ENDPOINT_QUERY_ERROR, ENDPOINT_SQL_QUERY_ERROR, PROJECT_NAME_ALREADY_EXIST_ERROR, CHECKER_NOT_FOUND_ERROR, CHECKER_FAILED_ERROR, CHECKER_STATUS_UNEXPECTED_ERROR, CHECKER_NO_TASK_TYPE_ERROR, WORKER_INSTANCE_NOT_FOUND_ERROR, WORKER_INSTANCE_ALLOCATING_ERROR, LOG_SERVICE_TOPIC_NOT_FOUND_ERROR, CLUSTER_NOT_FOUND_ERROR, TENANT_NOT_FOUND_ERROR, DATABASE_NOT_FOUND_ERROR, TABLE_NOT_FOUND_ERROR, COLUMN_NOT_FOUND_ERROR, TABLE_META_NOT_FOUND_ERROR, SYBASE_CHARSET_NOT_FOUND_ERROR, OCP_NOT_FOUND_ERROR, REGION_NOT_FOUND_ERROR, OCP_ALREADY_EXIST_ERROR, ALARM_CHANNEL_NAME_ALREADY_EXIST_ERROR, SEND_MARKDOWN_TEXT_TO_WEBHOOK_FAILED_EXCEPTION_RESPONSE, SEND_MARKDOWN_TEXT_TO_WEBHOOK_FAILED_EXCEPTION_STATUS, LABEL_ALREADY_EXIST_ERROR, LABEL_NOT_EXIST_ERROR, OCP_ALREADY_USED_ERROR, REGION_INFO_INCONSISTENT_ERROR, OCP_NAME_EMPTY_ERROR, MASTER_SLAVE_ENDPOINT_NAME_INCONSISTENT_ERROR, LOG_FILE_NOT_FOUND_ERROR, OPERATION_NOT_ALLOWED_ERROR, PROJECT_OPERATION_NOT_ALLOWED_ERROR, PROJECT_RELEASE_FAILED, STRUCT_MIGRATION_RETRY_NOT_ALLOWED_ERROR, WORKER_INSTANCE_OPERATION_NOT_ALLOWED_ERROR, USER_OPERATION_NOT_ALLOWED_ERROR, OCP_NAME_OR_REGION_NOT_ALLOWED_UPDATE, UPDATE_CONFIG_WITH_NEWLINE_NOT_ALLOWED, EXIST_UNRELEASED_PROJECT_ERROR, EXIST_UNRELEASED_TOPIC_ERROR, LABEL_CREATE_NOT_ALLOWED_ERROR, LABEL_UPDATE_NOT_ALLOWED_ERROR, LABEL_DELETE_NOT_ALLOWED_ERROR, TOPIC_NAME_INVALID_ERROR, INVALID_STATUS_ERROR, INVALID_CSV_HEAD_ERROR, INVALID_CSV_BODY_ERROR, DUPLICATE_SCHEMA_TABLE_SETTING_ERROR, PROJECT_INVALID_STATUS_ERROR, PROJECT_INVALID_CONNECTOR_COUNT_ERROR, WORKER_INSTANCE_INVALID_STATUS_ERROR, LOG_SERVICE_INVALID_STATUS_ERROR, STEP_INVALID_STATUS_ERROR, UPDATE_ALLOW_DEST_TABLE_NOT_EMPTY_NOT_ALLOWED_ERROR, EXIST_INCONSISTENCY_ERROR, OMS_SWITCH_SUBSTEP_FAILED_ERROR, ENDPOINT_ID_INVALID_ERROR, DB_QUERY_VERSION_EMPTY_ERROR, ENDPOINT_NAME_INVALID_ERROR, ENDPOINT_SCHEMA_NOT_ALLOWED_ERROR, ENDPOINT_SCHEMA_CHAR_NOT_ALLOWED_ERROR, NAME_HAS_SPACE_EXCEPTION, CONFIG_CONVERT_VALUE_ERROR, CONFIG_VALUE_EXCEEDS_LIMIT_ERROR, CONFIG_KEY_NOT_FOUND_KEY_ERROR, CONFIG_VALUE_NOT_EMPTY_ERROR, SCHEMA_HAS_CONVERT_INFO, TIME_SERIES_QUERY_SERVICE_ERROR, ETL_VERIFY_ERROR, ETL_SYNTAX_UNSUPPORTED, ETL_FIELD_NOTFOUND, ETL_FAILED_PARSE_SQL, ETL_VAL_TYPE_ERROR, NOT_SUPPORT_GENERATE_COLUMNS, NOT_SUPPORT_UPDATE_ETL, LOCK_FAILED, OMS_USER_EXIST_ERROR, OMS_USER_NOT_FOUND_ERROR, OMS_USER_NAME_LENGTH_CONSTRAINT, OMS_USER_PASSWORD_ERROR, USER_NAME_OR_PASSWORD_ERROR, OMS_USER_PASSWORD_VALIDATION_ERROR, OMS_USER_PASSWORD_DEFAULT_ERROR, OMS_USER_PERMISSION_DENIED_ERROR, OMS_USER_EDIT_ADMIN_ROLE_INFO_PERMISSION_DENIED_ERROR, OMS_USER_ILLEGAL_DELETED_ERROR, CONNECTOR_TASK_NOT_FOUND_ERROR, CONNECTOR_TASK_NUM_LIMIT_ERROR, CONNECTOR_TASK_DELETE_ERROR, METRIC_SERVICE_ERROR, SYNC_PROJECT_TYPE_INVALID_ERROR, SYNC_SHARDING_COLUMNS_INVALID_ERROR, SYNC_PROJECT_PRODUCER_GROUP_INVALID_ERROR, SYNC_PROJECT_PRODUCER_GROUP_LIMIT_EXCEEDS_ERROR, SYNC_PROJECT_COMPLEMENT_CONFIG_ERROR, META_SCHEMA_CREATE_FAILED, RESUME_STEP_FAILED, SCHEMA_INCONSISTENCY, SCHEMA_CASCADE_MAPPING_NOT_SUPPORT_ERROR, SCHEMA_NOT_EXISTED, SCHEMA_EXISTED, SCHEMA_NOT_EXIST, BLACK_LIST_MATCH_ALL, BLACK_LIST_CONTAIN_NON_WHITE_SCHEMA, BLACK_WHITE_LIST_PARAM_INVALID_ERROR, OPERATOR_ERROR, OPERATOR_DIMENSION_NOT_SUPPORT, OPERATOR_PULL_LOG_ERROR, OPERATOR_UPDATE_CONFIG_NOT_SUPPORT, KAFKA_CREATE_TOPIC_ERROR, KAFKA_QUERY_TOPIC_ERROR, KAFKA_BUILD_PROPERTIES_ERROR, ROCKETMQ_CREATE_TOPIC_ERROR, ROCKETMQ_QUERY_TOPIC_ERROR, SYNC_OBJECT_EMPTY_ERROR, WRITER_NUMBER_NOT_UNIQUE, WRITER_NOT_ACTIVE, PROJECT_NAME_DUPLICATE_ERROR, EMPTY_FAILED_STRUCT_MIGRATION_TABLES_ERROR, LOGIC_TABLE_NOT_SUPPORT_UPDATE_OBJECT_ERROR, LOGIC_REQUEST_ERROR, LOGIC_DTO_BUILD_ERROR, UNEXPECTED_REMOTE_API_RESULT, OCEANBASE_USER_UNEXPECTED, STORE_CREATE_FAILED_ERROR, STORE_START_FAILED, STORE_NOT_PULL_LOG_ERROR, ALL_HOSTS_STATUS_ERROR, WORKER_ECS_NOT_FOUND_ERROR, WORKER_ECS_NOT_FOUND_FOR_USER_ERROR, WORKER_POD_NOT_FOUND_ERROR, WORKER_POD_NOT_FOUND_FOR_USER_ERROR, WORKER_INSTANCE_NOT_FOUND_ERROR_V2, and WORKER_INSTANCE_NOT_FOUND_FOR_USER_ERROR.
             */
            public Builder connectorFullProgressOverview(ConnectorFullProgressOverview connectorFullProgressOverview) {
                this.connectorFullProgressOverview = connectorFullProgressOverview;
                return this;
            }

            /**
             * The page size, which takes effect in a pagination query.
             */
            public Builder deployId(String deployId) {
                this.deployId = deployId;
                return this;
            }

            /**
             * The error description (old).
             */
            public Builder dstIops(Long dstIops) {
                this.dstIops = dstIops;
                return this;
            }

            /**
             * The estimated amount of data to migrate.
             */
            public Builder dstRps(Long dstRps) {
                this.dstRps = dstRps;
                return this;
            }

            /**
             * The step progress.
             */
            public Builder dstRpsRef(Long dstRpsRef) {
                this.dstRpsRef = dstRpsRef;
                return this;
            }

            /**
             * The read requests per second (RPS) of the source data source.
             */
            public Builder dstRt(Long dstRt) {
                this.dstRt = dstRt;
                return this;
            }

            /**
             * A system error occurred.
             */
            public Builder dstRtRef(Long dstRtRef) {
                this.dstRtRef = dstRtRef;
                return this;
            }

            /**
             * The full synchronization progress.
             */
            public Builder gmt(Long gmt) {
                this.gmt = gmt;
                return this;
            }

            /**
             * The read/write throughput of the destination data source, in bytes per second.
             */
            public Builder inconsistencies(Long inconsistencies) {
                this.inconsistencies = inconsistencies;
                return this;
            }

            /**
             * The read throughput of the source data source, in bytes per second.
             */
            public Builder incrTimestampCheckpoint(Long incrTimestampCheckpoint) {
                this.incrTimestampCheckpoint = incrTimestampCheckpoint;
                return this;
            }

            /**
             * The error code (old).
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The error related parameters.
             */
            public Builder processedRecords(Long processedRecords) {
                this.processedRecords = processedRecords;
                return this;
            }

            /**
             * The time spent in processing the request, in seconds.
             */
            public Builder skipped(Boolean skipped) {
                this.skipped = skipped;
                return this;
            }

            /**
             * finishedCount / estimatedTotalCount
             */
            public Builder srcIops(Long srcIops) {
                this.srcIops = srcIops;
                return this;
            }

            /**
             * The end time, in the format of "2020-05-22T17:04:18".
             */
            public Builder srcIopsRef(Long srcIopsRef) {
                this.srcIopsRef = srcIopsRef;
                return this;
            }

            /**
             * The error level. Valid values: CRITICAL, ERROR, and WARN.
             */
            public Builder srcRps(Long srcRps) {
                this.srcRps = srcRps;
                return this;
            }

            /**
             * The checkpoint. The value is a unix timestamp in seconds.
             */
            public Builder srcRpsRef(Long srcRpsRef) {
                this.srcRpsRef = srcRpsRef;
                return this;
            }

            /**
             * The error code.
             */
            public Builder srcRt(Long srcRt) {
                this.srcRt = srcRt;
                return this;
            }

            /**
             * The checkpoint collection time. The value is a unix timestamp in seconds.
             */
            public Builder srcRtRef(Long srcRtRef) {
                this.srcRtRef = srcRtRef;
                return this;
            }

            /**
             * The read/write RPS of the destination data source.
             */
            public Builder validated(Boolean validated) {
                this.validated = validated;
                return this;
            }

            public StepInfo build() {
                return new StepInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("EstimatedRemainingSeconds")
        private Long estimatedRemainingSeconds;

        @NameInMap("ExtraInfo")
        private ExtraInfo extraInfo;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("Interactive")
        private Boolean interactive;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("StepDescription")
        private String stepDescription;

        @NameInMap("StepInfo")
        private StepInfo stepInfo;

        @NameInMap("StepName")
        private String stepName;

        @NameInMap("StepOrder")
        private Integer stepOrder;

        @NameInMap("StepProgress")
        private Integer stepProgress;

        @NameInMap("StepStatus")
        private String stepStatus;

        private Data(Builder builder) {
            this.estimatedRemainingSeconds = builder.estimatedRemainingSeconds;
            this.extraInfo = builder.extraInfo;
            this.finishTime = builder.finishTime;
            this.interactive = builder.interactive;
            this.startTime = builder.startTime;
            this.stepDescription = builder.stepDescription;
            this.stepInfo = builder.stepInfo;
            this.stepName = builder.stepName;
            this.stepOrder = builder.stepOrder;
            this.stepProgress = builder.stepProgress;
            this.stepStatus = builder.stepStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return estimatedRemainingSeconds
         */
        public Long getEstimatedRemainingSeconds() {
            return this.estimatedRemainingSeconds;
        }

        /**
         * @return extraInfo
         */
        public ExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return interactive
         */
        public Boolean getInteractive() {
            return this.interactive;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return stepDescription
         */
        public String getStepDescription() {
            return this.stepDescription;
        }

        /**
         * @return stepInfo
         */
        public StepInfo getStepInfo() {
            return this.stepInfo;
        }

        /**
         * @return stepName
         */
        public String getStepName() {
            return this.stepName;
        }

        /**
         * @return stepOrder
         */
        public Integer getStepOrder() {
            return this.stepOrder;
        }

        /**
         * @return stepProgress
         */
        public Integer getStepProgress() {
            return this.stepProgress;
        }

        /**
         * @return stepStatus
         */
        public String getStepStatus() {
            return this.stepStatus;
        }

        public static final class Builder {
            private Long estimatedRemainingSeconds; 
            private ExtraInfo extraInfo; 
            private String finishTime; 
            private Boolean interactive; 
            private String startTime; 
            private String stepDescription; 
            private StepInfo stepInfo; 
            private String stepName; 
            private Integer stepOrder; 
            private Integer stepProgress; 
            private String stepStatus; 

            /**
             * The request ID.
             */
            public Builder estimatedRemainingSeconds(Long estimatedRemainingSeconds) {
                this.estimatedRemainingSeconds = estimatedRemainingSeconds;
                return this;
            }

            /**
             * A system error occurred.
             */
            public Builder extraInfo(ExtraInfo extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * $.parameters[3].schema.example
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * $.parameters[5].schema.description
             */
            public Builder interactive(Boolean interactive) {
                this.interactive = interactive;
                return this;
            }

            /**
             * The error details.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * It is an Alibaba Cloud asset management and configuration tool, with which you can manage multiple Alibaba Cloud products and services by using commands. It is easy to use and a good helper in migration to cloud.
             */
            public Builder stepDescription(String stepDescription) {
                this.stepDescription = stepDescription;
                return this;
            }

            /**
             * The error related parameters.
             */
            public Builder stepInfo(StepInfo stepInfo) {
                this.stepInfo = stepInfo;
                return this;
            }

            /**
             * Alibaba Cloud provides SDKs in different languages to help you quickly integrate Alibaba Cloud products and services by using APIs. We recommend that you use an SDK to call APIs. In this way, you do not need to sign for verification.
             */
            public Builder stepName(String stepName) {
                this.stepName = stepName;
                return this;
            }

            /**
             * DescribeOmsOpenAPIProjectSteps
             */
            public Builder stepOrder(Integer stepOrder) {
                this.stepOrder = stepOrder;
                return this;
            }

            /**
             * cn-hangzhou
             */
            public Builder stepProgress(Integer stepProgress) {
                this.stepProgress = stepProgress;
                return this;
            }

            /**
             * Indicates whether the call is successful.
             */
            public Builder stepStatus(String stepStatus) {
                this.stepStatus = stepStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class ErrorDetail extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Level")
        private String level;

        @NameInMap("Message")
        private String message;

        @NameInMap("Proposal")
        private String proposal;

        private ErrorDetail(Builder builder) {
            this.code = builder.code;
            this.level = builder.level;
            this.message = builder.message;
            this.proposal = builder.proposal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorDetail create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return proposal
         */
        public String getProposal() {
            return this.proposal;
        }

        public static final class Builder {
            private String code; 
            private String level; 
            private String message; 
            private String proposal; 

            /**
             * The error details.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Valid values: CRITICAL, ERROR, and WARN.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * A system error occurred.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Contact the administrator.
             */
            public Builder proposal(String proposal) {
                this.proposal = proposal;
                return this;
            }

            public ErrorDetail build() {
                return new ErrorDetail(this);
            } 

        } 

    }
}
