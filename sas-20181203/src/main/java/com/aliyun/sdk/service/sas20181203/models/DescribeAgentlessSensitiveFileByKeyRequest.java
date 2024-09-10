// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAgentlessSensitiveFileByKeyRequest} extends {@link RequestModel}
 *
 * <p>DescribeAgentlessSensitiveFileByKeyRequest</p>
 */
public class DescribeAgentlessSensitiveFileByKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUuid")
    private String imageUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanRange")
    private java.util.List < String > scanRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SensitiveFileKey")
    private String sensitiveFileKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeAgentlessSensitiveFileByKeyRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.imageUuid = builder.imageUuid;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.scanRange = builder.scanRange;
        this.sensitiveFileKey = builder.sensitiveFileKey;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAgentlessSensitiveFileByKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return imageUuid
     */
    public String getImageUuid() {
        return this.imageUuid;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return scanRange
     */
    public java.util.List < String > getScanRange() {
        return this.scanRange;
    }

    /**
     * @return sensitiveFileKey
     */
    public String getSensitiveFileKey() {
        return this.sensitiveFileKey;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeAgentlessSensitiveFileByKeyRequest, Builder> {
        private Integer currentPage; 
        private String imageUuid; 
        private String instanceId; 
        private Integer pageSize; 
        private String remark; 
        private java.util.List < String > scanRange; 
        private String sensitiveFileKey; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAgentlessSensitiveFileByKeyRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.imageUuid = request.imageUuid;
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.scanRange = request.scanRange;
            this.sensitiveFileKey = request.sensitiveFileKey;
            this.status = request.status;
        } 

        /**
         * The page number. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The UUID of the asset that is scanned. You can query the UUID on the Host or Cloud Product page. If you scan a host, set this parameter to the UUID of the scanned host. If you scan a snapshot or a custom image, set this parameter to the ID of the scanned snapshot or image.
         */
        public Builder imageUuid(String imageUuid) {
            this.putQueryParameter("ImageUuid", imageUuid);
            this.imageUuid = imageUuid;
            return this;
        }

        /**
         * The instance ID of the asset that is scanned. To query the instance ID, go to the Task Management page, click Details of a task, and then view the value of Check On.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.
         * <p>
         * 
         * >  We recommend that you do not leave this parameter empty.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The name or IP address of the asset.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * The types of the assets that are scanned.
         */
        public Builder scanRange(java.util.List < String > scanRange) {
            String scanRangeShrink = shrink(scanRange, "ScanRange", "json");
            this.putQueryParameter("ScanRange", scanRangeShrink);
            this.scanRange = scanRange;
            return this;
        }

        /**
         * The type of the sensitive file.
         */
        public Builder sensitiveFileKey(String sensitiveFileKey) {
            this.putQueryParameter("SensitiveFileKey", sensitiveFileKey);
            this.sensitiveFileKey = sensitiveFileKey;
            return this;
        }

        /**
         * The status of the baseline risk. Valid values:
         * <p>
         * 
         * *   **0**: unfixed.
         * *   **1**: fixed.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeAgentlessSensitiveFileByKeyRequest build() {
            return new DescribeAgentlessSensitiveFileByKeyRequest(this);
        } 

    } 

}
