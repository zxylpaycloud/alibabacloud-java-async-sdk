// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListShiftSchedulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListShiftSchedulesResponseBody</p>
 */
public class ListShiftSchedulesResponseBody extends TeaModel {
    @NameInMap("Paging")
    private Paging paging;

    @NameInMap("RequestId")
    private String requestId;

    private ListShiftSchedulesResponseBody(Builder builder) {
        this.paging = builder.paging;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListShiftSchedulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return paging
     */
    public Paging getPaging() {
        return this.paging;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Paging paging; 
        private String requestId; 

        /**
         * Paging.
         */
        public Builder paging(Paging paging) {
            this.paging = paging;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListShiftSchedulesResponseBody build() {
            return new ListShiftSchedulesResponseBody(this);
        } 

    } 

    public static class ShiftSchedules extends TeaModel {
        @NameInMap("ShiftScheduleIdentifier")
        private String shiftScheduleIdentifier;

        @NameInMap("ShiftScheduleName")
        private String shiftScheduleName;

        private ShiftSchedules(Builder builder) {
            this.shiftScheduleIdentifier = builder.shiftScheduleIdentifier;
            this.shiftScheduleName = builder.shiftScheduleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ShiftSchedules create() {
            return builder().build();
        }

        /**
         * @return shiftScheduleIdentifier
         */
        public String getShiftScheduleIdentifier() {
            return this.shiftScheduleIdentifier;
        }

        /**
         * @return shiftScheduleName
         */
        public String getShiftScheduleName() {
            return this.shiftScheduleName;
        }

        public static final class Builder {
            private String shiftScheduleIdentifier; 
            private String shiftScheduleName; 

            /**
             * ShiftScheduleIdentifier.
             */
            public Builder shiftScheduleIdentifier(String shiftScheduleIdentifier) {
                this.shiftScheduleIdentifier = shiftScheduleIdentifier;
                return this;
            }

            /**
             * ShiftScheduleName.
             */
            public Builder shiftScheduleName(String shiftScheduleName) {
                this.shiftScheduleName = shiftScheduleName;
                return this;
            }

            public ShiftSchedules build() {
                return new ShiftSchedules(this);
            } 

        } 

    }
    public static class Paging extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("ShiftSchedules")
        private java.util.List < ShiftSchedules> shiftSchedules;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Paging(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.shiftSchedules = builder.shiftSchedules;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Paging create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return shiftSchedules
         */
        public java.util.List < ShiftSchedules> getShiftSchedules() {
            return this.shiftSchedules;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List < ShiftSchedules> shiftSchedules; 
            private Integer totalCount; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
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
             * ShiftSchedules.
             */
            public Builder shiftSchedules(java.util.List < ShiftSchedules> shiftSchedules) {
                this.shiftSchedules = shiftSchedules;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Paging build() {
                return new Paging(this);
            } 

        } 

    }
}
