// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteDataExportRequest} extends {@link RequestModel}
 *
 * <p>ExecuteDataExportRequest</p>
 */
public class ExecuteDataExportRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionDetail")
    private java.util.Map < String, ? > actionDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RealLoginUserUid")
    private String realLoginUserUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    private ExecuteDataExportRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.actionDetail = builder.actionDetail;
        this.orderId = builder.orderId;
        this.realLoginUserUid = builder.realLoginUserUid;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteDataExportRequest create() {
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
     * @return actionDetail
     */
    public java.util.Map < String, ? > getActionDetail() {
        return this.actionDetail;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return realLoginUserUid
     */
    public String getRealLoginUserUid() {
        return this.realLoginUserUid;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ExecuteDataExportRequest, Builder> {
        private String regionId; 
        private java.util.Map < String, ? > actionDetail; 
        private Long orderId; 
        private String realLoginUserUid; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteDataExportRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.actionDetail = request.actionDetail;
            this.orderId = request.orderId;
            this.realLoginUserUid = request.realLoginUserUid;
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
         * The parameters that are required to perform the operation:
         * <p>
         * 
         * ```json
         * {
         *    "fileType": "CSV", // The format of the exported file.
         *    "encoding": "" // The encoding format.
         *  }
         * ```
         */
        public Builder actionDetail(java.util.Map < String, ? > actionDetail) {
            String actionDetailShrink = shrink(actionDetail, "ActionDetail", "json");
            this.putQueryParameter("ActionDetail", actionDetailShrink);
            this.actionDetail = actionDetail;
            return this;
        }

        /**
         * The ID of the ticket.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * RealLoginUserUid.
         */
        public Builder realLoginUserUid(String realLoginUserUid) {
            this.putQueryParameter("RealLoginUserUid", realLoginUserUid);
            this.realLoginUserUid = realLoginUserUid;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * > : To view the ID of the tenant, log on to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [Manage DMS tenants](~~181330~~).
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ExecuteDataExportRequest build() {
            return new ExecuteDataExportRequest(this);
        } 

    } 

}
