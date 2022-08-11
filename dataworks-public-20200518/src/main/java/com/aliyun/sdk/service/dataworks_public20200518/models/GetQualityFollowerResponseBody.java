// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQualityFollowerResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityFollowerResponseBody</p>
 */
public class GetQualityFollowerResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetQualityFollowerResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityFollowerResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private java.util.List < Data> data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public GetQualityFollowerResponseBody build() {
            return new GetQualityFollowerResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AlarmMode")
        private Integer alarmMode;

        @NameInMap("EntityId")
        private String entityId;

        @NameInMap("Follower")
        private String follower;

        @NameInMap("FollowerAccountName")
        private String followerAccountName;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ProjectName")
        private String projectName;

        @NameInMap("TableName")
        private String tableName;

        private Data(Builder builder) {
            this.alarmMode = builder.alarmMode;
            this.entityId = builder.entityId;
            this.follower = builder.follower;
            this.followerAccountName = builder.followerAccountName;
            this.id = builder.id;
            this.projectName = builder.projectName;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alarmMode
         */
        public Integer getAlarmMode() {
            return this.alarmMode;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return follower
         */
        public String getFollower() {
            return this.follower;
        }

        /**
         * @return followerAccountName
         */
        public String getFollowerAccountName() {
            return this.followerAccountName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private Integer alarmMode; 
            private String entityId; 
            private String follower; 
            private String followerAccountName; 
            private Long id; 
            private String projectName; 
            private String tableName; 

            /**
             * AlarmMode.
             */
            public Builder alarmMode(Integer alarmMode) {
                this.alarmMode = alarmMode;
                return this;
            }

            /**
             * EntityId.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * Follower.
             */
            public Builder follower(String follower) {
                this.follower = follower;
                return this;
            }

            /**
             * FollowerAccountName.
             */
            public Builder followerAccountName(String followerAccountName) {
                this.followerAccountName = followerAccountName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
