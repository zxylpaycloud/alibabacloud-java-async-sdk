// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserAnalyzersResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserAnalyzersResponseBody</p>
 */
public class ListUserAnalyzersResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    @NameInMap("totalCount")
    private Integer totalCount;

    private ListUserAnalyzersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserAnalyzersResponseBody create() {
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 
        private Integer totalCount; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListUserAnalyzersResponseBody build() {
            return new ListUserAnalyzersResponseBody(this);
        } 

    } 

    public static class Dicts extends TeaModel {
        @NameInMap("available")
        private Boolean available;

        @NameInMap("created")
        private Integer created;

        @NameInMap("entriesCount")
        private Integer entriesCount;

        @NameInMap("entriesLimit")
        private Integer entriesLimit;

        @NameInMap("id")
        private String id;

        @NameInMap("type")
        private String type;

        @NameInMap("updated")
        private Integer updated;

        private Dicts(Builder builder) {
            this.available = builder.available;
            this.created = builder.created;
            this.entriesCount = builder.entriesCount;
            this.entriesLimit = builder.entriesLimit;
            this.id = builder.id;
            this.type = builder.type;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dicts create() {
            return builder().build();
        }

        /**
         * @return available
         */
        public Boolean getAvailable() {
            return this.available;
        }

        /**
         * @return created
         */
        public Integer getCreated() {
            return this.created;
        }

        /**
         * @return entriesCount
         */
        public Integer getEntriesCount() {
            return this.entriesCount;
        }

        /**
         * @return entriesLimit
         */
        public Integer getEntriesLimit() {
            return this.entriesLimit;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updated
         */
        public Integer getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private Boolean available; 
            private Integer created; 
            private Integer entriesCount; 
            private Integer entriesLimit; 
            private String id; 
            private String type; 
            private Integer updated; 

            /**
             * available.
             */
            public Builder available(Boolean available) {
                this.available = available;
                return this;
            }

            /**
             * created.
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * entriesCount.
             */
            public Builder entriesCount(Integer entriesCount) {
                this.entriesCount = entriesCount;
                return this;
            }

            /**
             * entriesLimit.
             */
            public Builder entriesLimit(Integer entriesLimit) {
                this.entriesLimit = entriesLimit;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * updated.
             */
            public Builder updated(Integer updated) {
                this.updated = updated;
                return this;
            }

            public Dicts build() {
                return new Dicts(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("available")
        private Boolean available;

        @NameInMap("business")
        private String business;

        @NameInMap("created")
        private Integer created;

        @NameInMap("dicts")
        private java.util.List < Dicts> dicts;

        @NameInMap("id")
        private String id;

        @NameInMap("name")
        private String name;

        @NameInMap("updated")
        private Integer updated;

        private Result(Builder builder) {
            this.available = builder.available;
            this.business = builder.business;
            this.created = builder.created;
            this.dicts = builder.dicts;
            this.id = builder.id;
            this.name = builder.name;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return available
         */
        public Boolean getAvailable() {
            return this.available;
        }

        /**
         * @return business
         */
        public String getBusiness() {
            return this.business;
        }

        /**
         * @return created
         */
        public Integer getCreated() {
            return this.created;
        }

        /**
         * @return dicts
         */
        public java.util.List < Dicts> getDicts() {
            return this.dicts;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return updated
         */
        public Integer getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private Boolean available; 
            private String business; 
            private Integer created; 
            private java.util.List < Dicts> dicts; 
            private String id; 
            private String name; 
            private Integer updated; 

            /**
             * available.
             */
            public Builder available(Boolean available) {
                this.available = available;
                return this;
            }

            /**
             * business.
             */
            public Builder business(String business) {
                this.business = business;
                return this;
            }

            /**
             * created.
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * dicts.
             */
            public Builder dicts(java.util.List < Dicts> dicts) {
                this.dicts = dicts;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * updated.
             */
            public Builder updated(Integer updated) {
                this.updated = updated;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
