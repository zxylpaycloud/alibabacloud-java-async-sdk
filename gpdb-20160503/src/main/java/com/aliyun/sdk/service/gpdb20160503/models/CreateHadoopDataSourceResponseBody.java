// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateHadoopDataSourceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHadoopDataSourceResponseBody</p>
 */
public class CreateHadoopDataSourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    private Integer dataSourceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateHadoopDataSourceResponseBody(Builder builder) {
        this.dataSourceId = builder.dataSourceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHadoopDataSourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataSourceId
     */
    public Integer getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer dataSourceId; 
        private String requestId; 

        /**
         * DataSourceId.
         */
        public Builder dataSourceId(Integer dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateHadoopDataSourceResponseBody build() {
            return new CreateHadoopDataSourceResponseBody(this);
        } 

    } 

}
