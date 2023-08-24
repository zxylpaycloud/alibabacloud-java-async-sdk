// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20221125.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EntVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>EntVerifyResponseBody</p>
 */
public class EntVerifyResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private EntVerifyResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EntVerifyResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Result result; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public EntVerifyResponseBody build() {
            return new EntVerifyResponseBody(this);
        } 

    } 

    public static class ModelResults extends TeaModel {
        @NameInMap("ModelName")
        private String modelName;

        @NameInMap("Result")
        private String result;

        private ModelResults(Builder builder) {
            this.modelName = builder.modelName;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelResults create() {
            return builder().build();
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        public static final class Builder {
            private String modelName; 
            private String result; 

            /**
             * ModelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            public ModelResults build() {
                return new ModelResults(this);
            } 

        } 

    }
    public static class RiskVerifyResult extends TeaModel {
        @NameInMap("Found")
        private Boolean found;

        @NameInMap("ModelResults")
        private java.util.List < ModelResults> modelResults;

        private RiskVerifyResult(Builder builder) {
            this.found = builder.found;
            this.modelResults = builder.modelResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskVerifyResult create() {
            return builder().build();
        }

        /**
         * @return found
         */
        public Boolean getFound() {
            return this.found;
        }

        /**
         * @return modelResults
         */
        public java.util.List < ModelResults> getModelResults() {
            return this.modelResults;
        }

        public static final class Builder {
            private Boolean found; 
            private java.util.List < ModelResults> modelResults; 

            /**
             * Found.
             */
            public Builder found(Boolean found) {
                this.found = found;
                return this;
            }

            /**
             * ModelResults.
             */
            public Builder modelResults(java.util.List < ModelResults> modelResults) {
                this.modelResults = modelResults;
                return this;
            }

            public RiskVerifyResult build() {
                return new RiskVerifyResult(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("RiskVerifyResult")
        private RiskVerifyResult riskVerifyResult;

        private Result(Builder builder) {
            this.riskVerifyResult = builder.riskVerifyResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return riskVerifyResult
         */
        public RiskVerifyResult getRiskVerifyResult() {
            return this.riskVerifyResult;
        }

        public static final class Builder {
            private RiskVerifyResult riskVerifyResult; 

            /**
             * RiskVerifyResult.
             */
            public Builder riskVerifyResult(RiskVerifyResult riskVerifyResult) {
                this.riskVerifyResult = riskVerifyResult;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
