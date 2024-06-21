// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTextEmbeddingRequest} extends {@link RequestModel}
 *
 * <p>GetTextEmbeddingRequest</p>
 */
public class GetTextEmbeddingRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("service_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("input")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > input;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("input_type")
    private String inputType;

    private GetTextEmbeddingRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.serviceId = builder.serviceId;
        this.input = builder.input;
        this.inputType = builder.inputType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTextEmbeddingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return input
     */
    public java.util.List < String > getInput() {
        return this.input;
    }

    /**
     * @return inputType
     */
    public String getInputType() {
        return this.inputType;
    }

    public static final class Builder extends Request.Builder<GetTextEmbeddingRequest, Builder> {
        private String workspaceName; 
        private String serviceId; 
        private java.util.List < String > input; 
        private String inputType; 

        private Builder() {
            super();
        } 

        private Builder(GetTextEmbeddingRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.serviceId = request.serviceId;
            this.input = request.input;
            this.inputType = request.inputType;
        } 

        /**
         * workspace_name.
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspace_name", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * service_id.
         */
        public Builder serviceId(String serviceId) {
            this.putPathParameter("service_id", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * input.
         */
        public Builder input(java.util.List < String > input) {
            this.putBodyParameter("input", input);
            this.input = input;
            return this;
        }

        /**
         * input_type.
         */
        public Builder inputType(String inputType) {
            this.putBodyParameter("input_type", inputType);
            this.inputType = inputType;
            return this;
        }

        @Override
        public GetTextEmbeddingRequest build() {
            return new GetTextEmbeddingRequest(this);
        } 

    } 

}
