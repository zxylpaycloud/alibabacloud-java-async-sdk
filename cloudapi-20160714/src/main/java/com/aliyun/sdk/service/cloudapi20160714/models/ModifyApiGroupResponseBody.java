// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyApiGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyApiGroupResponseBody</p>
 */
public class ModifyApiGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BasePath")
    private String basePath;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubDomain")
    private String subDomain;

    private ModifyApiGroupResponseBody(Builder builder) {
        this.basePath = builder.basePath;
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.requestId = builder.requestId;
        this.subDomain = builder.subDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApiGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return basePath
     */
    public String getBasePath() {
        return this.basePath;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subDomain
     */
    public String getSubDomain() {
        return this.subDomain;
    }

    public static final class Builder {
        private String basePath; 
        private String description; 
        private String groupId; 
        private String groupName; 
        private String requestId; 
        private String subDomain; 

        /**
         * The root path of the API.
         */
        public Builder basePath(String basePath) {
            this.basePath = basePath;
            return this;
        }

        /**
         * The description of the API group.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The ID of the API group. This ID is generated by the system and globally unique.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * The name of the group to which an API belongs.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The second-level domain name automatically assigned to the API group.
         */
        public Builder subDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }

        public ModifyApiGroupResponseBody build() {
            return new ModifyApiGroupResponseBody(this);
        } 

    } 

}
