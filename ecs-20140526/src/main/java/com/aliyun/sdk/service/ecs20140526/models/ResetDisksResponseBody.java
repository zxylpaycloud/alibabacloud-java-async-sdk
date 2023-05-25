// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetDisksResponseBody} extends {@link TeaModel}
 *
 * <p>ResetDisksResponseBody</p>
 */
public class ResetDisksResponseBody extends TeaModel {
    @NameInMap("OperationProgressSet")
    private OperationProgressSet operationProgressSet;

    @NameInMap("RequestId")
    private String requestId;

    private ResetDisksResponseBody(Builder builder) {
        this.operationProgressSet = builder.operationProgressSet;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetDisksResponseBody create() {
        return builder().build();
    }

    /**
     * @return operationProgressSet
     */
    public OperationProgressSet getOperationProgressSet() {
        return this.operationProgressSet;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OperationProgressSet operationProgressSet; 
        private String requestId; 

        /**
         * Details about the rollback operation.
         */
        public Builder operationProgressSet(OperationProgressSet operationProgressSet) {
            this.operationProgressSet = operationProgressSet;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ResetDisksResponseBody build() {
            return new ResetDisksResponseBody(this);
        } 

    } 

    public static class RelatedItem extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private RelatedItem(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedItem create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * The resource name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The resource ID.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RelatedItem build() {
                return new RelatedItem(this);
            } 

        } 

    }
    public static class RelatedItemSet extends TeaModel {
        @NameInMap("RelatedItem")
        private java.util.List < RelatedItem> relatedItem;

        private RelatedItemSet(Builder builder) {
            this.relatedItem = builder.relatedItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedItemSet create() {
            return builder().build();
        }

        /**
         * @return relatedItem
         */
        public java.util.List < RelatedItem> getRelatedItem() {
            return this.relatedItem;
        }

        public static final class Builder {
            private java.util.List < RelatedItem> relatedItem; 

            /**
             * RelatedItem.
             */
            public Builder relatedItem(java.util.List < RelatedItem> relatedItem) {
                this.relatedItem = relatedItem;
                return this;
            }

            public RelatedItemSet build() {
                return new RelatedItemSet(this);
            } 

        } 

    }
    public static class OperationProgress extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("OperationStatus")
        private String operationStatus;

        @NameInMap("RelatedItemSet")
        private RelatedItemSet relatedItemSet;

        private OperationProgress(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMsg = builder.errorMsg;
            this.operationStatus = builder.operationStatus;
            this.relatedItemSet = builder.relatedItemSet;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationProgress create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return operationStatus
         */
        public String getOperationStatus() {
            return this.operationStatus;
        }

        /**
         * @return relatedItemSet
         */
        public RelatedItemSet getRelatedItemSet() {
            return this.relatedItemSet;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMsg; 
            private String operationStatus; 
            private RelatedItemSet relatedItemSet; 

            /**
             * The error code that is returned if the request failed. This parameter is empty if the request is successful.
             * <p>
             * 
             * For information about error codes and error messages, see [Service error codes](https://error-center.alibabacloud.com/status/product/Ecs).
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message that is returned if the request failed. This parameter is empty if the request is successful.
             * <p>
             * 
             * For information about error codes and error messages, see [Service error codes](https://error-center.alibabacloud.com/status/product/Ecs).
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * Indicates whether the request is successful. If the request is successful, Success is returned. If the request failed, an error code and an error message are returned.
             */
            public Builder operationStatus(String operationStatus) {
                this.operationStatus = operationStatus;
                return this;
            }

            /**
             * Details about the resources.
             */
            public Builder relatedItemSet(RelatedItemSet relatedItemSet) {
                this.relatedItemSet = relatedItemSet;
                return this;
            }

            public OperationProgress build() {
                return new OperationProgress(this);
            } 

        } 

    }
    public static class OperationProgressSet extends TeaModel {
        @NameInMap("OperationProgress")
        private java.util.List < OperationProgress> operationProgress;

        private OperationProgressSet(Builder builder) {
            this.operationProgress = builder.operationProgress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationProgressSet create() {
            return builder().build();
        }

        /**
         * @return operationProgress
         */
        public java.util.List < OperationProgress> getOperationProgress() {
            return this.operationProgress;
        }

        public static final class Builder {
            private java.util.List < OperationProgress> operationProgress; 

            /**
             * OperationProgress.
             */
            public Builder operationProgress(java.util.List < OperationProgress> operationProgress) {
                this.operationProgress = operationProgress;
                return this;
            }

            public OperationProgressSet build() {
                return new OperationProgressSet(this);
            } 

        } 

    }
}
