// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserProvisioningResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateUserProvisioningResponseBody</p>
 */
public class UpdateUserProvisioningResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserProvisioning")
    private UserProvisioning userProvisioning;

    private UpdateUserProvisioningResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userProvisioning = builder.userProvisioning;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserProvisioningResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userProvisioning
     */
    public UserProvisioning getUserProvisioning() {
        return this.userProvisioning;
    }

    public static final class Builder {
        private String requestId; 
        private UserProvisioning userProvisioning; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserProvisioning.
         */
        public Builder userProvisioning(UserProvisioning userProvisioning) {
            this.userProvisioning = userProvisioning;
            return this;
        }

        public UpdateUserProvisioningResponseBody build() {
            return new UpdateUserProvisioningResponseBody(this);
        } 

    } 

    public static class UserProvisioning extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DeletionStrategy")
        private String deletionStrategy;

        @NameInMap("Description")
        private String description;

        @NameInMap("DirectoryId")
        private String directoryId;

        @NameInMap("DuplicationStrategy")
        private String duplicationStrategy;

        @NameInMap("OwnerPk")
        private String ownerPk;

        @NameInMap("PrincipalId")
        private String principalId;

        @NameInMap("PrincipalName")
        private String principalName;

        @NameInMap("PrincipalType")
        private String principalType;

        @NameInMap("Status")
        private String status;

        @NameInMap("TargetId")
        private String targetId;

        @NameInMap("TargetName")
        private String targetName;

        @NameInMap("TargetPath")
        private String targetPath;

        @NameInMap("TargetType")
        private String targetType;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("UserProvisioningId")
        private String userProvisioningId;

        private UserProvisioning(Builder builder) {
            this.createTime = builder.createTime;
            this.deletionStrategy = builder.deletionStrategy;
            this.description = builder.description;
            this.directoryId = builder.directoryId;
            this.duplicationStrategy = builder.duplicationStrategy;
            this.ownerPk = builder.ownerPk;
            this.principalId = builder.principalId;
            this.principalName = builder.principalName;
            this.principalType = builder.principalType;
            this.status = builder.status;
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
            this.targetPath = builder.targetPath;
            this.targetType = builder.targetType;
            this.updateTime = builder.updateTime;
            this.userProvisioningId = builder.userProvisioningId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserProvisioning create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deletionStrategy
         */
        public String getDeletionStrategy() {
            return this.deletionStrategy;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return duplicationStrategy
         */
        public String getDuplicationStrategy() {
            return this.duplicationStrategy;
        }

        /**
         * @return ownerPk
         */
        public String getOwnerPk() {
            return this.ownerPk;
        }

        /**
         * @return principalId
         */
        public String getPrincipalId() {
            return this.principalId;
        }

        /**
         * @return principalName
         */
        public String getPrincipalName() {
            return this.principalName;
        }

        /**
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
        }

        /**
         * @return targetPath
         */
        public String getTargetPath() {
            return this.targetPath;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userProvisioningId
         */
        public String getUserProvisioningId() {
            return this.userProvisioningId;
        }

        public static final class Builder {
            private String createTime; 
            private String deletionStrategy; 
            private String description; 
            private String directoryId; 
            private String duplicationStrategy; 
            private String ownerPk; 
            private String principalId; 
            private String principalName; 
            private String principalType; 
            private String status; 
            private String targetId; 
            private String targetName; 
            private String targetPath; 
            private String targetType; 
            private String updateTime; 
            private String userProvisioningId; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DeletionStrategy.
             */
            public Builder deletionStrategy(String deletionStrategy) {
                this.deletionStrategy = deletionStrategy;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DirectoryId.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * DuplicationStrategy.
             */
            public Builder duplicationStrategy(String duplicationStrategy) {
                this.duplicationStrategy = duplicationStrategy;
                return this;
            }

            /**
             * OwnerPk.
             */
            public Builder ownerPk(String ownerPk) {
                this.ownerPk = ownerPk;
                return this;
            }

            /**
             * PrincipalId.
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * PrincipalName.
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * PrincipalType.
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TargetId.
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * TargetName.
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * TargetPath.
             */
            public Builder targetPath(String targetPath) {
                this.targetPath = targetPath;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UserProvisioningId.
             */
            public Builder userProvisioningId(String userProvisioningId) {
                this.userProvisioningId = userProvisioningId;
                return this;
            }

            public UserProvisioning build() {
                return new UserProvisioning(this);
            } 

        } 

    }
}
