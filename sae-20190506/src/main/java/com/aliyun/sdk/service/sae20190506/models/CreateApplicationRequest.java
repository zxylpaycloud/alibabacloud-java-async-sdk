// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationRequest</p>
 */
public class CreateApplicationRequest extends Request {
    @Query
    @NameInMap("AcrAssumeRoleArn")
    private String acrAssumeRoleArn;

    @Body
    @NameInMap("AcrInstanceId")
    private String acrInstanceId;

    @Query
    @NameInMap("AppDescription")
    private String appDescription;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Body
    @NameInMap("AssociateEip")
    private Boolean associateEip;

    @Query
    @NameInMap("AutoConfig")
    private Boolean autoConfig;

    @Query
    @NameInMap("Command")
    private String command;

    @Query
    @NameInMap("CommandArgs")
    private String commandArgs;

    @Body
    @NameInMap("ConfigMapMountDesc")
    private String configMapMountDesc;

    @Query
    @NameInMap("Cpu")
    private Integer cpu;

    @Query
    @NameInMap("CustomHostAlias")
    private String customHostAlias;

    @Query
    @NameInMap("Deploy")
    private Boolean deploy;

    @Query
    @NameInMap("EdasContainerVersion")
    private String edasContainerVersion;

    @Query
    @NameInMap("EnableEbpf")
    private String enableEbpf;

    @Query
    @NameInMap("Envs")
    private String envs;

    @Query
    @NameInMap("ImagePullSecrets")
    private String imagePullSecrets;

    @Query
    @NameInMap("ImageUrl")
    private String imageUrl;

    @Query
    @NameInMap("JarStartArgs")
    private String jarStartArgs;

    @Query
    @NameInMap("JarStartOptions")
    private String jarStartOptions;

    @Query
    @NameInMap("Jdk")
    private String jdk;

    @Query
    @NameInMap("KafkaConfigs")
    private String kafkaConfigs;

    @Query
    @NameInMap("Liveness")
    private String liveness;

    @Query
    @NameInMap("Memory")
    private Integer memory;

    @Query
    @NameInMap("MicroRegistration")
    private String microRegistration;

    @Query
    @NameInMap("MountDesc")
    private String mountDesc;

    @Query
    @NameInMap("MountHost")
    private String mountHost;

    @Query
    @NameInMap("NamespaceId")
    private String namespaceId;

    @Query
    @NameInMap("NasConfigs")
    private String nasConfigs;

    @Query
    @NameInMap("NasId")
    private String nasId;

    @Body
    @NameInMap("OssAkId")
    private String ossAkId;

    @Body
    @NameInMap("OssAkSecret")
    private String ossAkSecret;

    @Body
    @NameInMap("OssMountDescs")
    private String ossMountDescs;

    @Query
    @NameInMap("PackageType")
    @Validation(required = true)
    private String packageType;

    @Query
    @NameInMap("PackageUrl")
    private String packageUrl;

    @Query
    @NameInMap("PackageVersion")
    private String packageVersion;

    @Body
    @NameInMap("Php")
    private String php;

    @Query
    @NameInMap("PhpArmsConfigLocation")
    private String phpArmsConfigLocation;

    @Body
    @NameInMap("PhpConfig")
    private String phpConfig;

    @Query
    @NameInMap("PhpConfigLocation")
    private String phpConfigLocation;

    @Query
    @NameInMap("PostStart")
    private String postStart;

    @Query
    @NameInMap("PreStop")
    private String preStop;

    @Query
    @NameInMap("ProgrammingLanguage")
    private String programmingLanguage;

    @Query
    @NameInMap("PvtzDiscoverySvc")
    private String pvtzDiscoverySvc;

    @Query
    @NameInMap("Python")
    private String python;

    @Query
    @NameInMap("PythonModules")
    private String pythonModules;

    @Query
    @NameInMap("Readiness")
    private String readiness;

    @Query
    @NameInMap("Replicas")
    @Validation(required = true)
    private Integer replicas;

    @Query
    @NameInMap("SaeVersion")
    private String saeVersion;

    @Query
    @NameInMap("SecurityGroupId")
    private String securityGroupId;

    @Query
    @NameInMap("SlsConfigs")
    private String slsConfigs;

