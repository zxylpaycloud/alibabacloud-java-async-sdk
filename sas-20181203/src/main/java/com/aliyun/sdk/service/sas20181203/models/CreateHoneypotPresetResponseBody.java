// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHoneypotPresetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHoneypotPresetResponseBody</p>
 */
public class CreateHoneypotPresetResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HoneypotPreset")
    private HoneypotPreset honeypotPreset;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateHoneypotPresetResponseBody(Builder builder) {
        this.code = builder.code;
        this.honeypotPreset = builder.honeypotPreset;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHoneypotPresetResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return honeypotPreset
     */
    public HoneypotPreset getHoneypotPreset() {
        return this.honeypotPreset;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private HoneypotPreset honeypotPreset; 
        private Integer httpStatusCode; 
        private String message; 
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
         * HoneypotPreset.
         */
        public Builder honeypotPreset(HoneypotPreset honeypotPreset) {
            this.honeypotPreset = honeypotPreset;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateHoneypotPresetResponseBody build() {
            return new CreateHoneypotPresetResponseBody(this);
        } 

    } 

    public static class HoneypotPreset extends TeaModel {
        @NameInMap("HoneypotPresetId")
        private String honeypotPresetId;

        private HoneypotPreset(Builder builder) {
            this.honeypotPresetId = builder.honeypotPresetId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HoneypotPreset create() {
            return builder().build();
        }

        /**
         * @return honeypotPresetId
         */
        public String getHoneypotPresetId() {
            return this.honeypotPresetId;
        }

        public static final class Builder {
            private String honeypotPresetId; 

            /**
             * HoneypotPresetId.
             */
            public Builder honeypotPresetId(String honeypotPresetId) {
                this.honeypotPresetId = honeypotPresetId;
                return this;
            }

            public HoneypotPreset build() {
                return new HoneypotPreset(this);
            } 

        } 

    }
}
