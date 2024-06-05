// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScanFileResponseBody} extends {@link TeaModel}
 *
 * <p>ScanFileResponseBody</p>
 */
public class ScanFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List < File > items;

    @com.aliyun.core.annotation.NameInMap("next_marker")
    private String nextMarker;

    private ScanFileResponseBody(Builder builder) {
        this.items = builder.items;
        this.nextMarker = builder.nextMarker;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScanFileResponseBody create() {
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

    public static final class Builder {
        private java.util.List < File > items; 
        private String nextMarker; 

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

        public ScanFileResponseBody build() {
            return new ScanFileResponseBody(this);
        } 

    } 

}
