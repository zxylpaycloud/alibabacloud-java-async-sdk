// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCsImportedProdStatusByUserResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCsImportedProdStatusByUserResponseBody</p>
 */
public class DescribeCsImportedProdStatusByUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Boolean data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCsImportedProdStatusByUserResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCsImportedProdStatusByUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Boolean getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean data; 
        private String requestId; 

        /**
         * Indicates whether the cloud service is activated for the account. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCsImportedProdStatusByUserResponseBody build() {
            return new DescribeCsImportedProdStatusByUserResponseBody(this);
        } 

    } 

}
