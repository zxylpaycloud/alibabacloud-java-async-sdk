// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomImageRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomImageRequest</p>
 */
public class CreateCustomImageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private CreateCustomImageRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.imageName = builder.imageName;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<CreateCustomImageRequest, Builder> {
        private String description; 
        private String imageName; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomImageRequest request) {
            super(request);
            this.description = request.description;
            this.imageName = request.imageName;
            this.instanceId = request.instanceId;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ImageName.
         */
        public Builder imageName(String imageName) {
            this.putBodyParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public CreateCustomImageRequest build() {
            return new CreateCustomImageRequest(this);
        } 

    } 

}
