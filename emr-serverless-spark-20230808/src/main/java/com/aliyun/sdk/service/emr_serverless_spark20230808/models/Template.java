// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Template} extends {@link TeaModel}
 *
 * <p>Template</p>
 */
public class Template extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("creator")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long creator;

    @com.aliyun.core.annotation.NameInMap("gmtCreated")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gmtCreated;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("modifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long modifier;

    @com.aliyun.core.annotation.NameInMap("sparkConf")
    private java.util.List < SparkConf > sparkConf;

    @com.aliyun.core.annotation.NameInMap("sparkDriverCores")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer sparkDriverCores;

    @com.aliyun.core.annotation.NameInMap("sparkDriverMemory")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sparkDriverMemory;

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

    @com.aliyun.core.annotation.NameInMap("templateType")
    private String templateType;

    private Template(Builder builder) {
        this.creator = builder.creator;
        this.gmtCreated = builder.gmtCreated;
        this.gmtModified = builder.gmtModified;
        this.modifier = builder.modifier;
        this.sparkConf = builder.sparkConf;
        this.sparkDriverCores = builder.sparkDriverCores;
        this.sparkDriverMemory = builder.sparkDriverMemory;
        this.sparkExecutorCores = builder.sparkExecutorCores;
        this.sparkExecutorMemory = builder.sparkExecutorMemory;
        this.sparkLogLevel = builder.sparkLogLevel;
        this.sparkLogPath = builder.sparkLogPath;
        this.sparkVersion = builder.sparkVersion;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Template create() {
        return builder().build();
    }

    /**
     * @return creator
     */
    public Long getCreator() {
        return this.creator;
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
     * @return modifier
     */
    public Long getModifier() {
        return this.modifier;
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
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder {
        private Long creator; 
        private String gmtCreated; 
        private String gmtModified; 
        private Long modifier; 
        private java.util.List < SparkConf > sparkConf; 
        private Integer sparkDriverCores; 
        private Long sparkDriverMemory; 
        private Integer sparkExecutorCores; 
        private Long sparkExecutorMemory; 
        private String sparkLogLevel; 
        private String sparkLogPath; 
        private String sparkVersion; 
        private String templateType; 

        /**
         * creator.
         */
        public Builder creator(Long creator) {
            this.creator = creator;
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
         * modifier.
         */
        public Builder modifier(Long modifier) {
            this.modifier = modifier;
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
         * templateType.
         */
        public Builder templateType(String templateType) {
            this.templateType = templateType;
            return this;
        }

        public Template build() {
            return new Template(this);
        } 

    } 

}
