// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewChangeInstanceRequest} extends {@link RequestModel}
 *
 * <p>RenewChangeInstanceRequest</p>
 */
public class RenewChangeInstanceRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Parameter")
    private java.util.List < Parameter> parameter;

    @Query
    @NameInMap("ProductCode")
    @Validation(required = true)
    private String productCode;

    @Query
    @NameInMap("ProductType")
    private String productType;

    @Query
    @NameInMap("RenewPeriod")
    @Validation(required = true)
    private Long renewPeriod;

    private RenewChangeInstanceRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.parameter = builder.parameter;
        this.productCode = builder.productCode;
        this.productType = builder.productType;
        this.renewPeriod = builder.renewPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewChangeInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return parameter
     */
    public java.util.List < Parameter> getParameter() {
        return this.parameter;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return renewPeriod
     */
    public Long getRenewPeriod() {
        return this.renewPeriod;
    }

    public static final class Builder extends Request.Builder<RenewChangeInstanceRequest, Builder> {
        private String clientToken; 
        private String instanceId; 
        private java.util.List < Parameter> parameter; 
        private String productCode; 
        private String productType; 
        private Long renewPeriod; 

        private Builder() {
            super();
        } 

        private Builder(RenewChangeInstanceRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.parameter = request.parameter;
            this.productCode = request.productCode;
            this.productType = request.productType;
            this.renewPeriod = request.renewPeriod;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Parameter.
         */
        public Builder parameter(java.util.List < Parameter> parameter) {
            this.putQueryParameter("Parameter", parameter);
            this.parameter = parameter;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putQueryParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * RenewPeriod.
         */
        public Builder renewPeriod(Long renewPeriod) {
            this.putQueryParameter("RenewPeriod", renewPeriod);
            this.renewPeriod = renewPeriod;
            return this;
        }

        @Override
        public RenewChangeInstanceRequest build() {
            return new RenewChangeInstanceRequest(this);
        } 

    } 

    public static class Parameter extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        private String code;

        @NameInMap("Value")
        @Validation(required = true)
        private String value;

        private Parameter(Builder builder) {
            this.code = builder.code;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameter create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String value; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Parameter build() {
                return new Parameter(this);
            } 

        } 

    }
}