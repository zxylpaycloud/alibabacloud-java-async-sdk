// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceTypeRequest</p>
 */
public class ModifyInstanceTypeRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("CoreInstanceType")
    private String coreInstanceType;

    @Query
    @NameInMap("MasterInstanceType")
    private String masterInstanceType;

    private ModifyInstanceTypeRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.coreInstanceType = builder.coreInstanceType;
        this.masterInstanceType = builder.masterInstanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return coreInstanceType
     */
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    /**
     * @return masterInstanceType
     */
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceTypeRequest, Builder> {
        private String clusterId; 
        private String coreInstanceType; 
        private String masterInstanceType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceTypeRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.coreInstanceType = response.coreInstanceType;
            this.masterInstanceType = response.masterInstanceType;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * CoreInstanceType.
         */
        public Builder coreInstanceType(String coreInstanceType) {
            this.putQueryParameter("CoreInstanceType", coreInstanceType);
            this.coreInstanceType = coreInstanceType;
            return this;
        }

        /**
         * MasterInstanceType.
         */
        public Builder masterInstanceType(String masterInstanceType) {
            this.putQueryParameter("MasterInstanceType", masterInstanceType);
            this.masterInstanceType = masterInstanceType;
            return this;
        }

        @Override
        public ModifyInstanceTypeRequest build() {
            return new ModifyInstanceTypeRequest(this);
        } 

    } 

}
