// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebLockInclusiveFileTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebLockInclusiveFileTypeResponseBody</p>
 */
public class DescribeWebLockInclusiveFileTypeResponseBody extends TeaModel {
    @NameInMap("InclusiveFileType")
    private java.util.List < String > inclusiveFileType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeWebLockInclusiveFileTypeResponseBody(Builder builder) {
        this.inclusiveFileType = builder.inclusiveFileType;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebLockInclusiveFileTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return inclusiveFileType
     */
    public java.util.List < String > getInclusiveFileType() {
        return this.inclusiveFileType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < String > inclusiveFileType; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * InclusiveFileType.
         */
        public Builder inclusiveFileType(java.util.List < String > inclusiveFileType) {
            this.inclusiveFileType = inclusiveFileType;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeWebLockInclusiveFileTypeResponseBody build() {
            return new DescribeWebLockInclusiveFileTypeResponseBody(this);
        } 

    } 

}
