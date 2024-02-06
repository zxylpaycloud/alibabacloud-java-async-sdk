// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnassociateNetworkAclRequest} extends {@link RequestModel}
 *
 * <p>UnassociateNetworkAclRequest</p>
 */
public class UnassociateNetworkAclRequest extends Request {
    @Query
    @NameInMap("NetworkAclId")
    @Validation(required = true)
    private String networkAclId;

    @Query
    @NameInMap("Resource")
    @Validation(required = true)
    private java.util.List < Resource> resource;

    private UnassociateNetworkAclRequest(Builder builder) {
        super(builder);
        this.networkAclId = builder.networkAclId;
        this.resource = builder.resource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnassociateNetworkAclRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkAclId
     */
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    /**
     * @return resource
     */
    public java.util.List < Resource> getResource() {
        return this.resource;
    }

    public static final class Builder extends Request.Builder<UnassociateNetworkAclRequest, Builder> {
        private String networkAclId; 
        private java.util.List < Resource> resource; 

        private Builder() {
            super();
        } 

        private Builder(UnassociateNetworkAclRequest request) {
            super(request);
            this.networkAclId = request.networkAclId;
            this.resource = request.resource;
        } 

        /**
         * The ID of the network ACL that you want to disassociate from a resource.
         */
        public Builder networkAclId(String networkAclId) {
            this.putQueryParameter("NetworkAclId", networkAclId);
            this.networkAclId = networkAclId;
            return this;
        }

        /**
         * The information about the associated resource.
         */
        public Builder resource(java.util.List < Resource> resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        @Override
        public UnassociateNetworkAclRequest build() {
            return new UnassociateNetworkAclRequest(this);
        } 

    } 

    public static class Resource extends TeaModel {
        @NameInMap("ResourceId")
        @Validation(required = true)
        private String resourceId;

        @NameInMap("ResourceType")
        @Validation(required = true)
        private String resourceType;

        private Resource(Builder builder) {
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String resourceId; 
            private String resourceType; 

            /**
             * The ID of the resource from which you want to disassociate the network ACL.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The type of the resource from which you want to disassociate the network ACL. Set the value to **Network**.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
}