    @Query
    @NameInMap("TerminationGracePeriodSeconds")
    @Validation(maximum = 6000)
    private Integer terminationGracePeriodSeconds;

    @Query
    @NameInMap("Timezone")
    private String timezone;

    @Query
    @NameInMap("TomcatConfig")
    private String tomcatConfig;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Query
    @NameInMap("WarStartOptions")
    private String warStartOptions;

    @Query
    @NameInMap("WebContainer")
    private String webContainer;

    private CreateApplicationRequest(Builder builder) {
        super(builder);
        this.acrAssumeRoleArn = builder.acrAssumeRoleArn;
        this.acrInstanceId = builder.acrInstanceId;
        this.appDescription = builder.appDescription;
        this.appName = builder.appName;
        this.associateEip = builder.associateEip;
        this.autoConfig = builder.autoConfig;
        this.command = builder.command;
        this.commandArgs = builder.commandArgs;
        this.configMapMountDesc = builder.configMapMountDesc;
        this.cpu = builder.cpu;
        this.customHostAlias = builder.customHostAlias;
        this.deploy = builder.deploy;
        this.edasContainerVersion = builder.edasContainerVersion;
        this.enableEbpf = builder.enableEbpf;
        this.envs = builder.envs;
        this.imagePullSecrets = builder.imagePullSecrets;
        this.imageUrl = builder.imageUrl;
        this.jarStartArgs = builder.jarStartArgs;
        this.jarStartOptions = builder.jarStartOptions;
        this.jdk = builder.jdk;
        this.kafkaConfigs = builder.kafkaConfigs;
        this.liveness = builder.liveness;
        this.memory = builder.memory;
        this.microRegistration = builder.microRegistration;
        this.mountDesc = builder.mountDesc;
        this.mountHost = builder.mountHost;
        this.namespaceId = builder.namespaceId;
        this.nasConfigs = builder.nasConfigs;
        this.nasId = builder.nasId;
        this.ossAkId = builder.ossAkId;
        this.ossAkSecret = builder.ossAkSecret;
        this.ossMountDescs = builder.ossMountDescs;
        this.packageType = builder.packageType;
        this.packageUrl = builder.packageUrl;
        this.packageVersion = builder.packageVersion;
        this.php = builder.php;
        this.phpArmsConfigLocation = builder.phpArmsConfigLocation;
        this.phpConfig = builder.phpConfig;
        this.phpConfigLocation = builder.phpConfigLocation;
        this.postStart = builder.postStart;
        this.preStop = builder.preStop;
        this.programmingLanguage = builder.programmingLanguage;
        this.pvtzDiscoverySvc = builder.pvtzDiscoverySvc;
        this.python = builder.python;
        this.pythonModules = builder.pythonModules;
        this.readiness = builder.readiness;
        this.replicas = builder.replicas;
        this.saeVersion = builder.saeVersion;
        this.securityGroupId = builder.securityGroupId;
        this.slsConfigs = builder.slsConfigs;
        this.terminationGracePeriodSeconds = builder.terminationGracePeriodSeconds;
        this.timezone = builder.timezone;
        this.tomcatConfig = builder.tomcatConfig;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.warStartOptions = builder.warStartOptions;
        this.webContainer = builder.webContainer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acrAssumeRoleArn
     */
    public String getAcrAssumeRoleArn() {
        return this.acrAssumeRoleArn;
    }

    /**
     * @return acrInstanceId
     */
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    /**
     * @return appDescription
     */
    public String getAppDescription() {
        return this.appDescription;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return associateEip
     */
    public Boolean getAssociateEip() {
        return this.associateEip;
    }

    /**
     * @return autoConfig
     */
    public Boolean getAutoConfig() {
        return this.autoConfig;
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return commandArgs
     */
    public String getCommandArgs() {
        return this.commandArgs;
    }

    /**
     * @return configMapMountDesc
     */
    public String getConfigMapMountDesc() {
        return this.configMapMountDesc;
    }

    /**
     * @return cpu
     */
    public Integer getCpu() {
        return this.cpu;
    }

    /**
     * @return customHostAlias
     */
    public String getCustomHostAlias() {
        return this.customHostAlias;
    }

    /**
     * @return deploy
     */
    public Boolean getDeploy() {
        return this.deploy;
    }

    /**
     * @return edasContainerVersion
     */
    public String getEdasContainerVersion() {
        return this.edasContainerVersion;
    }

    /**
     * @return enableEbpf
     */
    public String getEnableEbpf() {
        return this.enableEbpf;
    }

    /**
     * @return envs
     */
    public String getEnvs() {
        return this.envs;
    }

    /**
     * @return imagePullSecrets
     */
    public String getImagePullSecrets() {
        return this.imagePullSecrets;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return jarStartArgs
     */
    public String getJarStartArgs() {
        return this.jarStartArgs;
    }

    /**
     * @return jarStartOptions
     */
    public String getJarStartOptions() {
        return this.jarStartOptions;
    }

    /**
     * @return jdk
     */
    public String getJdk() {
        return this.jdk;
    }

    /**
     * @return kafkaConfigs
     */
    public String getKafkaConfigs() {
        return this.kafkaConfigs;
    }

    /**
     * @return liveness
     */
    public String getLiveness() {
        return this.liveness;
    }

    /**
     * @return memory
     */
    public Integer getMemory() {
        return this.memory;
    }

    /**
     * @return microRegistration
     */
    public String getMicroRegistration() {
        return this.microRegistration;
    }

    /**
     * @return mountDesc
     */
    public String getMountDesc() {
        return this.mountDesc;
    }

    /**
     * @return mountHost
     */
    public String getMountHost() {
        return this.mountHost;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return nasConfigs
     */
    public String getNasConfigs() {
        return this.nasConfigs;
    }

    /**
     * @return nasId
     */
    public String getNasId() {
        return this.nasId;
    }

    /**
     * @return ossAkId
     */
    public String getOssAkId() {
        return this.ossAkId;
    }

    /**
     * @return ossAkSecret
     */
    public String getOssAkSecret() {
        return this.ossAkSecret;
    }

    /**
     * @return ossMountDescs
     */
    public String getOssMountDescs() {
        return this.ossMountDescs;
    }

    /**
     * @return packageType
     */
    public String getPackageType() {
        return this.packageType;
    }

    /**
     * @return packageUrl
     */
    public String getPackageUrl() {
        return this.packageUrl;
    }

    /**
     * @return packageVersion
     */
    public String getPackageVersion() {
        return this.packageVersion;
    }

    /**
     * @return php
     */
    public String getPhp() {
        return this.php;
    }

    /**
     * @return phpArmsConfigLocation
     */
    public String getPhpArmsConfigLocation() {
        return this.phpArmsConfigLocation;
    }

    /**
     * @return phpConfig
     */
    public String getPhpConfig() {
        return this.phpConfig;
    }

    /**
     * @return phpConfigLocation
     */
    public String getPhpConfigLocation() {
        return this.phpConfigLocation;
    }

    /**
     * @return postStart
     */
    public String getPostStart() {
        return this.postStart;
    }

    /**
     * @return preStop
     */
    public String getPreStop() {
        return this.preStop;
    }

    /**
     * @return programmingLanguage
     */
    public String getProgrammingLanguage() {
        return this.programmingLanguage;
    }

    /**
     * @return pvtzDiscoverySvc
     */
    public String getPvtzDiscoverySvc() {
        return this.pvtzDiscoverySvc;
    }

    /**
     * @return python
     */
    public String getPython() {
        return this.python;
    }

    /**
     * @return pythonModules
     */
    public String getPythonModules() {
        return this.pythonModules;
    }

    /**
     * @return readiness
     */
    public String getReadiness() {
        return this.readiness;
    }

    /**
     * @return replicas
     */
    public Integer getReplicas() {
        return this.replicas;
    }

    /**
     * @return saeVersion
     */
    public String getSaeVersion() {
        return this.saeVersion;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return slsConfigs
     */
    public String getSlsConfigs() {
        return this.slsConfigs;
    }

    /**
     * @return terminationGracePeriodSeconds
     */
    public Integer getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

    /**
     * @return timezone
     */
    public String getTimezone() {
        return this.timezone;
    }

    /**
     * @return tomcatConfig
     */
    public String getTomcatConfig() {
        return this.tomcatConfig;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return warStartOptions
     */
    public String getWarStartOptions() {
        return this.warStartOptions;
    }

    /**
     * @return webContainer
     */
    public String getWebContainer() {
        return this.webContainer;
    }

    public static final class Builder extends Request.Builder<CreateApplicationRequest, Builder> {
        private String acrAssumeRoleArn; 
        private String acrInstanceId; 
        private String appDescription; 
        private String appName; 
        private Boolean associateEip; 
        private Boolean autoConfig; 
        private String command; 
        private String commandArgs; 
        private String configMapMountDesc; 
        private Integer cpu; 
        private String customHostAlias; 
        private Boolean deploy; 
        private String edasContainerVersion; 
        private String enableEbpf; 
        private String envs; 
        private String imagePullSecrets; 
        private String imageUrl; 
        private String jarStartArgs; 
        private String jarStartOptions; 
        private String jdk; 
        private String kafkaConfigs; 
        private String liveness; 
        private Integer memory; 
        private String microRegistration; 
        private String mountDesc; 
        private String mountHost; 
        private String namespaceId; 
        private String nasConfigs; 
        private String nasId; 
        private String ossAkId; 
        private String ossAkSecret; 
        private String ossMountDescs; 
        private String packageType; 
        private String packageUrl; 
        private String packageVersion; 
        private String php; 
        private String phpArmsConfigLocation; 
        private String phpConfig; 
        private String phpConfigLocation; 
        private String postStart; 
        private String preStop; 
        private String programmingLanguage; 
        private String pvtzDiscoverySvc; 
        private String python; 
        private String pythonModules; 
        private String readiness; 
        private Integer replicas; 
        private String saeVersion; 
        private String securityGroupId; 
        private String slsConfigs; 
        private Integer terminationGracePeriodSeconds; 
        private String timezone; 
        private String tomcatConfig; 
        private String vSwitchId; 
        private String vpcId; 
        private String warStartOptions; 
        private String webContainer; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationRequest request) {
            super(request);
            this.acrAssumeRoleArn = request.acrAssumeRoleArn;
            this.acrInstanceId = request.acrInstanceId;
            this.appDescription = request.appDescription;
            this.appName = request.appName;
            this.associateEip = request.associateEip;
            this.autoConfig = request.autoConfig;
            this.command = request.command;
            this.commandArgs = request.commandArgs;
            this.configMapMountDesc = request.configMapMountDesc;
            this.cpu = request.cpu;
            this.customHostAlias = request.customHostAlias;
            this.deploy = request.deploy;
            this.edasContainerVersion = request.edasContainerVersion;
            this.enableEbpf = request.enableEbpf;
            this.envs = request.envs;
            this.imagePullSecrets = request.imagePullSecrets;
            this.imageUrl = request.imageUrl;
            this.jarStartArgs = request.jarStartArgs;
            this.jarStartOptions = request.jarStartOptions;
            this.jdk = request.jdk;
            this.kafkaConfigs = request.kafkaConfigs;
            this.liveness = request.liveness;
            this.memory = request.memory;
            this.microRegistration = request.microRegistration;
            this.mountDesc = request.mountDesc;
            this.mountHost = request.mountHost;
            this.namespaceId = request.namespaceId;
            this.nasConfigs = request.nasConfigs;
            this.nasId = request.nasId;
            this.ossAkId = request.ossAkId;
            this.ossAkSecret = request.ossAkSecret;
            this.ossMountDescs = request.ossMountDescs;
            this.packageType = request.packageType;
            this.packageUrl = request.packageUrl;
            this.packageVersion = request.packageVersion;
            this.php = request.php;
            this.phpArmsConfigLocation = request.phpArmsConfigLocation;
            this.phpConfig = request.phpConfig;
            this.phpConfigLocation = request.phpConfigLocation;
            this.postStart = request.postStart;
            this.preStop = request.preStop;
            this.programmingLanguage = request.programmingLanguage;
            this.pvtzDiscoverySvc = request.pvtzDiscoverySvc;
            this.python = request.python;
            this.pythonModules = request.pythonModules;
            this.readiness = request.readiness;
            this.replicas = request.replicas;
            this.saeVersion = request.saeVersion;
            this.securityGroupId = request.securityGroupId;
            this.slsConfigs = request.slsConfigs;
            this.terminationGracePeriodSeconds = request.terminationGracePeriodSeconds;
            this.timezone = request.timezone;
            this.tomcatConfig = request.tomcatConfig;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.warStartOptions = request.warStartOptions;
            this.webContainer = request.webContainer;
        } 

        /**
         * acs:ram::123456789012\*\*\*\*:role/adminrole
         */
        public Builder acrAssumeRoleArn(String acrAssumeRoleArn) {
            this.putQueryParameter("AcrAssumeRoleArn", acrAssumeRoleArn);
            this.acrAssumeRoleArn = acrAssumeRoleArn;
            return this;
        }

        /**
         * cri-xxxxxx
         */
        public Builder acrInstanceId(String acrInstanceId) {
            this.putBodyParameter("AcrInstanceId", acrInstanceId);
            this.acrInstanceId = acrInstanceId;
            return this;
        }

        /**
         * This is a test description.
         */
        public Builder appDescription(String appDescription) {
            this.putQueryParameter("AppDescription", appDescription);
            this.appDescription = appDescription;
            return this;
        }

        /**
         * test
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * true
         */
        public Builder associateEip(Boolean associateEip) {
            this.putBodyParameter("AssociateEip", associateEip);
            this.associateEip = associateEip;
            return this;
        }

        /**
         * true
         */
        public Builder autoConfig(Boolean autoConfig) {
            this.putQueryParameter("AutoConfig", autoConfig);
            this.autoConfig = autoConfig;
            return this;
        }

        /**
         * sleep
         */
        public Builder command(String command) {
            this.putQueryParameter("Command", command);
            this.command = command;
            return this;
        }

        /**
         * 1d
         */
        public Builder commandArgs(String commandArgs) {
            this.putQueryParameter("CommandArgs", commandArgs);
            this.commandArgs = commandArgs;
            return this;
        }

        /**
         * \[{"configMapId":16,"key":"test","mountPath":"/tmp"}]
         */
        public Builder configMapMountDesc(String configMapMountDesc) {
            this.putBodyParameter("ConfigMapMountDesc", configMapMountDesc);
            this.configMapMountDesc = configMapMountDesc;
            return this;
        }

        /**
         * 1000
         */
        public Builder cpu(Integer cpu) {
            this.putQueryParameter("Cpu", cpu);
            this.cpu = cpu;
            return this;
        }

        /**
         * \[{"hostName":"samplehost","ip":"127.0.0.1"}]
         */
        public Builder customHostAlias(String customHostAlias) {
            this.putQueryParameter("CustomHostAlias", customHostAlias);
            this.customHostAlias = customHostAlias;
            return this;
        }

        /**
         * true
         */
        public Builder deploy(Boolean deploy) {
            this.putQueryParameter("Deploy", deploy);
            this.deploy = deploy;
            return this;
        }

        /**
         * 3.5.3
         */
        public Builder edasContainerVersion(String edasContainerVersion) {
            this.putQueryParameter("EdasContainerVersion", edasContainerVersion);
            this.edasContainerVersion = edasContainerVersion;
            return this;
        }

        /**
         * EnableEbpf.
         */
        public Builder enableEbpf(String enableEbpf) {
            this.putQueryParameter("EnableEbpf", enableEbpf);
            this.enableEbpf = enableEbpf;
            return this;
        }

        /**
         * \[{"name":"envtmp","value":"0"}]
         */
        public Builder envs(String envs) {
            this.putQueryParameter("Envs", envs);
            this.envs = envs;
            return this;
        }

        /**
         * ImagePullSecrets.
         */
        public Builder imagePullSecrets(String imagePullSecrets) {
            this.putQueryParameter("ImagePullSecrets", imagePullSecrets);
            this.imagePullSecrets = imagePullSecrets;
            return this;
        }

        /**
         * registry.cn-hangzhou.aliyuncs.com/sae_test/ali_sae_test:0.0.1
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * custom-args
         */
        public Builder jarStartArgs(String jarStartArgs) {
            this.putQueryParameter("JarStartArgs", jarStartArgs);
            this.jarStartArgs = jarStartArgs;
            return this;
        }

        /**
         * \-Xms4G -Xmx4G
         */
        public Builder jarStartOptions(String jarStartOptions) {
            this.putQueryParameter("JarStartOptions", jarStartOptions);
            this.jarStartOptions = jarStartOptions;
            return this;
        }

        /**
         * Open JDK 8
         */
        public Builder jdk(String jdk) {
            this.putQueryParameter("Jdk", jdk);
            this.jdk = jdk;
            return this;
        }

        /**
         * KafkaConfigs.
         */
        public Builder kafkaConfigs(String kafkaConfigs) {
            this.putQueryParameter("KafkaConfigs", kafkaConfigs);
            this.kafkaConfigs = kafkaConfigs;
            return this;
        }

        /**
         * {"exec":{"command":\["sh","-c","cat /home/admin/start.sh"]},"initialDelaySeconds":30,"periodSeconds":30,"timeoutSeconds":2}
         */
        public Builder liveness(String liveness) {
            this.putQueryParameter("Liveness", liveness);
            this.liveness = liveness;
            return this;
        }

        /**
         * 1024
         */
        public Builder memory(Integer memory) {
            this.putQueryParameter("Memory", memory);
            this.memory = memory;
            return this;
        }

        /**
         * MicroRegistration.
         */
        public Builder microRegistration(String microRegistration) {
            this.putQueryParameter("MicroRegistration", microRegistration);
            this.microRegistration = microRegistration;
            return this;
        }

        /**
         * \[{mountPath: "/tmp", nasPath: "/"}]
         */
        public Builder mountDesc(String mountDesc) {
            this.putQueryParameter("MountDesc", mountDesc);
            this.mountDesc = mountDesc;
            return this;
        }

        /**
         * example.com
         */
        public Builder mountHost(String mountHost) {
            this.putQueryParameter("MountHost", mountHost);
            this.mountHost = mountHost;
            return this;
        }

        /**
         * cn-beijing:test
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * NasConfigs.
         */
        public Builder nasConfigs(String nasConfigs) {
            this.putQueryParameter("NasConfigs", nasConfigs);
            this.nasConfigs = nasConfigs;
            return this;
        }

        /**
         * KSAK\*\*\*\*
         */
        public Builder nasId(String nasId) {
            this.putQueryParameter("NasId", nasId);
            this.nasId = nasId;
            return this;
        }

        /**
         * xxxxxx
         */
        public Builder ossAkId(String ossAkId) {
            this.putBodyParameter("OssAkId", ossAkId);
            this.ossAkId = ossAkId;
            return this;
        }

        /**
         * xxxxxx
         */
        public Builder ossAkSecret(String ossAkSecret) {
            this.putBodyParameter("OssAkSecret", ossAkSecret);
            this.ossAkSecret = ossAkSecret;
            return this;
        }

        /**
         * \[{"bucketName": "oss-bucket", "bucketPath": "data/user.data", "mountPath": "/usr/data/user.data", "readOnly": true}]
         */
        public Builder ossMountDescs(String ossMountDescs) {
            this.putBodyParameter("OssMountDescs", ossMountDescs);
            this.ossMountDescs = ossMountDescs;
            return this;
        }

        /**
         * FatJar
         */
        public Builder packageType(String packageType) {
            this.putQueryParameter("PackageType", packageType);
            this.packageType = packageType;
            return this;
        }

        /**
         * http://myoss.oss-cn-\*\*\*\*.aliyuncs.com/my-buc/2019-06-30/\*\*\*\*.jar
         */
        public Builder packageUrl(String packageUrl) {
            this.putQueryParameter("PackageUrl", packageUrl);
            this.packageUrl = packageUrl;
            return this;
        }

        /**
         * 1.0.0
         */
        public Builder packageVersion(String packageVersion) {
            this.putQueryParameter("PackageVersion", packageVersion);
            this.packageVersion = packageVersion;
            return this;
        }

        /**
         * Php.
         */
        public Builder php(String php) {
            this.putBodyParameter("Php", php);
            this.php = php;
            return this;
        }

        /**
         * /usr/local/etc/php/conf.d/arms.ini
         */
        public Builder phpArmsConfigLocation(String phpArmsConfigLocation) {
            this.putQueryParameter("PhpArmsConfigLocation", phpArmsConfigLocation);
            this.phpArmsConfigLocation = phpArmsConfigLocation;
            return this;
        }

        /**
         * k1=v1
         */
        public Builder phpConfig(String phpConfig) {
            this.putBodyParameter("PhpConfig", phpConfig);
            this.phpConfig = phpConfig;
            return this;
        }

        /**
         * /usr/local/etc/php/php.ini
         */
        public Builder phpConfigLocation(String phpConfigLocation) {
            this.putQueryParameter("PhpConfigLocation", phpConfigLocation);
            this.phpConfigLocation = phpConfigLocation;
            return this;
        }

        /**
         * {"exec":{"command":\["cat","/etc/group"]}}
         */
        public Builder postStart(String postStart) {
            this.putQueryParameter("PostStart", postStart);
            this.postStart = postStart;
            return this;
        }

        /**
         * {"exec":{"command":\["cat","/etc/group"]}}
         */
        public Builder preStop(String preStop) {
            this.putQueryParameter("PreStop", preStop);
            this.preStop = preStop;
            return this;
        }

        /**
         * ProgrammingLanguage.
         */
        public Builder programmingLanguage(String programmingLanguage) {
            this.putQueryParameter("ProgrammingLanguage", programmingLanguage);
            this.programmingLanguage = programmingLanguage;
            return this;
        }

        /**
         * PvtzDiscoverySvc.
         */
        public Builder pvtzDiscoverySvc(String pvtzDiscoverySvc) {
            this.putQueryParameter("PvtzDiscoverySvc", pvtzDiscoverySvc);
            this.pvtzDiscoverySvc = pvtzDiscoverySvc;
            return this;
        }

        /**
         * Python.
         */
        public Builder python(String python) {
            this.putQueryParameter("Python", python);
            this.python = python;
            return this;
        }

        /**
         * PythonModules.
         */
        public Builder pythonModules(String pythonModules) {
            this.putQueryParameter("PythonModules", pythonModules);
            this.pythonModules = pythonModules;
            return this;
        }

        /**
         * {"exec":{"command":\["sh","-c","cat /home/admin/start.sh"]},"initialDelaySeconds":30,"periodSeconds":30,"timeoutSeconds":2}
         */
        public Builder readiness(String readiness) {
            this.putQueryParameter("Readiness", readiness);
            this.readiness = readiness;
            return this;
        }

        /**
         * 1
         */
        public Builder replicas(Integer replicas) {
            this.putQueryParameter("Replicas", replicas);
            this.replicas = replicas;
            return this;
        }

        /**
         * SaeVersion.
         */
        public Builder saeVersion(String saeVersion) {
            this.putQueryParameter("SaeVersion", saeVersion);
            this.saeVersion = saeVersion;
            return this;
        }

        /**
         * sg-wz969ngg2e49q5i4\*\*\*\*
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * \[{"logDir":"","logType":"stdout"},{"logDir":"/tmp/a.log"}]
         */
        public Builder slsConfigs(String slsConfigs) {
            this.putQueryParameter("SlsConfigs", slsConfigs);
            this.slsConfigs = slsConfigs;
            return this;
        }

        /**
         * 30
         */
        public Builder terminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
            this.putQueryParameter("TerminationGracePeriodSeconds", terminationGracePeriodSeconds);
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }

        /**
         * Asia/Shanghai
         */
        public Builder timezone(String timezone) {
            this.putQueryParameter("Timezone", timezone);
            this.timezone = timezone;
            return this;
        }

        /**
         * {"port":8080,"contextPath":"/","maxThreads":400,"uriEncoding":"ISO-8859-1","useBodyEncodingForUri":true}
         */
        public Builder tomcatConfig(String tomcatConfig) {
            this.putQueryParameter("TomcatConfig", tomcatConfig);
            this.tomcatConfig = tomcatConfig;
            return this;
        }

        /**
         * vsw-bp12mw1f8k3jgygk9\*\*\*\*
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * vpc-bp1aevy8sofi8mh1q\*\*\*\*
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * CATALINA_OPTS=\\"$CATALINA_OPTS $Options\\" catalina.sh run
         */
        public Builder warStartOptions(String warStartOptions) {
            this.putQueryParameter("WarStartOptions", warStartOptions);
            this.warStartOptions = warStartOptions;
            return this;
        }

        /**
         * apache-tomcat-7.0.91
         */
        public Builder webContainer(String webContainer) {
            this.putQueryParameter("WebContainer", webContainer);
            this.webContainer = webContainer;
            return this;
        }

        @Override
        public CreateApplicationRequest build() {
            return new CreateApplicationRequest(this);
        } 

    } 

}
