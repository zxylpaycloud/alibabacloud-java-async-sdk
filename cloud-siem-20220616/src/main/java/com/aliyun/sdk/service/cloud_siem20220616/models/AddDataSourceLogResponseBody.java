// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDataSourceLogResponseBody} extends {@link TeaModel}
 *
 * <p>AddDataSourceLogResponseBody</p>
 */
public class AddDataSourceLogResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private AddDataSourceLogResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDataSourceLogResponseBody create() {
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

        public AddDataSourceLogResponseBody build() {
            return new AddDataSourceLogResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("LogInstanceId")
        private String logInstanceId;

        private Data(Builder builder) {
            this.count = builder.count;
            this.logInstanceId = builder.logInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return logInstanceId
         */
        public String getLogInstanceId() {
            return this.logInstanceId;
        }

        public static final class Builder {
            private Integer count; 
            private String logInstanceId; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * LogInstanceId.
             */
            public Builder logInstanceId(String logInstanceId) {
                this.logInstanceId = logInstanceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
