// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCollectionDataResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCollectionDataResponseBody</p>
 */
public class DeleteCollectionDataResponseBody extends TeaModel {
    @NameInMap("AppliedRows")
    private Long appliedRows;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private DeleteCollectionDataResponseBody(Builder builder) {
        this.appliedRows = builder.appliedRows;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCollectionDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return appliedRows
     */
    public Long getAppliedRows() {
        return this.appliedRows;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Long appliedRows; 
        private String message; 
        private String requestId; 
        private String status; 

        /**
         * The number of rows that are affected by the request.
         */
        public Builder appliedRows(Long appliedRows) {
            this.appliedRows = appliedRows;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **success**
         * *   **fail**
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DeleteCollectionDataResponseBody build() {
            return new DeleteCollectionDataResponseBody(this);
        } 

    } 

}
