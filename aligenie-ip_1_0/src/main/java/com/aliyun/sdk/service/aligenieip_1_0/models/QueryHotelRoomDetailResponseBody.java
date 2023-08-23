// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryHotelRoomDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryHotelRoomDetailResponseBody</p>
 */
public class QueryHotelRoomDetailResponseBody extends TeaModel {
    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("StatusCode")
    private Integer statusCode;

    private QueryHotelRoomDetailResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryHotelRoomDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private Result result; 
        private Integer statusCode; 

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * StatusCode.
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public QueryHotelRoomDetailResponseBody build() {
            return new QueryHotelRoomDetailResponseBody(this);
        } 

    } 

    public static class AuthAccounts extends TeaModel {
        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("AuthTime")
        private String authTime;

        private AuthAccounts(Builder builder) {
            this.accountName = builder.accountName;
            this.authTime = builder.authTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthAccounts create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return authTime
         */
        public String getAuthTime() {
            return this.authTime;
        }

        public static final class Builder {
            private String accountName; 
            private String authTime; 

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * AuthTime.
             */
            public Builder authTime(String authTime) {
                this.authTime = authTime;
                return this;
            }

            public AuthAccounts build() {
                return new AuthAccounts(this);
            } 

        } 

    }
    public static class DeviceInfos extends TeaModel {
        @NameInMap("ActiveTime")
        private String activeTime;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("FirmwareVersion")
        private String firmwareVersion;

        @NameInMap("Mac")
        private String mac;

        @NameInMap("OnlineStatus")
        private Integer onlineStatus;

        @NameInMap("Sn")
        private String sn;

        @NameInMap("Uuid")
        private String uuid;

        private DeviceInfos(Builder builder) {
            this.activeTime = builder.activeTime;
            this.deviceName = builder.deviceName;
            this.firmwareVersion = builder.firmwareVersion;
            this.mac = builder.mac;
            this.onlineStatus = builder.onlineStatus;
            this.sn = builder.sn;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceInfos create() {
            return builder().build();
        }

        /**
         * @return activeTime
         */
        public String getActiveTime() {
            return this.activeTime;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return firmwareVersion
         */
        public String getFirmwareVersion() {
            return this.firmwareVersion;
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return onlineStatus
         */
        public Integer getOnlineStatus() {
            return this.onlineStatus;
        }

        /**
         * @return sn
         */
        public String getSn() {
            return this.sn;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String activeTime; 
            private String deviceName; 
            private String firmwareVersion; 
            private String mac; 
            private Integer onlineStatus; 
            private String sn; 
            private String uuid; 

            /**
             * ActiveTime.
             */
            public Builder activeTime(String activeTime) {
                this.activeTime = activeTime;
                return this;
            }

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * FirmwareVersion.
             */
            public Builder firmwareVersion(String firmwareVersion) {
                this.firmwareVersion = firmwareVersion;
                return this;
            }

            /**
             * Mac.
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * OnlineStatus.
             */
            public Builder onlineStatus(Integer onlineStatus) {
                this.onlineStatus = onlineStatus;
                return this;
            }

            /**
             * Sn.
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public DeviceInfos build() {
                return new DeviceInfos(this);
            } 

        } 

    }
    public static class OtherService extends TeaModel {
        @NameInMap("OpenCall")
        private Boolean openCall;

        @NameInMap("UnhandleTickets")
        private Integer unhandleTickets;

        private OtherService(Builder builder) {
            this.openCall = builder.openCall;
            this.unhandleTickets = builder.unhandleTickets;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OtherService create() {
            return builder().build();
        }

        /**
         * @return openCall
         */
        public Boolean getOpenCall() {
            return this.openCall;
        }

        /**
         * @return unhandleTickets
         */
        public Integer getUnhandleTickets() {
            return this.unhandleTickets;
        }

        public static final class Builder {
            private Boolean openCall; 
            private Integer unhandleTickets; 

            /**
             * OpenCall.
             */
            public Builder openCall(Boolean openCall) {
                this.openCall = openCall;
                return this;
            }

            /**
             * UnhandleTickets.
             */
            public Builder unhandleTickets(Integer unhandleTickets) {
                this.unhandleTickets = unhandleTickets;
                return this;
            }

            public OtherService build() {
                return new OtherService(this);
            } 

        } 

    }
    public static class RoomControlInfoDeviceInfos extends TeaModel {
        @NameInMap("CategoryEnName")
        private String categoryEnName;

        @NameInMap("CategoryId")
        private Long categoryId;

        @NameInMap("CategoryName")
        private String categoryName;

        @NameInMap("DeviceConnectType")
        private String deviceConnectType;

        @NameInMap("DeviceCount")
        private Integer deviceCount;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("LocationEnName")
        private String locationEnName;

        @NameInMap("LocationId")
        private Long locationId;

        @NameInMap("LocationName")
        private String locationName;

        @NameInMap("ProductKey")
        private String productKey;

        private RoomControlInfoDeviceInfos(Builder builder) {
            this.categoryEnName = builder.categoryEnName;
            this.categoryId = builder.categoryId;
            this.categoryName = builder.categoryName;
            this.deviceConnectType = builder.deviceConnectType;
            this.deviceCount = builder.deviceCount;
            this.deviceId = builder.deviceId;
            this.deviceName = builder.deviceName;
            this.locationEnName = builder.locationEnName;
            this.locationId = builder.locationId;
            this.locationName = builder.locationName;
            this.productKey = builder.productKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoomControlInfoDeviceInfos create() {
            return builder().build();
        }

        /**
         * @return categoryEnName
         */
        public String getCategoryEnName() {
            return this.categoryEnName;
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return deviceConnectType
         */
        public String getDeviceConnectType() {
            return this.deviceConnectType;
        }

        /**
         * @return deviceCount
         */
        public Integer getDeviceCount() {
            return this.deviceCount;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return locationEnName
         */
        public String getLocationEnName() {
            return this.locationEnName;
        }

        /**
         * @return locationId
         */
        public Long getLocationId() {
            return this.locationId;
        }

        /**
         * @return locationName
         */
        public String getLocationName() {
            return this.locationName;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        public static final class Builder {
            private String categoryEnName; 
            private Long categoryId; 
            private String categoryName; 
            private String deviceConnectType; 
            private Integer deviceCount; 
            private String deviceId; 
            private String deviceName; 
            private String locationEnName; 
            private Long locationId; 
            private String locationName; 
            private String productKey; 

            /**
             * CategoryEnName.
             */
            public Builder categoryEnName(String categoryEnName) {
                this.categoryEnName = categoryEnName;
                return this;
            }

            /**
             * CategoryId.
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * DeviceConnectType.
             */
            public Builder deviceConnectType(String deviceConnectType) {
                this.deviceConnectType = deviceConnectType;
                return this;
            }

            /**
             * DeviceCount.
             */
            public Builder deviceCount(Integer deviceCount) {
                this.deviceCount = deviceCount;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * LocationEnName.
             */
            public Builder locationEnName(String locationEnName) {
                this.locationEnName = locationEnName;
                return this;
            }

            /**
             * LocationId.
             */
            public Builder locationId(Long locationId) {
                this.locationId = locationId;
                return this;
            }

            /**
             * LocationName.
             */
            public Builder locationName(String locationName) {
                this.locationName = locationName;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            public RoomControlInfoDeviceInfos build() {
                return new RoomControlInfoDeviceInfos(this);
            } 

        } 

    }
    public static class RoomControlInfo extends TeaModel {
        @NameInMap("AppId")
        private Long appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("DeviceInfos")
        private java.util.List < RoomControlInfoDeviceInfos> deviceInfos;

        @NameInMap("RcuUrl")
        private String rcuUrl;

        @NameInMap("TemplateId")
        private Long templateId;

        @NameInMap("TemplateName")
        private String templateName;

        private RoomControlInfo(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.deviceInfos = builder.deviceInfos;
            this.rcuUrl = builder.rcuUrl;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoomControlInfo create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return deviceInfos
         */
        public java.util.List < RoomControlInfoDeviceInfos> getDeviceInfos() {
            return this.deviceInfos;
        }

        /**
         * @return rcuUrl
         */
        public String getRcuUrl() {
            return this.rcuUrl;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private Long appId; 
            private String appName; 
            private java.util.List < RoomControlInfoDeviceInfos> deviceInfos; 
            private String rcuUrl; 
            private Long templateId; 
            private String templateName; 

            /**
             * AppId.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * DeviceInfos.
             */
            public Builder deviceInfos(java.util.List < RoomControlInfoDeviceInfos> deviceInfos) {
                this.deviceInfos = deviceInfos;
                return this;
            }

            /**
             * RcuUrl.
             */
            public Builder rcuUrl(String rcuUrl) {
                this.rcuUrl = rcuUrl;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public RoomControlInfo build() {
                return new RoomControlInfo(this);
            } 

        } 

    }
    public static class RoomServiceInfo extends TeaModel {
        @NameInMap("BookServiceCnt")
        private Integer bookServiceCnt;

        @NameInMap("GoodsServiceCnt")
        private Integer goodsServiceCnt;

        @NameInMap("RepairServiceCnt")
        private Integer repairServiceCnt;

        @NameInMap("RoomServiceCnt")
        private Integer roomServiceCnt;

        private RoomServiceInfo(Builder builder) {
            this.bookServiceCnt = builder.bookServiceCnt;
            this.goodsServiceCnt = builder.goodsServiceCnt;
            this.repairServiceCnt = builder.repairServiceCnt;
            this.roomServiceCnt = builder.roomServiceCnt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoomServiceInfo create() {
            return builder().build();
        }

        /**
         * @return bookServiceCnt
         */
        public Integer getBookServiceCnt() {
            return this.bookServiceCnt;
        }

        /**
         * @return goodsServiceCnt
         */
        public Integer getGoodsServiceCnt() {
            return this.goodsServiceCnt;
        }

        /**
         * @return repairServiceCnt
         */
        public Integer getRepairServiceCnt() {
            return this.repairServiceCnt;
        }

        /**
         * @return roomServiceCnt
         */
        public Integer getRoomServiceCnt() {
            return this.roomServiceCnt;
        }

        public static final class Builder {
            private Integer bookServiceCnt; 
            private Integer goodsServiceCnt; 
            private Integer repairServiceCnt; 
            private Integer roomServiceCnt; 

            /**
             * BookServiceCnt.
             */
            public Builder bookServiceCnt(Integer bookServiceCnt) {
                this.bookServiceCnt = bookServiceCnt;
                return this;
            }

            /**
             * GoodsServiceCnt.
             */
            public Builder goodsServiceCnt(Integer goodsServiceCnt) {
                this.goodsServiceCnt = goodsServiceCnt;
                return this;
            }

            /**
             * RepairServiceCnt.
             */
            public Builder repairServiceCnt(Integer repairServiceCnt) {
                this.repairServiceCnt = repairServiceCnt;
                return this;
            }

            /**
             * RoomServiceCnt.
             */
            public Builder roomServiceCnt(Integer roomServiceCnt) {
                this.roomServiceCnt = roomServiceCnt;
                return this;
            }

            public RoomServiceInfo build() {
                return new RoomServiceInfo(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("AuthAccounts")
        private java.util.List < AuthAccounts> authAccounts;

        @NameInMap("ConnectType")
        private String connectType;

        @NameInMap("CreatorAccountName")
        private String creatorAccountName;

        @NameInMap("DeviceInfos")
        private java.util.List < DeviceInfos> deviceInfos;

        @NameInMap("HotelId")
        private String hotelId;

        @NameInMap("HotelName")
        private String hotelName;

        @NameInMap("OtherService")
        private OtherService otherService;

        @NameInMap("RoomControlInfo")
        private RoomControlInfo roomControlInfo;

        @NameInMap("RoomNo")
        private String roomNo;

        @NameInMap("RoomServiceInfo")
        private RoomServiceInfo roomServiceInfo;

        private Result(Builder builder) {
            this.authAccounts = builder.authAccounts;
            this.connectType = builder.connectType;
            this.creatorAccountName = builder.creatorAccountName;
            this.deviceInfos = builder.deviceInfos;
            this.hotelId = builder.hotelId;
            this.hotelName = builder.hotelName;
            this.otherService = builder.otherService;
            this.roomControlInfo = builder.roomControlInfo;
            this.roomNo = builder.roomNo;
            this.roomServiceInfo = builder.roomServiceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return authAccounts
         */
        public java.util.List < AuthAccounts> getAuthAccounts() {
            return this.authAccounts;
        }

        /**
         * @return connectType
         */
        public String getConnectType() {
            return this.connectType;
        }

        /**
         * @return creatorAccountName
         */
        public String getCreatorAccountName() {
            return this.creatorAccountName;
        }

        /**
         * @return deviceInfos
         */
        public java.util.List < DeviceInfos> getDeviceInfos() {
            return this.deviceInfos;
        }

        /**
         * @return hotelId
         */
        public String getHotelId() {
            return this.hotelId;
        }

        /**
         * @return hotelName
         */
        public String getHotelName() {
            return this.hotelName;
        }

        /**
         * @return otherService
         */
        public OtherService getOtherService() {
            return this.otherService;
        }

        /**
         * @return roomControlInfo
         */
        public RoomControlInfo getRoomControlInfo() {
            return this.roomControlInfo;
        }

        /**
         * @return roomNo
         */
        public String getRoomNo() {
            return this.roomNo;
        }

        /**
         * @return roomServiceInfo
         */
        public RoomServiceInfo getRoomServiceInfo() {
            return this.roomServiceInfo;
        }

        public static final class Builder {
            private java.util.List < AuthAccounts> authAccounts; 
            private String connectType; 
            private String creatorAccountName; 
            private java.util.List < DeviceInfos> deviceInfos; 
            private String hotelId; 
            private String hotelName; 
            private OtherService otherService; 
            private RoomControlInfo roomControlInfo; 
            private String roomNo; 
            private RoomServiceInfo roomServiceInfo; 

            /**
             * AuthAccounts.
             */
            public Builder authAccounts(java.util.List < AuthAccounts> authAccounts) {
                this.authAccounts = authAccounts;
                return this;
            }

            /**
             * ConnectType.
             */
            public Builder connectType(String connectType) {
                this.connectType = connectType;
                return this;
            }

            /**
             * CreatorAccountName.
             */
            public Builder creatorAccountName(String creatorAccountName) {
                this.creatorAccountName = creatorAccountName;
                return this;
            }

            /**
             * DeviceInfos.
             */
            public Builder deviceInfos(java.util.List < DeviceInfos> deviceInfos) {
                this.deviceInfos = deviceInfos;
                return this;
            }

            /**
             * HotelId.
             */
            public Builder hotelId(String hotelId) {
                this.hotelId = hotelId;
                return this;
            }

            /**
             * HotelName.
             */
            public Builder hotelName(String hotelName) {
                this.hotelName = hotelName;
                return this;
            }

            /**
             * OtherService.
             */
            public Builder otherService(OtherService otherService) {
                this.otherService = otherService;
                return this;
            }

            /**
             * RoomControlInfo.
             */
            public Builder roomControlInfo(RoomControlInfo roomControlInfo) {
                this.roomControlInfo = roomControlInfo;
                return this;
            }

            /**
             * RoomNo.
             */
            public Builder roomNo(String roomNo) {
                this.roomNo = roomNo;
                return this;
            }

            /**
             * RoomServiceInfo.
             */
            public Builder roomServiceInfo(RoomServiceInfo roomServiceInfo) {
                this.roomServiceInfo = roomServiceInfo;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
