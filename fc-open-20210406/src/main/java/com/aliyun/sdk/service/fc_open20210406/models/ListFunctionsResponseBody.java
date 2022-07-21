// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFunctionsResponseBody</p>
 */
public class ListFunctionsResponseBody extends TeaModel {
    @NameInMap("functions")
    private java.util.List < Functions> functions;

    @NameInMap("nextToken")
    private String nextToken;

    private ListFunctionsResponseBody(Builder builder) {
        this.functions = builder.functions;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return functions
     */
    public java.util.List < Functions> getFunctions() {
        return this.functions;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder {
        private java.util.List < Functions> functions; 
        private String nextToken; 

        /**
         * 函数列表
         */
        public Builder functions(java.util.List < Functions> functions) {
            this.functions = functions;
            return this;
        }

        /**
         * 用来返回更多的查询结果。如果这个值没有返回，则说明没有更多结果
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        public ListFunctionsResponseBody build() {
            return new ListFunctionsResponseBody(this);
        } 

    } 

    public static class Functions extends TeaModel {
        @NameInMap("caPort")
        private Integer caPort;

        @NameInMap("codeChecksum")
        private String codeChecksum;

        @NameInMap("codeSize")
        private Long codeSize;

        @NameInMap("createdTime")
        private String createdTime;

        @NameInMap("customContainerConfig")
        private CustomContainerConfig customContainerConfig;

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

        @NameInMap("instanceSoftConcurrency")
        private Integer instanceSoftConcurrency;

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

        private Functions(Builder builder) {
            this.caPort = builder.caPort;
            this.codeChecksum = builder.codeChecksum;
            this.codeSize = builder.codeSize;
            this.createdTime = builder.createdTime;
            this.customContainerConfig = builder.customContainerConfig;
            this.description = builder.description;
            this.environmentVariables = builder.environmentVariables;
            this.functionId = builder.functionId;
            this.functionName = builder.functionName;
            this.handler = builder.handler;
            this.initializationTimeout = builder.initializationTimeout;
            this.initializer = builder.initializer;
            this.instanceConcurrency = builder.instanceConcurrency;
            this.instanceLifecycleConfig = builder.instanceLifecycleConfig;
            this.instanceSoftConcurrency = builder.instanceSoftConcurrency;
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

        public static Functions create() {
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
        public CustomContainerConfig getCustomContainerConfig() {
            return this.customContainerConfig;
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
         * @return instanceSoftConcurrency
         */
        public Integer getInstanceSoftConcurrency() {
            return this.instanceSoftConcurrency;
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
            private CustomContainerConfig customContainerConfig; 
            private String description; 
            private java.util.Map < String, String > environmentVariables; 
            private String functionId; 
            private String functionName; 
            private String handler; 
            private Integer initializationTimeout; 
            private String initializer; 
            private Integer instanceConcurrency; 
            private InstanceLifecycleConfig instanceLifecycleConfig; 
            private Integer instanceSoftConcurrency; 
            private String instanceType; 
            private String lastModifiedTime; 
            private java.util.List < String > layers; 
            private Integer memorySize; 
            private String runtime; 
            private Integer timeout; 

            /**
             * 自定义、自定义容器运行时 HTTP Server 的监听端口
             */
            public Builder caPort(Integer caPort) {
                this.caPort = caPort;
                return this;
            }

            /**
             * function code包的CRC64值
             */
            public Builder codeChecksum(String codeChecksum) {
                this.codeChecksum = codeChecksum;
                return this;
            }

            /**
             * 系统返回的function的code包大小，单位为byte Example : 1024
             */
            public Builder codeSize(Long codeSize) {
                this.codeSize = codeSize;
                return this;
            }

            /**
             * function创建时间
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * customContainerConfig.
             */
            public Builder customContainerConfig(CustomContainerConfig customContainerConfig) {
                this.customContainerConfig = customContainerConfig;
                return this;
            }

            /**
             * 函数描述
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 为函数设置的环境变量，可以在函数中获取环境变量的值
             */
            public Builder environmentVariables(java.util.Map < String, String > environmentVariables) {
                this.environmentVariables = environmentVariables;
                return this;
            }

            /**
             * 系统为每个function生成的唯一ID
             */
            public Builder functionId(String functionId) {
                this.functionId = functionId;
                return this;
            }

            /**
             * 函数名称
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * function的执行入口
             */
            public Builder handler(String handler) {
                this.handler = handler;
                return this;
            }

            /**
             * 初始化function运行的超时时间，单位为秒，最小1秒，默认3秒。初始化function超过这个时间后会被终止执行
             */
            public Builder initializationTimeout(Integer initializationTimeout) {
                this.initializationTimeout = initializationTimeout;
                return this;
            }

            /**
             * 初始化 function 执行的入口，具体格式和语言相关
             */
            public Builder initializer(String initializer) {
                this.initializer = initializer;
                return this;
            }

            /**
             * instanceConcurrency.
             */
            public Builder instanceConcurrency(Integer instanceConcurrency) {
                this.instanceConcurrency = instanceConcurrency;
                return this;
            }

            /**
             * instanceLifecycleConfig.
             */
            public Builder instanceLifecycleConfig(InstanceLifecycleConfig instanceLifecycleConfig) {
                this.instanceLifecycleConfig = instanceLifecycleConfig;
                return this;
            }

            /**
             * instanceSoftConcurrency.
             */
            public Builder instanceSoftConcurrency(Integer instanceSoftConcurrency) {
                this.instanceSoftConcurrency = instanceSoftConcurrency;
                return this;
            }

            /**
             * instanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * function上次修改时间
             */
            public Builder lastModifiedTime(String lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * layers.
             */
            public Builder layers(java.util.List < String > layers) {
                this.layers = layers;
                return this;
            }

            /**
             * function设置的内存大小，单位为MB
             */
            public Builder memorySize(Integer memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * function运行的语言环境，目前支持nodejs6, nodejs8, python2.7, python3, java8
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * 运行的超时时间，单位为秒
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            public Functions build() {
                return new Functions(this);
            } 

        } 

    }
}
