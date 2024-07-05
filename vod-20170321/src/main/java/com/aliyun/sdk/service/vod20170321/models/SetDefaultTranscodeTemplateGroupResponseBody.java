// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDefaultTranscodeTemplateGroupResponseBody} extends {@link TeaModel}
 *
 * <p>SetDefaultTranscodeTemplateGroupResponseBody</p>
 */
public class SetDefaultTranscodeTemplateGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetDefaultTranscodeTemplateGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDefaultTranscodeTemplateGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetDefaultTranscodeTemplateGroupResponseBody build() {
            return new SetDefaultTranscodeTemplateGroupResponseBody(this);
        } 

    } 

}
