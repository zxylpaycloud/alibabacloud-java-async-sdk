// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelQrBindRequest} extends {@link RequestModel}
 *
 * <p>HotelQrBindRequest</p>
 */
public class HotelQrBindRequest extends Request {
    @Body
    @NameInMap("ClientId")
    @Validation(required = true)
    private String clientId;

    @Body
    @NameInMap("Code")
    @Validation(required = true)
    private String code;

    @Body
    @NameInMap("ExtInfo")
    private String extInfo;

    @Body
    @NameInMap("HotelId")
    @Validation(required = true)
    private String hotelId;

    @Body
    @NameInMap("RoomNo")
    @Validation(required = true)
    private String roomNo;

    private HotelQrBindRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.code = builder.code;
        this.extInfo = builder.extInfo;
        this.hotelId = builder.hotelId;
        this.roomNo = builder.roomNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotelQrBindRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return extInfo
     */
    public String getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return hotelId
     */
    public String getHotelId() {
        return this.hotelId;
    }

    /**
     * @return roomNo
     */
    public String getRoomNo() {
        return this.roomNo;
    }

    public static final class Builder extends Request.Builder<HotelQrBindRequest, Builder> {
        private String clientId; 
        private String code; 
        private String extInfo; 
        private String hotelId; 
        private String roomNo; 

        private Builder() {
            super();
        } 

        private Builder(HotelQrBindRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.code = request.code;
            this.extInfo = request.extInfo;
            this.hotelId = request.hotelId;
            this.roomNo = request.roomNo;
        } 

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putBodyParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putBodyParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * ExtInfo.
         */
        public Builder extInfo(String extInfo) {
            this.putBodyParameter("ExtInfo", extInfo);
            this.extInfo = extInfo;
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

        /**
         * RoomNo.
         */
        public Builder roomNo(String roomNo) {
            this.putBodyParameter("RoomNo", roomNo);
            this.roomNo = roomNo;
            return this;
        }

        @Override
        public HotelQrBindRequest build() {
            return new HotelQrBindRequest(this);
        } 

    } 

}
