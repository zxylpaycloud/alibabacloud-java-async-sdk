// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetFunctionResponseBody} extends {@link TeaModel}
 *
 * <p>GetFunctionResponseBody</p>
 */
public class GetFunctionResponseBody extends TeaModel {
    @NameInMap("caPort")
    private Integer caPort;

    @NameInMap("codeChecksum")
    private String codeChecksum;

    @NameInMap("codeSize")
    private Long codeSize;

    @NameInMap("createdTime")
    private String createdTime;

    @NameInMap("customContainerConfig")
    private CustomContainerConfigInfo customContainerConfig;

    @NameInMap("customDNS")
    private CustomDNS customDNS;

    @NameInMap("customRuntimeConfig")
    private CustomRuntimeConfig customRuntimeConfig;

    @NameInMap("description")
    private String description;

    @NameInMap("environmentVariables")
    private java.util.Map < String, String > environmentVariables;

    @NameInMap("functionId")
    private String functionId;

    @NameInMap("functionName")
    private String functionName;

    @NameInMap("handler")
    private String handler;

    @NameInMap("initializationTimeout")
    private Integer initializationTimeout;

    @NameInMap("initializer")
    private String initializer;

    @NameInMap("instanceConcurrency")
    private Integer instanceConcurrency;

    @NameInMap("instanceLifecycleConfig")
    private InstanceLifecycleConfig instanceLifecycleConfig;

    @NameInMap("instanceType")
    private String instanceType;

    @NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @NameInMap("layers")
    private java.util.List < String > layers;

    @NameInMap("memorySize")
    private Integer memorySize;

    @NameInMap("runtime")
    private String runtime;

    @NameInMap("timeout")
    private Integer timeout;


