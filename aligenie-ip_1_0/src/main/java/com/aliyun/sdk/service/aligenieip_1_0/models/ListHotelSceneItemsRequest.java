// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotelSceneItemsRequest} extends {@link RequestModel}
 *
 * <p>ListHotelSceneItemsRequest</p>
 */
public class ListHotelSceneItemsRequest extends Request {
    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Query
    @NameInMap("ListHotelSceneReq")
    @Validation(required = true)
    private ListHotelSceneReq listHotelSceneReq;

    private ListHotelSceneItemsRequest(Builder builder) {
        super(builder);
        this.hotelId = builder.hotelId;
        this.listHotelSceneReq = builder.listHotelSceneReq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotelSceneItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return listHotelSceneReq
     */
    public ListHotelSceneReq getListHotelSceneReq() {
        return this.listHotelSceneReq;
    }

    public static final class Builder extends Request.Builder<ListHotelSceneItemsRequest, Builder> {
        private String hotelId; 
        private ListHotelSceneReq listHotelSceneReq; 

        private Builder() {
            super();
        } 

        private Builder(ListHotelSceneItemsRequest request) {
            super(request);
            this.hotelId = request.hotelId;
            this.listHotelSceneReq = request.listHotelSceneReq;
        } 

        /**
         * hotelID
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        /**
         * ListHotelSceneReq
         */
        public Builder listHotelSceneReq(ListHotelSceneReq listHotelSceneReq) {
            String listHotelSceneReqShrink = shrink(listHotelSceneReq, "ListHotelSceneReq", "json");
            this.putQueryParameter("ListHotelSceneReq", listHotelSceneReqShrink);
            this.listHotelSceneReq = listHotelSceneReq;
            return this;
        }

        @Override
        public ListHotelSceneItemsRequest build() {
            return new ListHotelSceneItemsRequest(this);
        } 

    } 

    public static class Page extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        private Page(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
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

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 

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

            public Page build() {
                return new Page(this);
            } 

        } 

    }
    public static class ListHotelSceneReq extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("Keywords")
        private String keywords;

        @NameInMap("Page")
        @Validation(required = true)
        private Page page;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private ListHotelSceneReq(Builder builder) {
            this.category = builder.category;
            this.keywords = builder.keywords;
            this.page = builder.page;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListHotelSceneReq create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return keywords
         */
        public String getKeywords() {
            return this.keywords;
        }

        /**
         * @return page
         */
        public Page getPage() {
            return this.page;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String category; 
            private String keywords; 
            private Page page; 
            private String status; 
            private String type; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Keywords.
             */
            public Builder keywords(String keywords) {
                this.keywords = keywords;
                return this;
            }

            /**
             * Page.
             */
            public Builder page(Page page) {
                this.page = page;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ListHotelSceneReq build() {
                return new ListHotelSceneReq(this);
            } 

        } 

    }
}
