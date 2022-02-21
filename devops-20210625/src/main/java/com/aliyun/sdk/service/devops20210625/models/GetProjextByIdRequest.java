// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjextByIdRequest} extends {@link RequestModel}
 *
 * <p>GetProjextByIdRequest</p>
 */
public class GetProjextByIdRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("identifier")
    @Validation(required = true)
    private String identifier;

    @Query
    @NameInMap("accountId")
    @Validation(required = true)
    private String accountId;

    private GetProjextByIdRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.identifier = builder.identifier;
        this.accountId = builder.accountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjextByIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    public static final class Builder extends Request.Builder<GetProjextByIdRequest, Builder> {
        private String organizationId; 
        private String identifier; 
        private String accountId; 

        private Builder() {
            super();
        } 

        private Builder(GetProjextByIdRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.identifier = response.identifier;
            this.accountId = response.accountId;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * identifier.
         */
        public Builder identifier(String identifier) {
            this.putPathParameter("identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        @Override
        public GetProjextByIdRequest build() {
            return new GetProjextByIdRequest(this);
        } 

    } 

}
