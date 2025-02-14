// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInvocationResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeInvocationResultRequest</p>
 */
public class DescribeInvocationResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InvokeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String invokeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeInvocationResultRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.invokeId = builder.invokeId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInvocationResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return invokeId
     */
    public String getInvokeId() {
        return this.invokeId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeInvocationResultRequest, Builder> {
        private String instanceId; 
        private String invokeId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInvocationResultRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.invokeId = request.invokeId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the simple application server.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The execution ID. You can call the [DescribeInvocations](~~439368~~) operation to query execution IDs.
         */
        public Builder invokeId(String invokeId) {
            this.putQueryParameter("InvokeId", invokeId);
            this.invokeId = invokeId;
            return this;
        }

        /**
         * The region ID of the simple application server. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeInvocationResultRequest build() {
            return new DescribeInvocationResultRequest(this);
        } 

    } 

}
