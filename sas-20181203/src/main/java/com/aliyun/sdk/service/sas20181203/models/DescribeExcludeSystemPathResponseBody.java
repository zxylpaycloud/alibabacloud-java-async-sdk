// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExcludeSystemPathResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExcludeSystemPathResponseBody</p>
 */
public class DescribeExcludeSystemPathResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExcludePaths")
    private java.util.List < ExcludePaths> excludePaths;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeExcludeSystemPathResponseBody(Builder builder) {
        this.excludePaths = builder.excludePaths;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExcludeSystemPathResponseBody create() {
        return builder().build();
    }

    /**
     * @return excludePaths
     */
    public java.util.List < ExcludePaths> getExcludePaths() {
        return this.excludePaths;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ExcludePaths> excludePaths; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * An array consisting of the directories that are excluded.
         */
        public Builder excludePaths(java.util.List < ExcludePaths> excludePaths) {
            this.excludePaths = excludePaths;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeExcludeSystemPathResponseBody build() {
            return new DescribeExcludeSystemPathResponseBody(this);
        } 

    } 

    public static class ExcludePaths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private ExcludePaths(Builder builder) {
            this.os = builder.os;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExcludePaths create() {
            return builder().build();
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String os; 
            private String path; 

            /**
             * The operating system of the server. Valid values:
             * <p>
             * 
             * *   **linux**: Linux
             * *   **windows**: Windows
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * The absolute path to the directory.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public ExcludePaths build() {
                return new ExcludePaths(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
