// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetABMetricRequest} extends {@link RequestModel}
 *
 * <p>GetABMetricRequest</p>
 */
public class GetABMetricRequest extends Request {
    @Path
    @NameInMap("ABMetricId")
    @Validation(required = true)
    private String ABMetricId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetABMetricRequest(Builder builder) {
        super(builder);
        this.ABMetricId = builder.ABMetricId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetABMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ABMetricId
     */
    public String getABMetricId() {
        return this.ABMetricId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetABMetricRequest, Builder> {
        private String ABMetricId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetABMetricRequest request) {
            super(request);
            this.ABMetricId = request.ABMetricId;
            this.instanceId = request.instanceId;
        } 

        /**
         * ABMetricId.
         */
        public Builder ABMetricId(String ABMetricId) {
            this.putPathParameter("ABMetricId", ABMetricId);
            this.ABMetricId = ABMetricId;
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

        @Override
        public GetABMetricRequest build() {
            return new GetABMetricRequest(this);
        } 

    } 

}
