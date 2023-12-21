// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInstanceResourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceResourceRequest</p>
 */
public class UpdateInstanceResourceRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    private String instanceId;

    @Path
    @NameInMap("ResourceId")
    private String resourceId;

    @Body
    @NameInMap("Config")
    private String config;

    @Body
    @NameInMap("Uri")
    private String uri;

    private UpdateInstanceResourceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.resourceId = builder.resourceId;
        this.config = builder.config;
        this.uri = builder.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceResourceRequest, Builder> {
        private String instanceId; 
        private String resourceId; 
        private String config; 
        private String uri; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceResourceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.resourceId = request.resourceId;
            this.config = request.config;
            this.uri = request.uri;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putPathParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * Uri.
         */
        public Builder uri(String uri) {
            this.putBodyParameter("Uri", uri);
            this.uri = uri;
            return this;
        }

        @Override
        public UpdateInstanceResourceRequest build() {
            return new UpdateInstanceResourceRequest(this);
        } 

    } 

}
