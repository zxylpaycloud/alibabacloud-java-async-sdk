// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateRepoTagResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRepoTagResponseBody</p>
 */
public class CreateRepoTagResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;


    private CreateRepoTagResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepoTagResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 

        /**
         * <p>Response code
</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Successful
</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Request ID
</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateRepoTagResponseBody build() {
            return new CreateRepoTagResponseBody(this);
        } 

    } 

}
