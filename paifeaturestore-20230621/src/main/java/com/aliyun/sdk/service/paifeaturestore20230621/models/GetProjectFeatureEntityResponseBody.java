// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectFeatureEntityResponseBody} extends {@link TeaModel}
 *
 * <p>GetProjectFeatureEntityResponseBody</p>
 */
public class GetProjectFeatureEntityResponseBody extends TeaModel {
    @NameInMap("FeatureEntityId")
    private String featureEntityId;

    @NameInMap("JoinId")
    private String joinId;

    @NameInMap("Name")
    private String name;

    @NameInMap("ProjectName")
    private String projectName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WorkspaceId")
    private String workspaceId;

    private GetProjectFeatureEntityResponseBody(Builder builder) {
        this.featureEntityId = builder.featureEntityId;
        this.joinId = builder.joinId;
        this.name = builder.name;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectFeatureEntityResponseBody create() {
        return builder().build();
    }

    /**
     * @return featureEntityId
     */
    public String getFeatureEntityId() {
        return this.featureEntityId;
    }

    /**
     * @return joinId
     */
    public String getJoinId() {
        return this.joinId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String featureEntityId; 
        private String joinId; 
        private String name; 
        private String projectName; 
        private String requestId; 
        private String workspaceId; 

        /**
         * FeatureEntityId.
         */
        public Builder featureEntityId(String featureEntityId) {
            this.featureEntityId = featureEntityId;
            return this;
        }

        /**
         * JoinId.
         */
        public Builder joinId(String joinId) {
            this.joinId = joinId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
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
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetProjectFeatureEntityResponseBody build() {
            return new GetProjectFeatureEntityResponseBody(this);
        } 

    } 

}
