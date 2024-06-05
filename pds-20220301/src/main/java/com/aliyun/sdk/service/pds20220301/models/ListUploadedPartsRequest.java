// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUploadedPartsRequest} extends {@link RequestModel}
 *
 * <p>ListUploadedPartsRequest</p>
 */
public class ListUploadedPartsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("file_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("part_number_marker")
    private Integer partNumberMarker;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("share_id")
    private String shareId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("upload_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uploadId;

    private ListUploadedPartsRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.limit = builder.limit;
        this.partNumberMarker = builder.partNumberMarker;
        this.shareId = builder.shareId;
        this.uploadId = builder.uploadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUploadedPartsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return partNumberMarker
     */
    public Integer getPartNumberMarker() {
        return this.partNumberMarker;
    }

    /**
     * @return shareId
     */
    public String getShareId() {
        return this.shareId;
    }

    /**
     * @return uploadId
     */
    public String getUploadId() {
        return this.uploadId;
    }

    public static final class Builder extends Request.Builder<ListUploadedPartsRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private String fileId; 
        private Integer limit; 
        private Integer partNumberMarker; 
        private String shareId; 
        private String uploadId; 

        private Builder() {
            super();
        } 

        private Builder(ListUploadedPartsRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
            this.fileId = request.fileId;
            this.limit = request.limit;
            this.partNumberMarker = request.partNumberMarker;
            this.shareId = request.shareId;
            this.uploadId = request.uploadId;
        } 

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * The drive ID. This parameter is required if the file is not uploaded by using the share URL of the file.
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * The file ID.
         */
        public Builder fileId(String fileId) {
            this.putBodyParameter("file_id", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * The maximum number of results to return. Valid values: 1 to 100. Default value: 100.
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker. By default, this parameter is left empty.
         */
        public Builder partNumberMarker(Integer partNumberMarker) {
            this.putBodyParameter("part_number_marker", partNumberMarker);
            this.partNumberMarker = partNumberMarker;
            return this;
        }

        /**
         * The share ID. This parameter is required if the file is uploaded by using the share URL of the file.
         */
        public Builder shareId(String shareId) {
            this.putBodyParameter("share_id", shareId);
            this.shareId = shareId;
            return this;
        }

        /**
         * The ID of the upload task.
         */
        public Builder uploadId(String uploadId) {
            this.putBodyParameter("upload_id", uploadId);
            this.uploadId = uploadId;
            return this;
        }

        @Override
        public ListUploadedPartsRequest build() {
            return new ListUploadedPartsRequest(this);
        } 

    } 

}
