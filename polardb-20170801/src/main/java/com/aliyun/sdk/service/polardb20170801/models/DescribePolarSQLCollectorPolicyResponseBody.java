// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolarSQLCollectorPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarSQLCollectorPolicyResponseBody</p>
 */
public class DescribePolarSQLCollectorPolicyResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SQLCollectorStatus")
    private String SQLCollectorStatus;

    private DescribePolarSQLCollectorPolicyResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.requestId = builder.requestId;
        this.SQLCollectorStatus = builder.SQLCollectorStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarSQLCollectorPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SQLCollectorStatus
     */
    public String getSQLCollectorStatus() {
        return this.SQLCollectorStatus;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String requestId; 
        private String SQLCollectorStatus; 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
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
         * SQLCollectorStatus.
         */
        public Builder SQLCollectorStatus(String SQLCollectorStatus) {
            this.SQLCollectorStatus = SQLCollectorStatus;
            return this;
        }

        public DescribePolarSQLCollectorPolicyResponseBody build() {
            return new DescribePolarSQLCollectorPolicyResponseBody(this);
        } 

    } 

}
