// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenApiCallbackResponseBody} extends {@link TeaModel}
 *
 * <p>OpenApiCallbackResponseBody</p>
 */
public class OpenApiCallbackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("ResultContent")
    private String resultContent;

    private OpenApiCallbackResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultCode = builder.resultCode;
        this.resultContent = builder.resultContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenApiCallbackResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultContent
     */
    public String getResultContent() {
        return this.resultContent;
    }

    public static final class Builder {
        private String requestId; 
        private String resultCode; 
        private String resultContent; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultContent.
         */
        public Builder resultContent(String resultContent) {
            this.resultContent = resultContent;
            return this;
        }

        public OpenApiCallbackResponseBody build() {
            return new OpenApiCallbackResponseBody(this);
        } 

    } 

}