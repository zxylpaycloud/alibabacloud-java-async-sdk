// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomQARequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomQARequest</p>
 */
public class DeleteCustomQARequest extends Request {
    @Body
    @NameInMap("CustomQAIds")
    private java.util.List < String > customQAIds;

    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    private DeleteCustomQARequest(Builder builder) {
        super(builder);
        this.customQAIds = builder.customQAIds;
        this.hotelId = builder.hotelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomQARequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customQAIds
     */
    public java.util.List < String > getCustomQAIds() {
        return this.customQAIds;
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    public static final class Builder extends Request.Builder<DeleteCustomQARequest, Builder> {
        private java.util.List < String > customQAIds; 
        private String hotelId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomQARequest request) {
            super(request);
            this.customQAIds = request.customQAIds;
            this.hotelId = request.hotelId;
        } 

        /**
         * CustomQAIds.
         */
        public Builder customQAIds(java.util.List < String > customQAIds) {
            String customQAIdsShrink = shrink(customQAIds, "CustomQAIds", "json");
            this.putBodyParameter("CustomQAIds", customQAIdsShrink);
            this.customQAIds = customQAIds;
            return this;
        }

        /**
         * HotelId.
         */
        public Builder hotelId(String hotelId) {
            this.putBodyParameter("HotelId", hotelId);
            this.hotelId = hotelId;
            return this;
        }

        @Override
        public DeleteCustomQARequest build() {
            return new DeleteCustomQARequest(this);
        } 

    } 

}
