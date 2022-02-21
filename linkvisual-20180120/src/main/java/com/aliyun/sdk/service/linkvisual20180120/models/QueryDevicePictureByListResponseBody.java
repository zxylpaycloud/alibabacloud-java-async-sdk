// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDevicePictureByListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDevicePictureByListResponseBody</p>
 */
public class QueryDevicePictureByListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryDevicePictureByListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDevicePictureByListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDevicePictureByListResponseBody build() {
            return new QueryDevicePictureByListResponseBody(this);
        } 

    } 

    public static class PicData extends TeaModel {
        @NameInMap("IotId")
        private String iotId;

        @NameInMap("PicCreateTime")
        private Long picCreateTime;

        @NameInMap("PicId")
        private String picId;

        @NameInMap("PicUrl")
        private String picUrl;

        @NameInMap("ThumbUrl")
        private String thumbUrl;

        private PicData(Builder builder) {
            this.iotId = builder.iotId;
            this.picCreateTime = builder.picCreateTime;
            this.picId = builder.picId;
            this.picUrl = builder.picUrl;
            this.thumbUrl = builder.thumbUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PicData create() {
            return builder().build();
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return picCreateTime
         */
        public Long getPicCreateTime() {
            return this.picCreateTime;
        }

        /**
         * @return picId
         */
        public String getPicId() {
            return this.picId;
        }

        /**
         * @return picUrl
         */
        public String getPicUrl() {
            return this.picUrl;
        }

        /**
         * @return thumbUrl
         */
        public String getThumbUrl() {
            return this.thumbUrl;
        }

        public static final class Builder {
            private String iotId; 
            private Long picCreateTime; 
            private String picId; 
            private String picUrl; 
            private String thumbUrl; 

            /**
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * PicCreateTime.
             */
            public Builder picCreateTime(Long picCreateTime) {
                this.picCreateTime = picCreateTime;
                return this;
            }

            /**
             * PicId.
             */
            public Builder picId(String picId) {
                this.picId = picId;
                return this;
            }

            /**
             * PicUrl.
             */
            public Builder picUrl(String picUrl) {
                this.picUrl = picUrl;
                return this;
            }

            /**
             * ThumbUrl.
             */
            public Builder thumbUrl(String thumbUrl) {
                this.thumbUrl = thumbUrl;
                return this;
            }

            public PicData build() {
                return new PicData(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("picData")
        private java.util.List < PicData> picData;

        private Data(Builder builder) {
            this.picData = builder.picData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return picData
         */
        public java.util.List < PicData> getPicData() {
            return this.picData;
        }

        public static final class Builder {
            private java.util.List < PicData> picData; 

            /**
             * picData.
             */
            public Builder picData(java.util.List < PicData> picData) {
                this.picData = picData;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
