// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RelateDbForHBaseHaRequest} extends {@link RequestModel}
 *
 * <p>RelateDbForHBaseHaRequest</p>
 */
public class RelateDbForHBaseHaRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("HaActive")
    @Validation(required = true)
    private String haActive;

    @Query
    @NameInMap("HaActiveClusterKey")
    private String haActiveClusterKey;

    @Query
    @NameInMap("HaActiveDBType")
    @Validation(required = true)
    private String haActiveDBType;

    @Query
    @NameInMap("HaActiveHbaseFsDir")
    private String haActiveHbaseFsDir;

    @Query
    @NameInMap("HaActiveHdfsUri")
    private String haActiveHdfsUri;

    @Query
    @NameInMap("HaActivePassword")
    private String haActivePassword;

    @Query
    @NameInMap("HaActiveUser")
    private String haActiveUser;

    @Query
    @NameInMap("HaActiveVersion")
    private String haActiveVersion;

    @Query
    @NameInMap("HaMigrateType")
    @Validation(required = true)
    private String haMigrateType;

    @Query
    @NameInMap("HaStandby")
    @Validation(required = true)
    private String haStandby;

    @Query
    @NameInMap("HaStandbyClusterKey")
    private String haStandbyClusterKey;

    @Query
    @NameInMap("HaStandbyDBType")
    @Validation(required = true)
    private String haStandbyDBType;

    @Query
    @NameInMap("HaStandbyHbaseFsDir")
    private String haStandbyHbaseFsDir;

    @Query
    @NameInMap("HaStandbyHdfsUri")
    private String haStandbyHdfsUri;

    @Query
    @NameInMap("HaStandbyPassword")
    private String haStandbyPassword;

    @Query
    @NameInMap("HaStandbyUser")
    private String haStandbyUser;

    @Query
    @NameInMap("HaStandbyVersion")
    private String haStandbyVersion;

    @Query
    @NameInMap("HaTables")
    private String haTables;

    @Query
    @NameInMap("IsActiveStandard")
    @Validation(required = true)
    private Boolean isActiveStandard;

    @Query
    @NameInMap("IsStandbyStandard")
    @Validation(required = true)
    private Boolean isStandbyStandard;

    private RelateDbForHBaseHaRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.haActive = builder.haActive;
        this.haActiveClusterKey = builder.haActiveClusterKey;
        this.haActiveDBType = builder.haActiveDBType;
        this.haActiveHbaseFsDir = builder.haActiveHbaseFsDir;
        this.haActiveHdfsUri = builder.haActiveHdfsUri;
        this.haActivePassword = builder.haActivePassword;
        this.haActiveUser = builder.haActiveUser;
        this.haActiveVersion = builder.haActiveVersion;
        this.haMigrateType = builder.haMigrateType;
        this.haStandby = builder.haStandby;
        this.haStandbyClusterKey = builder.haStandbyClusterKey;
        this.haStandbyDBType = builder.haStandbyDBType;
        this.haStandbyHbaseFsDir = builder.haStandbyHbaseFsDir;
        this.haStandbyHdfsUri = builder.haStandbyHdfsUri;
        this.haStandbyPassword = builder.haStandbyPassword;
        this.haStandbyUser = builder.haStandbyUser;
        this.haStandbyVersion = builder.haStandbyVersion;
        this.haTables = builder.haTables;
        this.isActiveStandard = builder.isActiveStandard;
        this.isStandbyStandard = builder.isStandbyStandard;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RelateDbForHBaseHaRequest create() {
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
     * @return haActive
     */
    public String getHaActive() {
        return this.haActive;
    }

    /**
     * @return haActiveClusterKey
     */
    public String getHaActiveClusterKey() {
        return this.haActiveClusterKey;
    }

    /**
     * @return haActiveDBType
     */
    public String getHaActiveDBType() {
        return this.haActiveDBType;
    }

    /**
     * @return haActiveHbaseFsDir
     */
    public String getHaActiveHbaseFsDir() {
        return this.haActiveHbaseFsDir;
    }

    /**
     * @return haActiveHdfsUri
     */
    public String getHaActiveHdfsUri() {
        return this.haActiveHdfsUri;
    }

    /**
     * @return haActivePassword
     */
    public String getHaActivePassword() {
        return this.haActivePassword;
    }

    /**
     * @return haActiveUser
     */
    public String getHaActiveUser() {
        return this.haActiveUser;
    }

    /**
     * @return haActiveVersion
     */
    public String getHaActiveVersion() {
        return this.haActiveVersion;
    }

    /**
     * @return haMigrateType
     */
    public String getHaMigrateType() {
        return this.haMigrateType;
    }

    /**
     * @return haStandby
     */
    public String getHaStandby() {
        return this.haStandby;
    }

    /**
     * @return haStandbyClusterKey
     */
    public String getHaStandbyClusterKey() {
        return this.haStandbyClusterKey;
    }

    /**
     * @return haStandbyDBType
     */
    public String getHaStandbyDBType() {
        return this.haStandbyDBType;
    }

    /**
     * @return haStandbyHbaseFsDir
     */
    public String getHaStandbyHbaseFsDir() {
        return this.haStandbyHbaseFsDir;
    }

    /**
     * @return haStandbyHdfsUri
     */
    public String getHaStandbyHdfsUri() {
        return this.haStandbyHdfsUri;
    }

    /**
     * @return haStandbyPassword
     */
    public String getHaStandbyPassword() {
        return this.haStandbyPassword;
    }

    /**
     * @return haStandbyUser
     */
    public String getHaStandbyUser() {
        return this.haStandbyUser;
    }

    /**
     * @return haStandbyVersion
     */
    public String getHaStandbyVersion() {
        return this.haStandbyVersion;
    }

    /**
     * @return haTables
     */
    public String getHaTables() {
        return this.haTables;
    }

    /**
     * @return isActiveStandard
     */
    public Boolean getIsActiveStandard() {
        return this.isActiveStandard;
    }

    /**
     * @return isStandbyStandard
     */
    public Boolean getIsStandbyStandard() {
        return this.isStandbyStandard;
    }

    public static final class Builder extends Request.Builder<RelateDbForHBaseHaRequest, Builder> {
        private String clusterId; 
        private String haActive; 
        private String haActiveClusterKey; 
        private String haActiveDBType; 
        private String haActiveHbaseFsDir; 
        private String haActiveHdfsUri; 
        private String haActivePassword; 
        private String haActiveUser; 
        private String haActiveVersion; 
        private String haMigrateType; 
        private String haStandby; 
        private String haStandbyClusterKey; 
        private String haStandbyDBType; 
        private String haStandbyHbaseFsDir; 
        private String haStandbyHdfsUri; 
        private String haStandbyPassword; 
        private String haStandbyUser; 
        private String haStandbyVersion; 
        private String haTables; 
        private Boolean isActiveStandard; 
        private Boolean isStandbyStandard; 

        private Builder() {
            super();
        } 

        private Builder(RelateDbForHBaseHaRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.haActive = response.haActive;
            this.haActiveClusterKey = response.haActiveClusterKey;
            this.haActiveDBType = response.haActiveDBType;
            this.haActiveHbaseFsDir = response.haActiveHbaseFsDir;
            this.haActiveHdfsUri = response.haActiveHdfsUri;
            this.haActivePassword = response.haActivePassword;
            this.haActiveUser = response.haActiveUser;
            this.haActiveVersion = response.haActiveVersion;
            this.haMigrateType = response.haMigrateType;
            this.haStandby = response.haStandby;
            this.haStandbyClusterKey = response.haStandbyClusterKey;
            this.haStandbyDBType = response.haStandbyDBType;
            this.haStandbyHbaseFsDir = response.haStandbyHbaseFsDir;
            this.haStandbyHdfsUri = response.haStandbyHdfsUri;
            this.haStandbyPassword = response.haStandbyPassword;
            this.haStandbyUser = response.haStandbyUser;
            this.haStandbyVersion = response.haStandbyVersion;
            this.haTables = response.haTables;
            this.isActiveStandard = response.isActiveStandard;
            this.isStandbyStandard = response.isStandbyStandard;
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
         * HaActive.
         */
        public Builder haActive(String haActive) {
            this.putQueryParameter("HaActive", haActive);
            this.haActive = haActive;
            return this;
        }

        /**
         * HaActiveClusterKey.
         */
        public Builder haActiveClusterKey(String haActiveClusterKey) {
            this.putQueryParameter("HaActiveClusterKey", haActiveClusterKey);
            this.haActiveClusterKey = haActiveClusterKey;
            return this;
        }

        /**
         * HaActiveDBType.
         */
        public Builder haActiveDBType(String haActiveDBType) {
            this.putQueryParameter("HaActiveDBType", haActiveDBType);
            this.haActiveDBType = haActiveDBType;
            return this;
        }

        /**
         * HaActiveHbaseFsDir.
         */
        public Builder haActiveHbaseFsDir(String haActiveHbaseFsDir) {
            this.putQueryParameter("HaActiveHbaseFsDir", haActiveHbaseFsDir);
            this.haActiveHbaseFsDir = haActiveHbaseFsDir;
            return this;
        }

        /**
         * HaActiveHdfsUri.
         */
        public Builder haActiveHdfsUri(String haActiveHdfsUri) {
            this.putQueryParameter("HaActiveHdfsUri", haActiveHdfsUri);
            this.haActiveHdfsUri = haActiveHdfsUri;
            return this;
        }

        /**
         * HaActivePassword.
         */
        public Builder haActivePassword(String haActivePassword) {
            this.putQueryParameter("HaActivePassword", haActivePassword);
            this.haActivePassword = haActivePassword;
            return this;
        }

        /**
         * HaActiveUser.
         */
        public Builder haActiveUser(String haActiveUser) {
            this.putQueryParameter("HaActiveUser", haActiveUser);
            this.haActiveUser = haActiveUser;
            return this;
        }

        /**
         * HaActiveVersion.
         */
        public Builder haActiveVersion(String haActiveVersion) {
            this.putQueryParameter("HaActiveVersion", haActiveVersion);
            this.haActiveVersion = haActiveVersion;
            return this;
        }

        /**
         * HaMigrateType.
         */
        public Builder haMigrateType(String haMigrateType) {
            this.putQueryParameter("HaMigrateType", haMigrateType);
            this.haMigrateType = haMigrateType;
            return this;
        }

        /**
         * HaStandby.
         */
        public Builder haStandby(String haStandby) {
            this.putQueryParameter("HaStandby", haStandby);
            this.haStandby = haStandby;
            return this;
        }

        /**
         * HaStandbyClusterKey.
         */
        public Builder haStandbyClusterKey(String haStandbyClusterKey) {
            this.putQueryParameter("HaStandbyClusterKey", haStandbyClusterKey);
            this.haStandbyClusterKey = haStandbyClusterKey;
            return this;
        }

        /**
         * HaStandbyDBType.
         */
        public Builder haStandbyDBType(String haStandbyDBType) {
            this.putQueryParameter("HaStandbyDBType", haStandbyDBType);
            this.haStandbyDBType = haStandbyDBType;
            return this;
        }

        /**
         * HaStandbyHbaseFsDir.
         */
        public Builder haStandbyHbaseFsDir(String haStandbyHbaseFsDir) {
            this.putQueryParameter("HaStandbyHbaseFsDir", haStandbyHbaseFsDir);
            this.haStandbyHbaseFsDir = haStandbyHbaseFsDir;
            return this;
        }

        /**
         * HaStandbyHdfsUri.
         */
        public Builder haStandbyHdfsUri(String haStandbyHdfsUri) {
            this.putQueryParameter("HaStandbyHdfsUri", haStandbyHdfsUri);
            this.haStandbyHdfsUri = haStandbyHdfsUri;
            return this;
        }

        /**
         * HaStandbyPassword.
         */
        public Builder haStandbyPassword(String haStandbyPassword) {
            this.putQueryParameter("HaStandbyPassword", haStandbyPassword);
            this.haStandbyPassword = haStandbyPassword;
            return this;
        }

        /**
         * HaStandbyUser.
         */
        public Builder haStandbyUser(String haStandbyUser) {
            this.putQueryParameter("HaStandbyUser", haStandbyUser);
            this.haStandbyUser = haStandbyUser;
            return this;
        }

        /**
         * HaStandbyVersion.
         */
        public Builder haStandbyVersion(String haStandbyVersion) {
            this.putQueryParameter("HaStandbyVersion", haStandbyVersion);
            this.haStandbyVersion = haStandbyVersion;
            return this;
        }

        /**
         * HaTables.
         */
        public Builder haTables(String haTables) {
            this.putQueryParameter("HaTables", haTables);
            this.haTables = haTables;
            return this;
        }

        /**
         * IsActiveStandard.
         */
        public Builder isActiveStandard(Boolean isActiveStandard) {
            this.putQueryParameter("IsActiveStandard", isActiveStandard);
            this.isActiveStandard = isActiveStandard;
            return this;
        }

        /**
         * IsStandbyStandard.
         */
        public Builder isStandbyStandard(Boolean isStandbyStandard) {
            this.putQueryParameter("IsStandbyStandard", isStandbyStandard);
            this.isStandbyStandard = isStandbyStandard;
            return this;
        }

        @Override
        public RelateDbForHBaseHaRequest build() {
            return new RelateDbForHBaseHaRequest(this);
        } 

    } 

}
