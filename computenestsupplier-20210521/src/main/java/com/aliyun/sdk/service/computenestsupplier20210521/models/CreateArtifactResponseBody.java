// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateArtifactResponseBody} extends {@link TeaModel}
 *
 * <p>CreateArtifactResponseBody</p>
 */
public class CreateArtifactResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ArtifactId")
    private String artifactId;

    @com.aliyun.core.annotation.NameInMap("ArtifactProperty")
    private String artifactProperty;

    @com.aliyun.core.annotation.NameInMap("ArtifactType")
    private String artifactType;

    @com.aliyun.core.annotation.NameInMap("ArtifactVersion")
    private String artifactVersion;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("MaxVersion")
    private Long maxVersion;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SupportRegionIds")
    private String supportRegionIds;

    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private CreateArtifactResponseBody(Builder builder) {
        this.artifactId = builder.artifactId;
        this.artifactProperty = builder.artifactProperty;
        this.artifactType = builder.artifactType;
        this.artifactVersion = builder.artifactVersion;
        this.description = builder.description;
        this.gmtModified = builder.gmtModified;
        this.maxVersion = builder.maxVersion;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.supportRegionIds = builder.supportRegionIds;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateArtifactResponseBody create() {
        return builder().build();
    }

    /**
     * @return artifactId
     */
    public String getArtifactId() {
        return this.artifactId;
    }

    /**
     * @return artifactProperty
     */
    public String getArtifactProperty() {
        return this.artifactProperty;
    }

    /**
     * @return artifactType
     */
    public String getArtifactType() {
        return this.artifactType;
    }

    /**
     * @return artifactVersion
     */
    public String getArtifactVersion() {
        return this.artifactVersion;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return maxVersion
     */
    public Long getMaxVersion() {
        return this.maxVersion;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return supportRegionIds
     */
    public String getSupportRegionIds() {
        return this.supportRegionIds;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder {
        private String artifactId; 
        private String artifactProperty; 
        private String artifactType; 
        private String artifactVersion; 
        private String description; 
        private String gmtModified; 
        private Long maxVersion; 
        private String name; 
        private String requestId; 
        private String status; 
        private String supportRegionIds; 
        private String versionName; 

        /**
         * ArtifactId.
         */
        public Builder artifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }

        /**
         * ArtifactProperty.
         */
        public Builder artifactProperty(String artifactProperty) {
            this.artifactProperty = artifactProperty;
            return this;
        }

        /**
         * ArtifactType.
         */
        public Builder artifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }

        /**
         * ArtifactVersion.
         */
        public Builder artifactVersion(String artifactVersion) {
            this.artifactVersion = artifactVersion;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * MaxVersion.
         */
        public Builder maxVersion(Long maxVersion) {
            this.maxVersion = maxVersion;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * SupportRegionIds.
         */
        public Builder supportRegionIds(String supportRegionIds) {
            this.supportRegionIds = supportRegionIds;
            return this;
        }

        /**
         * VersionName.
         */
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            return this;
        }

        public CreateArtifactResponseBody build() {
            return new CreateArtifactResponseBody(this);
        } 

    } 

}
