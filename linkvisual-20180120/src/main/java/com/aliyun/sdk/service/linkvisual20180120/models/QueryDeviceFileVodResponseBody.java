// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceFileVodResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceFileVodResponseBody</p>
 */
public class QueryDeviceFileVodResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("DecryptKey")
    private String decryptKey;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryDeviceFileVodResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.decryptKey = builder.decryptKey;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceFileVodResponseBody create() {
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
     * @return decryptKey
     */
    public String getDecryptKey() {
        return this.decryptKey;
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
        private String decryptKey; 
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
         * DecryptKey.
         */
        public Builder decryptKey(String decryptKey) {
            this.decryptKey = decryptKey;
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

        public QueryDeviceFileVodResponseBody build() {
            return new QueryDeviceFileVodResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("VodUrl")
        private String vodUrl;

        private Data(Builder builder) {
            this.vodUrl = builder.vodUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return vodUrl
         */
        public String getVodUrl() {
            return this.vodUrl;
        }

        public static final class Builder {
            private String vodUrl; 

            /**
             * VodUrl.
             */
            public Builder vodUrl(String vodUrl) {
                this.vodUrl = vodUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
