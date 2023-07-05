// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Version} extends {@link TeaModel}
 *
 * <p>Version</p>
 */
public class Version extends TeaModel {
    @NameInMap("createdTime")
    private String createdTime;

    @NameInMap("description")
    private String description;

    @NameInMap("functionVersionArn")
    private String functionVersionArn;

    @NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @NameInMap("versionId")
    private String versionId;

    private Version(Builder builder) {
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.functionVersionArn = builder.functionVersionArn;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Version create() {
        return builder().build();
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return functionVersionArn
     */
    public String getFunctionVersionArn() {
        return this.functionVersionArn;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder {
        private String createdTime; 
        private String description; 
        private String functionVersionArn; 
        private String lastModifiedTime; 
        private String versionId; 

        /**
         * createdTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * functionVersionArn.
         */
        public Builder functionVersionArn(String functionVersionArn) {
            this.functionVersionArn = functionVersionArn;
            return this;
        }

        /**
         * lastModifiedTime.
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * versionId.
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        public Version build() {
            return new Version(this);
        } 

    } 

}