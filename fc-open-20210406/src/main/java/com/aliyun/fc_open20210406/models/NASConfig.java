// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link NASConfig} extends {@link TeaModel}
 *
 * <p>NASConfig</p>
 */
public class NASConfig extends TeaModel {
    @NameInMap("groupId")
    private String groupId;

    @NameInMap("mountPoints")
    private java.util.List < MountPoints> mountPoints;

    @NameInMap("userId")
    private String userId;


    private NASConfig(Builder builder) {
        this.groupId = builder.groupId;
        this.mountPoints = builder.mountPoints;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NASConfig create() {
        return builder().build();
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return mountPoints
     */
    public java.util.List < MountPoints> getMountPoints() {
        return this.mountPoints;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String groupId; 
        private java.util.List < MountPoints> mountPoints; 
        private String userId; 

        /**
         * <p>groupID</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>挂载点</p>
         */
        public Builder mountPoints(java.util.List < MountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }

        /**
         * <p>userID</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public NASConfig build() {
            return new NASConfig(this);
        } 

    } 

    public static class MountPoints extends TeaModel {
        @NameInMap("mountDir")
        private String mountDir;

        @NameInMap("serverAddr")
        private String serverAddr;


        private MountPoints(Builder builder) {
            this.mountDir = builder.mountDir;
            this.serverAddr = builder.serverAddr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MountPoints create() {
            return builder().build();
        }

        /**
         * @return mountDir
         */
        public String getMountDir() {
            return this.mountDir;
        }

        /**
         * @return serverAddr
         */
        public String getServerAddr() {
            return this.serverAddr;
        }

        public static final class Builder {
            private String mountDir; 
            private String serverAddr; 

            /**
             * <p>本地挂载目录</p>
             */
            public Builder mountDir(String mountDir) {
                this.mountDir = mountDir;
                return this;
            }

            /**
             * <p>NAS服务器地址</p>
             */
            public Builder serverAddr(String serverAddr) {
                this.serverAddr = serverAddr;
                return this;
            }

            public MountPoints build() {
                return new MountPoints(this);
            } 

        } 

    }
}
