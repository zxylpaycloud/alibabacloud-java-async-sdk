// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetricDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetricDataResponseBody</p>
 */
public class DescribeMetricDataResponseBody extends TeaModel {
    @NameInMap("DataList")
    private java.util.List < DataList> dataList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeMetricDataResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetricDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataList
     */
    public java.util.List < DataList> getDataList() {
        return this.dataList;
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
        private java.util.List < DataList> dataList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The disk monitoring data.
         */
        public Builder dataList(java.util.List < DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of data entries queried.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeMetricDataResponseBody build() {
            return new DescribeMetricDataResponseBody(this);
        } 

    } 

    public static class DataList extends TeaModel {
        @NameInMap("Datapoints")
        private Object datapoints;

        @NameInMap("Labels")
        private Object labels;

        private DataList(Builder builder) {
            this.datapoints = builder.datapoints;
            this.labels = builder.labels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return datapoints
         */
        public Object getDatapoints() {
            return this.datapoints;
        }

        /**
         * @return labels
         */
        public Object getLabels() {
            return this.labels;
        }

        public static final class Builder {
            private Object datapoints; 
            private Object labels; 

            /**
             * The datapoints that consist of consecutive timestamps in seconds and metric values that were recorded at these time points.
             */
            public Builder datapoints(Object datapoints) {
                this.datapoints = datapoints;
                return this;
            }

            /**
             * The tags.
             */
            public Builder labels(Object labels) {
                this.labels = labels;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
}
