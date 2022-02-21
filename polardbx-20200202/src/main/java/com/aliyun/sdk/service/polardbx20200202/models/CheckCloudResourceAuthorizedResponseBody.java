// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckCloudResourceAuthorizedResponseBody} extends {@link TeaModel}
 *
 * <p>CheckCloudResourceAuthorizedResponseBody</p>
 */
public class CheckCloudResourceAuthorizedResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private CheckCloudResourceAuthorizedResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckCloudResourceAuthorizedResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckCloudResourceAuthorizedResponseBody build() {
            return new CheckCloudResourceAuthorizedResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AuthorizationState")
        private String authorizationState;

        @NameInMap("RoleArn")
        private String roleArn;

        private Data(Builder builder) {
            this.authorizationState = builder.authorizationState;
            this.roleArn = builder.roleArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authorizationState
         */
        public String getAuthorizationState() {
            return this.authorizationState;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        public static final class Builder {
            private String authorizationState; 
            private String roleArn; 

            /**
             * AuthorizationState.
             */
            public Builder authorizationState(String authorizationState) {
                this.authorizationState = authorizationState;
                return this;
            }

            /**
             * RoleArn.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
