// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveFirstRankResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveFirstRankResponseBody</p>
 */
public class RemoveFirstRankResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private RemoveFirstRankResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveFirstRankResponseBody create() {
        return builder().build();
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
        private String requestId; 
        private Result result; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the rough sort expression.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public RemoveFirstRankResponseBody build() {
            return new RemoveFirstRankResponseBody(this);
        } 

    } 

    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arg")
        private String arg;

        @com.aliyun.core.annotation.NameInMap("attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("weight")
        private Float weight;

        private Meta(Builder builder) {
            this.arg = builder.arg;
            this.attribute = builder.attribute;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return arg
         */
        public String getArg() {
            return this.arg;
        }

        /**
         * @return attribute
         */
        public String getAttribute() {
            return this.attribute;
        }

        /**
         * @return weight
         */
        public Float getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String arg; 
            private String attribute; 
            private Float weight; 

            /**
             * The parameters that are used by a function in the expression.
             * <p>
             * 
             * For more information, see Rough sort functions.
             */
            public Builder arg(String arg) {
                this.arg = arg;
                return this;
            }

            /**
             * The attribute, feature function, or field to be searched for.
             * <p>
             * 
             * For more information about supported feature functions, see Rough sort functions.
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * The weight.
             * <p>
             * 
             * Valid values: \[-100000,100000] (excluding 0).
             */
            public Builder weight(Float weight) {
                this.weight = weight;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("active")
        private Boolean active;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("meta")
        private java.util.List < Meta> meta;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Result(Builder builder) {
            this.active = builder.active;
            this.description = builder.description;
            this.meta = builder.meta;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return meta
         */
        public java.util.List < Meta> getMeta() {
            return this.meta;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Boolean active; 
            private String description; 
            private java.util.List < Meta> meta; 
            private String name; 

            /**
             * Indicates whether the expression is the default one.
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * The description of the expression.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The content of the expression.
             */
            public Builder meta(java.util.List < Meta> meta) {
                this.meta = meta;
                return this;
            }

            /**
             * The name of the expression.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
