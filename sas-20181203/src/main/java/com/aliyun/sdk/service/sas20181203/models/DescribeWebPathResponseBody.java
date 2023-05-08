// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebPathResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebPathResponseBody</p>
 */
public class DescribeWebPathResponseBody extends TeaModel {
    @NameInMap("ConfigList")
    private java.util.List < ConfigList> configList;

    @NameInMap("Count")
    private Integer count;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeWebPathResponseBody(Builder builder) {
        this.configList = builder.configList;
        this.count = builder.count;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebPathResponseBody create() {
        return builder().build();
    }

    /**
     * @return configList
     */
    public java.util.List < ConfigList> getConfigList() {
        return this.configList;
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
        private java.util.List < ConfigList> configList; 
        private Integer count; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ConfigList.
         */
        public Builder configList(java.util.List < ConfigList> configList) {
            this.configList = configList;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        public DescribeWebPathResponseBody build() {
            return new DescribeWebPathResponseBody(this);
        } 

    } 

    public static class TargetList extends TeaModel {
        @NameInMap("Target")
        private String target;

        @NameInMap("TargetType")
        private String targetType;

        private TargetList(Builder builder) {
            this.target = builder.target;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetList create() {
            return builder().build();
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String target; 
            private String targetType; 

            /**
             * Target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public TargetList build() {
                return new TargetList(this);
            } 

        } 

    }
    public static class ConfigList extends TeaModel {
        @NameInMap("TargetList")
        private java.util.List < TargetList> targetList;

        @NameInMap("WebPath")
        private String webPath;

        @NameInMap("WebPathType")
        private String webPathType;

        private ConfigList(Builder builder) {
            this.targetList = builder.targetList;
            this.webPath = builder.webPath;
            this.webPathType = builder.webPathType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigList create() {
            return builder().build();
        }

        /**
         * @return targetList
         */
        public java.util.List < TargetList> getTargetList() {
            return this.targetList;
        }

        /**
         * @return webPath
         */
        public String getWebPath() {
            return this.webPath;
        }

        /**
         * @return webPathType
         */
        public String getWebPathType() {
            return this.webPathType;
        }

        public static final class Builder {
            private java.util.List < TargetList> targetList; 
            private String webPath; 
            private String webPathType; 

            /**
             * TargetList.
             */
            public Builder targetList(java.util.List < TargetList> targetList) {
                this.targetList = targetList;
                return this;
            }

            /**
             * WebPath.
             */
            public Builder webPath(String webPath) {
                this.webPath = webPath;
                return this;
            }

            /**
             * WebPathType.
             */
            public Builder webPathType(String webPathType) {
                this.webPathType = webPathType;
                return this;
            }

            public ConfigList build() {
                return new ConfigList(this);
            } 

        } 

    }
}
