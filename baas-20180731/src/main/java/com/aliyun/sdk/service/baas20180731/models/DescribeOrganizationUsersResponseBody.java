// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOrganizationUsersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOrganizationUsersResponseBody</p>
 */
public class DescribeOrganizationUsersResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("Success")
    private Boolean success;

    private DescribeOrganizationUsersResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOrganizationUsersResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer errorCode; 
        private String requestId; 
        private java.util.List < Result> result; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
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
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeOrganizationUsersResponseBody build() {
            return new DescribeOrganizationUsersResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Attrs")
        private String attrs;

        @NameInMap("CallerBid")
        private String callerBid;

        @NameInMap("CallerUid")
        private Long callerUid;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("FullName")
        private String fullName;

        @NameInMap("OrganizationId")
        private String organizationId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Username")
        private String username;

        private Result(Builder builder) {
            this.attrs = builder.attrs;
            this.callerBid = builder.callerBid;
            this.callerUid = builder.callerUid;
            this.createTime = builder.createTime;
            this.expireTime = builder.expireTime;
            this.fullName = builder.fullName;
            this.organizationId = builder.organizationId;
            this.regionId = builder.regionId;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return attrs
         */
        public String getAttrs() {
            return this.attrs;
        }

        /**
         * @return callerBid
         */
        public String getCallerBid() {
            return this.callerBid;
        }

        /**
         * @return callerUid
         */
        public Long getCallerUid() {
            return this.callerUid;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return fullName
         */
        public String getFullName() {
            return this.fullName;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String attrs; 
            private String callerBid; 
            private Long callerUid; 
            private String createTime; 
            private String expireTime; 
            private String fullName; 
            private String organizationId; 
            private String regionId; 
            private String username; 

            /**
             * Attrs.
             */
            public Builder attrs(String attrs) {
                this.attrs = attrs;
                return this;
            }

            /**
             * CallerBid.
             */
            public Builder callerBid(String callerBid) {
                this.callerBid = callerBid;
                return this;
            }

            /**
             * CallerUid.
             */
            public Builder callerUid(Long callerUid) {
                this.callerUid = callerUid;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * FullName.
             */
            public Builder fullName(String fullName) {
                this.fullName = fullName;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
