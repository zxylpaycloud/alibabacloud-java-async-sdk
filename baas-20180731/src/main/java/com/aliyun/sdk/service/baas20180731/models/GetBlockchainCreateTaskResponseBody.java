// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBlockchainCreateTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetBlockchainCreateTaskResponseBody</p>
 */
public class GetBlockchainCreateTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private GetBlockchainCreateTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBlockchainCreateTaskResponseBody create() {
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
         * RequestId.
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

        public GetBlockchainCreateTaskResponseBody build() {
            return new GetBlockchainCreateTaskResponseBody(this);
        } 

    } 

    public static class BlockchainCreateTasks extends TeaModel {
        @NameInMap("Bizid")
        private String bizid;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Memo")
        private String memo;

        @NameInMap("Name")
        private String name;

        @NameInMap("Status")
        private String status;

        private BlockchainCreateTasks(Builder builder) {
            this.bizid = builder.bizid;
            this.createTime = builder.createTime;
            this.memo = builder.memo;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockchainCreateTasks create() {
            return builder().build();
        }

        /**
         * @return bizid
         */
        public String getBizid() {
            return this.bizid;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String bizid; 
            private Long createTime; 
            private String memo; 
            private String name; 
            private String status; 

            /**
             * Bizid.
             */
            public Builder bizid(String bizid) {
                this.bizid = bizid;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Memo.
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public BlockchainCreateTasks build() {
                return new BlockchainCreateTasks(this);
            } 

        } 

    }
    public static class ResultBlockchainCreateTasks extends TeaModel {
        @NameInMap("BlockchainCreateTasks")
        private java.util.List < BlockchainCreateTasks> blockchainCreateTasks;

        private ResultBlockchainCreateTasks(Builder builder) {
            this.blockchainCreateTasks = builder.blockchainCreateTasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultBlockchainCreateTasks create() {
            return builder().build();
        }

        /**
         * @return blockchainCreateTasks
         */
        public java.util.List < BlockchainCreateTasks> getBlockchainCreateTasks() {
            return this.blockchainCreateTasks;
        }

        public static final class Builder {
            private java.util.List < BlockchainCreateTasks> blockchainCreateTasks; 

            /**
             * BlockchainCreateTasks.
             */
            public Builder blockchainCreateTasks(java.util.List < BlockchainCreateTasks> blockchainCreateTasks) {
                this.blockchainCreateTasks = blockchainCreateTasks;
                return this;
            }

            public ResultBlockchainCreateTasks build() {
                return new ResultBlockchainCreateTasks(this);
            } 

        } 

    }
    public static class Pagination extends TeaModel {
        @NameInMap("Current")
        private Integer current;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Integer total;

        private Pagination(Builder builder) {
            this.current = builder.current;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pagination create() {
            return builder().build();
        }

        /**
         * @return current
         */
        public Integer getCurrent() {
            return this.current;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer current; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * Current.
             */
            public Builder current(Integer current) {
                this.current = current;
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
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Pagination build() {
                return new Pagination(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("BlockchainCreateTasks")
        private ResultBlockchainCreateTasks blockchainCreateTasks;

        @NameInMap("Pagination")
        private Pagination pagination;

        private Result(Builder builder) {
            this.blockchainCreateTasks = builder.blockchainCreateTasks;
            this.pagination = builder.pagination;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return blockchainCreateTasks
         */
        public ResultBlockchainCreateTasks getBlockchainCreateTasks() {
            return this.blockchainCreateTasks;
        }

        /**
         * @return pagination
         */
        public Pagination getPagination() {
            return this.pagination;
        }

        public static final class Builder {
            private ResultBlockchainCreateTasks blockchainCreateTasks; 
            private Pagination pagination; 

            /**
             * BlockchainCreateTasks.
             */
            public Builder blockchainCreateTasks(ResultBlockchainCreateTasks blockchainCreateTasks) {
                this.blockchainCreateTasks = blockchainCreateTasks;
                return this;
            }

            /**
             * Pagination.
             */
            public Builder pagination(Pagination pagination) {
                this.pagination = pagination;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
