// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelOperationPlanRequest} extends {@link RequestModel}
 *
 * <p>CancelOperationPlanRequest</p>
 */
public class CancelOperationPlanRequest extends Request {
    @Path
    @NameInMap("plan_id")
    private String planId;

    private CancelOperationPlanRequest(Builder builder) {
        super(builder);
        this.planId = builder.planId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelOperationPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    public static final class Builder extends Request.Builder<CancelOperationPlanRequest, Builder> {
        private String planId; 

        private Builder() {
            super();
        } 

        private Builder(CancelOperationPlanRequest request) {
            super(request);
            this.planId = request.planId;
        } 

        /**
         * plan_id.
         */
        public Builder planId(String planId) {
            this.putPathParameter("plan_id", planId);
            this.planId = planId;
            return this;
        }

        @Override
        public CancelOperationPlanRequest build() {
            return new CancelOperationPlanRequest(this);
        } 

    } 

}