    private GetFunctionResponseBody(Builder builder) {
        this.caPort = builder.caPort;
        this.codeChecksum = builder.codeChecksum;
        this.codeSize = builder.codeSize;
        this.createdTime = builder.createdTime;
        this.customContainerConfig = builder.customContainerConfig;
        this.customDNS = builder.customDNS;
        this.customRuntimeConfig = builder.customRuntimeConfig;
        this.description = builder.description;
        this.environmentVariables = builder.environmentVariables;
        this.functionId = builder.functionId;
        this.functionName = builder.functionName;
        this.handler = builder.handler;
        this.initializationTimeout = builder.initializationTimeout;
        this.initializer = builder.initializer;
        this.instanceConcurrency = builder.instanceConcurrency;
        this.instanceLifecycleConfig = builder.instanceLifecycleConfig;
        this.instanceType = builder.instanceType;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.layers = builder.layers;
        this.memorySize = builder.memorySize;
        this.runtime = builder.runtime;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFunctionResponseBody create() {
        return builder().build();
    }

    /**
     * @return caPort
     */
    public Integer getCaPort() {
        return this.caPort;
    }

    /**
     * @return codeChecksum
     */
    public String getCodeChecksum() {
        return this.codeChecksum;
    }

    /**
     * @return codeSize
     */
    public Long getCodeSize() {
        return this.codeSize;
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return customContainerConfig
     */
    public CustomContainerConfigInfo getCustomContainerConfig() {
        return this.customContainerConfig;
    }

    /**
     * @return customDNS
     */
    public CustomDNS getCustomDNS() {
        return this.customDNS;
    }

    /**
     * @return customRuntimeConfig
     */
    public CustomRuntimeConfig getCustomRuntimeConfig() {
        return this.customRuntimeConfig;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return environmentVariables
     */
    public java.util.Map < String, String > getEnvironmentVariables() {
        return this.environmentVariables;
    }

    /**
     * @return functionId
     */
    public String getFunctionId() {
        return this.functionId;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return handler
     */
    public String getHandler() {
        return this.handler;
    }

    /**
     * @return initializationTimeout
     */
    public Integer getInitializationTimeout() {
        return this.initializationTimeout;
    }

    /**
     * @return initializer
     */
    public String getInitializer() {
        return this.initializer;
    }

    /**
     * @return instanceConcurrency
     */
    public Integer getInstanceConcurrency() {
        return this.instanceConcurrency;
    }

    /**
     * @return instanceLifecycleConfig
     */
    public InstanceLifecycleConfig getInstanceLifecycleConfig() {
        return this.instanceLifecycleConfig;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return layers
     */
    public java.util.List < String > getLayers() {
        return this.layers;
    }

    /**
     * @return memorySize
     */
    public Integer getMemorySize() {
        return this.memorySize;
    }

    /**
     * @return runtime
     */
    public String getRuntime() {
        return this.runtime;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    public static final class Builder {
        private Integer caPort; 
        private String codeChecksum; 
        private Long codeSize; 
        private String createdTime; 
        private CustomContainerConfigInfo customContainerConfig; 
        private CustomDNS customDNS; 
        private CustomRuntimeConfig customRuntimeConfig; 
        private String description; 
        private java.util.Map < String, String > environmentVariables; 
        private String functionId; 
        private String functionName; 
        private String handler; 
        private Integer initializationTimeout; 
        private String initializer; 
        private Integer instanceConcurrency; 
        private InstanceLifecycleConfig instanceLifecycleConfig; 
        private String instanceType; 
        private String lastModifiedTime; 
        private java.util.List < String > layers; 
        private Integer memorySize; 
        private String runtime; 
        private Integer timeout; 

        /**
         * <p>自定义、自定义容器运行时 HTTP Server 的监听端口</p>
         */
        public Builder caPort(Integer caPort) {
            this.caPort = caPort;
            return this;
        }

        /**
         * <p>function code包的CRC64值</p>
         */
        public Builder codeChecksum(String codeChecksum) {
            this.codeChecksum = codeChecksum;
            return this;
        }

        /**
         * <p>系统返回的function的code包大小，单位为byte Example : 1024</p>
         */
        public Builder codeSize(Long codeSize) {
            this.codeSize = codeSize;
            return this;
        }

        /**
         * <p>function创建时间</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>customContainerConfig.</p>
         */
        public Builder customContainerConfig(CustomContainerConfigInfo customContainerConfig) {
            this.customContainerConfig = customContainerConfig;
            return this;
        }

        /**
         * <p>函数自定义DNS配置</p>
         */
        public Builder customDNS(CustomDNS customDNS) {
            this.customDNS = customDNS;
            return this;
        }

        /**
         * <p>Custom Runtime函数详细配置</p>
         */
        public Builder customRuntimeConfig(CustomRuntimeConfig customRuntimeConfig) {
            this.customRuntimeConfig = customRuntimeConfig;
            return this;
        }

        /**
         * <p>函数描述</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>为函数设置的环境变量，可以在函数中获取环境变量的值</p>
         */
        public Builder environmentVariables(java.util.Map < String, String > environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * <p>系统为每个function生成的唯一ID</p>
         */
        public Builder functionId(String functionId) {
            this.functionId = functionId;
            return this;
        }

        /**
         * <p>函数名称</p>
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>function的执行入口</p>
         */
        public Builder handler(String handler) {
            this.handler = handler;
            return this;
        }

        /**
         * <p>初始化function运行的超时时间，单位为秒，最小1秒，默认3秒。初始化function超过这个时间后会被终止执行</p>
         */
        public Builder initializationTimeout(Integer initializationTimeout) {
            this.initializationTimeout = initializationTimeout;
            return this;
        }

        /**
         * <p>初始化 function 执行的入口，具体格式和语言相关</p>
         */
        public Builder initializer(String initializer) {
            this.initializer = initializer;
            return this;
        }

        /**
         * <p>instanceConcurrency.</p>
         */
        public Builder instanceConcurrency(Integer instanceConcurrency) {
            this.instanceConcurrency = instanceConcurrency;
            return this;
        }

        /**
         * <p>instanceLifecycleConfig.</p>
         */
        public Builder instanceLifecycleConfig(InstanceLifecycleConfig instanceLifecycleConfig) {
            this.instanceLifecycleConfig = instanceLifecycleConfig;
            return this;
        }

        /**
         * <p>instanceType.</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>function上次修改时间</p>
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * <p>layers.</p>
         */
        public Builder layers(java.util.List < String > layers) {
            this.layers = layers;
            return this;
        }

        /**
         * <p>function设置的内存大小，单位为MB</p>
         */
        public Builder memorySize(Integer memorySize) {
            this.memorySize = memorySize;
            return this;
        }

        /**
         * <p>function运行的语言环境，目前支持nodejs6, nodejs8, python2.7, python3, java8</p>
         */
        public Builder runtime(String runtime) {
            this.runtime = runtime;
            return this;
        }

        /**
         * <p>运行的超时时间，单位为秒</p>
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public GetFunctionResponseBody build() {
            return new GetFunctionResponseBody(this);
        } 

    } 

}
