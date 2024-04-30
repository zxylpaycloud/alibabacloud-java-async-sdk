// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableRecoveryTimeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableRecoveryTimeResponseBody</p>
 */
public class DescribeAvailableRecoveryTimeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CrossBackupId")
    private Integer crossBackupId;

    @com.aliyun.core.annotation.NameInMap("RecoveryBeginTime")
    private String recoveryBeginTime;

    @com.aliyun.core.annotation.NameInMap("RecoveryEndTime")
    private String recoveryEndTime;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAvailableRecoveryTimeResponseBody(Builder builder) {
        this.crossBackupId = builder.crossBackupId;
        this.recoveryBeginTime = builder.recoveryBeginTime;
        this.recoveryEndTime = builder.recoveryEndTime;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableRecoveryTimeResponseBody create() {
        return builder().build();
    }

    /**
     * @return crossBackupId
     */
    public Integer getCrossBackupId() {
        return this.crossBackupId;
    }

    /**
     * @return recoveryBeginTime
     */
    public String getRecoveryBeginTime() {
        return this.recoveryBeginTime;
    }

    /**
     * @return recoveryEndTime
     */
    public String getRecoveryEndTime() {
        return this.recoveryEndTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer crossBackupId; 
        private String recoveryBeginTime; 
        private String recoveryEndTime; 
        private String regionId; 
        private String requestId; 

        /**
         * The ID of the cross-region data backup file.
         */
        public Builder crossBackupId(Integer crossBackupId) {
            this.crossBackupId = crossBackupId;
            return this;
        }

        /**
         * The start time from which data can be restored. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
         */
        public Builder recoveryBeginTime(String recoveryBeginTime) {
            this.recoveryBeginTime = recoveryBeginTime;
            return this;
        }

        /**
         * The end time to which data can be restored. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
         */
        public Builder recoveryEndTime(String recoveryEndTime) {
            this.recoveryEndTime = recoveryEndTime;
            return this;
        }

        /**
         * The region where the source instance resides.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAvailableRecoveryTimeResponseBody build() {
            return new DescribeAvailableRecoveryTimeResponseBody(this);
        } 

    } 

}
