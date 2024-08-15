// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceIpHostnameResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceIpHostnameResponseBody</p>
 */
public class DescribeDBInstanceIpHostnameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("IpHostnameInfos")
    private String ipHostnameInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceIpHostnameResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.ipHostnameInfos = builder.ipHostnameInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceIpHostnameResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return ipHostnameInfos
     */
    public String getIpHostnameInfos() {
        return this.ipHostnameInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private String ipHostnameInfos; 
        private String requestId; 

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The internal IP addresses and hostnames of the ECS instance on which a primary ApsaraDB RDS for SQL Server instance and its secondary RDS instance reside. Format: `IP address 1, Hostname 1; IP address 2, Hostname 2`.
         */
        public Builder ipHostnameInfos(String ipHostnameInfos) {
            this.ipHostnameInfos = ipHostnameInfos;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceIpHostnameResponseBody build() {
            return new DescribeDBInstanceIpHostnameResponseBody(this);
        } 

    } 

}
