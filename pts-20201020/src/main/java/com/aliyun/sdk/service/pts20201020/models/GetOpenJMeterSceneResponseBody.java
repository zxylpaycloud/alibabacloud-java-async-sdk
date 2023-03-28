// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpenJMeterSceneResponseBody} extends {@link TeaModel}
 *
 * <p>GetOpenJMeterSceneResponseBody</p>
 */
public class GetOpenJMeterSceneResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Scene")
    private Scene scene;

    @NameInMap("Success")
    private Boolean success;

    private GetOpenJMeterSceneResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.scene = builder.scene;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpenJMeterSceneResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scene
     */
    public Scene getScene() {
        return this.scene;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Scene scene; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * 场景详情
         */
        public Builder scene(Scene scene) {
            this.scene = scene;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetOpenJMeterSceneResponseBody build() {
            return new GetOpenJMeterSceneResponseBody(this);
        } 

    } 

    public static class BaseInfo extends TeaModel {
        @NameInMap("CreateName")
        private String createName;

        @NameInMap("ModifyName")
        private String modifyName;

        @NameInMap("OperateType")
        private String operateType;

        @NameInMap("Principal")
        private String principal;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("Resource")
        private String resource;

        private BaseInfo(Builder builder) {
            this.createName = builder.createName;
            this.modifyName = builder.modifyName;
            this.operateType = builder.operateType;
            this.principal = builder.principal;
            this.remark = builder.remark;
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaseInfo create() {
            return builder().build();
        }

        /**
         * @return createName
         */
        public String getCreateName() {
            return this.createName;
        }

        /**
         * @return modifyName
         */
        public String getModifyName() {
            return this.modifyName;
        }

        /**
         * @return operateType
         */
        public String getOperateType() {
            return this.operateType;
        }

        /**
         * @return principal
         */
        public String getPrincipal() {
            return this.principal;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        public static final class Builder {
            private String createName; 
            private String modifyName; 
            private String operateType; 
            private String principal; 
            private String remark; 
            private String resource; 

            /**
             * 创建人名
             */
            public Builder createName(String createName) {
                this.createName = createName;
                return this;
            }

            /**
             * 修改人名
             */
            public Builder modifyName(String modifyName) {
                this.modifyName = modifyName;
                return this;
            }

            /**
             * 操作类型
             */
            public Builder operateType(String operateType) {
                this.operateType = operateType;
                return this;
            }

            /**
             * 场景压测负责人
             */
            public Builder principal(String principal) {
                this.principal = principal;
                return this;
            }

            /**
             * 备注
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * 场景来源
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            public BaseInfo build() {
                return new BaseInfo(this);
            } 

        } 

    }
    public static class DnsCacheConfig extends TeaModel {
        @NameInMap("ClearCacheEachIteration")
        private Boolean clearCacheEachIteration;

        @NameInMap("DnsServers")
        private java.util.List < String > dnsServers;

        @NameInMap("HostTable")
        private java.util.Map < String, ? > hostTable;

        private DnsCacheConfig(Builder builder) {
            this.clearCacheEachIteration = builder.clearCacheEachIteration;
            this.dnsServers = builder.dnsServers;
            this.hostTable = builder.hostTable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnsCacheConfig create() {
            return builder().build();
        }

        /**
         * @return clearCacheEachIteration
         */
        public Boolean getClearCacheEachIteration() {
            return this.clearCacheEachIteration;
        }

        /**
         * @return dnsServers
         */
        public java.util.List < String > getDnsServers() {
            return this.dnsServers;
        }

        /**
         * @return hostTable
         */
        public java.util.Map < String, ? > getHostTable() {
            return this.hostTable;
        }

        public static final class Builder {
            private Boolean clearCacheEachIteration; 
            private java.util.List < String > dnsServers; 
            private java.util.Map < String, ? > hostTable; 

            /**
             * 是否清除缓存
             */
            public Builder clearCacheEachIteration(Boolean clearCacheEachIteration) {
                this.clearCacheEachIteration = clearCacheEachIteration;
                return this;
            }

            /**
             * DNS服务器
             */
            public Builder dnsServers(java.util.List < String > dnsServers) {
                this.dnsServers = dnsServers;
                return this;
            }

            /**
             * 域名绑定
             */
            public Builder hostTable(java.util.Map < String, ? > hostTable) {
                this.hostTable = hostTable;
                return this;
            }

            public DnsCacheConfig build() {
                return new DnsCacheConfig(this);
            } 

        } 

    }
    public static class FileList extends TeaModel {
        @NameInMap("FileName")
        private String fileName;

        @NameInMap("FileOssAddress")
        private String fileOssAddress;

        @NameInMap("FileSize")
        private Long fileSize;

        @NameInMap("FileType")
        private String fileType;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Md5")
        private String md5;

        @NameInMap("SplitCsv")
        private Boolean splitCsv;

        private FileList(Builder builder) {
            this.fileName = builder.fileName;
            this.fileOssAddress = builder.fileOssAddress;
            this.fileSize = builder.fileSize;
            this.fileType = builder.fileType;
            this.id = builder.id;
            this.md5 = builder.md5;
            this.splitCsv = builder.splitCsv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileList create() {
            return builder().build();
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileOssAddress
         */
        public String getFileOssAddress() {
            return this.fileOssAddress;
        }

        /**
         * @return fileSize
         */
        public Long getFileSize() {
            return this.fileSize;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return splitCsv
         */
        public Boolean getSplitCsv() {
            return this.splitCsv;
        }

        public static final class Builder {
            private String fileName; 
            private String fileOssAddress; 
            private Long fileSize; 
            private String fileType; 
            private Long id; 
            private String md5; 
            private Boolean splitCsv; 

            /**
             * 文件名
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * 文件地址
             */
            public Builder fileOssAddress(String fileOssAddress) {
                this.fileOssAddress = fileOssAddress;
                return this;
            }

            /**
             * 文件大小
             */
            public Builder fileSize(Long fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * 文件类型
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * 文件ID
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 文件的md5值
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * csv文件是否切分
             */
            public Builder splitCsv(Boolean splitCsv) {
                this.splitCsv = splitCsv;
                return this;
            }

            public FileList build() {
                return new FileList(this);
            } 

        } 

    }
    public static class Scene extends TeaModel {
        @NameInMap("AgentCount")
        private Integer agentCount;

        @NameInMap("BaseInfo")
        private BaseInfo baseInfo;

        @NameInMap("Concurrency")
        private Integer concurrency;

        @NameInMap("ConstantThroughputTimerType")
        private String constantThroughputTimerType;

        @NameInMap("DnsCacheConfig")
        private DnsCacheConfig dnsCacheConfig;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("EnvironmentId")
        private String environmentId;

        @NameInMap("FileList")
        private java.util.List < FileList> fileList;

        @NameInMap("IsVpcTest")
        private Boolean isVpcTest;

        @NameInMap("MaxRps")
        private Integer maxRps;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("Pool")
        private String pool;

        @NameInMap("RampUp")
        private Integer rampUp;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SceneId")
        private String sceneId;

        @NameInMap("SceneName")
        private String sceneName;

        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("StartConcurrency")
        private Integer startConcurrency;

        @NameInMap("StartRps")
        private Integer startRps;

        @NameInMap("Steps")
        private Integer steps;

        @NameInMap("SyncTimerType")
        private String syncTimerType;

        @NameInMap("TestFile")
        private String testFile;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
        private String vpcId;

        private Scene(Builder builder) {
            this.agentCount = builder.agentCount;
            this.baseInfo = builder.baseInfo;
            this.concurrency = builder.concurrency;
            this.constantThroughputTimerType = builder.constantThroughputTimerType;
            this.dnsCacheConfig = builder.dnsCacheConfig;
            this.duration = builder.duration;
            this.environmentId = builder.environmentId;
            this.fileList = builder.fileList;
            this.isVpcTest = builder.isVpcTest;
            this.maxRps = builder.maxRps;
            this.mode = builder.mode;
            this.pool = builder.pool;
            this.rampUp = builder.rampUp;
            this.regionId = builder.regionId;
            this.sceneId = builder.sceneId;
            this.sceneName = builder.sceneName;
            this.securityGroupId = builder.securityGroupId;
            this.startConcurrency = builder.startConcurrency;
            this.startRps = builder.startRps;
            this.steps = builder.steps;
            this.syncTimerType = builder.syncTimerType;
            this.testFile = builder.testFile;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scene create() {
            return builder().build();
        }

        /**
         * @return agentCount
         */
        public Integer getAgentCount() {
            return this.agentCount;
        }

        /**
         * @return baseInfo
         */
        public BaseInfo getBaseInfo() {
            return this.baseInfo;
        }

        /**
         * @return concurrency
         */
        public Integer getConcurrency() {
            return this.concurrency;
        }

        /**
         * @return constantThroughputTimerType
         */
        public String getConstantThroughputTimerType() {
            return this.constantThroughputTimerType;
        }

        /**
         * @return dnsCacheConfig
         */
        public DnsCacheConfig getDnsCacheConfig() {
            return this.dnsCacheConfig;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return fileList
         */
        public java.util.List < FileList> getFileList() {
            return this.fileList;
        }

        /**
         * @return isVpcTest
         */
        public Boolean getIsVpcTest() {
            return this.isVpcTest;
        }

        /**
         * @return maxRps
         */
        public Integer getMaxRps() {
            return this.maxRps;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return pool
         */
        public String getPool() {
            return this.pool;
        }

        /**
         * @return rampUp
         */
        public Integer getRampUp() {
            return this.rampUp;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return startConcurrency
         */
        public Integer getStartConcurrency() {
            return this.startConcurrency;
        }

        /**
         * @return startRps
         */
        public Integer getStartRps() {
            return this.startRps;
        }

        /**
         * @return steps
         */
        public Integer getSteps() {
            return this.steps;
        }

        /**
         * @return syncTimerType
         */
        public String getSyncTimerType() {
            return this.syncTimerType;
        }

        /**
         * @return testFile
         */
        public String getTestFile() {
            return this.testFile;
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

        public static final class Builder {
            private Integer agentCount; 
            private BaseInfo baseInfo; 
            private Integer concurrency; 
            private String constantThroughputTimerType; 
            private DnsCacheConfig dnsCacheConfig; 
            private Integer duration; 
            private String environmentId; 
            private java.util.List < FileList> fileList; 
            private Boolean isVpcTest; 
            private Integer maxRps; 
            private String mode; 
            private String pool; 
            private Integer rampUp; 
            private String regionId; 
            private String sceneId; 
            private String sceneName; 
            private String securityGroupId; 
            private Integer startConcurrency; 
            private Integer startRps; 
            private Integer steps; 
            private String syncTimerType; 
            private String testFile; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * 施压机数量
             */
            public Builder agentCount(Integer agentCount) {
                this.agentCount = agentCount;
                return this;
            }

            /**
             * 基本信息
             */
            public Builder baseInfo(BaseInfo baseInfo) {
                this.baseInfo = baseInfo;
                return this;
            }

            /**
             * 最大并发，并发模式下生效
             */
            public Builder concurrency(Integer concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * constantThroughputTimerType
             */
            public Builder constantThroughputTimerType(String constantThroughputTimerType) {
                this.constantThroughputTimerType = constantThroughputTimerType;
                return this;
            }

            /**
             * DNS配置
             */
            public Builder dnsCacheConfig(DnsCacheConfig dnsCacheConfig) {
                this.dnsCacheConfig = dnsCacheConfig;
                return this;
            }

            /**
             * 压测持续时间，单位为s
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * 环境id
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * 文件列表
             */
            public Builder fileList(java.util.List < FileList> fileList) {
                this.fileList = fileList;
                return this;
            }

            /**
             * 是否为VPC压测
             */
            public Builder isVpcTest(Boolean isVpcTest) {
                this.isVpcTest = isVpcTest;
                return this;
            }

            /**
             * MaxRps.
             */
            public Builder maxRps(Integer maxRps) {
                this.maxRps = maxRps;
                return this;
            }

            /**
             * 施压模式，concurrency_mode表示并发压测,tps_mode表示RPS压测
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * 压力来源。“”表示公网，intranet-vpc表示VPC
             */
            public Builder pool(String pool) {
                this.pool = pool;
                return this;
            }

            /**
             * 递增时间，单位s
             */
            public Builder rampUp(Integer rampUp) {
                this.rampUp = rampUp;
                return this;
            }

            /**
             * VPC压测时配置
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * 场景id
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * 场景名
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * 安全组id，VPC压测时配置
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * StartConcurrency.
             */
            public Builder startConcurrency(Integer startConcurrency) {
                this.startConcurrency = startConcurrency;
                return this;
            }

            /**
             * StartRps.
             */
            public Builder startRps(Integer startRps) {
                this.startRps = startRps;
                return this;
            }

            /**
             * 递增阶梯数。预热时间和预热阶段数都不配置时 使用固定压力值 只配置预热时间，不配置阶段数时 使用均匀递增 预热时间和阶段数都配置时，并且steps<rampUp 使用阶梯递增 不能只配置steps，不配置rampUp 如果这样配置，默认使用固定压力值
             */
            public Builder steps(Integer steps) {
                this.steps = steps;
                return this;
            }

            /**
             * synchronizing timer 类型
             */
            public Builder syncTimerType(String syncTimerType) {
                this.syncTimerType = syncTimerType;
                return this;
            }

            /**
             * 测试文件
             */
            public Builder testFile(String testFile) {
                this.testFile = testFile;
                return this;
            }

            /**
             * 交换机id，VPC压测时配置
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * vpc的id，VPC压测时配置
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Scene build() {
                return new Scene(this);
            } 

        } 

    }
}
