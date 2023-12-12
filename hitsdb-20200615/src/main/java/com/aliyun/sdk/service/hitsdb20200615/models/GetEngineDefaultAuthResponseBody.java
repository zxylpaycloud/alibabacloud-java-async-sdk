// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEngineDefaultAuthResponseBody} extends {@link TeaModel}
 *
 * <p>GetEngineDefaultAuthResponseBody</p>
 */
public class GetEngineDefaultAuthResponseBody extends TeaModel {
    @NameInMap("AuthInfos")
    private java.util.List < AuthInfos> authInfos;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("RequestId")
    private String requestId;

    private GetEngineDefaultAuthResponseBody(Builder builder) {
        this.authInfos = builder.authInfos;
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEngineDefaultAuthResponseBody create() {
        return builder().build();
    }

    /**
     * @return authInfos
     */
    public java.util.List < AuthInfos> getAuthInfos() {
        return this.authInfos;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AuthInfos> authInfos; 
        private String instanceId; 
        private String requestId; 

        /**
         * AuthInfos.
         */
        public Builder authInfos(java.util.List < AuthInfos> authInfos) {
            this.authInfos = authInfos;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEngineDefaultAuthResponseBody build() {
            return new GetEngineDefaultAuthResponseBody(this);
        } 

    } 

    public static class AuthInfos extends TeaModel {
        @NameInMap("Engine")
        private String engine;

        @NameInMap("Password")
        private String password;

        @NameInMap("Username")
        private String username;

        private AuthInfos(Builder builder) {
            this.engine = builder.engine;
            this.password = builder.password;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthInfos create() {
            return builder().build();
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String engine; 
            private String password; 
            private String username; 

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public AuthInfos build() {
                return new AuthInfos(this);
            } 

        } 

    }
}
