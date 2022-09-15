// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGatewaySlbRequest} extends {@link RequestModel}
 *
 * <p>AddGatewaySlbRequest</p>
 */
public class AddGatewaySlbRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("GatewayUniqueId")
    @Validation(required = true)
    private String gatewayUniqueId;

    @Query
    @NameInMap("HttpPort")
    private Integer httpPort;

    @Query
    @NameInMap("HttpsPort")
    private Integer httpsPort;

    @Query
    @NameInMap("HttpsVServerGroupId")
    private String httpsVServerGroupId;

    @Query
    @NameInMap("MseSessionId")
    private String mseSessionId;

    @Query
    @NameInMap("ServiceWeight")
    private Integer serviceWeight;

    @Query
    @NameInMap("SlbId")
    @Validation(required = true)
    private String slbId;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("VServerGroupId")
    private String vServerGroupId;

    private AddGatewaySlbRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.httpPort = builder.httpPort;
        this.httpsPort = builder.httpsPort;
        this.httpsVServerGroupId = builder.httpsVServerGroupId;
        this.mseSessionId = builder.mseSessionId;
        this.serviceWeight = builder.serviceWeight;
        this.slbId = builder.slbId;
        this.type = builder.type;
        this.vServerGroupId = builder.vServerGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddGatewaySlbRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return httpPort
     */
    public Integer getHttpPort() {
        return this.httpPort;
    }

    /**
     * @return httpsPort
     */
    public Integer getHttpsPort() {
        return this.httpsPort;
    }

    /**
     * @return httpsVServerGroupId
     */
    public String getHttpsVServerGroupId() {
        return this.httpsVServerGroupId;
    }

    /**
     * @return mseSessionId
     */
    public String getMseSessionId() {
        return this.mseSessionId;
    }

    /**
     * @return serviceWeight
     */
    public Integer getServiceWeight() {
        return this.serviceWeight;
    }

    /**
     * @return slbId
     */
    public String getSlbId() {
        return this.slbId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vServerGroupId
     */
    public String getVServerGroupId() {
        return this.vServerGroupId;
    }

    public static final class Builder extends Request.Builder<AddGatewaySlbRequest, Builder> {
        private String acceptLanguage; 
        private String gatewayUniqueId; 
        private Integer httpPort; 
        private Integer httpsPort; 
        private String httpsVServerGroupId; 
        private String mseSessionId; 
        private Integer serviceWeight; 
        private String slbId; 
        private String type; 
        private String vServerGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AddGatewaySlbRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.httpPort = request.httpPort;
            this.httpsPort = request.httpsPort;
            this.httpsVServerGroupId = request.httpsVServerGroupId;
            this.mseSessionId = request.mseSessionId;
            this.serviceWeight = request.serviceWeight;
            this.slbId = request.slbId;
            this.type = request.type;
            this.vServerGroupId = request.vServerGroupId;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * HttpPort.
         */
        public Builder httpPort(Integer httpPort) {
            this.putQueryParameter("HttpPort", httpPort);
            this.httpPort = httpPort;
            return this;
        }

        /**
         * HttpsPort.
         */
        public Builder httpsPort(Integer httpsPort) {
            this.putQueryParameter("HttpsPort", httpsPort);
            this.httpsPort = httpsPort;
            return this;
        }

        /**
         * HttpsVServerGroupId.
         */
        public Builder httpsVServerGroupId(String httpsVServerGroupId) {
            this.putQueryParameter("HttpsVServerGroupId", httpsVServerGroupId);
            this.httpsVServerGroupId = httpsVServerGroupId;
            return this;
        }

        /**
         * MseSessionId.
         */
        public Builder mseSessionId(String mseSessionId) {
            this.putQueryParameter("MseSessionId", mseSessionId);
            this.mseSessionId = mseSessionId;
            return this;
        }

        /**
         * ServiceWeight.
         */
        public Builder serviceWeight(Integer serviceWeight) {
            this.putQueryParameter("ServiceWeight", serviceWeight);
            this.serviceWeight = serviceWeight;
            return this;
        }

        /**
         * SlbId.
         */
        public Builder slbId(String slbId) {
            this.putQueryParameter("SlbId", slbId);
            this.slbId = slbId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * VServerGroupId.
         */
        public Builder vServerGroupId(String vServerGroupId) {
            this.putQueryParameter("VServerGroupId", vServerGroupId);
            this.vServerGroupId = vServerGroupId;
            return this;
        }

        @Override
        public AddGatewaySlbRequest build() {
            return new AddGatewaySlbRequest(this);
        } 

    } 

}
