// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopJobRequest} extends {@link RequestModel}
 *
 * <p>StopJobRequest</p>
 */
public class StopJobRequest extends Request {
    @Path
    @NameInMap("namespace")
    @Validation(required = true)
    private String namespace;

    @Path
    @NameInMap("jobId")
    @Validation(required = true)
    private String jobId;

    @Body
    @NameInMap("body")
    @Validation(required = true)
    private StopJobRequestBody body;

    @Header
    @NameInMap("workspace")
    @Validation(required = true)
    private String workspace;

    private StopJobRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.jobId = builder.jobId;
        this.body = builder.body;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopJobRequest create() {
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
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return body
     */
    public StopJobRequestBody getBody() {
        return this.body;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder extends Request.Builder<StopJobRequest, Builder> {
        private String namespace; 
        private String jobId; 
        private StopJobRequestBody body; 
        private String workspace; 

        private Builder() {
            super();
        } 

        private Builder(StopJobRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.jobId = request.jobId;
            this.body = request.body;
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
         * jobId.
         */
        public Builder jobId(String jobId) {
            this.putPathParameter("jobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(StopJobRequestBody body) {
            this.putBodyParameter("body", body);
            this.body = body;
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
        public StopJobRequest build() {
            return new StopJobRequest(this);
        } 

    } 

}
