// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserResponseBody</p>
 */
public class GetUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("User")
    private User user;

    private GetUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return user
     */
    public User getUser() {
        return this.user;
    }

    public static final class Builder {
        private String requestId; 
        private User user; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the user.
         */
        public Builder user(User user) {
            this.user = user;
            return this;
        }

        public GetUserResponseBody build() {
            return new GetUserResponseBody(this);
        } 

    } 

    public static class ExternalId extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("Issuer")
        private String issuer;

        private ExternalId(Builder builder) {
            this.id = builder.id;
            this.issuer = builder.issuer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExternalId create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return issuer
         */
        public String getIssuer() {
            return this.issuer;
        }

        public static final class Builder {
            private String id; 
            private String issuer; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Issuer.
             */
            public Builder issuer(String issuer) {
                this.issuer = issuer;
                return this;
            }

            public ExternalId build() {
                return new ExternalId(this);
            } 

        } 

    }
    public static class User extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Email")
        private String email;

        @NameInMap("ExternalId")
        private ExternalId externalId;

        @NameInMap("FirstName")
        private String firstName;

        @NameInMap("LastName")
        private String lastName;

        @NameInMap("ProvisionType")
        private String provisionType;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserName")
        private String userName;

        private User(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.email = builder.email;
            this.externalId = builder.externalId;
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.provisionType = builder.provisionType;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return externalId
         */
        public ExternalId getExternalId() {
            return this.externalId;
        }

        /**
         * @return firstName
         */
        public String getFirstName() {
            return this.firstName;
        }

        /**
         * @return lastName
         */
        public String getLastName() {
            return this.lastName;
        }

        /**
         * @return provisionType
         */
        public String getProvisionType() {
            return this.provisionType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String displayName; 
            private String email; 
            private ExternalId externalId; 
            private String firstName; 
            private String lastName; 
            private String provisionType; 
            private String status; 
            private String updateTime; 
            private String userId; 
            private String userName; 

            /**
             * The time when the user was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the user.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The display name of the user.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The email address of the user.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * ExternalId.
             */
            public Builder externalId(ExternalId externalId) {
                this.externalId = externalId;
                return this;
            }

            /**
             * The first name of the user.
             */
            public Builder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            /**
             * The last name of the user.
             */
            public Builder lastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            /**
             * The type of the user. Valid values:
             * <p>
             * 
             * *   Manual: The user is manually created.
             * *   Synchronized: The user is synchronized from an external identity provider (IdP).
             */
            public Builder provisionType(String provisionType) {
                this.provisionType = provisionType;
                return this;
            }

            /**
             * The status of the user. Valid values:
             * <p>
             * 
             * *   Enabled: The logon of the user is enabled.
             * *   Disabled: The logon of the user is disabled.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the information about the user was modified.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The name of the user.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
}
