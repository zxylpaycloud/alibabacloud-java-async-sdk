// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTableLineageResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaTableLineageResponseBody</p>
 */
public class GetMetaTableLineageResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

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

    private GetMetaTableLineageResponseBody(Builder builder) {
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

    public static GetMetaTableLineageResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
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

        public GetMetaTableLineageResponseBody build() {
            return new GetMetaTableLineageResponseBody(this);
        } 

    } 

    public static class DataEntityList extends TeaModel {
        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("TableGuid")
        private String tableGuid;

        @NameInMap("TableName")
        private String tableName;

        private DataEntityList(Builder builder) {
            this.createTimestamp = builder.createTimestamp;
            this.tableGuid = builder.tableGuid;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataEntityList create() {
            return builder().build();
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return tableGuid
         */
        public String getTableGuid() {
            return this.tableGuid;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private Long createTimestamp; 
            private String tableGuid; 
            private String tableName; 

            /**
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * TableGuid.
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public DataEntityList build() {
                return new DataEntityList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DataEntityList")
        private java.util.List < DataEntityList> dataEntityList;

        @NameInMap("HasNext")
        private Boolean hasNext;

        @NameInMap("NextPrimaryKey")
        private String nextPrimaryKey;

        private Data(Builder builder) {
            this.dataEntityList = builder.dataEntityList;
            this.hasNext = builder.hasNext;
            this.nextPrimaryKey = builder.nextPrimaryKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataEntityList
         */
        public java.util.List < DataEntityList> getDataEntityList() {
            return this.dataEntityList;
        }

        /**
         * @return hasNext
         */
        public Boolean getHasNext() {
            return this.hasNext;
        }

        /**
         * @return nextPrimaryKey
         */
        public String getNextPrimaryKey() {
            return this.nextPrimaryKey;
        }

        public static final class Builder {
            private java.util.List < DataEntityList> dataEntityList; 
            private Boolean hasNext; 
            private String nextPrimaryKey; 

            /**
             * DataEntityList.
             */
            public Builder dataEntityList(java.util.List < DataEntityList> dataEntityList) {
                this.dataEntityList = dataEntityList;
                return this;
            }

            /**
             * HasNext.
             */
            public Builder hasNext(Boolean hasNext) {
                this.hasNext = hasNext;
                return this;
            }

            /**
             * NextPrimaryKey.
             */
            public Builder nextPrimaryKey(String nextPrimaryKey) {
                this.nextPrimaryKey = nextPrimaryKey;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
