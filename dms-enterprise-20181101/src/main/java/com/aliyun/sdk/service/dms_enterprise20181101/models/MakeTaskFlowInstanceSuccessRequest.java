// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MakeTaskFlowInstanceSuccessRequest} extends {@link RequestModel}
 *
 * <p>MakeTaskFlowInstanceSuccessRequest</p>
 */
public class MakeTaskFlowInstanceSuccessRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DagId")
    @Validation(required = true)
    private Long dagId;

    @Query
    @NameInMap("DagInstanceId")
    @Validation(required = true)
    private Long dagInstanceId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private MakeTaskFlowInstanceSuccessRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dagId = builder.dagId;
        this.dagInstanceId = builder.dagInstanceId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MakeTaskFlowInstanceSuccessRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return dagId
     */
    public Long getDagId() {
        return this.dagId;
    }

    /**
     * @return dagInstanceId
     */
    public Long getDagInstanceId() {
        return this.dagInstanceId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<MakeTaskFlowInstanceSuccessRequest, Builder> {
        private String regionId; 
        private Long dagId; 
        private Long dagInstanceId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(MakeTaskFlowInstanceSuccessRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dagId = request.dagId;
            this.dagInstanceId = request.dagInstanceId;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request. You can use the ID to query logs and troubleshoot issues.
         */
        public Builder dagId(Long dagId) {
            this.putQueryParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * {
         * <p>
         *     "RequestId": "028BF827-3801-5869-8548-F4A039256304",
         *     "ErrorCode": "UnknownError",
         *     "ErrorMessage": "UnknownError",
         *     "Success": true
         * }
         */
        public Builder dagInstanceId(Long dagInstanceId) {
            this.putQueryParameter("DagInstanceId", dagInstanceId);
            this.dagInstanceId = dagInstanceId;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public MakeTaskFlowInstanceSuccessRequest build() {
            return new MakeTaskFlowInstanceSuccessRequest(this);
        } 

    } 

}
