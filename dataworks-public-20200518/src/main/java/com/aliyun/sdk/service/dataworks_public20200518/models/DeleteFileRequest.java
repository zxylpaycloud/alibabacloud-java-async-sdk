// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFileRequest} extends {@link RequestModel}
 *
 * <p>DeleteFileRequest</p>
 */
public class DeleteFileRequest extends Request {
    @Body
    @NameInMap("FileId")
    @Validation(required = true)
    private Long fileId;

    @Body
    @NameInMap("ProjectId")
    private Long projectId;

    @Body
    @NameInMap("ProjectIdentifier")
    private String projectIdentifier;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteFileRequest(Builder builder) {
        super(builder);
        this.fileId = builder.fileId;
        this.projectId = builder.projectId;
        this.projectIdentifier = builder.projectIdentifier;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileId
     */
    public Long getFileId() {
        return this.fileId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectIdentifier
     */
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteFileRequest, Builder> {
        private Long fileId; 
        private Long projectId; 
        private String projectIdentifier; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFileRequest request) {
            super(request);
            this.fileId = request.fileId;
            this.projectId = request.projectId;
            this.projectIdentifier = request.projectIdentifier;
            this.regionId = request.regionId;
        } 

        /**
         * FileId.
         */
        public Builder fileId(Long fileId) {
            this.putBodyParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * ProjectIdentifier.
         */
        public Builder projectIdentifier(String projectIdentifier) {
            this.putBodyParameter("ProjectIdentifier", projectIdentifier);
            this.projectIdentifier = projectIdentifier;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteFileRequest build() {
            return new DeleteFileRequest(this);
        } 

    } 

}
