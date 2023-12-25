// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StatisticsListByTypeReportResponseBody} extends {@link TeaModel}
 *
 * <p>StatisticsListByTypeReportResponseBody</p>
 */
public class StatisticsListByTypeReportResponseBody extends TeaModel {
    @NameInMap("hasMore")
    private Boolean hasMore;

    @NameInMap("nextCursor")
    private Long nextCursor;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("useridList")
    private java.util.List < String > useridList;

    private StatisticsListByTypeReportResponseBody(Builder builder) {
        this.hasMore = builder.hasMore;
        this.nextCursor = builder.nextCursor;
        this.requestId = builder.requestId;
        this.useridList = builder.useridList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StatisticsListByTypeReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return nextCursor
     */
    public Long getNextCursor() {
        return this.nextCursor;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return useridList
     */
    public java.util.List < String > getUseridList() {
        return this.useridList;
    }

    public static final class Builder {
        private Boolean hasMore; 
        private Long nextCursor; 
        private String requestId; 
        private java.util.List < String > useridList; 

        /**
         * hasMore.
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * nextCursor.
         */
        public Builder nextCursor(Long nextCursor) {
            this.nextCursor = nextCursor;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * useridList.
         */
        public Builder useridList(java.util.List < String > useridList) {
            this.useridList = useridList;
            return this;
        }

        public StatisticsListByTypeReportResponseBody build() {
            return new StatisticsListByTypeReportResponseBody(this);
        } 

    } 

}
