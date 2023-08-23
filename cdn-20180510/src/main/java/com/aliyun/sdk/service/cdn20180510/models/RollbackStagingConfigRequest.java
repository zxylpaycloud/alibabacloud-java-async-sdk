// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RollbackStagingConfigRequest} extends {@link RequestModel}
 *
 * <p>RollbackStagingConfigRequest</p>
 */
public class RollbackStagingConfigRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    private RollbackStagingConfigRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackStagingConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    public static final class Builder extends Request.Builder<RollbackStagingConfigRequest, Builder> {
        private String domainName; 

        private Builder() {
            super();
        } 

        private Builder(RollbackStagingConfigRequest request) {
            super(request);
            this.domainName = request.domainName;
        } 

        /**
         * The accelerated domain name. You can specify only one domain name in each request.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        @Override
        public RollbackStagingConfigRequest build() {
            return new RollbackStagingConfigRequest(this);
        } 

    } 

}
