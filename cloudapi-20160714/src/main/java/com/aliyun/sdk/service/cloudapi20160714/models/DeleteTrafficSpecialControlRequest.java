// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTrafficSpecialControlRequest} extends {@link RequestModel}
 *
 * <p>DeleteTrafficSpecialControlRequest</p>
 */
public class DeleteTrafficSpecialControlRequest extends Request {
    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("SpecialKey")
    @Validation(required = true)
    private String specialKey;

    @Query
    @NameInMap("SpecialType")
    @Validation(required = true)
    private String specialType;

    @Query
    @NameInMap("TrafficControlId")
    @Validation(required = true)
    private String trafficControlId;

    private DeleteTrafficSpecialControlRequest(Builder builder) {
        super(builder);
        this.securityToken = builder.securityToken;
        this.specialKey = builder.specialKey;
        this.specialType = builder.specialType;
        this.trafficControlId = builder.trafficControlId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTrafficSpecialControlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return specialKey
     */
    public String getSpecialKey() {
        return this.specialKey;
    }

    /**
     * @return specialType
     */
    public String getSpecialType() {
        return this.specialType;
    }

    /**
     * @return trafficControlId
     */
    public String getTrafficControlId() {
        return this.trafficControlId;
    }

    public static final class Builder extends Request.Builder<DeleteTrafficSpecialControlRequest, Builder> {
        private String securityToken; 
        private String specialKey; 
        private String specialType; 
        private String trafficControlId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTrafficSpecialControlRequest request) {
            super(request);
            this.securityToken = request.securityToken;
            this.specialKey = request.specialKey;
            this.specialType = request.specialType;
            this.trafficControlId = request.trafficControlId;
        } 

        /**
         * The security token included in the WebSocket request header. The system uses this token to authenticate the request.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * The ID of the app or Alibaba Cloud account. You can view your account ID on the [Account Management](https://account.console.aliyun.com/?spm=a2c4g.11186623.2.15.343130a8sDi8cO#/secure) page.
         */
        public Builder specialKey(String specialKey) {
            this.putQueryParameter("SpecialKey", specialKey);
            this.specialKey = specialKey;
            return this;
        }

        /**
         * The type of the special throttling policy. Valid values:
         * <p>
         * 
         * *   **APP**
         * *   **USER**
         */
        public Builder specialType(String specialType) {
            this.putQueryParameter("SpecialType", specialType);
            this.specialType = specialType;
            return this;
        }

        /**
         * The ID of the throttling policy.
         */
        public Builder trafficControlId(String trafficControlId) {
            this.putQueryParameter("TrafficControlId", trafficControlId);
            this.trafficControlId = trafficControlId;
            return this;
        }

        @Override
        public DeleteTrafficSpecialControlRequest build() {
            return new DeleteTrafficSpecialControlRequest(this);
        } 

    } 

}
