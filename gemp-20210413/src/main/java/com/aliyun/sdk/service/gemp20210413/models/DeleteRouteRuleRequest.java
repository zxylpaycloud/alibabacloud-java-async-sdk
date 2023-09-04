// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRouteRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteRouteRuleRequest</p>
 */
public class DeleteRouteRuleRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("routeRuleId")
    @Validation(required = true)
    private Long routeRuleId;

    private DeleteRouteRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.routeRuleId = builder.routeRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRouteRuleRequest create() {
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
     * @return routeRuleId
     */
    public Long getRouteRuleId() {
        return this.routeRuleId;
    }

    public static final class Builder extends Request.Builder<DeleteRouteRuleRequest, Builder> {
        private String clientToken; 
        private Long routeRuleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRouteRuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.routeRuleId = request.routeRuleId;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * routeRuleId.
         */
        public Builder routeRuleId(Long routeRuleId) {
            this.putBodyParameter("routeRuleId", routeRuleId);
            this.routeRuleId = routeRuleId;
            return this;
        }

        @Override
        public DeleteRouteRuleRequest build() {
            return new DeleteRouteRuleRequest(this);
        } 

    } 

}
