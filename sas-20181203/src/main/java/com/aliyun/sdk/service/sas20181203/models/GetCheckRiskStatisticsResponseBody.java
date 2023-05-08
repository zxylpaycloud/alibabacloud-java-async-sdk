// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCheckRiskStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetCheckRiskStatisticsResponseBody</p>
 */
public class GetCheckRiskStatisticsResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private GetCheckRiskStatisticsResponseBody(Builder builder) {
        this.count = builder.count;
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCheckRiskStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCheckRiskStatisticsResponseBody build() {
            return new GetCheckRiskStatisticsResponseBody(this);
        } 

    } 

    public static class SubStatistics extends TeaModel {
        @NameInMap("Alias")
        private String alias;

        @NameInMap("HighWarningCount")
        private Integer highWarningCount;

        @NameInMap("LowWarningCount")
        private Integer lowWarningCount;

        @NameInMap("MediumWarningCount")
        private Integer mediumWarningCount;

        @NameInMap("PassCount")
        private Integer passCount;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("TypeName")
        private String typeName;

        private SubStatistics(Builder builder) {
            this.alias = builder.alias;
            this.highWarningCount = builder.highWarningCount;
            this.lowWarningCount = builder.lowWarningCount;
            this.mediumWarningCount = builder.mediumWarningCount;
            this.passCount = builder.passCount;
            this.totalCount = builder.totalCount;
            this.typeName = builder.typeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubStatistics create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return highWarningCount
         */
        public Integer getHighWarningCount() {
            return this.highWarningCount;
        }

        /**
         * @return lowWarningCount
         */
        public Integer getLowWarningCount() {
            return this.lowWarningCount;
        }

        /**
         * @return mediumWarningCount
         */
        public Integer getMediumWarningCount() {
            return this.mediumWarningCount;
        }

        /**
         * @return passCount
         */
        public Integer getPassCount() {
            return this.passCount;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return typeName
         */
        public String getTypeName() {
            return this.typeName;
        }

        public static final class Builder {
            private String alias; 
            private Integer highWarningCount; 
            private Integer lowWarningCount; 
            private Integer mediumWarningCount; 
            private Integer passCount; 
            private Integer totalCount; 
            private String typeName; 

            /**
             * 基线类别名称
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * 高危检查项数量
             */
            public Builder highWarningCount(Integer highWarningCount) {
                this.highWarningCount = highWarningCount;
                return this;
            }

            /**
             * 低危检查项数量
             */
            public Builder lowWarningCount(Integer lowWarningCount) {
                this.lowWarningCount = lowWarningCount;
                return this;
            }

            /**
             * 中危检查项数量
             */
            public Builder mediumWarningCount(Integer mediumWarningCount) {
                this.mediumWarningCount = mediumWarningCount;
                return this;
            }

            /**
             * 通过检查项数量
             */
            public Builder passCount(Integer passCount) {
                this.passCount = passCount;
                return this;
            }

            /**
             * 检查项总数量
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * 基线类别
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            public SubStatistics build() {
                return new SubStatistics(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("HighWarningCount")
        private Integer highWarningCount;

        @NameInMap("LowWarningCount")
        private Integer lowWarningCount;

        @NameInMap("MediumWarningCount")
        private Integer mediumWarningCount;

        @NameInMap("PassCount")
        private Integer passCount;

        @NameInMap("SceneName")
        private String sceneName;

        @NameInMap("SubStatistics")
        private java.util.List < SubStatistics> subStatistics;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.highWarningCount = builder.highWarningCount;
            this.lowWarningCount = builder.lowWarningCount;
            this.mediumWarningCount = builder.mediumWarningCount;
            this.passCount = builder.passCount;
            this.sceneName = builder.sceneName;
            this.subStatistics = builder.subStatistics;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return highWarningCount
         */
        public Integer getHighWarningCount() {
            return this.highWarningCount;
        }

        /**
         * @return lowWarningCount
         */
        public Integer getLowWarningCount() {
            return this.lowWarningCount;
        }

        /**
         * @return mediumWarningCount
         */
        public Integer getMediumWarningCount() {
            return this.mediumWarningCount;
        }

        /**
         * @return passCount
         */
        public Integer getPassCount() {
            return this.passCount;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return subStatistics
         */
        public java.util.List < SubStatistics> getSubStatistics() {
            return this.subStatistics;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer highWarningCount; 
            private Integer lowWarningCount; 
            private Integer mediumWarningCount; 
            private Integer passCount; 
            private String sceneName; 
            private java.util.List < SubStatistics> subStatistics; 
            private Integer totalCount; 

            /**
             * 高危检查项数量
             */
            public Builder highWarningCount(Integer highWarningCount) {
                this.highWarningCount = highWarningCount;
                return this;
            }

            /**
             * 低危检查项数量
             */
            public Builder lowWarningCount(Integer lowWarningCount) {
                this.lowWarningCount = lowWarningCount;
                return this;
            }

            /**
             * 中危检查项数量
             */
            public Builder mediumWarningCount(Integer mediumWarningCount) {
                this.mediumWarningCount = mediumWarningCount;
                return this;
            }

            /**
             * 通过检查项数量
             */
            public Builder passCount(Integer passCount) {
                this.passCount = passCount;
                return this;
            }

            /**
             * 风险场景名称
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * SubStatistics.
             */
            public Builder subStatistics(java.util.List < SubStatistics> subStatistics) {
                this.subStatistics = subStatistics;
                return this;
            }

            /**
             * 检查项总数量
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
