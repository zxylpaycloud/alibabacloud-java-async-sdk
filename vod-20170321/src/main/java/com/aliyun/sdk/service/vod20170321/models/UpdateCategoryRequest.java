// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCategoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateCategoryRequest</p>
 */
public class UpdateCategoryRequest extends Request {
    @Query
    @NameInMap("CateId")
    @Validation(required = true)
    private Long cateId;

    @Query
    @NameInMap("CateName")
    @Validation(required = true)
    private String cateName;

    private UpdateCategoryRequest(Builder builder) {
        super(builder);
        this.cateId = builder.cateId;
        this.cateName = builder.cateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCategoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cateId
     */
    public Long getCateId() {
        return this.cateId;
    }

    /**
     * @return cateName
     */
    public String getCateName() {
        return this.cateName;
    }

    public static final class Builder extends Request.Builder<UpdateCategoryRequest, Builder> {
        private Long cateId; 
        private String cateName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCategoryRequest response) {
            super(response);
            this.cateId = response.cateId;
            this.cateName = response.cateName;
        } 

        /**
         * CateId.
         */
        public Builder cateId(Long cateId) {
            this.putQueryParameter("CateId", cateId);
            this.cateId = cateId;
            return this;
        }

        /**
         * CateName.
         */
        public Builder cateName(String cateName) {
            this.putQueryParameter("CateName", cateName);
            this.cateName = cateName;
            return this;
        }

        @Override
        public UpdateCategoryRequest build() {
            return new UpdateCategoryRequest(this);
        } 

    } 

}
