// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceResponseBody</p>
 */
public class GetInstanceResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("Instance")
    private Instance instance;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetInstanceResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.instance = builder.instance;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return instance
     */
    public Instance getInstance() {
        return this.instance;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private Instance instance; 
        private String requestId; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the region in which the database instance resides.
         */
        public Builder instance(Instance instance) {
            this.instance = instance;
            return this;
        }

        /**
         * The details of the database instance.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetInstanceResponseBody build() {
            return new GetInstanceResponseBody(this);
        } 

    } 

    public static class OwnerIdList extends TeaModel {
        @NameInMap("OwnerIds")
        private java.util.List < String > ownerIds;

        private OwnerIdList(Builder builder) {
            this.ownerIds = builder.ownerIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OwnerIdList create() {
            return builder().build();
        }

        /**
         * @return ownerIds
         */
        public java.util.List < String > getOwnerIds() {
            return this.ownerIds;
        }

        public static final class Builder {
            private java.util.List < String > ownerIds; 

            /**
             * OwnerIds.
             */
            public Builder ownerIds(java.util.List < String > ownerIds) {
                this.ownerIds = ownerIds;
                return this;
            }

            public OwnerIdList build() {
                return new OwnerIdList(this);
            } 

        } 

    }
    public static class OwnerNameList extends TeaModel {
        @NameInMap("OwnerNames")
        private java.util.List < String > ownerNames;

        private OwnerNameList(Builder builder) {
            this.ownerNames = builder.ownerNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OwnerNameList create() {
            return builder().build();
        }

        /**
         * @return ownerNames
         */
        public java.util.List < String > getOwnerNames() {
            return this.ownerNames;
        }

        public static final class Builder {
            private java.util.List < String > ownerNames; 

            /**
             * OwnerNames.
             */
            public Builder ownerNames(java.util.List < String > ownerNames) {
                this.ownerNames = ownerNames;
                return this;
            }

            public OwnerNameList build() {
                return new OwnerNameList(this);
            } 

        } 

    }
    public static class StandardGroup extends TeaModel {
        @NameInMap("GroupMode")
        private String groupMode;

        @NameInMap("GroupName")
        private String groupName;

        private StandardGroup(Builder builder) {
            this.groupMode = builder.groupMode;
            this.groupName = builder.groupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StandardGroup create() {
            return builder().build();
        }

        /**
         * @return groupMode
         */
        public String getGroupMode() {
            return this.groupMode;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        public static final class Builder {
            private String groupMode; 
            private String groupName; 

            /**
             * GroupMode.
             */
            public Builder groupMode(String groupMode) {
                this.groupMode = groupMode;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            public StandardGroup build() {
                return new StandardGroup(this);
            } 

        } 

    }
    public static class Instance extends TeaModel {
        @NameInMap("DataLinkName")
        private String dataLinkName;

        @NameInMap("DatabasePassword")
        private String databasePassword;

        @NameInMap("DatabaseUser")
        private String databaseUser;

        @NameInMap("DbaId")
        private String dbaId;

        @NameInMap("DbaNickName")
        private String dbaNickName;

        @NameInMap("DdlOnline")
        private Integer ddlOnline;

        @NameInMap("EcsInstanceId")
        private String ecsInstanceId;

        @NameInMap("EcsRegion")
        private String ecsRegion;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("ExportTimeout")
        private Integer exportTimeout;

        @NameInMap("Host")
        private String host;

        @NameInMap("InstanceAlias")
        private String instanceAlias;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceSource")
        private String instanceSource;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("OwnerIdList")
        private OwnerIdList ownerIdList;

        @NameInMap("OwnerNameList")
        private OwnerNameList ownerNameList;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("QueryTimeout")
        private Integer queryTimeout;

        @NameInMap("SafeRuleId")
        private String safeRuleId;

        @NameInMap("SellSitd")
        private String sellSitd;

        @NameInMap("Sid")
        private String sid;

        @NameInMap("StandardGroup")
        private StandardGroup standardGroup;

        @NameInMap("State")
        private String state;

        @NameInMap("UseDsql")
        private Integer useDsql;

        @NameInMap("VpcId")
        private String vpcId;

        private Instance(Builder builder) {
            this.dataLinkName = builder.dataLinkName;
            this.databasePassword = builder.databasePassword;
            this.databaseUser = builder.databaseUser;
            this.dbaId = builder.dbaId;
            this.dbaNickName = builder.dbaNickName;
            this.ddlOnline = builder.ddlOnline;
            this.ecsInstanceId = builder.ecsInstanceId;
            this.ecsRegion = builder.ecsRegion;
            this.envType = builder.envType;
            this.exportTimeout = builder.exportTimeout;
            this.host = builder.host;
            this.instanceAlias = builder.instanceAlias;
            this.instanceId = builder.instanceId;
            this.instanceSource = builder.instanceSource;
            this.instanceType = builder.instanceType;
            this.ownerIdList = builder.ownerIdList;
            this.ownerNameList = builder.ownerNameList;
            this.port = builder.port;
            this.queryTimeout = builder.queryTimeout;
            this.safeRuleId = builder.safeRuleId;
            this.sellSitd = builder.sellSitd;
            this.sid = builder.sid;
            this.standardGroup = builder.standardGroup;
            this.state = builder.state;
            this.useDsql = builder.useDsql;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return dataLinkName
         */
        public String getDataLinkName() {
            return this.dataLinkName;
        }

        /**
         * @return databasePassword
         */
        public String getDatabasePassword() {
            return this.databasePassword;
        }

        /**
         * @return databaseUser
         */
        public String getDatabaseUser() {
            return this.databaseUser;
        }

        /**
         * @return dbaId
         */
        public String getDbaId() {
            return this.dbaId;
        }

        /**
         * @return dbaNickName
         */
        public String getDbaNickName() {
            return this.dbaNickName;
        }

        /**
         * @return ddlOnline
         */
        public Integer getDdlOnline() {
            return this.ddlOnline;
        }

        /**
         * @return ecsInstanceId
         */
        public String getEcsInstanceId() {
            return this.ecsInstanceId;
        }

        /**
         * @return ecsRegion
         */
        public String getEcsRegion() {
            return this.ecsRegion;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return exportTimeout
         */
        public Integer getExportTimeout() {
            return this.exportTimeout;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return instanceAlias
         */
        public String getInstanceAlias() {
            return this.instanceAlias;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceSource
         */
        public String getInstanceSource() {
            return this.instanceSource;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ownerIdList
         */
        public OwnerIdList getOwnerIdList() {
            return this.ownerIdList;
        }

        /**
         * @return ownerNameList
         */
        public OwnerNameList getOwnerNameList() {
            return this.ownerNameList;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return queryTimeout
         */
        public Integer getQueryTimeout() {
            return this.queryTimeout;
        }

        /**
         * @return safeRuleId
         */
        public String getSafeRuleId() {
            return this.safeRuleId;
        }

        /**
         * @return sellSitd
         */
        public String getSellSitd() {
            return this.sellSitd;
        }

        /**
         * @return sid
         */
        public String getSid() {
            return this.sid;
        }

        /**
         * @return standardGroup
         */
        public StandardGroup getStandardGroup() {
            return this.standardGroup;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return useDsql
         */
        public Integer getUseDsql() {
            return this.useDsql;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String dataLinkName; 
            private String databasePassword; 
            private String databaseUser; 
            private String dbaId; 
            private String dbaNickName; 
            private Integer ddlOnline; 
            private String ecsInstanceId; 
            private String ecsRegion; 
            private String envType; 
            private Integer exportTimeout; 
            private String host; 
            private String instanceAlias; 
            private String instanceId; 
            private String instanceSource; 
            private String instanceType; 
            private OwnerIdList ownerIdList; 
            private OwnerNameList ownerNameList; 
            private Integer port; 
            private Integer queryTimeout; 
            private String safeRuleId; 
            private String sellSitd; 
            private String sid; 
            private StandardGroup standardGroup; 
            private String state; 
            private Integer useDsql; 
            private String vpcId; 

            /**
             * The nickname of the DBA for the database instance.
             */
            public Builder dataLinkName(String dataLinkName) {
                this.dataLinkName = dataLinkName;
                return this;
            }

            /**
             * The type of the database instance.
             */
            public Builder databasePassword(String databasePassword) {
                this.databasePassword = databasePassword;
                return this;
            }

            /**
             * The timeout period for exporting data from the database instance.
             */
            public Builder databaseUser(String databaseUser) {
                this.databaseUser = databaseUser;
                return this;
            }

            /**
             * The timeout period for querying data in the database instance.
             */
            public Builder dbaId(String dbaId) {
                this.dbaId = dbaId;
                return this;
            }

            /**
             * The SID of the database instance.
             */
            public Builder dbaNickName(String dbaNickName) {
                this.dbaNickName = dbaNickName;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder ddlOnline(Integer ddlOnline) {
                this.ddlOnline = ddlOnline;
                return this;
            }

            /**
             * The ID of the security rule set for the database instance.
             */
            public Builder ecsInstanceId(String ecsInstanceId) {
                this.ecsInstanceId = ecsInstanceId;
                return this;
            }

            /**
             * Queries the details of a database instance.
             */
            public Builder ecsRegion(String ecsRegion) {
                this.ecsRegion = ecsRegion;
                return this;
            }

            /**
             * The endpoint of the database instance. You can call the [ListInstances](~~141936~~) operation to obtain the endpoint.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * The type of the control mode. Valid values:
             * <p>
             * 
             * *   **COMMON**: Security Collaboration
             * *   **NONE_CONTROL**: Flexible Management
             * *   **STABLE**: Stable Change
             */
            public Builder exportTimeout(Integer exportTimeout) {
                this.exportTimeout = exportTimeout;
                return this;
            }

            /**
             * The ID of the database instance.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The system ID (SID) of the database instance. You can call the [ListInstances](~~141936~~) operation to obtain the SID.
             */
            public Builder instanceAlias(String instanceAlias) {
                this.instanceAlias = instanceAlias;
                return this;
            }

            /**
             * The control mode of the database instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The type of the environment to which the database instance belongs. Valid values:
             * <p>
             * 
             * *   **product**: production environment
             * *   **dev**: development environment
             * *   **pre**: staging environment
             * *   **test**: test environment
             * *   **sit**: system integration testing (SIT) environment
             * *   **uat**: user acceptance testing (UAT) environment
             * *   **pet**: stress testing environment
             * *   **stag**: STAG environment
             */
            public Builder instanceSource(String instanceSource) {
                this.instanceSource = instanceSource;
                return this;
            }

            /**
             * The host address that is used to connect to the database instance.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * Indicates whether the lock-free schema change feature is enabled for the database instance.
             */
            public Builder ownerIdList(OwnerIdList ownerIdList) {
                this.ownerIdList = ownerIdList;
                return this;
            }

            /**
             * The alias of the database instance.
             */
            public Builder ownerNameList(OwnerNameList ownerNameList) {
                this.ownerNameList = ownerNameList;
                return this;
            }

            /**
             * The ID of the database administrator (DBA) for the database instance.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The status of the database instance. Valid values:
             * <p>
             * 
             * *   **NORMAL**: normal
             * *   **DISABLE**: disabled
             */
            public Builder queryTimeout(Integer queryTimeout) {
                this.queryTimeout = queryTimeout;
                return this;
            }

            /**
             * The source of the database instance.
             */
            public Builder safeRuleId(String safeRuleId) {
                this.safeRuleId = safeRuleId;
                return this;
            }

            /**
             * 为true，敏感数据保护开启，否则未开启
             */
            public Builder sellSitd(String sellSitd) {
                this.sellSitd = sellSitd;
                return this;
            }

            /**
             * The port number that is used to connect to the database instance. You can call the [ListInstances](~~141936~~) operation to obtain the port number.
             */
            public Builder sid(String sid) {
                this.sid = sid;
                return this;
            }

            /**
             * StandardGroup.
             */
            public Builder standardGroup(StandardGroup standardGroup) {
                this.standardGroup = standardGroup;
                return this;
            }

            /**
             * The nicknames of the owners for the database instance.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The password that is used to log on to the database.
             */
            public Builder useDsql(Integer useDsql) {
                this.useDsql = useDsql;
                return this;
            }

            /**
             * The ID of the Elastic Compute Service (ECS) instance on which the database instance is deployed.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
}
