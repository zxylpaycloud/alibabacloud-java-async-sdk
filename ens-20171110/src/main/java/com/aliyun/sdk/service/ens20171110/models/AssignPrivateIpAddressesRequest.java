// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssignPrivateIpAddressesRequest} extends {@link RequestModel}
 *
 * <p>AssignPrivateIpAddressesRequest</p>
 */
public class AssignPrivateIpAddressesRequest extends Request {
    @Query
    @NameInMap("NetworkInterfaceId")
    @Validation(required = true)
    private String networkInterfaceId;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    private AssignPrivateIpAddressesRequest(Builder builder) {
        super(builder);
        this.networkInterfaceId = builder.networkInterfaceId;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssignPrivateIpAddressesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<AssignPrivateIpAddressesRequest, Builder> {
        private String networkInterfaceId; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(AssignPrivateIpAddressesRequest request) {
            super(request);
            this.networkInterfaceId = request.networkInterfaceId;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * The ID of the ENI.
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putQueryParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        /**
         * The ID of the vSwitch.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public AssignPrivateIpAddressesRequest build() {
            return new AssignPrivateIpAddressesRequest(this);
        } 

    } 

}
