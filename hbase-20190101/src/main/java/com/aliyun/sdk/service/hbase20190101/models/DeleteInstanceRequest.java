// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteInstanceRequest</p>
 */
public class DeleteInstanceRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ImmediateDeleteFlag")
    private Boolean immediateDeleteFlag;

    private DeleteInstanceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.immediateDeleteFlag = builder.immediateDeleteFlag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteInstanceRequest create() {
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
     * @return immediateDeleteFlag
     */
    public Boolean getImmediateDeleteFlag() {
        return this.immediateDeleteFlag;
    }

    public static final class Builder extends Request.Builder<DeleteInstanceRequest, Builder> {
        private String clusterId; 
        private Boolean immediateDeleteFlag; 

        private Builder() {
            super();
        } 

        private Builder(DeleteInstanceRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.immediateDeleteFlag = response.immediateDeleteFlag;
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
         * ImmediateDeleteFlag.
         */
        public Builder immediateDeleteFlag(Boolean immediateDeleteFlag) {
            this.putQueryParameter("ImmediateDeleteFlag", immediateDeleteFlag);
            this.immediateDeleteFlag = immediateDeleteFlag;
            return this;
        }

        @Override
        public DeleteInstanceRequest build() {
            return new DeleteInstanceRequest(this);
        } 

    } 

}
