// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Task} extends {@link TeaModel}
 *
 * <p>Task</p>
 */
public class Task extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("archives")
    private java.util.List < String > archives;

    @com.aliyun.core.annotation.NameInMap("artifactUrl")
    private String artifactUrl;

    @com.aliyun.core.annotation.NameInMap("bizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.NameInMap("categoryBizId")
    private String categoryBizId;

    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("creator")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long creator;

    @com.aliyun.core.annotation.NameInMap("defaultCatalogId")
    private String defaultCatalogId;

    @com.aliyun.core.annotation.NameInMap("defaultDatabase")
    private String defaultDatabase;

    @com.aliyun.core.annotation.NameInMap("defaultResourceQueueId")
    private String defaultResourceQueueId;

    @com.aliyun.core.annotation.NameInMap("defaultSqlComputeId")
    private String defaultSqlComputeId;

    @com.aliyun.core.annotation.NameInMap("extraArtifactIds")
    private java.util.List < String > extraArtifactIds;

    @com.aliyun.core.annotation.NameInMap("extraSparkSubmitParams")
    private String extraSparkSubmitParams;

    @com.aliyun.core.annotation.NameInMap("files")
    private java.util.List < String > files;

    @com.aliyun.core.annotation.NameInMap("gmtCreated")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gmtCreated;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("hasChanged")
    private Boolean hasChanged;

    @com.aliyun.core.annotation.NameInMap("hasCommited")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean hasCommited;

    @com.aliyun.core.annotation.NameInMap("jars")
    private java.util.List < String > jars;

    @com.aliyun.core.annotation.NameInMap("lastRunResourceQueueId")
    private String lastRunResourceQueueId;

    @com.aliyun.core.annotation.NameInMap("modifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long modifier;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("pyFiles")
    private java.util.List < String > pyFiles;

    @com.aliyun.core.annotation.NameInMap("sparkArgs")
    private String sparkArgs;

    @com.aliyun.core.annotation.NameInMap("sparkConf")
    private java.util.List < SparkConf > sparkConf;

    @com.aliyun.core.annotation.NameInMap("sparkDriverCores")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer sparkDriverCores;

    @com.aliyun.core.annotation.NameInMap("sparkDriverMemory")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sparkDriverMemory;

    @com.aliyun.core.annotation.NameInMap("sparkEntrypoint")
    private String sparkEntrypoint;

    @com.aliyun.core.annotation.NameInMap("sparkExecutorCores")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer sparkExecutorCores;

    @com.aliyun.core.annotation.NameInMap("sparkExecutorMemory")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sparkExecutorMemory;

    @com.aliyun.core.annotation.NameInMap("sparkLogLevel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sparkLogLevel;

    @com.aliyun.core.annotation.NameInMap("sparkLogPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sparkLogPath;

    @com.aliyun.core.annotation.NameInMap("sparkVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sparkVersion;

    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.Map < String, String > tags;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private Task(Builder builder) {
        this.archives = builder.archives;
        this.artifactUrl = builder.artifactUrl;
        this.bizId = builder.bizId;
        this.categoryBizId = builder.categoryBizId;
        this.content = builder.content;
        this.creator = builder.creator;
        this.defaultCatalogId = builder.defaultCatalogId;
        this.defaultDatabase = builder.defaultDatabase;
        this.defaultResourceQueueId = builder.defaultResourceQueueId;
        this.defaultSqlComputeId = builder.defaultSqlComputeId;
        this.extraArtifactIds = builder.extraArtifactIds;
        this.extraSparkSubmitParams = builder.extraSparkSubmitParams;
        this.files = builder.files;
        this.gmtCreated = builder.gmtCreated;
        this.gmtModified = builder.gmtModified;
        this.hasChanged = builder.hasChanged;
        this.hasCommited = builder.hasCommited;
        this.jars = builder.jars;
        this.lastRunResourceQueueId = builder.lastRunResourceQueueId;
        this.modifier = builder.modifier;
        this.name = builder.name;
        this.pyFiles = builder.pyFiles;
        this.sparkArgs = builder.sparkArgs;
        this.sparkConf = builder.sparkConf;
        this.sparkDriverCores = builder.sparkDriverCores;
        this.sparkDriverMemory = builder.sparkDriverMemory;
        this.sparkEntrypoint = builder.sparkEntrypoint;
        this.sparkExecutorCores = builder.sparkExecutorCores;
        this.sparkExecutorMemory = builder.sparkExecutorMemory;
        this.sparkLogLevel = builder.sparkLogLevel;
        this.sparkLogPath = builder.sparkLogPath;
        this.sparkVersion = builder.sparkVersion;
        this.tags = builder.tags;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Task create() {
        return builder().build();
    }

    /**
     * @return archives
     */
    public java.util.List < String > getArchives() {
        return this.archives;
    }

    /**
     * @return artifactUrl
     */
    public String getArtifactUrl() {
        return this.artifactUrl;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return categoryBizId
     */
    public String getCategoryBizId() {
        return this.categoryBizId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return creator
     */
    public Long getCreator() {
        return this.creator;
    }

    /**
     * @return defaultCatalogId
     */
    public String getDefaultCatalogId() {
        return this.defaultCatalogId;
    }

    /**
     * @return defaultDatabase
     */
    public String getDefaultDatabase() {
        return this.defaultDatabase;
    }

    /**
     * @return defaultResourceQueueId
     */
    public String getDefaultResourceQueueId() {
        return this.defaultResourceQueueId;
    }

    /**
     * @return defaultSqlComputeId
     */
    public String getDefaultSqlComputeId() {
        return this.defaultSqlComputeId;
    }

    /**
     * @return extraArtifactIds
     */
    public java.util.List < String > getExtraArtifactIds() {
        return this.extraArtifactIds;
    }

    /**
     * @return extraSparkSubmitParams
     */
    public String getExtraSparkSubmitParams() {
        return this.extraSparkSubmitParams;
    }

    /**
     * @return files
     */
    public java.util.List < String > getFiles() {
        return this.files;
    }

    /**
     * @return gmtCreated
     */
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return hasChanged
     */
    public Boolean getHasChanged() {
        return this.hasChanged;
    }

    /**
     * @return hasCommited
     */
    public Boolean getHasCommited() {
        return this.hasCommited;
    }

    /**
     * @return jars
     */
    public java.util.List < String > getJars() {
        return this.jars;
    }

    /**
     * @return lastRunResourceQueueId
     */
    public String getLastRunResourceQueueId() {
        return this.lastRunResourceQueueId;
    }

    /**
     * @return modifier
     */
    public Long getModifier() {
        return this.modifier;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pyFiles
     */
    public java.util.List < String > getPyFiles() {
        return this.pyFiles;
    }

    /**
     * @return sparkArgs
     */
    public String getSparkArgs() {
        return this.sparkArgs;
    }

    /**
     * @return sparkConf
     */
    public java.util.List < SparkConf > getSparkConf() {
        return this.sparkConf;
    }

    /**
     * @return sparkDriverCores
     */
    public Integer getSparkDriverCores() {
        return this.sparkDriverCores;
    }

    /**
     * @return sparkDriverMemory
     */
    public Long getSparkDriverMemory() {
        return this.sparkDriverMemory;
    }

    /**
     * @return sparkEntrypoint
     */
    public String getSparkEntrypoint() {
        return this.sparkEntrypoint;
    }

    /**
     * @return sparkExecutorCores
     */
    public Integer getSparkExecutorCores() {
        return this.sparkExecutorCores;
    }

    /**
     * @return sparkExecutorMemory
     */
    public Long getSparkExecutorMemory() {
        return this.sparkExecutorMemory;
    }

    /**
     * @return sparkLogLevel
     */
    public String getSparkLogLevel() {
        return this.sparkLogLevel;
    }

    /**
     * @return sparkLogPath
     */
    public String getSparkLogPath() {
        return this.sparkLogPath;
    }

    /**
     * @return sparkVersion
     */
    public String getSparkVersion() {
        return this.sparkVersion;
    }

    /**
     * @return tags
     */
    public java.util.Map < String, String > getTags() {
        return this.tags;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List < String > archives; 
        private String artifactUrl; 
        private String bizId; 
        private String categoryBizId; 
        private String content; 
        private Long creator; 
        private String defaultCatalogId; 
        private String defaultDatabase; 
        private String defaultResourceQueueId; 
        private String defaultSqlComputeId; 
        private java.util.List < String > extraArtifactIds; 
        private String extraSparkSubmitParams; 
        private java.util.List < String > files; 
        private String gmtCreated; 
        private String gmtModified; 
        private Boolean hasChanged; 
        private Boolean hasCommited; 
        private java.util.List < String > jars; 
        private String lastRunResourceQueueId; 
        private Long modifier; 
        private String name; 
        private java.util.List < String > pyFiles; 
        private String sparkArgs; 
        private java.util.List < SparkConf > sparkConf; 
        private Integer sparkDriverCores; 
        private Long sparkDriverMemory; 
        private String sparkEntrypoint; 
        private Integer sparkExecutorCores; 
        private Long sparkExecutorMemory; 
        private String sparkLogLevel; 
        private String sparkLogPath; 
        private String sparkVersion; 
        private java.util.Map < String, String > tags; 
        private String type; 

        /**
         * archives.
         */
        public Builder archives(java.util.List < String > archives) {
            this.archives = archives;
            return this;
        }

        /**
         * artifactUrl.
         */
        public Builder artifactUrl(String artifactUrl) {
            this.artifactUrl = artifactUrl;
            return this;
        }

        /**
         * bizId.
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * categoryBizId.
         */
        public Builder categoryBizId(String categoryBizId) {
            this.categoryBizId = categoryBizId;
            return this;
        }

        /**
         * content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * creator.
         */
        public Builder creator(Long creator) {
            this.creator = creator;
            return this;
        }

        /**
         * defaultCatalogId.
         */
        public Builder defaultCatalogId(String defaultCatalogId) {
            this.defaultCatalogId = defaultCatalogId;
            return this;
        }

        /**
         * defaultDatabase.
         */
        public Builder defaultDatabase(String defaultDatabase) {
            this.defaultDatabase = defaultDatabase;
            return this;
        }

        /**
         * defaultResourceQueueId.
         */
        public Builder defaultResourceQueueId(String defaultResourceQueueId) {
            this.defaultResourceQueueId = defaultResourceQueueId;
            return this;
        }

        /**
         * defaultSqlComputeId.
         */
        public Builder defaultSqlComputeId(String defaultSqlComputeId) {
            this.defaultSqlComputeId = defaultSqlComputeId;
            return this;
        }

        /**
         * extraArtifactIds.
         */
        public Builder extraArtifactIds(java.util.List < String > extraArtifactIds) {
            this.extraArtifactIds = extraArtifactIds;
            return this;
        }

        /**
         * extraSparkSubmitParams.
         */
        public Builder extraSparkSubmitParams(String extraSparkSubmitParams) {
            this.extraSparkSubmitParams = extraSparkSubmitParams;
            return this;
        }

        /**
         * files.
         */
        public Builder files(java.util.List < String > files) {
            this.files = files;
            return this;
        }

        /**
         * gmtCreated.
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * hasChanged.
         */
        public Builder hasChanged(Boolean hasChanged) {
            this.hasChanged = hasChanged;
            return this;
        }

        /**
         * hasCommited.
         */
        public Builder hasCommited(Boolean hasCommited) {
            this.hasCommited = hasCommited;
            return this;
        }

        /**
         * jars.
         */
        public Builder jars(java.util.List < String > jars) {
            this.jars = jars;
            return this;
        }

        /**
         * lastRunResourceQueueId.
         */
        public Builder lastRunResourceQueueId(String lastRunResourceQueueId) {
            this.lastRunResourceQueueId = lastRunResourceQueueId;
            return this;
        }

        /**
         * modifier.
         */
        public Builder modifier(Long modifier) {
            this.modifier = modifier;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * pyFiles.
         */
        public Builder pyFiles(java.util.List < String > pyFiles) {
            this.pyFiles = pyFiles;
            return this;
        }

        /**
         * sparkArgs.
         */
        public Builder sparkArgs(String sparkArgs) {
            this.sparkArgs = sparkArgs;
            return this;
        }

        /**
         * sparkConf.
         */
        public Builder sparkConf(java.util.List < SparkConf > sparkConf) {
            this.sparkConf = sparkConf;
            return this;
        }

        /**
         * sparkDriverCores.
         */
        public Builder sparkDriverCores(Integer sparkDriverCores) {
            this.sparkDriverCores = sparkDriverCores;
            return this;
        }

        /**
         * sparkDriverMemory.
         */
        public Builder sparkDriverMemory(Long sparkDriverMemory) {
            this.sparkDriverMemory = sparkDriverMemory;
            return this;
        }

        /**
         * sparkEntrypoint.
         */
        public Builder sparkEntrypoint(String sparkEntrypoint) {
            this.sparkEntrypoint = sparkEntrypoint;
            return this;
        }

        /**
         * sparkExecutorCores.
         */
        public Builder sparkExecutorCores(Integer sparkExecutorCores) {
            this.sparkExecutorCores = sparkExecutorCores;
            return this;
        }

        /**
         * sparkExecutorMemory.
         */
        public Builder sparkExecutorMemory(Long sparkExecutorMemory) {
            this.sparkExecutorMemory = sparkExecutorMemory;
            return this;
        }

        /**
         * sparkLogLevel.
         */
        public Builder sparkLogLevel(String sparkLogLevel) {
            this.sparkLogLevel = sparkLogLevel;
            return this;
        }

        /**
         * sparkLogPath.
         */
        public Builder sparkLogPath(String sparkLogPath) {
            this.sparkLogPath = sparkLogPath;
            return this;
        }

        /**
         * sparkVersion.
         */
        public Builder sparkVersion(String sparkVersion) {
            this.sparkVersion = sparkVersion;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.Map < String, String > tags) {
            this.tags = tags;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Task build() {
            return new Task(this);
        } 

    } 

}
