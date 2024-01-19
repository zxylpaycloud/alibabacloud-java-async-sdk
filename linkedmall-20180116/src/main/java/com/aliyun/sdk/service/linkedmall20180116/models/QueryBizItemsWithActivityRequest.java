// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBizItemsWithActivityRequest} extends {@link RequestModel}
 *
 * <p>QueryBizItemsWithActivityRequest</p>
 */
public class QueryBizItemsWithActivityRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("ItemIds")
    private java.util.Map < String, ? > itemIds;

    @Query
    @NameInMap("LmItemIds")
    private java.util.Map < String, ? > lmItemIds;

    private QueryBizItemsWithActivityRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.itemIds = builder.itemIds;
        this.lmItemIds = builder.lmItemIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBizItemsWithActivityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return itemIds
     */
    public java.util.Map < String, ? > getItemIds() {
        return this.itemIds;
    }

    /**
     * @return lmItemIds
     */
    public java.util.Map < String, ? > getLmItemIds() {
        return this.lmItemIds;
    }

    public static final class Builder extends Request.Builder<QueryBizItemsWithActivityRequest, Builder> {
        private String bizId; 
        private java.util.Map < String, ? > itemIds; 
        private java.util.Map < String, ? > lmItemIds; 

        private Builder() {
            super();
        } 

        private Builder(QueryBizItemsWithActivityRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.itemIds = request.itemIds;
            this.lmItemIds = request.lmItemIds;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ItemIds.
         */
        public Builder itemIds(java.util.Map < String, ? > itemIds) {
            String itemIdsShrink = shrink(itemIds, "ItemIds", "json");
            this.putQueryParameter("ItemIds", itemIdsShrink);
            this.itemIds = itemIds;
            return this;
        }

        /**
         * LmItemIds.
         */
        public Builder lmItemIds(java.util.Map < String, ? > lmItemIds) {
            String lmItemIdsShrink = shrink(lmItemIds, "LmItemIds", "json");
            this.putQueryParameter("LmItemIds", lmItemIdsShrink);
            this.lmItemIds = lmItemIds;
            return this;
        }

        @Override
        public QueryBizItemsWithActivityRequest build() {
            return new QueryBizItemsWithActivityRequest(this);
        } 

    } 

}
