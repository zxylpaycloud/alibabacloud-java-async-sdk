// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotUpdateJobResultRequest} extends {@link RequestModel}
 *
 * <p>GetHotUpdateJobResultRequest</p>
 */
public class GetHotUpdateJobResultRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("jobHotUpdateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobHotUpdateId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspace;

    private GetHotUpdateJobResultRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.jobHotUpdateId = builder.jobHotUpdateId;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotUpdateJobResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return jobHotUpdateId
     */
    public String getJobHotUpdateId() {
        return this.jobHotUpdateId;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<GetHotUpdateJobResultRequest, Builder> {
        private String namespace; 
        private String jobHotUpdateId; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(GetHotUpdateJobResultRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.jobHotUpdateId = request.jobHotUpdateId;
            this.workspace = request.workspace;
        } 

        /**
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * jobHotUpdateId.
         */
        public Builder jobHotUpdateId(String jobHotUpdateId) {
            this.putPathParameter("jobHotUpdateId", jobHotUpdateId);
            this.jobHotUpdateId = jobHotUpdateId;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.putHeaderParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        @Override
        public GetHotUpdateJobResultRequest build() {
            return new GetHotUpdateJobResultRequest(this);
        } 

    } 

}
