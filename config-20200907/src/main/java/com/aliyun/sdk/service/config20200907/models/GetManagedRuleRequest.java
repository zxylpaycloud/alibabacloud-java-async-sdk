// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetManagedRuleRequest} extends {@link RequestModel}
 *
 * <p>GetManagedRuleRequest</p>
 */
public class GetManagedRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Identifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identifier;

    private GetManagedRuleRequest(Builder builder) {
        super(builder);
        this.identifier = builder.identifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetManagedRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    public static final class Builder extends Request.Builder<GetManagedRuleRequest, Builder> {
        private String identifier; 

        private Builder() {
            super();
        } 

        private Builder(GetManagedRuleRequest request) {
            super(request);
            this.identifier = request.identifier;
        } 

        /**
         * The identifier of the managed rule.
         * <p>
         * 
         * For more information about how to obtain the identifier of a managed rule, see [ListManagedRules](~~421144~~).
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        @Override
        public GetManagedRuleRequest build() {
            return new GetManagedRuleRequest(this);
        } 

    } 

}
