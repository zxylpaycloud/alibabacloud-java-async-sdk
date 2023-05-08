// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAllImageBaselineResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAllImageBaselineResponseBody</p>
 */
public class DescribeAllImageBaselineResponseBody extends TeaModel {
    @NameInMap("ImageBaselines")
    private ImageBaselines imageBaselines;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAllImageBaselineResponseBody(Builder builder) {
        this.imageBaselines = builder.imageBaselines;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAllImageBaselineResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageBaselines
     */
    public ImageBaselines getImageBaselines() {
        return this.imageBaselines;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ImageBaselines imageBaselines; 
        private String requestId; 

        /**
         * ImageBaselines.
         */
        public Builder imageBaselines(ImageBaselines imageBaselines) {
            this.imageBaselines = imageBaselines;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAllImageBaselineResponseBody build() {
            return new DescribeAllImageBaselineResponseBody(this);
        } 

    } 

    public static class BaselineItemList extends TeaModel {
        @NameInMap("Alias")
        private String alias;

        @NameInMap("ClassKey")
        private String classKey;

        @NameInMap("ItemKey")
        private String itemKey;

        @NameInMap("NameKey")
        private String nameKey;

        private BaselineItemList(Builder builder) {
            this.alias = builder.alias;
            this.classKey = builder.classKey;
            this.itemKey = builder.itemKey;
            this.nameKey = builder.nameKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaselineItemList create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return classKey
         */
        public String getClassKey() {
            return this.classKey;
        }

        /**
         * @return itemKey
         */
        public String getItemKey() {
            return this.itemKey;
        }

        /**
         * @return nameKey
         */
        public String getNameKey() {
            return this.nameKey;
        }

        public static final class Builder {
            private String alias; 
            private String classKey; 
            private String itemKey; 
            private String nameKey; 

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * ClassKey.
             */
            public Builder classKey(String classKey) {
                this.classKey = classKey;
                return this;
            }

            /**
             * ItemKey.
             */
            public Builder itemKey(String itemKey) {
                this.itemKey = itemKey;
                return this;
            }

            /**
             * NameKey.
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            public BaselineItemList build() {
                return new BaselineItemList(this);
            } 

        } 

    }
    public static class BaselineNameList extends TeaModel {
        @NameInMap("Alias")
        private String alias;

        @NameInMap("BaselineItemList")
        private java.util.List < BaselineItemList> baselineItemList;

        @NameInMap("ClassKey")
        private String classKey;

        @NameInMap("NameKey")
        private String nameKey;

        private BaselineNameList(Builder builder) {
            this.alias = builder.alias;
            this.baselineItemList = builder.baselineItemList;
            this.classKey = builder.classKey;
            this.nameKey = builder.nameKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaselineNameList create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return baselineItemList
         */
        public java.util.List < BaselineItemList> getBaselineItemList() {
            return this.baselineItemList;
        }

        /**
         * @return classKey
         */
        public String getClassKey() {
            return this.classKey;
        }

        /**
         * @return nameKey
         */
        public String getNameKey() {
            return this.nameKey;
        }

        public static final class Builder {
            private String alias; 
            private java.util.List < BaselineItemList> baselineItemList; 
            private String classKey; 
            private String nameKey; 

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * BaselineItemList.
             */
            public Builder baselineItemList(java.util.List < BaselineItemList> baselineItemList) {
                this.baselineItemList = baselineItemList;
                return this;
            }

            /**
             * ClassKey.
             */
            public Builder classKey(String classKey) {
                this.classKey = classKey;
                return this;
            }

            /**
             * NameKey.
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            public BaselineNameList build() {
                return new BaselineNameList(this);
            } 

        } 

    }
    public static class BaselineClassList extends TeaModel {
        @NameInMap("Alias")
        private String alias;

        @NameInMap("BaselineNameList")
        private java.util.List < BaselineNameList> baselineNameList;

        @NameInMap("ClassKey")
        private String classKey;

        private BaselineClassList(Builder builder) {
            this.alias = builder.alias;
            this.baselineNameList = builder.baselineNameList;
            this.classKey = builder.classKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaselineClassList create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return baselineNameList
         */
        public java.util.List < BaselineNameList> getBaselineNameList() {
            return this.baselineNameList;
        }

        /**
         * @return classKey
         */
        public String getClassKey() {
            return this.classKey;
        }

        public static final class Builder {
            private String alias; 
            private java.util.List < BaselineNameList> baselineNameList; 
            private String classKey; 

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * BaselineNameList.
             */
            public Builder baselineNameList(java.util.List < BaselineNameList> baselineNameList) {
                this.baselineNameList = baselineNameList;
                return this;
            }

            /**
             * ClassKey.
             */
            public Builder classKey(String classKey) {
                this.classKey = classKey;
                return this;
            }

            public BaselineClassList build() {
                return new BaselineClassList(this);
            } 

        } 

    }
    public static class ImageBaselines extends TeaModel {
        @NameInMap("BaselineClassList")
        private java.util.List < BaselineClassList> baselineClassList;

        private ImageBaselines(Builder builder) {
            this.baselineClassList = builder.baselineClassList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageBaselines create() {
            return builder().build();
        }

        /**
         * @return baselineClassList
         */
        public java.util.List < BaselineClassList> getBaselineClassList() {
            return this.baselineClassList;
        }

        public static final class Builder {
            private java.util.List < BaselineClassList> baselineClassList; 

            /**
             * BaselineClassList.
             */
            public Builder baselineClassList(java.util.List < BaselineClassList> baselineClassList) {
                this.baselineClassList = baselineClassList;
                return this;
            }

            public ImageBaselines build() {
                return new ImageBaselines(this);
            } 

        } 

    }
}
