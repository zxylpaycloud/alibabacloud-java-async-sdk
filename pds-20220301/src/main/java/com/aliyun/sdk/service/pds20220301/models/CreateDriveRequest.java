// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDriveRequest} extends {@link RequestModel}
 *
 * <p>CreateDriveRequest</p>
 */
public class CreateDriveRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("default")
    private Boolean _default;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024, minLength = 1)
    private String driveName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_type")
    private String driveType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("owner")
    @com.aliyun.core.annotation.Validation(required = true)
    private String owner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("owner_type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ownerType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("total_size")
    private Long totalSize;

    private CreateDriveRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this._default = builder._default;
        this.description = builder.description;
        this.driveName = builder.driveName;
        this.driveType = builder.driveType;
        this.owner = builder.owner;
        this.ownerType = builder.ownerType;
        this.status = builder.status;
        this.totalSize = builder.totalSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDriveRequest create() {
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
     * @return _default
     */
    public Boolean get_default() {
        return this._default;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return driveName
     */
    public String getDriveName() {
        return this.driveName;
    }

    /**
     * @return driveType
     */
    public String getDriveType() {
        return this.driveType;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return ownerType
     */
    public String getOwnerType() {
        return this.ownerType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return totalSize
     */
    public Long getTotalSize() {
        return this.totalSize;
    }

    public static final class Builder extends Request.Builder<CreateDriveRequest, Builder> {
        private String domainId; 
        private Boolean _default; 
        private String description; 
        private String driveName; 
        private String driveType; 
        private String owner; 
        private String ownerType; 
        private String status; 
        private Long totalSize; 

        private Builder() {
            super();
        } 

        private Builder(CreateDriveRequest request) {
            super(request);
            this.domainId = request.domainId;
            this._default = request._default;
            this.description = request.description;
            this.driveName = request.driveName;
            this.driveType = request.driveType;
            this.owner = request.owner;
            this.ownerType = request.ownerType;
            this.status = request.status;
            this.totalSize = request.totalSize;
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
         * Specifies whether the drive is the default drive. Default value: false.
         */
        public Builder _default(Boolean _default) {
            this.putBodyParameter("default", _default);
            this._default = _default;
            return this;
        }

        /**
         * The description of the drive. The description can be up to 1,024 characters in length.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the drive. The name can be up to 128 characters in length.
         */
        public Builder driveName(String driveName) {
            this.putBodyParameter("drive_name", driveName);
            this.driveName = driveName;
            return this;
        }

        /**
         * The type of the drive. Set the value to normal.
         */
        public Builder driveType(String driveType) {
            this.putBodyParameter("drive_type", driveType);
            this.driveType = driveType;
            return this;
        }

        /**
         * The owner of the drive.
         */
        public Builder owner(String owner) {
            this.putBodyParameter("owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * The type of the owner. Valid values:
         * <p>
         * 
         * user and group.
         */
        public Builder ownerType(String ownerType) {
            this.putBodyParameter("owner_type", ownerType);
            this.ownerType = ownerType;
            return this;
        }

        /**
         * The state of the drive. Valid values:
         * <p>
         * 
         * enabled and disabled.
         * 
         * Default value: enabled.
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * The total size of the drive. Unit: bytes. By default, the size is unlimited.
         */
        public Builder totalSize(Long totalSize) {
            this.putBodyParameter("total_size", totalSize);
            this.totalSize = totalSize;
            return this;
        }

        @Override
        public CreateDriveRequest build() {
            return new CreateDriveRequest(this);
        } 

    } 

}
