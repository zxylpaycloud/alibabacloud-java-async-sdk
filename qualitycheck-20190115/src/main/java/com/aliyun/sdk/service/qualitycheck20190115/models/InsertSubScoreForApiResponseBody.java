// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertSubScoreForApiResponseBody} extends {@link TeaModel}
 *
 * <p>InsertSubScoreForApiResponseBody</p>
 */
public class InsertSubScoreForApiResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private InsertSubScoreForApiResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertSubScoreForApiResponseBody create() {
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
        private Data data; 
        private String message; 
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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public InsertSubScoreForApiResponseBody build() {
            return new InsertSubScoreForApiResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScoreSubId")
        private Long scoreSubId;

        @com.aliyun.core.annotation.NameInMap("ScoreSubName")
        private String scoreSubName;

        private Data(Builder builder) {
            this.scoreSubId = builder.scoreSubId;
            this.scoreSubName = builder.scoreSubName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return scoreSubId
         */
        public Long getScoreSubId() {
            return this.scoreSubId;
        }

        /**
         * @return scoreSubName
         */
        public String getScoreSubName() {
            return this.scoreSubName;
        }

        public static final class Builder {
            private Long scoreSubId; 
            private String scoreSubName; 

            /**
             * ScoreSubId.
             */
            public Builder scoreSubId(Long scoreSubId) {
                this.scoreSubId = scoreSubId;
                return this;
            }

            /**
             * ScoreSubName.
             */
            public Builder scoreSubName(String scoreSubName) {
                this.scoreSubName = scoreSubName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
