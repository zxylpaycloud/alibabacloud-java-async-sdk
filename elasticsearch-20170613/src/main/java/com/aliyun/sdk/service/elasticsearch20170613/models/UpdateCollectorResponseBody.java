// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCollectorResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCollectorResponseBody</p>
 */
public class UpdateCollectorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private UpdateCollectorResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCollectorResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public UpdateCollectorResponseBody build() {
            return new UpdateCollectorResponseBody(this);
        } 

    } 

    public static class Configs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        private Configs(Builder builder) {
            this.content = builder.content;
            this.fileName = builder.fileName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        public static final class Builder {
            private String content; 
            private String fileName; 

            /**
             * The content of the configuration file.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The name of the configuration file.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
    public static class Machines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentStatus")
        private String agentStatus;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        private Machines(Builder builder) {
            this.agentStatus = builder.agentStatus;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Machines create() {
            return builder().build();
        }

        /**
         * @return agentStatus
         */
        public String getAgentStatus() {
            return this.agentStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String agentStatus; 
            private String instanceId; 

            /**
             * The installation status of the shipper on an ECS instance. Valid values:
             * <p>
             * 
             * *   heartOk
             * *   heartLost
             * *   uninstalled
             * *   failed
             */
            public Builder agentStatus(String agentStatus) {
                this.agentStatus = agentStatus;
                return this;
            }

            /**
             * The ID of the ECS instance on which the shipper is installed.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public Machines build() {
                return new Machines(this);
            } 

        } 

    }
    public static class ExtendConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configType")
        private String configType;

        @com.aliyun.core.annotation.NameInMap("enableMonitoring")
        private Boolean enableMonitoring;

        @com.aliyun.core.annotation.NameInMap("groupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("hosts")
        private java.util.List < String > hosts;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("instanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("kibanaHost")
        private String kibanaHost;

        @com.aliyun.core.annotation.NameInMap("machines")
        private java.util.List < Machines> machines;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("successPodsCount")
        private String successPodsCount;

        @com.aliyun.core.annotation.NameInMap("totalPodsCount")
        private String totalPodsCount;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("userName")
        private String userName;

        private ExtendConfigs(Builder builder) {
            this.configType = builder.configType;
            this.enableMonitoring = builder.enableMonitoring;
            this.groupId = builder.groupId;
            this.host = builder.host;
            this.hosts = builder.hosts;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.kibanaHost = builder.kibanaHost;
            this.machines = builder.machines;
            this.protocol = builder.protocol;
            this.successPodsCount = builder.successPodsCount;
            this.totalPodsCount = builder.totalPodsCount;
            this.type = builder.type;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendConfigs create() {
            return builder().build();
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        /**
         * @return enableMonitoring
         */
        public Boolean getEnableMonitoring() {
            return this.enableMonitoring;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return hosts
         */
        public java.util.List < String > getHosts() {
            return this.hosts;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return kibanaHost
         */
        public String getKibanaHost() {
            return this.kibanaHost;
        }

        /**
         * @return machines
         */
        public java.util.List < Machines> getMachines() {
            return this.machines;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return successPodsCount
         */
        public String getSuccessPodsCount() {
            return this.successPodsCount;
        }

        /**
         * @return totalPodsCount
         */
        public String getTotalPodsCount() {
            return this.totalPodsCount;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String configType; 
            private Boolean enableMonitoring; 
            private String groupId; 
            private String host; 
            private java.util.List < String > hosts; 
            private String instanceId; 
            private String instanceType; 
            private String kibanaHost; 
            private java.util.List < Machines> machines; 
            private String protocol; 
            private String successPodsCount; 
            private String totalPodsCount; 
            private String type; 
            private String userName; 

            /**
             * The type of the configuration items. Valid values:
             * <p>
             * 
             * *   collectorTargetInstance: indicates the information about the output of the shipper.
             * *   collectorDeployMachine: indicates the information about the machine on which the shipper is installed.
             * *   collectorElasticsearchForKibana: indicates the information about the Elasticsearch cluster for which Kibana Dashboard is enabled.
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * Indicates whether Kibana Monitoring is enabled. This parameter is returned only when **configType** is set to **collectorTargetInstance** and **instanceType** is set to **elasticsearch**. Valid values: true and false.
             */
            public Builder enableMonitoring(Boolean enableMonitoring) {
                this.enableMonitoring = enableMonitoring;
                return this;
            }

            /**
             * The machine group ID. This parameter is returned only when **configType** is set to **collectorDeployMachine**.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The address that is used to access Kibana over an internal network after you enable Kibana Dashboard. This parameter is returned only when **configType** is set to **collectorElasticsearchForKibana**.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * hosts.
             */
            public Builder hosts(java.util.List < String > hosts) {
                this.hosts = hosts;
                return this;
            }

            /**
             * The ID of the object that is associated with the shipper. If **configType** is set to **collectorTargetInstance**, the value of this parameter is the ID of the output of the shipper. If **configType** is set to **collectorDeployMachines** and **type** is set to **ACKCluster**, the value of this parameter is the ID of an ACK cluster.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The type of the output of the shipper. Valid values: elasticsearch and logstash. This parameter is returned only when **configType** is set to **collectorTargetInstance**.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The address that is used to access Kibana over the Internet after you enable Kibana Dashboard. This parameter is returned only when **configType** is set to **collectorElasticsearchForKibana**.
             */
            public Builder kibanaHost(String kibanaHost) {
                this.kibanaHost = kibanaHost;
                return this;
            }

            /**
             * This parameter is returned only when configType is set to collectorDeployMachine.
             * <p>
             * 
             * This parameter indicates the information about the ECS instances or ACK clusters on which the shipper is installed.
             */
            public Builder machines(java.util.List < Machines> machines) {
                this.machines = machines;
                return this;
            }

            /**
             * The transfer protocol that is used. It is the same as the protocol over which you can access the output of the shipper. Valid values: HTTP and HTTPS. This parameter is returned only when **configType** is set to **collectorTargetInstance**.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The number of pods from which logs are successfully collected in the ACK cluster. This parameter is returned only when **configType** is set to **collectorDeployMachines** and **type** is set to **ACKCluster**.
             */
            public Builder successPodsCount(String successPodsCount) {
                this.successPodsCount = successPodsCount;
                return this;
            }

            /**
             * The number of pods from which logs needed to be collected in the ACK cluster. This parameter is returned only when **configType** is set to **collectorDeployMachines** and **type** is set to **ACKCluster**.
             */
            public Builder totalPodsCount(String totalPodsCount) {
                this.totalPodsCount = totalPodsCount;
                return this;
            }

            /**
             * The type of the machine on which the shipper is installed. This parameter is returned only when **configType** is set to **collectorDeployMachine**. Valid values:
             * <p>
             * 
             * *   ECSInstanceId
             * *   ACKCluster
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The username that is used to access the output of the shipper. Default value: elastic. This parameter is returned only when **configType** is set to **collectorTargetInstance** or **collectorElasticsearchForKibana**.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public ExtendConfigs build() {
                return new ExtendConfigs(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("collectorPaths")
        private java.util.List < String > collectorPaths;

        @com.aliyun.core.annotation.NameInMap("configs")
        private java.util.List < Configs> configs;

        @com.aliyun.core.annotation.NameInMap("dryRun")
        private Boolean dryRun;

        @com.aliyun.core.annotation.NameInMap("extendConfigs")
        private java.util.List < ExtendConfigs> extendConfigs;

        @com.aliyun.core.annotation.NameInMap("gmtCreatedTime")
        private String gmtCreatedTime;

        @com.aliyun.core.annotation.NameInMap("gmtUpdateTime")
        private String gmtUpdateTime;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ownerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("resId")
        private String resId;

        @com.aliyun.core.annotation.NameInMap("resType")
        private String resType;

        @com.aliyun.core.annotation.NameInMap("resVersion")
        private String resVersion;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        private Result(Builder builder) {
            this.collectorPaths = builder.collectorPaths;
            this.configs = builder.configs;
            this.dryRun = builder.dryRun;
            this.extendConfigs = builder.extendConfigs;
            this.gmtCreatedTime = builder.gmtCreatedTime;
            this.gmtUpdateTime = builder.gmtUpdateTime;
            this.name = builder.name;
            this.ownerId = builder.ownerId;
            this.resId = builder.resId;
            this.resType = builder.resType;
            this.resVersion = builder.resVersion;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return collectorPaths
         */
        public java.util.List < String > getCollectorPaths() {
            return this.collectorPaths;
        }

        /**
         * @return configs
         */
        public java.util.List < Configs> getConfigs() {
            return this.configs;
        }

        /**
         * @return dryRun
         */
        public Boolean getDryRun() {
            return this.dryRun;
        }

        /**
         * @return extendConfigs
         */
        public java.util.List < ExtendConfigs> getExtendConfigs() {
            return this.extendConfigs;
        }

        /**
         * @return gmtCreatedTime
         */
        public String getGmtCreatedTime() {
            return this.gmtCreatedTime;
        }

        /**
         * @return gmtUpdateTime
         */
        public String getGmtUpdateTime() {
            return this.gmtUpdateTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return resId
         */
        public String getResId() {
            return this.resId;
        }

        /**
         * @return resType
         */
        public String getResType() {
            return this.resType;
        }

        /**
         * @return resVersion
         */
        public String getResVersion() {
            return this.resVersion;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private java.util.List < String > collectorPaths; 
            private java.util.List < Configs> configs; 
            private Boolean dryRun; 
            private java.util.List < ExtendConfigs> extendConfigs; 
            private String gmtCreatedTime; 
            private String gmtUpdateTime; 
            private String name; 
            private String ownerId; 
            private String resId; 
            private String resType; 
            private String resVersion; 
            private String status; 
            private String vpcId; 

            /**
             * collectorPaths.
             */
            public Builder collectorPaths(java.util.List < String > collectorPaths) {
                this.collectorPaths = collectorPaths;
                return this;
            }

            /**
             * The information about the configuration file for the shipper.
             */
            public Builder configs(java.util.List < Configs> configs) {
                this.configs = configs;
                return this;
            }

            /**
             * Indicates whether the shipper is checked and updated. Valid values:
             * <p>
             * 
             * *   true: The shipper is only checked.
             * *   false: The shipper is checked and updated.
             */
            public Builder dryRun(Boolean dryRun) {
                this.dryRun = dryRun;
                return this;
            }

            /**
             * The extended parameters that are configured for the shipper.
             */
            public Builder extendConfigs(java.util.List < ExtendConfigs> extendConfigs) {
                this.extendConfigs = extendConfigs;
                return this;
            }

            /**
             * The time when the shipper was created.
             */
            public Builder gmtCreatedTime(String gmtCreatedTime) {
                this.gmtCreatedTime = gmtCreatedTime;
                return this;
            }

            /**
             * The time when the shipper was updated.
             */
            public Builder gmtUpdateTime(String gmtUpdateTime) {
                this.gmtUpdateTime = gmtUpdateTime;
                return this;
            }

            /**
             * The name of the shipper.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The account ID.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The shipper ID.
             */
            public Builder resId(String resId) {
                this.resId = resId;
                return this;
            }

            /**
             * The type of the shipper. Valid values: fileBeat, metricBeat, heartBeat, and auditBeat.
             */
            public Builder resType(String resType) {
                this.resType = resType;
                return this;
            }

            /**
             * The version of the shipper.
             */
            public Builder resVersion(String resVersion) {
                this.resVersion = resVersion;
                return this;
            }

            /**
             * The status of the shipper. Valid values:
             * <p>
             * 
             * *   activing: The shipper is being initialized.
             * *   active: The shipper is in effect.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the VPC in which the shipper resides.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
