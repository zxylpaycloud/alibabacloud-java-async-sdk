// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveVSwitchesFromEpnInstanceRequest} extends {@link RequestModel}
 *
 * <p>RemoveVSwitchesFromEpnInstanceRequest</p>
 */
public class RemoveVSwitchesFromEpnInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EPNInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String EPNInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchesInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchesInfo;

    private RemoveVSwitchesFromEpnInstanceRequest(Builder builder) {
        super(builder);
        this.EPNInstanceId = builder.EPNInstanceId;
        this.vSwitchesInfo = builder.vSwitchesInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveVSwitchesFromEpnInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return EPNInstanceId
     */
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

    /**
     * @return vSwitchesInfo
     */
    public String getVSwitchesInfo() {
        return this.vSwitchesInfo;
    }

    public static final class Builder extends Request.Builder<RemoveVSwitchesFromEpnInstanceRequest, Builder> {
        private String EPNInstanceId; 
        private String vSwitchesInfo; 

        private Builder() {
            super();
        } 

        private Builder(RemoveVSwitchesFromEpnInstanceRequest request) {
            super(request);
            this.EPNInstanceId = request.EPNInstanceId;
            this.vSwitchesInfo = request.vSwitchesInfo;
        } 

        /**
         * The ID of theEPN instance.
         */
        public Builder EPNInstanceId(String EPNInstanceId) {
            this.putQueryParameter("EPNInstanceId", EPNInstanceId);
            this.EPNInstanceId = EPNInstanceId;
            return this;
        }

        /**
         * The internal networking information that you want to delete.
         */
        public Builder vSwitchesInfo(String vSwitchesInfo) {
            this.putQueryParameter("VSwitchesInfo", vSwitchesInfo);
            this.vSwitchesInfo = vSwitchesInfo;
            return this;
        }

        @Override
        public RemoveVSwitchesFromEpnInstanceRequest build() {
            return new RemoveVSwitchesFromEpnInstanceRequest(this);
        } 

    } 

}
