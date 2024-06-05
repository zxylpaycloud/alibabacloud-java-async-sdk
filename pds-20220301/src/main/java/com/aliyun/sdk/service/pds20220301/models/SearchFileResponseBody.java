// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchFileResponseBody} extends {@link TeaModel}
 *
 * <p>SearchFileResponseBody</p>
 */
public class SearchFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List < File > items;

    @com.aliyun.core.annotation.NameInMap("next_marker")
    private String nextMarker;

    @com.aliyun.core.annotation.NameInMap("total_count")
    private Long totalCount;

    private SearchFileResponseBody(Builder builder) {
        this.items = builder.items;
        this.nextMarker = builder.nextMarker;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchFileResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < File > getItems() {
        return this.items;
    }

    /**
     * @return nextMarker
     */
    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < File > items; 
        private String nextMarker; 
        private Long totalCount; 

        /**
         * The information about the files.
         */
        public Builder items(java.util.List < File > items) {
            this.items = items;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. If next_marker is empty, no next page exists.
         */
        public Builder nextMarker(String nextMarker) {
            this.nextMarker = nextMarker;
            return this;
        }

        /**
         * The total number of retrieved files.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public SearchFileResponseBody build() {
            return new SearchFileResponseBody(this);
        } 

    } 

}
