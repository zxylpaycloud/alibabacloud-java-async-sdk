// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIntegratedServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetIntegratedServiceStatusResponseBody</p>
 */
public class GetIntegratedServiceStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    private Boolean data;

    @NameInMap("IntegratedTypes")
    private String integratedTypes;

    @NameInMap("RequestId")
    private String requestId;

    private GetIntegratedServiceStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.integratedTypes = builder.integratedTypes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIntegratedServiceStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Boolean getData() {
        return this.data;
    }

    /**
     * @return integratedTypes
     */
    public String getIntegratedTypes() {
        return this.integratedTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean data; 
        private String integratedTypes; 
        private String requestId; 

        /**
         * Indicates whether the product has been integrated. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder data(Boolean data) {
            this.data = data;
            return this;
        }

        /**
         * IntegratedTypes.
         */
        public Builder integratedTypes(String integratedTypes) {
            this.integratedTypes = integratedTypes;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIntegratedServiceStatusResponseBody build() {
            return new GetIntegratedServiceStatusResponseBody(this);
        } 

    } 

}
