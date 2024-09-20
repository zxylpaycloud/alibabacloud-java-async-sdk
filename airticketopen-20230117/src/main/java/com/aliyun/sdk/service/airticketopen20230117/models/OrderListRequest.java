// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OrderListRequest} extends {@link RequestModel}
 *
 * <p>OrderListRequest</p>
 */
public class OrderListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("book_time_end")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long bookTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("book_time_start")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long bookTimeStart;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_index")
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_size")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-access-token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xAcsAirticketAccessToken;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-airticket-language")
    private String xAcsAirticketLanguage;

    private OrderListRequest(Builder builder) {
        super(builder);
        this.bookTimeEnd = builder.bookTimeEnd;
        this.bookTimeStart = builder.bookTimeStart;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.xAcsAirticketAccessToken = builder.xAcsAirticketAccessToken;
        this.xAcsAirticketLanguage = builder.xAcsAirticketLanguage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OrderListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bookTimeEnd
     */
    public Long getBookTimeEnd() {
        return this.bookTimeEnd;
    }

    /**
     * @return bookTimeStart
     */
    public Long getBookTimeStart() {
        return this.bookTimeStart;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return xAcsAirticketAccessToken
     */
    public String getXAcsAirticketAccessToken() {
        return this.xAcsAirticketAccessToken;
    }

    /**
     * @return xAcsAirticketLanguage
     */
    public String getXAcsAirticketLanguage() {
        return this.xAcsAirticketLanguage;
    }

    public static final class Builder extends Request.Builder<OrderListRequest, Builder> {
        private Long bookTimeEnd; 
        private Long bookTimeStart; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private Integer status; 
        private String xAcsAirticketAccessToken; 
        private String xAcsAirticketLanguage; 

        private Builder() {
            super();
        } 

        private Builder(OrderListRequest request) {
            super(request);
            this.bookTimeEnd = request.bookTimeEnd;
            this.bookTimeStart = request.bookTimeStart;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.xAcsAirticketAccessToken = request.xAcsAirticketAccessToken;
            this.xAcsAirticketLanguage = request.xAcsAirticketLanguage;
        } 

        /**
         * book_time_end.
         */
        public Builder bookTimeEnd(Long bookTimeEnd) {
            this.putQueryParameter("book_time_end", bookTimeEnd);
            this.bookTimeEnd = bookTimeEnd;
            return this;
        }

        /**
         * book_time_start.
         */
        public Builder bookTimeStart(Long bookTimeStart) {
            this.putQueryParameter("book_time_start", bookTimeStart);
            this.bookTimeStart = bookTimeStart;
            return this;
        }

        /**
         * page_index.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("page_index", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * page_size.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * access_token
         */
        public Builder xAcsAirticketAccessToken(String xAcsAirticketAccessToken) {
            this.putHeaderParameter("x-acs-airticket-access-token", xAcsAirticketAccessToken);
            this.xAcsAirticketAccessToken = xAcsAirticketAccessToken;
            return this;
        }

        /**
         * x-acs-airticket-language.
         */
        public Builder xAcsAirticketLanguage(String xAcsAirticketLanguage) {
            this.putHeaderParameter("x-acs-airticket-language", xAcsAirticketLanguage);
            this.xAcsAirticketLanguage = xAcsAirticketLanguage;
            return this;
        }

        @Override
        public OrderListRequest build() {
            return new OrderListRequest(this);
        } 

    } 

}
